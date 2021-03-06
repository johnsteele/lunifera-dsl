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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.lunifera.dsl.entity.semantic.model.EntityPackage;
import org.lunifera.dsl.entity.semantic.model.LCompilerType;
import org.lunifera.dsl.entity.semantic.model.LImport;
import org.lunifera.dsl.entity.semantic.model.LPackage;
import org.lunifera.dsl.entity.semantic.model.LType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LPackage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.dsl.entity.semantic.model.impl.LPackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.dsl.entity.semantic.model.impl.LPackageImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.lunifera.dsl.entity.semantic.model.impl.LPackageImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link org.lunifera.dsl.entity.semantic.model.impl.LPackageImpl#getCompilers <em>Compilers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LPackageImpl extends MinimalEObjectImpl.Container implements LPackage {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<LImport> imports;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<LType> types;

	/**
	 * The cached value of the '{@link #getCompilers() <em>Compilers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompilers()
	 * @generated
	 * @ordered
	 */
	protected EList<LCompilerType> compilers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityPackage.Literals.LPACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.LPACKAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LImport> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<LImport>(LImport.class, this, EntityPackage.LPACKAGE__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LType> getTypes() {
		if (types == null) {
			types = new EObjectContainmentWithInverseEList<LType>(LType.class, this, EntityPackage.LPACKAGE__TYPES, EntityPackage.LTYPE__PACKAGE);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LCompilerType> getCompilers() {
		if (compilers == null) {
			compilers = new EObjectContainmentEList<LCompilerType>(LCompilerType.class, this, EntityPackage.LPACKAGE__COMPILERS);
		}
		return compilers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntityPackage.LPACKAGE__TYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTypes()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntityPackage.LPACKAGE__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
			case EntityPackage.LPACKAGE__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case EntityPackage.LPACKAGE__COMPILERS:
				return ((InternalEList<?>)getCompilers()).basicRemove(otherEnd, msgs);
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
			case EntityPackage.LPACKAGE__NAME:
				return getName();
			case EntityPackage.LPACKAGE__IMPORTS:
				return getImports();
			case EntityPackage.LPACKAGE__TYPES:
				return getTypes();
			case EntityPackage.LPACKAGE__COMPILERS:
				return getCompilers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EntityPackage.LPACKAGE__NAME:
				setName((String)newValue);
				return;
			case EntityPackage.LPACKAGE__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends LImport>)newValue);
				return;
			case EntityPackage.LPACKAGE__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends LType>)newValue);
				return;
			case EntityPackage.LPACKAGE__COMPILERS:
				getCompilers().clear();
				getCompilers().addAll((Collection<? extends LCompilerType>)newValue);
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
			case EntityPackage.LPACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EntityPackage.LPACKAGE__IMPORTS:
				getImports().clear();
				return;
			case EntityPackage.LPACKAGE__TYPES:
				getTypes().clear();
				return;
			case EntityPackage.LPACKAGE__COMPILERS:
				getCompilers().clear();
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
			case EntityPackage.LPACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EntityPackage.LPACKAGE__IMPORTS:
				return imports != null && !imports.isEmpty();
			case EntityPackage.LPACKAGE__TYPES:
				return types != null && !types.isEmpty();
			case EntityPackage.LPACKAGE__COMPILERS:
				return compilers != null && !compilers.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //LPackageImpl
