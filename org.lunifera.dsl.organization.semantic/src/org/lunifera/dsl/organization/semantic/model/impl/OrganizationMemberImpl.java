/**
 * Copyright (c) 2011 - 2013, Committers of lunifera.org
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 */
package org.lunifera.dsl.organization.semantic.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.lunifera.dsl.organization.semantic.model.OrganizationMember;
import org.lunifera.dsl.organization.semantic.model.OrganizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class OrganizationMemberImpl extends MinimalEObjectImpl.Container implements OrganizationMember {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrganizationPackage.Literals.ORGANIZATION_MEMBER;
	}

} //OrganizationMemberImpl
