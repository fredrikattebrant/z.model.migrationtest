/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.findout.example.librarymodel.LibraryModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Author</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.findout.example.librarymodel.LibraryModel.Author#getBooks <em>Books</em>}</li>
 *   <li>{@link se.findout.example.librarymodel.LibraryModel.Author#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.findout.example.librarymodel.LibraryModel.LibraryModelPackage#getAuthor()
 * @model
 * @generated
 */
public interface Author extends EObject {
	/**
	 * Returns the value of the '<em><b>Books</b></em>' reference list.
	 * The list contents are of type {@link se.findout.example.librarymodel.LibraryModel.Book}.
	 * It is bidirectional and its opposite is '{@link se.findout.example.librarymodel.LibraryModel.Book#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Books</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Books</em>' reference list.
	 * @see se.findout.example.librarymodel.LibraryModel.LibraryModelPackage#getAuthor_Books()
	 * @see se.findout.example.librarymodel.LibraryModel.Book#getAuthor
	 * @model opposite="author"
	 * @generated
	 */
	EList<Book> getBooks();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see se.findout.example.librarymodel.LibraryModel.LibraryModelPackage#getAuthor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link se.findout.example.librarymodel.LibraryModel.Author#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Author
