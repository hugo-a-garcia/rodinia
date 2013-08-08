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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'OrocosPackage'", "'{'", "'taskContexts'", "','", "'}'", "'connectionPolicies'", "'peerGroups'", "'TaskContext'", "'namespace'", "'type'", "'activity'", "'inputPorts'", "'eventPorts'", "'outputPorts'", "'properties'", "'operations'", "'PeerGroup'", "'coordinator'", "'members'", "'('", "')'", "'ConnectionPolicy'", "'inputPort'", "'outputPort'", "'init'", "'pull'", "'bufferSize'", "'dataSize'", "'lockPolicy'", "'transport'", "'InputPort'", "'dataType'", "'EventPort'", "'OutputPort'", "'Property'", "'description'", "'value'", "'Operation'", "'documentation'", "'returnType'", "'-'", "'Activity'", "'scheduler'", "'cpuAffinity'", "'period'", "'priority'", "'taskContext'", "'slave'", "'Slave'", "'.'", "'E'", "'e'", "'::'", "'UNSYNC'", "'LOCKED'", "'LOCK_FREE'", "'DATA'", "'BUFFER'", "'CIRCULAR_BUFFER'", "'default'", "'CORBA'", "'MQUEUE'", "'ROS'", "'ORO_SCHED_OTHER'", "'ORO_SCHED_RT'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=6;
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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:77:1: rulePackage returns [EObject current=null] : ( () otherlv_1= 'OrocosPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'taskContexts' otherlv_5= '{' ( (lv_taskContexts_6_0= ruleTaskContext ) ) (otherlv_7= ',' ( (lv_taskContexts_8_0= ruleTaskContext ) ) )* otherlv_9= '}' )? (otherlv_10= 'connectionPolicies' otherlv_11= '{' ( (lv_connectionPolicies_12_0= ruleConnectionPolicy ) ) (otherlv_13= ',' ( (lv_connectionPolicies_14_0= ruleConnectionPolicy ) ) )* otherlv_15= '}' )? (otherlv_16= 'peerGroups' otherlv_17= '{' ( (lv_peerGroups_18_0= rulePeerGroup ) ) (otherlv_19= ',' ( (lv_peerGroups_20_0= rulePeerGroup ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
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
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:80:28: ( ( () otherlv_1= 'OrocosPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'taskContexts' otherlv_5= '{' ( (lv_taskContexts_6_0= ruleTaskContext ) ) (otherlv_7= ',' ( (lv_taskContexts_8_0= ruleTaskContext ) ) )* otherlv_9= '}' )? (otherlv_10= 'connectionPolicies' otherlv_11= '{' ( (lv_connectionPolicies_12_0= ruleConnectionPolicy ) ) (otherlv_13= ',' ( (lv_connectionPolicies_14_0= ruleConnectionPolicy ) ) )* otherlv_15= '}' )? (otherlv_16= 'peerGroups' otherlv_17= '{' ( (lv_peerGroups_18_0= rulePeerGroup ) ) (otherlv_19= ',' ( (lv_peerGroups_20_0= rulePeerGroup ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:81:1: ( () otherlv_1= 'OrocosPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'taskContexts' otherlv_5= '{' ( (lv_taskContexts_6_0= ruleTaskContext ) ) (otherlv_7= ',' ( (lv_taskContexts_8_0= ruleTaskContext ) ) )* otherlv_9= '}' )? (otherlv_10= 'connectionPolicies' otherlv_11= '{' ( (lv_connectionPolicies_12_0= ruleConnectionPolicy ) ) (otherlv_13= ',' ( (lv_connectionPolicies_14_0= ruleConnectionPolicy ) ) )* otherlv_15= '}' )? (otherlv_16= 'peerGroups' otherlv_17= '{' ( (lv_peerGroups_18_0= rulePeerGroup ) ) (otherlv_19= ',' ( (lv_peerGroups_20_0= rulePeerGroup ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:81:1: ( () otherlv_1= 'OrocosPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'taskContexts' otherlv_5= '{' ( (lv_taskContexts_6_0= ruleTaskContext ) ) (otherlv_7= ',' ( (lv_taskContexts_8_0= ruleTaskContext ) ) )* otherlv_9= '}' )? (otherlv_10= 'connectionPolicies' otherlv_11= '{' ( (lv_connectionPolicies_12_0= ruleConnectionPolicy ) ) (otherlv_13= ',' ( (lv_connectionPolicies_14_0= ruleConnectionPolicy ) ) )* otherlv_15= '}' )? (otherlv_16= 'peerGroups' otherlv_17= '{' ( (lv_peerGroups_18_0= rulePeerGroup ) ) (otherlv_19= ',' ( (lv_peerGroups_20_0= rulePeerGroup ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:81:2: () otherlv_1= 'OrocosPackage' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'taskContexts' otherlv_5= '{' ( (lv_taskContexts_6_0= ruleTaskContext ) ) (otherlv_7= ',' ( (lv_taskContexts_8_0= ruleTaskContext ) ) )* otherlv_9= '}' )? (otherlv_10= 'connectionPolicies' otherlv_11= '{' ( (lv_connectionPolicies_12_0= ruleConnectionPolicy ) ) (otherlv_13= ',' ( (lv_connectionPolicies_14_0= ruleConnectionPolicy ) ) )* otherlv_15= '}' )? (otherlv_16= 'peerGroups' otherlv_17= '{' ( (lv_peerGroups_18_0= rulePeerGroup ) ) (otherlv_19= ',' ( (lv_peerGroups_20_0= rulePeerGroup ) ) )* otherlv_21= '}' )? otherlv_22= '}'
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

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:217:3: (otherlv_16= 'peerGroups' otherlv_17= '{' ( (lv_peerGroups_18_0= rulePeerGroup ) ) (otherlv_19= ',' ( (lv_peerGroups_20_0= rulePeerGroup ) ) )* otherlv_21= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:217:5: otherlv_16= 'peerGroups' otherlv_17= '{' ( (lv_peerGroups_18_0= rulePeerGroup ) ) (otherlv_19= ',' ( (lv_peerGroups_20_0= rulePeerGroup ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePackage369); 

                        	newLeafNode(otherlv_16, grammarAccess.getPackageAccess().getPeerGroupsKeyword_6_0());
                        
                    otherlv_17=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePackage381); 

                        	newLeafNode(otherlv_17, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:225:1: ( (lv_peerGroups_18_0= rulePeerGroup ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:226:1: (lv_peerGroups_18_0= rulePeerGroup )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:226:1: (lv_peerGroups_18_0= rulePeerGroup )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:227:3: lv_peerGroups_18_0= rulePeerGroup
                    {
                     
                    	        newCompositeNode(grammarAccess.getPackageAccess().getPeerGroupsPeerGroupParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePeerGroup_in_rulePackage402);
                    lv_peerGroups_18_0=rulePeerGroup();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPackageRule());
                    	        }
                           		add(
                           			current, 
                           			"peerGroups",
                            		lv_peerGroups_18_0, 
                            		"PeerGroup");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:243:2: (otherlv_19= ',' ( (lv_peerGroups_20_0= rulePeerGroup ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:243:4: otherlv_19= ',' ( (lv_peerGroups_20_0= rulePeerGroup ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePackage415); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getPackageAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:247:1: ( (lv_peerGroups_20_0= rulePeerGroup ) )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:248:1: (lv_peerGroups_20_0= rulePeerGroup )
                    	    {
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:248:1: (lv_peerGroups_20_0= rulePeerGroup )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:249:3: lv_peerGroups_20_0= rulePeerGroup
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPackageAccess().getPeerGroupsPeerGroupParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_rulePeerGroup_in_rulePackage436);
                    	    lv_peerGroups_20_0=rulePeerGroup();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPackageRule());
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

                    otherlv_21=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePackage450); 

                        	newLeafNode(otherlv_21, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_22=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePackage464); 

                	newLeafNode(otherlv_22, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_7());
                

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:281:1: entryRuleTaskContext returns [EObject current=null] : iv_ruleTaskContext= ruleTaskContext EOF ;
    public final EObject entryRuleTaskContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskContext = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:282:2: (iv_ruleTaskContext= ruleTaskContext EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:283:2: iv_ruleTaskContext= ruleTaskContext EOF
            {
             newCompositeNode(grammarAccess.getTaskContextRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTaskContext_in_entryRuleTaskContext500);
            iv_ruleTaskContext=ruleTaskContext();

            state._fsp--;

             current =iv_ruleTaskContext; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTaskContext510); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:290:1: ruleTaskContext returns [EObject current=null] : (otherlv_0= 'TaskContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'namespace' ( (lv_namespace_4_0= ruleQualifiedNameWithDot ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleQualifiedNameWithDot ) ) otherlv_7= 'activity' ( (lv_activity_8_0= ruleActivity ) ) (otherlv_9= 'inputPorts' otherlv_10= '{' ( (lv_inputPorts_11_0= ruleInputPort ) ) (otherlv_12= ',' ( (lv_inputPorts_13_0= ruleInputPort ) ) )* otherlv_14= '}' )? (otherlv_15= 'eventPorts' otherlv_16= '{' ( (lv_eventPorts_17_0= ruleEventPort ) ) (otherlv_18= ',' ( (lv_eventPorts_19_0= ruleEventPort ) ) )* otherlv_20= '}' )? (otherlv_21= 'outputPorts' otherlv_22= '{' ( (lv_outputPorts_23_0= ruleOutputPort ) ) (otherlv_24= ',' ( (lv_outputPorts_25_0= ruleOutputPort ) ) )* otherlv_26= '}' )? (otherlv_27= 'properties' otherlv_28= '{' ( (lv_properties_29_0= ruleProperty ) ) (otherlv_30= ',' ( (lv_properties_31_0= ruleProperty ) ) )* otherlv_32= '}' )? (otherlv_33= 'operations' otherlv_34= '{' ( (lv_operations_35_0= ruleOperation ) ) (otherlv_36= ',' ( (lv_operations_37_0= ruleOperation ) ) )* otherlv_38= '}' )? otherlv_39= '}' ) ;
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
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:293:28: ( (otherlv_0= 'TaskContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'namespace' ( (lv_namespace_4_0= ruleQualifiedNameWithDot ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleQualifiedNameWithDot ) ) otherlv_7= 'activity' ( (lv_activity_8_0= ruleActivity ) ) (otherlv_9= 'inputPorts' otherlv_10= '{' ( (lv_inputPorts_11_0= ruleInputPort ) ) (otherlv_12= ',' ( (lv_inputPorts_13_0= ruleInputPort ) ) )* otherlv_14= '}' )? (otherlv_15= 'eventPorts' otherlv_16= '{' ( (lv_eventPorts_17_0= ruleEventPort ) ) (otherlv_18= ',' ( (lv_eventPorts_19_0= ruleEventPort ) ) )* otherlv_20= '}' )? (otherlv_21= 'outputPorts' otherlv_22= '{' ( (lv_outputPorts_23_0= ruleOutputPort ) ) (otherlv_24= ',' ( (lv_outputPorts_25_0= ruleOutputPort ) ) )* otherlv_26= '}' )? (otherlv_27= 'properties' otherlv_28= '{' ( (lv_properties_29_0= ruleProperty ) ) (otherlv_30= ',' ( (lv_properties_31_0= ruleProperty ) ) )* otherlv_32= '}' )? (otherlv_33= 'operations' otherlv_34= '{' ( (lv_operations_35_0= ruleOperation ) ) (otherlv_36= ',' ( (lv_operations_37_0= ruleOperation ) ) )* otherlv_38= '}' )? otherlv_39= '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:294:1: (otherlv_0= 'TaskContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'namespace' ( (lv_namespace_4_0= ruleQualifiedNameWithDot ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleQualifiedNameWithDot ) ) otherlv_7= 'activity' ( (lv_activity_8_0= ruleActivity ) ) (otherlv_9= 'inputPorts' otherlv_10= '{' ( (lv_inputPorts_11_0= ruleInputPort ) ) (otherlv_12= ',' ( (lv_inputPorts_13_0= ruleInputPort ) ) )* otherlv_14= '}' )? (otherlv_15= 'eventPorts' otherlv_16= '{' ( (lv_eventPorts_17_0= ruleEventPort ) ) (otherlv_18= ',' ( (lv_eventPorts_19_0= ruleEventPort ) ) )* otherlv_20= '}' )? (otherlv_21= 'outputPorts' otherlv_22= '{' ( (lv_outputPorts_23_0= ruleOutputPort ) ) (otherlv_24= ',' ( (lv_outputPorts_25_0= ruleOutputPort ) ) )* otherlv_26= '}' )? (otherlv_27= 'properties' otherlv_28= '{' ( (lv_properties_29_0= ruleProperty ) ) (otherlv_30= ',' ( (lv_properties_31_0= ruleProperty ) ) )* otherlv_32= '}' )? (otherlv_33= 'operations' otherlv_34= '{' ( (lv_operations_35_0= ruleOperation ) ) (otherlv_36= ',' ( (lv_operations_37_0= ruleOperation ) ) )* otherlv_38= '}' )? otherlv_39= '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:294:1: (otherlv_0= 'TaskContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'namespace' ( (lv_namespace_4_0= ruleQualifiedNameWithDot ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleQualifiedNameWithDot ) ) otherlv_7= 'activity' ( (lv_activity_8_0= ruleActivity ) ) (otherlv_9= 'inputPorts' otherlv_10= '{' ( (lv_inputPorts_11_0= ruleInputPort ) ) (otherlv_12= ',' ( (lv_inputPorts_13_0= ruleInputPort ) ) )* otherlv_14= '}' )? (otherlv_15= 'eventPorts' otherlv_16= '{' ( (lv_eventPorts_17_0= ruleEventPort ) ) (otherlv_18= ',' ( (lv_eventPorts_19_0= ruleEventPort ) ) )* otherlv_20= '}' )? (otherlv_21= 'outputPorts' otherlv_22= '{' ( (lv_outputPorts_23_0= ruleOutputPort ) ) (otherlv_24= ',' ( (lv_outputPorts_25_0= ruleOutputPort ) ) )* otherlv_26= '}' )? (otherlv_27= 'properties' otherlv_28= '{' ( (lv_properties_29_0= ruleProperty ) ) (otherlv_30= ',' ( (lv_properties_31_0= ruleProperty ) ) )* otherlv_32= '}' )? (otherlv_33= 'operations' otherlv_34= '{' ( (lv_operations_35_0= ruleOperation ) ) (otherlv_36= ',' ( (lv_operations_37_0= ruleOperation ) ) )* otherlv_38= '}' )? otherlv_39= '}' )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:294:3: otherlv_0= 'TaskContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'namespace' ( (lv_namespace_4_0= ruleQualifiedNameWithDot ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleQualifiedNameWithDot ) ) otherlv_7= 'activity' ( (lv_activity_8_0= ruleActivity ) ) (otherlv_9= 'inputPorts' otherlv_10= '{' ( (lv_inputPorts_11_0= ruleInputPort ) ) (otherlv_12= ',' ( (lv_inputPorts_13_0= ruleInputPort ) ) )* otherlv_14= '}' )? (otherlv_15= 'eventPorts' otherlv_16= '{' ( (lv_eventPorts_17_0= ruleEventPort ) ) (otherlv_18= ',' ( (lv_eventPorts_19_0= ruleEventPort ) ) )* otherlv_20= '}' )? (otherlv_21= 'outputPorts' otherlv_22= '{' ( (lv_outputPorts_23_0= ruleOutputPort ) ) (otherlv_24= ',' ( (lv_outputPorts_25_0= ruleOutputPort ) ) )* otherlv_26= '}' )? (otherlv_27= 'properties' otherlv_28= '{' ( (lv_properties_29_0= ruleProperty ) ) (otherlv_30= ',' ( (lv_properties_31_0= ruleProperty ) ) )* otherlv_32= '}' )? (otherlv_33= 'operations' otherlv_34= '{' ( (lv_operations_35_0= ruleOperation ) ) (otherlv_36= ',' ( (lv_operations_37_0= ruleOperation ) ) )* otherlv_38= '}' )? otherlv_39= '}'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTaskContext547); 

                	newLeafNode(otherlv_0, grammarAccess.getTaskContextAccess().getTaskContextKeyword_0());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:298:1: ( (lv_name_1_0= ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:299:1: (lv_name_1_0= ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:299:1: (lv_name_1_0= ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:300:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTaskContextAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTaskContext568);
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

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTaskContext580); 

                	newLeafNode(otherlv_2, grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTaskContext592); 

                	newLeafNode(otherlv_3, grammarAccess.getTaskContextAccess().getNamespaceKeyword_3());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:324:1: ( (lv_namespace_4_0= ruleQualifiedNameWithDot ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:325:1: (lv_namespace_4_0= ruleQualifiedNameWithDot )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:325:1: (lv_namespace_4_0= ruleQualifiedNameWithDot )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:326:3: lv_namespace_4_0= ruleQualifiedNameWithDot
            {
             
            	        newCompositeNode(grammarAccess.getTaskContextAccess().getNamespaceQualifiedNameWithDotParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_ruleTaskContext613);
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

            otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleTaskContext625); 

                	newLeafNode(otherlv_5, grammarAccess.getTaskContextAccess().getTypeKeyword_5());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:346:1: ( (lv_type_6_0= ruleQualifiedNameWithDot ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:347:1: (lv_type_6_0= ruleQualifiedNameWithDot )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:347:1: (lv_type_6_0= ruleQualifiedNameWithDot )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:348:3: lv_type_6_0= ruleQualifiedNameWithDot
            {
             
            	        newCompositeNode(grammarAccess.getTaskContextAccess().getTypeQualifiedNameWithDotParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_ruleTaskContext646);
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

            otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleTaskContext658); 

                	newLeafNode(otherlv_7, grammarAccess.getTaskContextAccess().getActivityKeyword_7());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:368:1: ( (lv_activity_8_0= ruleActivity ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:369:1: (lv_activity_8_0= ruleActivity )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:369:1: (lv_activity_8_0= ruleActivity )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:370:3: lv_activity_8_0= ruleActivity
            {
             
            	        newCompositeNode(grammarAccess.getTaskContextAccess().getActivityActivityParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleActivity_in_ruleTaskContext679);
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

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:386:2: (otherlv_9= 'inputPorts' otherlv_10= '{' ( (lv_inputPorts_11_0= ruleInputPort ) ) (otherlv_12= ',' ( (lv_inputPorts_13_0= ruleInputPort ) ) )* otherlv_14= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:386:4: otherlv_9= 'inputPorts' otherlv_10= '{' ( (lv_inputPorts_11_0= ruleInputPort ) ) (otherlv_12= ',' ( (lv_inputPorts_13_0= ruleInputPort ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTaskContext692); 

                        	newLeafNode(otherlv_9, grammarAccess.getTaskContextAccess().getInputPortsKeyword_9_0());
                        
                    otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTaskContext704); 

                        	newLeafNode(otherlv_10, grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:394:1: ( (lv_inputPorts_11_0= ruleInputPort ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:395:1: (lv_inputPorts_11_0= ruleInputPort )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:395:1: (lv_inputPorts_11_0= ruleInputPort )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:396:3: lv_inputPorts_11_0= ruleInputPort
                    {
                     
                    	        newCompositeNode(grammarAccess.getTaskContextAccess().getInputPortsInputPortParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInputPort_in_ruleTaskContext725);
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

                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:412:2: (otherlv_12= ',' ( (lv_inputPorts_13_0= ruleInputPort ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:412:4: otherlv_12= ',' ( (lv_inputPorts_13_0= ruleInputPort ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTaskContext738); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getTaskContextAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:416:1: ( (lv_inputPorts_13_0= ruleInputPort ) )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:417:1: (lv_inputPorts_13_0= ruleInputPort )
                    	    {
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:417:1: (lv_inputPorts_13_0= ruleInputPort )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:418:3: lv_inputPorts_13_0= ruleInputPort
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTaskContextAccess().getInputPortsInputPortParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInputPort_in_ruleTaskContext759);
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
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTaskContext773); 

                        	newLeafNode(otherlv_14, grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:438:3: (otherlv_15= 'eventPorts' otherlv_16= '{' ( (lv_eventPorts_17_0= ruleEventPort ) ) (otherlv_18= ',' ( (lv_eventPorts_19_0= ruleEventPort ) ) )* otherlv_20= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:438:5: otherlv_15= 'eventPorts' otherlv_16= '{' ( (lv_eventPorts_17_0= ruleEventPort ) ) (otherlv_18= ',' ( (lv_eventPorts_19_0= ruleEventPort ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTaskContext788); 

                        	newLeafNode(otherlv_15, grammarAccess.getTaskContextAccess().getEventPortsKeyword_10_0());
                        
                    otherlv_16=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTaskContext800); 

                        	newLeafNode(otherlv_16, grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:446:1: ( (lv_eventPorts_17_0= ruleEventPort ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:447:1: (lv_eventPorts_17_0= ruleEventPort )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:447:1: (lv_eventPorts_17_0= ruleEventPort )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:448:3: lv_eventPorts_17_0= ruleEventPort
                    {
                     
                    	        newCompositeNode(grammarAccess.getTaskContextAccess().getEventPortsEventPortParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEventPort_in_ruleTaskContext821);
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

                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:464:2: (otherlv_18= ',' ( (lv_eventPorts_19_0= ruleEventPort ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:464:4: otherlv_18= ',' ( (lv_eventPorts_19_0= ruleEventPort ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTaskContext834); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getTaskContextAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:468:1: ( (lv_eventPorts_19_0= ruleEventPort ) )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:469:1: (lv_eventPorts_19_0= ruleEventPort )
                    	    {
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:469:1: (lv_eventPorts_19_0= ruleEventPort )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:470:3: lv_eventPorts_19_0= ruleEventPort
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTaskContextAccess().getEventPortsEventPortParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEventPort_in_ruleTaskContext855);
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
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTaskContext869); 

                        	newLeafNode(otherlv_20, grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:490:3: (otherlv_21= 'outputPorts' otherlv_22= '{' ( (lv_outputPorts_23_0= ruleOutputPort ) ) (otherlv_24= ',' ( (lv_outputPorts_25_0= ruleOutputPort ) ) )* otherlv_26= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:490:5: otherlv_21= 'outputPorts' otherlv_22= '{' ( (lv_outputPorts_23_0= ruleOutputPort ) ) (otherlv_24= ',' ( (lv_outputPorts_25_0= ruleOutputPort ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleTaskContext884); 

                        	newLeafNode(otherlv_21, grammarAccess.getTaskContextAccess().getOutputPortsKeyword_11_0());
                        
                    otherlv_22=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTaskContext896); 

                        	newLeafNode(otherlv_22, grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_11_1());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:498:1: ( (lv_outputPorts_23_0= ruleOutputPort ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:499:1: (lv_outputPorts_23_0= ruleOutputPort )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:499:1: (lv_outputPorts_23_0= ruleOutputPort )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:500:3: lv_outputPorts_23_0= ruleOutputPort
                    {
                     
                    	        newCompositeNode(grammarAccess.getTaskContextAccess().getOutputPortsOutputPortParserRuleCall_11_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOutputPort_in_ruleTaskContext917);
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

                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:516:2: (otherlv_24= ',' ( (lv_outputPorts_25_0= ruleOutputPort ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:516:4: otherlv_24= ',' ( (lv_outputPorts_25_0= ruleOutputPort ) )
                    	    {
                    	    otherlv_24=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTaskContext930); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getTaskContextAccess().getCommaKeyword_11_3_0());
                    	        
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:520:1: ( (lv_outputPorts_25_0= ruleOutputPort ) )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:521:1: (lv_outputPorts_25_0= ruleOutputPort )
                    	    {
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:521:1: (lv_outputPorts_25_0= ruleOutputPort )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:522:3: lv_outputPorts_25_0= ruleOutputPort
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTaskContextAccess().getOutputPortsOutputPortParserRuleCall_11_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleOutputPort_in_ruleTaskContext951);
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
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTaskContext965); 

                        	newLeafNode(otherlv_26, grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_11_4());
                        

                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:542:3: (otherlv_27= 'properties' otherlv_28= '{' ( (lv_properties_29_0= ruleProperty ) ) (otherlv_30= ',' ( (lv_properties_31_0= ruleProperty ) ) )* otherlv_32= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:542:5: otherlv_27= 'properties' otherlv_28= '{' ( (lv_properties_29_0= ruleProperty ) ) (otherlv_30= ',' ( (lv_properties_31_0= ruleProperty ) ) )* otherlv_32= '}'
                    {
                    otherlv_27=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleTaskContext980); 

                        	newLeafNode(otherlv_27, grammarAccess.getTaskContextAccess().getPropertiesKeyword_12_0());
                        
                    otherlv_28=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTaskContext992); 

                        	newLeafNode(otherlv_28, grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_12_1());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:550:1: ( (lv_properties_29_0= ruleProperty ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:551:1: (lv_properties_29_0= ruleProperty )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:551:1: (lv_properties_29_0= ruleProperty )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:552:3: lv_properties_29_0= ruleProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getTaskContextAccess().getPropertiesPropertyParserRuleCall_12_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleProperty_in_ruleTaskContext1013);
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

                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:568:2: (otherlv_30= ',' ( (lv_properties_31_0= ruleProperty ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:568:4: otherlv_30= ',' ( (lv_properties_31_0= ruleProperty ) )
                    	    {
                    	    otherlv_30=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTaskContext1026); 

                    	        	newLeafNode(otherlv_30, grammarAccess.getTaskContextAccess().getCommaKeyword_12_3_0());
                    	        
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:572:1: ( (lv_properties_31_0= ruleProperty ) )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:573:1: (lv_properties_31_0= ruleProperty )
                    	    {
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:573:1: (lv_properties_31_0= ruleProperty )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:574:3: lv_properties_31_0= ruleProperty
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTaskContextAccess().getPropertiesPropertyParserRuleCall_12_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleProperty_in_ruleTaskContext1047);
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
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_32=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTaskContext1061); 

                        	newLeafNode(otherlv_32, grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_12_4());
                        

                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:594:3: (otherlv_33= 'operations' otherlv_34= '{' ( (lv_operations_35_0= ruleOperation ) ) (otherlv_36= ',' ( (lv_operations_37_0= ruleOperation ) ) )* otherlv_38= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:594:5: otherlv_33= 'operations' otherlv_34= '{' ( (lv_operations_35_0= ruleOperation ) ) (otherlv_36= ',' ( (lv_operations_37_0= ruleOperation ) ) )* otherlv_38= '}'
                    {
                    otherlv_33=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTaskContext1076); 

                        	newLeafNode(otherlv_33, grammarAccess.getTaskContextAccess().getOperationsKeyword_13_0());
                        
                    otherlv_34=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTaskContext1088); 

                        	newLeafNode(otherlv_34, grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_13_1());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:602:1: ( (lv_operations_35_0= ruleOperation ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:603:1: (lv_operations_35_0= ruleOperation )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:603:1: (lv_operations_35_0= ruleOperation )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:604:3: lv_operations_35_0= ruleOperation
                    {
                     
                    	        newCompositeNode(grammarAccess.getTaskContextAccess().getOperationsOperationParserRuleCall_13_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleTaskContext1109);
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

                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:620:2: (otherlv_36= ',' ( (lv_operations_37_0= ruleOperation ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==14) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:620:4: otherlv_36= ',' ( (lv_operations_37_0= ruleOperation ) )
                    	    {
                    	    otherlv_36=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTaskContext1122); 

                    	        	newLeafNode(otherlv_36, grammarAccess.getTaskContextAccess().getCommaKeyword_13_3_0());
                    	        
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:624:1: ( (lv_operations_37_0= ruleOperation ) )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:625:1: (lv_operations_37_0= ruleOperation )
                    	    {
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:625:1: (lv_operations_37_0= ruleOperation )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:626:3: lv_operations_37_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTaskContextAccess().getOperationsOperationParserRuleCall_13_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleTaskContext1143);
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
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_38=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTaskContext1157); 

                        	newLeafNode(otherlv_38, grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_13_4());
                        

                    }
                    break;

            }

            otherlv_39=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTaskContext1171); 

                	newLeafNode(otherlv_39, grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_14());
                

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


    // $ANTLR start "entryRulePeerGroup"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:658:1: entryRulePeerGroup returns [EObject current=null] : iv_rulePeerGroup= rulePeerGroup EOF ;
    public final EObject entryRulePeerGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePeerGroup = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:659:2: (iv_rulePeerGroup= rulePeerGroup EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:660:2: iv_rulePeerGroup= rulePeerGroup EOF
            {
             newCompositeNode(grammarAccess.getPeerGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePeerGroup_in_entryRulePeerGroup1207);
            iv_rulePeerGroup=rulePeerGroup();

            state._fsp--;

             current =iv_rulePeerGroup; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePeerGroup1217); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:667:1: rulePeerGroup returns [EObject current=null] : (otherlv_0= 'PeerGroup' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'coordinator' ( ( ruleEString ) ) (otherlv_5= 'members' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' ) ;
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
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:670:28: ( (otherlv_0= 'PeerGroup' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'coordinator' ( ( ruleEString ) ) (otherlv_5= 'members' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:671:1: (otherlv_0= 'PeerGroup' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'coordinator' ( ( ruleEString ) ) (otherlv_5= 'members' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:671:1: (otherlv_0= 'PeerGroup' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'coordinator' ( ( ruleEString ) ) (otherlv_5= 'members' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:671:3: otherlv_0= 'PeerGroup' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'coordinator' ( ( ruleEString ) ) (otherlv_5= 'members' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_rulePeerGroup1254); 

                	newLeafNode(otherlv_0, grammarAccess.getPeerGroupAccess().getPeerGroupKeyword_0());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:675:1: ( (lv_name_1_0= ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:676:1: (lv_name_1_0= ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:676:1: (lv_name_1_0= ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:677:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPeerGroupAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePeerGroup1275);
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

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePeerGroup1287); 

                	newLeafNode(otherlv_2, grammarAccess.getPeerGroupAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_28_in_rulePeerGroup1299); 

                	newLeafNode(otherlv_3, grammarAccess.getPeerGroupAccess().getCoordinatorKeyword_3());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:701:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:702:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:702:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:703:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPeerGroupRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getPeerGroupAccess().getCoordinatorTaskContextCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePeerGroup1322);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:716:2: (otherlv_5= 'members' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:716:4: otherlv_5= 'members' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_29_in_rulePeerGroup1335); 

                        	newLeafNode(otherlv_5, grammarAccess.getPeerGroupAccess().getMembersKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,30,FollowSets000.FOLLOW_30_in_rulePeerGroup1347); 

                        	newLeafNode(otherlv_6, grammarAccess.getPeerGroupAccess().getLeftParenthesisKeyword_5_1());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:724:1: ( ( ruleEString ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:725:1: ( ruleEString )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:725:1: ( ruleEString )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:726:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPeerGroupRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getPeerGroupAccess().getMembersTaskContextCrossReference_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePeerGroup1370);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:739:2: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==14) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:739:4: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePeerGroup1383); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getPeerGroupAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:743:1: ( ( ruleEString ) )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:744:1: ( ruleEString )
                    	    {
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:744:1: ( ruleEString )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:745:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getPeerGroupRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getPeerGroupAccess().getMembersTaskContextCrossReference_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePeerGroup1406);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,31,FollowSets000.FOLLOW_31_in_rulePeerGroup1420); 

                        	newLeafNode(otherlv_10, grammarAccess.getPeerGroupAccess().getRightParenthesisKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePeerGroup1434); 

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


    // $ANTLR start "entryRuleConnectionPolicy"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:774:1: entryRuleConnectionPolicy returns [EObject current=null] : iv_ruleConnectionPolicy= ruleConnectionPolicy EOF ;
    public final EObject entryRuleConnectionPolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectionPolicy = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:775:2: (iv_ruleConnectionPolicy= ruleConnectionPolicy EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:776:2: iv_ruleConnectionPolicy= ruleConnectionPolicy EOF
            {
             newCompositeNode(grammarAccess.getConnectionPolicyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConnectionPolicy_in_entryRuleConnectionPolicy1470);
            iv_ruleConnectionPolicy=ruleConnectionPolicy();

            state._fsp--;

             current =iv_ruleConnectionPolicy; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConnectionPolicy1480); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:783:1: ruleConnectionPolicy returns [EObject current=null] : (otherlv_0= 'ConnectionPolicy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'inputPort' ( ( ruleEString ) ) otherlv_5= 'outputPort' ( ( ruleEString ) ) ( (lv_init_7_0= 'init' ) )? ( (lv_pull_8_0= 'pull' ) )? (otherlv_9= 'bufferSize' ( (lv_bufferSize_10_0= ruleEShort ) ) )? (otherlv_11= 'dataSize' ( (lv_dataSize_12_0= ruleEShort ) ) )? (otherlv_13= 'lockPolicy' ( (lv_lockPolicy_14_0= ruleConnectionPolicyLockPolicy ) ) )? (otherlv_15= 'transport' ( (lv_transport_16_0= ruleConnectionPolicyTransport ) ) )? (otherlv_17= 'type' ( (lv_type_18_0= ruleConnectionPolicyType ) ) )? otherlv_19= '}' ) ;
    public final EObject ruleConnectionPolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_init_7_0=null;
        Token lv_pull_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_bufferSize_10_0 = null;

        AntlrDatatypeRuleToken lv_dataSize_12_0 = null;

        Enumerator lv_lockPolicy_14_0 = null;

        Enumerator lv_transport_16_0 = null;

        Enumerator lv_type_18_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:786:28: ( (otherlv_0= 'ConnectionPolicy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'inputPort' ( ( ruleEString ) ) otherlv_5= 'outputPort' ( ( ruleEString ) ) ( (lv_init_7_0= 'init' ) )? ( (lv_pull_8_0= 'pull' ) )? (otherlv_9= 'bufferSize' ( (lv_bufferSize_10_0= ruleEShort ) ) )? (otherlv_11= 'dataSize' ( (lv_dataSize_12_0= ruleEShort ) ) )? (otherlv_13= 'lockPolicy' ( (lv_lockPolicy_14_0= ruleConnectionPolicyLockPolicy ) ) )? (otherlv_15= 'transport' ( (lv_transport_16_0= ruleConnectionPolicyTransport ) ) )? (otherlv_17= 'type' ( (lv_type_18_0= ruleConnectionPolicyType ) ) )? otherlv_19= '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:787:1: (otherlv_0= 'ConnectionPolicy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'inputPort' ( ( ruleEString ) ) otherlv_5= 'outputPort' ( ( ruleEString ) ) ( (lv_init_7_0= 'init' ) )? ( (lv_pull_8_0= 'pull' ) )? (otherlv_9= 'bufferSize' ( (lv_bufferSize_10_0= ruleEShort ) ) )? (otherlv_11= 'dataSize' ( (lv_dataSize_12_0= ruleEShort ) ) )? (otherlv_13= 'lockPolicy' ( (lv_lockPolicy_14_0= ruleConnectionPolicyLockPolicy ) ) )? (otherlv_15= 'transport' ( (lv_transport_16_0= ruleConnectionPolicyTransport ) ) )? (otherlv_17= 'type' ( (lv_type_18_0= ruleConnectionPolicyType ) ) )? otherlv_19= '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:787:1: (otherlv_0= 'ConnectionPolicy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'inputPort' ( ( ruleEString ) ) otherlv_5= 'outputPort' ( ( ruleEString ) ) ( (lv_init_7_0= 'init' ) )? ( (lv_pull_8_0= 'pull' ) )? (otherlv_9= 'bufferSize' ( (lv_bufferSize_10_0= ruleEShort ) ) )? (otherlv_11= 'dataSize' ( (lv_dataSize_12_0= ruleEShort ) ) )? (otherlv_13= 'lockPolicy' ( (lv_lockPolicy_14_0= ruleConnectionPolicyLockPolicy ) ) )? (otherlv_15= 'transport' ( (lv_transport_16_0= ruleConnectionPolicyTransport ) ) )? (otherlv_17= 'type' ( (lv_type_18_0= ruleConnectionPolicyType ) ) )? otherlv_19= '}' )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:787:3: otherlv_0= 'ConnectionPolicy' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'inputPort' ( ( ruleEString ) ) otherlv_5= 'outputPort' ( ( ruleEString ) ) ( (lv_init_7_0= 'init' ) )? ( (lv_pull_8_0= 'pull' ) )? (otherlv_9= 'bufferSize' ( (lv_bufferSize_10_0= ruleEShort ) ) )? (otherlv_11= 'dataSize' ( (lv_dataSize_12_0= ruleEShort ) ) )? (otherlv_13= 'lockPolicy' ( (lv_lockPolicy_14_0= ruleConnectionPolicyLockPolicy ) ) )? (otherlv_15= 'transport' ( (lv_transport_16_0= ruleConnectionPolicyTransport ) ) )? (otherlv_17= 'type' ( (lv_type_18_0= ruleConnectionPolicyType ) ) )? otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleConnectionPolicy1517); 

                	newLeafNode(otherlv_0, grammarAccess.getConnectionPolicyAccess().getConnectionPolicyKeyword_0());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:791:1: ( (lv_name_1_0= ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:792:1: (lv_name_1_0= ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:792:1: (lv_name_1_0= ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:793:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getConnectionPolicyAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConnectionPolicy1538);
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

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleConnectionPolicy1550); 

                	newLeafNode(otherlv_2, grammarAccess.getConnectionPolicyAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleConnectionPolicy1562); 

                	newLeafNode(otherlv_3, grammarAccess.getConnectionPolicyAccess().getInputPortKeyword_3());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:817:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:818:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:818:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:819:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConnectionPolicyRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getConnectionPolicyAccess().getInputPortInputPortCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConnectionPolicy1585);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleConnectionPolicy1597); 

                	newLeafNode(otherlv_5, grammarAccess.getConnectionPolicyAccess().getOutputPortKeyword_5());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:836:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:837:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:837:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:838:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConnectionPolicyRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getConnectionPolicyAccess().getOutputPortOutputPortCrossReference_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConnectionPolicy1620);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:851:2: ( (lv_init_7_0= 'init' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:852:1: (lv_init_7_0= 'init' )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:852:1: (lv_init_7_0= 'init' )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:853:3: lv_init_7_0= 'init'
                    {
                    lv_init_7_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleConnectionPolicy1638); 

                            newLeafNode(lv_init_7_0, grammarAccess.getConnectionPolicyAccess().getInitInitKeyword_7_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConnectionPolicyRule());
                    	        }
                           		setWithLastConsumed(current, "init", true, "init");
                    	    

                    }


                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:866:3: ( (lv_pull_8_0= 'pull' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:867:1: (lv_pull_8_0= 'pull' )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:867:1: (lv_pull_8_0= 'pull' )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:868:3: lv_pull_8_0= 'pull'
                    {
                    lv_pull_8_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleConnectionPolicy1670); 

                            newLeafNode(lv_pull_8_0, grammarAccess.getConnectionPolicyAccess().getPullPullKeyword_8_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConnectionPolicyRule());
                    	        }
                           		setWithLastConsumed(current, "pull", true, "pull");
                    	    

                    }


                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:881:3: (otherlv_9= 'bufferSize' ( (lv_bufferSize_10_0= ruleEShort ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:881:5: otherlv_9= 'bufferSize' ( (lv_bufferSize_10_0= ruleEShort ) )
                    {
                    otherlv_9=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleConnectionPolicy1697); 

                        	newLeafNode(otherlv_9, grammarAccess.getConnectionPolicyAccess().getBufferSizeKeyword_9_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:885:1: ( (lv_bufferSize_10_0= ruleEShort ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:886:1: (lv_bufferSize_10_0= ruleEShort )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:886:1: (lv_bufferSize_10_0= ruleEShort )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:887:3: lv_bufferSize_10_0= ruleEShort
                    {
                     
                    	        newCompositeNode(grammarAccess.getConnectionPolicyAccess().getBufferSizeEShortParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEShort_in_ruleConnectionPolicy1718);
                    lv_bufferSize_10_0=ruleEShort();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConnectionPolicyRule());
                    	        }
                           		set(
                           			current, 
                           			"bufferSize",
                            		lv_bufferSize_10_0, 
                            		"EShort");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:903:4: (otherlv_11= 'dataSize' ( (lv_dataSize_12_0= ruleEShort ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:903:6: otherlv_11= 'dataSize' ( (lv_dataSize_12_0= ruleEShort ) )
                    {
                    otherlv_11=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleConnectionPolicy1733); 

                        	newLeafNode(otherlv_11, grammarAccess.getConnectionPolicyAccess().getDataSizeKeyword_10_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:907:1: ( (lv_dataSize_12_0= ruleEShort ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:908:1: (lv_dataSize_12_0= ruleEShort )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:908:1: (lv_dataSize_12_0= ruleEShort )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:909:3: lv_dataSize_12_0= ruleEShort
                    {
                     
                    	        newCompositeNode(grammarAccess.getConnectionPolicyAccess().getDataSizeEShortParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEShort_in_ruleConnectionPolicy1754);
                    lv_dataSize_12_0=ruleEShort();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConnectionPolicyRule());
                    	        }
                           		set(
                           			current, 
                           			"dataSize",
                            		lv_dataSize_12_0, 
                            		"EShort");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:925:4: (otherlv_13= 'lockPolicy' ( (lv_lockPolicy_14_0= ruleConnectionPolicyLockPolicy ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:925:6: otherlv_13= 'lockPolicy' ( (lv_lockPolicy_14_0= ruleConnectionPolicyLockPolicy ) )
                    {
                    otherlv_13=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleConnectionPolicy1769); 

                        	newLeafNode(otherlv_13, grammarAccess.getConnectionPolicyAccess().getLockPolicyKeyword_11_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:929:1: ( (lv_lockPolicy_14_0= ruleConnectionPolicyLockPolicy ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:930:1: (lv_lockPolicy_14_0= ruleConnectionPolicyLockPolicy )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:930:1: (lv_lockPolicy_14_0= ruleConnectionPolicyLockPolicy )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:931:3: lv_lockPolicy_14_0= ruleConnectionPolicyLockPolicy
                    {
                     
                    	        newCompositeNode(grammarAccess.getConnectionPolicyAccess().getLockPolicyConnectionPolicyLockPolicyEnumRuleCall_11_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConnectionPolicyLockPolicy_in_ruleConnectionPolicy1790);
                    lv_lockPolicy_14_0=ruleConnectionPolicyLockPolicy();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConnectionPolicyRule());
                    	        }
                           		set(
                           			current, 
                           			"lockPolicy",
                            		lv_lockPolicy_14_0, 
                            		"ConnectionPolicyLockPolicy");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:947:4: (otherlv_15= 'transport' ( (lv_transport_16_0= ruleConnectionPolicyTransport ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:947:6: otherlv_15= 'transport' ( (lv_transport_16_0= ruleConnectionPolicyTransport ) )
                    {
                    otherlv_15=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleConnectionPolicy1805); 

                        	newLeafNode(otherlv_15, grammarAccess.getConnectionPolicyAccess().getTransportKeyword_12_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:951:1: ( (lv_transport_16_0= ruleConnectionPolicyTransport ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:952:1: (lv_transport_16_0= ruleConnectionPolicyTransport )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:952:1: (lv_transport_16_0= ruleConnectionPolicyTransport )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:953:3: lv_transport_16_0= ruleConnectionPolicyTransport
                    {
                     
                    	        newCompositeNode(grammarAccess.getConnectionPolicyAccess().getTransportConnectionPolicyTransportEnumRuleCall_12_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConnectionPolicyTransport_in_ruleConnectionPolicy1826);
                    lv_transport_16_0=ruleConnectionPolicyTransport();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConnectionPolicyRule());
                    	        }
                           		set(
                           			current, 
                           			"transport",
                            		lv_transport_16_0, 
                            		"ConnectionPolicyTransport");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:969:4: (otherlv_17= 'type' ( (lv_type_18_0= ruleConnectionPolicyType ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==20) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:969:6: otherlv_17= 'type' ( (lv_type_18_0= ruleConnectionPolicyType ) )
                    {
                    otherlv_17=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleConnectionPolicy1841); 

                        	newLeafNode(otherlv_17, grammarAccess.getConnectionPolicyAccess().getTypeKeyword_13_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:973:1: ( (lv_type_18_0= ruleConnectionPolicyType ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:974:1: (lv_type_18_0= ruleConnectionPolicyType )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:974:1: (lv_type_18_0= ruleConnectionPolicyType )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:975:3: lv_type_18_0= ruleConnectionPolicyType
                    {
                     
                    	        newCompositeNode(grammarAccess.getConnectionPolicyAccess().getTypeConnectionPolicyTypeEnumRuleCall_13_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConnectionPolicyType_in_ruleConnectionPolicy1862);
                    lv_type_18_0=ruleConnectionPolicyType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConnectionPolicyRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_18_0, 
                            		"ConnectionPolicyType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleConnectionPolicy1876); 

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


    // $ANTLR start "entryRuleInputPort"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1003:1: entryRuleInputPort returns [EObject current=null] : iv_ruleInputPort= ruleInputPort EOF ;
    public final EObject entryRuleInputPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputPort = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1004:2: (iv_ruleInputPort= ruleInputPort EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1005:2: iv_ruleInputPort= ruleInputPort EOF
            {
             newCompositeNode(grammarAccess.getInputPortRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputPort_in_entryRuleInputPort1912);
            iv_ruleInputPort=ruleInputPort();

            state._fsp--;

             current =iv_ruleInputPort; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputPort1922); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1012:1: ruleInputPort returns [EObject current=null] : (otherlv_0= 'InputPort' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleInputPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1015:28: ( (otherlv_0= 'InputPort' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_5= '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1016:1: (otherlv_0= 'InputPort' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_5= '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1016:1: (otherlv_0= 'InputPort' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_5= '}' )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1016:3: otherlv_0= 'InputPort' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleInputPort1959); 

                	newLeafNode(otherlv_0, grammarAccess.getInputPortAccess().getInputPortKeyword_0());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1020:1: ( (lv_name_1_0= ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1021:1: (lv_name_1_0= ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1021:1: (lv_name_1_0= ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1022:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputPortAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputPort1980);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInputPortRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleInputPort1992); 

                	newLeafNode(otherlv_2, grammarAccess.getInputPortAccess().getLeftCurlyBracketKeyword_2());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1042:1: (otherlv_3= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==42) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1042:3: otherlv_3= 'dataType' ( ( ruleQualifiedNameWithDot ) )
                    {
                    otherlv_3=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleInputPort2005); 

                        	newLeafNode(otherlv_3, grammarAccess.getInputPortAccess().getDataTypeKeyword_3_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1046:1: ( ( ruleQualifiedNameWithDot ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1047:1: ( ruleQualifiedNameWithDot )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1047:1: ( ruleQualifiedNameWithDot )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1048:3: ruleQualifiedNameWithDot
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputPortRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getInputPortAccess().getDataTypeDataTypeCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_ruleInputPort2028);
                    ruleQualifiedNameWithDot();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInputPort2042); 

                	newLeafNode(otherlv_5, grammarAccess.getInputPortAccess().getRightCurlyBracketKeyword_4());
                

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


    // $ANTLR start "entryRuleEventPort"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1073:1: entryRuleEventPort returns [EObject current=null] : iv_ruleEventPort= ruleEventPort EOF ;
    public final EObject entryRuleEventPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventPort = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1074:2: (iv_ruleEventPort= ruleEventPort EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1075:2: iv_ruleEventPort= ruleEventPort EOF
            {
             newCompositeNode(grammarAccess.getEventPortRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEventPort_in_entryRuleEventPort2078);
            iv_ruleEventPort=ruleEventPort();

            state._fsp--;

             current =iv_ruleEventPort; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEventPort2088); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1082:1: ruleEventPort returns [EObject current=null] : ( () otherlv_1= 'EventPort' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'dataType' ( ( ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleEventPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1085:28: ( ( () otherlv_1= 'EventPort' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'dataType' ( ( ruleEString ) ) )? otherlv_6= '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1086:1: ( () otherlv_1= 'EventPort' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'dataType' ( ( ruleEString ) ) )? otherlv_6= '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1086:1: ( () otherlv_1= 'EventPort' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'dataType' ( ( ruleEString ) ) )? otherlv_6= '}' )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1086:2: () otherlv_1= 'EventPort' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'dataType' ( ( ruleEString ) ) )? otherlv_6= '}'
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1086:2: ()
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1087:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEventPortAccess().getEventPortAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleEventPort2134); 

                	newLeafNode(otherlv_1, grammarAccess.getEventPortAccess().getEventPortKeyword_1());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1096:1: ( (lv_name_2_0= ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1097:1: (lv_name_2_0= ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1097:1: (lv_name_2_0= ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1098:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEventPortAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEventPort2155);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEventPort2167); 

                	newLeafNode(otherlv_3, grammarAccess.getEventPortAccess().getLeftCurlyBracketKeyword_3());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1118:1: (otherlv_4= 'dataType' ( ( ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==42) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1118:3: otherlv_4= 'dataType' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleEventPort2180); 

                        	newLeafNode(otherlv_4, grammarAccess.getEventPortAccess().getDataTypeKeyword_4_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1122:1: ( ( ruleEString ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1123:1: ( ruleEString )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1123:1: ( ruleEString )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1124:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventPortRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEventPortAccess().getDataTypeDataTypeCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEventPort2203);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEventPort2217); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1149:1: entryRuleOutputPort returns [EObject current=null] : iv_ruleOutputPort= ruleOutputPort EOF ;
    public final EObject entryRuleOutputPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputPort = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1150:2: (iv_ruleOutputPort= ruleOutputPort EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1151:2: iv_ruleOutputPort= ruleOutputPort EOF
            {
             newCompositeNode(grammarAccess.getOutputPortRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOutputPort_in_entryRuleOutputPort2253);
            iv_ruleOutputPort=ruleOutputPort();

            state._fsp--;

             current =iv_ruleOutputPort; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOutputPort2263); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1158:1: ruleOutputPort returns [EObject current=null] : (otherlv_0= 'OutputPort' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleOutputPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1161:28: ( (otherlv_0= 'OutputPort' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_5= '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1162:1: (otherlv_0= 'OutputPort' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_5= '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1162:1: (otherlv_0= 'OutputPort' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_5= '}' )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1162:3: otherlv_0= 'OutputPort' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleOutputPort2300); 

                	newLeafNode(otherlv_0, grammarAccess.getOutputPortAccess().getOutputPortKeyword_0());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1166:1: ( (lv_name_1_0= ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1167:1: (lv_name_1_0= ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1167:1: (lv_name_1_0= ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1168:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOutputPortAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOutputPort2321);
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

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOutputPort2333); 

                	newLeafNode(otherlv_2, grammarAccess.getOutputPortAccess().getLeftCurlyBracketKeyword_2());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1188:1: (otherlv_3= 'dataType' ( ( ruleQualifiedNameWithDot ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==42) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1188:3: otherlv_3= 'dataType' ( ( ruleQualifiedNameWithDot ) )
                    {
                    otherlv_3=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleOutputPort2346); 

                        	newLeafNode(otherlv_3, grammarAccess.getOutputPortAccess().getDataTypeKeyword_3_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1192:1: ( ( ruleQualifiedNameWithDot ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1193:1: ( ruleQualifiedNameWithDot )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1193:1: ( ruleQualifiedNameWithDot )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1194:3: ruleQualifiedNameWithDot
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getOutputPortRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getOutputPortAccess().getDataTypeDataTypeCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_ruleOutputPort2369);
                    ruleQualifiedNameWithDot();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOutputPort2383); 

                	newLeafNode(otherlv_5, grammarAccess.getOutputPortAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1219:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1220:2: (iv_ruleProperty= ruleProperty EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1221:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_entryRuleProperty2419);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProperty2429); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1228:1: ruleProperty returns [EObject current=null] : ( () otherlv_1= 'Property' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= ruleEString ) ) )? (otherlv_8= 'type' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_10= '}' ) ;
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
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1231:28: ( ( () otherlv_1= 'Property' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= ruleEString ) ) )? (otherlv_8= 'type' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_10= '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1232:1: ( () otherlv_1= 'Property' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= ruleEString ) ) )? (otherlv_8= 'type' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_10= '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1232:1: ( () otherlv_1= 'Property' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= ruleEString ) ) )? (otherlv_8= 'type' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_10= '}' )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1232:2: () otherlv_1= 'Property' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= ruleEString ) ) )? (otherlv_8= 'type' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_10= '}'
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1232:2: ()
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1233:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPropertyAccess().getPropertyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleProperty2475); 

                	newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getPropertyKeyword_1());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1242:1: ( (lv_name_2_0= ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1243:1: (lv_name_2_0= ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1243:1: (lv_name_2_0= ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1244:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProperty2496);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleProperty2508); 

                	newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_3());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1264:1: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==46) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1264:3: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleProperty2521); 

                        	newLeafNode(otherlv_4, grammarAccess.getPropertyAccess().getDescriptionKeyword_4_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1268:1: ( (lv_description_5_0= ruleEString ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1269:1: (lv_description_5_0= ruleEString )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1269:1: (lv_description_5_0= ruleEString )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1270:3: lv_description_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProperty2542);
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

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1286:4: (otherlv_6= 'value' ( (lv_value_7_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==47) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1286:6: otherlv_6= 'value' ( (lv_value_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleProperty2557); 

                        	newLeafNode(otherlv_6, grammarAccess.getPropertyAccess().getValueKeyword_5_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1290:1: ( (lv_value_7_0= ruleEString ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1291:1: (lv_value_7_0= ruleEString )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1291:1: (lv_value_7_0= ruleEString )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1292:3: lv_value_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyAccess().getValueEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProperty2578);
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

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1308:4: (otherlv_8= 'type' ( ( ruleQualifiedNameWithDot ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==20) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1308:6: otherlv_8= 'type' ( ( ruleQualifiedNameWithDot ) )
                    {
                    otherlv_8=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleProperty2593); 

                        	newLeafNode(otherlv_8, grammarAccess.getPropertyAccess().getTypeKeyword_6_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1312:1: ( ( ruleQualifiedNameWithDot ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1313:1: ( ruleQualifiedNameWithDot )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1313:1: ( ruleQualifiedNameWithDot )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1314:3: ruleQualifiedNameWithDot
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPropertyRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getPropertyAccess().getTypeDataTypeCrossReference_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_ruleProperty2616);
                    ruleQualifiedNameWithDot();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleProperty2630); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1339:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1340:2: (iv_ruleOperation= ruleOperation EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1341:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_entryRuleOperation2666);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperation2676); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1348:1: ruleOperation returns [EObject current=null] : ( () otherlv_1= 'Operation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'documentation' ( (lv_documentation_5_0= ruleEString ) ) )? (otherlv_6= 'returnType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_8= '}' ) ;
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
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1351:28: ( ( () otherlv_1= 'Operation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'documentation' ( (lv_documentation_5_0= ruleEString ) ) )? (otherlv_6= 'returnType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_8= '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1352:1: ( () otherlv_1= 'Operation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'documentation' ( (lv_documentation_5_0= ruleEString ) ) )? (otherlv_6= 'returnType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_8= '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1352:1: ( () otherlv_1= 'Operation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'documentation' ( (lv_documentation_5_0= ruleEString ) ) )? (otherlv_6= 'returnType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_8= '}' )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1352:2: () otherlv_1= 'Operation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'documentation' ( (lv_documentation_5_0= ruleEString ) ) )? (otherlv_6= 'returnType' ( ( ruleQualifiedNameWithDot ) ) )? otherlv_8= '}'
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1352:2: ()
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1353:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOperationAccess().getOperationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleOperation2722); 

                	newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getOperationKeyword_1());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1362:1: ( (lv_name_2_0= ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1363:1: (lv_name_2_0= ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1363:1: (lv_name_2_0= ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1364:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOperationAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOperation2743);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOperation2755); 

                	newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_3());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1384:1: (otherlv_4= 'documentation' ( (lv_documentation_5_0= ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==49) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1384:3: otherlv_4= 'documentation' ( (lv_documentation_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleOperation2768); 

                        	newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getDocumentationKeyword_4_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1388:1: ( (lv_documentation_5_0= ruleEString ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1389:1: (lv_documentation_5_0= ruleEString )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1389:1: (lv_documentation_5_0= ruleEString )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1390:3: lv_documentation_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOperationAccess().getDocumentationEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOperation2789);
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

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1406:4: (otherlv_6= 'returnType' ( ( ruleQualifiedNameWithDot ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==50) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1406:6: otherlv_6= 'returnType' ( ( ruleQualifiedNameWithDot ) )
                    {
                    otherlv_6=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleOperation2804); 

                        	newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getReturnTypeKeyword_5_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1410:1: ( ( ruleQualifiedNameWithDot ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1411:1: ( ruleQualifiedNameWithDot )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1411:1: ( ruleQualifiedNameWithDot )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1412:3: ruleQualifiedNameWithDot
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getOperationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getOperationAccess().getReturnTypeDataTypeCrossReference_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_ruleOperation2827);
                    ruleQualifiedNameWithDot();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOperation2841); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1437:1: entryRuleEShort returns [String current=null] : iv_ruleEShort= ruleEShort EOF ;
    public final String entryRuleEShort() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEShort = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1438:2: (iv_ruleEShort= ruleEShort EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1439:2: iv_ruleEShort= ruleEShort EOF
            {
             newCompositeNode(grammarAccess.getEShortRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEShort_in_entryRuleEShort2878);
            iv_ruleEShort=ruleEShort();

            state._fsp--;

             current =iv_ruleEShort.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEShort2889); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1446:1: ruleEShort returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEShort() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1449:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1450:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1450:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1450:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1450:2: (kw= '-' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==51) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1451:2: kw= '-'
                    {
                    kw=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleEShort2928); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEShortAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEShort2945); 

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


    // $ANTLR start "entryRuleActivity"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1473:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1474:2: (iv_ruleActivity= ruleActivity EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1475:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleActivity_in_entryRuleActivity2992);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleActivity3002); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1482:1: ruleActivity returns [EObject current=null] : (otherlv_0= 'Activity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scheduler' ( (lv_scheduler_4_0= ruleScheduler ) ) otherlv_5= 'cpuAffinity' ( (lv_cpuAffinity_6_0= ruleEString ) ) otherlv_7= 'period' ( (lv_period_8_0= ruleEFloat ) ) otherlv_9= 'priority' ( (lv_priority_10_0= ruleEInt ) ) (otherlv_11= 'taskContext' ( ( ruleEString ) ) )? (otherlv_13= 'slave' otherlv_14= '{' ( (lv_slave_15_0= ruleSlave ) ) (otherlv_16= ',' ( (lv_slave_17_0= ruleSlave ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) ;
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
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1485:28: ( (otherlv_0= 'Activity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scheduler' ( (lv_scheduler_4_0= ruleScheduler ) ) otherlv_5= 'cpuAffinity' ( (lv_cpuAffinity_6_0= ruleEString ) ) otherlv_7= 'period' ( (lv_period_8_0= ruleEFloat ) ) otherlv_9= 'priority' ( (lv_priority_10_0= ruleEInt ) ) (otherlv_11= 'taskContext' ( ( ruleEString ) ) )? (otherlv_13= 'slave' otherlv_14= '{' ( (lv_slave_15_0= ruleSlave ) ) (otherlv_16= ',' ( (lv_slave_17_0= ruleSlave ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1486:1: (otherlv_0= 'Activity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scheduler' ( (lv_scheduler_4_0= ruleScheduler ) ) otherlv_5= 'cpuAffinity' ( (lv_cpuAffinity_6_0= ruleEString ) ) otherlv_7= 'period' ( (lv_period_8_0= ruleEFloat ) ) otherlv_9= 'priority' ( (lv_priority_10_0= ruleEInt ) ) (otherlv_11= 'taskContext' ( ( ruleEString ) ) )? (otherlv_13= 'slave' otherlv_14= '{' ( (lv_slave_15_0= ruleSlave ) ) (otherlv_16= ',' ( (lv_slave_17_0= ruleSlave ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1486:1: (otherlv_0= 'Activity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scheduler' ( (lv_scheduler_4_0= ruleScheduler ) ) otherlv_5= 'cpuAffinity' ( (lv_cpuAffinity_6_0= ruleEString ) ) otherlv_7= 'period' ( (lv_period_8_0= ruleEFloat ) ) otherlv_9= 'priority' ( (lv_priority_10_0= ruleEInt ) ) (otherlv_11= 'taskContext' ( ( ruleEString ) ) )? (otherlv_13= 'slave' otherlv_14= '{' ( (lv_slave_15_0= ruleSlave ) ) (otherlv_16= ',' ( (lv_slave_17_0= ruleSlave ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1486:3: otherlv_0= 'Activity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'scheduler' ( (lv_scheduler_4_0= ruleScheduler ) ) otherlv_5= 'cpuAffinity' ( (lv_cpuAffinity_6_0= ruleEString ) ) otherlv_7= 'period' ( (lv_period_8_0= ruleEFloat ) ) otherlv_9= 'priority' ( (lv_priority_10_0= ruleEInt ) ) (otherlv_11= 'taskContext' ( ( ruleEString ) ) )? (otherlv_13= 'slave' otherlv_14= '{' ( (lv_slave_15_0= ruleSlave ) ) (otherlv_16= ',' ( (lv_slave_17_0= ruleSlave ) ) )* otherlv_18= '}' )? otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleActivity3039); 

                	newLeafNode(otherlv_0, grammarAccess.getActivityAccess().getActivityKeyword_0());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1490:1: ( (lv_name_1_0= ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1491:1: (lv_name_1_0= ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1491:1: (lv_name_1_0= ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1492:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getActivityAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleActivity3060);
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

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleActivity3072); 

                	newLeafNode(otherlv_2, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleActivity3084); 

                	newLeafNode(otherlv_3, grammarAccess.getActivityAccess().getSchedulerKeyword_3());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1516:1: ( (lv_scheduler_4_0= ruleScheduler ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1517:1: (lv_scheduler_4_0= ruleScheduler )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1517:1: (lv_scheduler_4_0= ruleScheduler )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1518:3: lv_scheduler_4_0= ruleScheduler
            {
             
            	        newCompositeNode(grammarAccess.getActivityAccess().getSchedulerSchedulerEnumRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleScheduler_in_ruleActivity3105);
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

            otherlv_5=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleActivity3117); 

                	newLeafNode(otherlv_5, grammarAccess.getActivityAccess().getCpuAffinityKeyword_5());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1538:1: ( (lv_cpuAffinity_6_0= ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1539:1: (lv_cpuAffinity_6_0= ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1539:1: (lv_cpuAffinity_6_0= ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1540:3: lv_cpuAffinity_6_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getActivityAccess().getCpuAffinityEStringParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleActivity3138);
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

            otherlv_7=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleActivity3150); 

                	newLeafNode(otherlv_7, grammarAccess.getActivityAccess().getPeriodKeyword_7());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1560:1: ( (lv_period_8_0= ruleEFloat ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1561:1: (lv_period_8_0= ruleEFloat )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1561:1: (lv_period_8_0= ruleEFloat )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1562:3: lv_period_8_0= ruleEFloat
            {
             
            	        newCompositeNode(grammarAccess.getActivityAccess().getPeriodEFloatParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_ruleActivity3171);
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

            otherlv_9=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleActivity3183); 

                	newLeafNode(otherlv_9, grammarAccess.getActivityAccess().getPriorityKeyword_9());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1582:1: ( (lv_priority_10_0= ruleEInt ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1583:1: (lv_priority_10_0= ruleEInt )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1583:1: (lv_priority_10_0= ruleEInt )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1584:3: lv_priority_10_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getActivityAccess().getPriorityEIntParserRuleCall_10_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleActivity3204);
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

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1600:2: (otherlv_11= 'taskContext' ( ( ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==57) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1600:4: otherlv_11= 'taskContext' ( ( ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleActivity3217); 

                        	newLeafNode(otherlv_11, grammarAccess.getActivityAccess().getTaskContextKeyword_11_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1604:1: ( ( ruleEString ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1605:1: ( ruleEString )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1605:1: ( ruleEString )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1606:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActivityRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getTaskContextTaskContextCrossReference_11_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleActivity3240);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1619:4: (otherlv_13= 'slave' otherlv_14= '{' ( (lv_slave_15_0= ruleSlave ) ) (otherlv_16= ',' ( (lv_slave_17_0= ruleSlave ) ) )* otherlv_18= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==58) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1619:6: otherlv_13= 'slave' otherlv_14= '{' ( (lv_slave_15_0= ruleSlave ) ) (otherlv_16= ',' ( (lv_slave_17_0= ruleSlave ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleActivity3255); 

                        	newLeafNode(otherlv_13, grammarAccess.getActivityAccess().getSlaveKeyword_12_0());
                        
                    otherlv_14=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleActivity3267); 

                        	newLeafNode(otherlv_14, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_12_1());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1627:1: ( (lv_slave_15_0= ruleSlave ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1628:1: (lv_slave_15_0= ruleSlave )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1628:1: (lv_slave_15_0= ruleSlave )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1629:3: lv_slave_15_0= ruleSlave
                    {
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getSlaveSlaveParserRuleCall_12_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSlave_in_ruleActivity3288);
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

                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1645:2: (otherlv_16= ',' ( (lv_slave_17_0= ruleSlave ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==14) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1645:4: otherlv_16= ',' ( (lv_slave_17_0= ruleSlave ) )
                    	    {
                    	    otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleActivity3301); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getActivityAccess().getCommaKeyword_12_3_0());
                    	        
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1649:1: ( (lv_slave_17_0= ruleSlave ) )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1650:1: (lv_slave_17_0= ruleSlave )
                    	    {
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1650:1: (lv_slave_17_0= ruleSlave )
                    	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1651:3: lv_slave_17_0= ruleSlave
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getSlaveSlaveParserRuleCall_12_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSlave_in_ruleActivity3322);
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
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleActivity3336); 

                        	newLeafNode(otherlv_18, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_12_4());
                        

                    }
                    break;

            }

            otherlv_19=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleActivity3350); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1683:1: entryRuleSlave returns [EObject current=null] : iv_ruleSlave= ruleSlave EOF ;
    public final EObject entryRuleSlave() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlave = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1684:2: (iv_ruleSlave= ruleSlave EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1685:2: iv_ruleSlave= ruleSlave EOF
            {
             newCompositeNode(grammarAccess.getSlaveRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSlave_in_entryRuleSlave3386);
            iv_ruleSlave=ruleSlave();

            state._fsp--;

             current =iv_ruleSlave; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSlave3396); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1692:1: ruleSlave returns [EObject current=null] : ( () otherlv_1= 'Slave' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'taskContext' ( ( ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleSlave() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1695:28: ( ( () otherlv_1= 'Slave' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'taskContext' ( ( ruleEString ) ) )? otherlv_6= '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1696:1: ( () otherlv_1= 'Slave' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'taskContext' ( ( ruleEString ) ) )? otherlv_6= '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1696:1: ( () otherlv_1= 'Slave' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'taskContext' ( ( ruleEString ) ) )? otherlv_6= '}' )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1696:2: () otherlv_1= 'Slave' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'taskContext' ( ( ruleEString ) ) )? otherlv_6= '}'
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1696:2: ()
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1697:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSlaveAccess().getSlaveAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleSlave3442); 

                	newLeafNode(otherlv_1, grammarAccess.getSlaveAccess().getSlaveKeyword_1());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1706:1: ( (lv_name_2_0= ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1707:1: (lv_name_2_0= ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1707:1: (lv_name_2_0= ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1708:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSlaveAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSlave3463);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSlave3475); 

                	newLeafNode(otherlv_3, grammarAccess.getSlaveAccess().getLeftCurlyBracketKeyword_3());
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1728:1: (otherlv_4= 'taskContext' ( ( ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==57) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1728:3: otherlv_4= 'taskContext' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleSlave3488); 

                        	newLeafNode(otherlv_4, grammarAccess.getSlaveAccess().getTaskContextKeyword_4_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1732:1: ( ( ruleEString ) )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1733:1: ( ruleEString )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1733:1: ( ruleEString )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1734:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSlaveRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSlaveAccess().getTaskContextTaskContextCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSlave3511);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSlave3525); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1759:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1760:2: (iv_ruleEString= ruleEString EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1761:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString3562);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString3573); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1768:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1771:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1772:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1772:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_STRING) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_ID) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1772:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString3613); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1780:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString3639); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1795:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1796:2: (iv_ruleEFloat= ruleEFloat EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1797:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_entryRuleEFloat3685);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEFloat3696); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1804:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;

         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1807:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1808:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1808:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1808:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1808:2: (kw= '-' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==51) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1809:2: kw= '-'
                    {
                    kw=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleEFloat3735); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1814:3: (this_INT_1= RULE_INT )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_INT) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1814:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat3753); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleEFloat3773); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat3788); 

            		current.merge(this_INT_3);
                
             
                newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1834:1: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=61 && LA44_0<=62)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1834:2: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1834:2: (kw= 'E' | kw= 'e' )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==61) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==62) ) {
                        alt42=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1835:2: kw= 'E'
                            {
                            kw=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleEFloat3808); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1842:2: kw= 'e'
                            {
                            kw=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleEFloat3827); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                                

                            }
                            break;

                    }

                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1847:2: (kw= '-' )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==51) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1848:2: kw= '-'
                            {
                            kw=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleEFloat3842); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
                                

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat3859); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1868:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1869:2: (iv_ruleEInt= ruleEInt EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1870:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt3907);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt3918); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1877:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1880:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1881:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1881:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1881:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1881:2: (kw= '-' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==51) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1882:2: kw= '-'
                    {
                    kw=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleEInt3957); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt3974); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1902:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1903:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1904:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName4020);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedName4031); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1911:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1914:28: ( (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1915:1: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1915:1: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1915:6: this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName4071); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1922:1: (kw= '::' this_ID_2= RULE_ID )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==63) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1923:2: kw= '::' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleQualifiedName4090); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName4105); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop46;
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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1943:1: entryRuleQualifiedNameWithDot returns [String current=null] : iv_ruleQualifiedNameWithDot= ruleQualifiedNameWithDot EOF ;
    public final String entryRuleQualifiedNameWithDot() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithDot = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1944:2: (iv_ruleQualifiedNameWithDot= ruleQualifiedNameWithDot EOF )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1945:2: iv_ruleQualifiedNameWithDot= ruleQualifiedNameWithDot EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithDotRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_entryRuleQualifiedNameWithDot4153);
            iv_ruleQualifiedNameWithDot=ruleQualifiedNameWithDot();

            state._fsp--;

             current =iv_ruleQualifiedNameWithDot.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedNameWithDot4164); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1952:1: ruleQualifiedNameWithDot returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithDot() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1955:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1956:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1956:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )* )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1957:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' this_ID_2= RULE_ID )*
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithDotAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithDot4211);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1967:1: (kw= '.' this_ID_2= RULE_ID )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==60) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1968:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleQualifiedNameWithDot4230); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameWithDotAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedNameWithDot4245); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameWithDotAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop47;
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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1988:1: ruleConnectionPolicyLockPolicy returns [Enumerator current=null] : ( (enumLiteral_0= 'UNSYNC' ) | (enumLiteral_1= 'LOCKED' ) | (enumLiteral_2= 'LOCK_FREE' ) ) ;
    public final Enumerator ruleConnectionPolicyLockPolicy() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1990:28: ( ( (enumLiteral_0= 'UNSYNC' ) | (enumLiteral_1= 'LOCKED' ) | (enumLiteral_2= 'LOCK_FREE' ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1991:1: ( (enumLiteral_0= 'UNSYNC' ) | (enumLiteral_1= 'LOCKED' ) | (enumLiteral_2= 'LOCK_FREE' ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1991:1: ( (enumLiteral_0= 'UNSYNC' ) | (enumLiteral_1= 'LOCKED' ) | (enumLiteral_2= 'LOCK_FREE' ) )
            int alt48=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt48=1;
                }
                break;
            case 65:
                {
                alt48=2;
                }
                break;
            case 66:
                {
                alt48=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1991:2: (enumLiteral_0= 'UNSYNC' )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1991:2: (enumLiteral_0= 'UNSYNC' )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1991:4: enumLiteral_0= 'UNSYNC'
                    {
                    enumLiteral_0=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleConnectionPolicyLockPolicy4306); 

                            current = grammarAccess.getConnectionPolicyLockPolicyAccess().getUNSYNCEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getConnectionPolicyLockPolicyAccess().getUNSYNCEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1997:6: (enumLiteral_1= 'LOCKED' )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1997:6: (enumLiteral_1= 'LOCKED' )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:1997:8: enumLiteral_1= 'LOCKED'
                    {
                    enumLiteral_1=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleConnectionPolicyLockPolicy4323); 

                            current = grammarAccess.getConnectionPolicyLockPolicyAccess().getLOCKEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getConnectionPolicyLockPolicyAccess().getLOCKEDEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2003:6: (enumLiteral_2= 'LOCK_FREE' )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2003:6: (enumLiteral_2= 'LOCK_FREE' )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2003:8: enumLiteral_2= 'LOCK_FREE'
                    {
                    enumLiteral_2=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleConnectionPolicyLockPolicy4340); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2013:1: ruleConnectionPolicyType returns [Enumerator current=null] : ( (enumLiteral_0= 'DATA' ) | (enumLiteral_1= 'BUFFER' ) | (enumLiteral_2= 'CIRCULAR_BUFFER' ) ) ;
    public final Enumerator ruleConnectionPolicyType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2015:28: ( ( (enumLiteral_0= 'DATA' ) | (enumLiteral_1= 'BUFFER' ) | (enumLiteral_2= 'CIRCULAR_BUFFER' ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2016:1: ( (enumLiteral_0= 'DATA' ) | (enumLiteral_1= 'BUFFER' ) | (enumLiteral_2= 'CIRCULAR_BUFFER' ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2016:1: ( (enumLiteral_0= 'DATA' ) | (enumLiteral_1= 'BUFFER' ) | (enumLiteral_2= 'CIRCULAR_BUFFER' ) )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt49=1;
                }
                break;
            case 68:
                {
                alt49=2;
                }
                break;
            case 69:
                {
                alt49=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2016:2: (enumLiteral_0= 'DATA' )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2016:2: (enumLiteral_0= 'DATA' )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2016:4: enumLiteral_0= 'DATA'
                    {
                    enumLiteral_0=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleConnectionPolicyType4385); 

                            current = grammarAccess.getConnectionPolicyTypeAccess().getDATAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getConnectionPolicyTypeAccess().getDATAEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2022:6: (enumLiteral_1= 'BUFFER' )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2022:6: (enumLiteral_1= 'BUFFER' )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2022:8: enumLiteral_1= 'BUFFER'
                    {
                    enumLiteral_1=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleConnectionPolicyType4402); 

                            current = grammarAccess.getConnectionPolicyTypeAccess().getBUFFEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getConnectionPolicyTypeAccess().getBUFFEREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2028:6: (enumLiteral_2= 'CIRCULAR_BUFFER' )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2028:6: (enumLiteral_2= 'CIRCULAR_BUFFER' )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2028:8: enumLiteral_2= 'CIRCULAR_BUFFER'
                    {
                    enumLiteral_2=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleConnectionPolicyType4419); 

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
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2038:1: ruleConnectionPolicyTransport returns [Enumerator current=null] : ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'CORBA' ) | (enumLiteral_2= 'MQUEUE' ) | (enumLiteral_3= 'ROS' ) ) ;
    public final Enumerator ruleConnectionPolicyTransport() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2040:28: ( ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'CORBA' ) | (enumLiteral_2= 'MQUEUE' ) | (enumLiteral_3= 'ROS' ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2041:1: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'CORBA' ) | (enumLiteral_2= 'MQUEUE' ) | (enumLiteral_3= 'ROS' ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2041:1: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'CORBA' ) | (enumLiteral_2= 'MQUEUE' ) | (enumLiteral_3= 'ROS' ) )
            int alt50=4;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt50=1;
                }
                break;
            case 71:
                {
                alt50=2;
                }
                break;
            case 72:
                {
                alt50=3;
                }
                break;
            case 73:
                {
                alt50=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2041:2: (enumLiteral_0= 'default' )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2041:2: (enumLiteral_0= 'default' )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2041:4: enumLiteral_0= 'default'
                    {
                    enumLiteral_0=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleConnectionPolicyTransport4464); 

                            current = grammarAccess.getConnectionPolicyTransportAccess().getDefaultEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getConnectionPolicyTransportAccess().getDefaultEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2047:6: (enumLiteral_1= 'CORBA' )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2047:6: (enumLiteral_1= 'CORBA' )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2047:8: enumLiteral_1= 'CORBA'
                    {
                    enumLiteral_1=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleConnectionPolicyTransport4481); 

                            current = grammarAccess.getConnectionPolicyTransportAccess().getCORBAEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getConnectionPolicyTransportAccess().getCORBAEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2053:6: (enumLiteral_2= 'MQUEUE' )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2053:6: (enumLiteral_2= 'MQUEUE' )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2053:8: enumLiteral_2= 'MQUEUE'
                    {
                    enumLiteral_2=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleConnectionPolicyTransport4498); 

                            current = grammarAccess.getConnectionPolicyTransportAccess().getMQUEUEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getConnectionPolicyTransportAccess().getMQUEUEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2059:6: (enumLiteral_3= 'ROS' )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2059:6: (enumLiteral_3= 'ROS' )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2059:8: enumLiteral_3= 'ROS'
                    {
                    enumLiteral_3=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleConnectionPolicyTransport4515); 

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


    // $ANTLR start "ruleScheduler"
    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2069:1: ruleScheduler returns [Enumerator current=null] : ( (enumLiteral_0= 'ORO_SCHED_OTHER' ) | (enumLiteral_1= 'ORO_SCHED_RT' ) ) ;
    public final Enumerator ruleScheduler() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2071:28: ( ( (enumLiteral_0= 'ORO_SCHED_OTHER' ) | (enumLiteral_1= 'ORO_SCHED_RT' ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2072:1: ( (enumLiteral_0= 'ORO_SCHED_OTHER' ) | (enumLiteral_1= 'ORO_SCHED_RT' ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2072:1: ( (enumLiteral_0= 'ORO_SCHED_OTHER' ) | (enumLiteral_1= 'ORO_SCHED_RT' ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==74) ) {
                alt51=1;
            }
            else if ( (LA51_0==75) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2072:2: (enumLiteral_0= 'ORO_SCHED_OTHER' )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2072:2: (enumLiteral_0= 'ORO_SCHED_OTHER' )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2072:4: enumLiteral_0= 'ORO_SCHED_OTHER'
                    {
                    enumLiteral_0=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleScheduler4560); 

                            current = grammarAccess.getSchedulerAccess().getORO_SCHED_OTHEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSchedulerAccess().getORO_SCHED_OTHEREnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2078:6: (enumLiteral_1= 'ORO_SCHED_RT' )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2078:6: (enumLiteral_1= 'ORO_SCHED_RT' )
                    // ../be.kuleuven.rodinia.dsl.rtt/src-gen/be/kuleuven/rodinia/dsl/rtt/parser/antlr/internal/InternalRttStructure.g:2078:8: enumLiteral_1= 'ORO_SCHED_RT'
                    {
                    enumLiteral_1=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruleScheduler4577); 

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
        public static final BitSet FOLLOW_12_in_rulePackage285 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_ruleConnectionPolicy_in_rulePackage306 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_rulePackage319 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_ruleConnectionPolicy_in_rulePackage340 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_rulePackage354 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_17_in_rulePackage369 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePackage381 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rulePeerGroup_in_rulePackage402 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_rulePackage415 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rulePeerGroup_in_rulePackage436 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_rulePackage450 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulePackage464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTaskContext_in_entryRuleTaskContext500 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTaskContext510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleTaskContext547 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTaskContext568 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTaskContext580 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleTaskContext592 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_ruleTaskContext613 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleTaskContext625 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_ruleTaskContext646 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleTaskContext658 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_ruleActivity_in_ruleTaskContext679 = new BitSet(new long[]{0x0000000007C08000L});
        public static final BitSet FOLLOW_22_in_ruleTaskContext692 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTaskContext704 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_ruleInputPort_in_ruleTaskContext725 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleTaskContext738 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_ruleInputPort_in_ruleTaskContext759 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleTaskContext773 = new BitSet(new long[]{0x0000000007808000L});
        public static final BitSet FOLLOW_23_in_ruleTaskContext788 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTaskContext800 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_ruleEventPort_in_ruleTaskContext821 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleTaskContext834 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_ruleEventPort_in_ruleTaskContext855 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleTaskContext869 = new BitSet(new long[]{0x0000000007008000L});
        public static final BitSet FOLLOW_24_in_ruleTaskContext884 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTaskContext896 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_ruleOutputPort_in_ruleTaskContext917 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleTaskContext930 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_ruleOutputPort_in_ruleTaskContext951 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleTaskContext965 = new BitSet(new long[]{0x0000000006008000L});
        public static final BitSet FOLLOW_25_in_ruleTaskContext980 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTaskContext992 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_ruleProperty_in_ruleTaskContext1013 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleTaskContext1026 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_ruleProperty_in_ruleTaskContext1047 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleTaskContext1061 = new BitSet(new long[]{0x0000000004008000L});
        public static final BitSet FOLLOW_26_in_ruleTaskContext1076 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTaskContext1088 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleTaskContext1109 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleTaskContext1122 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleTaskContext1143 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleTaskContext1157 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleTaskContext1171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePeerGroup_in_entryRulePeerGroup1207 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePeerGroup1217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rulePeerGroup1254 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_rulePeerGroup1275 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePeerGroup1287 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_rulePeerGroup1299 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_rulePeerGroup1322 = new BitSet(new long[]{0x0000000020008000L});
        public static final BitSet FOLLOW_29_in_rulePeerGroup1335 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_rulePeerGroup1347 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_rulePeerGroup1370 = new BitSet(new long[]{0x0000000080004000L});
        public static final BitSet FOLLOW_14_in_rulePeerGroup1383 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_rulePeerGroup1406 = new BitSet(new long[]{0x0000000080004000L});
        public static final BitSet FOLLOW_31_in_rulePeerGroup1420 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulePeerGroup1434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConnectionPolicy_in_entryRuleConnectionPolicy1470 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConnectionPolicy1480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleConnectionPolicy1517 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConnectionPolicy1538 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleConnectionPolicy1550 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleConnectionPolicy1562 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConnectionPolicy1585 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleConnectionPolicy1597 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConnectionPolicy1620 = new BitSet(new long[]{0x000001F800108000L});
        public static final BitSet FOLLOW_35_in_ruleConnectionPolicy1638 = new BitSet(new long[]{0x000001F000108000L});
        public static final BitSet FOLLOW_36_in_ruleConnectionPolicy1670 = new BitSet(new long[]{0x000001E000108000L});
        public static final BitSet FOLLOW_37_in_ruleConnectionPolicy1697 = new BitSet(new long[]{0x0008000000000010L});
        public static final BitSet FOLLOW_ruleEShort_in_ruleConnectionPolicy1718 = new BitSet(new long[]{0x000001C000108000L});
        public static final BitSet FOLLOW_38_in_ruleConnectionPolicy1733 = new BitSet(new long[]{0x0008000000000010L});
        public static final BitSet FOLLOW_ruleEShort_in_ruleConnectionPolicy1754 = new BitSet(new long[]{0x0000018000108000L});
        public static final BitSet FOLLOW_39_in_ruleConnectionPolicy1769 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleConnectionPolicyLockPolicy_in_ruleConnectionPolicy1790 = new BitSet(new long[]{0x0000010000108000L});
        public static final BitSet FOLLOW_40_in_ruleConnectionPolicy1805 = new BitSet(new long[]{0x0000000000000000L,0x00000000000003C0L});
        public static final BitSet FOLLOW_ruleConnectionPolicyTransport_in_ruleConnectionPolicy1826 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_20_in_ruleConnectionPolicy1841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000038L});
        public static final BitSet FOLLOW_ruleConnectionPolicyType_in_ruleConnectionPolicy1862 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleConnectionPolicy1876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputPort_in_entryRuleInputPort1912 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputPort1922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleInputPort1959 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputPort1980 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleInputPort1992 = new BitSet(new long[]{0x0000040000008000L});
        public static final BitSet FOLLOW_42_in_ruleInputPort2005 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_ruleInputPort2028 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleInputPort2042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEventPort_in_entryRuleEventPort2078 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEventPort2088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleEventPort2134 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEventPort2155 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEventPort2167 = new BitSet(new long[]{0x0000040000008000L});
        public static final BitSet FOLLOW_42_in_ruleEventPort2180 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEventPort2203 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleEventPort2217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOutputPort_in_entryRuleOutputPort2253 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOutputPort2263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleOutputPort2300 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOutputPort2321 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOutputPort2333 = new BitSet(new long[]{0x0000040000008000L});
        public static final BitSet FOLLOW_42_in_ruleOutputPort2346 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_ruleOutputPort2369 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleOutputPort2383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty2419 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProperty2429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleProperty2475 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProperty2496 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleProperty2508 = new BitSet(new long[]{0x0000C00000108000L});
        public static final BitSet FOLLOW_46_in_ruleProperty2521 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProperty2542 = new BitSet(new long[]{0x0000800000108000L});
        public static final BitSet FOLLOW_47_in_ruleProperty2557 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProperty2578 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_20_in_ruleProperty2593 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_ruleProperty2616 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleProperty2630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation2666 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperation2676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleOperation2722 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOperation2743 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOperation2755 = new BitSet(new long[]{0x0006000000008000L});
        public static final BitSet FOLLOW_49_in_ruleOperation2768 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOperation2789 = new BitSet(new long[]{0x0004000000008000L});
        public static final BitSet FOLLOW_50_in_ruleOperation2804 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_ruleOperation2827 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleOperation2841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEShort_in_entryRuleEShort2878 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEShort2889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleEShort2928 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEShort2945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity2992 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleActivity3002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleActivity3039 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleActivity3060 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleActivity3072 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleActivity3084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
        public static final BitSet FOLLOW_ruleScheduler_in_ruleActivity3105 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_ruleActivity3117 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleActivity3138 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleActivity3150 = new BitSet(new long[]{0x1008000000000010L});
        public static final BitSet FOLLOW_ruleEFloat_in_ruleActivity3171 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_ruleActivity3183 = new BitSet(new long[]{0x0008000000000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleActivity3204 = new BitSet(new long[]{0x0600000000008000L});
        public static final BitSet FOLLOW_57_in_ruleActivity3217 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleActivity3240 = new BitSet(new long[]{0x0400000000008000L});
        public static final BitSet FOLLOW_58_in_ruleActivity3255 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleActivity3267 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_ruleSlave_in_ruleActivity3288 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleActivity3301 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_ruleSlave_in_ruleActivity3322 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleActivity3336 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleActivity3350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSlave_in_entryRuleSlave3386 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSlave3396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleSlave3442 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSlave3463 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSlave3475 = new BitSet(new long[]{0x0200000000008000L});
        public static final BitSet FOLLOW_57_in_ruleSlave3488 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSlave3511 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSlave3525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString3562 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString3573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString3613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString3639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_entryRuleEFloat3685 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEFloat3696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleEFloat3735 = new BitSet(new long[]{0x1000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat3753 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_60_in_ruleEFloat3773 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat3788 = new BitSet(new long[]{0x6000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleEFloat3808 = new BitSet(new long[]{0x0008000000000010L});
        public static final BitSet FOLLOW_62_in_ruleEFloat3827 = new BitSet(new long[]{0x0008000000000010L});
        public static final BitSet FOLLOW_51_in_ruleEFloat3842 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat3859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt3907 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt3918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleEInt3957 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt3974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName4020 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName4031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName4071 = new BitSet(new long[]{0x8000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleQualifiedName4090 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName4105 = new BitSet(new long[]{0x8000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_entryRuleQualifiedNameWithDot4153 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithDot4164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithDot4211 = new BitSet(new long[]{0x1000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleQualifiedNameWithDot4230 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedNameWithDot4245 = new BitSet(new long[]{0x1000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleConnectionPolicyLockPolicy4306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleConnectionPolicyLockPolicy4323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleConnectionPolicyLockPolicy4340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleConnectionPolicyType4385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleConnectionPolicyType4402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleConnectionPolicyType4419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleConnectionPolicyTransport4464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleConnectionPolicyTransport4481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleConnectionPolicyTransport4498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleConnectionPolicyTransport4515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_ruleScheduler4560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_ruleScheduler4577 = new BitSet(new long[]{0x0000000000000002L});
    }


}