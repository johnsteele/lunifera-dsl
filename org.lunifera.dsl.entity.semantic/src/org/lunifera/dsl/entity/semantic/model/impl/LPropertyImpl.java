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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.lunifera.dsl.entity.semantic.model.EntityPackage;
import org.lunifera.dsl.entity.semantic.model.LProperty;
import org.lunifera.dsl.entity.semantic.model.LType;
import org.lunifera.dsl.entity.semantic.model.LowerBound;
import org.lunifera.dsl.entity.semantic.model.UpperBound;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LProperty</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.dsl.entity.semantic.model.impl.LPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.dsl.entity.semantic.model.impl.LPropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.lunifera.dsl.entity.semantic.model.impl.LPropertyImpl#getJvmTypeRef <em>Jvm Type Ref</em>}</li>
 *   <li>{@link org.lunifera.dsl.entity.semantic.model.impl.LPropertyImpl#isId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.dsl.entity.semantic.model.impl.LPropertyImpl#isVersion <em>Version</em>}</li>
 *   <li>{@link org.lunifera.dsl.entity.semantic.model.impl.LPropertyImpl#isNotnull <em>Notnull</em>}</li>
 *   <li>{@link org.lunifera.dsl.entity.semantic.model.impl.LPropertyImpl#isTransient <em>Transient</em>}</li>
 *   <li>{@link org.lunifera.dsl.entity.semantic.model.impl.LPropertyImpl#getDefaultValueLiteral <em>Default Value Literal</em>}</li>
 *   <li>{@link org.lunifera.dsl.entity.semantic.model.impl.LPropertyImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.lunifera.dsl.entity.semantic.model.impl.LPropertyImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.lunifera.dsl.entity.semantic.model.impl.LPropertyImpl#isCollection <em>Collection</em>}</li>
 *   <li>{@link org.lunifera.dsl.entity.semantic.model.impl.LPropertyImpl#isComposition <em>Composition</em>}</li>
 *   <li>{@link org.lunifera.dsl.entity.semantic.model.impl.LPropertyImpl#getOpposite <em>Opposite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LPropertyImpl extends LAnnotationTargetImpl implements LProperty {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected LType type;

	/**
	 * The cached value of the '{@link #getJvmTypeRef() <em>Jvm Type Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJvmTypeRef()
	 * @generated
	 * @ordered
	 */
	protected JvmTypeReference jvmTypeRef;

	/**
	 * The default value of the '{@link #isId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isId()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isId()
	 * @generated
	 * @ordered
	 */
	protected boolean id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVersion()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERSION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVersion()
	 * @generated
	 * @ordered
	 */
	protected boolean version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #isNotnull() <em>Notnull</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotnull()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NOTNULL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNotnull() <em>Notnull</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotnull()
	 * @generated
	 * @ordered
	 */
	protected boolean notnull = NOTNULL_EDEFAULT;

	/**
	 * The default value of the '{@link #isTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSIENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected boolean transient_ = TRANSIENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValueLiteral() <em>Default Value Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueLiteral()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_LITERAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValueLiteral() <em>Default Value Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueLiteral()
	 * @generated
	 * @ordered
	 */
	protected String defaultValueLiteral = DEFAULT_VALUE_LITERAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected static final LowerBound LOWER_EDEFAULT = LowerBound.NULL;

	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected LowerBound lower = LOWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected static final UpperBound UPPER_EDEFAULT = UpperBound.NULL;

	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected UpperBound upper = UPPER_EDEFAULT;

	/**
	 * The default value of the '{@link #isCollection() <em>Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COLLECTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCollection() <em>Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollection()
	 * @generated
	 * @ordered
	 */
	protected boolean collection = COLLECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isComposition() <em>Composition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComposition()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMPOSITION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isComposition() <em>Composition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComposition()
	 * @generated
	 * @ordered
	 */
	protected boolean composition = COMPOSITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOpposite() <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpposite()
	 * @generated
	 * @ordered
	 */
	protected LProperty opposite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityPackage.Literals.LPROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(boolean newId) {
		boolean oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.LPROPERTY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(boolean newVersion) {
		boolean oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.LPROPERTY__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNotnull() {
		return notnull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotnull(boolean newNotnull) {
		boolean oldNotnull = notnull;
		notnull = newNotnull;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.LPROPERTY__NOTNULL, oldNotnull, notnull));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransient() {
		return transient_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransient(boolean newTransient) {
		boolean oldTransient = transient_;
		transient_ = newTransient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.LPROPERTY__TRANSIENT, oldTransient, transient_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValueLiteral() {
		return defaultValueLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueLiteral(String newDefaultValueLiteral) {
		String oldDefaultValueLiteral = defaultValueLiteral;
		defaultValueLiteral = newDefaultValueLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.LPROPERTY__DEFAULT_VALUE_LITERAL, oldDefaultValueLiteral, defaultValueLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LowerBound getLower() {
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(LowerBound newLower) {
		LowerBound oldLower = lower;
		lower = newLower == null ? LOWER_EDEFAULT : newLower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.LPROPERTY__LOWER, oldLower, lower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpperBound getUpper() {
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(UpperBound newUpper) {
		UpperBound oldUpper = upper;
		upper = newUpper == null ? UPPER_EDEFAULT : newUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.LPROPERTY__UPPER, oldUpper, upper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCollection() {
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollection(boolean newCollection) {
		boolean oldCollection = collection;
		collection = newCollection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.LPROPERTY__COLLECTION, oldCollection, collection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isComposition() {
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComposition(boolean newComposition) {
		boolean oldComposition = composition;
		composition = newComposition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.LPROPERTY__COMPOSITION, oldComposition, composition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LProperty getOpposite() {
		if (opposite != null && opposite.eIsProxy()) {
			InternalEObject oldOpposite = (InternalEObject)opposite;
			opposite = (LProperty)eResolveProxy(oldOpposite);
			if (opposite != oldOpposite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityPackage.LPROPERTY__OPPOSITE, oldOpposite, opposite));
			}
		}
		return opposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LProperty basicGetOpposite() {
		return opposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpposite(LProperty newOpposite) {
		LProperty oldOpposite = opposite;
		opposite = newOpposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.LPROPERTY__OPPOSITE, oldOpposite, opposite));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.LPROPERTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (LType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityPackage.LPROPERTY__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(LType newType) {
		LType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.LPROPERTY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmTypeReference getJvmTypeRef() {
		return jvmTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJvmTypeRef(JvmTypeReference newJvmTypeRef, NotificationChain msgs) {
		JvmTypeReference oldJvmTypeRef = jvmTypeRef;
		jvmTypeRef = newJvmTypeRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntityPackage.LPROPERTY__JVM_TYPE_REF, oldJvmTypeRef, newJvmTypeRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJvmTypeRef(JvmTypeReference newJvmTypeRef) {
		if (newJvmTypeRef != jvmTypeRef) {
			NotificationChain msgs = null;
			if (jvmTypeRef != null)
				msgs = ((InternalEObject)jvmTypeRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EntityPackage.LPROPERTY__JVM_TYPE_REF, null, msgs);
			if (newJvmTypeRef != null)
				msgs = ((InternalEObject)newJvmTypeRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EntityPackage.LPROPERTY__JVM_TYPE_REF, null, msgs);
			msgs = basicSetJvmTypeRef(newJvmTypeRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.LPROPERTY__JVM_TYPE_REF, newJvmTypeRef, newJvmTypeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntityPackage.LPROPERTY__JVM_TYPE_REF:
				return basicSetJvmTypeRef(null, msgs);
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
			case EntityPackage.LPROPERTY__NAME:
				return getName();
			case EntityPackage.LPROPERTY__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case EntityPackage.LPROPERTY__JVM_TYPE_REF:
				return getJvmTypeRef();
			case EntityPackage.LPROPERTY__ID:
				return isId();
			case EntityPackage.LPROPERTY__VERSION:
				return isVersion();
			case EntityPackage.LPROPERTY__NOTNULL:
				return isNotnull();
			case EntityPackage.LPROPERTY__TRANSIENT:
				return isTransient();
			case EntityPackage.LPROPERTY__DEFAULT_VALUE_LITERAL:
				return getDefaultValueLiteral();
			case EntityPackage.LPROPERTY__LOWER:
				return getLower();
			case EntityPackage.LPROPERTY__UPPER:
				return getUpper();
			case EntityPackage.LPROPERTY__COLLECTION:
				return isCollection();
			case EntityPackage.LPROPERTY__COMPOSITION:
				return isComposition();
			case EntityPackage.LPROPERTY__OPPOSITE:
				if (resolve) return getOpposite();
				return basicGetOpposite();
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
			case EntityPackage.LPROPERTY__NAME:
				setName((String)newValue);
				return;
			case EntityPackage.LPROPERTY__TYPE:
				setType((LType)newValue);
				return;
			case EntityPackage.LPROPERTY__JVM_TYPE_REF:
				setJvmTypeRef((JvmTypeReference)newValue);
				return;
			case EntityPackage.LPROPERTY__ID:
				setId((Boolean)newValue);
				return;
			case EntityPackage.LPROPERTY__VERSION:
				setVersion((Boolean)newValue);
				return;
			case EntityPackage.LPROPERTY__NOTNULL:
				setNotnull((Boolean)newValue);
				return;
			case EntityPackage.LPROPERTY__TRANSIENT:
				setTransient((Boolean)newValue);
				return;
			case EntityPackage.LPROPERTY__DEFAULT_VALUE_LITERAL:
				setDefaultValueLiteral((String)newValue);
				return;
			case EntityPackage.LPROPERTY__LOWER:
				setLower((LowerBound)newValue);
				return;
			case EntityPackage.LPROPERTY__UPPER:
				setUpper((UpperBound)newValue);
				return;
			case EntityPackage.LPROPERTY__COLLECTION:
				setCollection((Boolean)newValue);
				return;
			case EntityPackage.LPROPERTY__COMPOSITION:
				setComposition((Boolean)newValue);
				return;
			case EntityPackage.LPROPERTY__OPPOSITE:
				setOpposite((LProperty)newValue);
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
			case EntityPackage.LPROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EntityPackage.LPROPERTY__TYPE:
				setType((LType)null);
				return;
			case EntityPackage.LPROPERTY__JVM_TYPE_REF:
				setJvmTypeRef((JvmTypeReference)null);
				return;
			case EntityPackage.LPROPERTY__ID:
				setId(ID_EDEFAULT);
				return;
			case EntityPackage.LPROPERTY__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case EntityPackage.LPROPERTY__NOTNULL:
				setNotnull(NOTNULL_EDEFAULT);
				return;
			case EntityPackage.LPROPERTY__TRANSIENT:
				setTransient(TRANSIENT_EDEFAULT);
				return;
			case EntityPackage.LPROPERTY__DEFAULT_VALUE_LITERAL:
				setDefaultValueLiteral(DEFAULT_VALUE_LITERAL_EDEFAULT);
				return;
			case EntityPackage.LPROPERTY__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case EntityPackage.LPROPERTY__UPPER:
				setUpper(UPPER_EDEFAULT);
				return;
			case EntityPackage.LPROPERTY__COLLECTION:
				setCollection(COLLECTION_EDEFAULT);
				return;
			case EntityPackage.LPROPERTY__COMPOSITION:
				setComposition(COMPOSITION_EDEFAULT);
				return;
			case EntityPackage.LPROPERTY__OPPOSITE:
				setOpposite((LProperty)null);
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
			case EntityPackage.LPROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EntityPackage.LPROPERTY__TYPE:
				return type != null;
			case EntityPackage.LPROPERTY__JVM_TYPE_REF:
				return jvmTypeRef != null;
			case EntityPackage.LPROPERTY__ID:
				return id != ID_EDEFAULT;
			case EntityPackage.LPROPERTY__VERSION:
				return version != VERSION_EDEFAULT;
			case EntityPackage.LPROPERTY__NOTNULL:
				return notnull != NOTNULL_EDEFAULT;
			case EntityPackage.LPROPERTY__TRANSIENT:
				return transient_ != TRANSIENT_EDEFAULT;
			case EntityPackage.LPROPERTY__DEFAULT_VALUE_LITERAL:
				return DEFAULT_VALUE_LITERAL_EDEFAULT == null ? defaultValueLiteral != null : !DEFAULT_VALUE_LITERAL_EDEFAULT.equals(defaultValueLiteral);
			case EntityPackage.LPROPERTY__LOWER:
				return lower != LOWER_EDEFAULT;
			case EntityPackage.LPROPERTY__UPPER:
				return upper != UPPER_EDEFAULT;
			case EntityPackage.LPROPERTY__COLLECTION:
				return collection != COLLECTION_EDEFAULT;
			case EntityPackage.LPROPERTY__COMPOSITION:
				return composition != COMPOSITION_EDEFAULT;
			case EntityPackage.LPROPERTY__OPPOSITE:
				return opposite != null;
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
		result.append(", id: ");
		result.append(id);
		result.append(", version: ");
		result.append(version);
		result.append(", notnull: ");
		result.append(notnull);
		result.append(", transient: ");
		result.append(transient_);
		result.append(", defaultValueLiteral: ");
		result.append(defaultValueLiteral);
		result.append(", lower: ");
		result.append(lower);
		result.append(", upper: ");
		result.append(upper);
		result.append(", collection: ");
		result.append(collection);
		result.append(", composition: ");
		result.append(composition);
		result.append(')');
		return result.toString();
	}

} //LPropertyImpl
