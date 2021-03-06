/**
 * Copyright (c) 2011 - 2012, Florian Pirchner - lunifera.org
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Sources generated by Xtext  
 * 
 * Contributors:
 *  		Hans Georg Glöckler - Initial implementation
 *  		Florian Pirchner - Initial implementation
 */
package org.lunifera.dsl.entity.semantic.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.lunifera.dsl.entity.semantic.model.EntityPackage;
import org.lunifera.dsl.entity.semantic.model.LCompilerType;
import org.lunifera.dsl.entity.semantic.model.LGenSettings;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LGen Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.dsl.entity.semantic.model.impl.LGenSettingsImpl#isNoSource <em>No Source</em>}</li>
 *   <li>{@link org.lunifera.dsl.entity.semantic.model.impl.LGenSettingsImpl#getCompilerType <em>Compiler Type</em>}</li>
 *   <li>{@link org.lunifera.dsl.entity.semantic.model.impl.LGenSettingsImpl#isLifecycle <em>Lifecycle</em>}</li>
 *   <li>{@link org.lunifera.dsl.entity.semantic.model.impl.LGenSettingsImpl#isPropertyChangeSupport <em>Property Change Support</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LGenSettingsImpl extends MinimalEObjectImpl.Container implements LGenSettings {
	/**
	 * The default value of the '{@link #isNoSource() <em>No Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoSource()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_SOURCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNoSource() <em>No Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoSource()
	 * @generated
	 * @ordered
	 */
	protected boolean noSource = NO_SOURCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCompilerType() <em>Compiler Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompilerType()
	 * @generated
	 * @ordered
	 */
	protected LCompilerType compilerType;

	/**
	 * The default value of the '{@link #isLifecycle() <em>Lifecycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLifecycle()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LIFECYCLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLifecycle() <em>Lifecycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLifecycle()
	 * @generated
	 * @ordered
	 */
	protected boolean lifecycle = LIFECYCLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isPropertyChangeSupport() <em>Property Change Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPropertyChangeSupport()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROPERTY_CHANGE_SUPPORT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPropertyChangeSupport() <em>Property Change Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPropertyChangeSupport()
	 * @generated
	 * @ordered
	 */
	protected boolean propertyChangeSupport = PROPERTY_CHANGE_SUPPORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LGenSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityPackage.Literals.LGEN_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNoSource() {
		return noSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoSource(boolean newNoSource) {
		boolean oldNoSource = noSource;
		noSource = newNoSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.LGEN_SETTINGS__NO_SOURCE, oldNoSource, noSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LCompilerType getCompilerType() {
		if (compilerType != null && compilerType.eIsProxy()) {
			InternalEObject oldCompilerType = (InternalEObject)compilerType;
			compilerType = (LCompilerType)eResolveProxy(oldCompilerType);
			if (compilerType != oldCompilerType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityPackage.LGEN_SETTINGS__COMPILER_TYPE, oldCompilerType, compilerType));
			}
		}
		return compilerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LCompilerType basicGetCompilerType() {
		return compilerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompilerType(LCompilerType newCompilerType) {
		LCompilerType oldCompilerType = compilerType;
		compilerType = newCompilerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.LGEN_SETTINGS__COMPILER_TYPE, oldCompilerType, compilerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLifecycle() {
		return lifecycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLifecycle(boolean newLifecycle) {
		boolean oldLifecycle = lifecycle;
		lifecycle = newLifecycle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.LGEN_SETTINGS__LIFECYCLE, oldLifecycle, lifecycle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPropertyChangeSupport() {
		return propertyChangeSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyChangeSupport(boolean newPropertyChangeSupport) {
		boolean oldPropertyChangeSupport = propertyChangeSupport;
		propertyChangeSupport = newPropertyChangeSupport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.LGEN_SETTINGS__PROPERTY_CHANGE_SUPPORT, oldPropertyChangeSupport, propertyChangeSupport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EntityPackage.LGEN_SETTINGS__NO_SOURCE:
				return isNoSource();
			case EntityPackage.LGEN_SETTINGS__COMPILER_TYPE:
				if (resolve) return getCompilerType();
				return basicGetCompilerType();
			case EntityPackage.LGEN_SETTINGS__LIFECYCLE:
				return isLifecycle();
			case EntityPackage.LGEN_SETTINGS__PROPERTY_CHANGE_SUPPORT:
				return isPropertyChangeSupport();
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
			case EntityPackage.LGEN_SETTINGS__NO_SOURCE:
				setNoSource((Boolean)newValue);
				return;
			case EntityPackage.LGEN_SETTINGS__COMPILER_TYPE:
				setCompilerType((LCompilerType)newValue);
				return;
			case EntityPackage.LGEN_SETTINGS__LIFECYCLE:
				setLifecycle((Boolean)newValue);
				return;
			case EntityPackage.LGEN_SETTINGS__PROPERTY_CHANGE_SUPPORT:
				setPropertyChangeSupport((Boolean)newValue);
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
			case EntityPackage.LGEN_SETTINGS__NO_SOURCE:
				setNoSource(NO_SOURCE_EDEFAULT);
				return;
			case EntityPackage.LGEN_SETTINGS__COMPILER_TYPE:
				setCompilerType((LCompilerType)null);
				return;
			case EntityPackage.LGEN_SETTINGS__LIFECYCLE:
				setLifecycle(LIFECYCLE_EDEFAULT);
				return;
			case EntityPackage.LGEN_SETTINGS__PROPERTY_CHANGE_SUPPORT:
				setPropertyChangeSupport(PROPERTY_CHANGE_SUPPORT_EDEFAULT);
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
			case EntityPackage.LGEN_SETTINGS__NO_SOURCE:
				return noSource != NO_SOURCE_EDEFAULT;
			case EntityPackage.LGEN_SETTINGS__COMPILER_TYPE:
				return compilerType != null;
			case EntityPackage.LGEN_SETTINGS__LIFECYCLE:
				return lifecycle != LIFECYCLE_EDEFAULT;
			case EntityPackage.LGEN_SETTINGS__PROPERTY_CHANGE_SUPPORT:
				return propertyChangeSupport != PROPERTY_CHANGE_SUPPORT_EDEFAULT;
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
		result.append(" (noSource: ");
		result.append(noSource);
		result.append(", lifecycle: ");
		result.append(lifecycle);
		result.append(", propertyChangeSupport: ");
		result.append(propertyChangeSupport);
		result.append(')');
		return result.toString();
	}

} //LGenSettingsImpl
