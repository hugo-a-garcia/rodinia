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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDEECoDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'System'", "'{'", "'components'", "','", "'}'", "'ensembles'", "'Component'", "'process'", "'ensembleMember'", "'ensembleCordinator'", "'Ensemble'", "'coordinator'", "'members'", "'('", "')'", "'Process'"
    };
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalDEECoDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDEECoDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDEECoDslParser.tokenNames; }
    public String getGrammarFileName() { return "../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g"; }



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



    // $ANTLR start "entryRuleSystem"
    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:67:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:68:2: (iv_ruleSystem= ruleSystem EOF )
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:69:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSystem_in_entryRuleSystem75);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSystem85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:76:1: ruleSystem returns [EObject current=null] : ( () otherlv_1= 'System' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'components' otherlv_5= '{' ( (lv_components_6_0= ruleComponent ) ) (otherlv_7= ',' ( (lv_components_8_0= ruleComponent ) ) )* otherlv_9= '}' )? (otherlv_10= 'ensembles' otherlv_11= '{' ( (lv_ensembles_12_0= ruleEnsemble ) ) (otherlv_13= ',' ( (lv_ensembles_14_0= ruleEnsemble ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_components_6_0 = null;

        EObject lv_components_8_0 = null;

        EObject lv_ensembles_12_0 = null;

        EObject lv_ensembles_14_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:79:28: ( ( () otherlv_1= 'System' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'components' otherlv_5= '{' ( (lv_components_6_0= ruleComponent ) ) (otherlv_7= ',' ( (lv_components_8_0= ruleComponent ) ) )* otherlv_9= '}' )? (otherlv_10= 'ensembles' otherlv_11= '{' ( (lv_ensembles_12_0= ruleEnsemble ) ) (otherlv_13= ',' ( (lv_ensembles_14_0= ruleEnsemble ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:80:1: ( () otherlv_1= 'System' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'components' otherlv_5= '{' ( (lv_components_6_0= ruleComponent ) ) (otherlv_7= ',' ( (lv_components_8_0= ruleComponent ) ) )* otherlv_9= '}' )? (otherlv_10= 'ensembles' otherlv_11= '{' ( (lv_ensembles_12_0= ruleEnsemble ) ) (otherlv_13= ',' ( (lv_ensembles_14_0= ruleEnsemble ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:80:1: ( () otherlv_1= 'System' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'components' otherlv_5= '{' ( (lv_components_6_0= ruleComponent ) ) (otherlv_7= ',' ( (lv_components_8_0= ruleComponent ) ) )* otherlv_9= '}' )? (otherlv_10= 'ensembles' otherlv_11= '{' ( (lv_ensembles_12_0= ruleEnsemble ) ) (otherlv_13= ',' ( (lv_ensembles_14_0= ruleEnsemble ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:80:2: () otherlv_1= 'System' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'components' otherlv_5= '{' ( (lv_components_6_0= ruleComponent ) ) (otherlv_7= ',' ( (lv_components_8_0= ruleComponent ) ) )* otherlv_9= '}' )? (otherlv_10= 'ensembles' otherlv_11= '{' ( (lv_ensembles_12_0= ruleEnsemble ) ) (otherlv_13= ',' ( (lv_ensembles_14_0= ruleEnsemble ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:80:2: ()
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSystemAccess().getSystemAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleSystem131); 

                	newLeafNode(otherlv_1, grammarAccess.getSystemAccess().getSystemKeyword_1());
                
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:90:1: ( (lv_name_2_0= ruleEString ) )
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:91:1: (lv_name_2_0= ruleEString )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:91:1: (lv_name_2_0= ruleEString )
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:92:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSystemAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSystem152);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSystemRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSystem164); 

                	newLeafNode(otherlv_3, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_3());
                
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:112:1: (otherlv_4= 'components' otherlv_5= '{' ( (lv_components_6_0= ruleComponent ) ) (otherlv_7= ',' ( (lv_components_8_0= ruleComponent ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:112:3: otherlv_4= 'components' otherlv_5= '{' ( (lv_components_6_0= ruleComponent ) ) (otherlv_7= ',' ( (lv_components_8_0= ruleComponent ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSystem177); 

                        	newLeafNode(otherlv_4, grammarAccess.getSystemAccess().getComponentsKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSystem189); 

                        	newLeafNode(otherlv_5, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:120:1: ( (lv_components_6_0= ruleComponent ) )
                    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:121:1: (lv_components_6_0= ruleComponent )
                    {
                    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:121:1: (lv_components_6_0= ruleComponent )
                    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:122:3: lv_components_6_0= ruleComponent
                    {
                     
                    	        newCompositeNode(grammarAccess.getSystemAccess().getComponentsComponentParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleComponent_in_ruleSystem210);
                    lv_components_6_0=ruleComponent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSystemRule());
                    	        }
                           		add(
                           			current, 
                           			"components",
                            		lv_components_6_0, 
                            		"Component");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:138:2: (otherlv_7= ',' ( (lv_components_8_0= ruleComponent ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:138:4: otherlv_7= ',' ( (lv_components_8_0= ruleComponent ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSystem223); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getSystemAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:142:1: ( (lv_components_8_0= ruleComponent ) )
                    	    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:143:1: (lv_components_8_0= ruleComponent )
                    	    {
                    	    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:143:1: (lv_components_8_0= ruleComponent )
                    	    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:144:3: lv_components_8_0= ruleComponent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSystemAccess().getComponentsComponentParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleComponent_in_ruleSystem244);
                    	    lv_components_8_0=ruleComponent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSystemRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"components",
                    	            		lv_components_8_0, 
                    	            		"Component");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSystem258); 

                        	newLeafNode(otherlv_9, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:164:3: (otherlv_10= 'ensembles' otherlv_11= '{' ( (lv_ensembles_12_0= ruleEnsemble ) ) (otherlv_13= ',' ( (lv_ensembles_14_0= ruleEnsemble ) ) )* otherlv_15= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:164:5: otherlv_10= 'ensembles' otherlv_11= '{' ( (lv_ensembles_12_0= ruleEnsemble ) ) (otherlv_13= ',' ( (lv_ensembles_14_0= ruleEnsemble ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSystem273); 

                        	newLeafNode(otherlv_10, grammarAccess.getSystemAccess().getEnsemblesKeyword_5_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSystem285); 

                        	newLeafNode(otherlv_11, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:172:1: ( (lv_ensembles_12_0= ruleEnsemble ) )
                    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:173:1: (lv_ensembles_12_0= ruleEnsemble )
                    {
                    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:173:1: (lv_ensembles_12_0= ruleEnsemble )
                    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:174:3: lv_ensembles_12_0= ruleEnsemble
                    {
                     
                    	        newCompositeNode(grammarAccess.getSystemAccess().getEnsemblesEnsembleParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEnsemble_in_ruleSystem306);
                    lv_ensembles_12_0=ruleEnsemble();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSystemRule());
                    	        }
                           		add(
                           			current, 
                           			"ensembles",
                            		lv_ensembles_12_0, 
                            		"Ensemble");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:190:2: (otherlv_13= ',' ( (lv_ensembles_14_0= ruleEnsemble ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:190:4: otherlv_13= ',' ( (lv_ensembles_14_0= ruleEnsemble ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSystem319); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getSystemAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:194:1: ( (lv_ensembles_14_0= ruleEnsemble ) )
                    	    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:195:1: (lv_ensembles_14_0= ruleEnsemble )
                    	    {
                    	    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:195:1: (lv_ensembles_14_0= ruleEnsemble )
                    	    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:196:3: lv_ensembles_14_0= ruleEnsemble
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSystemAccess().getEnsemblesEnsembleParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEnsemble_in_ruleSystem340);
                    	    lv_ensembles_14_0=ruleEnsemble();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSystemRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"ensembles",
                    	            		lv_ensembles_14_0, 
                    	            		"Ensemble");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSystem354); 

                        	newLeafNode(otherlv_15, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSystem368); 

                	newLeafNode(otherlv_16, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleEString"
    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:228:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:229:2: (iv_ruleEString= ruleEString EOF )
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:230:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString405);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString416); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:237:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:240:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:241:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:241:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:241:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString456); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:249:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString482); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleComponent"
    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:264:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:265:2: (iv_ruleComponent= ruleComponent EOF )
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:266:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComponent_in_entryRuleComponent527);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComponent537); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:273:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'process' ( (lv_process_4_0= ruleProcess ) ) (otherlv_5= 'ensembleMember' ( ( ruleEString ) ) )? (otherlv_7= 'ensembleCordinator' ( ( ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_process_4_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:276:28: ( (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'process' ( (lv_process_4_0= ruleProcess ) ) (otherlv_5= 'ensembleMember' ( ( ruleEString ) ) )? (otherlv_7= 'ensembleCordinator' ( ( ruleEString ) ) )? otherlv_9= '}' ) )
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:277:1: (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'process' ( (lv_process_4_0= ruleProcess ) ) (otherlv_5= 'ensembleMember' ( ( ruleEString ) ) )? (otherlv_7= 'ensembleCordinator' ( ( ruleEString ) ) )? otherlv_9= '}' )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:277:1: (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'process' ( (lv_process_4_0= ruleProcess ) ) (otherlv_5= 'ensembleMember' ( ( ruleEString ) ) )? (otherlv_7= 'ensembleCordinator' ( ( ruleEString ) ) )? otherlv_9= '}' )
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:277:3: otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'process' ( (lv_process_4_0= ruleProcess ) ) (otherlv_5= 'ensembleMember' ( ( ruleEString ) ) )? (otherlv_7= 'ensembleCordinator' ( ( ruleEString ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleComponent574); 

                	newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
                
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:281:1: ( (lv_name_1_0= ruleEString ) )
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:282:1: (lv_name_1_0= ruleEString )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:282:1: (lv_name_1_0= ruleEString )
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:283:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getComponentAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleComponent595);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleComponent607); 

                	newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleComponent619); 

                	newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getProcessKeyword_3());
                
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:307:1: ( (lv_process_4_0= ruleProcess ) )
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:308:1: (lv_process_4_0= ruleProcess )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:308:1: (lv_process_4_0= ruleProcess )
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:309:3: lv_process_4_0= ruleProcess
            {
             
            	        newCompositeNode(grammarAccess.getComponentAccess().getProcessProcessParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleProcess_in_ruleComponent640);
            lv_process_4_0=ruleProcess();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	        }
                   		set(
                   			current, 
                   			"process",
                    		lv_process_4_0, 
                    		"Process");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:325:2: (otherlv_5= 'ensembleMember' ( ( ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:325:4: otherlv_5= 'ensembleMember' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleComponent653); 

                        	newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getEnsembleMemberKeyword_5_0());
                        
                    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:329:1: ( ( ruleEString ) )
                    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:330:1: ( ruleEString )
                    {
                    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:330:1: ( ruleEString )
                    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:331:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getComponentRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getComponentAccess().getEnsembleMemberEnsembleCrossReference_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleComponent676);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:344:4: (otherlv_7= 'ensembleCordinator' ( ( ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:344:6: otherlv_7= 'ensembleCordinator' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleComponent691); 

                        	newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getEnsembleCordinatorKeyword_6_0());
                        
                    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:348:1: ( ( ruleEString ) )
                    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:349:1: ( ruleEString )
                    {
                    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:349:1: ( ruleEString )
                    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:350:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getComponentRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getComponentAccess().getEnsembleCordinatorEnsembleCrossReference_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleComponent714);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleComponent728); 

                	newLeafNode(otherlv_9, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleEnsemble"
    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:375:1: entryRuleEnsemble returns [EObject current=null] : iv_ruleEnsemble= ruleEnsemble EOF ;
    public final EObject entryRuleEnsemble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnsemble = null;


        try {
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:376:2: (iv_ruleEnsemble= ruleEnsemble EOF )
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:377:2: iv_ruleEnsemble= ruleEnsemble EOF
            {
             newCompositeNode(grammarAccess.getEnsembleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnsemble_in_entryRuleEnsemble764);
            iv_ruleEnsemble=ruleEnsemble();

            state._fsp--;

             current =iv_ruleEnsemble; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnsemble774); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnsemble"


    // $ANTLR start "ruleEnsemble"
    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:384:1: ruleEnsemble returns [EObject current=null] : (otherlv_0= 'Ensemble' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'coordinator' ( ( ruleEString ) ) (otherlv_5= 'members' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' ) ;
    public final EObject ruleEnsemble() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:387:28: ( (otherlv_0= 'Ensemble' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'coordinator' ( ( ruleEString ) ) (otherlv_5= 'members' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' ) )
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:388:1: (otherlv_0= 'Ensemble' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'coordinator' ( ( ruleEString ) ) (otherlv_5= 'members' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:388:1: (otherlv_0= 'Ensemble' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'coordinator' ( ( ruleEString ) ) (otherlv_5= 'members' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' )
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:388:3: otherlv_0= 'Ensemble' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'coordinator' ( ( ruleEString ) ) (otherlv_5= 'members' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEnsemble811); 

                	newLeafNode(otherlv_0, grammarAccess.getEnsembleAccess().getEnsembleKeyword_0());
                
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:392:1: ( (lv_name_1_0= ruleEString ) )
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:393:1: (lv_name_1_0= ruleEString )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:393:1: (lv_name_1_0= ruleEString )
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:394:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEnsembleAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEnsemble832);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnsembleRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEnsemble844); 

                	newLeafNode(otherlv_2, grammarAccess.getEnsembleAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEnsemble856); 

                	newLeafNode(otherlv_3, grammarAccess.getEnsembleAccess().getCoordinatorKeyword_3());
                
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:418:1: ( ( ruleEString ) )
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:419:1: ( ruleEString )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:419:1: ( ruleEString )
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:420:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEnsembleRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getEnsembleAccess().getCoordinatorComponentCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEnsemble879);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:433:2: (otherlv_5= 'members' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:433:4: otherlv_5= 'members' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleEnsemble892); 

                        	newLeafNode(otherlv_5, grammarAccess.getEnsembleAccess().getMembersKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEnsemble904); 

                        	newLeafNode(otherlv_6, grammarAccess.getEnsembleAccess().getLeftParenthesisKeyword_5_1());
                        
                    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:441:1: ( ( ruleEString ) )
                    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:442:1: ( ruleEString )
                    {
                    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:442:1: ( ruleEString )
                    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:443:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnsembleRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEnsembleAccess().getMembersComponentCrossReference_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEnsemble927);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:456:2: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:456:4: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleEnsemble940); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getEnsembleAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:460:1: ( ( ruleEString ) )
                    	    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:461:1: ( ruleEString )
                    	    {
                    	    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:461:1: ( ruleEString )
                    	    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:462:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getEnsembleRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getEnsembleAccess().getMembersComponentCrossReference_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEnsemble963);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleEnsemble977); 

                        	newLeafNode(otherlv_10, grammarAccess.getEnsembleAccess().getRightParenthesisKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEnsemble991); 

                	newLeafNode(otherlv_11, grammarAccess.getEnsembleAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnsemble"


    // $ANTLR start "entryRuleProcess"
    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:491:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:492:2: (iv_ruleProcess= ruleProcess EOF )
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:493:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProcess_in_entryRuleProcess1027);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProcess1037); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:500:1: ruleProcess returns [EObject current=null] : ( () otherlv_1= 'Process' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:503:28: ( ( () otherlv_1= 'Process' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:504:1: ( () otherlv_1= 'Process' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:504:1: ( () otherlv_1= 'Process' ( (lv_name_2_0= ruleEString ) ) )
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:504:2: () otherlv_1= 'Process' ( (lv_name_2_0= ruleEString ) )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:504:2: ()
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:505:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getProcessAccess().getProcessAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleProcess1083); 

                	newLeafNode(otherlv_1, grammarAccess.getProcessAccess().getProcessKeyword_1());
                
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:514:1: ( (lv_name_2_0= ruleEString ) )
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:515:1: (lv_name_2_0= ruleEString )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:515:1: (lv_name_2_0= ruleEString )
            // ../cz.cuni.mff.d3s.dsl.deeco/src-gen/cz/cuni/mff/d3s/dsl/deeco/parser/antlr/internal/InternalDEECoDsl.g:516:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProcess1104);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProcessRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcess"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSystem85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleSystem131 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSystem152 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSystem164 = new BitSet(new long[]{0x000000000001A000L});
        public static final BitSet FOLLOW_13_in_ruleSystem177 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSystem189 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_ruleComponent_in_ruleSystem210 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleSystem223 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_ruleComponent_in_ruleSystem244 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleSystem258 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleSystem273 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSystem285 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_ruleEnsemble_in_ruleSystem306 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleSystem319 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_ruleEnsemble_in_ruleSystem340 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleSystem354 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSystem368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString405 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent527 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComponent537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleComponent574 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleComponent595 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleComponent607 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleComponent619 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleProcess_in_ruleComponent640 = new BitSet(new long[]{0x0000000000188000L});
        public static final BitSet FOLLOW_19_in_ruleComponent653 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleComponent676 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_20_in_ruleComponent691 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleComponent714 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleComponent728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnsemble_in_entryRuleEnsemble764 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnsemble774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleEnsemble811 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEnsemble832 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEnsemble844 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleEnsemble856 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEnsemble879 = new BitSet(new long[]{0x0000000000808000L});
        public static final BitSet FOLLOW_23_in_ruleEnsemble892 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleEnsemble904 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEnsemble927 = new BitSet(new long[]{0x0000000002004000L});
        public static final BitSet FOLLOW_14_in_ruleEnsemble940 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEnsemble963 = new BitSet(new long[]{0x0000000002004000L});
        public static final BitSet FOLLOW_25_in_ruleEnsemble977 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleEnsemble991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess1027 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProcess1037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleProcess1083 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProcess1104 = new BitSet(new long[]{0x0000000000000002L});
    }


}