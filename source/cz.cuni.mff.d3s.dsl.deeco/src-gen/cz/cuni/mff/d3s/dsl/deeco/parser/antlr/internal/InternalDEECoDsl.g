/*
* generated by Xtext
*/
grammar InternalDEECoDsl;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package cz.cuni.mff.d3s.dsl.deeco.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package cz.cuni.mff.d3s.dsl.deeco.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import cz.cuni.mff.d3s.dsl.deeco.services.DEECoDslGrammarAccess;

}

@parser::members {

 	private DEECoDslGrammarAccess grammarAccess;
 	
    public InternalDEECoDslParser(TokenStream input, DEECoDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "System";	
   	}
   	
   	@Override
   	protected DEECoDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleSystem
entryRuleSystem returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSystemRule()); }
	 iv_ruleSystem=ruleSystem 
	 { $current=$iv_ruleSystem.current; } 
	 EOF 
;

// Rule System
ruleSystem returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getSystemAccess().getSystemAction_0(),
            $current);
    }
)	otherlv_1='System' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getSystemAccess().getSystemKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSystemAccess().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSystemRule());
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
    	newLeafNode(otherlv_3, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='components' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getSystemAccess().getComponentsKeyword_4_0());
    }
	otherlv_5='{' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_4_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSystemAccess().getComponentsComponentParserRuleCall_4_2_0()); 
	    }
		lv_components_6_0=ruleComponent		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSystemRule());
	        }
       		add(
       			$current, 
       			"components",
        		lv_components_6_0, 
        		"Component");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_7=',' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getSystemAccess().getCommaKeyword_4_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSystemAccess().getComponentsComponentParserRuleCall_4_3_1_0()); 
	    }
		lv_components_8_0=ruleComponent		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSystemRule());
	        }
       		add(
       			$current, 
       			"components",
        		lv_components_8_0, 
        		"Component");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_9='}' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_4_4());
    }
)?(	otherlv_10='ensembles' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getSystemAccess().getEnsemblesKeyword_5_0());
    }
	otherlv_11='{' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_5_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSystemAccess().getEnsemblesEnsembleParserRuleCall_5_2_0()); 
	    }
		lv_ensembles_12_0=ruleEnsemble		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSystemRule());
	        }
       		add(
       			$current, 
       			"ensembles",
        		lv_ensembles_12_0, 
        		"Ensemble");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_13=',' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getSystemAccess().getCommaKeyword_5_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSystemAccess().getEnsemblesEnsembleParserRuleCall_5_3_1_0()); 
	    }
		lv_ensembles_14_0=ruleEnsemble		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSystemRule());
	        }
       		add(
       			$current, 
       			"ensembles",
        		lv_ensembles_14_0, 
        		"Ensemble");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_15='}' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_5_4());
    }
)?	otherlv_16='}' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_6());
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





// Entry rule entryRuleComponent
entryRuleComponent returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getComponentRule()); }
	 iv_ruleComponent=ruleComponent 
	 { $current=$iv_ruleComponent.current; } 
	 EOF 
;

// Rule Component
ruleComponent returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Component' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getComponentAccess().getNameEStringParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getComponentRule());
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
    	newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2());
    }
	otherlv_3='process' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getProcessKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getComponentAccess().getProcessProcessParserRuleCall_4_0()); 
	    }
		lv_process_4_0=ruleProcess		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getComponentRule());
	        }
       		set(
       			$current, 
       			"process",
        		lv_process_4_0, 
        		"Process");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_5='ensembleMember' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getEnsembleMemberKeyword_5_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getComponentRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getComponentAccess().getEnsembleMemberEnsembleCrossReference_5_1_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_7='ensembleCordinator' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getEnsembleCordinatorKeyword_6_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getComponentRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getComponentAccess().getEnsembleCordinatorEnsembleCrossReference_6_1_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_9='}' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_7());
    }
)
;





// Entry rule entryRuleEnsemble
entryRuleEnsemble returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEnsembleRule()); }
	 iv_ruleEnsemble=ruleEnsemble 
	 { $current=$iv_ruleEnsemble.current; } 
	 EOF 
;

// Rule Ensemble
ruleEnsemble returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Ensemble' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getEnsembleAccess().getEnsembleKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEnsembleAccess().getNameEStringParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEnsembleRule());
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
    	newLeafNode(otherlv_2, grammarAccess.getEnsembleAccess().getLeftCurlyBracketKeyword_2());
    }
	otherlv_3='coordinator' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getEnsembleAccess().getCoordinatorKeyword_3());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getEnsembleRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getEnsembleAccess().getCoordinatorComponentCrossReference_4_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_5='members' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getEnsembleAccess().getMembersKeyword_5_0());
    }
	otherlv_6='(' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getEnsembleAccess().getLeftParenthesisKeyword_5_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getEnsembleRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getEnsembleAccess().getMembersComponentCrossReference_5_2_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_8=',' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getEnsembleAccess().getCommaKeyword_5_3_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getEnsembleRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getEnsembleAccess().getMembersComponentCrossReference_5_3_1_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_10=')' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getEnsembleAccess().getRightParenthesisKeyword_5_4());
    }
)?	otherlv_11='}' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getEnsembleAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleProcess
entryRuleProcess returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getProcessRule()); }
	 iv_ruleProcess=ruleProcess 
	 { $current=$iv_ruleProcess.current; } 
	 EOF 
;

// Rule Process
ruleProcess returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getProcessAccess().getProcessAction_0(),
            $current);
    }
)	otherlv_1='Process' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getProcessAccess().getProcessKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getProcessRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


