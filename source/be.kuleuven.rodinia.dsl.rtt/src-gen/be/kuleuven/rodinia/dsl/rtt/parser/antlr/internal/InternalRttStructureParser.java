package be.kuleuven.rodinia.dsl.rtt.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import be.kuleuven.rodinia.dsl.rtt.services.RttStructureGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRttStructureParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'OrocosPackage'", "'{'", "'taskContexts'", "','", "'}'", "'connectionPolicies'", "'activities'", "'TaskContext'", "'namespace'", "'type'", "'inputPorts'", "'outputPorts'", "'properties'", "'operations'", "'ConnectionPolicy'", "'bufferSize'", "'lockPolicy'", "'inputPort'", "'outputPort'", "'isEventPort'", "'InputPort'", "'dataType'", "'inputConnectionPolicy'", "'OutputPort'", "'outputConnectionPolicy'", "'Property'", "'description'", "'value'", "'Operation'", "'documentation'", "'returnType'", "'-'", "'Activity'", "'scheduler'", "'cpuAffinity'", "'period'", "'priority'", "'taskContext'", "'slave'", "'Slave'", "'.'", "'E'", "'e'", "'::'", "'UNSYNC'", "'LOCKED'", "'LOCK_FREE'", "'DATA'", "'BUFFER'", "'ORO_SCHED_OTHER'", "'ORO_SCHED_RT'"
    };
    public static final int RULE_ID=6;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=4;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalRttStructureParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRttStructureParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRttStructureParser.tokenNames; }
    public String getGrammarFileName() { return "../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g"; }



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



    // $ANTLR start "entryRulePackage"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:68:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:69:2: (iv_rulePackage= rulePackage EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:70:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePackage_in_entryRulePackage75);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePackage85); 

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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:77:1: rulePackage returns [EObject current=null] : ( () otherlv_1= 'OrocosPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'taskContexts' otherlv_5= '{' ( (lv_taskContexts_6_0= ruleTaskContext ) ) (otherlv_7= ',' ( (lv_taskContexts_8_0= ruleTaskContext ) ) )* otherlv_9= '}' )? (otherlv_10= 'connectionPolicies' otherlv_11= '{' ( (lv_connectionPolicies_12_0= ruleConnectionPolicy ) ) (otherlv_13= ',' ( (lv_connectionPolicies_14_0= ruleConnectionPolicy ) ) )* otherlv_15= '}' )? (otherlv_16= 'activities' ( (lv_activities_17_0= ruleIActivity ) ) )? otherlv_18= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
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
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_taskContexts_6_0 = null;

        EObject lv_taskContexts_8_0 = null;

        EObject lv_connectionPolicies_12_0 = null;

        EObject lv_connectionPolicies_14_0 = null;

        EObject lv_activities_17_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:80:28: ( ( () otherlv_1= 'OrocosPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'taskContexts' otherlv_5= '{' ( (lv_taskContexts_6_0= ruleTaskContext ) ) (otherlv_7= ',' ( (lv_taskContexts_8_0= ruleTaskContext ) ) )* otherlv_9= '}' )? (otherlv_10= 'connectionPolicies' otherlv_11= '{' ( (lv_connectionPolicies_12_0= ruleConnectionPolicy ) ) (otherlv_13= ',' ( (lv_connectionPolicies_14_0= ruleConnectionPolicy ) ) )* otherlv_15= '}' )? (otherlv_16= 'activities' ( (lv_activities_17_0= ruleIActivity ) ) )? otherlv_18= '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:81:1: ( () otherlv_1= 'OrocosPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'taskContexts' otherlv_5= '{' ( (lv_taskContexts_6_0= ruleTaskContext ) ) (otherlv_7= ',' ( (lv_taskContexts_8_0= ruleTaskContext ) ) )* otherlv_9= '}' )? (otherlv_10= 'connectionPolicies' otherlv_11= '{' ( (lv_connectionPolicies_12_0= ruleConnectionPolicy ) ) (otherlv_13= ',' ( (lv_connectionPolicies_14_0= ruleConnectionPolicy ) ) )* otherlv_15= '}' )? (otherlv_16= 'activities' ( (lv_activities_17_0= ruleIActivity ) ) )? otherlv_18= '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:81:1: ( () otherlv_1= 'OrocosPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'taskContexts' otherlv_5= '{' ( (lv_taskContexts_6_0= ruleTaskContext ) ) (otherlv_7= ',' ( (lv_taskContexts_8_0= ruleTaskContext ) ) )* otherlv_9= '}' )? (otherlv_10= 'connectionPolicies' otherlv_11= '{' ( (lv_connectionPolicies_12_0= ruleConnectionPolicy ) ) (otherlv_13= ',' ( (lv_connectionPolicies_14_0= ruleConnectionPolicy ) ) )* otherlv_15= '}' )? (otherlv_16= 'activities' ( (lv_activities_17_0= ruleIActivity ) ) )? otherlv_18= '}' )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:81:2: () otherlv_1= 'OrocosPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'taskContexts' otherlv_5= '{' ( (lv_taskContexts_6_0= ruleTaskContext ) ) (otherlv_7= ',' ( (lv_taskContexts_8_0= ruleTaskContext ) ) )* otherlv_9= '}' )? (otherlv_10= 'connectionPolicies' otherlv_11= '{' ( (lv_connectionPolicies_12_0= ruleConnectionPolicy ) ) (otherlv_13= ',' ( (lv_connectionPolicies_14_0= ruleConnectionPolicy ) ) )* otherlv_15= '}' )? (otherlv_16= 'activities' ( (lv_activities_17_0= ruleIActivity ) ) )? otherlv_18= '}'
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:81:2: ()
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPackageAccess().getOrocosPackageAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulePackage131); 

                	newLeafNode(otherlv_1, grammarAccess.getPackageAccess().getOrocosPackageKeyword_1());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:91:1: ( (lv_name_2_0= ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:92:1: (lv_name_2_0= ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:92:1: (lv_name_2_0= ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:93:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPackageAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePackage152);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePackage164); 

                	newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:113:1: (otherlv_4= 'taskContexts' otherlv_5= '{' ( (lv_taskContexts_6_0= ruleTaskContext ) ) (otherlv_7= ',' ( (lv_taskContexts_8_0= ruleTaskContext ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:113:3: otherlv_4= 'taskContexts' otherlv_5= '{' ( (lv_taskContexts_6_0= ruleTaskContext ) ) (otherlv_7= ',' ( (lv_taskContexts_8_0= ruleTaskContext ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePackage177); 

                        	newLeafNode(otherlv_4, grammarAccess.getPackageAccess().getTaskContextsKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePackage189); 

                        	newLeafNode(otherlv_5, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:121:1: ( (lv_taskContexts_6_0= ruleTaskContext ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:122:1: (lv_taskContexts_6_0= ruleTaskContext )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:122:1: (lv_taskContexts_6_0= ruleTaskContext )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:123:3: lv_taskContexts_6_0= ruleTaskContext
                    {
                     
                    	        newCompositeNode(grammarAccess.getPackageAccess().getTaskContextsTaskContextParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaskContext_in_rulePackage210);
                    lv_taskContexts_6_0=ruleTaskContext();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPackageRule());
                    	        }
                           		add(
                           			current, 
                           			"taskContexts",
                            		lv_taskContexts_6_0, 
                            		"TaskContext");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:139:2: (otherlv_7= ',' ( (lv_taskContexts_8_0= ruleTaskContext ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:139:4: otherlv_7= ',' ( (lv_taskContexts_8_0= ruleTaskContext ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePackage223); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getPackageAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:143:1: ( (lv_taskContexts_8_0= ruleTaskContext ) )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:144:1: (lv_taskContexts_8_0= ruleTaskContext )
                    	    {
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:144:1: (lv_taskContexts_8_0= ruleTaskContext )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:145:3: lv_taskContexts_8_0= ruleTaskContext
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPackageAccess().getTaskContextsTaskContextParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaskContext_in_rulePackage244);
                    	    lv_taskContexts_8_0=ruleTaskContext();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPackageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"taskContexts",
                    	            		lv_taskContexts_8_0, 
                    	            		"TaskContext");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePackage258); 

                        	newLeafNode(otherlv_9, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:165:3: (otherlv_10= 'connectionPolicies' otherlv_11= '{' ( (lv_connectionPolicies_12_0= ruleConnectionPolicy ) ) (otherlv_13= ',' ( (lv_connectionPolicies_14_0= ruleConnectionPolicy ) ) )* otherlv_15= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:165:5: otherlv_10= 'connectionPolicies' otherlv_11= '{' ( (lv_connectionPolicies_12_0= ruleConnectionPolicy ) ) (otherlv_13= ',' ( (lv_connectionPolicies_14_0= ruleConnectionPolicy ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePackage273); 

                        	newLeafNode(otherlv_10, grammarAccess.getPackageAccess().getConnectionPoliciesKeyword_5_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePackage285); 

                        	newLeafNode(otherlv_11, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:173:1: ( (lv_connectionPolicies_12_0= ruleConnectionPolicy ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:174:1: (lv_connectionPolicies_12_0= ruleConnectionPolicy )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:174:1: (lv_connectionPolicies_12_0= ruleConnectionPolicy )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:175:3: lv_connectionPolicies_12_0= ruleConnectionPolicy
                    {
                     
                    	        newCompositeNode(grammarAccess.getPackageAccess().getConnectionPoliciesConnectionPolicyParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConnectionPolicy_in_rulePackage306);
                    lv_connectionPolicies_12_0=ruleConnectionPolicy();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPackageRule());
                    	        }
                           		add(
                           			current, 
                           			"connectionPolicies",
                            		lv_connectionPolicies_12_0, 
                            		"ConnectionPolicy");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:191:2: (otherlv_13= ',' ( (lv_connectionPolicies_14_0= ruleConnectionPolicy ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:191:4: otherlv_13= ',' ( (lv_connectionPolicies_14_0= ruleConnectionPolicy ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePackage319); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getPackageAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:195:1: ( (lv_connectionPolicies_14_0= ruleConnectionPolicy ) )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:196:1: (lv_connectionPolicies_14_0= ruleConnectionPolicy )
                    	    {
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:196:1: (lv_connectionPolicies_14_0= ruleConnectionPolicy )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:197:3: lv_connectionPolicies_14_0= ruleConnectionPolicy
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPackageAccess().getConnectionPoliciesConnectionPolicyParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleConnectionPolicy_in_rulePackage340);
                    	    lv_connectionPolicies_14_0=ruleConnectionPolicy();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPackageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"connectionPolicies",
                    	            		lv_connectionPolicies_14_0, 
                    	            		"ConnectionPolicy");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePackage354); 

                        	newLeafNode(otherlv_15, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:217:3: (otherlv_16= 'activities' ( (lv_activities_17_0= ruleIActivity ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:217:5: otherlv_16= 'activities' ( (lv_activities_17_0= ruleIActivity ) )
                    {
                    otherlv_16=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePackage369); 

                        	newLeafNode(otherlv_16, grammarAccess.getPackageAccess().getActivitiesKeyword_6_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:221:1: ( (lv_activities_17_0= ruleIActivity ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:222:1: (lv_activities_17_0= ruleIActivity )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:222:1: (lv_activities_17_0= ruleIActivity )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:223:3: lv_activities_17_0= ruleIActivity
                    {
                     
                    	        newCompositeNode(grammarAccess.getPackageAccess().getActivitiesIActivityParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleIActivity_in_rulePackage390);
                    lv_activities_17_0=ruleIActivity();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPackageRule());
                    	        }
                           		set(
                           			current, 
                           			"activities",
                            		lv_activities_17_0, 
                            		"IActivity");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePackage404); 

                	newLeafNode(otherlv_18, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleTaskContext"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:251:1: entryRuleTaskContext returns [EObject current=null] : iv_ruleTaskContext= ruleTaskContext EOF ;
    public final EObject entryRuleTaskContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskContext = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:252:2: (iv_ruleTaskContext= ruleTaskContext EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:253:2: iv_ruleTaskContext= ruleTaskContext EOF
            {
             newCompositeNode(grammarAccess.getTaskContextRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTaskContext_in_entryRuleTaskContext440);
            iv_ruleTaskContext=ruleTaskContext();

            state._fsp--;

             current =iv_ruleTaskContext; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTaskContext450); 

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
    // $ANTLR end "entryRuleTaskContext"


    // $ANTLR start "ruleTaskContext"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:260:1: ruleTaskContext returns [EObject current=null] : (otherlv_0= 'TaskContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'namespace' ( (lv_namespace_4_0= ruleQualifiedNameWithDot ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleQualifiedNameWithDot ) ) (otherlv_7= 'inputPorts' otherlv_8= '{' ( (lv_inputPorts_9_0= ruleInputPort ) ) (otherlv_10= ',' ( (lv_inputPorts_11_0= ruleInputPort ) ) )* otherlv_12= '}' )? (otherlv_13= 'outputPorts' otherlv_14= '{' ( (lv_outputPorts_15_0= ruleOutputPort ) ) (otherlv_16= ',' ( (lv_outputPorts_17_0= ruleOutputPort ) ) )* otherlv_18= '}' )? (otherlv_19= 'properties' otherlv_20= '{' ( (lv_properties_21_0= ruleProperty ) ) (otherlv_22= ',' ( (lv_properties_23_0= ruleProperty ) ) )* otherlv_24= '}' )? (otherlv_25= 'operations' otherlv_26= '{' ( (lv_operations_27_0= ruleOperation ) ) (otherlv_28= ',' ( (lv_operations_29_0= ruleOperation ) ) )* otherlv_30= '}' )? otherlv_31= '}' ) ;
    public final EObject ruleTaskContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_namespace_4_0 = null;

        AntlrDatatypeRuleToken lv_type_6_0 = null;

        EObject lv_inputPorts_9_0 = null;

        EObject lv_inputPorts_11_0 = null;

        EObject lv_outputPorts_15_0 = null;

        EObject lv_outputPorts_17_0 = null;

        EObject lv_properties_21_0 = null;

        EObject lv_properties_23_0 = null;

        EObject lv_operations_27_0 = null;

        EObject lv_operations_29_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:263:28: ( (otherlv_0= 'TaskContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'namespace' ( (lv_namespace_4_0= ruleQualifiedNameWithDot ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleQualifiedNameWithDot ) ) (otherlv_7= 'inputPorts' otherlv_8= '{' ( (lv_inputPorts_9_0= ruleInputPort ) ) (otherlv_10= ',' ( (lv_inputPorts_11_0= ruleInputPort ) ) )* otherlv_12= '}' )? (otherlv_13= 'outputPorts' otherlv_14= '{' ( (lv_outputPorts_15_0= ruleOutputPort ) ) (otherlv_16= ',' ( (lv_outputPorts_17_0= ruleOutputPort ) ) )* otherlv_18= '}' )? (otherlv_19= 'properties' otherlv_20= '{' ( (lv_properties_21_0= ruleProperty ) ) (otherlv_22= ',' ( (lv_properties_23_0= ruleProperty ) ) )* otherlv_24= '}' )? (otherlv_25= 'operations' otherlv_26= '{' ( (lv_operations_27_0= ruleOperation ) ) (otherlv_28= ',' ( (lv_operations_29_0= ruleOperation ) ) )* otherlv_30= '}' )? otherlv_31= '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:264:1: (otherlv_0= 'TaskContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'namespace' ( (lv_namespace_4_0= ruleQualifiedNameWithDot ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleQualifiedNameWithDot ) ) (otherlv_7= 'inputPorts' otherlv_8= '{' ( (lv_inputPorts_9_0= ruleInputPort ) ) (otherlv_10= ',' ( (lv_inputPorts_11_0= ruleInputPort ) ) )* otherlv_12= '}' )? (otherlv_13= 'outputPorts' otherlv_14= '{' ( (lv_outputPorts_15_0= ruleOutputPort ) ) (otherlv_16= ',' ( (lv_outputPorts_17_0= ruleOutputPort ) ) )* otherlv_18= '}' )? (otherlv_19= 'properties' otherlv_20= '{' ( (lv_properties_21_0= ruleProperty ) ) (otherlv_22= ',' ( (lv_properties_23_0= ruleProperty ) ) )* otherlv_24= '}' )? (otherlv_25= 'operations' otherlv_26= '{' ( (lv_operations_27_0= ruleOperation ) ) (otherlv_28= ',' ( (lv_operations_29_0= ruleOperation ) ) )* otherlv_30= '}' )? otherlv_31= '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:264:1: (otherlv_0= 'TaskContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'namespace' ( (lv_namespace_4_0= ruleQualifiedNameWithDot ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleQualifiedNameWithDot ) ) (otherlv_7= 'inputPorts' otherlv_8= '{' ( (lv_inputPorts_9_0= ruleInputPort ) ) (otherlv_10= ',' ( (lv_inputPorts_11_0= ruleInputPort ) ) )* otherlv_12= '}' )? (otherlv_13= 'outputPorts' otherlv_14= '{' ( (lv_outputPorts_15_0= ruleOutputPort ) ) (otherlv_16= ',' ( (lv_outputPorts_17_0= ruleOutputPort ) ) )* otherlv_18= '}' )? (otherlv_19= 'properties' otherlv_20= '{' ( (lv_properties_21_0= ruleProperty ) ) (otherlv_22= ',' ( (lv_properties_23_0= ruleProperty ) ) )* otherlv_24= '}' )? (otherlv_25= 'operations' otherlv_26= '{' ( (lv_operations_27_0= ruleOperation ) ) (otherlv_28= ',' ( (lv_operations_29_0= ruleOperation ) ) )* otherlv_30= '}' )? otherlv_31= '}' )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:264:3: otherlv_0= 'TaskContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'namespace' ( (lv_namespace_4_0= ruleQualifiedNameWithDot ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleQualifiedNameWithDot ) ) (otherlv_7= 'inputPorts' otherlv_8= '{' ( (lv_inputPorts_9_0= ruleInputPort ) ) (otherlv_10= ',' ( (lv_inputPorts_11_0= ruleInputPort ) ) )* otherlv_12= '}' )? (otherlv_13= 'outputPorts' otherlv_14= '{' ( (lv_outputPorts_15_0= ruleOutputPort ) ) (otherlv_16= ',' ( (lv_outputPorts_17_0= ruleOutputPort ) ) )* otherlv_18= '}' )? (otherlv_19= 'properties' otherlv_20= '{' ( (lv_properties_21_0= ruleProperty ) ) (otherlv_22= ',' ( (lv_properties_23_0= ruleProperty ) ) )* otherlv_24= '}' )? (otherlv_25= 'operations' otherlv_26= '{' ( (lv_operations_27_0= ruleOperation ) ) (otherlv_28= ',' ( (lv_operations_29_0= ruleOperation ) ) )* otherlv_30= '}' )? otherlv_31= '}'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTaskContext487); 

                	newLeafNode(otherlv_0, grammarAccess.getTaskContextAccess().getTaskContextKeyword_0());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:268:1: ( (lv_name_1_0= ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:269:1: (lv_name_1_0= ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:269:1: (lv_name_1_0= ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:270:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTaskContextAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTaskContext508);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTaskContextRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTaskContext520); 

                	newLeafNode(otherlv_2, grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTaskContext532); 

                	newLeafNode(otherlv_3, grammarAccess.getTaskContextAccess().getNamespaceKeyword_3());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:294:1: ( (lv_namespace_4_0= ruleQualifiedNameWithDot ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:295:1: (lv_namespace_4_0= ruleQualifiedNameWithDot )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:295:1: (lv_namespace_4_0= ruleQualifiedNameWithDot )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:296:3: lv_namespace_4_0= ruleQualifiedNameWithDot
            {
             
            	        newCompositeNode(grammarAccess.getTaskContextAccess().getNamespaceQualifiedNameWithDotParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_ruleTaskContext553);
            lv_namespace_4_0=ruleQualifiedNameWithDot();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTaskContextRule());
            	        }
                   		set(
                   			current, 
                   			"namespace",
                    		lv_namespace_4_0, 
                    		"QualifiedNameWithDot");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleTaskContext565); 

                	newLeafNode(otherlv_5, grammarAccess.getTaskContextAccess().getTypeKeyword_5());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:316:1: ( (lv_type_6_0= ruleQualifiedNameWithDot ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:317:1: (lv_type_6_0= ruleQualifiedNameWithDot )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:317:1: (lv_type_6_0= ruleQualifiedNameWithDot )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:318:3: lv_type_6_0= ruleQualifiedNameWithDot
            {
             
            	        newCompositeNode(grammarAccess.getTaskContextAccess().getTypeQualifiedNameWithDotParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_ruleTaskContext586);
            lv_type_6_0=ruleQualifiedNameWithDot();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTaskContextRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_6_0, 
                    		"QualifiedNameWithDot");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:334:2: (otherlv_7= 'inputPorts' otherlv_8= '{' ( (lv_inputPorts_9_0= ruleInputPort ) ) (otherlv_10= ',' ( (lv_inputPorts_11_0= ruleInputPort ) ) )* otherlv_12= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:334:4: otherlv_7= 'inputPorts' otherlv_8= '{' ( (lv_inputPorts_9_0= ruleInputPort ) ) (otherlv_10= ',' ( (lv_inputPorts_11_0= ruleInputPort ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleTaskContext599); 

                        	newLeafNode(otherlv_7, grammarAccess.getTaskContextAccess().getInputPortsKeyword_7_0());
                        
                    otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTaskContext611); 

                        	newLeafNode(otherlv_8, grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:342:1: ( (lv_inputPorts_9_0= ruleInputPort ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:343:1: (lv_inputPorts_9_0= ruleInputPort )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:343:1: (lv_inputPorts_9_0= ruleInputPort )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:344:3: lv_inputPorts_9_0= ruleInputPort
                    {
                     
                    	        newCompositeNode(grammarAccess.getTaskContextAccess().getInputPortsInputPortParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInputPort_in_ruleTaskContext632);
                    lv_inputPorts_9_0=ruleInputPort();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTaskContextRule());
                    	        }
                           		add(
                           			current, 
                           			"inputPorts",
                            		lv_inputPorts_9_0, 
                            		"InputPort");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:360:2: (otherlv_10= ',' ( (lv_inputPorts_11_0= ruleInputPort ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:360:4: otherlv_10= ',' ( (lv_inputPorts_11_0= ruleInputPort ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTaskContext645); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getTaskContextAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:364:1: ( (lv_inputPorts_11_0= ruleInputPort ) )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:365:1: (lv_inputPorts_11_0= ruleInputPort )
                    	    {
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:365:1: (lv_inputPorts_11_0= ruleInputPort )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:366:3: lv_inputPorts_11_0= ruleInputPort
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTaskContextAccess().getInputPortsInputPortParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInputPort_in_ruleTaskContext666);
                    	    lv_inputPorts_11_0=ruleInputPort();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTaskContextRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"inputPorts",
                    	            		lv_inputPorts_11_0, 
                    	            		"InputPort");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTaskContext680); 

                        	newLeafNode(otherlv_12, grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:386:3: (otherlv_13= 'outputPorts' otherlv_14= '{' ( (lv_outputPorts_15_0= ruleOutputPort ) ) (otherlv_16= ',' ( (lv_outputPorts_17_0= ruleOutputPort ) ) )* otherlv_18= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:386:5: otherlv_13= 'outputPorts' otherlv_14= '{' ( (lv_outputPorts_15_0= ruleOutputPort ) ) (otherlv_16= ',' ( (lv_outputPorts_17_0= ruleOutputPort ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTaskContext695); 

                        	newLeafNode(otherlv_13, grammarAccess.getTaskContextAccess().getOutputPortsKeyword_8_0());
                        
                    otherlv_14=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTaskContext707); 

                        	newLeafNode(otherlv_14, grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:394:1: ( (lv_outputPorts_15_0= ruleOutputPort ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:395:1: (lv_outputPorts_15_0= ruleOutputPort )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:395:1: (lv_outputPorts_15_0= ruleOutputPort )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:396:3: lv_outputPorts_15_0= ruleOutputPort
                    {
                     
                    	        newCompositeNode(grammarAccess.getTaskContextAccess().getOutputPortsOutputPortParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOutputPort_in_ruleTaskContext728);
                    lv_outputPorts_15_0=ruleOutputPort();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTaskContextRule());
                    	        }
                           		add(
                           			current, 
                           			"outputPorts",
                            		lv_outputPorts_15_0, 
                            		"OutputPort");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:412:2: (otherlv_16= ',' ( (lv_outputPorts_17_0= ruleOutputPort ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:412:4: otherlv_16= ',' ( (lv_outputPorts_17_0= ruleOutputPort ) )
                    	    {
                    	    otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTaskContext741); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getTaskContextAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:416:1: ( (lv_outputPorts_17_0= ruleOutputPort ) )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:417:1: (lv_outputPorts_17_0= ruleOutputPort )
                    	    {
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:417:1: (lv_outputPorts_17_0= ruleOutputPort )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:418:3: lv_outputPorts_17_0= ruleOutputPort
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTaskContextAccess().getOutputPortsOutputPortParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleOutputPort_in_ruleTaskContext762);
                    	    lv_outputPorts_17_0=ruleOutputPort();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTaskContextRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"outputPorts",
                    	            		lv_outputPorts_17_0, 
                    	            		"OutputPort");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTaskContext776); 

                        	newLeafNode(otherlv_18, grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:438:3: (otherlv_19= 'properties' otherlv_20= '{' ( (lv_properties_21_0= ruleProperty ) ) (otherlv_22= ',' ( (lv_properties_23_0= ruleProperty ) ) )* otherlv_24= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:438:5: otherlv_19= 'properties' otherlv_20= '{' ( (lv_properties_21_0= ruleProperty ) ) (otherlv_22= ',' ( (lv_properties_23_0= ruleProperty ) ) )* otherlv_24= '}'
                    {
                    otherlv_19=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTaskContext791); 

                        	newLeafNode(otherlv_19, grammarAccess.getTaskContextAccess().getPropertiesKeyword_9_0());
                        
                    otherlv_20=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTaskContext803); 

                        	newLeafNode(otherlv_20, grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:446:1: ( (lv_properties_21_0= ruleProperty ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:447:1: (lv_properties_21_0= ruleProperty )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:447:1: (lv_properties_21_0= ruleProperty )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:448:3: lv_properties_21_0= ruleProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getTaskContextAccess().getPropertiesPropertyParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleProperty_in_ruleTaskContext824);
                    lv_properties_21_0=ruleProperty();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTaskContextRule());
                    	        }
                           		add(
                           			current, 
                           			"properties",
                            		lv_properties_21_0, 
                            		"Property");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:464:2: (otherlv_22= ',' ( (lv_properties_23_0= ruleProperty ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==14) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:464:4: otherlv_22= ',' ( (lv_properties_23_0= ruleProperty ) )
                    	    {
                    	    otherlv_22=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTaskContext837); 

                    	        	newLeafNode(otherlv_22, grammarAccess.getTaskContextAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:468:1: ( (lv_properties_23_0= ruleProperty ) )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:469:1: (lv_properties_23_0= ruleProperty )
                    	    {
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:469:1: (lv_properties_23_0= ruleProperty )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:470:3: lv_properties_23_0= ruleProperty
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTaskContextAccess().getPropertiesPropertyParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleProperty_in_ruleTaskContext858);
                    	    lv_properties_23_0=ruleProperty();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTaskContextRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"properties",
                    	            		lv_properties_23_0, 
                    	            		"Property");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTaskContext872); 

                        	newLeafNode(otherlv_24, grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:490:3: (otherlv_25= 'operations' otherlv_26= '{' ( (lv_operations_27_0= ruleOperation ) ) (otherlv_28= ',' ( (lv_operations_29_0= ruleOperation ) ) )* otherlv_30= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:490:5: otherlv_25= 'operations' otherlv_26= '{' ( (lv_operations_27_0= ruleOperation ) ) (otherlv_28= ',' ( (lv_operations_29_0= ruleOperation ) ) )* otherlv_30= '}'
                    {
                    otherlv_25=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleTaskContext887); 

                        	newLeafNode(otherlv_25, grammarAccess.getTaskContextAccess().getOperationsKeyword_10_0());
                        
                    otherlv_26=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTaskContext899); 

                        	newLeafNode(otherlv_26, grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:498:1: ( (lv_operations_27_0= ruleOperation ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:499:1: (lv_operations_27_0= ruleOperation )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:499:1: (lv_operations_27_0= ruleOperation )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:500:3: lv_operations_27_0= ruleOperation
                    {
                     
                    	        newCompositeNode(grammarAccess.getTaskContextAccess().getOperationsOperationParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleTaskContext920);
                    lv_operations_27_0=ruleOperation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTaskContextRule());
                    	        }
                           		add(
                           			current, 
                           			"operations",
                            		lv_operations_27_0, 
                            		"Operation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:516:2: (otherlv_28= ',' ( (lv_operations_29_0= ruleOperation ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:516:4: otherlv_28= ',' ( (lv_operations_29_0= ruleOperation ) )
                    	    {
                    	    otherlv_28=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTaskContext933); 

                    	        	newLeafNode(otherlv_28, grammarAccess.getTaskContextAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:520:1: ( (lv_operations_29_0= ruleOperation ) )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:521:1: (lv_operations_29_0= ruleOperation )
                    	    {
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:521:1: (lv_operations_29_0= ruleOperation )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:522:3: lv_operations_29_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTaskContextAccess().getOperationsOperationParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleTaskContext954);
                    	    lv_operations_29_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTaskContextRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"operations",
                    	            		lv_operations_29_0, 
                    	            		"Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_30=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTaskContext968); 

                        	newLeafNode(otherlv_30, grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            otherlv_31=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTaskContext982); 

                	newLeafNode(otherlv_31, grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_11());
                

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
    // $ANTLR end "ruleTaskContext"


    // $ANTLR start "entryRuleConnectionPolicy"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:554:1: entryRuleConnectionPolicy returns [EObject current=null] : iv_ruleConnectionPolicy= ruleConnectionPolicy EOF ;
    public final EObject entryRuleConnectionPolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectionPolicy = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:555:2: (iv_ruleConnectionPolicy= ruleConnectionPolicy EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:556:2: iv_ruleConnectionPolicy= ruleConnectionPolicy EOF
            {
             newCompositeNode(grammarAccess.getConnectionPolicyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConnectionPolicy_in_entryRuleConnectionPolicy1018);
            iv_ruleConnectionPolicy=ruleConnectionPolicy();

            state._fsp--;

             current =iv_ruleConnectionPolicy; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConnectionPolicy1028); 

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
    // $ANTLR end "entryRuleConnectionPolicy"


    // $ANTLR start "ruleConnectionPolicy"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:563:1: ruleConnectionPolicy returns [EObject current=null] : (otherlv_0= 'ConnectionPolicy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'bufferSize' ( (lv_bufferSize_4_0= ruleEShort ) ) )? (otherlv_5= 'lockPolicy' ( (lv_lockPolicy_6_0= ruleConnectionPolicyLockPolicy ) ) )? (otherlv_7= 'type' ( (lv_type_8_0= ruleConnectionPolicyType ) ) )? otherlv_9= 'inputPort' ( ( ruleEString ) ) otherlv_11= 'outputPort' ( ( ruleEString ) ) otherlv_13= '}' ) ;
    public final EObject ruleConnectionPolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_bufferSize_4_0 = null;

        Enumerator lv_lockPolicy_6_0 = null;

        Enumerator lv_type_8_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:566:28: ( (otherlv_0= 'ConnectionPolicy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'bufferSize' ( (lv_bufferSize_4_0= ruleEShort ) ) )? (otherlv_5= 'lockPolicy' ( (lv_lockPolicy_6_0= ruleConnectionPolicyLockPolicy ) ) )? (otherlv_7= 'type' ( (lv_type_8_0= ruleConnectionPolicyType ) ) )? otherlv_9= 'inputPort' ( ( ruleEString ) ) otherlv_11= 'outputPort' ( ( ruleEString ) ) otherlv_13= '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:567:1: (otherlv_0= 'ConnectionPolicy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'bufferSize' ( (lv_bufferSize_4_0= ruleEShort ) ) )? (otherlv_5= 'lockPolicy' ( (lv_lockPolicy_6_0= ruleConnectionPolicyLockPolicy ) ) )? (otherlv_7= 'type' ( (lv_type_8_0= ruleConnectionPolicyType ) ) )? otherlv_9= 'inputPort' ( ( ruleEString ) ) otherlv_11= 'outputPort' ( ( ruleEString ) ) otherlv_13= '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:567:1: (otherlv_0= 'ConnectionPolicy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'bufferSize' ( (lv_bufferSize_4_0= ruleEShort ) ) )? (otherlv_5= 'lockPolicy' ( (lv_lockPolicy_6_0= ruleConnectionPolicyLockPolicy ) ) )? (otherlv_7= 'type' ( (lv_type_8_0= ruleConnectionPolicyType ) ) )? otherlv_9= 'inputPort' ( ( ruleEString ) ) otherlv_11= 'outputPort' ( ( ruleEString ) ) otherlv_13= '}' )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:567:3: otherlv_0= 'ConnectionPolicy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'bufferSize' ( (lv_bufferSize_4_0= ruleEShort ) ) )? (otherlv_5= 'lockPolicy' ( (lv_lockPolicy_6_0= ruleConnectionPolicyLockPolicy ) ) )? (otherlv_7= 'type' ( (lv_type_8_0= ruleConnectionPolicyType ) ) )? otherlv_9= 'inputPort' ( ( ruleEString ) ) otherlv_11= 'outputPort' ( ( ruleEString ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleConnectionPolicy1065); 

                	newLeafNode(otherlv_0, grammarAccess.getConnectionPolicyAccess().getConnectionPolicyKeyword_0());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:571:1: ( (lv_name_1_0= ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:572:1: (lv_name_1_0= ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:572:1: (lv_name_1_0= ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:573:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getConnectionPolicyAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConnectionPolicy1086);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConnectionPolicyRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleConnectionPolicy1098); 

                	newLeafNode(otherlv_2, grammarAccess.getConnectionPolicyAccess().getLeftCurlyBracketKeyword_2());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:593:1: (otherlv_3= 'bufferSize' ( (lv_bufferSize_4_0= ruleEShort ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:593:3: otherlv_3= 'bufferSize' ( (lv_bufferSize_4_0= ruleEShort ) )
                    {
                    otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleConnectionPolicy1111); 

                        	newLeafNode(otherlv_3, grammarAccess.getConnectionPolicyAccess().getBufferSizeKeyword_3_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:597:1: ( (lv_bufferSize_4_0= ruleEShort ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:598:1: (lv_bufferSize_4_0= ruleEShort )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:598:1: (lv_bufferSize_4_0= ruleEShort )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:599:3: lv_bufferSize_4_0= ruleEShort
                    {
                     
                    	        newCompositeNode(grammarAccess.getConnectionPolicyAccess().getBufferSizeEShortParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEShort_in_ruleConnectionPolicy1132);
                    lv_bufferSize_4_0=ruleEShort();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConnectionPolicyRule());
                    	        }
                           		set(
                           			current, 
                           			"bufferSize",
                            		lv_bufferSize_4_0, 
                            		"EShort");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:615:4: (otherlv_5= 'lockPolicy' ( (lv_lockPolicy_6_0= ruleConnectionPolicyLockPolicy ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:615:6: otherlv_5= 'lockPolicy' ( (lv_lockPolicy_6_0= ruleConnectionPolicyLockPolicy ) )
                    {
                    otherlv_5=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleConnectionPolicy1147); 

                        	newLeafNode(otherlv_5, grammarAccess.getConnectionPolicyAccess().getLockPolicyKeyword_4_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:619:1: ( (lv_lockPolicy_6_0= ruleConnectionPolicyLockPolicy ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:620:1: (lv_lockPolicy_6_0= ruleConnectionPolicyLockPolicy )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:620:1: (lv_lockPolicy_6_0= ruleConnectionPolicyLockPolicy )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:621:3: lv_lockPolicy_6_0= ruleConnectionPolicyLockPolicy
                    {
                     
                    	        newCompositeNode(grammarAccess.getConnectionPolicyAccess().getLockPolicyConnectionPolicyLockPolicyEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConnectionPolicyLockPolicy_in_ruleConnectionPolicy1168);
                    lv_lockPolicy_6_0=ruleConnectionPolicyLockPolicy();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConnectionPolicyRule());
                    	        }
                           		set(
                           			current, 
                           			"lockPolicy",
                            		lv_lockPolicy_6_0, 
                            		"ConnectionPolicyLockPolicy");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:637:4: (otherlv_7= 'type' ( (lv_type_8_0= ruleConnectionPolicyType ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:637:6: otherlv_7= 'type' ( (lv_type_8_0= ruleConnectionPolicyType ) )
                    {
                    otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleConnectionPolicy1183); 

                        	newLeafNode(otherlv_7, grammarAccess.getConnectionPolicyAccess().getTypeKeyword_5_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:641:1: ( (lv_type_8_0= ruleConnectionPolicyType ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:642:1: (lv_type_8_0= ruleConnectionPolicyType )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:642:1: (lv_type_8_0= ruleConnectionPolicyType )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:643:3: lv_type_8_0= ruleConnectionPolicyType
                    {
                     
                    	        newCompositeNode(grammarAccess.getConnectionPolicyAccess().getTypeConnectionPolicyTypeEnumRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConnectionPolicyType_in_ruleConnectionPolicy1204);
                    lv_type_8_0=ruleConnectionPolicyType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConnectionPolicyRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_8_0, 
                            		"ConnectionPolicyType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleConnectionPolicy1218); 

                	newLeafNode(otherlv_9, grammarAccess.getConnectionPolicyAccess().getInputPortKeyword_6());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:663:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:664:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:664:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:665:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConnectionPolicyRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getConnectionPolicyAccess().getInputPortInputPortCrossReference_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConnectionPolicy1241);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_11=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleConnectionPolicy1253); 

                	newLeafNode(otherlv_11, grammarAccess.getConnectionPolicyAccess().getOutputPortKeyword_8());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:682:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:683:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:683:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:684:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConnectionPolicyRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getConnectionPolicyAccess().getOutputPortOutputPortCrossReference_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConnectionPolicy1276);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleConnectionPolicy1288); 

                	newLeafNode(otherlv_13, grammarAccess.getConnectionPolicyAccess().getRightCurlyBracketKeyword_10());
                

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
    // $ANTLR end "ruleConnectionPolicy"


    // $ANTLR start "entryRuleInputPort"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:709:1: entryRuleInputPort returns [EObject current=null] : iv_ruleInputPort= ruleInputPort EOF ;
    public final EObject entryRuleInputPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputPort = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:710:2: (iv_ruleInputPort= ruleInputPort EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:711:2: iv_ruleInputPort= ruleInputPort EOF
            {
             newCompositeNode(grammarAccess.getInputPortRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputPort_in_entryRuleInputPort1324);
            iv_ruleInputPort=ruleInputPort();

            state._fsp--;

             current =iv_ruleInputPort; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputPort1334); 

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
    // $ANTLR end "entryRuleInputPort"


    // $ANTLR start "ruleInputPort"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:718:1: ruleInputPort returns [EObject current=null] : ( ( (lv_isEventPort_0_0= 'isEventPort' ) ) otherlv_1= 'InputPort' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )? (otherlv_6= 'inputConnectionPolicy' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleInputPort() throws RecognitionException {
        EObject current = null;

        Token lv_isEventPort_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:721:28: ( ( ( (lv_isEventPort_0_0= 'isEventPort' ) ) otherlv_1= 'InputPort' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )? (otherlv_6= 'inputConnectionPolicy' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:722:1: ( ( (lv_isEventPort_0_0= 'isEventPort' ) ) otherlv_1= 'InputPort' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )? (otherlv_6= 'inputConnectionPolicy' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:722:1: ( ( (lv_isEventPort_0_0= 'isEventPort' ) ) otherlv_1= 'InputPort' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )? (otherlv_6= 'inputConnectionPolicy' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:722:2: ( (lv_isEventPort_0_0= 'isEventPort' ) ) otherlv_1= 'InputPort' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )? (otherlv_6= 'inputConnectionPolicy' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:722:2: ( (lv_isEventPort_0_0= 'isEventPort' ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:723:1: (lv_isEventPort_0_0= 'isEventPort' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:723:1: (lv_isEventPort_0_0= 'isEventPort' )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:724:3: lv_isEventPort_0_0= 'isEventPort'
            {
            lv_isEventPort_0_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleInputPort1377); 

                    newLeafNode(lv_isEventPort_0_0, grammarAccess.getInputPortAccess().getIsEventPortIsEventPortKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInputPortRule());
            	        }
                   		setWithLastConsumed(current, "isEventPort", true, "isEventPort");
            	    

            }


            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleInputPort1402); 

                	newLeafNode(otherlv_1, grammarAccess.getInputPortAccess().getInputPortKeyword_1());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:741:1: ( (lv_name_2_0= ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:742:1: (lv_name_2_0= ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:742:1: (lv_name_2_0= ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:743:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputPortAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputPort1423);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInputPortRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleInputPort1435); 

                	newLeafNode(otherlv_3, grammarAccess.getInputPortAccess().getLeftCurlyBracketKeyword_3());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:763:1: (otherlv_4= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:763:3: otherlv_4= 'dataType' ( ( ruleQualifiedNameWithDot ) )
                    {
                    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleInputPort1448); 

                        	newLeafNode(otherlv_4, grammarAccess.getInputPortAccess().getDataTypeKeyword_4_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:767:1: ( ( ruleQualifiedNameWithDot ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:768:1: ( ruleQualifiedNameWithDot )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:768:1: ( ruleQualifiedNameWithDot )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:769:3: ruleQualifiedNameWithDot
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputPortRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getInputPortAccess().getDataTypeDataTypeCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_ruleInputPort1471);
                    ruleQualifiedNameWithDot();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:782:4: (otherlv_6= 'inputConnectionPolicy' ( ( ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:782:6: otherlv_6= 'inputConnectionPolicy' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleInputPort1486); 

                        	newLeafNode(otherlv_6, grammarAccess.getInputPortAccess().getInputConnectionPolicyKeyword_5_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:786:1: ( ( ruleEString ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:787:1: ( ruleEString )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:787:1: ( ruleEString )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:788:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputPortRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getInputPortAccess().getInputConnectionPolicyConnectionPolicyCrossReference_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputPort1509);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInputPort1523); 

                	newLeafNode(otherlv_8, grammarAccess.getInputPortAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleInputPort"


    // $ANTLR start "entryRuleOutputPort"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:813:1: entryRuleOutputPort returns [EObject current=null] : iv_ruleOutputPort= ruleOutputPort EOF ;
    public final EObject entryRuleOutputPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputPort = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:814:2: (iv_ruleOutputPort= ruleOutputPort EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:815:2: iv_ruleOutputPort= ruleOutputPort EOF
            {
             newCompositeNode(grammarAccess.getOutputPortRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOutputPort_in_entryRuleOutputPort1559);
            iv_ruleOutputPort=ruleOutputPort();

            state._fsp--;

             current =iv_ruleOutputPort; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOutputPort1569); 

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
    // $ANTLR end "entryRuleOutputPort"


    // $ANTLR start "ruleOutputPort"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:822:1: ruleOutputPort returns [EObject current=null] : (otherlv_0= 'OutputPort' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )? (otherlv_5= 'outputConnectionPolicy' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleOutputPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:825:28: ( (otherlv_0= 'OutputPort' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )? (otherlv_5= 'outputConnectionPolicy' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:826:1: (otherlv_0= 'OutputPort' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )? (otherlv_5= 'outputConnectionPolicy' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:826:1: (otherlv_0= 'OutputPort' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )? (otherlv_5= 'outputConnectionPolicy' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:826:3: otherlv_0= 'OutputPort' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )? (otherlv_5= 'outputConnectionPolicy' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleOutputPort1606); 

                	newLeafNode(otherlv_0, grammarAccess.getOutputPortAccess().getOutputPortKeyword_0());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:830:1: ( (lv_name_1_0= ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:831:1: (lv_name_1_0= ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:831:1: (lv_name_1_0= ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:832:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOutputPortAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOutputPort1627);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOutputPortRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOutputPort1639); 

                	newLeafNode(otherlv_2, grammarAccess.getOutputPortAccess().getLeftCurlyBracketKeyword_2());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:852:1: (otherlv_3= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:852:3: otherlv_3= 'dataType' ( ( ruleQualifiedNameWithDot ) )
                    {
                    otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleOutputPort1652); 

                        	newLeafNode(otherlv_3, grammarAccess.getOutputPortAccess().getDataTypeKeyword_3_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:856:1: ( ( ruleQualifiedNameWithDot ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:857:1: ( ruleQualifiedNameWithDot )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:857:1: ( ruleQualifiedNameWithDot )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:858:3: ruleQualifiedNameWithDot
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getOutputPortRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getOutputPortAccess().getDataTypeDataTypeCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_ruleOutputPort1675);
                    ruleQualifiedNameWithDot();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:871:4: (otherlv_5= 'outputConnectionPolicy' ( ( ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:871:6: otherlv_5= 'outputConnectionPolicy' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleOutputPort1690); 

                        	newLeafNode(otherlv_5, grammarAccess.getOutputPortAccess().getOutputConnectionPolicyKeyword_4_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:875:1: ( ( ruleEString ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:876:1: ( ruleEString )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:876:1: ( ruleEString )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:877:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getOutputPortRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getOutputPortAccess().getOutputConnectionPolicyConnectionPolicyCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOutputPort1713);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOutputPort1727); 

                	newLeafNode(otherlv_7, grammarAccess.getOutputPortAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleOutputPort"


    // $ANTLR start "entryRuleProperty"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:902:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:903:2: (iv_ruleProperty= ruleProperty EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:904:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_entryRuleProperty1763);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProperty1773); 

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:911:1: ruleProperty returns [EObject current=null] : ( () otherlv_1= 'Property' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= ruleEString ) ) )? (otherlv_8= 'type' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        AntlrDatatypeRuleToken lv_value_7_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:914:28: ( ( () otherlv_1= 'Property' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= ruleEString ) ) )? (otherlv_8= 'type' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_10= '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:915:1: ( () otherlv_1= 'Property' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= ruleEString ) ) )? (otherlv_8= 'type' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_10= '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:915:1: ( () otherlv_1= 'Property' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= ruleEString ) ) )? (otherlv_8= 'type' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_10= '}' )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:915:2: () otherlv_1= 'Property' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= ruleEString ) ) )? (otherlv_8= 'type' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_10= '}'
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:915:2: ()
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:916:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPropertyAccess().getPropertyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleProperty1819); 

                	newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getPropertyKeyword_1());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:925:1: ( (lv_name_2_0= ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:926:1: (lv_name_2_0= ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:926:1: (lv_name_2_0= ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:927:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProperty1840);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleProperty1852); 

                	newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_3());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:947:1: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:947:3: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleProperty1865); 

                        	newLeafNode(otherlv_4, grammarAccess.getPropertyAccess().getDescriptionKeyword_4_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:951:1: ( (lv_description_5_0= ruleEString ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:952:1: (lv_description_5_0= ruleEString )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:952:1: (lv_description_5_0= ruleEString )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:953:3: lv_description_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProperty1886);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:969:4: (otherlv_6= 'value' ( (lv_value_7_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:969:6: otherlv_6= 'value' ( (lv_value_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleProperty1901); 

                        	newLeafNode(otherlv_6, grammarAccess.getPropertyAccess().getValueKeyword_5_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:973:1: ( (lv_value_7_0= ruleEString ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:974:1: (lv_value_7_0= ruleEString )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:974:1: (lv_value_7_0= ruleEString )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:975:3: lv_value_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyAccess().getValueEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProperty1922);
                    lv_value_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:991:4: (otherlv_8= 'type' ( ( ruleQualifiedNameWithDot ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==20) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:991:6: otherlv_8= 'type' ( ( ruleQualifiedNameWithDot ) )
                    {
                    otherlv_8=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleProperty1937); 

                        	newLeafNode(otherlv_8, grammarAccess.getPropertyAccess().getTypeKeyword_6_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:995:1: ( ( ruleQualifiedNameWithDot ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:996:1: ( ruleQualifiedNameWithDot )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:996:1: ( ruleQualifiedNameWithDot )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:997:3: ruleQualifiedNameWithDot
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPropertyRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getPropertyAccess().getTypeDataTypeCrossReference_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_ruleProperty1960);
                    ruleQualifiedNameWithDot();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleProperty1974); 

                	newLeafNode(otherlv_10, grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleOperation"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1022:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1023:2: (iv_ruleOperation= ruleOperation EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1024:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_entryRuleOperation2010);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperation2020); 

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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1031:1: ruleOperation returns [EObject current=null] : ( () otherlv_1= 'Operation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'documentation' ( (lv_documentation_5_0= ruleEString ) ) )? (otherlv_6= 'returnType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_documentation_5_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1034:28: ( ( () otherlv_1= 'Operation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'documentation' ( (lv_documentation_5_0= ruleEString ) ) )? (otherlv_6= 'returnType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_8= '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1035:1: ( () otherlv_1= 'Operation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'documentation' ( (lv_documentation_5_0= ruleEString ) ) )? (otherlv_6= 'returnType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_8= '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1035:1: ( () otherlv_1= 'Operation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'documentation' ( (lv_documentation_5_0= ruleEString ) ) )? (otherlv_6= 'returnType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_8= '}' )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1035:2: () otherlv_1= 'Operation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'documentation' ( (lv_documentation_5_0= ruleEString ) ) )? (otherlv_6= 'returnType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_8= '}'
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1035:2: ()
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1036:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOperationAccess().getOperationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleOperation2066); 

                	newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getOperationKeyword_1());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1045:1: ( (lv_name_2_0= ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1046:1: (lv_name_2_0= ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1046:1: (lv_name_2_0= ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1047:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOperationAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOperation2087);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOperationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOperation2099); 

                	newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_3());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1067:1: (otherlv_4= 'documentation' ( (lv_documentation_5_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1067:3: otherlv_4= 'documentation' ( (lv_documentation_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleOperation2112); 

                        	newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getDocumentationKeyword_4_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1071:1: ( (lv_documentation_5_0= ruleEString ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1072:1: (lv_documentation_5_0= ruleEString )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1072:1: (lv_documentation_5_0= ruleEString )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1073:3: lv_documentation_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOperationAccess().getDocumentationEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOperation2133);
                    lv_documentation_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOperationRule());
                    	        }
                           		set(
                           			current, 
                           			"documentation",
                            		lv_documentation_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1089:4: (otherlv_6= 'returnType' ( ( ruleQualifiedNameWithDot ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==41) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1089:6: otherlv_6= 'returnType' ( ( ruleQualifiedNameWithDot ) )
                    {
                    otherlv_6=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleOperation2148); 

                        	newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getReturnTypeKeyword_5_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1093:1: ( ( ruleQualifiedNameWithDot ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1094:1: ( ruleQualifiedNameWithDot )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1094:1: ( ruleQualifiedNameWithDot )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1095:3: ruleQualifiedNameWithDot
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getOperationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getOperationAccess().getReturnTypeDataTypeCrossReference_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_ruleOperation2171);
                    ruleQualifiedNameWithDot();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOperation2185); 

                	newLeafNode(otherlv_8, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleEShort"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1120:1: entryRuleEShort returns [String current=null] : iv_ruleEShort= ruleEShort EOF ;
    public final String entryRuleEShort() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEShort = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1121:2: (iv_ruleEShort= ruleEShort EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1122:2: iv_ruleEShort= ruleEShort EOF
            {
             newCompositeNode(grammarAccess.getEShortRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEShort_in_entryRuleEShort2222);
            iv_ruleEShort=ruleEShort();

            state._fsp--;

             current =iv_ruleEShort.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEShort2233); 

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
    // $ANTLR end "entryRuleEShort"


    // $ANTLR start "ruleEShort"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1129:1: ruleEShort returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEShort() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1132:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1133:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1133:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1133:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1133:2: (kw= '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==42) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1134:2: kw= '-'
                    {
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleEShort2272); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEShortAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEShort2289); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEShortAccess().getINTTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleEShort"


    // $ANTLR start "entryRuleIActivity"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1154:1: entryRuleIActivity returns [EObject current=null] : iv_ruleIActivity= ruleIActivity EOF ;
    public final EObject entryRuleIActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIActivity = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1155:2: (iv_ruleIActivity= ruleIActivity EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1156:2: iv_ruleIActivity= ruleIActivity EOF
            {
             newCompositeNode(grammarAccess.getIActivityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIActivity_in_entryRuleIActivity2334);
            iv_ruleIActivity=ruleIActivity();

            state._fsp--;

             current =iv_ruleIActivity; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIActivity2344); 

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
    // $ANTLR end "entryRuleIActivity"


    // $ANTLR start "ruleIActivity"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1163:1: ruleIActivity returns [EObject current=null] : (this_Activity_0= ruleActivity | this_Slave_1= ruleSlave ) ;
    public final EObject ruleIActivity() throws RecognitionException {
        EObject current = null;

        EObject this_Activity_0 = null;

        EObject this_Slave_1 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1166:28: ( (this_Activity_0= ruleActivity | this_Slave_1= ruleSlave ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1167:1: (this_Activity_0= ruleActivity | this_Slave_1= ruleSlave )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1167:1: (this_Activity_0= ruleActivity | this_Slave_1= ruleSlave )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==43) ) {
                alt27=1;
            }
            else if ( (LA27_0==50) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1168:5: this_Activity_0= ruleActivity
                    {
                     
                            newCompositeNode(grammarAccess.getIActivityAccess().getActivityParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleActivity_in_ruleIActivity2391);
                    this_Activity_0=ruleActivity();

                    state._fsp--;

                     
                            current = this_Activity_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1178:5: this_Slave_1= ruleSlave
                    {
                     
                            newCompositeNode(grammarAccess.getIActivityAccess().getSlaveParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSlave_in_ruleIActivity2418);
                    this_Slave_1=ruleSlave();

                    state._fsp--;

                     
                            current = this_Slave_1; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleIActivity"


    // $ANTLR start "entryRuleActivity"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1194:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1195:2: (iv_ruleActivity= ruleActivity EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1196:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleActivity_in_entryRuleActivity2453);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleActivity2463); 

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
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1203:1: ruleActivity returns [EObject current=null] : (otherlv_0= 'Activity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scheduler' ( (lv_scheduler_4_0= ruleScheduler ) ) otherlv_5= 'cpuAffinity' ( (lv_cpuAffinity_6_0= ruleEString ) ) otherlv_7= 'period' ( (lv_period_8_0= ruleEFloat ) ) otherlv_9= 'priority' ( (lv_priority_10_0= ruleEInt ) ) (otherlv_11= 'taskContext' ( ( ruleEString ) ) )? (otherlv_13= 'slave' otherlv_14= '{' ( (lv_slave_15_0= ruleSlave ) ) (otherlv_16= ',' ( (lv_slave_17_0= ruleSlave ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_scheduler_4_0 = null;

        AntlrDatatypeRuleToken lv_cpuAffinity_6_0 = null;

        AntlrDatatypeRuleToken lv_period_8_0 = null;

        AntlrDatatypeRuleToken lv_priority_10_0 = null;

        EObject lv_slave_15_0 = null;

        EObject lv_slave_17_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1206:28: ( (otherlv_0= 'Activity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scheduler' ( (lv_scheduler_4_0= ruleScheduler ) ) otherlv_5= 'cpuAffinity' ( (lv_cpuAffinity_6_0= ruleEString ) ) otherlv_7= 'period' ( (lv_period_8_0= ruleEFloat ) ) otherlv_9= 'priority' ( (lv_priority_10_0= ruleEInt ) ) (otherlv_11= 'taskContext' ( ( ruleEString ) ) )? (otherlv_13= 'slave' otherlv_14= '{' ( (lv_slave_15_0= ruleSlave ) ) (otherlv_16= ',' ( (lv_slave_17_0= ruleSlave ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1207:1: (otherlv_0= 'Activity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scheduler' ( (lv_scheduler_4_0= ruleScheduler ) ) otherlv_5= 'cpuAffinity' ( (lv_cpuAffinity_6_0= ruleEString ) ) otherlv_7= 'period' ( (lv_period_8_0= ruleEFloat ) ) otherlv_9= 'priority' ( (lv_priority_10_0= ruleEInt ) ) (otherlv_11= 'taskContext' ( ( ruleEString ) ) )? (otherlv_13= 'slave' otherlv_14= '{' ( (lv_slave_15_0= ruleSlave ) ) (otherlv_16= ',' ( (lv_slave_17_0= ruleSlave ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1207:1: (otherlv_0= 'Activity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scheduler' ( (lv_scheduler_4_0= ruleScheduler ) ) otherlv_5= 'cpuAffinity' ( (lv_cpuAffinity_6_0= ruleEString ) ) otherlv_7= 'period' ( (lv_period_8_0= ruleEFloat ) ) otherlv_9= 'priority' ( (lv_priority_10_0= ruleEInt ) ) (otherlv_11= 'taskContext' ( ( ruleEString ) ) )? (otherlv_13= 'slave' otherlv_14= '{' ( (lv_slave_15_0= ruleSlave ) ) (otherlv_16= ',' ( (lv_slave_17_0= ruleSlave ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1207:3: otherlv_0= 'Activity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scheduler' ( (lv_scheduler_4_0= ruleScheduler ) ) otherlv_5= 'cpuAffinity' ( (lv_cpuAffinity_6_0= ruleEString ) ) otherlv_7= 'period' ( (lv_period_8_0= ruleEFloat ) ) otherlv_9= 'priority' ( (lv_priority_10_0= ruleEInt ) ) (otherlv_11= 'taskContext' ( ( ruleEString ) ) )? (otherlv_13= 'slave' otherlv_14= '{' ( (lv_slave_15_0= ruleSlave ) ) (otherlv_16= ',' ( (lv_slave_17_0= ruleSlave ) ) )* otherlv_18= '}' )? otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleActivity2500); 

                	newLeafNode(otherlv_0, grammarAccess.getActivityAccess().getActivityKeyword_0());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1211:1: ( (lv_name_1_0= ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1212:1: (lv_name_1_0= ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1212:1: (lv_name_1_0= ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1213:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getActivityAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleActivity2521);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActivityRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleActivity2533); 

                	newLeafNode(otherlv_2, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleActivity2545); 

                	newLeafNode(otherlv_3, grammarAccess.getActivityAccess().getSchedulerKeyword_3());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1237:1: ( (lv_scheduler_4_0= ruleScheduler ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1238:1: (lv_scheduler_4_0= ruleScheduler )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1238:1: (lv_scheduler_4_0= ruleScheduler )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1239:3: lv_scheduler_4_0= ruleScheduler
            {
             
            	        newCompositeNode(grammarAccess.getActivityAccess().getSchedulerSchedulerEnumRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleScheduler_in_ruleActivity2566);
            lv_scheduler_4_0=ruleScheduler();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActivityRule());
            	        }
                   		set(
                   			current, 
                   			"scheduler",
                    		lv_scheduler_4_0, 
                    		"Scheduler");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleActivity2578); 

                	newLeafNode(otherlv_5, grammarAccess.getActivityAccess().getCpuAffinityKeyword_5());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1259:1: ( (lv_cpuAffinity_6_0= ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1260:1: (lv_cpuAffinity_6_0= ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1260:1: (lv_cpuAffinity_6_0= ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1261:3: lv_cpuAffinity_6_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getActivityAccess().getCpuAffinityEStringParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleActivity2599);
            lv_cpuAffinity_6_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActivityRule());
            	        }
                   		set(
                   			current, 
                   			"cpuAffinity",
                    		lv_cpuAffinity_6_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleActivity2611); 

                	newLeafNode(otherlv_7, grammarAccess.getActivityAccess().getPeriodKeyword_7());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1281:1: ( (lv_period_8_0= ruleEFloat ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1282:1: (lv_period_8_0= ruleEFloat )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1282:1: (lv_period_8_0= ruleEFloat )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1283:3: lv_period_8_0= ruleEFloat
            {
             
            	        newCompositeNode(grammarAccess.getActivityAccess().getPeriodEFloatParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_ruleActivity2632);
            lv_period_8_0=ruleEFloat();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActivityRule());
            	        }
                   		set(
                   			current, 
                   			"period",
                    		lv_period_8_0, 
                    		"EFloat");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleActivity2644); 

                	newLeafNode(otherlv_9, grammarAccess.getActivityAccess().getPriorityKeyword_9());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1303:1: ( (lv_priority_10_0= ruleEInt ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1304:1: (lv_priority_10_0= ruleEInt )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1304:1: (lv_priority_10_0= ruleEInt )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1305:3: lv_priority_10_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getActivityAccess().getPriorityEIntParserRuleCall_10_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleActivity2665);
            lv_priority_10_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActivityRule());
            	        }
                   		set(
                   			current, 
                   			"priority",
                    		lv_priority_10_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1321:2: (otherlv_11= 'taskContext' ( ( ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==48) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1321:4: otherlv_11= 'taskContext' ( ( ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleActivity2678); 

                        	newLeafNode(otherlv_11, grammarAccess.getActivityAccess().getTaskContextKeyword_11_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1325:1: ( ( ruleEString ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1326:1: ( ruleEString )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1326:1: ( ruleEString )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1327:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActivityRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getTaskContextTaskContextCrossReference_11_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleActivity2701);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1340:4: (otherlv_13= 'slave' otherlv_14= '{' ( (lv_slave_15_0= ruleSlave ) ) (otherlv_16= ',' ( (lv_slave_17_0= ruleSlave ) ) )* otherlv_18= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==49) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1340:6: otherlv_13= 'slave' otherlv_14= '{' ( (lv_slave_15_0= ruleSlave ) ) (otherlv_16= ',' ( (lv_slave_17_0= ruleSlave ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleActivity2716); 

                        	newLeafNode(otherlv_13, grammarAccess.getActivityAccess().getSlaveKeyword_12_0());
                        
                    otherlv_14=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleActivity2728); 

                        	newLeafNode(otherlv_14, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_12_1());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1348:1: ( (lv_slave_15_0= ruleSlave ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1349:1: (lv_slave_15_0= ruleSlave )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1349:1: (lv_slave_15_0= ruleSlave )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1350:3: lv_slave_15_0= ruleSlave
                    {
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getSlaveSlaveParserRuleCall_12_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSlave_in_ruleActivity2749);
                    lv_slave_15_0=ruleSlave();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	        }
                           		add(
                           			current, 
                           			"slave",
                            		lv_slave_15_0, 
                            		"Slave");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1366:2: (otherlv_16= ',' ( (lv_slave_17_0= ruleSlave ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==14) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1366:4: otherlv_16= ',' ( (lv_slave_17_0= ruleSlave ) )
                    	    {
                    	    otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleActivity2762); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getActivityAccess().getCommaKeyword_12_3_0());
                    	        
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1370:1: ( (lv_slave_17_0= ruleSlave ) )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1371:1: (lv_slave_17_0= ruleSlave )
                    	    {
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1371:1: (lv_slave_17_0= ruleSlave )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1372:3: lv_slave_17_0= ruleSlave
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getSlaveSlaveParserRuleCall_12_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSlave_in_ruleActivity2783);
                    	    lv_slave_17_0=ruleSlave();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"slave",
                    	            		lv_slave_17_0, 
                    	            		"Slave");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleActivity2797); 

                        	newLeafNode(otherlv_18, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_12_4());
                        

                    }
                    break;

            }

            otherlv_19=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleActivity2811); 

                	newLeafNode(otherlv_19, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_13());
                

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
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleSlave"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1404:1: entryRuleSlave returns [EObject current=null] : iv_ruleSlave= ruleSlave EOF ;
    public final EObject entryRuleSlave() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlave = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1405:2: (iv_ruleSlave= ruleSlave EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1406:2: iv_ruleSlave= ruleSlave EOF
            {
             newCompositeNode(grammarAccess.getSlaveRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSlave_in_entryRuleSlave2847);
            iv_ruleSlave=ruleSlave();

            state._fsp--;

             current =iv_ruleSlave; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSlave2857); 

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
    // $ANTLR end "entryRuleSlave"


    // $ANTLR start "ruleSlave"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1413:1: ruleSlave returns [EObject current=null] : ( () otherlv_1= 'Slave' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'taskContext' ( ( ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleSlave() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1416:28: ( ( () otherlv_1= 'Slave' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'taskContext' ( ( ruleEString ) ) )? otherlv_6= '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1417:1: ( () otherlv_1= 'Slave' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'taskContext' ( ( ruleEString ) ) )? otherlv_6= '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1417:1: ( () otherlv_1= 'Slave' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'taskContext' ( ( ruleEString ) ) )? otherlv_6= '}' )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1417:2: () otherlv_1= 'Slave' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'taskContext' ( ( ruleEString ) ) )? otherlv_6= '}'
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1417:2: ()
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1418:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSlaveAccess().getSlaveAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleSlave2903); 

                	newLeafNode(otherlv_1, grammarAccess.getSlaveAccess().getSlaveKeyword_1());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1427:1: ( (lv_name_2_0= ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1428:1: (lv_name_2_0= ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1428:1: (lv_name_2_0= ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1429:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSlaveAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSlave2924);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSlaveRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSlave2936); 

                	newLeafNode(otherlv_3, grammarAccess.getSlaveAccess().getLeftCurlyBracketKeyword_3());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1449:1: (otherlv_4= 'taskContext' ( ( ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==48) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1449:3: otherlv_4= 'taskContext' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleSlave2949); 

                        	newLeafNode(otherlv_4, grammarAccess.getSlaveAccess().getTaskContextKeyword_4_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1453:1: ( ( ruleEString ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1454:1: ( ruleEString )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1454:1: ( ruleEString )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1455:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSlaveRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSlaveAccess().getTaskContextTaskContextCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSlave2972);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSlave2986); 

                	newLeafNode(otherlv_6, grammarAccess.getSlaveAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleSlave"


    // $ANTLR start "entryRuleEString"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1480:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1481:2: (iv_ruleEString= ruleEString EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1482:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString3023);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString3034); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1489:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1492:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1493:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1493:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_ID) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1493:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString3074); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1501:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString3100); 

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


    // $ANTLR start "entryRuleEFloat"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1516:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1517:2: (iv_ruleEFloat= ruleEFloat EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1518:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_entryRuleEFloat3146);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEFloat3157); 

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
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1525:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;

         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1528:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1529:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1529:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1529:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1529:2: (kw= '-' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==42) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1530:2: kw= '-'
                    {
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleEFloat3196); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1535:3: (this_INT_1= RULE_INT )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_INT) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1535:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat3214); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleEFloat3234); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat3249); 

            		current.merge(this_INT_3);
                
             
                newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1555:1: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=52 && LA37_0<=53)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1555:2: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1555:2: (kw= 'E' | kw= 'e' )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==52) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==53) ) {
                        alt35=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1556:2: kw= 'E'
                            {
                            kw=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleEFloat3269); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1563:2: kw= 'e'
                            {
                            kw=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleEFloat3288); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                                

                            }
                            break;

                    }

                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1568:2: (kw= '-' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==42) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1569:2: kw= '-'
                            {
                            kw=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleEFloat3303); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
                                

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat3320); 

                    		current.merge(this_INT_7);
                        
                     
                        newLeafNode(this_INT_7, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleEInt"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1589:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1590:2: (iv_ruleEInt= ruleEInt EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1591:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt3368);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt3379); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1598:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1601:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1602:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1602:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1602:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1602:2: (kw= '-' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==42) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1603:2: kw= '-'
                    {
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleEInt3418); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt3435); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleQualifiedName"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1623:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1624:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1625:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3481);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedName3492); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1632:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1635:28: ( (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1636:1: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1636:1: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1636:6: this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName3532); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1643:1: (kw= '::' this_ID_2= RULE_ID )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==54) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1644:2: kw= '::' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleQualifiedName3551); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName3566); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithDot"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1664:1: entryRuleQualifiedNameWithDot returns [String current=null] : iv_ruleQualifiedNameWithDot= ruleQualifiedNameWithDot EOF ;
    public final String entryRuleQualifiedNameWithDot() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithDot = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1665:2: (iv_ruleQualifiedNameWithDot= ruleQualifiedNameWithDot EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1666:2: iv_ruleQualifiedNameWithDot= ruleQualifiedNameWithDot EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithDotRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_entryRuleQualifiedNameWithDot3614);
            iv_ruleQualifiedNameWithDot=ruleQualifiedNameWithDot();

            state._fsp--;

             current =iv_ruleQualifiedNameWithDot.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedNameWithDot3625); 

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
    // $ANTLR end "entryRuleQualifiedNameWithDot"


    // $ANTLR start "ruleQualifiedNameWithDot"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1673:1: ruleQualifiedNameWithDot returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithDot() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1676:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1677:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1677:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )* )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1678:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )*
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithDotAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithDot3672);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1688:1: (kw= '.' this_ID_2= RULE_ID )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==51) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1689:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleQualifiedNameWithDot3691); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameWithDotAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedNameWithDot3706); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameWithDotAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


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
    // $ANTLR end "ruleQualifiedNameWithDot"


    // $ANTLR start "ruleConnectionPolicyLockPolicy"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1709:1: ruleConnectionPolicyLockPolicy returns [Enumerator current=null] : ( (enumLiteral_0= 'UNSYNC' ) | (enumLiteral_1= 'LOCKED' ) | (enumLiteral_2= 'LOCK_FREE' ) ) ;
    public final Enumerator ruleConnectionPolicyLockPolicy() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1711:28: ( ( (enumLiteral_0= 'UNSYNC' ) | (enumLiteral_1= 'LOCKED' ) | (enumLiteral_2= 'LOCK_FREE' ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1712:1: ( (enumLiteral_0= 'UNSYNC' ) | (enumLiteral_1= 'LOCKED' ) | (enumLiteral_2= 'LOCK_FREE' ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1712:1: ( (enumLiteral_0= 'UNSYNC' ) | (enumLiteral_1= 'LOCKED' ) | (enumLiteral_2= 'LOCK_FREE' ) )
            int alt41=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt41=1;
                }
                break;
            case 56:
                {
                alt41=2;
                }
                break;
            case 57:
                {
                alt41=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1712:2: (enumLiteral_0= 'UNSYNC' )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1712:2: (enumLiteral_0= 'UNSYNC' )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1712:4: enumLiteral_0= 'UNSYNC'
                    {
                    enumLiteral_0=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleConnectionPolicyLockPolicy3767); 

                            current = grammarAccess.getConnectionPolicyLockPolicyAccess().getUNSYNCEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getConnectionPolicyLockPolicyAccess().getUNSYNCEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1718:6: (enumLiteral_1= 'LOCKED' )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1718:6: (enumLiteral_1= 'LOCKED' )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1718:8: enumLiteral_1= 'LOCKED'
                    {
                    enumLiteral_1=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleConnectionPolicyLockPolicy3784); 

                            current = grammarAccess.getConnectionPolicyLockPolicyAccess().getLOCKEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getConnectionPolicyLockPolicyAccess().getLOCKEDEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1724:6: (enumLiteral_2= 'LOCK_FREE' )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1724:6: (enumLiteral_2= 'LOCK_FREE' )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1724:8: enumLiteral_2= 'LOCK_FREE'
                    {
                    enumLiteral_2=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleConnectionPolicyLockPolicy3801); 

                            current = grammarAccess.getConnectionPolicyLockPolicyAccess().getLOCK_FREEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getConnectionPolicyLockPolicyAccess().getLOCK_FREEEnumLiteralDeclaration_2()); 
                        

                    }


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
    // $ANTLR end "ruleConnectionPolicyLockPolicy"


    // $ANTLR start "ruleConnectionPolicyType"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1734:1: ruleConnectionPolicyType returns [Enumerator current=null] : ( (enumLiteral_0= 'DATA' ) | (enumLiteral_1= 'BUFFER' ) ) ;
    public final Enumerator ruleConnectionPolicyType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1736:28: ( ( (enumLiteral_0= 'DATA' ) | (enumLiteral_1= 'BUFFER' ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1737:1: ( (enumLiteral_0= 'DATA' ) | (enumLiteral_1= 'BUFFER' ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1737:1: ( (enumLiteral_0= 'DATA' ) | (enumLiteral_1= 'BUFFER' ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==58) ) {
                alt42=1;
            }
            else if ( (LA42_0==59) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1737:2: (enumLiteral_0= 'DATA' )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1737:2: (enumLiteral_0= 'DATA' )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1737:4: enumLiteral_0= 'DATA'
                    {
                    enumLiteral_0=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleConnectionPolicyType3846); 

                            current = grammarAccess.getConnectionPolicyTypeAccess().getDATAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getConnectionPolicyTypeAccess().getDATAEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1743:6: (enumLiteral_1= 'BUFFER' )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1743:6: (enumLiteral_1= 'BUFFER' )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1743:8: enumLiteral_1= 'BUFFER'
                    {
                    enumLiteral_1=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleConnectionPolicyType3863); 

                            current = grammarAccess.getConnectionPolicyTypeAccess().getBUFFEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getConnectionPolicyTypeAccess().getBUFFEREnumLiteralDeclaration_1()); 
                        

                    }


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
    // $ANTLR end "ruleConnectionPolicyType"


    // $ANTLR start "ruleScheduler"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1753:1: ruleScheduler returns [Enumerator current=null] : ( (enumLiteral_0= 'ORO_SCHED_OTHER' ) | (enumLiteral_1= 'ORO_SCHED_RT' ) ) ;
    public final Enumerator ruleScheduler() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1755:28: ( ( (enumLiteral_0= 'ORO_SCHED_OTHER' ) | (enumLiteral_1= 'ORO_SCHED_RT' ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1756:1: ( (enumLiteral_0= 'ORO_SCHED_OTHER' ) | (enumLiteral_1= 'ORO_SCHED_RT' ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1756:1: ( (enumLiteral_0= 'ORO_SCHED_OTHER' ) | (enumLiteral_1= 'ORO_SCHED_RT' ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==60) ) {
                alt43=1;
            }
            else if ( (LA43_0==61) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1756:2: (enumLiteral_0= 'ORO_SCHED_OTHER' )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1756:2: (enumLiteral_0= 'ORO_SCHED_OTHER' )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1756:4: enumLiteral_0= 'ORO_SCHED_OTHER'
                    {
                    enumLiteral_0=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleScheduler3908); 

                            current = grammarAccess.getSchedulerAccess().getORO_SCHED_OTHEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSchedulerAccess().getORO_SCHED_OTHEREnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1762:6: (enumLiteral_1= 'ORO_SCHED_RT' )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1762:6: (enumLiteral_1= 'ORO_SCHED_RT' )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1762:8: enumLiteral_1= 'ORO_SCHED_RT'
                    {
                    enumLiteral_1=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleScheduler3925); 

                            current = grammarAccess.getSchedulerAccess().getORO_SCHED_RTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getSchedulerAccess().getORO_SCHED_RTEnumLiteralDeclaration_1()); 
                        

                    }


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
    // $ANTLR end "ruleScheduler"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_rulePackage_in_entryRulePackage75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePackage85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rulePackage131 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_rulePackage152 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePackage164 = new BitSet(new long[]{0x000000000003A000L});
        public static final BitSet FOLLOW_13_in_rulePackage177 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePackage189 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleTaskContext_in_rulePackage210 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_rulePackage223 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleTaskContext_in_rulePackage244 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_rulePackage258 = new BitSet(new long[]{0x0000000000038000L});
        public static final BitSet FOLLOW_16_in_rulePackage273 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePackage285 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_ruleConnectionPolicy_in_rulePackage306 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_rulePackage319 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_ruleConnectionPolicy_in_rulePackage340 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_rulePackage354 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_17_in_rulePackage369 = new BitSet(new long[]{0x0004080000000000L});
        public static final BitSet FOLLOW_ruleIActivity_in_rulePackage390 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulePackage404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTaskContext_in_entryRuleTaskContext440 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTaskContext450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleTaskContext487 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTaskContext508 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTaskContext520 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleTaskContext532 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_ruleTaskContext553 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleTaskContext565 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_ruleTaskContext586 = new BitSet(new long[]{0x0000000001E08000L});
        public static final BitSet FOLLOW_21_in_ruleTaskContext599 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTaskContext611 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleInputPort_in_ruleTaskContext632 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleTaskContext645 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleInputPort_in_ruleTaskContext666 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleTaskContext680 = new BitSet(new long[]{0x0000000001C08000L});
        public static final BitSet FOLLOW_22_in_ruleTaskContext695 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTaskContext707 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleOutputPort_in_ruleTaskContext728 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleTaskContext741 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleOutputPort_in_ruleTaskContext762 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleTaskContext776 = new BitSet(new long[]{0x0000000001808000L});
        public static final BitSet FOLLOW_23_in_ruleTaskContext791 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTaskContext803 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleProperty_in_ruleTaskContext824 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleTaskContext837 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleProperty_in_ruleTaskContext858 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleTaskContext872 = new BitSet(new long[]{0x0000000001008000L});
        public static final BitSet FOLLOW_24_in_ruleTaskContext887 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTaskContext899 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleTaskContext920 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleTaskContext933 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleTaskContext954 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleTaskContext968 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleTaskContext982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConnectionPolicy_in_entryRuleConnectionPolicy1018 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConnectionPolicy1028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleConnectionPolicy1065 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConnectionPolicy1086 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleConnectionPolicy1098 = new BitSet(new long[]{0x000000001C100000L});
        public static final BitSet FOLLOW_26_in_ruleConnectionPolicy1111 = new BitSet(new long[]{0x0000040000000010L});
        public static final BitSet FOLLOW_ruleEShort_in_ruleConnectionPolicy1132 = new BitSet(new long[]{0x0000000018100000L});
        public static final BitSet FOLLOW_27_in_ruleConnectionPolicy1147 = new BitSet(new long[]{0x0380000000000000L});
        public static final BitSet FOLLOW_ruleConnectionPolicyLockPolicy_in_ruleConnectionPolicy1168 = new BitSet(new long[]{0x0000000010100000L});
        public static final BitSet FOLLOW_20_in_ruleConnectionPolicy1183 = new BitSet(new long[]{0x0C00000000000000L});
        public static final BitSet FOLLOW_ruleConnectionPolicyType_in_ruleConnectionPolicy1204 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleConnectionPolicy1218 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConnectionPolicy1241 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleConnectionPolicy1253 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConnectionPolicy1276 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleConnectionPolicy1288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputPort_in_entryRuleInputPort1324 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputPort1334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleInputPort1377 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleInputPort1402 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputPort1423 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleInputPort1435 = new BitSet(new long[]{0x0000000300008000L});
        public static final BitSet FOLLOW_32_in_ruleInputPort1448 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_ruleInputPort1471 = new BitSet(new long[]{0x0000000200008000L});
        public static final BitSet FOLLOW_33_in_ruleInputPort1486 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputPort1509 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleInputPort1523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOutputPort_in_entryRuleOutputPort1559 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOutputPort1569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleOutputPort1606 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOutputPort1627 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOutputPort1639 = new BitSet(new long[]{0x0000000900008000L});
        public static final BitSet FOLLOW_32_in_ruleOutputPort1652 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_ruleOutputPort1675 = new BitSet(new long[]{0x0000000800008000L});
        public static final BitSet FOLLOW_35_in_ruleOutputPort1690 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOutputPort1713 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleOutputPort1727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1763 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProperty1773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleProperty1819 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProperty1840 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleProperty1852 = new BitSet(new long[]{0x0000006000108000L});
        public static final BitSet FOLLOW_37_in_ruleProperty1865 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProperty1886 = new BitSet(new long[]{0x0000004000108000L});
        public static final BitSet FOLLOW_38_in_ruleProperty1901 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProperty1922 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_20_in_ruleProperty1937 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_ruleProperty1960 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleProperty1974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation2010 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperation2020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleOperation2066 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOperation2087 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOperation2099 = new BitSet(new long[]{0x0000030000008000L});
        public static final BitSet FOLLOW_40_in_ruleOperation2112 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOperation2133 = new BitSet(new long[]{0x0000020000008000L});
        public static final BitSet FOLLOW_41_in_ruleOperation2148 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_ruleOperation2171 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleOperation2185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEShort_in_entryRuleEShort2222 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEShort2233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleEShort2272 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEShort2289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIActivity_in_entryRuleIActivity2334 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIActivity2344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleActivity_in_ruleIActivity2391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSlave_in_ruleIActivity2418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity2453 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleActivity2463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleActivity2500 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleActivity2521 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleActivity2533 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_44_in_ruleActivity2545 = new BitSet(new long[]{0x3000000000000000L});
        public static final BitSet FOLLOW_ruleScheduler_in_ruleActivity2566 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_ruleActivity2578 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleActivity2599 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_46_in_ruleActivity2611 = new BitSet(new long[]{0x0008040000000010L});
        public static final BitSet FOLLOW_ruleEFloat_in_ruleActivity2632 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_47_in_ruleActivity2644 = new BitSet(new long[]{0x0000040000000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleActivity2665 = new BitSet(new long[]{0x0003000000008000L});
        public static final BitSet FOLLOW_48_in_ruleActivity2678 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleActivity2701 = new BitSet(new long[]{0x0002000000008000L});
        public static final BitSet FOLLOW_49_in_ruleActivity2716 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleActivity2728 = new BitSet(new long[]{0x0004080000000000L});
        public static final BitSet FOLLOW_ruleSlave_in_ruleActivity2749 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleActivity2762 = new BitSet(new long[]{0x0004080000000000L});
        public static final BitSet FOLLOW_ruleSlave_in_ruleActivity2783 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleActivity2797 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleActivity2811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSlave_in_entryRuleSlave2847 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSlave2857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleSlave2903 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSlave2924 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSlave2936 = new BitSet(new long[]{0x0001000000008000L});
        public static final BitSet FOLLOW_48_in_ruleSlave2949 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSlave2972 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSlave2986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString3023 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString3034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString3074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString3100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_entryRuleEFloat3146 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEFloat3157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleEFloat3196 = new BitSet(new long[]{0x0008000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat3214 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_51_in_ruleEFloat3234 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat3249 = new BitSet(new long[]{0x0030000000000002L});
        public static final BitSet FOLLOW_52_in_ruleEFloat3269 = new BitSet(new long[]{0x0000040000000010L});
        public static final BitSet FOLLOW_53_in_ruleEFloat3288 = new BitSet(new long[]{0x0000040000000010L});
        public static final BitSet FOLLOW_42_in_ruleEFloat3303 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat3320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt3368 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt3379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleEInt3418 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt3435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName3492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName3532 = new BitSet(new long[]{0x0040000000000002L});
        public static final BitSet FOLLOW_54_in_ruleQualifiedName3551 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName3566 = new BitSet(new long[]{0x0040000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_entryRuleQualifiedNameWithDot3614 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithDot3625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithDot3672 = new BitSet(new long[]{0x0008000000000002L});
        public static final BitSet FOLLOW_51_in_ruleQualifiedNameWithDot3691 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedNameWithDot3706 = new BitSet(new long[]{0x0008000000000002L});
        public static final BitSet FOLLOW_55_in_ruleConnectionPolicyLockPolicy3767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleConnectionPolicyLockPolicy3784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleConnectionPolicyLockPolicy3801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleConnectionPolicyType3846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleConnectionPolicyType3863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleScheduler3908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleScheduler3925 = new BitSet(new long[]{0x0000000000000002L});
    }


}