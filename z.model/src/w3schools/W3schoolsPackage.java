/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package w3schools;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see w3schools.W3schoolsFactory
 * @model kind="package"
 * @generated
 */
public interface W3schoolsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "w3schools";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.w3schools.com/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "w3schools";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	W3schoolsPackage eINSTANCE = w3schools.impl.W3schoolsPackageImpl.init();

	/**
	 * The meta object id for the '{@link w3schools.impl.DescrTypeImpl <em>Descr Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3schools.impl.DescrTypeImpl
	 * @see w3schools.impl.W3schoolsPackageImpl#getDescrType()
	 * @generated
	 */
	int DESCR_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCR_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Ifmid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCR_TYPE__IFMID = 1;

	/**
	 * The number of structural features of the '<em>Descr Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCR_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link w3schools.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3schools.impl.DocumentRootImpl
	 * @see w3schools.impl.W3schoolsPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NOTE = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link w3schools.impl.NoteTypeImpl <em>Note Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3schools.impl.NoteTypeImpl
	 * @see w3schools.impl.W3schoolsPackageImpl#getNoteType()
	 * @generated
	 */
	int NOTE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_TYPE__TO = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_TYPE__FROM = 1;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_TYPE__HEADING = 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_TYPE__BODY = 3;

	/**
	 * The feature id for the '<em><b>Descr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_TYPE__DESCR = 4;

	/**
	 * The feature id for the '<em><b>First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_TYPE__FIRST = 5;

	/**
	 * The number of structural features of the '<em>Note Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_TYPE_FEATURE_COUNT = 6;


	/**
	 * Returns the meta object for class '{@link w3schools.DescrType <em>Descr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Descr Type</em>'.
	 * @see w3schools.DescrType
	 * @generated
	 */
	EClass getDescrType();

	/**
	 * Returns the meta object for the attribute '{@link w3schools.DescrType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see w3schools.DescrType#getValue()
	 * @see #getDescrType()
	 * @generated
	 */
	EAttribute getDescrType_Value();

	/**
	 * Returns the meta object for the attribute '{@link w3schools.DescrType#getIfmid <em>Ifmid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ifmid</em>'.
	 * @see w3schools.DescrType#getIfmid()
	 * @see #getDescrType()
	 * @generated
	 */
	EAttribute getDescrType_Ifmid();

	/**
	 * Returns the meta object for class '{@link w3schools.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see w3schools.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link w3schools.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see w3schools.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link w3schools.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see w3schools.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link w3schools.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see w3schools.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link w3schools.DocumentRoot#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Note</em>'.
	 * @see w3schools.DocumentRoot#getNote()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Note();

	/**
	 * Returns the meta object for class '{@link w3schools.NoteType <em>Note Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note Type</em>'.
	 * @see w3schools.NoteType
	 * @generated
	 */
	EClass getNoteType();

	/**
	 * Returns the meta object for the attribute '{@link w3schools.NoteType#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see w3schools.NoteType#getTo()
	 * @see #getNoteType()
	 * @generated
	 */
	EAttribute getNoteType_To();

	/**
	 * Returns the meta object for the attribute '{@link w3schools.NoteType#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see w3schools.NoteType#getFrom()
	 * @see #getNoteType()
	 * @generated
	 */
	EAttribute getNoteType_From();

	/**
	 * Returns the meta object for the attribute '{@link w3schools.NoteType#getHeading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heading</em>'.
	 * @see w3schools.NoteType#getHeading()
	 * @see #getNoteType()
	 * @generated
	 */
	EAttribute getNoteType_Heading();

	/**
	 * Returns the meta object for the attribute '{@link w3schools.NoteType#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see w3schools.NoteType#getBody()
	 * @see #getNoteType()
	 * @generated
	 */
	EAttribute getNoteType_Body();

	/**
	 * Returns the meta object for the containment reference '{@link w3schools.NoteType#getDescr <em>Descr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Descr</em>'.
	 * @see w3schools.NoteType#getDescr()
	 * @see #getNoteType()
	 * @generated
	 */
	EReference getNoteType_Descr();

	/**
	 * Returns the meta object for the attribute '{@link w3schools.NoteType#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First</em>'.
	 * @see w3schools.NoteType#getFirst()
	 * @see #getNoteType()
	 * @generated
	 */
	EAttribute getNoteType_First();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	W3schoolsFactory getW3schoolsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link w3schools.impl.DescrTypeImpl <em>Descr Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3schools.impl.DescrTypeImpl
		 * @see w3schools.impl.W3schoolsPackageImpl#getDescrType()
		 * @generated
		 */
		EClass DESCR_TYPE = eINSTANCE.getDescrType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCR_TYPE__VALUE = eINSTANCE.getDescrType_Value();

		/**
		 * The meta object literal for the '<em><b>Ifmid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCR_TYPE__IFMID = eINSTANCE.getDescrType_Ifmid();

		/**
		 * The meta object literal for the '{@link w3schools.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3schools.impl.DocumentRootImpl
		 * @see w3schools.impl.W3schoolsPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NOTE = eINSTANCE.getDocumentRoot_Note();

		/**
		 * The meta object literal for the '{@link w3schools.impl.NoteTypeImpl <em>Note Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3schools.impl.NoteTypeImpl
		 * @see w3schools.impl.W3schoolsPackageImpl#getNoteType()
		 * @generated
		 */
		EClass NOTE_TYPE = eINSTANCE.getNoteType();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE_TYPE__TO = eINSTANCE.getNoteType_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE_TYPE__FROM = eINSTANCE.getNoteType_From();

		/**
		 * The meta object literal for the '<em><b>Heading</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE_TYPE__HEADING = eINSTANCE.getNoteType_Heading();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE_TYPE__BODY = eINSTANCE.getNoteType_Body();

		/**
		 * The meta object literal for the '<em><b>Descr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTE_TYPE__DESCR = eINSTANCE.getNoteType_Descr();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE_TYPE__FIRST = eINSTANCE.getNoteType_First();

	}

} //W3schoolsPackage
