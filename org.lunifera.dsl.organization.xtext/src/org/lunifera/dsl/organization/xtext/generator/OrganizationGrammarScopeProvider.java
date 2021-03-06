/*******************************************************************************
 * Copyright (c) 2011, 2012 Cristiano Gavião - Lunifera.org.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Cristiano Gavião - initial API and implementation
 *******************************************************************************/
package org.lunifera.dsl.organization.xtext.generator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.ScopeBasedSelectable;
import org.eclipse.xtext.scoping.impl.SelectableBasedScope;
import org.lunifera.dsl.organization.semantic.model.Organization;
import org.lunifera.dsl.organization.semantic.model.OrganizationPackage;
import org.lunifera.dsl.organization.semantic.model.Partnership;

import com.google.common.base.Predicate;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping on
 * how and when to use it
 * 
 */
public class OrganizationGrammarScopeProvider extends
		AbstractDeclarativeScopeProvider {

	public IScope scope_Partnership_company(final Partnership context,
			EReference reference) {
		IScope unfilteredScope = delegateGetScope(context, reference);
		final Organization orgNameToFix = ((Organization) context.eContainer()
				.eContainer());

		IScope filtered = SelectableBasedScope.createScope(IScope.NULLSCOPE,
				new ScopeBasedSelectable(unfilteredScope),
				new Predicate<IEObjectDescription>() {
					public boolean apply(IEObjectDescription input) {

						EObject eObject = input.getEObjectOrProxy();
						if (eObject.eIsProxy()) {
							eObject = EcoreUtil.resolve(eObject, context);
						}
						boolean result = !eObject.equals(orgNameToFix);
						return result;
					};
				}, OrganizationPackage.eINSTANCE.getOrganization(), true);

		return filtered;
	}

	public IScope scope_Partnership_responsible(final Partnership context,
			EReference reference) {
		IScope unfilteredScope = delegateGetScope(context, reference);
		final Organization orgNameToFix = ((Organization) context.eContainer()
				.eContainer());

		IScope filtered = SelectableBasedScope.createScope(IScope.NULLSCOPE,
				new ScopeBasedSelectable(unfilteredScope),
				new Predicate<IEObjectDescription>() {
					public boolean apply(IEObjectDescription input) {

						EObject eObject = input.getEObjectOrProxy();
						if (eObject.eIsProxy()) {
							eObject = EcoreUtil.resolve(eObject, context);
						}
						boolean result = eObject.eContainer().eContainer()
								.equals(orgNameToFix);
						return result;
					};
				}, OrganizationPackage.eINSTANCE.getWorker(), true);

		return filtered;
	}
}
