/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package w3schools;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Descr Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link w3schools.DescrType#getValue <em>Value</em>}</li>
 *   <li>{@link w3schools.DescrType#getIfmid <em>Ifmid</em>}</li>
 * </ul>
 * </p>
 *
 * @see w3schools.W3schoolsPackage#getDescrType()
 * @model extendedMetaData="name='descr_._type' kind='simple'"
 * @generated
 */
public interface DescrType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see w3schools.W3schoolsPackage#getDescrType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link w3schools.DescrType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Ifmid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifmid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifmid</em>' attribute.
	 * @see #setIfmid(String)
	 * @see w3schools.W3schoolsPackage#getDescrType_Ifmid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ifmid'"
	 * @generated
	 */
	String getIfmid();

	/**
	 * Sets the value of the '{@link w3schools.DescrType#getIfmid <em>Ifmid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifmid</em>' attribute.
	 * @see #getIfmid()
	 * @generated
	 */
	void setIfmid(String value);

} // DescrType
