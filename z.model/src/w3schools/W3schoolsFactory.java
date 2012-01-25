/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package w3schools;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see w3schools.W3schoolsPackage
 * @generated
 */
public interface W3schoolsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	W3schoolsFactory eINSTANCE = w3schools.impl.W3schoolsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Descr Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Descr Type</em>'.
	 * @generated
	 */
	DescrType createDescrType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Note Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Note Type</em>'.
	 * @generated
	 */
	NoteType createNoteType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	W3schoolsPackage getW3schoolsPackage();

} //W3schoolsFactory
