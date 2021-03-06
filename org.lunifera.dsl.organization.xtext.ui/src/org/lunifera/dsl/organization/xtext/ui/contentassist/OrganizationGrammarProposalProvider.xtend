/**
 * Copyright (c) 2011 - 2013, Committers of lunifera.org
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Sources generated by Xtext  
 * 
 * Contributors:
 *  		Cristiano Gaviao - Initial implementation
 */
package org.lunifera.dsl.organization.xtext.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.text.contentassist.ICompletionProposal
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.GrammarUtil
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.xtext.ui.editor.contentassist.PrefixMatcher
import org.eclipse.xtext.util.Strings

/**
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on how to customize content assistant
 */
class OrganizationGrammarProposalProvider extends AbstractOrganizationGrammarProposalProvider {

	override void complete_Fqn(EObject model, RuleCall ruleCall, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		val PrefixMatcher newMatcher = new InnerPrefixMatcher(context);
		val ContentAssistContext myContext = context.copy().setMatcher(newMatcher).toContext();
		val String feature = ruleCall.getAssignedFeature;
		var String proposalText = if (feature != null)
				feature
			else
				Strings::toFirstUpper(ruleCall.getRule().getName().toLowerCase());
		var String displayText = proposalText;
		if (feature != null) {
			displayText = proposalText + " - " + ruleCall.getRule().getName();
		}
		proposalText = getValueConverter().toString(proposalText, ruleCall.getRule().getName());
		val ICompletionProposal proposal = proposalText.createCompletionProposal(displayText, null, myContext);
		if (proposal instanceof ConfigurableCompletionProposal) {
			val ConfigurableCompletionProposal configurable = proposal as ConfigurableCompletionProposal;
			configurable.setSelectionStart(configurable.getReplacementOffset());
			configurable.setSelectionLength(proposalText.length());
			configurable.setAutoInsertable(false);
			configurable.setSimpleLinkedMode(myContext.getViewer(), '\t'.charAt(0), ' '.charAt(0));
		}
		acceptor.accept(proposal);
	}

	def String getAssignedFeature(RuleCall call) {
		val Assignment ass = GrammarUtil::containingAssignment(call);
		if (ass != null) {
			var String result = ass.getFeature();
			if (result.equals(result.toLowerCase()))
				result = Strings::toFirstUpper(result);
			return result;
		}
		return null;
	}
}

class InnerPrefixMatcher extends PrefixMatcher {

	ContentAssistContext context

	new(ContentAssistContext context) {
		this.context = context
	}

	override boolean isCandidateMatchingPrefix(String name, String prefix) {
		var String strippedName = name;
		if (name.startsWith("^") && !prefix.startsWith("^")) {
			strippedName = name.substring(1);
		}
		return context.getMatcher().isCandidateMatchingPrefix(strippedName, prefix);
	}
}
