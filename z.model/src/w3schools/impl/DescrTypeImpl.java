/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package w3schools.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import w3schools.DescrType;
import w3schools.W3schoolsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Descr Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link w3schools.impl.DescrTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link w3schools.impl.DescrTypeImpl#getIfmid <em>Ifmid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DescrTypeImpl extends EObjectImpl implements DescrType {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIfmid() <em>Ifmid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfmid()
	 * @generated
	 * @ordered
	 */
	protected static final String IFMID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIfmid() <em>Ifmid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfmid()
	 * @generated
	 * @ordered
	 */
	protected String ifmid = IFMID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescrTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return W3schoolsPackage.Literals.DESCR_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, W3schoolsPackage.DESCR_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIfmid() {
		return ifmid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfmid(String newIfmid) {
		String oldIfmid = ifmid;
		ifmid = newIfmid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, W3schoolsPackage.DESCR_TYPE__IFMID, oldIfmid, ifmid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case W3schoolsPackage.DESCR_TYPE__VALUE:
				return getValue();
			case W3schoolsPackage.DESCR_TYPE__IFMID:
				return getIfmid();
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
			case W3schoolsPackage.DESCR_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case W3schoolsPackage.DESCR_TYPE__IFMID:
				setIfmid((String)newValue);
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
			case W3schoolsPackage.DESCR_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case W3schoolsPackage.DESCR_TYPE__IFMID:
				setIfmid(IFMID_EDEFAULT);
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
			case W3schoolsPackage.DESCR_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case W3schoolsPackage.DESCR_TYPE__IFMID:
				return IFMID_EDEFAULT == null ? ifmid != null : !IFMID_EDEFAULT.equals(ifmid);
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
		result.append(" (value: ");
		result.append(value);
		result.append(", ifmid: ");
		result.append(ifmid);
		result.append(')');
		return result.toString();
	}

} //DescrTypeImpl
