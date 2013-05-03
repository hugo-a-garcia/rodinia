/*
* generated by Xtext
*/
grammar InternalRttStructure;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package be.kuleuven.rodinia.dsl.rtt.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package be.kuleuven.rodinia.dsl.rtt.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import be.kuleuven.rodinia.dsl.rtt.services.RttStructureGrammarAccess;

}

@parser::members {

 	private RttStructureGrammarAccess grammarAccess;
 	
    public InternalRttStructureParser(TokenStream input, RttStructureGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Package";	
   	}
   	
   	@Override
   	protected RttStructureGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRulePackage
entryRulePackage returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPackageRule()); }
	 iv_rulePackage=rulePackage 
	 { $current=$iv_rulePackage.current; } 
	 EOF 
;

// Rule Package
rulePackage returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getPackageAccess().getOrocosPackageAction_0(),
            $current);
    }
)	otherlv_1='OrocosPackage' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getPackageAccess().getOrocosPackageKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPackageAccess().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPackageRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='taskContexts' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getPackageAccess().getTaskContextsKeyword_4_0());
    }
	otherlv_5='{' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_4_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPackageAccess().getTaskContextsTaskContextParserRuleCall_4_2_0()); 
	    }
		lv_taskContexts_6_0=ruleTaskContext		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPackageRule());
	        }
       		add(
       			$current, 
       			"taskContexts",
        		lv_taskContexts_6_0, 
        		"TaskContext");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_7=',' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getPackageAccess().getCommaKeyword_4_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPackageAccess().getTaskContextsTaskContextParserRuleCall_4_3_1_0()); 
	    }
		lv_taskContexts_8_0=ruleTaskContext		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPackageRule());
	        }
       		add(
       			$current, 
       			"taskContexts",
        		lv_taskContexts_8_0, 
        		"TaskContext");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_9='}' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4_4());
    }
)?	otherlv_10='}' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleEString
entryRuleEString returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEStringRule()); } 
	 iv_ruleEString=ruleEString 
	 { $current=$iv_ruleEString.current.getText(); }  
	 EOF 
;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_STRING_0=RULE_STRING    {
		$current.merge(this_STRING_0);
    }

    { 
    newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
    }

    |    this_ID_1=RULE_ID    {
		$current.merge(this_ID_1);
    }

    { 
    newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
    }
)
    ;





// Entry rule entryRuleTaskContext
entryRuleTaskContext returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTaskContextRule()); }
	 iv_ruleTaskContext=ruleTaskContext 
	 { $current=$iv_ruleTaskContext.current; } 
	 EOF 
;

// Rule TaskContext
ruleTaskContext returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='TaskContext' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTaskContextAccess().getTaskContextKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTaskContextAccess().getNameEStringParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTaskContextRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_2());
    }
	otherlv_3='namespace' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getTaskContextAccess().getNamespaceKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTaskContextAccess().getNamespaceEStringParserRuleCall_4_0()); 
	    }
		lv_namespace_4_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTaskContextRule());
	        }
       		set(
       			$current, 
       			"namespace",
        		lv_namespace_4_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5='type' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getTaskContextAccess().getTypeKeyword_5());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTaskContextAccess().getTypeEStringParserRuleCall_6_0()); 
	    }
		lv_type_6_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTaskContextRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_6_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_7());
    }
)
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


