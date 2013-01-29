/**
 * Copyright (c) 2011 - 2012, Florian Pirchner - lunifera.org
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Generated by Xtext
 * 
 * Contributors:
 * 		Florian Pirchner - Initial implementation
 *      Robert Handschmann - Entity DSL v2
 */
package org.lunifera.dsl.entity.xtext.jvmmodel.services.enums

import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.lunifera.dsl.entity.semantic.model.LEnum

/**
 * Infers a JVM model from {@link LEnum} model elements.
 */
class EnumJvmModelInferrer {

	@Inject extension IQualifiedNameProvider
    @Inject extension JvmTypesBuilder;

   	/**
	 * Is called for each instance of the first argument's type contained in a resource.
	 * 
	 * @param element - the model to create one or more JvmDeclaredTypes from.
	 * @param acceptor - each created JvmDeclaredType without a container should be passed to the acceptor in order get attached to the
	 *                   current resource.
	 * @param isPreLinkingPhase - whether the method is called in a pre linking phase, i.e. when the global index isn't fully updated. You
	 *        must not rely on linking using the index if iPrelinkingPhase is <code>true</code>
	 */
   	 def void infer(LEnum enum, IJvmDeclaredTypeAcceptor acceptor, boolean isPrelinkingPhase) {
		acceptor.accept(enum.toEnumerationType(enum.fullyQualifiedName.toString, null))
		        .initializeLater [
			documentation = enum.documentation
			for (f : enum.literals) {
				documentation = f.documentation
				members += f.toEnumerationLiteral(f.name)
			}
		]
   	}

}
