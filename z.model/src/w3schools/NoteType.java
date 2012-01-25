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
 * A representation of the model object '<em><b>Note Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link w3schools.NoteType#getTo <em>To</em>}</li>
 *   <li>{@link w3schools.NoteType#getFrom <em>From</em>}</li>
 *   <li>{@link w3schools.NoteType#getHeading <em>Heading</em>}</li>
 *   <li>{@link w3schools.NoteType#getBody <em>Body</em>}</li>
 *   <li>{@link w3schools.NoteType#getDescr <em>Descr</em>}</li>
 *   <li>{@link w3schools.NoteType#getFirst <em>First</em>}</li>
 * </ul>
 * </p>
 *
 * @see w3schools.W3schoolsPackage#getNoteType()
 * @model extendedMetaData="name='note_._type' kind='elementOnly'"
 * @generated
 */
public interface NoteType extends EObject {
	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(String)
	 * @see w3schools.W3schoolsPackage#getNoteType_To()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='to' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTo();

	/**
	 * Sets the value of the '{@link w3schools.NoteType#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(String value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(String)
	 * @see w3schools.W3schoolsPackage#getNoteType_From()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='from' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFrom();

	/**
	 * Sets the value of the '{@link w3schools.NoteType#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(String value);

	/**
	 * Returns the value of the '<em><b>Heading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heading</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heading</em>' attribute.
	 * @see #setHeading(String)
	 * @see w3schools.W3schoolsPackage#getNoteType_Heading()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='heading' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHeading();

	/**
	 * Sets the value of the '{@link w3schools.NoteType#getHeading <em>Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heading</em>' attribute.
	 * @see #getHeading()
	 * @generated
	 */
	void setHeading(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see w3schools.W3schoolsPackage#getNoteType_Body()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='body' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link w3schools.NoteType#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Descr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descr</em>' containment reference.
	 * @see #setDescr(DescrType)
	 * @see w3schools.W3schoolsPackage#getNoteType_Descr()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='descr' namespace='##targetNamespace'"
	 * @generated
	 */
	DescrType getDescr();

	/**
	 * Sets the value of the '{@link w3schools.NoteType#getDescr <em>Descr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descr</em>' containment reference.
	 * @see #getDescr()
	 * @generated
	 */
	void setDescr(DescrType value);

	/**
	 * Returns the value of the '<em><b>First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' attribute.
	 * @see #setFirst(String)
	 * @see w3schools.W3schoolsPackage#getNoteType_First()
	 * @model
	 * @generated
	 */
	String getFirst();

	/**
	 * Sets the value of the '{@link w3schools.NoteType#getFirst <em>First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' attribute.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(String value);

} // NoteType
