package se.findout.example.librarymodel.LibraryModel.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.PlatformResourceURIHandlerImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.BasicResourceHandler;
import org.eclipse.emf.ecore.xml.type.AnyType;

import se.findout.example.librarymodel.LibraryModel.Book;
import se.findout.example.librarymodel.LibraryModel.Library;
import se.findout.example.librarymodel.LibraryModel.impl.BookImpl;

public class LibraryModelResourceHandler extends BasicResourceHandler {
	
	/**
	 * Draft method for saving the migrated model - not working as of now
	 * 
	 * @param resource
	 * @param inputStream
	 * @param options
	 */
	private void saveMigrated(XMLResource resource, InputStream inputStream,
			Map<?, ?> options) {
		Map<Object, Object> saveOptions = resource.getDefaultSaveOptions();
		URI resourceURI = resource.getURI();
		
		XMIResource xmiResource = (XMIResource)resource; 
		String ver = xmiResource.getXMIVersion();
		String ns = xmiResource.getXMINamespace();
		System.out.println("URI: " + resourceURI);
		System.out.println("Ver: " + ver + ", NS:" + ns);
		
		try {
			ExtensibleURIConverterImpl euci = new ExtensibleURIConverterImpl();
			OutputStream outputStream = euci.createOutputStream(resourceURI);
			resource.save(outputStream, saveOptions);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Saves a backup copy of the serialized model to provide the user with a 
	 * fallback if migration fails or for the user for some other reason needs
	 * to revert to the pre-migrated state of the model.
	 *  
	 * @param resource
	 */
	private void saveBackup(XMLResource resource) {
		URI uri = resource.getURI();
		String inStr = uri.toPlatformString(false);
		String outStr = uri.toPlatformString(false).concat(".bak");
		try {
			InputStream in = PlatformResourceURIHandlerImpl.WorkbenchHelper.createPlatformResourceInputStream(inStr, null);
			OutputStream out = PlatformResourceURIHandlerImpl.WorkbenchHelper.createPlatformResourceOutputStream(outStr, null);

			InputStreamReader reader = new InputStreamReader(in);
			OutputStreamWriter writer = new OutputStreamWriter(out);
			int c;
			while ((c = reader.read()) != -1) {
				writer.write(c);
			}
			writer.close();
			reader.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	@Override
	public void postLoad(XMLResource resource, InputStream inputStream,
			Map<?, ?> options) {
		
		// migrate model
		final Map<?, ?> extMap = resource.getEObjectToExtensionMap();
		if (!extMap.isEmpty()) {
			// model has unknown data - save backup before migrating
			saveBackup(resource);
		}
		for(Iterator<?> itr = extMap.entrySet().iterator(); itr.hasNext();) {
			Map.Entry entry = (Map.Entry) itr.next();
			EObject key = (EObject) entry.getKey();
			AnyType value = (AnyType) entry.getValue();
			handleUnknownData(key, value);
		}

			// save the migrated model
			//TODO: saveMigrated(resource, inputStream, options); // wrong place - causes loop? where save model?
	}
	
	private void handleUnknownData(EObject eObj, AnyType unknownData) {
		handleUnknownFeatures(eObj, unknownData.getMixed());
		handleUnknownFeatures(eObj, unknownData.getAnyAttribute());
	}

	private void handleUnknownFeatures(EObject owner, FeatureMap featureMap) {
		for (Iterator<?> iter = featureMap.iterator(); iter.hasNext();) {
			FeatureMap.Entry entry = (FeatureMap.Entry) iter.next();
			EStructuralFeature f = entry.getEStructuralFeature();
			if(handleUnknownFeature(owner, f, entry.getValue())) {
				iter.remove();
				System.out.println(owner.eAdapters());
			}
		}
	}

	private boolean handleUnknownFeature(EObject owner,
			EStructuralFeature f, Object value) {
		System.out.println(owner.getClass());
		if (owner.getClass().getName().equals(BookImpl.class.getName())) {
			Book book = (Book) owner;
			book.setTitle((String) value);
			System.out.println("Title set to: " + book.getTitle());
			Library lib = (Library) book.eContainer();
			Resource libRes = lib.eResource();
			libRes.setModified(true);
			
		}
		System.out.println("Removing unknown feature: " + f.getName());
		return true	;
	}
}
