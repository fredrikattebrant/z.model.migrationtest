/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.findout.example.librarymodel.LibraryModel.util;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.mapping.ecore2xml.Ecore2XMLPackage;
import org.eclipse.emf.mapping.ecore2xml.Ecore2XMLRegistry;
import org.eclipse.emf.mapping.ecore2xml.impl.Ecore2XMLRegistryImpl;
import org.eclipse.emf.mapping.ecore2xml.util.Ecore2XMLExtendedMetaData;

import se.findout.example.librarymodel.LibraryModel.LibraryModelPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see se.findout.example.librarymodel.LibraryModel.util.LibraryModelResourceImpl
 * @generated NOT
 */
public class LibraryModelResourceFactoryImpl extends XMIResourceFactoryImpl {
	
	public static final String LIBRARY_MODEL_100_NSI_URI = "http://www.findout.se/example/librarymodel/1.0";
	public static final String LIBRARY_MODEL_PLATFORM_URI = "platform:/plugin/z.library/model/library_model.ecore";
	public static final String LIBRARY_MODEL_100_PLATFORM_URI = "platform:/plugin/z.library/model/library_model.v1_2_library_model.v2.ecore2xml";
	
	private ExtendedMetaData extendedMetaData;

	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryModelResourceFactoryImpl() {
		super();
	}

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource createResource(URI uri) {
		XMIResource resource = (XMIResource) super.createResource(uri);

		Map<Object, Object> defaultLoadOptions = resource.getDefaultLoadOptions();
		defaultLoadOptions.put(XMLResource.OPTION_EXTENDED_META_DATA, getExtendedMetaData());
		defaultLoadOptions.put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
		defaultLoadOptions.put(XMLResource.OPTION_RESOURCE_HANDLER, new LibraryModelResourceHandler());
		return resource;
	}

	private ExtendedMetaData getExtendedMetaData() {
		if (extendedMetaData == null) {
			ResourceSet resourceSet = new ResourceSetImpl();
			EPackage.Registry ePackageRegistry = resourceSet
					.getPackageRegistry();
			ePackageRegistry.put(LIBRARY_MODEL_100_NSI_URI, LibraryModelPackage.eINSTANCE);
			ePackageRegistry.put(LIBRARY_MODEL_PLATFORM_URI, LibraryModelPackage.eINSTANCE);
			Ecore2XMLRegistry ecore2xmlRegistry = new Ecore2XMLRegistryImpl(
					Ecore2XMLRegistry.INSTANCE);
			ecore2xmlRegistry.put(LIBRARY_MODEL_100_NSI_URI, EcoreUtil.getObjectByType(
					resourceSet.getResource(
							URI.createURI(LIBRARY_MODEL_100_PLATFORM_URI), true)
							.getContents(), Ecore2XMLPackage.Literals.XML_MAP));
			extendedMetaData = new Ecore2XMLExtendedMetaData(ePackageRegistry,
					ecore2xmlRegistry);
			
			// debug
			Resource x = resourceSet.getResource(
					URI.createURI(LIBRARY_MODEL_100_PLATFORM_URI), true);
			System.out.println(x);
		}
		return extendedMetaData;
	}

} //LibraryModelResourceFactoryImpl
