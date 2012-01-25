/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package w3schools.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import w3schools.DescrType;
import w3schools.NoteType;
import w3schools.W3schoolsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Note Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link w3schools.impl.NoteTypeImpl#getTo <em>To</em>}</li>
 *   <li>{@link w3schools.impl.NoteTypeImpl#getFrom <em>From</em>}</li>
 *   <li>{@link w3schools.impl.NoteTypeImpl#getHeading <em>Heading</em>}</li>
 *   <li>{@link w3schools.impl.NoteTypeImpl#getBody <em>Body</em>}</li>
 *   <li>{@link w3schools.impl.NoteTypeImpl#getDescr <em>Descr</em>}</li>
 *   <li>{@link w3schools.impl.NoteTypeImpl#getFirst <em>First</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NoteTypeImpl extends EObjectImpl implements NoteType {
	/**
	 * The default value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected String to = TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected String from = FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeading() <em>Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeading()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeading() <em>Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeading()
	 * @generated
	 * @ordered
	 */
	protected String heading = HEADING_EDEFAULT;

	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDescr() <em>Descr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescr()
	 * @generated
	 * @ordered
	 */
	protected DescrType descr;

	/**
	 * The default value of the '{@link #getFirst() <em>First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirst() <em>First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst()
	 * @generated
	 * @ordered
	 */
	protected String first = FIRST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoteTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return W3schoolsPackage.Literals.NOTE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(String newTo) {
		String oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, W3schoolsPackage.NOTE_TYPE__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(String newFrom) {
		String oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, W3schoolsPackage.NOTE_TYPE__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeading() {
		return heading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeading(String newHeading) {
		String oldHeading = heading;
		heading = newHeading;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, W3schoolsPackage.NOTE_TYPE__HEADING, oldHeading, heading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, W3schoolsPackage.NOTE_TYPE__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescrType getDescr() {
		return descr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescr(DescrType newDescr, NotificationChain msgs) {
		DescrType oldDescr = descr;
		descr = newDescr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, W3schoolsPackage.NOTE_TYPE__DESCR, oldDescr, newDescr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescr(DescrType newDescr) {
		if (newDescr != descr) {
			NotificationChain msgs = null;
			if (descr != null)
				msgs = ((InternalEObject)descr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - W3schoolsPackage.NOTE_TYPE__DESCR, null, msgs);
			if (newDescr != null)
				msgs = ((InternalEObject)newDescr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - W3schoolsPackage.NOTE_TYPE__DESCR, null, msgs);
			msgs = basicSetDescr(newDescr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, W3schoolsPackage.NOTE_TYPE__DESCR, newDescr, newDescr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirst() {
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirst(String newFirst) {
		String oldFirst = first;
		first = newFirst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, W3schoolsPackage.NOTE_TYPE__FIRST, oldFirst, first));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case W3schoolsPackage.NOTE_TYPE__DESCR:
				return basicSetDescr(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case W3schoolsPackage.NOTE_TYPE__TO:
				return getTo();
			case W3schoolsPackage.NOTE_TYPE__FROM:
				return getFrom();
			case W3schoolsPackage.NOTE_TYPE__HEADING:
				return getHeading();
			case W3schoolsPackage.NOTE_TYPE__BODY:
				return getBody();
			case W3schoolsPackage.NOTE_TYPE__DESCR:
				return getDescr();
			case W3schoolsPackage.NOTE_TYPE__FIRST:
				return getFirst();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case W3schoolsPackage.NOTE_TYPE__TO:
				setTo((String)newValue);
				return;
			case W3schoolsPackage.NOTE_TYPE__FROM:
				setFrom((String)newValue);
				return;
			case W3schoolsPackage.NOTE_TYPE__HEADING:
				setHeading((String)newValue);
				return;
			case W3schoolsPackage.NOTE_TYPE__BODY:
				setBody((String)newValue);
				return;
			case W3schoolsPackage.NOTE_TYPE__DESCR:
				setDescr((DescrType)newValue);
				return;
			case W3schoolsPackage.NOTE_TYPE__FIRST:
				setFirst((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case W3schoolsPackage.NOTE_TYPE__TO:
				setTo(TO_EDEFAULT);
				return;
			case W3schoolsPackage.NOTE_TYPE__FROM:
				setFrom(FROM_EDEFAULT);
				return;
			case W3schoolsPackage.NOTE_TYPE__HEADING:
				setHeading(HEADING_EDEFAULT);
				return;
			case W3schoolsPackage.NOTE_TYPE__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case W3schoolsPackage.NOTE_TYPE__DESCR:
				setDescr((DescrType)null);
				return;
			case W3schoolsPackage.NOTE_TYPE__FIRST:
				setFirst(FIRST_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case W3schoolsPackage.NOTE_TYPE__TO:
				return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
			case W3schoolsPackage.NOTE_TYPE__FROM:
				return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
			case W3schoolsPackage.NOTE_TYPE__HEADING:
				return HEADING_EDEFAULT == null ? heading != null : !HEADING_EDEFAULT.equals(heading);
			case W3schoolsPackage.NOTE_TYPE__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case W3schoolsPackage.NOTE_TYPE__DESCR:
				return descr != null;
			case W3schoolsPackage.NOTE_TYPE__FIRST:
				return FIRST_EDEFAULT == null ? first != null : !FIRST_EDEFAULT.equals(first);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (to: ");
		result.append(to);
		result.append(", from: ");
		result.append(from);
		result.append(", heading: ");
		result.append(heading);
		result.append(", body: ");
		result.append(body);
		result.append(", first: ");
		result.append(first);
		result.append(')');
		return result.toString();
	}

} //NoteTypeImpl
