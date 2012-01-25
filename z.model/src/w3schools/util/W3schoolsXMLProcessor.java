/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package w3schools.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import w3schools.W3schoolsPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class W3schoolsXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public W3schoolsXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		W3schoolsPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the W3schoolsResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new W3schoolsResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new W3schoolsResourceFactoryImpl());
		}
		return registrations;
	}

} //W3schoolsXMLProcessor
