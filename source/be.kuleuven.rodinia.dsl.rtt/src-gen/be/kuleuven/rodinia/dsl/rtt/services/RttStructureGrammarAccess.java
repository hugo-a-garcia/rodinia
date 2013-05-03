/*
* generated by Xtext
*/
package be.kuleuven.rodinia.dsl.rtt.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class RttStructureGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class PackageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Package");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cOrocosPackageAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cOrocosPackageKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cTaskContextsKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cTaskContextsAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cTaskContextsTaskContextParserRuleCall_4_2_0 = (RuleCall)cTaskContextsAssignment_4_2.eContents().get(0);
		private final Group cGroup_4_3 = (Group)cGroup_4.eContents().get(3);
		private final Keyword cCommaKeyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Assignment cTaskContextsAssignment_4_3_1 = (Assignment)cGroup_4_3.eContents().get(1);
		private final RuleCall cTaskContextsTaskContextParserRuleCall_4_3_1_0 = (RuleCall)cTaskContextsAssignment_4_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_4 = (Keyword)cGroup_4.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Package returns OrocosPackage:
		//	{OrocosPackage} "OrocosPackage" name=EString "{" ("taskContexts" "{" taskContexts+=TaskContext (","
		//	taskContexts+=TaskContext)* "}")? "}";
		public ParserRule getRule() { return rule; }

		//{OrocosPackage} "OrocosPackage" name=EString "{" ("taskContexts" "{" taskContexts+=TaskContext (","
		//taskContexts+=TaskContext)* "}")? "}"
		public Group getGroup() { return cGroup; }

		//{OrocosPackage}
		public Action getOrocosPackageAction_0() { return cOrocosPackageAction_0; }

		//"OrocosPackage"
		public Keyword getOrocosPackageKeyword_1() { return cOrocosPackageKeyword_1; }

		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//("taskContexts" "{" taskContexts+=TaskContext ("," taskContexts+=TaskContext)* "}")?
		public Group getGroup_4() { return cGroup_4; }

		//"taskContexts"
		public Keyword getTaskContextsKeyword_4_0() { return cTaskContextsKeyword_4_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4_1() { return cLeftCurlyBracketKeyword_4_1; }

		//taskContexts+=TaskContext
		public Assignment getTaskContextsAssignment_4_2() { return cTaskContextsAssignment_4_2; }

		//TaskContext
		public RuleCall getTaskContextsTaskContextParserRuleCall_4_2_0() { return cTaskContextsTaskContextParserRuleCall_4_2_0; }

		//("," taskContexts+=TaskContext)*
		public Group getGroup_4_3() { return cGroup_4_3; }

		//","
		public Keyword getCommaKeyword_4_3_0() { return cCommaKeyword_4_3_0; }

		//taskContexts+=TaskContext
		public Assignment getTaskContextsAssignment_4_3_1() { return cTaskContextsAssignment_4_3_1; }

		//TaskContext
		public RuleCall getTaskContextsTaskContextParserRuleCall_4_3_1_0() { return cTaskContextsTaskContextParserRuleCall_4_3_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4_4() { return cRightCurlyBracketKeyword_4_4; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString returns ecore::EString:
		//	STRING | ID;
		public ParserRule getRule() { return rule; }

		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}

	public class TaskContextElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TaskContext");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTaskContextKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cNamespaceKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNamespaceAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNamespaceEStringParserRuleCall_4_0 = (RuleCall)cNamespaceAssignment_4.eContents().get(0);
		private final Keyword cTypeKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cTypeAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cTypeEStringParserRuleCall_6_0 = (RuleCall)cTypeAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//TaskContext:
		//	"TaskContext" name=EString "{" "namespace" namespace=EString "type" type=EString "}";
		public ParserRule getRule() { return rule; }

		//"TaskContext" name=EString "{" "namespace" namespace=EString "type" type=EString "}"
		public Group getGroup() { return cGroup; }

		//"TaskContext"
		public Keyword getTaskContextKeyword_0() { return cTaskContextKeyword_0; }

		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//"namespace"
		public Keyword getNamespaceKeyword_3() { return cNamespaceKeyword_3; }

		//namespace=EString
		public Assignment getNamespaceAssignment_4() { return cNamespaceAssignment_4; }

		//EString
		public RuleCall getNamespaceEStringParserRuleCall_4_0() { return cNamespaceEStringParserRuleCall_4_0; }

		//"type"
		public Keyword getTypeKeyword_5() { return cTypeKeyword_5; }

		//type=EString
		public Assignment getTypeAssignment_6() { return cTypeAssignment_6; }

		//EString
		public RuleCall getTypeEStringParserRuleCall_6_0() { return cTypeEStringParserRuleCall_6_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	
	
	private PackageElements pPackage;
	private EStringElements pEString;
	private TaskContextElements pTaskContext;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public RttStructureGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("be.kuleuven.rodinia.dsl.rtt.RttStructure".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Package returns OrocosPackage:
	//	{OrocosPackage} "OrocosPackage" name=EString "{" ("taskContexts" "{" taskContexts+=TaskContext (","
	//	taskContexts+=TaskContext)* "}")? "}";
	public PackageElements getPackageAccess() {
		return (pPackage != null) ? pPackage : (pPackage = new PackageElements());
	}
	
	public ParserRule getPackageRule() {
		return getPackageAccess().getRule();
	}

	//EString returns ecore::EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return (pEString != null) ? pEString : (pEString = new EStringElements());
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}

	//TaskContext:
	//	"TaskContext" name=EString "{" "namespace" namespace=EString "type" type=EString "}";
	public TaskContextElements getTaskContextAccess() {
		return (pTaskContext != null) ? pTaskContext : (pTaskContext = new TaskContextElements());
	}
	
	public ParserRule getTaskContextRule() {
		return getTaskContextAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
