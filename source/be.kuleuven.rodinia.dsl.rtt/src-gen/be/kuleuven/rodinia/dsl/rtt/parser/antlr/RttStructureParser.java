/*
* generated by Xtext
*/
package be.kuleuven.rodinia.dsl.rtt.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import be.kuleuven.rodinia.dsl.rtt.services.RttStructureGrammarAccess;

public class RttStructureParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private RttStructureGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected be.kuleuven.rodinia.dsl.rtt.parser.antlr.internal.InternalRttStructureParser createParser(XtextTokenStream stream) {
		return new be.kuleuven.rodinia.dsl.rtt.parser.antlr.internal.InternalRttStructureParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Package";
	}
	
	public RttStructureGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(RttStructureGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}