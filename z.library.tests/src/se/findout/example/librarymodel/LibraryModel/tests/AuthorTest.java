/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.findout.example.librarymodel.LibraryModel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import se.findout.example.librarymodel.LibraryModel.Author;
import se.findout.example.librarymodel.LibraryModel.LibraryModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Author</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AuthorTest extends TestCase {

	/**
	 * The fixture for this Author test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Author fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AuthorTest.class);
	}

	/**
	 * Constructs a new Author test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Author test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Author fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Author test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Author getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(LibraryModelFactory.eINSTANCE.createAuthor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AuthorTest
