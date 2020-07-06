/*
 * generated by Xtext 2.22.0
 */
package org.xtext.arithmetic.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.arithmetic.parser.antlr.internal.InternalArithmeticParser;
import org.xtext.arithmetic.services.ArithmeticGrammarAccess;

public class ArithmeticParser extends AbstractAntlrParser {

	@Inject
	private ArithmeticGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalArithmeticParser createParser(XtextTokenStream stream) {
		return new InternalArithmeticParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Module";
	}

	public ArithmeticGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ArithmeticGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}