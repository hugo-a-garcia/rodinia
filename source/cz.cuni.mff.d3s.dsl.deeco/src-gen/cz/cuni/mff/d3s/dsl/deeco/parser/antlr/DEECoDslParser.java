/*
* generated by Xtext
*/
package cz.cuni.mff.d3s.dsl.deeco.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import cz.cuni.mff.d3s.dsl.deeco.services.DEECoDslGrammarAccess;

public class DEECoDslParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private DEECoDslGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected cz.cuni.mff.d3s.dsl.deeco.parser.antlr.internal.InternalDEECoDslParser createParser(XtextTokenStream stream) {
		return new cz.cuni.mff.d3s.dsl.deeco.parser.antlr.internal.InternalDEECoDslParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "System";
	}
	
	public DEECoDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DEECoDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
