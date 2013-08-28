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
import be.kuleuven.rodinia.dsl.rtt.services.RttDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRttDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'OrocosPackage'", "'{'", "'taskContexts'", "','", "'}'", "'connectionPolicies'", "'peerGroups'", "'TaskContext'", "'namespace'", "'type'", "'activity'", "'inputPorts'", "'eventPorts'", "'outputPorts'", "'properties'", "'operations'", "'ConnectionPolicy'", "'inputPort'", "'outputPort'", "'bufferSize'", "'dataSize'", "'lockPolicy'", "'transport'", "'init'", "'pull'", "'PeerGroup'", "'coordinator'", "'members'", "'('", "')'", "'Activity'", "'scheduler'", "'cpuAffinity'", "'period'", "'priority'", "'taskContext'", "'slave'", "'InputPort'", "'dataType'", "'EventPort'", "'OutputPort'", "'Property'", "'description'", "'value'", "'Operation'", "'documentation'", "'returnType'", "'Slave'", "'-'", "'.'", "'E'", "'e'", "'::'", "'ORO_SCHED_OTHER'", "'ORO_SCHED_RT'", "'UNSYNC'", "'LOCKED'", "'LOCK_FREE'", "'DATA'", "'BUFFER'", "'CIRCULAR_BUFFER'", "'default'", "'CORBA'", "'MQUEUE'", "'ROS'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=5;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
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
    public static final int RULE_INT=6;
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
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;

    // delegates
    // delegators


        public InternalRttDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRttDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRttDslParser.tokenNames; }
    public String getGrammarFileName() { return "../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g"; }



     	private RttDslGrammarAccess grammarAccess;
     	
        public InternalRttDslParser(TokenStream input, RttDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "OrocosPackage";	
       	}
       	
       	@Override
       	protected RttDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleOrocosPackage"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:68:1: entryRuleOrocosPackage returns [EObject current=null] : iv_ruleOrocosPackage= ruleOrocosPackage EOF ;
    public final EObject entryRuleOrocosPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrocosPackage = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:69:2: (iv_ruleOrocosPackage= ruleOrocosPackage EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:70:2: iv_ruleOrocosPackage= ruleOrocosPackage EOF
            {
             newCompositeNode(grammarAccess.getOrocosPackageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrocosPackage_in_entryRuleOrocosPackage75);
            iv_ruleOrocosPackage=ruleOrocosPackage();

            state._fsp--;

             current =iv_ruleOrocosPackage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrocosPackage85); 

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
    // $ANTLR end "entryRuleOrocosPackage"


    // $ANTLR start "ruleOrocosPackage"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:77:1: ruleOrocosPackage returns [EObject current=null] : ( () otherlv_1= 'OrocosPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'taskContexts' otherlv_5= '{' ( (lv_taskContexts_6_0= ruleTaskContext ) ) (otherlv_7= ',' ( (lv_taskContexts_8_0= ruleTaskContext ) ) )* otherlv_9= '}' )? (otherlv_10= 'connectionPolicies' otherlv_11= '{' ( (lv_connectionPolicies_12_0= ruleConnectionPolicy ) ) (otherlv_13= ',' ( (lv_connectionPolicies_14_0= ruleConnectionPolicy ) ) )* otherlv_15= '}' )? (otherlv_16= 'peerGroups' otherlv_17= '{' ( (lv_peerGroups_18_0= rulePeerGroup ) ) (otherlv_19= ',' ( (lv_peerGroups_20_0= rulePeerGroup ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
    public final EObject ruleOrocosPackage() throws RecognitionException {
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
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_taskContexts_6_0 = null;

        EObject lv_taskContexts_8_0 = null;

        EObject lv_connectionPolicies_12_0 = null;

        EObject lv_connectionPolicies_14_0 = null;

        EObject lv_peerGroups_18_0 = null;

        EObject lv_peerGroups_20_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:80:28: ( ( () otherlv_1= 'OrocosPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'taskContexts' otherlv_5= '{' ( (lv_taskContexts_6_0= ruleTaskContext ) ) (otherlv_7= ',' ( (lv_taskContexts_8_0= ruleTaskContext ) ) )* otherlv_9= '}' )? (otherlv_10= 'connectionPolicies' otherlv_11= '{' ( (lv_connectionPolicies_12_0= ruleConnectionPolicy ) ) (otherlv_13= ',' ( (lv_connectionPolicies_14_0= ruleConnectionPolicy ) ) )* otherlv_15= '}' )? (otherlv_16= 'peerGroups' otherlv_17= '{' ( (lv_peerGroups_18_0= rulePeerGroup ) ) (otherlv_19= ',' ( (lv_peerGroups_20_0= rulePeerGroup ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:81:1: ( () otherlv_1= 'OrocosPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'taskContexts' otherlv_5= '{' ( (lv_taskContexts_6_0= ruleTaskContext ) ) (otherlv_7= ',' ( (lv_taskContexts_8_0= ruleTaskContext ) ) )* otherlv_9= '}' )? (otherlv_10= 'connectionPolicies' otherlv_11= '{' ( (lv_connectionPolicies_12_0= ruleConnectionPolicy ) ) (otherlv_13= ',' ( (lv_connectionPolicies_14_0= ruleConnectionPolicy ) ) )* otherlv_15= '}' )? (otherlv_16= 'peerGroups' otherlv_17= '{' ( (lv_peerGroups_18_0= rulePeerGroup ) ) (otherlv_19= ',' ( (lv_peerGroups_20_0= rulePeerGroup ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:81:1: ( () otherlv_1= 'OrocosPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'taskContexts' otherlv_5= '{' ( (lv_taskContexts_6_0= ruleTaskContext ) ) (otherlv_7= ',' ( (lv_taskContexts_8_0= ruleTaskContext ) ) )* otherlv_9= '}' )? (otherlv_10= 'connectionPolicies' otherlv_11= '{' ( (lv_connectionPolicies_12_0= ruleConnectionPolicy ) ) (otherlv_13= ',' ( (lv_connectionPolicies_14_0= ruleConnectionPolicy ) ) )* otherlv_15= '}' )? (otherlv_16= 'peerGroups' otherlv_17= '{' ( (lv_peerGroups_18_0= rulePeerGroup ) ) (otherlv_19= ',' ( (lv_peerGroups_20_0= rulePeerGroup ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:81:2: () otherlv_1= 'OrocosPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'taskContexts' otherlv_5= '{' ( (lv_taskContexts_6_0= ruleTaskContext ) ) (otherlv_7= ',' ( (lv_taskContexts_8_0= ruleTaskContext ) ) )* otherlv_9= '}' )? (otherlv_10= 'connectionPolicies' otherlv_11= '{' ( (lv_connectionPolicies_12_0= ruleConnectionPolicy ) ) (otherlv_13= ',' ( (lv_connectionPolicies_14_0= ruleConnectionPolicy ) ) )* otherlv_15= '}' )? (otherlv_16= 'peerGroups' otherlv_17= '{' ( (lv_peerGroups_18_0= rulePeerGroup ) ) (otherlv_19= ',' ( (lv_peerGroups_20_0= rulePeerGroup ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:81:2: ()
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOrocosPackageAccess().getOrocosPackageAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleOrocosPackage131); 

                	newLeafNode(otherlv_1, grammarAccess.getOrocosPackageAccess().getOrocosPackageKeyword_1());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:91:1: ( (lv_name_2_0= ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:92:1: (lv_name_2_0= ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:92:1: (lv_name_2_0= ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:93:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOrocosPackageAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOrocosPackage152);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOrocosPackageRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOrocosPackage164); 

                	newLeafNode(otherlv_3, grammarAccess.getOrocosPackageAccess().getLeftCurlyBracketKeyword_3());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:113:1: (otherlv_4= 'taskContexts' otherlv_5= '{' ( (lv_taskContexts_6_0= ruleTaskContext ) ) (otherlv_7= ',' ( (lv_taskContexts_8_0= ruleTaskContext ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:113:3: otherlv_4= 'taskContexts' otherlv_5= '{' ( (lv_taskContexts_6_0= ruleTaskContext ) ) (otherlv_7= ',' ( (lv_taskContexts_8_0= ruleTaskContext ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleOrocosPackage177); 

                        	newLeafNode(otherlv_4, grammarAccess.getOrocosPackageAccess().getTaskContextsKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOrocosPackage189); 

                        	newLeafNode(otherlv_5, grammarAccess.getOrocosPackageAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:121:1: ( (lv_taskContexts_6_0= ruleTaskContext ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:122:1: (lv_taskContexts_6_0= ruleTaskContext )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:122:1: (lv_taskContexts_6_0= ruleTaskContext )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:123:3: lv_taskContexts_6_0= ruleTaskContext
                    {
                     
                    	        newCompositeNode(grammarAccess.getOrocosPackageAccess().getTaskContextsTaskContextParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTaskContext_in_ruleOrocosPackage210);
                    lv_taskContexts_6_0=ruleTaskContext();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOrocosPackageRule());
                    	        }
                           		add(
                           			current, 
                           			"taskContexts",
                            		lv_taskContexts_6_0, 
                            		"TaskContext");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:139:2: (otherlv_7= ',' ( (lv_taskContexts_8_0= ruleTaskContext ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:139:4: otherlv_7= ',' ( (lv_taskContexts_8_0= ruleTaskContext ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleOrocosPackage223); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getOrocosPackageAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:143:1: ( (lv_taskContexts_8_0= ruleTaskContext ) )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:144:1: (lv_taskContexts_8_0= ruleTaskContext )
                    	    {
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:144:1: (lv_taskContexts_8_0= ruleTaskContext )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:145:3: lv_taskContexts_8_0= ruleTaskContext
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOrocosPackageAccess().getTaskContextsTaskContextParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTaskContext_in_ruleOrocosPackage244);
                    	    lv_taskContexts_8_0=ruleTaskContext();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOrocosPackageRule());
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

                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOrocosPackage258); 

                        	newLeafNode(otherlv_9, grammarAccess.getOrocosPackageAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:165:3: (otherlv_10= 'connectionPolicies' otherlv_11= '{' ( (lv_connectionPolicies_12_0= ruleConnectionPolicy ) ) (otherlv_13= ',' ( (lv_connectionPolicies_14_0= ruleConnectionPolicy ) ) )* otherlv_15= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:165:5: otherlv_10= 'connectionPolicies' otherlv_11= '{' ( (lv_connectionPolicies_12_0= ruleConnectionPolicy ) ) (otherlv_13= ',' ( (lv_connectionPolicies_14_0= ruleConnectionPolicy ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleOrocosPackage273); 

                        	newLeafNode(otherlv_10, grammarAccess.getOrocosPackageAccess().getConnectionPoliciesKeyword_5_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOrocosPackage285); 

                        	newLeafNode(otherlv_11, grammarAccess.getOrocosPackageAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:173:1: ( (lv_connectionPolicies_12_0= ruleConnectionPolicy ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:174:1: (lv_connectionPolicies_12_0= ruleConnectionPolicy )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:174:1: (lv_connectionPolicies_12_0= ruleConnectionPolicy )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:175:3: lv_connectionPolicies_12_0= ruleConnectionPolicy
                    {
                     
                    	        newCompositeNode(grammarAccess.getOrocosPackageAccess().getConnectionPoliciesConnectionPolicyParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConnectionPolicy_in_ruleOrocosPackage306);
                    lv_connectionPolicies_12_0=ruleConnectionPolicy();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOrocosPackageRule());
                    	        }
                           		add(
                           			current, 
                           			"connectionPolicies",
                            		lv_connectionPolicies_12_0, 
                            		"ConnectionPolicy");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:191:2: (otherlv_13= ',' ( (lv_connectionPolicies_14_0= ruleConnectionPolicy ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:191:4: otherlv_13= ',' ( (lv_connectionPolicies_14_0= ruleConnectionPolicy ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleOrocosPackage319); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getOrocosPackageAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:195:1: ( (lv_connectionPolicies_14_0= ruleConnectionPolicy ) )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:196:1: (lv_connectionPolicies_14_0= ruleConnectionPolicy )
                    	    {
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:196:1: (lv_connectionPolicies_14_0= ruleConnectionPolicy )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:197:3: lv_connectionPolicies_14_0= ruleConnectionPolicy
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOrocosPackageAccess().getConnectionPoliciesConnectionPolicyParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleConnectionPolicy_in_ruleOrocosPackage340);
                    	    lv_connectionPolicies_14_0=ruleConnectionPolicy();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOrocosPackageRule());
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

                    otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOrocosPackage354); 

                        	newLeafNode(otherlv_15, grammarAccess.getOrocosPackageAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:217:3: (otherlv_16= 'peerGroups' otherlv_17= '{' ( (lv_peerGroups_18_0= rulePeerGroup ) ) (otherlv_19= ',' ( (lv_peerGroups_20_0= rulePeerGroup ) ) )* otherlv_21= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:217:5: otherlv_16= 'peerGroups' otherlv_17= '{' ( (lv_peerGroups_18_0= rulePeerGroup ) ) (otherlv_19= ',' ( (lv_peerGroups_20_0= rulePeerGroup ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleOrocosPackage369); 

                        	newLeafNode(otherlv_16, grammarAccess.getOrocosPackageAccess().getPeerGroupsKeyword_6_0());
                        
                    otherlv_17=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOrocosPackage381); 

                        	newLeafNode(otherlv_17, grammarAccess.getOrocosPackageAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:225:1: ( (lv_peerGroups_18_0= rulePeerGroup ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:226:1: (lv_peerGroups_18_0= rulePeerGroup )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:226:1: (lv_peerGroups_18_0= rulePeerGroup )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:227:3: lv_peerGroups_18_0= rulePeerGroup
                    {
                     
                    	        newCompositeNode(grammarAccess.getOrocosPackageAccess().getPeerGroupsPeerGroupParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePeerGroup_in_ruleOrocosPackage402);
                    lv_peerGroups_18_0=rulePeerGroup();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOrocosPackageRule());
                    	        }
                           		add(
                           			current, 
                           			"peerGroups",
                            		lv_peerGroups_18_0, 
                            		"PeerGroup");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:243:2: (otherlv_19= ',' ( (lv_peerGroups_20_0= rulePeerGroup ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:243:4: otherlv_19= ',' ( (lv_peerGroups_20_0= rulePeerGroup ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleOrocosPackage415); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getOrocosPackageAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:247:1: ( (lv_peerGroups_20_0= rulePeerGroup ) )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:248:1: (lv_peerGroups_20_0= rulePeerGroup )
                    	    {
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:248:1: (lv_peerGroups_20_0= rulePeerGroup )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:249:3: lv_peerGroups_20_0= rulePeerGroup
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOrocosPackageAccess().getPeerGroupsPeerGroupParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_rulePeerGroup_in_ruleOrocosPackage436);
                    	    lv_peerGroups_20_0=rulePeerGroup();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOrocosPackageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"peerGroups",
                    	            		lv_peerGroups_20_0, 
                    	            		"PeerGroup");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOrocosPackage450); 

                        	newLeafNode(otherlv_21, grammarAccess.getOrocosPackageAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_22=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOrocosPackage464); 

                	newLeafNode(otherlv_22, grammarAccess.getOrocosPackageAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleOrocosPackage"


    // $ANTLR start "entryRuleInputPort"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:281:1: entryRuleInputPort returns [EObject current=null] : iv_ruleInputPort= ruleInputPort EOF ;
    public final EObject entryRuleInputPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputPort = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:282:2: (iv_ruleInputPort= ruleInputPort EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:283:2: iv_ruleInputPort= ruleInputPort EOF
            {
             newCompositeNode(grammarAccess.getInputPortRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputPort_in_entryRuleInputPort500);
            iv_ruleInputPort=ruleInputPort();

            state._fsp--;

             current =iv_ruleInputPort; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputPort510); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:290:1: ruleInputPort returns [EObject current=null] : (this_InputPort_Impl_0= ruleInputPort_Impl | this_EventPort_1= ruleEventPort ) ;
    public final EObject ruleInputPort() throws RecognitionException {
        EObject current = null;

        EObject this_InputPort_Impl_0 = null;

        EObject this_EventPort_1 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:293:28: ( (this_InputPort_Impl_0= ruleInputPort_Impl | this_EventPort_1= ruleEventPort ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:294:1: (this_InputPort_Impl_0= ruleInputPort_Impl | this_EventPort_1= ruleEventPort )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:294:1: (this_InputPort_Impl_0= ruleInputPort_Impl | this_EventPort_1= ruleEventPort )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==48) ) {
                alt7=1;
            }
            else if ( (LA7_0==50) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:295:5: this_InputPort_Impl_0= ruleInputPort_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getInputPortAccess().getInputPort_ImplParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInputPort_Impl_in_ruleInputPort557);
                    this_InputPort_Impl_0=ruleInputPort_Impl();

                    state._fsp--;

                     
                            current = this_InputPort_Impl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:305:5: this_EventPort_1= ruleEventPort
                    {
                     
                            newCompositeNode(grammarAccess.getInputPortAccess().getEventPortParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEventPort_in_ruleInputPort584);
                    this_EventPort_1=ruleEventPort();

                    state._fsp--;

                     
                            current = this_EventPort_1; 
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
    // $ANTLR end "ruleInputPort"


    // $ANTLR start "entryRuleEString"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:321:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:322:2: (iv_ruleEString= ruleEString EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:323:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString620);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString631); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:330:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:333:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:334:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:334:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:334:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString671); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:342:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString697); 

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


    // $ANTLR start "entryRuleTaskContext"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:357:1: entryRuleTaskContext returns [EObject current=null] : iv_ruleTaskContext= ruleTaskContext EOF ;
    public final EObject entryRuleTaskContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskContext = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:358:2: (iv_ruleTaskContext= ruleTaskContext EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:359:2: iv_ruleTaskContext= ruleTaskContext EOF
            {
             newCompositeNode(grammarAccess.getTaskContextRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTaskContext_in_entryRuleTaskContext742);
            iv_ruleTaskContext=ruleTaskContext();

            state._fsp--;

             current =iv_ruleTaskContext; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTaskContext752); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:366:1: ruleTaskContext returns [EObject current=null] : (otherlv_0= 'TaskContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'namespace' ( (lv_namespace_4_0= ruleEString ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) (otherlv_7= 'activity' ( (lv_activity_8_0= ruleActivity ) ) )? (otherlv_9= 'inputPorts' otherlv_10= '{' ( (lv_inputPorts_11_0= ruleInputPort ) ) (otherlv_12= ',' ( (lv_inputPorts_13_0= ruleInputPort ) ) )* otherlv_14= '}' )? (otherlv_15= 'eventPorts' otherlv_16= '{' ( (lv_eventPorts_17_0= ruleEventPort ) ) (otherlv_18= ',' ( (lv_eventPorts_19_0= ruleEventPort ) ) )* otherlv_20= '}' )? (otherlv_21= 'outputPorts' otherlv_22= '{' ( (lv_outputPorts_23_0= ruleOutputPort ) ) (otherlv_24= ',' ( (lv_outputPorts_25_0= ruleOutputPort ) ) )* otherlv_26= '}' )? (otherlv_27= 'properties' otherlv_28= '{' ( (lv_properties_29_0= ruleProperty ) ) (otherlv_30= ',' ( (lv_properties_31_0= ruleProperty ) ) )* otherlv_32= '}' )? (otherlv_33= 'operations' otherlv_34= '{' ( (lv_operations_35_0= ruleOperation ) ) (otherlv_36= ',' ( (lv_operations_37_0= ruleOperation ) ) )* otherlv_38= '}' )? otherlv_39= '}' ) ;
    public final EObject ruleTaskContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_namespace_4_0 = null;

        AntlrDatatypeRuleToken lv_type_6_0 = null;

        EObject lv_activity_8_0 = null;

        EObject lv_inputPorts_11_0 = null;

        EObject lv_inputPorts_13_0 = null;

        EObject lv_eventPorts_17_0 = null;

        EObject lv_eventPorts_19_0 = null;

        EObject lv_outputPorts_23_0 = null;

        EObject lv_outputPorts_25_0 = null;

        EObject lv_properties_29_0 = null;

        EObject lv_properties_31_0 = null;

        EObject lv_operations_35_0 = null;

        EObject lv_operations_37_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:369:28: ( (otherlv_0= 'TaskContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'namespace' ( (lv_namespace_4_0= ruleEString ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) (otherlv_7= 'activity' ( (lv_activity_8_0= ruleActivity ) ) )? (otherlv_9= 'inputPorts' otherlv_10= '{' ( (lv_inputPorts_11_0= ruleInputPort ) ) (otherlv_12= ',' ( (lv_inputPorts_13_0= ruleInputPort ) ) )* otherlv_14= '}' )? (otherlv_15= 'eventPorts' otherlv_16= '{' ( (lv_eventPorts_17_0= ruleEventPort ) ) (otherlv_18= ',' ( (lv_eventPorts_19_0= ruleEventPort ) ) )* otherlv_20= '}' )? (otherlv_21= 'outputPorts' otherlv_22= '{' ( (lv_outputPorts_23_0= ruleOutputPort ) ) (otherlv_24= ',' ( (lv_outputPorts_25_0= ruleOutputPort ) ) )* otherlv_26= '}' )? (otherlv_27= 'properties' otherlv_28= '{' ( (lv_properties_29_0= ruleProperty ) ) (otherlv_30= ',' ( (lv_properties_31_0= ruleProperty ) ) )* otherlv_32= '}' )? (otherlv_33= 'operations' otherlv_34= '{' ( (lv_operations_35_0= ruleOperation ) ) (otherlv_36= ',' ( (lv_operations_37_0= ruleOperation ) ) )* otherlv_38= '}' )? otherlv_39= '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:370:1: (otherlv_0= 'TaskContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'namespace' ( (lv_namespace_4_0= ruleEString ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) (otherlv_7= 'activity' ( (lv_activity_8_0= ruleActivity ) ) )? (otherlv_9= 'inputPorts' otherlv_10= '{' ( (lv_inputPorts_11_0= ruleInputPort ) ) (otherlv_12= ',' ( (lv_inputPorts_13_0= ruleInputPort ) ) )* otherlv_14= '}' )? (otherlv_15= 'eventPorts' otherlv_16= '{' ( (lv_eventPorts_17_0= ruleEventPort ) ) (otherlv_18= ',' ( (lv_eventPorts_19_0= ruleEventPort ) ) )* otherlv_20= '}' )? (otherlv_21= 'outputPorts' otherlv_22= '{' ( (lv_outputPorts_23_0= ruleOutputPort ) ) (otherlv_24= ',' ( (lv_outputPorts_25_0= ruleOutputPort ) ) )* otherlv_26= '}' )? (otherlv_27= 'properties' otherlv_28= '{' ( (lv_properties_29_0= ruleProperty ) ) (otherlv_30= ',' ( (lv_properties_31_0= ruleProperty ) ) )* otherlv_32= '}' )? (otherlv_33= 'operations' otherlv_34= '{' ( (lv_operations_35_0= ruleOperation ) ) (otherlv_36= ',' ( (lv_operations_37_0= ruleOperation ) ) )* otherlv_38= '}' )? otherlv_39= '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:370:1: (otherlv_0= 'TaskContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'namespace' ( (lv_namespace_4_0= ruleEString ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) (otherlv_7= 'activity' ( (lv_activity_8_0= ruleActivity ) ) )? (otherlv_9= 'inputPorts' otherlv_10= '{' ( (lv_inputPorts_11_0= ruleInputPort ) ) (otherlv_12= ',' ( (lv_inputPorts_13_0= ruleInputPort ) ) )* otherlv_14= '}' )? (otherlv_15= 'eventPorts' otherlv_16= '{' ( (lv_eventPorts_17_0= ruleEventPort ) ) (otherlv_18= ',' ( (lv_eventPorts_19_0= ruleEventPort ) ) )* otherlv_20= '}' )? (otherlv_21= 'outputPorts' otherlv_22= '{' ( (lv_outputPorts_23_0= ruleOutputPort ) ) (otherlv_24= ',' ( (lv_outputPorts_25_0= ruleOutputPort ) ) )* otherlv_26= '}' )? (otherlv_27= 'properties' otherlv_28= '{' ( (lv_properties_29_0= ruleProperty ) ) (otherlv_30= ',' ( (lv_properties_31_0= ruleProperty ) ) )* otherlv_32= '}' )? (otherlv_33= 'operations' otherlv_34= '{' ( (lv_operations_35_0= ruleOperation ) ) (otherlv_36= ',' ( (lv_operations_37_0= ruleOperation ) ) )* otherlv_38= '}' )? otherlv_39= '}' )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:370:3: otherlv_0= 'TaskContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'namespace' ( (lv_namespace_4_0= ruleEString ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) (otherlv_7= 'activity' ( (lv_activity_8_0= ruleActivity ) ) )? (otherlv_9= 'inputPorts' otherlv_10= '{' ( (lv_inputPorts_11_0= ruleInputPort ) ) (otherlv_12= ',' ( (lv_inputPorts_13_0= ruleInputPort ) ) )* otherlv_14= '}' )? (otherlv_15= 'eventPorts' otherlv_16= '{' ( (lv_eventPorts_17_0= ruleEventPort ) ) (otherlv_18= ',' ( (lv_eventPorts_19_0= ruleEventPort ) ) )* otherlv_20= '}' )? (otherlv_21= 'outputPorts' otherlv_22= '{' ( (lv_outputPorts_23_0= ruleOutputPort ) ) (otherlv_24= ',' ( (lv_outputPorts_25_0= ruleOutputPort ) ) )* otherlv_26= '}' )? (otherlv_27= 'properties' otherlv_28= '{' ( (lv_properties_29_0= ruleProperty ) ) (otherlv_30= ',' ( (lv_properties_31_0= ruleProperty ) ) )* otherlv_32= '}' )? (otherlv_33= 'operations' otherlv_34= '{' ( (lv_operations_35_0= ruleOperation ) ) (otherlv_36= ',' ( (lv_operations_37_0= ruleOperation ) ) )* otherlv_38= '}' )? otherlv_39= '}'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTaskContext789); 

                	newLeafNode(otherlv_0, grammarAccess.getTaskContextAccess().getTaskContextKeyword_0());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:374:1: ( (lv_name_1_0= ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:375:1: (lv_name_1_0= ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:375:1: (lv_name_1_0= ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:376:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTaskContextAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTaskContext810);
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

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTaskContext822); 

                	newLeafNode(otherlv_2, grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTaskContext834); 

                	newLeafNode(otherlv_3, grammarAccess.getTaskContextAccess().getNamespaceKeyword_3());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:400:1: ( (lv_namespace_4_0= ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:401:1: (lv_namespace_4_0= ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:401:1: (lv_namespace_4_0= ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:402:3: lv_namespace_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTaskContextAccess().getNamespaceEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTaskContext855);
            lv_namespace_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTaskContextRule());
            	        }
                   		set(
                   			current, 
                   			"namespace",
                    		lv_namespace_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleTaskContext867); 

                	newLeafNode(otherlv_5, grammarAccess.getTaskContextAccess().getTypeKeyword_5());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:422:1: ( (lv_type_6_0= ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:423:1: (lv_type_6_0= ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:423:1: (lv_type_6_0= ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:424:3: lv_type_6_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTaskContextAccess().getTypeEStringParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTaskContext888);
            lv_type_6_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTaskContextRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_6_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:440:2: (otherlv_7= 'activity' ( (lv_activity_8_0= ruleActivity ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:440:4: otherlv_7= 'activity' ( (lv_activity_8_0= ruleActivity ) )
                    {
                    otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleTaskContext901); 

                        	newLeafNode(otherlv_7, grammarAccess.getTaskContextAccess().getActivityKeyword_7_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:444:1: ( (lv_activity_8_0= ruleActivity ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:445:1: (lv_activity_8_0= ruleActivity )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:445:1: (lv_activity_8_0= ruleActivity )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:446:3: lv_activity_8_0= ruleActivity
                    {
                     
                    	        newCompositeNode(grammarAccess.getTaskContextAccess().getActivityActivityParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleActivity_in_ruleTaskContext922);
                    lv_activity_8_0=ruleActivity();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTaskContextRule());
                    	        }
                           		set(
                           			current, 
                           			"activity",
                            		lv_activity_8_0, 
                            		"Activity");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:462:4: (otherlv_9= 'inputPorts' otherlv_10= '{' ( (lv_inputPorts_11_0= ruleInputPort ) ) (otherlv_12= ',' ( (lv_inputPorts_13_0= ruleInputPort ) ) )* otherlv_14= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:462:6: otherlv_9= 'inputPorts' otherlv_10= '{' ( (lv_inputPorts_11_0= ruleInputPort ) ) (otherlv_12= ',' ( (lv_inputPorts_13_0= ruleInputPort ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTaskContext937); 

                        	newLeafNode(otherlv_9, grammarAccess.getTaskContextAccess().getInputPortsKeyword_8_0());
                        
                    otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTaskContext949); 

                        	newLeafNode(otherlv_10, grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:470:1: ( (lv_inputPorts_11_0= ruleInputPort ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:471:1: (lv_inputPorts_11_0= ruleInputPort )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:471:1: (lv_inputPorts_11_0= ruleInputPort )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:472:3: lv_inputPorts_11_0= ruleInputPort
                    {
                     
                    	        newCompositeNode(grammarAccess.getTaskContextAccess().getInputPortsInputPortParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInputPort_in_ruleTaskContext970);
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

                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:488:2: (otherlv_12= ',' ( (lv_inputPorts_13_0= ruleInputPort ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==14) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:488:4: otherlv_12= ',' ( (lv_inputPorts_13_0= ruleInputPort ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTaskContext983); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getTaskContextAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:492:1: ( (lv_inputPorts_13_0= ruleInputPort ) )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:493:1: (lv_inputPorts_13_0= ruleInputPort )
                    	    {
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:493:1: (lv_inputPorts_13_0= ruleInputPort )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:494:3: lv_inputPorts_13_0= ruleInputPort
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTaskContextAccess().getInputPortsInputPortParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInputPort_in_ruleTaskContext1004);
                    	    lv_inputPorts_13_0=ruleInputPort();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTaskContextRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"inputPorts",
                    	            		lv_inputPorts_13_0, 
                    	            		"InputPort");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTaskContext1018); 

                        	newLeafNode(otherlv_14, grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:514:3: (otherlv_15= 'eventPorts' otherlv_16= '{' ( (lv_eventPorts_17_0= ruleEventPort ) ) (otherlv_18= ',' ( (lv_eventPorts_19_0= ruleEventPort ) ) )* otherlv_20= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:514:5: otherlv_15= 'eventPorts' otherlv_16= '{' ( (lv_eventPorts_17_0= ruleEventPort ) ) (otherlv_18= ',' ( (lv_eventPorts_19_0= ruleEventPort ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTaskContext1033); 

                        	newLeafNode(otherlv_15, grammarAccess.getTaskContextAccess().getEventPortsKeyword_9_0());
                        
                    otherlv_16=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTaskContext1045); 

                        	newLeafNode(otherlv_16, grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:522:1: ( (lv_eventPorts_17_0= ruleEventPort ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:523:1: (lv_eventPorts_17_0= ruleEventPort )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:523:1: (lv_eventPorts_17_0= ruleEventPort )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:524:3: lv_eventPorts_17_0= ruleEventPort
                    {
                     
                    	        newCompositeNode(grammarAccess.getTaskContextAccess().getEventPortsEventPortParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEventPort_in_ruleTaskContext1066);
                    lv_eventPorts_17_0=ruleEventPort();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTaskContextRule());
                    	        }
                           		add(
                           			current, 
                           			"eventPorts",
                            		lv_eventPorts_17_0, 
                            		"EventPort");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:540:2: (otherlv_18= ',' ( (lv_eventPorts_19_0= ruleEventPort ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:540:4: otherlv_18= ',' ( (lv_eventPorts_19_0= ruleEventPort ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTaskContext1079); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getTaskContextAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:544:1: ( (lv_eventPorts_19_0= ruleEventPort ) )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:545:1: (lv_eventPorts_19_0= ruleEventPort )
                    	    {
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:545:1: (lv_eventPorts_19_0= ruleEventPort )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:546:3: lv_eventPorts_19_0= ruleEventPort
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTaskContextAccess().getEventPortsEventPortParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEventPort_in_ruleTaskContext1100);
                    	    lv_eventPorts_19_0=ruleEventPort();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTaskContextRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"eventPorts",
                    	            		lv_eventPorts_19_0, 
                    	            		"EventPort");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTaskContext1114); 

                        	newLeafNode(otherlv_20, grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:566:3: (otherlv_21= 'outputPorts' otherlv_22= '{' ( (lv_outputPorts_23_0= ruleOutputPort ) ) (otherlv_24= ',' ( (lv_outputPorts_25_0= ruleOutputPort ) ) )* otherlv_26= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:566:5: otherlv_21= 'outputPorts' otherlv_22= '{' ( (lv_outputPorts_23_0= ruleOutputPort ) ) (otherlv_24= ',' ( (lv_outputPorts_25_0= ruleOutputPort ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleTaskContext1129); 

                        	newLeafNode(otherlv_21, grammarAccess.getTaskContextAccess().getOutputPortsKeyword_10_0());
                        
                    otherlv_22=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTaskContext1141); 

                        	newLeafNode(otherlv_22, grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:574:1: ( (lv_outputPorts_23_0= ruleOutputPort ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:575:1: (lv_outputPorts_23_0= ruleOutputPort )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:575:1: (lv_outputPorts_23_0= ruleOutputPort )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:576:3: lv_outputPorts_23_0= ruleOutputPort
                    {
                     
                    	        newCompositeNode(grammarAccess.getTaskContextAccess().getOutputPortsOutputPortParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOutputPort_in_ruleTaskContext1162);
                    lv_outputPorts_23_0=ruleOutputPort();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTaskContextRule());
                    	        }
                           		add(
                           			current, 
                           			"outputPorts",
                            		lv_outputPorts_23_0, 
                            		"OutputPort");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:592:2: (otherlv_24= ',' ( (lv_outputPorts_25_0= ruleOutputPort ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==14) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:592:4: otherlv_24= ',' ( (lv_outputPorts_25_0= ruleOutputPort ) )
                    	    {
                    	    otherlv_24=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTaskContext1175); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getTaskContextAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:596:1: ( (lv_outputPorts_25_0= ruleOutputPort ) )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:597:1: (lv_outputPorts_25_0= ruleOutputPort )
                    	    {
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:597:1: (lv_outputPorts_25_0= ruleOutputPort )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:598:3: lv_outputPorts_25_0= ruleOutputPort
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTaskContextAccess().getOutputPortsOutputPortParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleOutputPort_in_ruleTaskContext1196);
                    	    lv_outputPorts_25_0=ruleOutputPort();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTaskContextRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"outputPorts",
                    	            		lv_outputPorts_25_0, 
                    	            		"OutputPort");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTaskContext1210); 

                        	newLeafNode(otherlv_26, grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:618:3: (otherlv_27= 'properties' otherlv_28= '{' ( (lv_properties_29_0= ruleProperty ) ) (otherlv_30= ',' ( (lv_properties_31_0= ruleProperty ) ) )* otherlv_32= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:618:5: otherlv_27= 'properties' otherlv_28= '{' ( (lv_properties_29_0= ruleProperty ) ) (otherlv_30= ',' ( (lv_properties_31_0= ruleProperty ) ) )* otherlv_32= '}'
                    {
                    otherlv_27=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleTaskContext1225); 

                        	newLeafNode(otherlv_27, grammarAccess.getTaskContextAccess().getPropertiesKeyword_11_0());
                        
                    otherlv_28=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTaskContext1237); 

                        	newLeafNode(otherlv_28, grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_11_1());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:626:1: ( (lv_properties_29_0= ruleProperty ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:627:1: (lv_properties_29_0= ruleProperty )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:627:1: (lv_properties_29_0= ruleProperty )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:628:3: lv_properties_29_0= ruleProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getTaskContextAccess().getPropertiesPropertyParserRuleCall_11_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleProperty_in_ruleTaskContext1258);
                    lv_properties_29_0=ruleProperty();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTaskContextRule());
                    	        }
                           		add(
                           			current, 
                           			"properties",
                            		lv_properties_29_0, 
                            		"Property");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:644:2: (otherlv_30= ',' ( (lv_properties_31_0= ruleProperty ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==14) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:644:4: otherlv_30= ',' ( (lv_properties_31_0= ruleProperty ) )
                    	    {
                    	    otherlv_30=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTaskContext1271); 

                    	        	newLeafNode(otherlv_30, grammarAccess.getTaskContextAccess().getCommaKeyword_11_3_0());
                    	        
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:648:1: ( (lv_properties_31_0= ruleProperty ) )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:649:1: (lv_properties_31_0= ruleProperty )
                    	    {
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:649:1: (lv_properties_31_0= ruleProperty )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:650:3: lv_properties_31_0= ruleProperty
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTaskContextAccess().getPropertiesPropertyParserRuleCall_11_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleProperty_in_ruleTaskContext1292);
                    	    lv_properties_31_0=ruleProperty();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTaskContextRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"properties",
                    	            		lv_properties_31_0, 
                    	            		"Property");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_32=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTaskContext1306); 

                        	newLeafNode(otherlv_32, grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_11_4());
                        

                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:670:3: (otherlv_33= 'operations' otherlv_34= '{' ( (lv_operations_35_0= ruleOperation ) ) (otherlv_36= ',' ( (lv_operations_37_0= ruleOperation ) ) )* otherlv_38= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:670:5: otherlv_33= 'operations' otherlv_34= '{' ( (lv_operations_35_0= ruleOperation ) ) (otherlv_36= ',' ( (lv_operations_37_0= ruleOperation ) ) )* otherlv_38= '}'
                    {
                    otherlv_33=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTaskContext1321); 

                        	newLeafNode(otherlv_33, grammarAccess.getTaskContextAccess().getOperationsKeyword_12_0());
                        
                    otherlv_34=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTaskContext1333); 

                        	newLeafNode(otherlv_34, grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_12_1());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:678:1: ( (lv_operations_35_0= ruleOperation ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:679:1: (lv_operations_35_0= ruleOperation )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:679:1: (lv_operations_35_0= ruleOperation )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:680:3: lv_operations_35_0= ruleOperation
                    {
                     
                    	        newCompositeNode(grammarAccess.getTaskContextAccess().getOperationsOperationParserRuleCall_12_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleTaskContext1354);
                    lv_operations_35_0=ruleOperation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTaskContextRule());
                    	        }
                           		add(
                           			current, 
                           			"operations",
                            		lv_operations_35_0, 
                            		"Operation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:696:2: (otherlv_36= ',' ( (lv_operations_37_0= ruleOperation ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==14) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:696:4: otherlv_36= ',' ( (lv_operations_37_0= ruleOperation ) )
                    	    {
                    	    otherlv_36=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTaskContext1367); 

                    	        	newLeafNode(otherlv_36, grammarAccess.getTaskContextAccess().getCommaKeyword_12_3_0());
                    	        
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:700:1: ( (lv_operations_37_0= ruleOperation ) )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:701:1: (lv_operations_37_0= ruleOperation )
                    	    {
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:701:1: (lv_operations_37_0= ruleOperation )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:702:3: lv_operations_37_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTaskContextAccess().getOperationsOperationParserRuleCall_12_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleTaskContext1388);
                    	    lv_operations_37_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTaskContextRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"operations",
                    	            		lv_operations_37_0, 
                    	            		"Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_38=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTaskContext1402); 

                        	newLeafNode(otherlv_38, grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_12_4());
                        

                    }
                    break;

            }

            otherlv_39=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTaskContext1416); 

                	newLeafNode(otherlv_39, grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_13());
                

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:734:1: entryRuleConnectionPolicy returns [EObject current=null] : iv_ruleConnectionPolicy= ruleConnectionPolicy EOF ;
    public final EObject entryRuleConnectionPolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectionPolicy = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:735:2: (iv_ruleConnectionPolicy= ruleConnectionPolicy EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:736:2: iv_ruleConnectionPolicy= ruleConnectionPolicy EOF
            {
             newCompositeNode(grammarAccess.getConnectionPolicyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConnectionPolicy_in_entryRuleConnectionPolicy1452);
            iv_ruleConnectionPolicy=ruleConnectionPolicy();

            state._fsp--;

             current =iv_ruleConnectionPolicy; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConnectionPolicy1462); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:743:1: ruleConnectionPolicy returns [EObject current=null] : (otherlv_0= 'ConnectionPolicy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'inputPort' ( ( ruleEString ) ) otherlv_5= 'outputPort' ( ( ruleEString ) ) (otherlv_7= 'bufferSize' ( (lv_bufferSize_8_0= ruleEShort ) ) )? (otherlv_9= 'dataSize' ( (lv_dataSize_10_0= ruleEShort ) ) )? (otherlv_11= 'lockPolicy' ( (lv_lockPolicy_12_0= ruleConnectionPolicyLockPolicy ) ) )? (otherlv_13= 'transport' ( (lv_transport_14_0= ruleConnectionPolicyTransport ) ) )? (otherlv_15= 'type' ( (lv_type_16_0= ruleConnectionPolicyType ) ) )? ( (lv_init_17_0= 'init' ) )? ( (lv_pull_18_0= 'pull' ) )? otherlv_19= '}' ) ;
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
        Token otherlv_15=null;
        Token lv_init_17_0=null;
        Token lv_pull_18_0=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_bufferSize_8_0 = null;

        AntlrDatatypeRuleToken lv_dataSize_10_0 = null;

        Enumerator lv_lockPolicy_12_0 = null;

        Enumerator lv_transport_14_0 = null;

        Enumerator lv_type_16_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:746:28: ( (otherlv_0= 'ConnectionPolicy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'inputPort' ( ( ruleEString ) ) otherlv_5= 'outputPort' ( ( ruleEString ) ) (otherlv_7= 'bufferSize' ( (lv_bufferSize_8_0= ruleEShort ) ) )? (otherlv_9= 'dataSize' ( (lv_dataSize_10_0= ruleEShort ) ) )? (otherlv_11= 'lockPolicy' ( (lv_lockPolicy_12_0= ruleConnectionPolicyLockPolicy ) ) )? (otherlv_13= 'transport' ( (lv_transport_14_0= ruleConnectionPolicyTransport ) ) )? (otherlv_15= 'type' ( (lv_type_16_0= ruleConnectionPolicyType ) ) )? ( (lv_init_17_0= 'init' ) )? ( (lv_pull_18_0= 'pull' ) )? otherlv_19= '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:747:1: (otherlv_0= 'ConnectionPolicy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'inputPort' ( ( ruleEString ) ) otherlv_5= 'outputPort' ( ( ruleEString ) ) (otherlv_7= 'bufferSize' ( (lv_bufferSize_8_0= ruleEShort ) ) )? (otherlv_9= 'dataSize' ( (lv_dataSize_10_0= ruleEShort ) ) )? (otherlv_11= 'lockPolicy' ( (lv_lockPolicy_12_0= ruleConnectionPolicyLockPolicy ) ) )? (otherlv_13= 'transport' ( (lv_transport_14_0= ruleConnectionPolicyTransport ) ) )? (otherlv_15= 'type' ( (lv_type_16_0= ruleConnectionPolicyType ) ) )? ( (lv_init_17_0= 'init' ) )? ( (lv_pull_18_0= 'pull' ) )? otherlv_19= '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:747:1: (otherlv_0= 'ConnectionPolicy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'inputPort' ( ( ruleEString ) ) otherlv_5= 'outputPort' ( ( ruleEString ) ) (otherlv_7= 'bufferSize' ( (lv_bufferSize_8_0= ruleEShort ) ) )? (otherlv_9= 'dataSize' ( (lv_dataSize_10_0= ruleEShort ) ) )? (otherlv_11= 'lockPolicy' ( (lv_lockPolicy_12_0= ruleConnectionPolicyLockPolicy ) ) )? (otherlv_13= 'transport' ( (lv_transport_14_0= ruleConnectionPolicyTransport ) ) )? (otherlv_15= 'type' ( (lv_type_16_0= ruleConnectionPolicyType ) ) )? ( (lv_init_17_0= 'init' ) )? ( (lv_pull_18_0= 'pull' ) )? otherlv_19= '}' )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:747:3: otherlv_0= 'ConnectionPolicy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'inputPort' ( ( ruleEString ) ) otherlv_5= 'outputPort' ( ( ruleEString ) ) (otherlv_7= 'bufferSize' ( (lv_bufferSize_8_0= ruleEShort ) ) )? (otherlv_9= 'dataSize' ( (lv_dataSize_10_0= ruleEShort ) ) )? (otherlv_11= 'lockPolicy' ( (lv_lockPolicy_12_0= ruleConnectionPolicyLockPolicy ) ) )? (otherlv_13= 'transport' ( (lv_transport_14_0= ruleConnectionPolicyTransport ) ) )? (otherlv_15= 'type' ( (lv_type_16_0= ruleConnectionPolicyType ) ) )? ( (lv_init_17_0= 'init' ) )? ( (lv_pull_18_0= 'pull' ) )? otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleConnectionPolicy1499); 

                	newLeafNode(otherlv_0, grammarAccess.getConnectionPolicyAccess().getConnectionPolicyKeyword_0());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:751:1: ( (lv_name_1_0= ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:752:1: (lv_name_1_0= ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:752:1: (lv_name_1_0= ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:753:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getConnectionPolicyAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConnectionPolicy1520);
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

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleConnectionPolicy1532); 

                	newLeafNode(otherlv_2, grammarAccess.getConnectionPolicyAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleConnectionPolicy1544); 

                	newLeafNode(otherlv_3, grammarAccess.getConnectionPolicyAccess().getInputPortKeyword_3());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:777:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:778:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:778:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:779:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConnectionPolicyRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getConnectionPolicyAccess().getInputPortInputPortCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConnectionPolicy1567);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleConnectionPolicy1579); 

                	newLeafNode(otherlv_5, grammarAccess.getConnectionPolicyAccess().getOutputPortKeyword_5());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:796:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:797:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:797:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:798:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConnectionPolicyRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getConnectionPolicyAccess().getOutputPortOutputPortCrossReference_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConnectionPolicy1602);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:811:2: (otherlv_7= 'bufferSize' ( (lv_bufferSize_8_0= ruleEShort ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:811:4: otherlv_7= 'bufferSize' ( (lv_bufferSize_8_0= ruleEShort ) )
                    {
                    otherlv_7=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleConnectionPolicy1615); 

                        	newLeafNode(otherlv_7, grammarAccess.getConnectionPolicyAccess().getBufferSizeKeyword_7_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:815:1: ( (lv_bufferSize_8_0= ruleEShort ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:816:1: (lv_bufferSize_8_0= ruleEShort )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:816:1: (lv_bufferSize_8_0= ruleEShort )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:817:3: lv_bufferSize_8_0= ruleEShort
                    {
                     
                    	        newCompositeNode(grammarAccess.getConnectionPolicyAccess().getBufferSizeEShortParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEShort_in_ruleConnectionPolicy1636);
                    lv_bufferSize_8_0=ruleEShort();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConnectionPolicyRule());
                    	        }
                           		set(
                           			current, 
                           			"bufferSize",
                            		lv_bufferSize_8_0, 
                            		"EShort");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:833:4: (otherlv_9= 'dataSize' ( (lv_dataSize_10_0= ruleEShort ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:833:6: otherlv_9= 'dataSize' ( (lv_dataSize_10_0= ruleEShort ) )
                    {
                    otherlv_9=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleConnectionPolicy1651); 

                        	newLeafNode(otherlv_9, grammarAccess.getConnectionPolicyAccess().getDataSizeKeyword_8_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:837:1: ( (lv_dataSize_10_0= ruleEShort ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:838:1: (lv_dataSize_10_0= ruleEShort )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:838:1: (lv_dataSize_10_0= ruleEShort )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:839:3: lv_dataSize_10_0= ruleEShort
                    {
                     
                    	        newCompositeNode(grammarAccess.getConnectionPolicyAccess().getDataSizeEShortParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEShort_in_ruleConnectionPolicy1672);
                    lv_dataSize_10_0=ruleEShort();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConnectionPolicyRule());
                    	        }
                           		set(
                           			current, 
                           			"dataSize",
                            		lv_dataSize_10_0, 
                            		"EShort");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:855:4: (otherlv_11= 'lockPolicy' ( (lv_lockPolicy_12_0= ruleConnectionPolicyLockPolicy ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:855:6: otherlv_11= 'lockPolicy' ( (lv_lockPolicy_12_0= ruleConnectionPolicyLockPolicy ) )
                    {
                    otherlv_11=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleConnectionPolicy1687); 

                        	newLeafNode(otherlv_11, grammarAccess.getConnectionPolicyAccess().getLockPolicyKeyword_9_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:859:1: ( (lv_lockPolicy_12_0= ruleConnectionPolicyLockPolicy ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:860:1: (lv_lockPolicy_12_0= ruleConnectionPolicyLockPolicy )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:860:1: (lv_lockPolicy_12_0= ruleConnectionPolicyLockPolicy )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:861:3: lv_lockPolicy_12_0= ruleConnectionPolicyLockPolicy
                    {
                     
                    	        newCompositeNode(grammarAccess.getConnectionPolicyAccess().getLockPolicyConnectionPolicyLockPolicyEnumRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConnectionPolicyLockPolicy_in_ruleConnectionPolicy1708);
                    lv_lockPolicy_12_0=ruleConnectionPolicyLockPolicy();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConnectionPolicyRule());
                    	        }
                           		set(
                           			current, 
                           			"lockPolicy",
                            		lv_lockPolicy_12_0, 
                            		"ConnectionPolicyLockPolicy");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:877:4: (otherlv_13= 'transport' ( (lv_transport_14_0= ruleConnectionPolicyTransport ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==33) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:877:6: otherlv_13= 'transport' ( (lv_transport_14_0= ruleConnectionPolicyTransport ) )
                    {
                    otherlv_13=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleConnectionPolicy1723); 

                        	newLeafNode(otherlv_13, grammarAccess.getConnectionPolicyAccess().getTransportKeyword_10_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:881:1: ( (lv_transport_14_0= ruleConnectionPolicyTransport ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:882:1: (lv_transport_14_0= ruleConnectionPolicyTransport )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:882:1: (lv_transport_14_0= ruleConnectionPolicyTransport )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:883:3: lv_transport_14_0= ruleConnectionPolicyTransport
                    {
                     
                    	        newCompositeNode(grammarAccess.getConnectionPolicyAccess().getTransportConnectionPolicyTransportEnumRuleCall_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConnectionPolicyTransport_in_ruleConnectionPolicy1744);
                    lv_transport_14_0=ruleConnectionPolicyTransport();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConnectionPolicyRule());
                    	        }
                           		set(
                           			current, 
                           			"transport",
                            		lv_transport_14_0, 
                            		"ConnectionPolicyTransport");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:899:4: (otherlv_15= 'type' ( (lv_type_16_0= ruleConnectionPolicyType ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==20) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:899:6: otherlv_15= 'type' ( (lv_type_16_0= ruleConnectionPolicyType ) )
                    {
                    otherlv_15=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleConnectionPolicy1759); 

                        	newLeafNode(otherlv_15, grammarAccess.getConnectionPolicyAccess().getTypeKeyword_11_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:903:1: ( (lv_type_16_0= ruleConnectionPolicyType ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:904:1: (lv_type_16_0= ruleConnectionPolicyType )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:904:1: (lv_type_16_0= ruleConnectionPolicyType )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:905:3: lv_type_16_0= ruleConnectionPolicyType
                    {
                     
                    	        newCompositeNode(grammarAccess.getConnectionPolicyAccess().getTypeConnectionPolicyTypeEnumRuleCall_11_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConnectionPolicyType_in_ruleConnectionPolicy1780);
                    lv_type_16_0=ruleConnectionPolicyType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConnectionPolicyRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_16_0, 
                            		"ConnectionPolicyType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:921:4: ( (lv_init_17_0= 'init' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:922:1: (lv_init_17_0= 'init' )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:922:1: (lv_init_17_0= 'init' )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:923:3: lv_init_17_0= 'init'
                    {
                    lv_init_17_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleConnectionPolicy1800); 

                            newLeafNode(lv_init_17_0, grammarAccess.getConnectionPolicyAccess().getInitInitKeyword_12_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConnectionPolicyRule());
                    	        }
                           		setWithLastConsumed(current, "init", true, "init");
                    	    

                    }


                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:936:3: ( (lv_pull_18_0= 'pull' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:937:1: (lv_pull_18_0= 'pull' )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:937:1: (lv_pull_18_0= 'pull' )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:938:3: lv_pull_18_0= 'pull'
                    {
                    lv_pull_18_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleConnectionPolicy1832); 

                            newLeafNode(lv_pull_18_0, grammarAccess.getConnectionPolicyAccess().getPullPullKeyword_13_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConnectionPolicyRule());
                    	        }
                           		setWithLastConsumed(current, "pull", true, "pull");
                    	    

                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleConnectionPolicy1858); 

                	newLeafNode(otherlv_19, grammarAccess.getConnectionPolicyAccess().getRightCurlyBracketKeyword_14());
                

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


    // $ANTLR start "entryRulePeerGroup"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:963:1: entryRulePeerGroup returns [EObject current=null] : iv_rulePeerGroup= rulePeerGroup EOF ;
    public final EObject entryRulePeerGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePeerGroup = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:964:2: (iv_rulePeerGroup= rulePeerGroup EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:965:2: iv_rulePeerGroup= rulePeerGroup EOF
            {
             newCompositeNode(grammarAccess.getPeerGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePeerGroup_in_entryRulePeerGroup1894);
            iv_rulePeerGroup=rulePeerGroup();

            state._fsp--;

             current =iv_rulePeerGroup; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePeerGroup1904); 

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
    // $ANTLR end "entryRulePeerGroup"


    // $ANTLR start "rulePeerGroup"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:972:1: rulePeerGroup returns [EObject current=null] : (otherlv_0= 'PeerGroup' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'coordinator' ( ( ruleEString ) ) (otherlv_5= 'members' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' ) ;
    public final EObject rulePeerGroup() throws RecognitionException {
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
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:975:28: ( (otherlv_0= 'PeerGroup' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'coordinator' ( ( ruleEString ) ) (otherlv_5= 'members' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:976:1: (otherlv_0= 'PeerGroup' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'coordinator' ( ( ruleEString ) ) (otherlv_5= 'members' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:976:1: (otherlv_0= 'PeerGroup' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'coordinator' ( ( ruleEString ) ) (otherlv_5= 'members' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:976:3: otherlv_0= 'PeerGroup' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'coordinator' ( ( ruleEString ) ) (otherlv_5= 'members' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_rulePeerGroup1941); 

                	newLeafNode(otherlv_0, grammarAccess.getPeerGroupAccess().getPeerGroupKeyword_0());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:980:1: ( (lv_name_1_0= ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:981:1: (lv_name_1_0= ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:981:1: (lv_name_1_0= ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:982:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPeerGroupAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePeerGroup1962);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPeerGroupRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePeerGroup1974); 

                	newLeafNode(otherlv_2, grammarAccess.getPeerGroupAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_37_in_rulePeerGroup1986); 

                	newLeafNode(otherlv_3, grammarAccess.getPeerGroupAccess().getCoordinatorKeyword_3());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1006:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1007:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1007:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1008:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPeerGroupRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getPeerGroupAccess().getCoordinatorTaskContextCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePeerGroup2009);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1021:2: (otherlv_5= 'members' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1021:4: otherlv_5= 'members' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,38,FollowSets000.FOLLOW_38_in_rulePeerGroup2022); 

                        	newLeafNode(otherlv_5, grammarAccess.getPeerGroupAccess().getMembersKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,39,FollowSets000.FOLLOW_39_in_rulePeerGroup2034); 

                        	newLeafNode(otherlv_6, grammarAccess.getPeerGroupAccess().getLeftParenthesisKeyword_5_1());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1029:1: ( ( ruleEString ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1030:1: ( ruleEString )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1030:1: ( ruleEString )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1031:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPeerGroupRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getPeerGroupAccess().getMembersTaskContextCrossReference_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePeerGroup2057);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1044:2: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==14) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1044:4: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePeerGroup2070); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getPeerGroupAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1048:1: ( ( ruleEString ) )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1049:1: ( ruleEString )
                    	    {
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1049:1: ( ruleEString )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1050:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getPeerGroupRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getPeerGroupAccess().getMembersTaskContextCrossReference_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePeerGroup2093);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,40,FollowSets000.FOLLOW_40_in_rulePeerGroup2107); 

                        	newLeafNode(otherlv_10, grammarAccess.getPeerGroupAccess().getRightParenthesisKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePeerGroup2121); 

                	newLeafNode(otherlv_11, grammarAccess.getPeerGroupAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "rulePeerGroup"


    // $ANTLR start "entryRuleActivity"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1079:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1080:2: (iv_ruleActivity= ruleActivity EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1081:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleActivity_in_entryRuleActivity2157);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleActivity2167); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1088:1: ruleActivity returns [EObject current=null] : ( () otherlv_1= 'Activity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'scheduler' ( (lv_scheduler_5_0= ruleScheduler ) ) )? (otherlv_6= 'cpuAffinity' ( (lv_cpuAffinity_7_0= ruleEString ) ) )? (otherlv_8= 'period' ( (lv_period_9_0= ruleEFloat ) ) )? (otherlv_10= 'priority' ( (lv_priority_11_0= ruleEInt ) ) )? (otherlv_12= 'taskContext' ( ( ruleEString ) ) )? (otherlv_14= 'slave' otherlv_15= '{' ( (lv_slave_16_0= ruleSlave ) ) (otherlv_17= ',' ( (lv_slave_18_0= ruleSlave ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_scheduler_5_0 = null;

        AntlrDatatypeRuleToken lv_cpuAffinity_7_0 = null;

        AntlrDatatypeRuleToken lv_period_9_0 = null;

        AntlrDatatypeRuleToken lv_priority_11_0 = null;

        EObject lv_slave_16_0 = null;

        EObject lv_slave_18_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1091:28: ( ( () otherlv_1= 'Activity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'scheduler' ( (lv_scheduler_5_0= ruleScheduler ) ) )? (otherlv_6= 'cpuAffinity' ( (lv_cpuAffinity_7_0= ruleEString ) ) )? (otherlv_8= 'period' ( (lv_period_9_0= ruleEFloat ) ) )? (otherlv_10= 'priority' ( (lv_priority_11_0= ruleEInt ) ) )? (otherlv_12= 'taskContext' ( ( ruleEString ) ) )? (otherlv_14= 'slave' otherlv_15= '{' ( (lv_slave_16_0= ruleSlave ) ) (otherlv_17= ',' ( (lv_slave_18_0= ruleSlave ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1092:1: ( () otherlv_1= 'Activity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'scheduler' ( (lv_scheduler_5_0= ruleScheduler ) ) )? (otherlv_6= 'cpuAffinity' ( (lv_cpuAffinity_7_0= ruleEString ) ) )? (otherlv_8= 'period' ( (lv_period_9_0= ruleEFloat ) ) )? (otherlv_10= 'priority' ( (lv_priority_11_0= ruleEInt ) ) )? (otherlv_12= 'taskContext' ( ( ruleEString ) ) )? (otherlv_14= 'slave' otherlv_15= '{' ( (lv_slave_16_0= ruleSlave ) ) (otherlv_17= ',' ( (lv_slave_18_0= ruleSlave ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1092:1: ( () otherlv_1= 'Activity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'scheduler' ( (lv_scheduler_5_0= ruleScheduler ) ) )? (otherlv_6= 'cpuAffinity' ( (lv_cpuAffinity_7_0= ruleEString ) ) )? (otherlv_8= 'period' ( (lv_period_9_0= ruleEFloat ) ) )? (otherlv_10= 'priority' ( (lv_priority_11_0= ruleEInt ) ) )? (otherlv_12= 'taskContext' ( ( ruleEString ) ) )? (otherlv_14= 'slave' otherlv_15= '{' ( (lv_slave_16_0= ruleSlave ) ) (otherlv_17= ',' ( (lv_slave_18_0= ruleSlave ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1092:2: () otherlv_1= 'Activity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'scheduler' ( (lv_scheduler_5_0= ruleScheduler ) ) )? (otherlv_6= 'cpuAffinity' ( (lv_cpuAffinity_7_0= ruleEString ) ) )? (otherlv_8= 'period' ( (lv_period_9_0= ruleEFloat ) ) )? (otherlv_10= 'priority' ( (lv_priority_11_0= ruleEInt ) ) )? (otherlv_12= 'taskContext' ( ( ruleEString ) ) )? (otherlv_14= 'slave' otherlv_15= '{' ( (lv_slave_16_0= ruleSlave ) ) (otherlv_17= ',' ( (lv_slave_18_0= ruleSlave ) ) )* otherlv_19= '}' )? otherlv_20= '}'
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1092:2: ()
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1093:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getActivityAccess().getActivityAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleActivity2213); 

                	newLeafNode(otherlv_1, grammarAccess.getActivityAccess().getActivityKeyword_1());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1102:1: ( (lv_name_2_0= ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1103:1: (lv_name_2_0= ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1103:1: (lv_name_2_0= ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1104:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getActivityAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleActivity2234);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActivityRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleActivity2246); 

                	newLeafNode(otherlv_3, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_3());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1124:1: (otherlv_4= 'scheduler' ( (lv_scheduler_5_0= ruleScheduler ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==42) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1124:3: otherlv_4= 'scheduler' ( (lv_scheduler_5_0= ruleScheduler ) )
                    {
                    otherlv_4=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleActivity2259); 

                        	newLeafNode(otherlv_4, grammarAccess.getActivityAccess().getSchedulerKeyword_4_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1128:1: ( (lv_scheduler_5_0= ruleScheduler ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1129:1: (lv_scheduler_5_0= ruleScheduler )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1129:1: (lv_scheduler_5_0= ruleScheduler )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1130:3: lv_scheduler_5_0= ruleScheduler
                    {
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getSchedulerSchedulerEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleScheduler_in_ruleActivity2280);
                    lv_scheduler_5_0=ruleScheduler();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	        }
                           		set(
                           			current, 
                           			"scheduler",
                            		lv_scheduler_5_0, 
                            		"Scheduler");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1146:4: (otherlv_6= 'cpuAffinity' ( (lv_cpuAffinity_7_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==43) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1146:6: otherlv_6= 'cpuAffinity' ( (lv_cpuAffinity_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleActivity2295); 

                        	newLeafNode(otherlv_6, grammarAccess.getActivityAccess().getCpuAffinityKeyword_5_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1150:1: ( (lv_cpuAffinity_7_0= ruleEString ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1151:1: (lv_cpuAffinity_7_0= ruleEString )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1151:1: (lv_cpuAffinity_7_0= ruleEString )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1152:3: lv_cpuAffinity_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getCpuAffinityEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleActivity2316);
                    lv_cpuAffinity_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	        }
                           		set(
                           			current, 
                           			"cpuAffinity",
                            		lv_cpuAffinity_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1168:4: (otherlv_8= 'period' ( (lv_period_9_0= ruleEFloat ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==44) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1168:6: otherlv_8= 'period' ( (lv_period_9_0= ruleEFloat ) )
                    {
                    otherlv_8=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleActivity2331); 

                        	newLeafNode(otherlv_8, grammarAccess.getActivityAccess().getPeriodKeyword_6_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1172:1: ( (lv_period_9_0= ruleEFloat ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1173:1: (lv_period_9_0= ruleEFloat )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1173:1: (lv_period_9_0= ruleEFloat )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1174:3: lv_period_9_0= ruleEFloat
                    {
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getPeriodEFloatParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_ruleActivity2352);
                    lv_period_9_0=ruleEFloat();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	        }
                           		set(
                           			current, 
                           			"period",
                            		lv_period_9_0, 
                            		"EFloat");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1190:4: (otherlv_10= 'priority' ( (lv_priority_11_0= ruleEInt ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==45) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1190:6: otherlv_10= 'priority' ( (lv_priority_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleActivity2367); 

                        	newLeafNode(otherlv_10, grammarAccess.getActivityAccess().getPriorityKeyword_7_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1194:1: ( (lv_priority_11_0= ruleEInt ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1195:1: (lv_priority_11_0= ruleEInt )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1195:1: (lv_priority_11_0= ruleEInt )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1196:3: lv_priority_11_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getPriorityEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleActivity2388);
                    lv_priority_11_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	        }
                           		set(
                           			current, 
                           			"priority",
                            		lv_priority_11_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1212:4: (otherlv_12= 'taskContext' ( ( ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==46) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1212:6: otherlv_12= 'taskContext' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleActivity2403); 

                        	newLeafNode(otherlv_12, grammarAccess.getActivityAccess().getTaskContextKeyword_8_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1216:1: ( ( ruleEString ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1217:1: ( ruleEString )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1217:1: ( ruleEString )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1218:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActivityRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getTaskContextTaskContextCrossReference_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleActivity2426);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1231:4: (otherlv_14= 'slave' otherlv_15= '{' ( (lv_slave_16_0= ruleSlave ) ) (otherlv_17= ',' ( (lv_slave_18_0= ruleSlave ) ) )* otherlv_19= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==47) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1231:6: otherlv_14= 'slave' otherlv_15= '{' ( (lv_slave_16_0= ruleSlave ) ) (otherlv_17= ',' ( (lv_slave_18_0= ruleSlave ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleActivity2441); 

                        	newLeafNode(otherlv_14, grammarAccess.getActivityAccess().getSlaveKeyword_9_0());
                        
                    otherlv_15=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleActivity2453); 

                        	newLeafNode(otherlv_15, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1239:1: ( (lv_slave_16_0= ruleSlave ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1240:1: (lv_slave_16_0= ruleSlave )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1240:1: (lv_slave_16_0= ruleSlave )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1241:3: lv_slave_16_0= ruleSlave
                    {
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getSlaveSlaveParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSlave_in_ruleActivity2474);
                    lv_slave_16_0=ruleSlave();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	        }
                           		add(
                           			current, 
                           			"slave",
                            		lv_slave_16_0, 
                            		"Slave");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1257:2: (otherlv_17= ',' ( (lv_slave_18_0= ruleSlave ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==14) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1257:4: otherlv_17= ',' ( (lv_slave_18_0= ruleSlave ) )
                    	    {
                    	    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleActivity2487); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getActivityAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1261:1: ( (lv_slave_18_0= ruleSlave ) )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1262:1: (lv_slave_18_0= ruleSlave )
                    	    {
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1262:1: (lv_slave_18_0= ruleSlave )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1263:3: lv_slave_18_0= ruleSlave
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getSlaveSlaveParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSlave_in_ruleActivity2508);
                    	    lv_slave_18_0=ruleSlave();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"slave",
                    	            		lv_slave_18_0, 
                    	            		"Slave");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleActivity2522); 

                        	newLeafNode(otherlv_19, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            otherlv_20=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleActivity2536); 

                	newLeafNode(otherlv_20, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_10());
                

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


    // $ANTLR start "entryRuleInputPort_Impl"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1295:1: entryRuleInputPort_Impl returns [EObject current=null] : iv_ruleInputPort_Impl= ruleInputPort_Impl EOF ;
    public final EObject entryRuleInputPort_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputPort_Impl = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1296:2: (iv_ruleInputPort_Impl= ruleInputPort_Impl EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1297:2: iv_ruleInputPort_Impl= ruleInputPort_Impl EOF
            {
             newCompositeNode(grammarAccess.getInputPort_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputPort_Impl_in_entryRuleInputPort_Impl2572);
            iv_ruleInputPort_Impl=ruleInputPort_Impl();

            state._fsp--;

             current =iv_ruleInputPort_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputPort_Impl2582); 

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
    // $ANTLR end "entryRuleInputPort_Impl"


    // $ANTLR start "ruleInputPort_Impl"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1304:1: ruleInputPort_Impl returns [EObject current=null] : ( () otherlv_1= 'InputPort' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleInputPort_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1307:28: ( ( () otherlv_1= 'InputPort' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_6= '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1308:1: ( () otherlv_1= 'InputPort' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_6= '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1308:1: ( () otherlv_1= 'InputPort' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_6= '}' )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1308:2: () otherlv_1= 'InputPort' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_6= '}'
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1308:2: ()
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1309:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputPort_ImplAccess().getInputPortAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleInputPort_Impl2628); 

                	newLeafNode(otherlv_1, grammarAccess.getInputPort_ImplAccess().getInputPortKeyword_1());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1318:1: ( (lv_name_2_0= ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1319:1: (lv_name_2_0= ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1319:1: (lv_name_2_0= ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1320:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputPort_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputPort_Impl2649);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInputPort_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleInputPort_Impl2661); 

                	newLeafNode(otherlv_3, grammarAccess.getInputPort_ImplAccess().getLeftCurlyBracketKeyword_3());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1340:1: (otherlv_4= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==49) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1340:3: otherlv_4= 'dataType' ( ( ruleQualifiedNameWithDot ) )
                    {
                    otherlv_4=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleInputPort_Impl2674); 

                        	newLeafNode(otherlv_4, grammarAccess.getInputPort_ImplAccess().getDataTypeKeyword_4_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1344:1: ( ( ruleQualifiedNameWithDot ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1345:1: ( ruleQualifiedNameWithDot )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1345:1: ( ruleQualifiedNameWithDot )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1346:3: ruleQualifiedNameWithDot
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputPort_ImplRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getInputPort_ImplAccess().getDataTypeDataTypeCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_ruleInputPort_Impl2697);
                    ruleQualifiedNameWithDot();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInputPort_Impl2711); 

                	newLeafNode(otherlv_6, grammarAccess.getInputPort_ImplAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleInputPort_Impl"


    // $ANTLR start "entryRuleEventPort"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1371:1: entryRuleEventPort returns [EObject current=null] : iv_ruleEventPort= ruleEventPort EOF ;
    public final EObject entryRuleEventPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventPort = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1372:2: (iv_ruleEventPort= ruleEventPort EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1373:2: iv_ruleEventPort= ruleEventPort EOF
            {
             newCompositeNode(grammarAccess.getEventPortRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEventPort_in_entryRuleEventPort2747);
            iv_ruleEventPort=ruleEventPort();

            state._fsp--;

             current =iv_ruleEventPort; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEventPort2757); 

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
    // $ANTLR end "entryRuleEventPort"


    // $ANTLR start "ruleEventPort"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1380:1: ruleEventPort returns [EObject current=null] : ( () otherlv_1= 'EventPort' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleEventPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1383:28: ( ( () otherlv_1= 'EventPort' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_6= '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1384:1: ( () otherlv_1= 'EventPort' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_6= '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1384:1: ( () otherlv_1= 'EventPort' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_6= '}' )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1384:2: () otherlv_1= 'EventPort' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_6= '}'
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1384:2: ()
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1385:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEventPortAccess().getEventPortAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleEventPort2803); 

                	newLeafNode(otherlv_1, grammarAccess.getEventPortAccess().getEventPortKeyword_1());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1394:1: ( (lv_name_2_0= ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1395:1: (lv_name_2_0= ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1395:1: (lv_name_2_0= ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1396:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEventPortAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEventPort2824);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEventPortRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEventPort2836); 

                	newLeafNode(otherlv_3, grammarAccess.getEventPortAccess().getLeftCurlyBracketKeyword_3());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1416:1: (otherlv_4= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==49) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1416:3: otherlv_4= 'dataType' ( ( ruleQualifiedNameWithDot ) )
                    {
                    otherlv_4=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleEventPort2849); 

                        	newLeafNode(otherlv_4, grammarAccess.getEventPortAccess().getDataTypeKeyword_4_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1420:1: ( ( ruleQualifiedNameWithDot ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1421:1: ( ruleQualifiedNameWithDot )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1421:1: ( ruleQualifiedNameWithDot )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1422:3: ruleQualifiedNameWithDot
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventPortRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEventPortAccess().getDataTypeDataTypeCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_ruleEventPort2872);
                    ruleQualifiedNameWithDot();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEventPort2886); 

                	newLeafNode(otherlv_6, grammarAccess.getEventPortAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleEventPort"


    // $ANTLR start "entryRuleOutputPort"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1447:1: entryRuleOutputPort returns [EObject current=null] : iv_ruleOutputPort= ruleOutputPort EOF ;
    public final EObject entryRuleOutputPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputPort = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1448:2: (iv_ruleOutputPort= ruleOutputPort EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1449:2: iv_ruleOutputPort= ruleOutputPort EOF
            {
             newCompositeNode(grammarAccess.getOutputPortRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOutputPort_in_entryRuleOutputPort2922);
            iv_ruleOutputPort=ruleOutputPort();

            state._fsp--;

             current =iv_ruleOutputPort; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOutputPort2932); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1456:1: ruleOutputPort returns [EObject current=null] : ( () otherlv_1= 'OutputPort' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleOutputPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1459:28: ( ( () otherlv_1= 'OutputPort' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_6= '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1460:1: ( () otherlv_1= 'OutputPort' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_6= '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1460:1: ( () otherlv_1= 'OutputPort' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_6= '}' )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1460:2: () otherlv_1= 'OutputPort' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_6= '}'
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1460:2: ()
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1461:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOutputPortAccess().getOutputPortAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleOutputPort2978); 

                	newLeafNode(otherlv_1, grammarAccess.getOutputPortAccess().getOutputPortKeyword_1());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1470:1: ( (lv_name_2_0= ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1471:1: (lv_name_2_0= ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1471:1: (lv_name_2_0= ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1472:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOutputPortAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOutputPort2999);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOutputPortRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOutputPort3011); 

                	newLeafNode(otherlv_3, grammarAccess.getOutputPortAccess().getLeftCurlyBracketKeyword_3());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1492:1: (otherlv_4= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==49) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1492:3: otherlv_4= 'dataType' ( ( ruleQualifiedNameWithDot ) )
                    {
                    otherlv_4=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleOutputPort3024); 

                        	newLeafNode(otherlv_4, grammarAccess.getOutputPortAccess().getDataTypeKeyword_4_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1496:1: ( ( ruleQualifiedNameWithDot ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1497:1: ( ruleQualifiedNameWithDot )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1497:1: ( ruleQualifiedNameWithDot )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1498:3: ruleQualifiedNameWithDot
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getOutputPortRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getOutputPortAccess().getDataTypeDataTypeCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_ruleOutputPort3047);
                    ruleQualifiedNameWithDot();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOutputPort3061); 

                	newLeafNode(otherlv_6, grammarAccess.getOutputPortAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1523:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1524:2: (iv_ruleProperty= ruleProperty EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1525:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_entryRuleProperty3097);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProperty3107); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1532:1: ruleProperty returns [EObject current=null] : ( () otherlv_1= 'Property' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= ruleEString ) ) )? (otherlv_8= 'type' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_10= '}' ) ;
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
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1535:28: ( ( () otherlv_1= 'Property' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= ruleEString ) ) )? (otherlv_8= 'type' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_10= '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1536:1: ( () otherlv_1= 'Property' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= ruleEString ) ) )? (otherlv_8= 'type' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_10= '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1536:1: ( () otherlv_1= 'Property' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= ruleEString ) ) )? (otherlv_8= 'type' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_10= '}' )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1536:2: () otherlv_1= 'Property' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= ruleEString ) ) )? (otherlv_8= 'type' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_10= '}'
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1536:2: ()
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1537:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPropertyAccess().getPropertyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleProperty3153); 

                	newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getPropertyKeyword_1());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1546:1: ( (lv_name_2_0= ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1547:1: (lv_name_2_0= ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1547:1: (lv_name_2_0= ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1548:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProperty3174);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleProperty3186); 

                	newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_3());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1568:1: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==53) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1568:3: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleProperty3199); 

                        	newLeafNode(otherlv_4, grammarAccess.getPropertyAccess().getDescriptionKeyword_4_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1572:1: ( (lv_description_5_0= ruleEString ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1573:1: (lv_description_5_0= ruleEString )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1573:1: (lv_description_5_0= ruleEString )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1574:3: lv_description_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProperty3220);
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

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1590:4: (otherlv_6= 'value' ( (lv_value_7_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==54) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1590:6: otherlv_6= 'value' ( (lv_value_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleProperty3235); 

                        	newLeafNode(otherlv_6, grammarAccess.getPropertyAccess().getValueKeyword_5_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1594:1: ( (lv_value_7_0= ruleEString ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1595:1: (lv_value_7_0= ruleEString )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1595:1: (lv_value_7_0= ruleEString )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1596:3: lv_value_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyAccess().getValueEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProperty3256);
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

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1612:4: (otherlv_8= 'type' ( ( ruleQualifiedNameWithDot ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==20) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1612:6: otherlv_8= 'type' ( ( ruleQualifiedNameWithDot ) )
                    {
                    otherlv_8=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleProperty3271); 

                        	newLeafNode(otherlv_8, grammarAccess.getPropertyAccess().getTypeKeyword_6_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1616:1: ( ( ruleQualifiedNameWithDot ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1617:1: ( ruleQualifiedNameWithDot )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1617:1: ( ruleQualifiedNameWithDot )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1618:3: ruleQualifiedNameWithDot
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPropertyRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getPropertyAccess().getTypeDataTypeCrossReference_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_ruleProperty3294);
                    ruleQualifiedNameWithDot();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleProperty3308); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1643:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1644:2: (iv_ruleOperation= ruleOperation EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1645:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_entryRuleOperation3344);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperation3354); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1652:1: ruleOperation returns [EObject current=null] : ( () otherlv_1= 'Operation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'documentation' ( (lv_documentation_5_0= ruleEString ) ) )? (otherlv_6= 'returnType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_8= '}' ) ;
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
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1655:28: ( ( () otherlv_1= 'Operation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'documentation' ( (lv_documentation_5_0= ruleEString ) ) )? (otherlv_6= 'returnType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_8= '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1656:1: ( () otherlv_1= 'Operation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'documentation' ( (lv_documentation_5_0= ruleEString ) ) )? (otherlv_6= 'returnType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_8= '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1656:1: ( () otherlv_1= 'Operation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'documentation' ( (lv_documentation_5_0= ruleEString ) ) )? (otherlv_6= 'returnType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_8= '}' )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1656:2: () otherlv_1= 'Operation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'documentation' ( (lv_documentation_5_0= ruleEString ) ) )? (otherlv_6= 'returnType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_8= '}'
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1656:2: ()
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1657:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOperationAccess().getOperationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleOperation3400); 

                	newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getOperationKeyword_1());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1666:1: ( (lv_name_2_0= ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1667:1: (lv_name_2_0= ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1667:1: (lv_name_2_0= ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1668:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOperationAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOperation3421);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOperation3433); 

                	newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_3());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1688:1: (otherlv_4= 'documentation' ( (lv_documentation_5_0= ruleEString ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==56) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1688:3: otherlv_4= 'documentation' ( (lv_documentation_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleOperation3446); 

                        	newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getDocumentationKeyword_4_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1692:1: ( (lv_documentation_5_0= ruleEString ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1693:1: (lv_documentation_5_0= ruleEString )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1693:1: (lv_documentation_5_0= ruleEString )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1694:3: lv_documentation_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOperationAccess().getDocumentationEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOperation3467);
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

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1710:4: (otherlv_6= 'returnType' ( ( ruleQualifiedNameWithDot ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==57) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1710:6: otherlv_6= 'returnType' ( ( ruleQualifiedNameWithDot ) )
                    {
                    otherlv_6=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleOperation3482); 

                        	newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getReturnTypeKeyword_5_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1714:1: ( ( ruleQualifiedNameWithDot ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1715:1: ( ruleQualifiedNameWithDot )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1715:1: ( ruleQualifiedNameWithDot )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1716:3: ruleQualifiedNameWithDot
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getOperationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getOperationAccess().getReturnTypeDataTypeCrossReference_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_ruleOperation3505);
                    ruleQualifiedNameWithDot();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOperation3519); 

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


    // $ANTLR start "entryRuleSlave"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1741:1: entryRuleSlave returns [EObject current=null] : iv_ruleSlave= ruleSlave EOF ;
    public final EObject entryRuleSlave() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlave = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1742:2: (iv_ruleSlave= ruleSlave EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1743:2: iv_ruleSlave= ruleSlave EOF
            {
             newCompositeNode(grammarAccess.getSlaveRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSlave_in_entryRuleSlave3555);
            iv_ruleSlave=ruleSlave();

            state._fsp--;

             current =iv_ruleSlave; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSlave3565); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1750:1: ruleSlave returns [EObject current=null] : ( () otherlv_1= 'Slave' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'taskContext' ( ( ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleSlave() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1753:28: ( ( () otherlv_1= 'Slave' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'taskContext' ( ( ruleEString ) ) )? otherlv_6= '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1754:1: ( () otherlv_1= 'Slave' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'taskContext' ( ( ruleEString ) ) )? otherlv_6= '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1754:1: ( () otherlv_1= 'Slave' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'taskContext' ( ( ruleEString ) ) )? otherlv_6= '}' )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1754:2: () otherlv_1= 'Slave' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'taskContext' ( ( ruleEString ) ) )? otherlv_6= '}'
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1754:2: ()
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1755:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSlaveAccess().getSlaveAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleSlave3611); 

                	newLeafNode(otherlv_1, grammarAccess.getSlaveAccess().getSlaveKeyword_1());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1764:1: ( (lv_name_2_0= ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1765:1: (lv_name_2_0= ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1765:1: (lv_name_2_0= ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1766:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSlaveAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSlave3632);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSlave3644); 

                	newLeafNode(otherlv_3, grammarAccess.getSlaveAccess().getLeftCurlyBracketKeyword_3());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1786:1: (otherlv_4= 'taskContext' ( ( ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==46) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1786:3: otherlv_4= 'taskContext' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleSlave3657); 

                        	newLeafNode(otherlv_4, grammarAccess.getSlaveAccess().getTaskContextKeyword_4_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1790:1: ( ( ruleEString ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1791:1: ( ruleEString )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1791:1: ( ruleEString )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1792:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSlaveRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSlaveAccess().getTaskContextTaskContextCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSlave3680);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSlave3694); 

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


    // $ANTLR start "entryRuleEFloat"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1817:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1818:2: (iv_ruleEFloat= ruleEFloat EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1819:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_entryRuleEFloat3731);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEFloat3742); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1826:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;

         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1829:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1830:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1830:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1830:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1830:2: (kw= '-' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==59) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1831:2: kw= '-'
                    {
                    kw=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleEFloat3781); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1836:3: (this_INT_1= RULE_INT )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_INT) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1836:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat3799); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleEFloat3819); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat3834); 

            		current.merge(this_INT_3);
                
             
                newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1856:1: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=61 && LA49_0<=62)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1856:2: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1856:2: (kw= 'E' | kw= 'e' )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==61) ) {
                        alt47=1;
                    }
                    else if ( (LA47_0==62) ) {
                        alt47=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;
                    }
                    switch (alt47) {
                        case 1 :
                            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1857:2: kw= 'E'
                            {
                            kw=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleEFloat3854); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1864:2: kw= 'e'
                            {
                            kw=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleEFloat3873); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                                

                            }
                            break;

                    }

                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1869:2: (kw= '-' )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==59) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1870:2: kw= '-'
                            {
                            kw=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleEFloat3888); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
                                

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat3905); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1890:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1891:2: (iv_ruleEInt= ruleEInt EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1892:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt3953);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt3964); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1899:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1902:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1903:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1903:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1903:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1903:2: (kw= '-' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==59) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1904:2: kw= '-'
                    {
                    kw=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleEInt4003); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt4020); 

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


    // $ANTLR start "entryRuleEShort"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1924:1: entryRuleEShort returns [String current=null] : iv_ruleEShort= ruleEShort EOF ;
    public final String entryRuleEShort() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEShort = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1925:2: (iv_ruleEShort= ruleEShort EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1926:2: iv_ruleEShort= ruleEShort EOF
            {
             newCompositeNode(grammarAccess.getEShortRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEShort_in_entryRuleEShort4066);
            iv_ruleEShort=ruleEShort();

            state._fsp--;

             current =iv_ruleEShort.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEShort4077); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1933:1: ruleEShort returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEShort() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1936:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1937:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1937:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1937:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1937:2: (kw= '-' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==59) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1938:2: kw= '-'
                    {
                    kw=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleEShort4116); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEShortAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEShort4133); 

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


    // $ANTLR start "entryRuleQualifiedName"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1958:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1959:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1960:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName4179);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedName4190); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1967:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1970:28: ( (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1971:1: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1971:1: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1971:6: this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName4230); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1978:1: (kw= '::' this_ID_2= RULE_ID )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==63) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1979:2: kw= '::' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleQualifiedName4249); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName4264); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop52;
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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:1999:1: entryRuleQualifiedNameWithDot returns [String current=null] : iv_ruleQualifiedNameWithDot= ruleQualifiedNameWithDot EOF ;
    public final String entryRuleQualifiedNameWithDot() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithDot = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2000:2: (iv_ruleQualifiedNameWithDot= ruleQualifiedNameWithDot EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2001:2: iv_ruleQualifiedNameWithDot= ruleQualifiedNameWithDot EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithDotRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_entryRuleQualifiedNameWithDot4312);
            iv_ruleQualifiedNameWithDot=ruleQualifiedNameWithDot();

            state._fsp--;

             current =iv_ruleQualifiedNameWithDot.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedNameWithDot4323); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2008:1: ruleQualifiedNameWithDot returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithDot() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2011:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2012:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2012:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )* )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2013:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )*
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithDotAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithDot4370);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2023:1: (kw= '.' this_ID_2= RULE_ID )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==60) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2024:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleQualifiedNameWithDot4389); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameWithDotAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedNameWithDot4404); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameWithDotAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop53;
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


    // $ANTLR start "ruleScheduler"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2044:1: ruleScheduler returns [Enumerator current=null] : ( (enumLiteral_0= 'ORO_SCHED_OTHER' ) | (enumLiteral_1= 'ORO_SCHED_RT' ) ) ;
    public final Enumerator ruleScheduler() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2046:28: ( ( (enumLiteral_0= 'ORO_SCHED_OTHER' ) | (enumLiteral_1= 'ORO_SCHED_RT' ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2047:1: ( (enumLiteral_0= 'ORO_SCHED_OTHER' ) | (enumLiteral_1= 'ORO_SCHED_RT' ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2047:1: ( (enumLiteral_0= 'ORO_SCHED_OTHER' ) | (enumLiteral_1= 'ORO_SCHED_RT' ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==64) ) {
                alt54=1;
            }
            else if ( (LA54_0==65) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2047:2: (enumLiteral_0= 'ORO_SCHED_OTHER' )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2047:2: (enumLiteral_0= 'ORO_SCHED_OTHER' )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2047:4: enumLiteral_0= 'ORO_SCHED_OTHER'
                    {
                    enumLiteral_0=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleScheduler4465); 

                            current = grammarAccess.getSchedulerAccess().getORO_SCHED_OTHEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSchedulerAccess().getORO_SCHED_OTHEREnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2053:6: (enumLiteral_1= 'ORO_SCHED_RT' )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2053:6: (enumLiteral_1= 'ORO_SCHED_RT' )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2053:8: enumLiteral_1= 'ORO_SCHED_RT'
                    {
                    enumLiteral_1=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleScheduler4482); 

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


    // $ANTLR start "ruleConnectionPolicyLockPolicy"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2063:1: ruleConnectionPolicyLockPolicy returns [Enumerator current=null] : ( (enumLiteral_0= 'UNSYNC' ) | (enumLiteral_1= 'LOCKED' ) | (enumLiteral_2= 'LOCK_FREE' ) ) ;
    public final Enumerator ruleConnectionPolicyLockPolicy() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2065:28: ( ( (enumLiteral_0= 'UNSYNC' ) | (enumLiteral_1= 'LOCKED' ) | (enumLiteral_2= 'LOCK_FREE' ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2066:1: ( (enumLiteral_0= 'UNSYNC' ) | (enumLiteral_1= 'LOCKED' ) | (enumLiteral_2= 'LOCK_FREE' ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2066:1: ( (enumLiteral_0= 'UNSYNC' ) | (enumLiteral_1= 'LOCKED' ) | (enumLiteral_2= 'LOCK_FREE' ) )
            int alt55=3;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt55=1;
                }
                break;
            case 67:
                {
                alt55=2;
                }
                break;
            case 68:
                {
                alt55=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2066:2: (enumLiteral_0= 'UNSYNC' )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2066:2: (enumLiteral_0= 'UNSYNC' )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2066:4: enumLiteral_0= 'UNSYNC'
                    {
                    enumLiteral_0=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleConnectionPolicyLockPolicy4527); 

                            current = grammarAccess.getConnectionPolicyLockPolicyAccess().getUNSYNCEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getConnectionPolicyLockPolicyAccess().getUNSYNCEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2072:6: (enumLiteral_1= 'LOCKED' )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2072:6: (enumLiteral_1= 'LOCKED' )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2072:8: enumLiteral_1= 'LOCKED'
                    {
                    enumLiteral_1=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleConnectionPolicyLockPolicy4544); 

                            current = grammarAccess.getConnectionPolicyLockPolicyAccess().getLOCKEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getConnectionPolicyLockPolicyAccess().getLOCKEDEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2078:6: (enumLiteral_2= 'LOCK_FREE' )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2078:6: (enumLiteral_2= 'LOCK_FREE' )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2078:8: enumLiteral_2= 'LOCK_FREE'
                    {
                    enumLiteral_2=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleConnectionPolicyLockPolicy4561); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2088:1: ruleConnectionPolicyType returns [Enumerator current=null] : ( (enumLiteral_0= 'DATA' ) | (enumLiteral_1= 'BUFFER' ) | (enumLiteral_2= 'CIRCULAR_BUFFER' ) ) ;
    public final Enumerator ruleConnectionPolicyType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2090:28: ( ( (enumLiteral_0= 'DATA' ) | (enumLiteral_1= 'BUFFER' ) | (enumLiteral_2= 'CIRCULAR_BUFFER' ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2091:1: ( (enumLiteral_0= 'DATA' ) | (enumLiteral_1= 'BUFFER' ) | (enumLiteral_2= 'CIRCULAR_BUFFER' ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2091:1: ( (enumLiteral_0= 'DATA' ) | (enumLiteral_1= 'BUFFER' ) | (enumLiteral_2= 'CIRCULAR_BUFFER' ) )
            int alt56=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt56=1;
                }
                break;
            case 70:
                {
                alt56=2;
                }
                break;
            case 71:
                {
                alt56=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2091:2: (enumLiteral_0= 'DATA' )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2091:2: (enumLiteral_0= 'DATA' )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2091:4: enumLiteral_0= 'DATA'
                    {
                    enumLiteral_0=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleConnectionPolicyType4606); 

                            current = grammarAccess.getConnectionPolicyTypeAccess().getDATAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getConnectionPolicyTypeAccess().getDATAEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2097:6: (enumLiteral_1= 'BUFFER' )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2097:6: (enumLiteral_1= 'BUFFER' )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2097:8: enumLiteral_1= 'BUFFER'
                    {
                    enumLiteral_1=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleConnectionPolicyType4623); 

                            current = grammarAccess.getConnectionPolicyTypeAccess().getBUFFEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getConnectionPolicyTypeAccess().getBUFFEREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2103:6: (enumLiteral_2= 'CIRCULAR_BUFFER' )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2103:6: (enumLiteral_2= 'CIRCULAR_BUFFER' )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2103:8: enumLiteral_2= 'CIRCULAR_BUFFER'
                    {
                    enumLiteral_2=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleConnectionPolicyType4640); 

                            current = grammarAccess.getConnectionPolicyTypeAccess().getCIRCULAR_BUFFEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getConnectionPolicyTypeAccess().getCIRCULAR_BUFFEREnumLiteralDeclaration_2()); 
                        

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


    // $ANTLR start "ruleConnectionPolicyTransport"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2113:1: ruleConnectionPolicyTransport returns [Enumerator current=null] : ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'CORBA' ) | (enumLiteral_2= 'MQUEUE' ) | (enumLiteral_3= 'ROS' ) ) ;
    public final Enumerator ruleConnectionPolicyTransport() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2115:28: ( ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'CORBA' ) | (enumLiteral_2= 'MQUEUE' ) | (enumLiteral_3= 'ROS' ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2116:1: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'CORBA' ) | (enumLiteral_2= 'MQUEUE' ) | (enumLiteral_3= 'ROS' ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2116:1: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'CORBA' ) | (enumLiteral_2= 'MQUEUE' ) | (enumLiteral_3= 'ROS' ) )
            int alt57=4;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt57=1;
                }
                break;
            case 73:
                {
                alt57=2;
                }
                break;
            case 74:
                {
                alt57=3;
                }
                break;
            case 75:
                {
                alt57=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2116:2: (enumLiteral_0= 'default' )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2116:2: (enumLiteral_0= 'default' )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2116:4: enumLiteral_0= 'default'
                    {
                    enumLiteral_0=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleConnectionPolicyTransport4685); 

                            current = grammarAccess.getConnectionPolicyTransportAccess().getDefaultEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getConnectionPolicyTransportAccess().getDefaultEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2122:6: (enumLiteral_1= 'CORBA' )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2122:6: (enumLiteral_1= 'CORBA' )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2122:8: enumLiteral_1= 'CORBA'
                    {
                    enumLiteral_1=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleConnectionPolicyTransport4702); 

                            current = grammarAccess.getConnectionPolicyTransportAccess().getCORBAEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getConnectionPolicyTransportAccess().getCORBAEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2128:6: (enumLiteral_2= 'MQUEUE' )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2128:6: (enumLiteral_2= 'MQUEUE' )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2128:8: enumLiteral_2= 'MQUEUE'
                    {
                    enumLiteral_2=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleConnectionPolicyTransport4719); 

                            current = grammarAccess.getConnectionPolicyTransportAccess().getMQUEUEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getConnectionPolicyTransportAccess().getMQUEUEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2134:6: (enumLiteral_3= 'ROS' )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2134:6: (enumLiteral_3= 'ROS' )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttDsl.g:2134:8: enumLiteral_3= 'ROS'
                    {
                    enumLiteral_3=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruleConnectionPolicyTransport4736); 

                            current = grammarAccess.getConnectionPolicyTransportAccess().getROSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getConnectionPolicyTransportAccess().getROSEnumLiteralDeclaration_3()); 
                        

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
    // $ANTLR end "ruleConnectionPolicyTransport"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleOrocosPackage_in_entryRuleOrocosPackage75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrocosPackage85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleOrocosPackage131 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOrocosPackage152 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOrocosPackage164 = new BitSet(new long[]{0x000000000003A000L});
        public static final BitSet FOLLOW_13_in_ruleOrocosPackage177 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOrocosPackage189 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleTaskContext_in_ruleOrocosPackage210 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleOrocosPackage223 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleTaskContext_in_ruleOrocosPackage244 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleOrocosPackage258 = new BitSet(new long[]{0x0000000000038000L});
        public static final BitSet FOLLOW_16_in_ruleOrocosPackage273 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOrocosPackage285 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleConnectionPolicy_in_ruleOrocosPackage306 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleOrocosPackage319 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleConnectionPolicy_in_ruleOrocosPackage340 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleOrocosPackage354 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_17_in_ruleOrocosPackage369 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOrocosPackage381 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rulePeerGroup_in_ruleOrocosPackage402 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleOrocosPackage415 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rulePeerGroup_in_ruleOrocosPackage436 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleOrocosPackage450 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleOrocosPackage464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputPort_in_entryRuleInputPort500 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputPort510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputPort_Impl_in_ruleInputPort557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEventPort_in_ruleInputPort584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString620 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTaskContext_in_entryRuleTaskContext742 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTaskContext752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleTaskContext789 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTaskContext810 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTaskContext822 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleTaskContext834 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTaskContext855 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleTaskContext867 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTaskContext888 = new BitSet(new long[]{0x0000000007E08000L});
        public static final BitSet FOLLOW_21_in_ruleTaskContext901 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_ruleActivity_in_ruleTaskContext922 = new BitSet(new long[]{0x0000000007C08000L});
        public static final BitSet FOLLOW_22_in_ruleTaskContext937 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTaskContext949 = new BitSet(new long[]{0x0005000000000000L});
        public static final BitSet FOLLOW_ruleInputPort_in_ruleTaskContext970 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleTaskContext983 = new BitSet(new long[]{0x0005000000000000L});
        public static final BitSet FOLLOW_ruleInputPort_in_ruleTaskContext1004 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleTaskContext1018 = new BitSet(new long[]{0x0000000007808000L});
        public static final BitSet FOLLOW_23_in_ruleTaskContext1033 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTaskContext1045 = new BitSet(new long[]{0x0005000000000000L});
        public static final BitSet FOLLOW_ruleEventPort_in_ruleTaskContext1066 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleTaskContext1079 = new BitSet(new long[]{0x0005000000000000L});
        public static final BitSet FOLLOW_ruleEventPort_in_ruleTaskContext1100 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleTaskContext1114 = new BitSet(new long[]{0x0000000007008000L});
        public static final BitSet FOLLOW_24_in_ruleTaskContext1129 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTaskContext1141 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_ruleOutputPort_in_ruleTaskContext1162 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleTaskContext1175 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_ruleOutputPort_in_ruleTaskContext1196 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleTaskContext1210 = new BitSet(new long[]{0x0000000006008000L});
        public static final BitSet FOLLOW_25_in_ruleTaskContext1225 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTaskContext1237 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_ruleProperty_in_ruleTaskContext1258 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleTaskContext1271 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_ruleProperty_in_ruleTaskContext1292 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleTaskContext1306 = new BitSet(new long[]{0x0000000004008000L});
        public static final BitSet FOLLOW_26_in_ruleTaskContext1321 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTaskContext1333 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleTaskContext1354 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleTaskContext1367 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleTaskContext1388 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleTaskContext1402 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleTaskContext1416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConnectionPolicy_in_entryRuleConnectionPolicy1452 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConnectionPolicy1462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleConnectionPolicy1499 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConnectionPolicy1520 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleConnectionPolicy1532 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleConnectionPolicy1544 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConnectionPolicy1567 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleConnectionPolicy1579 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConnectionPolicy1602 = new BitSet(new long[]{0x0000000FC0108000L});
        public static final BitSet FOLLOW_30_in_ruleConnectionPolicy1615 = new BitSet(new long[]{0x0800000000000040L});
        public static final BitSet FOLLOW_ruleEShort_in_ruleConnectionPolicy1636 = new BitSet(new long[]{0x0000000F80108000L});
        public static final BitSet FOLLOW_31_in_ruleConnectionPolicy1651 = new BitSet(new long[]{0x0800000000000040L});
        public static final BitSet FOLLOW_ruleEShort_in_ruleConnectionPolicy1672 = new BitSet(new long[]{0x0000000F00108000L});
        public static final BitSet FOLLOW_32_in_ruleConnectionPolicy1687 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
        public static final BitSet FOLLOW_ruleConnectionPolicyLockPolicy_in_ruleConnectionPolicy1708 = new BitSet(new long[]{0x0000000E00108000L});
        public static final BitSet FOLLOW_33_in_ruleConnectionPolicy1723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000F00L});
        public static final BitSet FOLLOW_ruleConnectionPolicyTransport_in_ruleConnectionPolicy1744 = new BitSet(new long[]{0x0000000C00108000L});
        public static final BitSet FOLLOW_20_in_ruleConnectionPolicy1759 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000E0L});
        public static final BitSet FOLLOW_ruleConnectionPolicyType_in_ruleConnectionPolicy1780 = new BitSet(new long[]{0x0000000C00008000L});
        public static final BitSet FOLLOW_34_in_ruleConnectionPolicy1800 = new BitSet(new long[]{0x0000000800008000L});
        public static final BitSet FOLLOW_35_in_ruleConnectionPolicy1832 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleConnectionPolicy1858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePeerGroup_in_entryRulePeerGroup1894 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePeerGroup1904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rulePeerGroup1941 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePeerGroup1962 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePeerGroup1974 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_rulePeerGroup1986 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePeerGroup2009 = new BitSet(new long[]{0x0000004000008000L});
        public static final BitSet FOLLOW_38_in_rulePeerGroup2022 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_rulePeerGroup2034 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePeerGroup2057 = new BitSet(new long[]{0x0000010000004000L});
        public static final BitSet FOLLOW_14_in_rulePeerGroup2070 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePeerGroup2093 = new BitSet(new long[]{0x0000010000004000L});
        public static final BitSet FOLLOW_40_in_rulePeerGroup2107 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulePeerGroup2121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity2157 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleActivity2167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleActivity2213 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleActivity2234 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleActivity2246 = new BitSet(new long[]{0x0000FC0000008000L});
        public static final BitSet FOLLOW_42_in_ruleActivity2259 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleScheduler_in_ruleActivity2280 = new BitSet(new long[]{0x0000F80000008000L});
        public static final BitSet FOLLOW_43_in_ruleActivity2295 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleActivity2316 = new BitSet(new long[]{0x0000F00000008000L});
        public static final BitSet FOLLOW_44_in_ruleActivity2331 = new BitSet(new long[]{0x1800000000000040L});
        public static final BitSet FOLLOW_ruleEFloat_in_ruleActivity2352 = new BitSet(new long[]{0x0000E00000008000L});
        public static final BitSet FOLLOW_45_in_ruleActivity2367 = new BitSet(new long[]{0x0800000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleActivity2388 = new BitSet(new long[]{0x0000C00000008000L});
        public static final BitSet FOLLOW_46_in_ruleActivity2403 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleActivity2426 = new BitSet(new long[]{0x0000800000008000L});
        public static final BitSet FOLLOW_47_in_ruleActivity2441 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleActivity2453 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_ruleSlave_in_ruleActivity2474 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleActivity2487 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_ruleSlave_in_ruleActivity2508 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleActivity2522 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleActivity2536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputPort_Impl_in_entryRuleInputPort_Impl2572 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputPort_Impl2582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleInputPort_Impl2628 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputPort_Impl2649 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleInputPort_Impl2661 = new BitSet(new long[]{0x0002000000008000L});
        public static final BitSet FOLLOW_49_in_ruleInputPort_Impl2674 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_ruleInputPort_Impl2697 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleInputPort_Impl2711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEventPort_in_entryRuleEventPort2747 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEventPort2757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleEventPort2803 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEventPort2824 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEventPort2836 = new BitSet(new long[]{0x0002000000008000L});
        public static final BitSet FOLLOW_49_in_ruleEventPort2849 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_ruleEventPort2872 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleEventPort2886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOutputPort_in_entryRuleOutputPort2922 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOutputPort2932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleOutputPort2978 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOutputPort2999 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOutputPort3011 = new BitSet(new long[]{0x0002000000008000L});
        public static final BitSet FOLLOW_49_in_ruleOutputPort3024 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_ruleOutputPort3047 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleOutputPort3061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty3097 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProperty3107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleProperty3153 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProperty3174 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleProperty3186 = new BitSet(new long[]{0x0060000000108000L});
        public static final BitSet FOLLOW_53_in_ruleProperty3199 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProperty3220 = new BitSet(new long[]{0x0040000000108000L});
        public static final BitSet FOLLOW_54_in_ruleProperty3235 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProperty3256 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_20_in_ruleProperty3271 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_ruleProperty3294 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleProperty3308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation3344 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperation3354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleOperation3400 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOperation3421 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOperation3433 = new BitSet(new long[]{0x0300000000008000L});
        public static final BitSet FOLLOW_56_in_ruleOperation3446 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOperation3467 = new BitSet(new long[]{0x0200000000008000L});
        public static final BitSet FOLLOW_57_in_ruleOperation3482 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_ruleOperation3505 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleOperation3519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSlave_in_entryRuleSlave3555 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSlave3565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleSlave3611 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSlave3632 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSlave3644 = new BitSet(new long[]{0x0000400000008000L});
        public static final BitSet FOLLOW_46_in_ruleSlave3657 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSlave3680 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSlave3694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_entryRuleEFloat3731 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEFloat3742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleEFloat3781 = new BitSet(new long[]{0x1000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat3799 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_60_in_ruleEFloat3819 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat3834 = new BitSet(new long[]{0x6000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleEFloat3854 = new BitSet(new long[]{0x0800000000000040L});
        public static final BitSet FOLLOW_62_in_ruleEFloat3873 = new BitSet(new long[]{0x0800000000000040L});
        public static final BitSet FOLLOW_59_in_ruleEFloat3888 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat3905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt3953 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt3964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleEInt4003 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt4020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEShort_in_entryRuleEShort4066 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEShort4077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleEShort4116 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEShort4133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName4179 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName4190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName4230 = new BitSet(new long[]{0x8000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleQualifiedName4249 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName4264 = new BitSet(new long[]{0x8000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_entryRuleQualifiedNameWithDot4312 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithDot4323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithDot4370 = new BitSet(new long[]{0x1000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleQualifiedNameWithDot4389 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedNameWithDot4404 = new BitSet(new long[]{0x1000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleScheduler4465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleScheduler4482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleConnectionPolicyLockPolicy4527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleConnectionPolicyLockPolicy4544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleConnectionPolicyLockPolicy4561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleConnectionPolicyType4606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleConnectionPolicyType4623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleConnectionPolicyType4640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleConnectionPolicyTransport4685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleConnectionPolicyTransport4702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_ruleConnectionPolicyTransport4719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_ruleConnectionPolicyTransport4736 = new BitSet(new long[]{0x0000000000000002L});
    }


}