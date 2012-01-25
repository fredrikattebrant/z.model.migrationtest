package w3schools.impl;

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

import w3schools.W3schoolsPackage;

public class W3SchoolsResourceFactoryImpl extends XMIResourceFactoryImpl {

	public static final String RULES_100_NSI_URI = "http://www.w3schools.com/1.0";
	public static final String RULES_PLATFORM_URI = "platform:/plugin/z.model/model/w3schools.1.ecore";
	public static final String RULES_100_PLATFORM_URI = "platform:/plugin/z.model/model/w3schools.1_2_w3schools.2.ecore2xml";
	
	private static ExtendedMetaData extendedMetaData;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Resource createResource(URI uri) {
		XMIResource resource = (XMIResource) super.createResource(uri);
		Map defaultLoadOptions = resource.getDefaultLoadOptions();
		defaultLoadOptions.put(XMLResource.OPTION_EXTENDED_META_DATA, getExtendedMetaData());
		defaultLoadOptions.put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
		defaultLoadOptions.put(XMLResource.OPTION_RESOURCE_HANDLER, new RulesResourceHandler());
		return resource;
	}

	private Object getExtendedMetaData() {
		ResourceSet resourceSet = new ResourceSetImpl();
		EPackage.Registry ePackageRegistry = resourceSet.getPackageRegistry();
		ePackageRegistry.put(RULES_100_NSI_URI, W3schoolsPackage.eINSTANCE);
		ePackageRegistry.put(RULES_PLATFORM_URI, W3schoolsPackage.eINSTANCE);
		Ecore2XMLRegistry ecore2xmlRegistry = new Ecore2XMLRegistryImpl(Ecore2XMLRegistry.INSTANCE);
		ecore2xmlRegistry.put(RULES_100_NSI_URI, 
				EcoreUtil.getObjectByType(resourceSet.getResource(URI.createURI(RULES_100_PLATFORM_URI), true).getContents(),
						Ecore2XMLPackage.Literals.XML_MAP));
		extendedMetaData = new Ecore2XMLExtendedMetaData(ePackageRegistry, ecore2xmlRegistry);
		
		return extendedMetaData;
	}
}
