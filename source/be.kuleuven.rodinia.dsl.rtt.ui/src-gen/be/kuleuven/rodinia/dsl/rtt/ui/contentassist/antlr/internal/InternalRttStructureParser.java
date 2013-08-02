package be.kuleuven.rodinia.dsl.rtt.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import be.kuleuven.rodinia.dsl.rtt.services.RttStructureGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRttStructureParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'UNSYNC'", "'LOCKED'", "'LOCK_FREE'", "'DATA'", "'BUFFER'", "'ORO_SCHED_OTHER'", "'ORO_SCHED_RT'", "'OrocosPackage'", "'{'", "'}'", "'taskContexts'", "','", "'connectionPolicies'", "'peerGroups'", "'TaskContext'", "'namespace'", "'type'", "'activity'", "'inputPorts'", "'outputPorts'", "'properties'", "'operations'", "'PeerGroup'", "'coordinator'", "'members'", "'('", "')'", "'ConnectionPolicy'", "'inputPort'", "'outputPort'", "'bufferSize'", "'lockPolicy'", "'InputPort'", "'dataType'", "'inputConnectionPolicy'", "'OutputPort'", "'outputConnectionPolicy'", "'Property'", "'description'", "'value'", "'Operation'", "'documentation'", "'returnType'", "'-'", "'Activity'", "'scheduler'", "'cpuAffinity'", "'period'", "'priority'", "'taskContext'", "'slave'", "'Slave'", "'.'", "'::'", "'isEventPort'"
    };
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
    public String getGrammarFileName() { return "../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g"; }


     
     	private RttStructureGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(RttStructureGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRulePackage"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:60:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:61:1: ( rulePackage EOF )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:62:1: rulePackage EOF
            {
             before(grammarAccess.getPackageRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePackage_in_entryRulePackage61);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePackage68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:69:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:73:2: ( ( ( rule__Package__Group__0 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:74:1: ( ( rule__Package__Group__0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:74:1: ( ( rule__Package__Group__0 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:75:1: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:76:1: ( rule__Package__Group__0 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:76:2: rule__Package__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__0_in_rulePackage94);
            rule__Package__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleTaskContext"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:88:1: entryRuleTaskContext : ruleTaskContext EOF ;
    public final void entryRuleTaskContext() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:89:1: ( ruleTaskContext EOF )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:90:1: ruleTaskContext EOF
            {
             before(grammarAccess.getTaskContextRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTaskContext_in_entryRuleTaskContext121);
            ruleTaskContext();

            state._fsp--;

             after(grammarAccess.getTaskContextRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTaskContext128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTaskContext"


    // $ANTLR start "ruleTaskContext"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:97:1: ruleTaskContext : ( ( rule__TaskContext__Group__0 ) ) ;
    public final void ruleTaskContext() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:101:2: ( ( ( rule__TaskContext__Group__0 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:102:1: ( ( rule__TaskContext__Group__0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:102:1: ( ( rule__TaskContext__Group__0 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:103:1: ( rule__TaskContext__Group__0 )
            {
             before(grammarAccess.getTaskContextAccess().getGroup()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:104:1: ( rule__TaskContext__Group__0 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:104:2: rule__TaskContext__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__0_in_ruleTaskContext154);
            rule__TaskContext__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskContextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTaskContext"


    // $ANTLR start "entryRulePeerGroup"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:116:1: entryRulePeerGroup : rulePeerGroup EOF ;
    public final void entryRulePeerGroup() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:117:1: ( rulePeerGroup EOF )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:118:1: rulePeerGroup EOF
            {
             before(grammarAccess.getPeerGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePeerGroup_in_entryRulePeerGroup181);
            rulePeerGroup();

            state._fsp--;

             after(grammarAccess.getPeerGroupRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePeerGroup188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePeerGroup"


    // $ANTLR start "rulePeerGroup"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:125:1: rulePeerGroup : ( ( rule__PeerGroup__Group__0 ) ) ;
    public final void rulePeerGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:129:2: ( ( ( rule__PeerGroup__Group__0 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:130:1: ( ( rule__PeerGroup__Group__0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:130:1: ( ( rule__PeerGroup__Group__0 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:131:1: ( rule__PeerGroup__Group__0 )
            {
             before(grammarAccess.getPeerGroupAccess().getGroup()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:132:1: ( rule__PeerGroup__Group__0 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:132:2: rule__PeerGroup__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group__0_in_rulePeerGroup214);
            rule__PeerGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPeerGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePeerGroup"


    // $ANTLR start "entryRuleConnectionPolicy"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:144:1: entryRuleConnectionPolicy : ruleConnectionPolicy EOF ;
    public final void entryRuleConnectionPolicy() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:145:1: ( ruleConnectionPolicy EOF )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:146:1: ruleConnectionPolicy EOF
            {
             before(grammarAccess.getConnectionPolicyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConnectionPolicy_in_entryRuleConnectionPolicy241);
            ruleConnectionPolicy();

            state._fsp--;

             after(grammarAccess.getConnectionPolicyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConnectionPolicy248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConnectionPolicy"


    // $ANTLR start "ruleConnectionPolicy"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:153:1: ruleConnectionPolicy : ( ( rule__ConnectionPolicy__Group__0 ) ) ;
    public final void ruleConnectionPolicy() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:157:2: ( ( ( rule__ConnectionPolicy__Group__0 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:158:1: ( ( rule__ConnectionPolicy__Group__0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:158:1: ( ( rule__ConnectionPolicy__Group__0 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:159:1: ( rule__ConnectionPolicy__Group__0 )
            {
             before(grammarAccess.getConnectionPolicyAccess().getGroup()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:160:1: ( rule__ConnectionPolicy__Group__0 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:160:2: rule__ConnectionPolicy__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__0_in_ruleConnectionPolicy274);
            rule__ConnectionPolicy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectionPolicyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnectionPolicy"


    // $ANTLR start "entryRuleInputPort"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:172:1: entryRuleInputPort : ruleInputPort EOF ;
    public final void entryRuleInputPort() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:173:1: ( ruleInputPort EOF )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:174:1: ruleInputPort EOF
            {
             before(grammarAccess.getInputPortRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputPort_in_entryRuleInputPort301);
            ruleInputPort();

            state._fsp--;

             after(grammarAccess.getInputPortRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputPort308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInputPort"


    // $ANTLR start "ruleInputPort"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:181:1: ruleInputPort : ( ( rule__InputPort__Group__0 ) ) ;
    public final void ruleInputPort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:185:2: ( ( ( rule__InputPort__Group__0 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:186:1: ( ( rule__InputPort__Group__0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:186:1: ( ( rule__InputPort__Group__0 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:187:1: ( rule__InputPort__Group__0 )
            {
             before(grammarAccess.getInputPortAccess().getGroup()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:188:1: ( rule__InputPort__Group__0 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:188:2: rule__InputPort__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__0_in_ruleInputPort334);
            rule__InputPort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputPort"


    // $ANTLR start "entryRuleOutputPort"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:200:1: entryRuleOutputPort : ruleOutputPort EOF ;
    public final void entryRuleOutputPort() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:201:1: ( ruleOutputPort EOF )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:202:1: ruleOutputPort EOF
            {
             before(grammarAccess.getOutputPortRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOutputPort_in_entryRuleOutputPort361);
            ruleOutputPort();

            state._fsp--;

             after(grammarAccess.getOutputPortRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOutputPort368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOutputPort"


    // $ANTLR start "ruleOutputPort"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:209:1: ruleOutputPort : ( ( rule__OutputPort__Group__0 ) ) ;
    public final void ruleOutputPort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:213:2: ( ( ( rule__OutputPort__Group__0 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:214:1: ( ( rule__OutputPort__Group__0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:214:1: ( ( rule__OutputPort__Group__0 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:215:1: ( rule__OutputPort__Group__0 )
            {
             before(grammarAccess.getOutputPortAccess().getGroup()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:216:1: ( rule__OutputPort__Group__0 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:216:2: rule__OutputPort__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__0_in_ruleOutputPort394);
            rule__OutputPort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutputPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutputPort"


    // $ANTLR start "entryRuleProperty"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:228:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:229:1: ( ruleProperty EOF )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:230:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_entryRuleProperty421);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProperty428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:237:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:241:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:242:1: ( ( rule__Property__Group__0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:242:1: ( ( rule__Property__Group__0 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:243:1: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:244:1: ( rule__Property__Group__0 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:244:2: rule__Property__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__0_in_ruleProperty454);
            rule__Property__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleOperation"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:256:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:257:1: ( ruleOperation EOF )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:258:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_entryRuleOperation481);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperation488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:265:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:269:2: ( ( ( rule__Operation__Group__0 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:270:1: ( ( rule__Operation__Group__0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:270:1: ( ( rule__Operation__Group__0 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:271:1: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:272:1: ( rule__Operation__Group__0 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:272:2: rule__Operation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__0_in_ruleOperation514);
            rule__Operation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleEShort"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:284:1: entryRuleEShort : ruleEShort EOF ;
    public final void entryRuleEShort() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:285:1: ( ruleEShort EOF )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:286:1: ruleEShort EOF
            {
             before(grammarAccess.getEShortRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEShort_in_entryRuleEShort541);
            ruleEShort();

            state._fsp--;

             after(grammarAccess.getEShortRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEShort548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEShort"


    // $ANTLR start "ruleEShort"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:293:1: ruleEShort : ( ( rule__EShort__Group__0 ) ) ;
    public final void ruleEShort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:297:2: ( ( ( rule__EShort__Group__0 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:298:1: ( ( rule__EShort__Group__0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:298:1: ( ( rule__EShort__Group__0 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:299:1: ( rule__EShort__Group__0 )
            {
             before(grammarAccess.getEShortAccess().getGroup()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:300:1: ( rule__EShort__Group__0 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:300:2: rule__EShort__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EShort__Group__0_in_ruleEShort574);
            rule__EShort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEShortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEShort"


    // $ANTLR start "entryRuleActivity"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:314:1: entryRuleActivity : ruleActivity EOF ;
    public final void entryRuleActivity() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:315:1: ( ruleActivity EOF )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:316:1: ruleActivity EOF
            {
             before(grammarAccess.getActivityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleActivity_in_entryRuleActivity603);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getActivityRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleActivity610); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:323:1: ruleActivity : ( ( rule__Activity__Group__0 ) ) ;
    public final void ruleActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:327:2: ( ( ( rule__Activity__Group__0 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:328:1: ( ( rule__Activity__Group__0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:328:1: ( ( rule__Activity__Group__0 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:329:1: ( rule__Activity__Group__0 )
            {
             before(grammarAccess.getActivityAccess().getGroup()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:330:1: ( rule__Activity__Group__0 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:330:2: rule__Activity__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__0_in_ruleActivity636);
            rule__Activity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleSlave"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:342:1: entryRuleSlave : ruleSlave EOF ;
    public final void entryRuleSlave() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:343:1: ( ruleSlave EOF )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:344:1: ruleSlave EOF
            {
             before(grammarAccess.getSlaveRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSlave_in_entryRuleSlave663);
            ruleSlave();

            state._fsp--;

             after(grammarAccess.getSlaveRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSlave670); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSlave"


    // $ANTLR start "ruleSlave"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:351:1: ruleSlave : ( ( rule__Slave__Group__0 ) ) ;
    public final void ruleSlave() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:355:2: ( ( ( rule__Slave__Group__0 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:356:1: ( ( rule__Slave__Group__0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:356:1: ( ( rule__Slave__Group__0 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:357:1: ( rule__Slave__Group__0 )
            {
             before(grammarAccess.getSlaveAccess().getGroup()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:358:1: ( rule__Slave__Group__0 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:358:2: rule__Slave__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group__0_in_ruleSlave696);
            rule__Slave__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSlaveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSlave"


    // $ANTLR start "entryRuleEString"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:370:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:371:1: ( ruleEString EOF )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:372:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString723);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString730); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:379:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:383:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:384:1: ( ( rule__EString__Alternatives ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:384:1: ( ( rule__EString__Alternatives ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:385:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:386:1: ( rule__EString__Alternatives )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:386:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString756);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEFloat"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:398:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:399:1: ( ruleEFloat EOF )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:400:1: ruleEFloat EOF
            {
             before(grammarAccess.getEFloatRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_entryRuleEFloat783);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getEFloatRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEFloat790); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:407:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:411:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:412:1: ( ( rule__EFloat__Group__0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:412:1: ( ( rule__EFloat__Group__0 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:413:1: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:414:1: ( rule__EFloat__Group__0 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:414:2: rule__EFloat__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__0_in_ruleEFloat816);
            rule__EFloat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleEInt"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:426:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:427:1: ( ruleEInt EOF )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:428:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt843);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt850); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:435:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:439:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:440:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:440:1: ( ( rule__EInt__Group__0 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:441:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:442:1: ( rule__EInt__Group__0 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:442:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt876);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleQualifiedName"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:454:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:455:1: ( ruleQualifiedName EOF )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:456:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName903);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedName910); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:463:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:467:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:468:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:468:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:469:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:470:1: ( rule__QualifiedName__Group__0 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:470:2: rule__QualifiedName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName936);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithDot"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:482:1: entryRuleQualifiedNameWithDot : ruleQualifiedNameWithDot EOF ;
    public final void entryRuleQualifiedNameWithDot() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:483:1: ( ruleQualifiedNameWithDot EOF )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:484:1: ruleQualifiedNameWithDot EOF
            {
             before(grammarAccess.getQualifiedNameWithDotRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_entryRuleQualifiedNameWithDot963);
            ruleQualifiedNameWithDot();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithDotRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedNameWithDot970); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedNameWithDot"


    // $ANTLR start "ruleQualifiedNameWithDot"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:491:1: ruleQualifiedNameWithDot : ( ( rule__QualifiedNameWithDot__Group__0 ) ) ;
    public final void ruleQualifiedNameWithDot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:495:2: ( ( ( rule__QualifiedNameWithDot__Group__0 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:496:1: ( ( rule__QualifiedNameWithDot__Group__0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:496:1: ( ( rule__QualifiedNameWithDot__Group__0 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:497:1: ( rule__QualifiedNameWithDot__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithDotAccess().getGroup()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:498:1: ( rule__QualifiedNameWithDot__Group__0 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:498:2: rule__QualifiedNameWithDot__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedNameWithDot__Group__0_in_ruleQualifiedNameWithDot996);
            rule__QualifiedNameWithDot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithDotAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithDot"


    // $ANTLR start "ruleConnectionPolicyLockPolicy"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:511:1: ruleConnectionPolicyLockPolicy : ( ( rule__ConnectionPolicyLockPolicy__Alternatives ) ) ;
    public final void ruleConnectionPolicyLockPolicy() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:515:1: ( ( ( rule__ConnectionPolicyLockPolicy__Alternatives ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:516:1: ( ( rule__ConnectionPolicyLockPolicy__Alternatives ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:516:1: ( ( rule__ConnectionPolicyLockPolicy__Alternatives ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:517:1: ( rule__ConnectionPolicyLockPolicy__Alternatives )
            {
             before(grammarAccess.getConnectionPolicyLockPolicyAccess().getAlternatives()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:518:1: ( rule__ConnectionPolicyLockPolicy__Alternatives )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:518:2: rule__ConnectionPolicyLockPolicy__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicyLockPolicy__Alternatives_in_ruleConnectionPolicyLockPolicy1033);
            rule__ConnectionPolicyLockPolicy__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConnectionPolicyLockPolicyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnectionPolicyLockPolicy"


    // $ANTLR start "ruleConnectionPolicyType"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:530:1: ruleConnectionPolicyType : ( ( rule__ConnectionPolicyType__Alternatives ) ) ;
    public final void ruleConnectionPolicyType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:534:1: ( ( ( rule__ConnectionPolicyType__Alternatives ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:535:1: ( ( rule__ConnectionPolicyType__Alternatives ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:535:1: ( ( rule__ConnectionPolicyType__Alternatives ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:536:1: ( rule__ConnectionPolicyType__Alternatives )
            {
             before(grammarAccess.getConnectionPolicyTypeAccess().getAlternatives()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:537:1: ( rule__ConnectionPolicyType__Alternatives )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:537:2: rule__ConnectionPolicyType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicyType__Alternatives_in_ruleConnectionPolicyType1069);
            rule__ConnectionPolicyType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConnectionPolicyTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnectionPolicyType"


    // $ANTLR start "ruleScheduler"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:549:1: ruleScheduler : ( ( rule__Scheduler__Alternatives ) ) ;
    public final void ruleScheduler() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:553:1: ( ( ( rule__Scheduler__Alternatives ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:554:1: ( ( rule__Scheduler__Alternatives ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:554:1: ( ( rule__Scheduler__Alternatives ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:555:1: ( rule__Scheduler__Alternatives )
            {
             before(grammarAccess.getSchedulerAccess().getAlternatives()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:556:1: ( rule__Scheduler__Alternatives )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:556:2: rule__Scheduler__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scheduler__Alternatives_in_ruleScheduler1105);
            rule__Scheduler__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSchedulerAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScheduler"


    // $ANTLR start "rule__EString__Alternatives"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:568:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:572:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:573:1: ( RULE_STRING )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:573:1: ( RULE_STRING )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:574:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1141); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:579:6: ( RULE_ID )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:579:6: ( RULE_ID )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:580:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1158); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EFloat__Alternatives_4_0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:590:1: rule__EFloat__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloat__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:594:1: ( ( 'E' ) | ( 'e' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:595:1: ( 'E' )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:595:1: ( 'E' )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:596:1: 'E'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__EFloat__Alternatives_4_01191); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:603:6: ( 'e' )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:603:6: ( 'e' )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:604:1: 'e'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__EFloat__Alternatives_4_01211); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Alternatives_4_0"


    // $ANTLR start "rule__ConnectionPolicyLockPolicy__Alternatives"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:616:1: rule__ConnectionPolicyLockPolicy__Alternatives : ( ( ( 'UNSYNC' ) ) | ( ( 'LOCKED' ) ) | ( ( 'LOCK_FREE' ) ) );
    public final void rule__ConnectionPolicyLockPolicy__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:620:1: ( ( ( 'UNSYNC' ) ) | ( ( 'LOCKED' ) ) | ( ( 'LOCK_FREE' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:621:1: ( ( 'UNSYNC' ) )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:621:1: ( ( 'UNSYNC' ) )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:622:1: ( 'UNSYNC' )
                    {
                     before(grammarAccess.getConnectionPolicyLockPolicyAccess().getUNSYNCEnumLiteralDeclaration_0()); 
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:623:1: ( 'UNSYNC' )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:623:3: 'UNSYNC'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__ConnectionPolicyLockPolicy__Alternatives1246); 

                    }

                     after(grammarAccess.getConnectionPolicyLockPolicyAccess().getUNSYNCEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:628:6: ( ( 'LOCKED' ) )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:628:6: ( ( 'LOCKED' ) )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:629:1: ( 'LOCKED' )
                    {
                     before(grammarAccess.getConnectionPolicyLockPolicyAccess().getLOCKEDEnumLiteralDeclaration_1()); 
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:630:1: ( 'LOCKED' )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:630:3: 'LOCKED'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__ConnectionPolicyLockPolicy__Alternatives1267); 

                    }

                     after(grammarAccess.getConnectionPolicyLockPolicyAccess().getLOCKEDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:635:6: ( ( 'LOCK_FREE' ) )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:635:6: ( ( 'LOCK_FREE' ) )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:636:1: ( 'LOCK_FREE' )
                    {
                     before(grammarAccess.getConnectionPolicyLockPolicyAccess().getLOCK_FREEEnumLiteralDeclaration_2()); 
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:637:1: ( 'LOCK_FREE' )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:637:3: 'LOCK_FREE'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__ConnectionPolicyLockPolicy__Alternatives1288); 

                    }

                     after(grammarAccess.getConnectionPolicyLockPolicyAccess().getLOCK_FREEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicyLockPolicy__Alternatives"


    // $ANTLR start "rule__ConnectionPolicyType__Alternatives"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:647:1: rule__ConnectionPolicyType__Alternatives : ( ( ( 'DATA' ) ) | ( ( 'BUFFER' ) ) );
    public final void rule__ConnectionPolicyType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:651:1: ( ( ( 'DATA' ) ) | ( ( 'BUFFER' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:652:1: ( ( 'DATA' ) )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:652:1: ( ( 'DATA' ) )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:653:1: ( 'DATA' )
                    {
                     before(grammarAccess.getConnectionPolicyTypeAccess().getDATAEnumLiteralDeclaration_0()); 
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:654:1: ( 'DATA' )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:654:3: 'DATA'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__ConnectionPolicyType__Alternatives1324); 

                    }

                     after(grammarAccess.getConnectionPolicyTypeAccess().getDATAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:659:6: ( ( 'BUFFER' ) )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:659:6: ( ( 'BUFFER' ) )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:660:1: ( 'BUFFER' )
                    {
                     before(grammarAccess.getConnectionPolicyTypeAccess().getBUFFEREnumLiteralDeclaration_1()); 
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:661:1: ( 'BUFFER' )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:661:3: 'BUFFER'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__ConnectionPolicyType__Alternatives1345); 

                    }

                     after(grammarAccess.getConnectionPolicyTypeAccess().getBUFFEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicyType__Alternatives"


    // $ANTLR start "rule__Scheduler__Alternatives"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:671:1: rule__Scheduler__Alternatives : ( ( ( 'ORO_SCHED_OTHER' ) ) | ( ( 'ORO_SCHED_RT' ) ) );
    public final void rule__Scheduler__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:675:1: ( ( ( 'ORO_SCHED_OTHER' ) ) | ( ( 'ORO_SCHED_RT' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:676:1: ( ( 'ORO_SCHED_OTHER' ) )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:676:1: ( ( 'ORO_SCHED_OTHER' ) )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:677:1: ( 'ORO_SCHED_OTHER' )
                    {
                     before(grammarAccess.getSchedulerAccess().getORO_SCHED_OTHEREnumLiteralDeclaration_0()); 
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:678:1: ( 'ORO_SCHED_OTHER' )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:678:3: 'ORO_SCHED_OTHER'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__Scheduler__Alternatives1381); 

                    }

                     after(grammarAccess.getSchedulerAccess().getORO_SCHED_OTHEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:683:6: ( ( 'ORO_SCHED_RT' ) )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:683:6: ( ( 'ORO_SCHED_RT' ) )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:684:1: ( 'ORO_SCHED_RT' )
                    {
                     before(grammarAccess.getSchedulerAccess().getORO_SCHED_RTEnumLiteralDeclaration_1()); 
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:685:1: ( 'ORO_SCHED_RT' )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:685:3: 'ORO_SCHED_RT'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__Scheduler__Alternatives1402); 

                    }

                     after(grammarAccess.getSchedulerAccess().getORO_SCHED_RTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scheduler__Alternatives"


    // $ANTLR start "rule__Package__Group__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:697:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:701:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:702:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__01435);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__1_in_rule__Package__Group__01438);
            rule__Package__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0"


    // $ANTLR start "rule__Package__Group__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:709:1: rule__Package__Group__0__Impl : ( () ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:713:1: ( ( () ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:714:1: ( () )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:714:1: ( () )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:715:1: ()
            {
             before(grammarAccess.getPackageAccess().getOrocosPackageAction_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:716:1: ()
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:718:1: 
            {
            }

             after(grammarAccess.getPackageAccess().getOrocosPackageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0__Impl"


    // $ANTLR start "rule__Package__Group__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:728:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:732:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:733:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__11496);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__2_in_rule__Package__Group__11499);
            rule__Package__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1"


    // $ANTLR start "rule__Package__Group__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:740:1: rule__Package__Group__1__Impl : ( 'OrocosPackage' ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:744:1: ( ( 'OrocosPackage' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:745:1: ( 'OrocosPackage' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:745:1: ( 'OrocosPackage' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:746:1: 'OrocosPackage'
            {
             before(grammarAccess.getPackageAccess().getOrocosPackageKeyword_1()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Package__Group__1__Impl1527); 
             after(grammarAccess.getPackageAccess().getOrocosPackageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1__Impl"


    // $ANTLR start "rule__Package__Group__2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:759:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:763:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:764:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__21558);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__3_in_rule__Package__Group__21561);
            rule__Package__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2"


    // $ANTLR start "rule__Package__Group__2__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:771:1: rule__Package__Group__2__Impl : ( ( rule__Package__NameAssignment_2 ) ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:775:1: ( ( ( rule__Package__NameAssignment_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:776:1: ( ( rule__Package__NameAssignment_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:776:1: ( ( rule__Package__NameAssignment_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:777:1: ( rule__Package__NameAssignment_2 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:778:1: ( rule__Package__NameAssignment_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:778:2: rule__Package__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__NameAssignment_2_in_rule__Package__Group__2__Impl1588);
            rule__Package__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2__Impl"


    // $ANTLR start "rule__Package__Group__3"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:788:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:792:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:793:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__31618);
            rule__Package__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__4_in_rule__Package__Group__31621);
            rule__Package__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__3"


    // $ANTLR start "rule__Package__Group__3__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:800:1: rule__Package__Group__3__Impl : ( '{' ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:804:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:805:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:805:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:806:1: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Package__Group__3__Impl1649); 
             after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__3__Impl"


    // $ANTLR start "rule__Package__Group__4"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:819:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:823:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:824:2: rule__Package__Group__4__Impl rule__Package__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__41680);
            rule__Package__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__5_in_rule__Package__Group__41683);
            rule__Package__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__4"


    // $ANTLR start "rule__Package__Group__4__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:831:1: rule__Package__Group__4__Impl : ( ( rule__Package__Group_4__0 )? ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:835:1: ( ( ( rule__Package__Group_4__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:836:1: ( ( rule__Package__Group_4__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:836:1: ( ( rule__Package__Group_4__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:837:1: ( rule__Package__Group_4__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_4()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:838:1: ( rule__Package__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:838:2: rule__Package__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__0_in_rule__Package__Group__4__Impl1710);
                    rule__Package__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackageAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__4__Impl"


    // $ANTLR start "rule__Package__Group__5"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:848:1: rule__Package__Group__5 : rule__Package__Group__5__Impl rule__Package__Group__6 ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:852:1: ( rule__Package__Group__5__Impl rule__Package__Group__6 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:853:2: rule__Package__Group__5__Impl rule__Package__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__5__Impl_in_rule__Package__Group__51741);
            rule__Package__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__6_in_rule__Package__Group__51744);
            rule__Package__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__5"


    // $ANTLR start "rule__Package__Group__5__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:860:1: rule__Package__Group__5__Impl : ( ( rule__Package__Group_5__0 )? ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:864:1: ( ( ( rule__Package__Group_5__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:865:1: ( ( rule__Package__Group_5__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:865:1: ( ( rule__Package__Group_5__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:866:1: ( rule__Package__Group_5__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_5()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:867:1: ( rule__Package__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:867:2: rule__Package__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__0_in_rule__Package__Group__5__Impl1771);
                    rule__Package__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackageAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__5__Impl"


    // $ANTLR start "rule__Package__Group__6"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:877:1: rule__Package__Group__6 : rule__Package__Group__6__Impl rule__Package__Group__7 ;
    public final void rule__Package__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:881:1: ( rule__Package__Group__6__Impl rule__Package__Group__7 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:882:2: rule__Package__Group__6__Impl rule__Package__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__6__Impl_in_rule__Package__Group__61802);
            rule__Package__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__7_in_rule__Package__Group__61805);
            rule__Package__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__6"


    // $ANTLR start "rule__Package__Group__6__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:889:1: rule__Package__Group__6__Impl : ( ( rule__Package__Group_6__0 )? ) ;
    public final void rule__Package__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:893:1: ( ( ( rule__Package__Group_6__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:894:1: ( ( rule__Package__Group_6__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:894:1: ( ( rule__Package__Group_6__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:895:1: ( rule__Package__Group_6__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_6()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:896:1: ( rule__Package__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:896:2: rule__Package__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Package__Group_6__0_in_rule__Package__Group__6__Impl1832);
                    rule__Package__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackageAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__6__Impl"


    // $ANTLR start "rule__Package__Group__7"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:906:1: rule__Package__Group__7 : rule__Package__Group__7__Impl ;
    public final void rule__Package__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:910:1: ( rule__Package__Group__7__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:911:2: rule__Package__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__7__Impl_in_rule__Package__Group__71863);
            rule__Package__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__7"


    // $ANTLR start "rule__Package__Group__7__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:917:1: rule__Package__Group__7__Impl : ( '}' ) ;
    public final void rule__Package__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:921:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:922:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:922:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:923:1: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_7()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Package__Group__7__Impl1891); 
             after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__7__Impl"


    // $ANTLR start "rule__Package__Group_4__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:952:1: rule__Package__Group_4__0 : rule__Package__Group_4__0__Impl rule__Package__Group_4__1 ;
    public final void rule__Package__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:956:1: ( rule__Package__Group_4__0__Impl rule__Package__Group_4__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:957:2: rule__Package__Group_4__0__Impl rule__Package__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__0__Impl_in_rule__Package__Group_4__01938);
            rule__Package__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__1_in_rule__Package__Group_4__01941);
            rule__Package__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__0"


    // $ANTLR start "rule__Package__Group_4__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:964:1: rule__Package__Group_4__0__Impl : ( 'taskContexts' ) ;
    public final void rule__Package__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:968:1: ( ( 'taskContexts' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:969:1: ( 'taskContexts' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:969:1: ( 'taskContexts' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:970:1: 'taskContexts'
            {
             before(grammarAccess.getPackageAccess().getTaskContextsKeyword_4_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Package__Group_4__0__Impl1969); 
             after(grammarAccess.getPackageAccess().getTaskContextsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__0__Impl"


    // $ANTLR start "rule__Package__Group_4__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:983:1: rule__Package__Group_4__1 : rule__Package__Group_4__1__Impl rule__Package__Group_4__2 ;
    public final void rule__Package__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:987:1: ( rule__Package__Group_4__1__Impl rule__Package__Group_4__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:988:2: rule__Package__Group_4__1__Impl rule__Package__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__1__Impl_in_rule__Package__Group_4__12000);
            rule__Package__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__2_in_rule__Package__Group_4__12003);
            rule__Package__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__1"


    // $ANTLR start "rule__Package__Group_4__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:995:1: rule__Package__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Package__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:999:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1000:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1000:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1001:1: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Package__Group_4__1__Impl2031); 
             after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__1__Impl"


    // $ANTLR start "rule__Package__Group_4__2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1014:1: rule__Package__Group_4__2 : rule__Package__Group_4__2__Impl rule__Package__Group_4__3 ;
    public final void rule__Package__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1018:1: ( rule__Package__Group_4__2__Impl rule__Package__Group_4__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1019:2: rule__Package__Group_4__2__Impl rule__Package__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__2__Impl_in_rule__Package__Group_4__22062);
            rule__Package__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__3_in_rule__Package__Group_4__22065);
            rule__Package__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__2"


    // $ANTLR start "rule__Package__Group_4__2__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1026:1: rule__Package__Group_4__2__Impl : ( ( rule__Package__TaskContextsAssignment_4_2 ) ) ;
    public final void rule__Package__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1030:1: ( ( ( rule__Package__TaskContextsAssignment_4_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1031:1: ( ( rule__Package__TaskContextsAssignment_4_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1031:1: ( ( rule__Package__TaskContextsAssignment_4_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1032:1: ( rule__Package__TaskContextsAssignment_4_2 )
            {
             before(grammarAccess.getPackageAccess().getTaskContextsAssignment_4_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1033:1: ( rule__Package__TaskContextsAssignment_4_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1033:2: rule__Package__TaskContextsAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__TaskContextsAssignment_4_2_in_rule__Package__Group_4__2__Impl2092);
            rule__Package__TaskContextsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getTaskContextsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__2__Impl"


    // $ANTLR start "rule__Package__Group_4__3"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1043:1: rule__Package__Group_4__3 : rule__Package__Group_4__3__Impl rule__Package__Group_4__4 ;
    public final void rule__Package__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1047:1: ( rule__Package__Group_4__3__Impl rule__Package__Group_4__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1048:2: rule__Package__Group_4__3__Impl rule__Package__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__3__Impl_in_rule__Package__Group_4__32122);
            rule__Package__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__4_in_rule__Package__Group_4__32125);
            rule__Package__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__3"


    // $ANTLR start "rule__Package__Group_4__3__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1055:1: rule__Package__Group_4__3__Impl : ( ( rule__Package__Group_4_3__0 )* ) ;
    public final void rule__Package__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1059:1: ( ( ( rule__Package__Group_4_3__0 )* ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1060:1: ( ( rule__Package__Group_4_3__0 )* )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1060:1: ( ( rule__Package__Group_4_3__0 )* )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1061:1: ( rule__Package__Group_4_3__0 )*
            {
             before(grammarAccess.getPackageAccess().getGroup_4_3()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1062:1: ( rule__Package__Group_4_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1062:2: rule__Package__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4_3__0_in_rule__Package__Group_4__3__Impl2152);
            	    rule__Package__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__3__Impl"


    // $ANTLR start "rule__Package__Group_4__4"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1072:1: rule__Package__Group_4__4 : rule__Package__Group_4__4__Impl ;
    public final void rule__Package__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1076:1: ( rule__Package__Group_4__4__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1077:2: rule__Package__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__4__Impl_in_rule__Package__Group_4__42183);
            rule__Package__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__4"


    // $ANTLR start "rule__Package__Group_4__4__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1083:1: rule__Package__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Package__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1087:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1088:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1088:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1089:1: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Package__Group_4__4__Impl2211); 
             after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__4__Impl"


    // $ANTLR start "rule__Package__Group_4_3__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1112:1: rule__Package__Group_4_3__0 : rule__Package__Group_4_3__0__Impl rule__Package__Group_4_3__1 ;
    public final void rule__Package__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1116:1: ( rule__Package__Group_4_3__0__Impl rule__Package__Group_4_3__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1117:2: rule__Package__Group_4_3__0__Impl rule__Package__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4_3__0__Impl_in_rule__Package__Group_4_3__02252);
            rule__Package__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4_3__1_in_rule__Package__Group_4_3__02255);
            rule__Package__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4_3__0"


    // $ANTLR start "rule__Package__Group_4_3__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1124:1: rule__Package__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Package__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1128:1: ( ( ',' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1129:1: ( ',' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1129:1: ( ',' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1130:1: ','
            {
             before(grammarAccess.getPackageAccess().getCommaKeyword_4_3_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Package__Group_4_3__0__Impl2283); 
             after(grammarAccess.getPackageAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4_3__0__Impl"


    // $ANTLR start "rule__Package__Group_4_3__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1143:1: rule__Package__Group_4_3__1 : rule__Package__Group_4_3__1__Impl ;
    public final void rule__Package__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1147:1: ( rule__Package__Group_4_3__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1148:2: rule__Package__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4_3__1__Impl_in_rule__Package__Group_4_3__12314);
            rule__Package__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4_3__1"


    // $ANTLR start "rule__Package__Group_4_3__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1154:1: rule__Package__Group_4_3__1__Impl : ( ( rule__Package__TaskContextsAssignment_4_3_1 ) ) ;
    public final void rule__Package__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1158:1: ( ( ( rule__Package__TaskContextsAssignment_4_3_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1159:1: ( ( rule__Package__TaskContextsAssignment_4_3_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1159:1: ( ( rule__Package__TaskContextsAssignment_4_3_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1160:1: ( rule__Package__TaskContextsAssignment_4_3_1 )
            {
             before(grammarAccess.getPackageAccess().getTaskContextsAssignment_4_3_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1161:1: ( rule__Package__TaskContextsAssignment_4_3_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1161:2: rule__Package__TaskContextsAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__TaskContextsAssignment_4_3_1_in_rule__Package__Group_4_3__1__Impl2341);
            rule__Package__TaskContextsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getTaskContextsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4_3__1__Impl"


    // $ANTLR start "rule__Package__Group_5__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1175:1: rule__Package__Group_5__0 : rule__Package__Group_5__0__Impl rule__Package__Group_5__1 ;
    public final void rule__Package__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1179:1: ( rule__Package__Group_5__0__Impl rule__Package__Group_5__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1180:2: rule__Package__Group_5__0__Impl rule__Package__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__0__Impl_in_rule__Package__Group_5__02375);
            rule__Package__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__1_in_rule__Package__Group_5__02378);
            rule__Package__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5__0"


    // $ANTLR start "rule__Package__Group_5__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1187:1: rule__Package__Group_5__0__Impl : ( 'connectionPolicies' ) ;
    public final void rule__Package__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1191:1: ( ( 'connectionPolicies' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1192:1: ( 'connectionPolicies' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1192:1: ( 'connectionPolicies' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1193:1: 'connectionPolicies'
            {
             before(grammarAccess.getPackageAccess().getConnectionPoliciesKeyword_5_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Package__Group_5__0__Impl2406); 
             after(grammarAccess.getPackageAccess().getConnectionPoliciesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5__0__Impl"


    // $ANTLR start "rule__Package__Group_5__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1206:1: rule__Package__Group_5__1 : rule__Package__Group_5__1__Impl rule__Package__Group_5__2 ;
    public final void rule__Package__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1210:1: ( rule__Package__Group_5__1__Impl rule__Package__Group_5__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1211:2: rule__Package__Group_5__1__Impl rule__Package__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__1__Impl_in_rule__Package__Group_5__12437);
            rule__Package__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__2_in_rule__Package__Group_5__12440);
            rule__Package__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5__1"


    // $ANTLR start "rule__Package__Group_5__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1218:1: rule__Package__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Package__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1222:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1223:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1223:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1224:1: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Package__Group_5__1__Impl2468); 
             after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5__1__Impl"


    // $ANTLR start "rule__Package__Group_5__2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1237:1: rule__Package__Group_5__2 : rule__Package__Group_5__2__Impl rule__Package__Group_5__3 ;
    public final void rule__Package__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1241:1: ( rule__Package__Group_5__2__Impl rule__Package__Group_5__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1242:2: rule__Package__Group_5__2__Impl rule__Package__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__2__Impl_in_rule__Package__Group_5__22499);
            rule__Package__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__3_in_rule__Package__Group_5__22502);
            rule__Package__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5__2"


    // $ANTLR start "rule__Package__Group_5__2__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1249:1: rule__Package__Group_5__2__Impl : ( ( rule__Package__ConnectionPoliciesAssignment_5_2 ) ) ;
    public final void rule__Package__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1253:1: ( ( ( rule__Package__ConnectionPoliciesAssignment_5_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1254:1: ( ( rule__Package__ConnectionPoliciesAssignment_5_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1254:1: ( ( rule__Package__ConnectionPoliciesAssignment_5_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1255:1: ( rule__Package__ConnectionPoliciesAssignment_5_2 )
            {
             before(grammarAccess.getPackageAccess().getConnectionPoliciesAssignment_5_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1256:1: ( rule__Package__ConnectionPoliciesAssignment_5_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1256:2: rule__Package__ConnectionPoliciesAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__ConnectionPoliciesAssignment_5_2_in_rule__Package__Group_5__2__Impl2529);
            rule__Package__ConnectionPoliciesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getConnectionPoliciesAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5__2__Impl"


    // $ANTLR start "rule__Package__Group_5__3"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1266:1: rule__Package__Group_5__3 : rule__Package__Group_5__3__Impl rule__Package__Group_5__4 ;
    public final void rule__Package__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1270:1: ( rule__Package__Group_5__3__Impl rule__Package__Group_5__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1271:2: rule__Package__Group_5__3__Impl rule__Package__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__3__Impl_in_rule__Package__Group_5__32559);
            rule__Package__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__4_in_rule__Package__Group_5__32562);
            rule__Package__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5__3"


    // $ANTLR start "rule__Package__Group_5__3__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1278:1: rule__Package__Group_5__3__Impl : ( ( rule__Package__Group_5_3__0 )* ) ;
    public final void rule__Package__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1282:1: ( ( ( rule__Package__Group_5_3__0 )* ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1283:1: ( ( rule__Package__Group_5_3__0 )* )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1283:1: ( ( rule__Package__Group_5_3__0 )* )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1284:1: ( rule__Package__Group_5_3__0 )*
            {
             before(grammarAccess.getPackageAccess().getGroup_5_3()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1285:1: ( rule__Package__Group_5_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1285:2: rule__Package__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5_3__0_in_rule__Package__Group_5__3__Impl2589);
            	    rule__Package__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5__3__Impl"


    // $ANTLR start "rule__Package__Group_5__4"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1295:1: rule__Package__Group_5__4 : rule__Package__Group_5__4__Impl ;
    public final void rule__Package__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1299:1: ( rule__Package__Group_5__4__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1300:2: rule__Package__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__4__Impl_in_rule__Package__Group_5__42620);
            rule__Package__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5__4"


    // $ANTLR start "rule__Package__Group_5__4__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1306:1: rule__Package__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Package__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1310:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1311:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1311:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1312:1: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Package__Group_5__4__Impl2648); 
             after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5__4__Impl"


    // $ANTLR start "rule__Package__Group_5_3__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1335:1: rule__Package__Group_5_3__0 : rule__Package__Group_5_3__0__Impl rule__Package__Group_5_3__1 ;
    public final void rule__Package__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1339:1: ( rule__Package__Group_5_3__0__Impl rule__Package__Group_5_3__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1340:2: rule__Package__Group_5_3__0__Impl rule__Package__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5_3__0__Impl_in_rule__Package__Group_5_3__02689);
            rule__Package__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5_3__1_in_rule__Package__Group_5_3__02692);
            rule__Package__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5_3__0"


    // $ANTLR start "rule__Package__Group_5_3__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1347:1: rule__Package__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Package__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1351:1: ( ( ',' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1352:1: ( ',' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1352:1: ( ',' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1353:1: ','
            {
             before(grammarAccess.getPackageAccess().getCommaKeyword_5_3_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Package__Group_5_3__0__Impl2720); 
             after(grammarAccess.getPackageAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5_3__0__Impl"


    // $ANTLR start "rule__Package__Group_5_3__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1366:1: rule__Package__Group_5_3__1 : rule__Package__Group_5_3__1__Impl ;
    public final void rule__Package__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1370:1: ( rule__Package__Group_5_3__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1371:2: rule__Package__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5_3__1__Impl_in_rule__Package__Group_5_3__12751);
            rule__Package__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5_3__1"


    // $ANTLR start "rule__Package__Group_5_3__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1377:1: rule__Package__Group_5_3__1__Impl : ( ( rule__Package__ConnectionPoliciesAssignment_5_3_1 ) ) ;
    public final void rule__Package__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1381:1: ( ( ( rule__Package__ConnectionPoliciesAssignment_5_3_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1382:1: ( ( rule__Package__ConnectionPoliciesAssignment_5_3_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1382:1: ( ( rule__Package__ConnectionPoliciesAssignment_5_3_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1383:1: ( rule__Package__ConnectionPoliciesAssignment_5_3_1 )
            {
             before(grammarAccess.getPackageAccess().getConnectionPoliciesAssignment_5_3_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1384:1: ( rule__Package__ConnectionPoliciesAssignment_5_3_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1384:2: rule__Package__ConnectionPoliciesAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__ConnectionPoliciesAssignment_5_3_1_in_rule__Package__Group_5_3__1__Impl2778);
            rule__Package__ConnectionPoliciesAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getConnectionPoliciesAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5_3__1__Impl"


    // $ANTLR start "rule__Package__Group_6__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1398:1: rule__Package__Group_6__0 : rule__Package__Group_6__0__Impl rule__Package__Group_6__1 ;
    public final void rule__Package__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1402:1: ( rule__Package__Group_6__0__Impl rule__Package__Group_6__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1403:2: rule__Package__Group_6__0__Impl rule__Package__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_6__0__Impl_in_rule__Package__Group_6__02812);
            rule__Package__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_6__1_in_rule__Package__Group_6__02815);
            rule__Package__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_6__0"


    // $ANTLR start "rule__Package__Group_6__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1410:1: rule__Package__Group_6__0__Impl : ( 'peerGroups' ) ;
    public final void rule__Package__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1414:1: ( ( 'peerGroups' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1415:1: ( 'peerGroups' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1415:1: ( 'peerGroups' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1416:1: 'peerGroups'
            {
             before(grammarAccess.getPackageAccess().getPeerGroupsKeyword_6_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Package__Group_6__0__Impl2843); 
             after(grammarAccess.getPackageAccess().getPeerGroupsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_6__0__Impl"


    // $ANTLR start "rule__Package__Group_6__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1429:1: rule__Package__Group_6__1 : rule__Package__Group_6__1__Impl rule__Package__Group_6__2 ;
    public final void rule__Package__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1433:1: ( rule__Package__Group_6__1__Impl rule__Package__Group_6__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1434:2: rule__Package__Group_6__1__Impl rule__Package__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_6__1__Impl_in_rule__Package__Group_6__12874);
            rule__Package__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_6__2_in_rule__Package__Group_6__12877);
            rule__Package__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_6__1"


    // $ANTLR start "rule__Package__Group_6__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1441:1: rule__Package__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Package__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1445:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1446:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1446:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1447:1: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Package__Group_6__1__Impl2905); 
             after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_6__1__Impl"


    // $ANTLR start "rule__Package__Group_6__2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1460:1: rule__Package__Group_6__2 : rule__Package__Group_6__2__Impl rule__Package__Group_6__3 ;
    public final void rule__Package__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1464:1: ( rule__Package__Group_6__2__Impl rule__Package__Group_6__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1465:2: rule__Package__Group_6__2__Impl rule__Package__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_6__2__Impl_in_rule__Package__Group_6__22936);
            rule__Package__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_6__3_in_rule__Package__Group_6__22939);
            rule__Package__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_6__2"


    // $ANTLR start "rule__Package__Group_6__2__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1472:1: rule__Package__Group_6__2__Impl : ( ( rule__Package__PeerGroupsAssignment_6_2 ) ) ;
    public final void rule__Package__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1476:1: ( ( ( rule__Package__PeerGroupsAssignment_6_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1477:1: ( ( rule__Package__PeerGroupsAssignment_6_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1477:1: ( ( rule__Package__PeerGroupsAssignment_6_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1478:1: ( rule__Package__PeerGroupsAssignment_6_2 )
            {
             before(grammarAccess.getPackageAccess().getPeerGroupsAssignment_6_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1479:1: ( rule__Package__PeerGroupsAssignment_6_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1479:2: rule__Package__PeerGroupsAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__PeerGroupsAssignment_6_2_in_rule__Package__Group_6__2__Impl2966);
            rule__Package__PeerGroupsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getPeerGroupsAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_6__2__Impl"


    // $ANTLR start "rule__Package__Group_6__3"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1489:1: rule__Package__Group_6__3 : rule__Package__Group_6__3__Impl rule__Package__Group_6__4 ;
    public final void rule__Package__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1493:1: ( rule__Package__Group_6__3__Impl rule__Package__Group_6__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1494:2: rule__Package__Group_6__3__Impl rule__Package__Group_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_6__3__Impl_in_rule__Package__Group_6__32996);
            rule__Package__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_6__4_in_rule__Package__Group_6__32999);
            rule__Package__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_6__3"


    // $ANTLR start "rule__Package__Group_6__3__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1501:1: rule__Package__Group_6__3__Impl : ( ( rule__Package__Group_6_3__0 )* ) ;
    public final void rule__Package__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1505:1: ( ( ( rule__Package__Group_6_3__0 )* ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1506:1: ( ( rule__Package__Group_6_3__0 )* )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1506:1: ( ( rule__Package__Group_6_3__0 )* )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1507:1: ( rule__Package__Group_6_3__0 )*
            {
             before(grammarAccess.getPackageAccess().getGroup_6_3()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1508:1: ( rule__Package__Group_6_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1508:2: rule__Package__Group_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Package__Group_6_3__0_in_rule__Package__Group_6__3__Impl3026);
            	    rule__Package__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_6__3__Impl"


    // $ANTLR start "rule__Package__Group_6__4"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1518:1: rule__Package__Group_6__4 : rule__Package__Group_6__4__Impl ;
    public final void rule__Package__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1522:1: ( rule__Package__Group_6__4__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1523:2: rule__Package__Group_6__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_6__4__Impl_in_rule__Package__Group_6__43057);
            rule__Package__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_6__4"


    // $ANTLR start "rule__Package__Group_6__4__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1529:1: rule__Package__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Package__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1533:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1534:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1534:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1535:1: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Package__Group_6__4__Impl3085); 
             after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_6__4__Impl"


    // $ANTLR start "rule__Package__Group_6_3__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1558:1: rule__Package__Group_6_3__0 : rule__Package__Group_6_3__0__Impl rule__Package__Group_6_3__1 ;
    public final void rule__Package__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1562:1: ( rule__Package__Group_6_3__0__Impl rule__Package__Group_6_3__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1563:2: rule__Package__Group_6_3__0__Impl rule__Package__Group_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_6_3__0__Impl_in_rule__Package__Group_6_3__03126);
            rule__Package__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_6_3__1_in_rule__Package__Group_6_3__03129);
            rule__Package__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_6_3__0"


    // $ANTLR start "rule__Package__Group_6_3__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1570:1: rule__Package__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Package__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1574:1: ( ( ',' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1575:1: ( ',' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1575:1: ( ',' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1576:1: ','
            {
             before(grammarAccess.getPackageAccess().getCommaKeyword_6_3_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Package__Group_6_3__0__Impl3157); 
             after(grammarAccess.getPackageAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_6_3__0__Impl"


    // $ANTLR start "rule__Package__Group_6_3__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1589:1: rule__Package__Group_6_3__1 : rule__Package__Group_6_3__1__Impl ;
    public final void rule__Package__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1593:1: ( rule__Package__Group_6_3__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1594:2: rule__Package__Group_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_6_3__1__Impl_in_rule__Package__Group_6_3__13188);
            rule__Package__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_6_3__1"


    // $ANTLR start "rule__Package__Group_6_3__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1600:1: rule__Package__Group_6_3__1__Impl : ( ( rule__Package__PeerGroupsAssignment_6_3_1 ) ) ;
    public final void rule__Package__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1604:1: ( ( ( rule__Package__PeerGroupsAssignment_6_3_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1605:1: ( ( rule__Package__PeerGroupsAssignment_6_3_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1605:1: ( ( rule__Package__PeerGroupsAssignment_6_3_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1606:1: ( rule__Package__PeerGroupsAssignment_6_3_1 )
            {
             before(grammarAccess.getPackageAccess().getPeerGroupsAssignment_6_3_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1607:1: ( rule__Package__PeerGroupsAssignment_6_3_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1607:2: rule__Package__PeerGroupsAssignment_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__PeerGroupsAssignment_6_3_1_in_rule__Package__Group_6_3__1__Impl3215);
            rule__Package__PeerGroupsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getPeerGroupsAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_6_3__1__Impl"


    // $ANTLR start "rule__TaskContext__Group__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1621:1: rule__TaskContext__Group__0 : rule__TaskContext__Group__0__Impl rule__TaskContext__Group__1 ;
    public final void rule__TaskContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1625:1: ( rule__TaskContext__Group__0__Impl rule__TaskContext__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1626:2: rule__TaskContext__Group__0__Impl rule__TaskContext__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__0__Impl_in_rule__TaskContext__Group__03249);
            rule__TaskContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__1_in_rule__TaskContext__Group__03252);
            rule__TaskContext__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group__0"


    // $ANTLR start "rule__TaskContext__Group__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1633:1: rule__TaskContext__Group__0__Impl : ( 'TaskContext' ) ;
    public final void rule__TaskContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1637:1: ( ( 'TaskContext' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1638:1: ( 'TaskContext' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1638:1: ( 'TaskContext' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1639:1: 'TaskContext'
            {
             before(grammarAccess.getTaskContextAccess().getTaskContextKeyword_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__TaskContext__Group__0__Impl3280); 
             after(grammarAccess.getTaskContextAccess().getTaskContextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group__0__Impl"


    // $ANTLR start "rule__TaskContext__Group__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1652:1: rule__TaskContext__Group__1 : rule__TaskContext__Group__1__Impl rule__TaskContext__Group__2 ;
    public final void rule__TaskContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1656:1: ( rule__TaskContext__Group__1__Impl rule__TaskContext__Group__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1657:2: rule__TaskContext__Group__1__Impl rule__TaskContext__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__1__Impl_in_rule__TaskContext__Group__13311);
            rule__TaskContext__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__2_in_rule__TaskContext__Group__13314);
            rule__TaskContext__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group__1"


    // $ANTLR start "rule__TaskContext__Group__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1664:1: rule__TaskContext__Group__1__Impl : ( ( rule__TaskContext__NameAssignment_1 ) ) ;
    public final void rule__TaskContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1668:1: ( ( ( rule__TaskContext__NameAssignment_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1669:1: ( ( rule__TaskContext__NameAssignment_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1669:1: ( ( rule__TaskContext__NameAssignment_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1670:1: ( rule__TaskContext__NameAssignment_1 )
            {
             before(grammarAccess.getTaskContextAccess().getNameAssignment_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1671:1: ( rule__TaskContext__NameAssignment_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1671:2: rule__TaskContext__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__NameAssignment_1_in_rule__TaskContext__Group__1__Impl3341);
            rule__TaskContext__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskContextAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group__1__Impl"


    // $ANTLR start "rule__TaskContext__Group__2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1681:1: rule__TaskContext__Group__2 : rule__TaskContext__Group__2__Impl rule__TaskContext__Group__3 ;
    public final void rule__TaskContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1685:1: ( rule__TaskContext__Group__2__Impl rule__TaskContext__Group__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1686:2: rule__TaskContext__Group__2__Impl rule__TaskContext__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__2__Impl_in_rule__TaskContext__Group__23371);
            rule__TaskContext__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__3_in_rule__TaskContext__Group__23374);
            rule__TaskContext__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group__2"


    // $ANTLR start "rule__TaskContext__Group__2__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1693:1: rule__TaskContext__Group__2__Impl : ( '{' ) ;
    public final void rule__TaskContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1697:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1698:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1698:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1699:1: '{'
            {
             before(grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__TaskContext__Group__2__Impl3402); 
             after(grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group__2__Impl"


    // $ANTLR start "rule__TaskContext__Group__3"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1712:1: rule__TaskContext__Group__3 : rule__TaskContext__Group__3__Impl rule__TaskContext__Group__4 ;
    public final void rule__TaskContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1716:1: ( rule__TaskContext__Group__3__Impl rule__TaskContext__Group__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1717:2: rule__TaskContext__Group__3__Impl rule__TaskContext__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__3__Impl_in_rule__TaskContext__Group__33433);
            rule__TaskContext__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__4_in_rule__TaskContext__Group__33436);
            rule__TaskContext__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group__3"


    // $ANTLR start "rule__TaskContext__Group__3__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1724:1: rule__TaskContext__Group__3__Impl : ( 'namespace' ) ;
    public final void rule__TaskContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1728:1: ( ( 'namespace' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1729:1: ( 'namespace' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1729:1: ( 'namespace' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1730:1: 'namespace'
            {
             before(grammarAccess.getTaskContextAccess().getNamespaceKeyword_3()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__TaskContext__Group__3__Impl3464); 
             after(grammarAccess.getTaskContextAccess().getNamespaceKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group__3__Impl"


    // $ANTLR start "rule__TaskContext__Group__4"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1743:1: rule__TaskContext__Group__4 : rule__TaskContext__Group__4__Impl rule__TaskContext__Group__5 ;
    public final void rule__TaskContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1747:1: ( rule__TaskContext__Group__4__Impl rule__TaskContext__Group__5 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1748:2: rule__TaskContext__Group__4__Impl rule__TaskContext__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__4__Impl_in_rule__TaskContext__Group__43495);
            rule__TaskContext__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__5_in_rule__TaskContext__Group__43498);
            rule__TaskContext__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group__4"


    // $ANTLR start "rule__TaskContext__Group__4__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1755:1: rule__TaskContext__Group__4__Impl : ( ( rule__TaskContext__NamespaceAssignment_4 ) ) ;
    public final void rule__TaskContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1759:1: ( ( ( rule__TaskContext__NamespaceAssignment_4 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1760:1: ( ( rule__TaskContext__NamespaceAssignment_4 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1760:1: ( ( rule__TaskContext__NamespaceAssignment_4 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1761:1: ( rule__TaskContext__NamespaceAssignment_4 )
            {
             before(grammarAccess.getTaskContextAccess().getNamespaceAssignment_4()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1762:1: ( rule__TaskContext__NamespaceAssignment_4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1762:2: rule__TaskContext__NamespaceAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__NamespaceAssignment_4_in_rule__TaskContext__Group__4__Impl3525);
            rule__TaskContext__NamespaceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTaskContextAccess().getNamespaceAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group__4__Impl"


    // $ANTLR start "rule__TaskContext__Group__5"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1772:1: rule__TaskContext__Group__5 : rule__TaskContext__Group__5__Impl rule__TaskContext__Group__6 ;
    public final void rule__TaskContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1776:1: ( rule__TaskContext__Group__5__Impl rule__TaskContext__Group__6 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1777:2: rule__TaskContext__Group__5__Impl rule__TaskContext__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__5__Impl_in_rule__TaskContext__Group__53555);
            rule__TaskContext__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__6_in_rule__TaskContext__Group__53558);
            rule__TaskContext__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group__5"


    // $ANTLR start "rule__TaskContext__Group__5__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1784:1: rule__TaskContext__Group__5__Impl : ( 'type' ) ;
    public final void rule__TaskContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1788:1: ( ( 'type' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1789:1: ( 'type' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1789:1: ( 'type' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1790:1: 'type'
            {
             before(grammarAccess.getTaskContextAccess().getTypeKeyword_5()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__TaskContext__Group__5__Impl3586); 
             after(grammarAccess.getTaskContextAccess().getTypeKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group__5__Impl"


    // $ANTLR start "rule__TaskContext__Group__6"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1803:1: rule__TaskContext__Group__6 : rule__TaskContext__Group__6__Impl rule__TaskContext__Group__7 ;
    public final void rule__TaskContext__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1807:1: ( rule__TaskContext__Group__6__Impl rule__TaskContext__Group__7 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1808:2: rule__TaskContext__Group__6__Impl rule__TaskContext__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__6__Impl_in_rule__TaskContext__Group__63617);
            rule__TaskContext__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__7_in_rule__TaskContext__Group__63620);
            rule__TaskContext__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group__6"


    // $ANTLR start "rule__TaskContext__Group__6__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1815:1: rule__TaskContext__Group__6__Impl : ( ( rule__TaskContext__TypeAssignment_6 ) ) ;
    public final void rule__TaskContext__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1819:1: ( ( ( rule__TaskContext__TypeAssignment_6 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1820:1: ( ( rule__TaskContext__TypeAssignment_6 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1820:1: ( ( rule__TaskContext__TypeAssignment_6 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1821:1: ( rule__TaskContext__TypeAssignment_6 )
            {
             before(grammarAccess.getTaskContextAccess().getTypeAssignment_6()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1822:1: ( rule__TaskContext__TypeAssignment_6 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1822:2: rule__TaskContext__TypeAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__TypeAssignment_6_in_rule__TaskContext__Group__6__Impl3647);
            rule__TaskContext__TypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTaskContextAccess().getTypeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group__6__Impl"


    // $ANTLR start "rule__TaskContext__Group__7"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1832:1: rule__TaskContext__Group__7 : rule__TaskContext__Group__7__Impl rule__TaskContext__Group__8 ;
    public final void rule__TaskContext__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1836:1: ( rule__TaskContext__Group__7__Impl rule__TaskContext__Group__8 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1837:2: rule__TaskContext__Group__7__Impl rule__TaskContext__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__7__Impl_in_rule__TaskContext__Group__73677);
            rule__TaskContext__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__8_in_rule__TaskContext__Group__73680);
            rule__TaskContext__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group__7"


    // $ANTLR start "rule__TaskContext__Group__7__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1844:1: rule__TaskContext__Group__7__Impl : ( 'activity' ) ;
    public final void rule__TaskContext__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1848:1: ( ( 'activity' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1849:1: ( 'activity' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1849:1: ( 'activity' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1850:1: 'activity'
            {
             before(grammarAccess.getTaskContextAccess().getActivityKeyword_7()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__TaskContext__Group__7__Impl3708); 
             after(grammarAccess.getTaskContextAccess().getActivityKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group__7__Impl"


    // $ANTLR start "rule__TaskContext__Group__8"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1863:1: rule__TaskContext__Group__8 : rule__TaskContext__Group__8__Impl rule__TaskContext__Group__9 ;
    public final void rule__TaskContext__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1867:1: ( rule__TaskContext__Group__8__Impl rule__TaskContext__Group__9 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1868:2: rule__TaskContext__Group__8__Impl rule__TaskContext__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__8__Impl_in_rule__TaskContext__Group__83739);
            rule__TaskContext__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__9_in_rule__TaskContext__Group__83742);
            rule__TaskContext__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group__8"


    // $ANTLR start "rule__TaskContext__Group__8__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1875:1: rule__TaskContext__Group__8__Impl : ( ( rule__TaskContext__ActivityAssignment_8 ) ) ;
    public final void rule__TaskContext__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1879:1: ( ( ( rule__TaskContext__ActivityAssignment_8 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1880:1: ( ( rule__TaskContext__ActivityAssignment_8 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1880:1: ( ( rule__TaskContext__ActivityAssignment_8 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1881:1: ( rule__TaskContext__ActivityAssignment_8 )
            {
             before(grammarAccess.getTaskContextAccess().getActivityAssignment_8()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1882:1: ( rule__TaskContext__ActivityAssignment_8 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1882:2: rule__TaskContext__ActivityAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__ActivityAssignment_8_in_rule__TaskContext__Group__8__Impl3769);
            rule__TaskContext__ActivityAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getTaskContextAccess().getActivityAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group__8__Impl"


    // $ANTLR start "rule__TaskContext__Group__9"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1892:1: rule__TaskContext__Group__9 : rule__TaskContext__Group__9__Impl rule__TaskContext__Group__10 ;
    public final void rule__TaskContext__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1896:1: ( rule__TaskContext__Group__9__Impl rule__TaskContext__Group__10 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1897:2: rule__TaskContext__Group__9__Impl rule__TaskContext__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__9__Impl_in_rule__TaskContext__Group__93799);
            rule__TaskContext__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__10_in_rule__TaskContext__Group__93802);
            rule__TaskContext__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group__9"


    // $ANTLR start "rule__TaskContext__Group__9__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1904:1: rule__TaskContext__Group__9__Impl : ( ( rule__TaskContext__Group_9__0 )? ) ;
    public final void rule__TaskContext__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1908:1: ( ( ( rule__TaskContext__Group_9__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1909:1: ( ( rule__TaskContext__Group_9__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1909:1: ( ( rule__TaskContext__Group_9__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1910:1: ( rule__TaskContext__Group_9__0 )?
            {
             before(grammarAccess.getTaskContextAccess().getGroup_9()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1911:1: ( rule__TaskContext__Group_9__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1911:2: rule__TaskContext__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9__0_in_rule__TaskContext__Group__9__Impl3829);
                    rule__TaskContext__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskContextAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group__9__Impl"


    // $ANTLR start "rule__TaskContext__Group__10"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1921:1: rule__TaskContext__Group__10 : rule__TaskContext__Group__10__Impl rule__TaskContext__Group__11 ;
    public final void rule__TaskContext__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1925:1: ( rule__TaskContext__Group__10__Impl rule__TaskContext__Group__11 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1926:2: rule__TaskContext__Group__10__Impl rule__TaskContext__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__10__Impl_in_rule__TaskContext__Group__103860);
            rule__TaskContext__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__11_in_rule__TaskContext__Group__103863);
            rule__TaskContext__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group__10"


    // $ANTLR start "rule__TaskContext__Group__10__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1933:1: rule__TaskContext__Group__10__Impl : ( ( rule__TaskContext__Group_10__0 )? ) ;
    public final void rule__TaskContext__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1937:1: ( ( ( rule__TaskContext__Group_10__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1938:1: ( ( rule__TaskContext__Group_10__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1938:1: ( ( rule__TaskContext__Group_10__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1939:1: ( rule__TaskContext__Group_10__0 )?
            {
             before(grammarAccess.getTaskContextAccess().getGroup_10()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1940:1: ( rule__TaskContext__Group_10__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1940:2: rule__TaskContext__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10__0_in_rule__TaskContext__Group__10__Impl3890);
                    rule__TaskContext__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskContextAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group__10__Impl"


    // $ANTLR start "rule__TaskContext__Group__11"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1950:1: rule__TaskContext__Group__11 : rule__TaskContext__Group__11__Impl rule__TaskContext__Group__12 ;
    public final void rule__TaskContext__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1954:1: ( rule__TaskContext__Group__11__Impl rule__TaskContext__Group__12 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1955:2: rule__TaskContext__Group__11__Impl rule__TaskContext__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__11__Impl_in_rule__TaskContext__Group__113921);
            rule__TaskContext__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__12_in_rule__TaskContext__Group__113924);
            rule__TaskContext__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group__11"


    // $ANTLR start "rule__TaskContext__Group__11__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1962:1: rule__TaskContext__Group__11__Impl : ( ( rule__TaskContext__Group_11__0 )? ) ;
    public final void rule__TaskContext__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1966:1: ( ( ( rule__TaskContext__Group_11__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1967:1: ( ( rule__TaskContext__Group_11__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1967:1: ( ( rule__TaskContext__Group_11__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1968:1: ( rule__TaskContext__Group_11__0 )?
            {
             before(grammarAccess.getTaskContextAccess().getGroup_11()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1969:1: ( rule__TaskContext__Group_11__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1969:2: rule__TaskContext__Group_11__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_11__0_in_rule__TaskContext__Group__11__Impl3951);
                    rule__TaskContext__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskContextAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group__11__Impl"


    // $ANTLR start "rule__TaskContext__Group__12"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1979:1: rule__TaskContext__Group__12 : rule__TaskContext__Group__12__Impl rule__TaskContext__Group__13 ;
    public final void rule__TaskContext__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1983:1: ( rule__TaskContext__Group__12__Impl rule__TaskContext__Group__13 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1984:2: rule__TaskContext__Group__12__Impl rule__TaskContext__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__12__Impl_in_rule__TaskContext__Group__123982);
            rule__TaskContext__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__13_in_rule__TaskContext__Group__123985);
            rule__TaskContext__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group__12"


    // $ANTLR start "rule__TaskContext__Group__12__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1991:1: rule__TaskContext__Group__12__Impl : ( ( rule__TaskContext__Group_12__0 )? ) ;
    public final void rule__TaskContext__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1995:1: ( ( ( rule__TaskContext__Group_12__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1996:1: ( ( rule__TaskContext__Group_12__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1996:1: ( ( rule__TaskContext__Group_12__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1997:1: ( rule__TaskContext__Group_12__0 )?
            {
             before(grammarAccess.getTaskContextAccess().getGroup_12()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1998:1: ( rule__TaskContext__Group_12__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1998:2: rule__TaskContext__Group_12__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_12__0_in_rule__TaskContext__Group__12__Impl4012);
                    rule__TaskContext__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskContextAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group__12__Impl"


    // $ANTLR start "rule__TaskContext__Group__13"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2008:1: rule__TaskContext__Group__13 : rule__TaskContext__Group__13__Impl ;
    public final void rule__TaskContext__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2012:1: ( rule__TaskContext__Group__13__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2013:2: rule__TaskContext__Group__13__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__13__Impl_in_rule__TaskContext__Group__134043);
            rule__TaskContext__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group__13"


    // $ANTLR start "rule__TaskContext__Group__13__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2019:1: rule__TaskContext__Group__13__Impl : ( '}' ) ;
    public final void rule__TaskContext__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2023:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2024:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2024:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2025:1: '}'
            {
             before(grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_13()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__TaskContext__Group__13__Impl4071); 
             after(grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group__13__Impl"


    // $ANTLR start "rule__TaskContext__Group_9__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2066:1: rule__TaskContext__Group_9__0 : rule__TaskContext__Group_9__0__Impl rule__TaskContext__Group_9__1 ;
    public final void rule__TaskContext__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2070:1: ( rule__TaskContext__Group_9__0__Impl rule__TaskContext__Group_9__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2071:2: rule__TaskContext__Group_9__0__Impl rule__TaskContext__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9__0__Impl_in_rule__TaskContext__Group_9__04130);
            rule__TaskContext__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9__1_in_rule__TaskContext__Group_9__04133);
            rule__TaskContext__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_9__0"


    // $ANTLR start "rule__TaskContext__Group_9__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2078:1: rule__TaskContext__Group_9__0__Impl : ( 'inputPorts' ) ;
    public final void rule__TaskContext__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2082:1: ( ( 'inputPorts' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2083:1: ( 'inputPorts' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2083:1: ( 'inputPorts' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2084:1: 'inputPorts'
            {
             before(grammarAccess.getTaskContextAccess().getInputPortsKeyword_9_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__TaskContext__Group_9__0__Impl4161); 
             after(grammarAccess.getTaskContextAccess().getInputPortsKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_9__0__Impl"


    // $ANTLR start "rule__TaskContext__Group_9__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2097:1: rule__TaskContext__Group_9__1 : rule__TaskContext__Group_9__1__Impl rule__TaskContext__Group_9__2 ;
    public final void rule__TaskContext__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2101:1: ( rule__TaskContext__Group_9__1__Impl rule__TaskContext__Group_9__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2102:2: rule__TaskContext__Group_9__1__Impl rule__TaskContext__Group_9__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9__1__Impl_in_rule__TaskContext__Group_9__14192);
            rule__TaskContext__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9__2_in_rule__TaskContext__Group_9__14195);
            rule__TaskContext__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_9__1"


    // $ANTLR start "rule__TaskContext__Group_9__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2109:1: rule__TaskContext__Group_9__1__Impl : ( '{' ) ;
    public final void rule__TaskContext__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2113:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2114:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2114:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2115:1: '{'
            {
             before(grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__TaskContext__Group_9__1__Impl4223); 
             after(grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_9__1__Impl"


    // $ANTLR start "rule__TaskContext__Group_9__2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2128:1: rule__TaskContext__Group_9__2 : rule__TaskContext__Group_9__2__Impl rule__TaskContext__Group_9__3 ;
    public final void rule__TaskContext__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2132:1: ( rule__TaskContext__Group_9__2__Impl rule__TaskContext__Group_9__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2133:2: rule__TaskContext__Group_9__2__Impl rule__TaskContext__Group_9__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9__2__Impl_in_rule__TaskContext__Group_9__24254);
            rule__TaskContext__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9__3_in_rule__TaskContext__Group_9__24257);
            rule__TaskContext__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_9__2"


    // $ANTLR start "rule__TaskContext__Group_9__2__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2140:1: rule__TaskContext__Group_9__2__Impl : ( ( rule__TaskContext__InputPortsAssignment_9_2 ) ) ;
    public final void rule__TaskContext__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2144:1: ( ( ( rule__TaskContext__InputPortsAssignment_9_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2145:1: ( ( rule__TaskContext__InputPortsAssignment_9_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2145:1: ( ( rule__TaskContext__InputPortsAssignment_9_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2146:1: ( rule__TaskContext__InputPortsAssignment_9_2 )
            {
             before(grammarAccess.getTaskContextAccess().getInputPortsAssignment_9_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2147:1: ( rule__TaskContext__InputPortsAssignment_9_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2147:2: rule__TaskContext__InputPortsAssignment_9_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__InputPortsAssignment_9_2_in_rule__TaskContext__Group_9__2__Impl4284);
            rule__TaskContext__InputPortsAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskContextAccess().getInputPortsAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_9__2__Impl"


    // $ANTLR start "rule__TaskContext__Group_9__3"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2157:1: rule__TaskContext__Group_9__3 : rule__TaskContext__Group_9__3__Impl rule__TaskContext__Group_9__4 ;
    public final void rule__TaskContext__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2161:1: ( rule__TaskContext__Group_9__3__Impl rule__TaskContext__Group_9__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2162:2: rule__TaskContext__Group_9__3__Impl rule__TaskContext__Group_9__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9__3__Impl_in_rule__TaskContext__Group_9__34314);
            rule__TaskContext__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9__4_in_rule__TaskContext__Group_9__34317);
            rule__TaskContext__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_9__3"


    // $ANTLR start "rule__TaskContext__Group_9__3__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2169:1: rule__TaskContext__Group_9__3__Impl : ( ( rule__TaskContext__Group_9_3__0 )* ) ;
    public final void rule__TaskContext__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2173:1: ( ( ( rule__TaskContext__Group_9_3__0 )* ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2174:1: ( ( rule__TaskContext__Group_9_3__0 )* )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2174:1: ( ( rule__TaskContext__Group_9_3__0 )* )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2175:1: ( rule__TaskContext__Group_9_3__0 )*
            {
             before(grammarAccess.getTaskContextAccess().getGroup_9_3()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2176:1: ( rule__TaskContext__Group_9_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2176:2: rule__TaskContext__Group_9_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9_3__0_in_rule__TaskContext__Group_9__3__Impl4344);
            	    rule__TaskContext__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getTaskContextAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_9__3__Impl"


    // $ANTLR start "rule__TaskContext__Group_9__4"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2186:1: rule__TaskContext__Group_9__4 : rule__TaskContext__Group_9__4__Impl ;
    public final void rule__TaskContext__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2190:1: ( rule__TaskContext__Group_9__4__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2191:2: rule__TaskContext__Group_9__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9__4__Impl_in_rule__TaskContext__Group_9__44375);
            rule__TaskContext__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_9__4"


    // $ANTLR start "rule__TaskContext__Group_9__4__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2197:1: rule__TaskContext__Group_9__4__Impl : ( '}' ) ;
    public final void rule__TaskContext__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2201:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2202:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2202:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2203:1: '}'
            {
             before(grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__TaskContext__Group_9__4__Impl4403); 
             after(grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_9__4__Impl"


    // $ANTLR start "rule__TaskContext__Group_9_3__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2226:1: rule__TaskContext__Group_9_3__0 : rule__TaskContext__Group_9_3__0__Impl rule__TaskContext__Group_9_3__1 ;
    public final void rule__TaskContext__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2230:1: ( rule__TaskContext__Group_9_3__0__Impl rule__TaskContext__Group_9_3__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2231:2: rule__TaskContext__Group_9_3__0__Impl rule__TaskContext__Group_9_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9_3__0__Impl_in_rule__TaskContext__Group_9_3__04444);
            rule__TaskContext__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9_3__1_in_rule__TaskContext__Group_9_3__04447);
            rule__TaskContext__Group_9_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_9_3__0"


    // $ANTLR start "rule__TaskContext__Group_9_3__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2238:1: rule__TaskContext__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__TaskContext__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2242:1: ( ( ',' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2243:1: ( ',' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2243:1: ( ',' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2244:1: ','
            {
             before(grammarAccess.getTaskContextAccess().getCommaKeyword_9_3_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__TaskContext__Group_9_3__0__Impl4475); 
             after(grammarAccess.getTaskContextAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_9_3__0__Impl"


    // $ANTLR start "rule__TaskContext__Group_9_3__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2257:1: rule__TaskContext__Group_9_3__1 : rule__TaskContext__Group_9_3__1__Impl ;
    public final void rule__TaskContext__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2261:1: ( rule__TaskContext__Group_9_3__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2262:2: rule__TaskContext__Group_9_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9_3__1__Impl_in_rule__TaskContext__Group_9_3__14506);
            rule__TaskContext__Group_9_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_9_3__1"


    // $ANTLR start "rule__TaskContext__Group_9_3__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2268:1: rule__TaskContext__Group_9_3__1__Impl : ( ( rule__TaskContext__InputPortsAssignment_9_3_1 ) ) ;
    public final void rule__TaskContext__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2272:1: ( ( ( rule__TaskContext__InputPortsAssignment_9_3_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2273:1: ( ( rule__TaskContext__InputPortsAssignment_9_3_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2273:1: ( ( rule__TaskContext__InputPortsAssignment_9_3_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2274:1: ( rule__TaskContext__InputPortsAssignment_9_3_1 )
            {
             before(grammarAccess.getTaskContextAccess().getInputPortsAssignment_9_3_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2275:1: ( rule__TaskContext__InputPortsAssignment_9_3_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2275:2: rule__TaskContext__InputPortsAssignment_9_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__InputPortsAssignment_9_3_1_in_rule__TaskContext__Group_9_3__1__Impl4533);
            rule__TaskContext__InputPortsAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskContextAccess().getInputPortsAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_9_3__1__Impl"


    // $ANTLR start "rule__TaskContext__Group_10__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2289:1: rule__TaskContext__Group_10__0 : rule__TaskContext__Group_10__0__Impl rule__TaskContext__Group_10__1 ;
    public final void rule__TaskContext__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2293:1: ( rule__TaskContext__Group_10__0__Impl rule__TaskContext__Group_10__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2294:2: rule__TaskContext__Group_10__0__Impl rule__TaskContext__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10__0__Impl_in_rule__TaskContext__Group_10__04567);
            rule__TaskContext__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10__1_in_rule__TaskContext__Group_10__04570);
            rule__TaskContext__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_10__0"


    // $ANTLR start "rule__TaskContext__Group_10__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2301:1: rule__TaskContext__Group_10__0__Impl : ( 'outputPorts' ) ;
    public final void rule__TaskContext__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2305:1: ( ( 'outputPorts' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2306:1: ( 'outputPorts' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2306:1: ( 'outputPorts' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2307:1: 'outputPorts'
            {
             before(grammarAccess.getTaskContextAccess().getOutputPortsKeyword_10_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__TaskContext__Group_10__0__Impl4598); 
             after(grammarAccess.getTaskContextAccess().getOutputPortsKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_10__0__Impl"


    // $ANTLR start "rule__TaskContext__Group_10__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2320:1: rule__TaskContext__Group_10__1 : rule__TaskContext__Group_10__1__Impl rule__TaskContext__Group_10__2 ;
    public final void rule__TaskContext__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2324:1: ( rule__TaskContext__Group_10__1__Impl rule__TaskContext__Group_10__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2325:2: rule__TaskContext__Group_10__1__Impl rule__TaskContext__Group_10__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10__1__Impl_in_rule__TaskContext__Group_10__14629);
            rule__TaskContext__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10__2_in_rule__TaskContext__Group_10__14632);
            rule__TaskContext__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_10__1"


    // $ANTLR start "rule__TaskContext__Group_10__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2332:1: rule__TaskContext__Group_10__1__Impl : ( '{' ) ;
    public final void rule__TaskContext__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2336:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2337:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2337:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2338:1: '{'
            {
             before(grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_10_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__TaskContext__Group_10__1__Impl4660); 
             after(grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_10__1__Impl"


    // $ANTLR start "rule__TaskContext__Group_10__2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2351:1: rule__TaskContext__Group_10__2 : rule__TaskContext__Group_10__2__Impl rule__TaskContext__Group_10__3 ;
    public final void rule__TaskContext__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2355:1: ( rule__TaskContext__Group_10__2__Impl rule__TaskContext__Group_10__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2356:2: rule__TaskContext__Group_10__2__Impl rule__TaskContext__Group_10__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10__2__Impl_in_rule__TaskContext__Group_10__24691);
            rule__TaskContext__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10__3_in_rule__TaskContext__Group_10__24694);
            rule__TaskContext__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_10__2"


    // $ANTLR start "rule__TaskContext__Group_10__2__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2363:1: rule__TaskContext__Group_10__2__Impl : ( ( rule__TaskContext__OutputPortsAssignment_10_2 ) ) ;
    public final void rule__TaskContext__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2367:1: ( ( ( rule__TaskContext__OutputPortsAssignment_10_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2368:1: ( ( rule__TaskContext__OutputPortsAssignment_10_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2368:1: ( ( rule__TaskContext__OutputPortsAssignment_10_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2369:1: ( rule__TaskContext__OutputPortsAssignment_10_2 )
            {
             before(grammarAccess.getTaskContextAccess().getOutputPortsAssignment_10_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2370:1: ( rule__TaskContext__OutputPortsAssignment_10_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2370:2: rule__TaskContext__OutputPortsAssignment_10_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__OutputPortsAssignment_10_2_in_rule__TaskContext__Group_10__2__Impl4721);
            rule__TaskContext__OutputPortsAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskContextAccess().getOutputPortsAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_10__2__Impl"


    // $ANTLR start "rule__TaskContext__Group_10__3"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2380:1: rule__TaskContext__Group_10__3 : rule__TaskContext__Group_10__3__Impl rule__TaskContext__Group_10__4 ;
    public final void rule__TaskContext__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2384:1: ( rule__TaskContext__Group_10__3__Impl rule__TaskContext__Group_10__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2385:2: rule__TaskContext__Group_10__3__Impl rule__TaskContext__Group_10__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10__3__Impl_in_rule__TaskContext__Group_10__34751);
            rule__TaskContext__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10__4_in_rule__TaskContext__Group_10__34754);
            rule__TaskContext__Group_10__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_10__3"


    // $ANTLR start "rule__TaskContext__Group_10__3__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2392:1: rule__TaskContext__Group_10__3__Impl : ( ( rule__TaskContext__Group_10_3__0 )* ) ;
    public final void rule__TaskContext__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2396:1: ( ( ( rule__TaskContext__Group_10_3__0 )* ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2397:1: ( ( rule__TaskContext__Group_10_3__0 )* )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2397:1: ( ( rule__TaskContext__Group_10_3__0 )* )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2398:1: ( rule__TaskContext__Group_10_3__0 )*
            {
             before(grammarAccess.getTaskContextAccess().getGroup_10_3()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2399:1: ( rule__TaskContext__Group_10_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==24) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2399:2: rule__TaskContext__Group_10_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10_3__0_in_rule__TaskContext__Group_10__3__Impl4781);
            	    rule__TaskContext__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getTaskContextAccess().getGroup_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_10__3__Impl"


    // $ANTLR start "rule__TaskContext__Group_10__4"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2409:1: rule__TaskContext__Group_10__4 : rule__TaskContext__Group_10__4__Impl ;
    public final void rule__TaskContext__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2413:1: ( rule__TaskContext__Group_10__4__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2414:2: rule__TaskContext__Group_10__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10__4__Impl_in_rule__TaskContext__Group_10__44812);
            rule__TaskContext__Group_10__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_10__4"


    // $ANTLR start "rule__TaskContext__Group_10__4__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2420:1: rule__TaskContext__Group_10__4__Impl : ( '}' ) ;
    public final void rule__TaskContext__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2424:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2425:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2425:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2426:1: '}'
            {
             before(grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_10_4()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__TaskContext__Group_10__4__Impl4840); 
             after(grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_10__4__Impl"


    // $ANTLR start "rule__TaskContext__Group_10_3__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2449:1: rule__TaskContext__Group_10_3__0 : rule__TaskContext__Group_10_3__0__Impl rule__TaskContext__Group_10_3__1 ;
    public final void rule__TaskContext__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2453:1: ( rule__TaskContext__Group_10_3__0__Impl rule__TaskContext__Group_10_3__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2454:2: rule__TaskContext__Group_10_3__0__Impl rule__TaskContext__Group_10_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10_3__0__Impl_in_rule__TaskContext__Group_10_3__04881);
            rule__TaskContext__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10_3__1_in_rule__TaskContext__Group_10_3__04884);
            rule__TaskContext__Group_10_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_10_3__0"


    // $ANTLR start "rule__TaskContext__Group_10_3__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2461:1: rule__TaskContext__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__TaskContext__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2465:1: ( ( ',' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2466:1: ( ',' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2466:1: ( ',' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2467:1: ','
            {
             before(grammarAccess.getTaskContextAccess().getCommaKeyword_10_3_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__TaskContext__Group_10_3__0__Impl4912); 
             after(grammarAccess.getTaskContextAccess().getCommaKeyword_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_10_3__0__Impl"


    // $ANTLR start "rule__TaskContext__Group_10_3__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2480:1: rule__TaskContext__Group_10_3__1 : rule__TaskContext__Group_10_3__1__Impl ;
    public final void rule__TaskContext__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2484:1: ( rule__TaskContext__Group_10_3__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2485:2: rule__TaskContext__Group_10_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10_3__1__Impl_in_rule__TaskContext__Group_10_3__14943);
            rule__TaskContext__Group_10_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_10_3__1"


    // $ANTLR start "rule__TaskContext__Group_10_3__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2491:1: rule__TaskContext__Group_10_3__1__Impl : ( ( rule__TaskContext__OutputPortsAssignment_10_3_1 ) ) ;
    public final void rule__TaskContext__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2495:1: ( ( ( rule__TaskContext__OutputPortsAssignment_10_3_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2496:1: ( ( rule__TaskContext__OutputPortsAssignment_10_3_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2496:1: ( ( rule__TaskContext__OutputPortsAssignment_10_3_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2497:1: ( rule__TaskContext__OutputPortsAssignment_10_3_1 )
            {
             before(grammarAccess.getTaskContextAccess().getOutputPortsAssignment_10_3_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2498:1: ( rule__TaskContext__OutputPortsAssignment_10_3_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2498:2: rule__TaskContext__OutputPortsAssignment_10_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__OutputPortsAssignment_10_3_1_in_rule__TaskContext__Group_10_3__1__Impl4970);
            rule__TaskContext__OutputPortsAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskContextAccess().getOutputPortsAssignment_10_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_10_3__1__Impl"


    // $ANTLR start "rule__TaskContext__Group_11__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2512:1: rule__TaskContext__Group_11__0 : rule__TaskContext__Group_11__0__Impl rule__TaskContext__Group_11__1 ;
    public final void rule__TaskContext__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2516:1: ( rule__TaskContext__Group_11__0__Impl rule__TaskContext__Group_11__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2517:2: rule__TaskContext__Group_11__0__Impl rule__TaskContext__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_11__0__Impl_in_rule__TaskContext__Group_11__05004);
            rule__TaskContext__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_11__1_in_rule__TaskContext__Group_11__05007);
            rule__TaskContext__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_11__0"


    // $ANTLR start "rule__TaskContext__Group_11__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2524:1: rule__TaskContext__Group_11__0__Impl : ( 'properties' ) ;
    public final void rule__TaskContext__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2528:1: ( ( 'properties' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2529:1: ( 'properties' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2529:1: ( 'properties' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2530:1: 'properties'
            {
             before(grammarAccess.getTaskContextAccess().getPropertiesKeyword_11_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__TaskContext__Group_11__0__Impl5035); 
             after(grammarAccess.getTaskContextAccess().getPropertiesKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_11__0__Impl"


    // $ANTLR start "rule__TaskContext__Group_11__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2543:1: rule__TaskContext__Group_11__1 : rule__TaskContext__Group_11__1__Impl rule__TaskContext__Group_11__2 ;
    public final void rule__TaskContext__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2547:1: ( rule__TaskContext__Group_11__1__Impl rule__TaskContext__Group_11__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2548:2: rule__TaskContext__Group_11__1__Impl rule__TaskContext__Group_11__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_11__1__Impl_in_rule__TaskContext__Group_11__15066);
            rule__TaskContext__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_11__2_in_rule__TaskContext__Group_11__15069);
            rule__TaskContext__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_11__1"


    // $ANTLR start "rule__TaskContext__Group_11__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2555:1: rule__TaskContext__Group_11__1__Impl : ( '{' ) ;
    public final void rule__TaskContext__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2559:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2560:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2560:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2561:1: '{'
            {
             before(grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_11_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__TaskContext__Group_11__1__Impl5097); 
             after(grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_11__1__Impl"


    // $ANTLR start "rule__TaskContext__Group_11__2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2574:1: rule__TaskContext__Group_11__2 : rule__TaskContext__Group_11__2__Impl rule__TaskContext__Group_11__3 ;
    public final void rule__TaskContext__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2578:1: ( rule__TaskContext__Group_11__2__Impl rule__TaskContext__Group_11__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2579:2: rule__TaskContext__Group_11__2__Impl rule__TaskContext__Group_11__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_11__2__Impl_in_rule__TaskContext__Group_11__25128);
            rule__TaskContext__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_11__3_in_rule__TaskContext__Group_11__25131);
            rule__TaskContext__Group_11__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_11__2"


    // $ANTLR start "rule__TaskContext__Group_11__2__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2586:1: rule__TaskContext__Group_11__2__Impl : ( ( rule__TaskContext__PropertiesAssignment_11_2 ) ) ;
    public final void rule__TaskContext__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2590:1: ( ( ( rule__TaskContext__PropertiesAssignment_11_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2591:1: ( ( rule__TaskContext__PropertiesAssignment_11_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2591:1: ( ( rule__TaskContext__PropertiesAssignment_11_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2592:1: ( rule__TaskContext__PropertiesAssignment_11_2 )
            {
             before(grammarAccess.getTaskContextAccess().getPropertiesAssignment_11_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2593:1: ( rule__TaskContext__PropertiesAssignment_11_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2593:2: rule__TaskContext__PropertiesAssignment_11_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__PropertiesAssignment_11_2_in_rule__TaskContext__Group_11__2__Impl5158);
            rule__TaskContext__PropertiesAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskContextAccess().getPropertiesAssignment_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_11__2__Impl"


    // $ANTLR start "rule__TaskContext__Group_11__3"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2603:1: rule__TaskContext__Group_11__3 : rule__TaskContext__Group_11__3__Impl rule__TaskContext__Group_11__4 ;
    public final void rule__TaskContext__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2607:1: ( rule__TaskContext__Group_11__3__Impl rule__TaskContext__Group_11__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2608:2: rule__TaskContext__Group_11__3__Impl rule__TaskContext__Group_11__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_11__3__Impl_in_rule__TaskContext__Group_11__35188);
            rule__TaskContext__Group_11__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_11__4_in_rule__TaskContext__Group_11__35191);
            rule__TaskContext__Group_11__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_11__3"


    // $ANTLR start "rule__TaskContext__Group_11__3__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2615:1: rule__TaskContext__Group_11__3__Impl : ( ( rule__TaskContext__Group_11_3__0 )* ) ;
    public final void rule__TaskContext__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2619:1: ( ( ( rule__TaskContext__Group_11_3__0 )* ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2620:1: ( ( rule__TaskContext__Group_11_3__0 )* )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2620:1: ( ( rule__TaskContext__Group_11_3__0 )* )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2621:1: ( rule__TaskContext__Group_11_3__0 )*
            {
             before(grammarAccess.getTaskContextAccess().getGroup_11_3()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2622:1: ( rule__TaskContext__Group_11_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==24) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2622:2: rule__TaskContext__Group_11_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_11_3__0_in_rule__TaskContext__Group_11__3__Impl5218);
            	    rule__TaskContext__Group_11_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getTaskContextAccess().getGroup_11_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_11__3__Impl"


    // $ANTLR start "rule__TaskContext__Group_11__4"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2632:1: rule__TaskContext__Group_11__4 : rule__TaskContext__Group_11__4__Impl ;
    public final void rule__TaskContext__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2636:1: ( rule__TaskContext__Group_11__4__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2637:2: rule__TaskContext__Group_11__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_11__4__Impl_in_rule__TaskContext__Group_11__45249);
            rule__TaskContext__Group_11__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_11__4"


    // $ANTLR start "rule__TaskContext__Group_11__4__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2643:1: rule__TaskContext__Group_11__4__Impl : ( '}' ) ;
    public final void rule__TaskContext__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2647:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2648:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2648:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2649:1: '}'
            {
             before(grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_11_4()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__TaskContext__Group_11__4__Impl5277); 
             after(grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_11_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_11__4__Impl"


    // $ANTLR start "rule__TaskContext__Group_11_3__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2672:1: rule__TaskContext__Group_11_3__0 : rule__TaskContext__Group_11_3__0__Impl rule__TaskContext__Group_11_3__1 ;
    public final void rule__TaskContext__Group_11_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2676:1: ( rule__TaskContext__Group_11_3__0__Impl rule__TaskContext__Group_11_3__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2677:2: rule__TaskContext__Group_11_3__0__Impl rule__TaskContext__Group_11_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_11_3__0__Impl_in_rule__TaskContext__Group_11_3__05318);
            rule__TaskContext__Group_11_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_11_3__1_in_rule__TaskContext__Group_11_3__05321);
            rule__TaskContext__Group_11_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_11_3__0"


    // $ANTLR start "rule__TaskContext__Group_11_3__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2684:1: rule__TaskContext__Group_11_3__0__Impl : ( ',' ) ;
    public final void rule__TaskContext__Group_11_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2688:1: ( ( ',' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2689:1: ( ',' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2689:1: ( ',' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2690:1: ','
            {
             before(grammarAccess.getTaskContextAccess().getCommaKeyword_11_3_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__TaskContext__Group_11_3__0__Impl5349); 
             after(grammarAccess.getTaskContextAccess().getCommaKeyword_11_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_11_3__0__Impl"


    // $ANTLR start "rule__TaskContext__Group_11_3__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2703:1: rule__TaskContext__Group_11_3__1 : rule__TaskContext__Group_11_3__1__Impl ;
    public final void rule__TaskContext__Group_11_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2707:1: ( rule__TaskContext__Group_11_3__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2708:2: rule__TaskContext__Group_11_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_11_3__1__Impl_in_rule__TaskContext__Group_11_3__15380);
            rule__TaskContext__Group_11_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_11_3__1"


    // $ANTLR start "rule__TaskContext__Group_11_3__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2714:1: rule__TaskContext__Group_11_3__1__Impl : ( ( rule__TaskContext__PropertiesAssignment_11_3_1 ) ) ;
    public final void rule__TaskContext__Group_11_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2718:1: ( ( ( rule__TaskContext__PropertiesAssignment_11_3_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2719:1: ( ( rule__TaskContext__PropertiesAssignment_11_3_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2719:1: ( ( rule__TaskContext__PropertiesAssignment_11_3_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2720:1: ( rule__TaskContext__PropertiesAssignment_11_3_1 )
            {
             before(grammarAccess.getTaskContextAccess().getPropertiesAssignment_11_3_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2721:1: ( rule__TaskContext__PropertiesAssignment_11_3_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2721:2: rule__TaskContext__PropertiesAssignment_11_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__PropertiesAssignment_11_3_1_in_rule__TaskContext__Group_11_3__1__Impl5407);
            rule__TaskContext__PropertiesAssignment_11_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskContextAccess().getPropertiesAssignment_11_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_11_3__1__Impl"


    // $ANTLR start "rule__TaskContext__Group_12__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2735:1: rule__TaskContext__Group_12__0 : rule__TaskContext__Group_12__0__Impl rule__TaskContext__Group_12__1 ;
    public final void rule__TaskContext__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2739:1: ( rule__TaskContext__Group_12__0__Impl rule__TaskContext__Group_12__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2740:2: rule__TaskContext__Group_12__0__Impl rule__TaskContext__Group_12__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_12__0__Impl_in_rule__TaskContext__Group_12__05441);
            rule__TaskContext__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_12__1_in_rule__TaskContext__Group_12__05444);
            rule__TaskContext__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_12__0"


    // $ANTLR start "rule__TaskContext__Group_12__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2747:1: rule__TaskContext__Group_12__0__Impl : ( 'operations' ) ;
    public final void rule__TaskContext__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2751:1: ( ( 'operations' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2752:1: ( 'operations' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2752:1: ( 'operations' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2753:1: 'operations'
            {
             before(grammarAccess.getTaskContextAccess().getOperationsKeyword_12_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__TaskContext__Group_12__0__Impl5472); 
             after(grammarAccess.getTaskContextAccess().getOperationsKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_12__0__Impl"


    // $ANTLR start "rule__TaskContext__Group_12__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2766:1: rule__TaskContext__Group_12__1 : rule__TaskContext__Group_12__1__Impl rule__TaskContext__Group_12__2 ;
    public final void rule__TaskContext__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2770:1: ( rule__TaskContext__Group_12__1__Impl rule__TaskContext__Group_12__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2771:2: rule__TaskContext__Group_12__1__Impl rule__TaskContext__Group_12__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_12__1__Impl_in_rule__TaskContext__Group_12__15503);
            rule__TaskContext__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_12__2_in_rule__TaskContext__Group_12__15506);
            rule__TaskContext__Group_12__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_12__1"


    // $ANTLR start "rule__TaskContext__Group_12__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2778:1: rule__TaskContext__Group_12__1__Impl : ( '{' ) ;
    public final void rule__TaskContext__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2782:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2783:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2783:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2784:1: '{'
            {
             before(grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_12_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__TaskContext__Group_12__1__Impl5534); 
             after(grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_12__1__Impl"


    // $ANTLR start "rule__TaskContext__Group_12__2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2797:1: rule__TaskContext__Group_12__2 : rule__TaskContext__Group_12__2__Impl rule__TaskContext__Group_12__3 ;
    public final void rule__TaskContext__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2801:1: ( rule__TaskContext__Group_12__2__Impl rule__TaskContext__Group_12__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2802:2: rule__TaskContext__Group_12__2__Impl rule__TaskContext__Group_12__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_12__2__Impl_in_rule__TaskContext__Group_12__25565);
            rule__TaskContext__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_12__3_in_rule__TaskContext__Group_12__25568);
            rule__TaskContext__Group_12__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_12__2"


    // $ANTLR start "rule__TaskContext__Group_12__2__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2809:1: rule__TaskContext__Group_12__2__Impl : ( ( rule__TaskContext__OperationsAssignment_12_2 ) ) ;
    public final void rule__TaskContext__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2813:1: ( ( ( rule__TaskContext__OperationsAssignment_12_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2814:1: ( ( rule__TaskContext__OperationsAssignment_12_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2814:1: ( ( rule__TaskContext__OperationsAssignment_12_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2815:1: ( rule__TaskContext__OperationsAssignment_12_2 )
            {
             before(grammarAccess.getTaskContextAccess().getOperationsAssignment_12_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2816:1: ( rule__TaskContext__OperationsAssignment_12_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2816:2: rule__TaskContext__OperationsAssignment_12_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__OperationsAssignment_12_2_in_rule__TaskContext__Group_12__2__Impl5595);
            rule__TaskContext__OperationsAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskContextAccess().getOperationsAssignment_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_12__2__Impl"


    // $ANTLR start "rule__TaskContext__Group_12__3"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2826:1: rule__TaskContext__Group_12__3 : rule__TaskContext__Group_12__3__Impl rule__TaskContext__Group_12__4 ;
    public final void rule__TaskContext__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2830:1: ( rule__TaskContext__Group_12__3__Impl rule__TaskContext__Group_12__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2831:2: rule__TaskContext__Group_12__3__Impl rule__TaskContext__Group_12__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_12__3__Impl_in_rule__TaskContext__Group_12__35625);
            rule__TaskContext__Group_12__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_12__4_in_rule__TaskContext__Group_12__35628);
            rule__TaskContext__Group_12__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_12__3"


    // $ANTLR start "rule__TaskContext__Group_12__3__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2838:1: rule__TaskContext__Group_12__3__Impl : ( ( rule__TaskContext__Group_12_3__0 )* ) ;
    public final void rule__TaskContext__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2842:1: ( ( ( rule__TaskContext__Group_12_3__0 )* ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2843:1: ( ( rule__TaskContext__Group_12_3__0 )* )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2843:1: ( ( rule__TaskContext__Group_12_3__0 )* )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2844:1: ( rule__TaskContext__Group_12_3__0 )*
            {
             before(grammarAccess.getTaskContextAccess().getGroup_12_3()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2845:1: ( rule__TaskContext__Group_12_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==24) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2845:2: rule__TaskContext__Group_12_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_12_3__0_in_rule__TaskContext__Group_12__3__Impl5655);
            	    rule__TaskContext__Group_12_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getTaskContextAccess().getGroup_12_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_12__3__Impl"


    // $ANTLR start "rule__TaskContext__Group_12__4"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2855:1: rule__TaskContext__Group_12__4 : rule__TaskContext__Group_12__4__Impl ;
    public final void rule__TaskContext__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2859:1: ( rule__TaskContext__Group_12__4__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2860:2: rule__TaskContext__Group_12__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_12__4__Impl_in_rule__TaskContext__Group_12__45686);
            rule__TaskContext__Group_12__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_12__4"


    // $ANTLR start "rule__TaskContext__Group_12__4__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2866:1: rule__TaskContext__Group_12__4__Impl : ( '}' ) ;
    public final void rule__TaskContext__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2870:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2871:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2871:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2872:1: '}'
            {
             before(grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_12_4()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__TaskContext__Group_12__4__Impl5714); 
             after(grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_12_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_12__4__Impl"


    // $ANTLR start "rule__TaskContext__Group_12_3__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2895:1: rule__TaskContext__Group_12_3__0 : rule__TaskContext__Group_12_3__0__Impl rule__TaskContext__Group_12_3__1 ;
    public final void rule__TaskContext__Group_12_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2899:1: ( rule__TaskContext__Group_12_3__0__Impl rule__TaskContext__Group_12_3__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2900:2: rule__TaskContext__Group_12_3__0__Impl rule__TaskContext__Group_12_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_12_3__0__Impl_in_rule__TaskContext__Group_12_3__05755);
            rule__TaskContext__Group_12_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_12_3__1_in_rule__TaskContext__Group_12_3__05758);
            rule__TaskContext__Group_12_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_12_3__0"


    // $ANTLR start "rule__TaskContext__Group_12_3__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2907:1: rule__TaskContext__Group_12_3__0__Impl : ( ',' ) ;
    public final void rule__TaskContext__Group_12_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2911:1: ( ( ',' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2912:1: ( ',' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2912:1: ( ',' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2913:1: ','
            {
             before(grammarAccess.getTaskContextAccess().getCommaKeyword_12_3_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__TaskContext__Group_12_3__0__Impl5786); 
             after(grammarAccess.getTaskContextAccess().getCommaKeyword_12_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_12_3__0__Impl"


    // $ANTLR start "rule__TaskContext__Group_12_3__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2926:1: rule__TaskContext__Group_12_3__1 : rule__TaskContext__Group_12_3__1__Impl ;
    public final void rule__TaskContext__Group_12_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2930:1: ( rule__TaskContext__Group_12_3__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2931:2: rule__TaskContext__Group_12_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_12_3__1__Impl_in_rule__TaskContext__Group_12_3__15817);
            rule__TaskContext__Group_12_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_12_3__1"


    // $ANTLR start "rule__TaskContext__Group_12_3__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2937:1: rule__TaskContext__Group_12_3__1__Impl : ( ( rule__TaskContext__OperationsAssignment_12_3_1 ) ) ;
    public final void rule__TaskContext__Group_12_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2941:1: ( ( ( rule__TaskContext__OperationsAssignment_12_3_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2942:1: ( ( rule__TaskContext__OperationsAssignment_12_3_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2942:1: ( ( rule__TaskContext__OperationsAssignment_12_3_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2943:1: ( rule__TaskContext__OperationsAssignment_12_3_1 )
            {
             before(grammarAccess.getTaskContextAccess().getOperationsAssignment_12_3_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2944:1: ( rule__TaskContext__OperationsAssignment_12_3_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2944:2: rule__TaskContext__OperationsAssignment_12_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__OperationsAssignment_12_3_1_in_rule__TaskContext__Group_12_3__1__Impl5844);
            rule__TaskContext__OperationsAssignment_12_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskContextAccess().getOperationsAssignment_12_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_12_3__1__Impl"


    // $ANTLR start "rule__PeerGroup__Group__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2958:1: rule__PeerGroup__Group__0 : rule__PeerGroup__Group__0__Impl rule__PeerGroup__Group__1 ;
    public final void rule__PeerGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2962:1: ( rule__PeerGroup__Group__0__Impl rule__PeerGroup__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2963:2: rule__PeerGroup__Group__0__Impl rule__PeerGroup__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group__0__Impl_in_rule__PeerGroup__Group__05878);
            rule__PeerGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group__1_in_rule__PeerGroup__Group__05881);
            rule__PeerGroup__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeerGroup__Group__0"


    // $ANTLR start "rule__PeerGroup__Group__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2970:1: rule__PeerGroup__Group__0__Impl : ( 'PeerGroup' ) ;
    public final void rule__PeerGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2974:1: ( ( 'PeerGroup' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2975:1: ( 'PeerGroup' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2975:1: ( 'PeerGroup' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2976:1: 'PeerGroup'
            {
             before(grammarAccess.getPeerGroupAccess().getPeerGroupKeyword_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__PeerGroup__Group__0__Impl5909); 
             after(grammarAccess.getPeerGroupAccess().getPeerGroupKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeerGroup__Group__0__Impl"


    // $ANTLR start "rule__PeerGroup__Group__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2989:1: rule__PeerGroup__Group__1 : rule__PeerGroup__Group__1__Impl rule__PeerGroup__Group__2 ;
    public final void rule__PeerGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2993:1: ( rule__PeerGroup__Group__1__Impl rule__PeerGroup__Group__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2994:2: rule__PeerGroup__Group__1__Impl rule__PeerGroup__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group__1__Impl_in_rule__PeerGroup__Group__15940);
            rule__PeerGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group__2_in_rule__PeerGroup__Group__15943);
            rule__PeerGroup__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeerGroup__Group__1"


    // $ANTLR start "rule__PeerGroup__Group__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3001:1: rule__PeerGroup__Group__1__Impl : ( ( rule__PeerGroup__NameAssignment_1 ) ) ;
    public final void rule__PeerGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3005:1: ( ( ( rule__PeerGroup__NameAssignment_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3006:1: ( ( rule__PeerGroup__NameAssignment_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3006:1: ( ( rule__PeerGroup__NameAssignment_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3007:1: ( rule__PeerGroup__NameAssignment_1 )
            {
             before(grammarAccess.getPeerGroupAccess().getNameAssignment_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3008:1: ( rule__PeerGroup__NameAssignment_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3008:2: rule__PeerGroup__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__NameAssignment_1_in_rule__PeerGroup__Group__1__Impl5970);
            rule__PeerGroup__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPeerGroupAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeerGroup__Group__1__Impl"


    // $ANTLR start "rule__PeerGroup__Group__2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3018:1: rule__PeerGroup__Group__2 : rule__PeerGroup__Group__2__Impl rule__PeerGroup__Group__3 ;
    public final void rule__PeerGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3022:1: ( rule__PeerGroup__Group__2__Impl rule__PeerGroup__Group__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3023:2: rule__PeerGroup__Group__2__Impl rule__PeerGroup__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group__2__Impl_in_rule__PeerGroup__Group__26000);
            rule__PeerGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group__3_in_rule__PeerGroup__Group__26003);
            rule__PeerGroup__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeerGroup__Group__2"


    // $ANTLR start "rule__PeerGroup__Group__2__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3030:1: rule__PeerGroup__Group__2__Impl : ( '{' ) ;
    public final void rule__PeerGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3034:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3035:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3035:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3036:1: '{'
            {
             before(grammarAccess.getPeerGroupAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__PeerGroup__Group__2__Impl6031); 
             after(grammarAccess.getPeerGroupAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeerGroup__Group__2__Impl"


    // $ANTLR start "rule__PeerGroup__Group__3"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3049:1: rule__PeerGroup__Group__3 : rule__PeerGroup__Group__3__Impl rule__PeerGroup__Group__4 ;
    public final void rule__PeerGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3053:1: ( rule__PeerGroup__Group__3__Impl rule__PeerGroup__Group__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3054:2: rule__PeerGroup__Group__3__Impl rule__PeerGroup__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group__3__Impl_in_rule__PeerGroup__Group__36062);
            rule__PeerGroup__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group__4_in_rule__PeerGroup__Group__36065);
            rule__PeerGroup__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeerGroup__Group__3"


    // $ANTLR start "rule__PeerGroup__Group__3__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3061:1: rule__PeerGroup__Group__3__Impl : ( 'coordinator' ) ;
    public final void rule__PeerGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3065:1: ( ( 'coordinator' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3066:1: ( 'coordinator' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3066:1: ( 'coordinator' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3067:1: 'coordinator'
            {
             before(grammarAccess.getPeerGroupAccess().getCoordinatorKeyword_3()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__PeerGroup__Group__3__Impl6093); 
             after(grammarAccess.getPeerGroupAccess().getCoordinatorKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeerGroup__Group__3__Impl"


    // $ANTLR start "rule__PeerGroup__Group__4"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3080:1: rule__PeerGroup__Group__4 : rule__PeerGroup__Group__4__Impl rule__PeerGroup__Group__5 ;
    public final void rule__PeerGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3084:1: ( rule__PeerGroup__Group__4__Impl rule__PeerGroup__Group__5 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3085:2: rule__PeerGroup__Group__4__Impl rule__PeerGroup__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group__4__Impl_in_rule__PeerGroup__Group__46124);
            rule__PeerGroup__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group__5_in_rule__PeerGroup__Group__46127);
            rule__PeerGroup__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeerGroup__Group__4"


    // $ANTLR start "rule__PeerGroup__Group__4__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3092:1: rule__PeerGroup__Group__4__Impl : ( ( rule__PeerGroup__CoordinatorAssignment_4 ) ) ;
    public final void rule__PeerGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3096:1: ( ( ( rule__PeerGroup__CoordinatorAssignment_4 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3097:1: ( ( rule__PeerGroup__CoordinatorAssignment_4 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3097:1: ( ( rule__PeerGroup__CoordinatorAssignment_4 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3098:1: ( rule__PeerGroup__CoordinatorAssignment_4 )
            {
             before(grammarAccess.getPeerGroupAccess().getCoordinatorAssignment_4()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3099:1: ( rule__PeerGroup__CoordinatorAssignment_4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3099:2: rule__PeerGroup__CoordinatorAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__CoordinatorAssignment_4_in_rule__PeerGroup__Group__4__Impl6154);
            rule__PeerGroup__CoordinatorAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPeerGroupAccess().getCoordinatorAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeerGroup__Group__4__Impl"


    // $ANTLR start "rule__PeerGroup__Group__5"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3109:1: rule__PeerGroup__Group__5 : rule__PeerGroup__Group__5__Impl rule__PeerGroup__Group__6 ;
    public final void rule__PeerGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3113:1: ( rule__PeerGroup__Group__5__Impl rule__PeerGroup__Group__6 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3114:2: rule__PeerGroup__Group__5__Impl rule__PeerGroup__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group__5__Impl_in_rule__PeerGroup__Group__56184);
            rule__PeerGroup__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group__6_in_rule__PeerGroup__Group__56187);
            rule__PeerGroup__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeerGroup__Group__5"


    // $ANTLR start "rule__PeerGroup__Group__5__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3121:1: rule__PeerGroup__Group__5__Impl : ( ( rule__PeerGroup__Group_5__0 )? ) ;
    public final void rule__PeerGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3125:1: ( ( ( rule__PeerGroup__Group_5__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3126:1: ( ( rule__PeerGroup__Group_5__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3126:1: ( ( rule__PeerGroup__Group_5__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3127:1: ( rule__PeerGroup__Group_5__0 )?
            {
             before(grammarAccess.getPeerGroupAccess().getGroup_5()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3128:1: ( rule__PeerGroup__Group_5__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3128:2: rule__PeerGroup__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group_5__0_in_rule__PeerGroup__Group__5__Impl6214);
                    rule__PeerGroup__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPeerGroupAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeerGroup__Group__5__Impl"


    // $ANTLR start "rule__PeerGroup__Group__6"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3138:1: rule__PeerGroup__Group__6 : rule__PeerGroup__Group__6__Impl ;
    public final void rule__PeerGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3142:1: ( rule__PeerGroup__Group__6__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3143:2: rule__PeerGroup__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group__6__Impl_in_rule__PeerGroup__Group__66245);
            rule__PeerGroup__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeerGroup__Group__6"


    // $ANTLR start "rule__PeerGroup__Group__6__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3149:1: rule__PeerGroup__Group__6__Impl : ( '}' ) ;
    public final void rule__PeerGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3153:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3154:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3154:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3155:1: '}'
            {
             before(grammarAccess.getPeerGroupAccess().getRightCurlyBracketKeyword_6()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__PeerGroup__Group__6__Impl6273); 
             after(grammarAccess.getPeerGroupAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeerGroup__Group__6__Impl"


    // $ANTLR start "rule__PeerGroup__Group_5__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3182:1: rule__PeerGroup__Group_5__0 : rule__PeerGroup__Group_5__0__Impl rule__PeerGroup__Group_5__1 ;
    public final void rule__PeerGroup__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3186:1: ( rule__PeerGroup__Group_5__0__Impl rule__PeerGroup__Group_5__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3187:2: rule__PeerGroup__Group_5__0__Impl rule__PeerGroup__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group_5__0__Impl_in_rule__PeerGroup__Group_5__06318);
            rule__PeerGroup__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group_5__1_in_rule__PeerGroup__Group_5__06321);
            rule__PeerGroup__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeerGroup__Group_5__0"


    // $ANTLR start "rule__PeerGroup__Group_5__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3194:1: rule__PeerGroup__Group_5__0__Impl : ( 'members' ) ;
    public final void rule__PeerGroup__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3198:1: ( ( 'members' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3199:1: ( 'members' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3199:1: ( 'members' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3200:1: 'members'
            {
             before(grammarAccess.getPeerGroupAccess().getMembersKeyword_5_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__PeerGroup__Group_5__0__Impl6349); 
             after(grammarAccess.getPeerGroupAccess().getMembersKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeerGroup__Group_5__0__Impl"


    // $ANTLR start "rule__PeerGroup__Group_5__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3213:1: rule__PeerGroup__Group_5__1 : rule__PeerGroup__Group_5__1__Impl rule__PeerGroup__Group_5__2 ;
    public final void rule__PeerGroup__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3217:1: ( rule__PeerGroup__Group_5__1__Impl rule__PeerGroup__Group_5__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3218:2: rule__PeerGroup__Group_5__1__Impl rule__PeerGroup__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group_5__1__Impl_in_rule__PeerGroup__Group_5__16380);
            rule__PeerGroup__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group_5__2_in_rule__PeerGroup__Group_5__16383);
            rule__PeerGroup__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeerGroup__Group_5__1"


    // $ANTLR start "rule__PeerGroup__Group_5__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3225:1: rule__PeerGroup__Group_5__1__Impl : ( '(' ) ;
    public final void rule__PeerGroup__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3229:1: ( ( '(' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3230:1: ( '(' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3230:1: ( '(' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3231:1: '('
            {
             before(grammarAccess.getPeerGroupAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__PeerGroup__Group_5__1__Impl6411); 
             after(grammarAccess.getPeerGroupAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeerGroup__Group_5__1__Impl"


    // $ANTLR start "rule__PeerGroup__Group_5__2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3244:1: rule__PeerGroup__Group_5__2 : rule__PeerGroup__Group_5__2__Impl rule__PeerGroup__Group_5__3 ;
    public final void rule__PeerGroup__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3248:1: ( rule__PeerGroup__Group_5__2__Impl rule__PeerGroup__Group_5__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3249:2: rule__PeerGroup__Group_5__2__Impl rule__PeerGroup__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group_5__2__Impl_in_rule__PeerGroup__Group_5__26442);
            rule__PeerGroup__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group_5__3_in_rule__PeerGroup__Group_5__26445);
            rule__PeerGroup__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeerGroup__Group_5__2"


    // $ANTLR start "rule__PeerGroup__Group_5__2__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3256:1: rule__PeerGroup__Group_5__2__Impl : ( ( rule__PeerGroup__MembersAssignment_5_2 ) ) ;
    public final void rule__PeerGroup__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3260:1: ( ( ( rule__PeerGroup__MembersAssignment_5_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3261:1: ( ( rule__PeerGroup__MembersAssignment_5_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3261:1: ( ( rule__PeerGroup__MembersAssignment_5_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3262:1: ( rule__PeerGroup__MembersAssignment_5_2 )
            {
             before(grammarAccess.getPeerGroupAccess().getMembersAssignment_5_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3263:1: ( rule__PeerGroup__MembersAssignment_5_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3263:2: rule__PeerGroup__MembersAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__MembersAssignment_5_2_in_rule__PeerGroup__Group_5__2__Impl6472);
            rule__PeerGroup__MembersAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getPeerGroupAccess().getMembersAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeerGroup__Group_5__2__Impl"


    // $ANTLR start "rule__PeerGroup__Group_5__3"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3273:1: rule__PeerGroup__Group_5__3 : rule__PeerGroup__Group_5__3__Impl rule__PeerGroup__Group_5__4 ;
    public final void rule__PeerGroup__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3277:1: ( rule__PeerGroup__Group_5__3__Impl rule__PeerGroup__Group_5__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3278:2: rule__PeerGroup__Group_5__3__Impl rule__PeerGroup__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group_5__3__Impl_in_rule__PeerGroup__Group_5__36502);
            rule__PeerGroup__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group_5__4_in_rule__PeerGroup__Group_5__36505);
            rule__PeerGroup__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeerGroup__Group_5__3"


    // $ANTLR start "rule__PeerGroup__Group_5__3__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3285:1: rule__PeerGroup__Group_5__3__Impl : ( ( rule__PeerGroup__Group_5_3__0 )* ) ;
    public final void rule__PeerGroup__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3289:1: ( ( ( rule__PeerGroup__Group_5_3__0 )* ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3290:1: ( ( rule__PeerGroup__Group_5_3__0 )* )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3290:1: ( ( rule__PeerGroup__Group_5_3__0 )* )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3291:1: ( rule__PeerGroup__Group_5_3__0 )*
            {
             before(grammarAccess.getPeerGroupAccess().getGroup_5_3()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3292:1: ( rule__PeerGroup__Group_5_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==24) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3292:2: rule__PeerGroup__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group_5_3__0_in_rule__PeerGroup__Group_5__3__Impl6532);
            	    rule__PeerGroup__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getPeerGroupAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeerGroup__Group_5__3__Impl"


    // $ANTLR start "rule__PeerGroup__Group_5__4"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3302:1: rule__PeerGroup__Group_5__4 : rule__PeerGroup__Group_5__4__Impl ;
    public final void rule__PeerGroup__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3306:1: ( rule__PeerGroup__Group_5__4__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3307:2: rule__PeerGroup__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group_5__4__Impl_in_rule__PeerGroup__Group_5__46563);
            rule__PeerGroup__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeerGroup__Group_5__4"


    // $ANTLR start "rule__PeerGroup__Group_5__4__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3313:1: rule__PeerGroup__Group_5__4__Impl : ( ')' ) ;
    public final void rule__PeerGroup__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3317:1: ( ( ')' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3318:1: ( ')' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3318:1: ( ')' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3319:1: ')'
            {
             before(grammarAccess.getPeerGroupAccess().getRightParenthesisKeyword_5_4()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__PeerGroup__Group_5__4__Impl6591); 
             after(grammarAccess.getPeerGroupAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeerGroup__Group_5__4__Impl"


    // $ANTLR start "rule__PeerGroup__Group_5_3__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3342:1: rule__PeerGroup__Group_5_3__0 : rule__PeerGroup__Group_5_3__0__Impl rule__PeerGroup__Group_5_3__1 ;
    public final void rule__PeerGroup__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3346:1: ( rule__PeerGroup__Group_5_3__0__Impl rule__PeerGroup__Group_5_3__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3347:2: rule__PeerGroup__Group_5_3__0__Impl rule__PeerGroup__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group_5_3__0__Impl_in_rule__PeerGroup__Group_5_3__06632);
            rule__PeerGroup__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group_5_3__1_in_rule__PeerGroup__Group_5_3__06635);
            rule__PeerGroup__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeerGroup__Group_5_3__0"


    // $ANTLR start "rule__PeerGroup__Group_5_3__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3354:1: rule__PeerGroup__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__PeerGroup__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3358:1: ( ( ',' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3359:1: ( ',' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3359:1: ( ',' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3360:1: ','
            {
             before(grammarAccess.getPeerGroupAccess().getCommaKeyword_5_3_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__PeerGroup__Group_5_3__0__Impl6663); 
             after(grammarAccess.getPeerGroupAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeerGroup__Group_5_3__0__Impl"


    // $ANTLR start "rule__PeerGroup__Group_5_3__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3373:1: rule__PeerGroup__Group_5_3__1 : rule__PeerGroup__Group_5_3__1__Impl ;
    public final void rule__PeerGroup__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3377:1: ( rule__PeerGroup__Group_5_3__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3378:2: rule__PeerGroup__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group_5_3__1__Impl_in_rule__PeerGroup__Group_5_3__16694);
            rule__PeerGroup__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeerGroup__Group_5_3__1"


    // $ANTLR start "rule__PeerGroup__Group_5_3__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3384:1: rule__PeerGroup__Group_5_3__1__Impl : ( ( rule__PeerGroup__MembersAssignment_5_3_1 ) ) ;
    public final void rule__PeerGroup__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3388:1: ( ( ( rule__PeerGroup__MembersAssignment_5_3_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3389:1: ( ( rule__PeerGroup__MembersAssignment_5_3_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3389:1: ( ( rule__PeerGroup__MembersAssignment_5_3_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3390:1: ( rule__PeerGroup__MembersAssignment_5_3_1 )
            {
             before(grammarAccess.getPeerGroupAccess().getMembersAssignment_5_3_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3391:1: ( rule__PeerGroup__MembersAssignment_5_3_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3391:2: rule__PeerGroup__MembersAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__MembersAssignment_5_3_1_in_rule__PeerGroup__Group_5_3__1__Impl6721);
            rule__PeerGroup__MembersAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPeerGroupAccess().getMembersAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeerGroup__Group_5_3__1__Impl"


    // $ANTLR start "rule__ConnectionPolicy__Group__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3405:1: rule__ConnectionPolicy__Group__0 : rule__ConnectionPolicy__Group__0__Impl rule__ConnectionPolicy__Group__1 ;
    public final void rule__ConnectionPolicy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3409:1: ( rule__ConnectionPolicy__Group__0__Impl rule__ConnectionPolicy__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3410:2: rule__ConnectionPolicy__Group__0__Impl rule__ConnectionPolicy__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__0__Impl_in_rule__ConnectionPolicy__Group__06755);
            rule__ConnectionPolicy__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__1_in_rule__ConnectionPolicy__Group__06758);
            rule__ConnectionPolicy__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__Group__0"


    // $ANTLR start "rule__ConnectionPolicy__Group__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3417:1: rule__ConnectionPolicy__Group__0__Impl : ( 'ConnectionPolicy' ) ;
    public final void rule__ConnectionPolicy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3421:1: ( ( 'ConnectionPolicy' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3422:1: ( 'ConnectionPolicy' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3422:1: ( 'ConnectionPolicy' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3423:1: 'ConnectionPolicy'
            {
             before(grammarAccess.getConnectionPolicyAccess().getConnectionPolicyKeyword_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__ConnectionPolicy__Group__0__Impl6786); 
             after(grammarAccess.getConnectionPolicyAccess().getConnectionPolicyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__Group__0__Impl"


    // $ANTLR start "rule__ConnectionPolicy__Group__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3436:1: rule__ConnectionPolicy__Group__1 : rule__ConnectionPolicy__Group__1__Impl rule__ConnectionPolicy__Group__2 ;
    public final void rule__ConnectionPolicy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3440:1: ( rule__ConnectionPolicy__Group__1__Impl rule__ConnectionPolicy__Group__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3441:2: rule__ConnectionPolicy__Group__1__Impl rule__ConnectionPolicy__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__1__Impl_in_rule__ConnectionPolicy__Group__16817);
            rule__ConnectionPolicy__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__2_in_rule__ConnectionPolicy__Group__16820);
            rule__ConnectionPolicy__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__Group__1"


    // $ANTLR start "rule__ConnectionPolicy__Group__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3448:1: rule__ConnectionPolicy__Group__1__Impl : ( ( rule__ConnectionPolicy__NameAssignment_1 ) ) ;
    public final void rule__ConnectionPolicy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3452:1: ( ( ( rule__ConnectionPolicy__NameAssignment_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3453:1: ( ( rule__ConnectionPolicy__NameAssignment_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3453:1: ( ( rule__ConnectionPolicy__NameAssignment_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3454:1: ( rule__ConnectionPolicy__NameAssignment_1 )
            {
             before(grammarAccess.getConnectionPolicyAccess().getNameAssignment_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3455:1: ( rule__ConnectionPolicy__NameAssignment_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3455:2: rule__ConnectionPolicy__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__NameAssignment_1_in_rule__ConnectionPolicy__Group__1__Impl6847);
            rule__ConnectionPolicy__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectionPolicyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__Group__1__Impl"


    // $ANTLR start "rule__ConnectionPolicy__Group__2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3465:1: rule__ConnectionPolicy__Group__2 : rule__ConnectionPolicy__Group__2__Impl rule__ConnectionPolicy__Group__3 ;
    public final void rule__ConnectionPolicy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3469:1: ( rule__ConnectionPolicy__Group__2__Impl rule__ConnectionPolicy__Group__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3470:2: rule__ConnectionPolicy__Group__2__Impl rule__ConnectionPolicy__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__2__Impl_in_rule__ConnectionPolicy__Group__26877);
            rule__ConnectionPolicy__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__3_in_rule__ConnectionPolicy__Group__26880);
            rule__ConnectionPolicy__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__Group__2"


    // $ANTLR start "rule__ConnectionPolicy__Group__2__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3477:1: rule__ConnectionPolicy__Group__2__Impl : ( '{' ) ;
    public final void rule__ConnectionPolicy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3481:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3482:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3482:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3483:1: '{'
            {
             before(grammarAccess.getConnectionPolicyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__ConnectionPolicy__Group__2__Impl6908); 
             after(grammarAccess.getConnectionPolicyAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__Group__2__Impl"


    // $ANTLR start "rule__ConnectionPolicy__Group__3"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3496:1: rule__ConnectionPolicy__Group__3 : rule__ConnectionPolicy__Group__3__Impl rule__ConnectionPolicy__Group__4 ;
    public final void rule__ConnectionPolicy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3500:1: ( rule__ConnectionPolicy__Group__3__Impl rule__ConnectionPolicy__Group__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3501:2: rule__ConnectionPolicy__Group__3__Impl rule__ConnectionPolicy__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__3__Impl_in_rule__ConnectionPolicy__Group__36939);
            rule__ConnectionPolicy__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__4_in_rule__ConnectionPolicy__Group__36942);
            rule__ConnectionPolicy__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__Group__3"


    // $ANTLR start "rule__ConnectionPolicy__Group__3__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3508:1: rule__ConnectionPolicy__Group__3__Impl : ( ( rule__ConnectionPolicy__Group_3__0 )? ) ;
    public final void rule__ConnectionPolicy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3512:1: ( ( ( rule__ConnectionPolicy__Group_3__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3513:1: ( ( rule__ConnectionPolicy__Group_3__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3513:1: ( ( rule__ConnectionPolicy__Group_3__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3514:1: ( rule__ConnectionPolicy__Group_3__0 )?
            {
             before(grammarAccess.getConnectionPolicyAccess().getGroup_3()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3515:1: ( rule__ConnectionPolicy__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==43) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3515:2: rule__ConnectionPolicy__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_3__0_in_rule__ConnectionPolicy__Group__3__Impl6969);
                    rule__ConnectionPolicy__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectionPolicyAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__Group__3__Impl"


    // $ANTLR start "rule__ConnectionPolicy__Group__4"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3525:1: rule__ConnectionPolicy__Group__4 : rule__ConnectionPolicy__Group__4__Impl rule__ConnectionPolicy__Group__5 ;
    public final void rule__ConnectionPolicy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3529:1: ( rule__ConnectionPolicy__Group__4__Impl rule__ConnectionPolicy__Group__5 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3530:2: rule__ConnectionPolicy__Group__4__Impl rule__ConnectionPolicy__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__4__Impl_in_rule__ConnectionPolicy__Group__47000);
            rule__ConnectionPolicy__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__5_in_rule__ConnectionPolicy__Group__47003);
            rule__ConnectionPolicy__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__Group__4"


    // $ANTLR start "rule__ConnectionPolicy__Group__4__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3537:1: rule__ConnectionPolicy__Group__4__Impl : ( ( rule__ConnectionPolicy__Group_4__0 )? ) ;
    public final void rule__ConnectionPolicy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3541:1: ( ( ( rule__ConnectionPolicy__Group_4__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3542:1: ( ( rule__ConnectionPolicy__Group_4__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3542:1: ( ( rule__ConnectionPolicy__Group_4__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3543:1: ( rule__ConnectionPolicy__Group_4__0 )?
            {
             before(grammarAccess.getConnectionPolicyAccess().getGroup_4()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3544:1: ( rule__ConnectionPolicy__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==44) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3544:2: rule__ConnectionPolicy__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_4__0_in_rule__ConnectionPolicy__Group__4__Impl7030);
                    rule__ConnectionPolicy__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectionPolicyAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__Group__4__Impl"


    // $ANTLR start "rule__ConnectionPolicy__Group__5"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3554:1: rule__ConnectionPolicy__Group__5 : rule__ConnectionPolicy__Group__5__Impl rule__ConnectionPolicy__Group__6 ;
    public final void rule__ConnectionPolicy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3558:1: ( rule__ConnectionPolicy__Group__5__Impl rule__ConnectionPolicy__Group__6 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3559:2: rule__ConnectionPolicy__Group__5__Impl rule__ConnectionPolicy__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__5__Impl_in_rule__ConnectionPolicy__Group__57061);
            rule__ConnectionPolicy__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__6_in_rule__ConnectionPolicy__Group__57064);
            rule__ConnectionPolicy__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__Group__5"


    // $ANTLR start "rule__ConnectionPolicy__Group__5__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3566:1: rule__ConnectionPolicy__Group__5__Impl : ( ( rule__ConnectionPolicy__Group_5__0 )? ) ;
    public final void rule__ConnectionPolicy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3570:1: ( ( ( rule__ConnectionPolicy__Group_5__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3571:1: ( ( rule__ConnectionPolicy__Group_5__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3571:1: ( ( rule__ConnectionPolicy__Group_5__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3572:1: ( rule__ConnectionPolicy__Group_5__0 )?
            {
             before(grammarAccess.getConnectionPolicyAccess().getGroup_5()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3573:1: ( rule__ConnectionPolicy__Group_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3573:2: rule__ConnectionPolicy__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_5__0_in_rule__ConnectionPolicy__Group__5__Impl7091);
                    rule__ConnectionPolicy__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectionPolicyAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__Group__5__Impl"


    // $ANTLR start "rule__ConnectionPolicy__Group__6"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3583:1: rule__ConnectionPolicy__Group__6 : rule__ConnectionPolicy__Group__6__Impl rule__ConnectionPolicy__Group__7 ;
    public final void rule__ConnectionPolicy__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3587:1: ( rule__ConnectionPolicy__Group__6__Impl rule__ConnectionPolicy__Group__7 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3588:2: rule__ConnectionPolicy__Group__6__Impl rule__ConnectionPolicy__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__6__Impl_in_rule__ConnectionPolicy__Group__67122);
            rule__ConnectionPolicy__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__7_in_rule__ConnectionPolicy__Group__67125);
            rule__ConnectionPolicy__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__Group__6"


    // $ANTLR start "rule__ConnectionPolicy__Group__6__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3595:1: rule__ConnectionPolicy__Group__6__Impl : ( 'inputPort' ) ;
    public final void rule__ConnectionPolicy__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3599:1: ( ( 'inputPort' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3600:1: ( 'inputPort' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3600:1: ( 'inputPort' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3601:1: 'inputPort'
            {
             before(grammarAccess.getConnectionPolicyAccess().getInputPortKeyword_6()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__ConnectionPolicy__Group__6__Impl7153); 
             after(grammarAccess.getConnectionPolicyAccess().getInputPortKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__Group__6__Impl"


    // $ANTLR start "rule__ConnectionPolicy__Group__7"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3614:1: rule__ConnectionPolicy__Group__7 : rule__ConnectionPolicy__Group__7__Impl rule__ConnectionPolicy__Group__8 ;
    public final void rule__ConnectionPolicy__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3618:1: ( rule__ConnectionPolicy__Group__7__Impl rule__ConnectionPolicy__Group__8 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3619:2: rule__ConnectionPolicy__Group__7__Impl rule__ConnectionPolicy__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__7__Impl_in_rule__ConnectionPolicy__Group__77184);
            rule__ConnectionPolicy__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__8_in_rule__ConnectionPolicy__Group__77187);
            rule__ConnectionPolicy__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__Group__7"


    // $ANTLR start "rule__ConnectionPolicy__Group__7__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3626:1: rule__ConnectionPolicy__Group__7__Impl : ( ( rule__ConnectionPolicy__InputPortAssignment_7 ) ) ;
    public final void rule__ConnectionPolicy__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3630:1: ( ( ( rule__ConnectionPolicy__InputPortAssignment_7 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3631:1: ( ( rule__ConnectionPolicy__InputPortAssignment_7 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3631:1: ( ( rule__ConnectionPolicy__InputPortAssignment_7 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3632:1: ( rule__ConnectionPolicy__InputPortAssignment_7 )
            {
             before(grammarAccess.getConnectionPolicyAccess().getInputPortAssignment_7()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3633:1: ( rule__ConnectionPolicy__InputPortAssignment_7 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3633:2: rule__ConnectionPolicy__InputPortAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__InputPortAssignment_7_in_rule__ConnectionPolicy__Group__7__Impl7214);
            rule__ConnectionPolicy__InputPortAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getConnectionPolicyAccess().getInputPortAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__Group__7__Impl"


    // $ANTLR start "rule__ConnectionPolicy__Group__8"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3643:1: rule__ConnectionPolicy__Group__8 : rule__ConnectionPolicy__Group__8__Impl rule__ConnectionPolicy__Group__9 ;
    public final void rule__ConnectionPolicy__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3647:1: ( rule__ConnectionPolicy__Group__8__Impl rule__ConnectionPolicy__Group__9 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3648:2: rule__ConnectionPolicy__Group__8__Impl rule__ConnectionPolicy__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__8__Impl_in_rule__ConnectionPolicy__Group__87244);
            rule__ConnectionPolicy__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__9_in_rule__ConnectionPolicy__Group__87247);
            rule__ConnectionPolicy__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__Group__8"


    // $ANTLR start "rule__ConnectionPolicy__Group__8__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3655:1: rule__ConnectionPolicy__Group__8__Impl : ( 'outputPort' ) ;
    public final void rule__ConnectionPolicy__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3659:1: ( ( 'outputPort' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3660:1: ( 'outputPort' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3660:1: ( 'outputPort' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3661:1: 'outputPort'
            {
             before(grammarAccess.getConnectionPolicyAccess().getOutputPortKeyword_8()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__ConnectionPolicy__Group__8__Impl7275); 
             after(grammarAccess.getConnectionPolicyAccess().getOutputPortKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__Group__8__Impl"


    // $ANTLR start "rule__ConnectionPolicy__Group__9"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3674:1: rule__ConnectionPolicy__Group__9 : rule__ConnectionPolicy__Group__9__Impl rule__ConnectionPolicy__Group__10 ;
    public final void rule__ConnectionPolicy__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3678:1: ( rule__ConnectionPolicy__Group__9__Impl rule__ConnectionPolicy__Group__10 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3679:2: rule__ConnectionPolicy__Group__9__Impl rule__ConnectionPolicy__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__9__Impl_in_rule__ConnectionPolicy__Group__97306);
            rule__ConnectionPolicy__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__10_in_rule__ConnectionPolicy__Group__97309);
            rule__ConnectionPolicy__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__Group__9"


    // $ANTLR start "rule__ConnectionPolicy__Group__9__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3686:1: rule__ConnectionPolicy__Group__9__Impl : ( ( rule__ConnectionPolicy__OutputPortAssignment_9 ) ) ;
    public final void rule__ConnectionPolicy__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3690:1: ( ( ( rule__ConnectionPolicy__OutputPortAssignment_9 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3691:1: ( ( rule__ConnectionPolicy__OutputPortAssignment_9 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3691:1: ( ( rule__ConnectionPolicy__OutputPortAssignment_9 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3692:1: ( rule__ConnectionPolicy__OutputPortAssignment_9 )
            {
             before(grammarAccess.getConnectionPolicyAccess().getOutputPortAssignment_9()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3693:1: ( rule__ConnectionPolicy__OutputPortAssignment_9 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3693:2: rule__ConnectionPolicy__OutputPortAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__OutputPortAssignment_9_in_rule__ConnectionPolicy__Group__9__Impl7336);
            rule__ConnectionPolicy__OutputPortAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getConnectionPolicyAccess().getOutputPortAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__Group__9__Impl"


    // $ANTLR start "rule__ConnectionPolicy__Group__10"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3703:1: rule__ConnectionPolicy__Group__10 : rule__ConnectionPolicy__Group__10__Impl ;
    public final void rule__ConnectionPolicy__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3707:1: ( rule__ConnectionPolicy__Group__10__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3708:2: rule__ConnectionPolicy__Group__10__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__10__Impl_in_rule__ConnectionPolicy__Group__107366);
            rule__ConnectionPolicy__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__Group__10"


    // $ANTLR start "rule__ConnectionPolicy__Group__10__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3714:1: rule__ConnectionPolicy__Group__10__Impl : ( '}' ) ;
    public final void rule__ConnectionPolicy__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3718:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3719:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3719:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3720:1: '}'
            {
             before(grammarAccess.getConnectionPolicyAccess().getRightCurlyBracketKeyword_10()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__ConnectionPolicy__Group__10__Impl7394); 
             after(grammarAccess.getConnectionPolicyAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__Group__10__Impl"


    // $ANTLR start "rule__ConnectionPolicy__Group_3__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3755:1: rule__ConnectionPolicy__Group_3__0 : rule__ConnectionPolicy__Group_3__0__Impl rule__ConnectionPolicy__Group_3__1 ;
    public final void rule__ConnectionPolicy__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3759:1: ( rule__ConnectionPolicy__Group_3__0__Impl rule__ConnectionPolicy__Group_3__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3760:2: rule__ConnectionPolicy__Group_3__0__Impl rule__ConnectionPolicy__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_3__0__Impl_in_rule__ConnectionPolicy__Group_3__07447);
            rule__ConnectionPolicy__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_3__1_in_rule__ConnectionPolicy__Group_3__07450);
            rule__ConnectionPolicy__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__Group_3__0"


    // $ANTLR start "rule__ConnectionPolicy__Group_3__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3767:1: rule__ConnectionPolicy__Group_3__0__Impl : ( 'bufferSize' ) ;
    public final void rule__ConnectionPolicy__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3771:1: ( ( 'bufferSize' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3772:1: ( 'bufferSize' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3772:1: ( 'bufferSize' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3773:1: 'bufferSize'
            {
             before(grammarAccess.getConnectionPolicyAccess().getBufferSizeKeyword_3_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__ConnectionPolicy__Group_3__0__Impl7478); 
             after(grammarAccess.getConnectionPolicyAccess().getBufferSizeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__Group_3__0__Impl"


    // $ANTLR start "rule__ConnectionPolicy__Group_3__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3786:1: rule__ConnectionPolicy__Group_3__1 : rule__ConnectionPolicy__Group_3__1__Impl ;
    public final void rule__ConnectionPolicy__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3790:1: ( rule__ConnectionPolicy__Group_3__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3791:2: rule__ConnectionPolicy__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_3__1__Impl_in_rule__ConnectionPolicy__Group_3__17509);
            rule__ConnectionPolicy__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__Group_3__1"


    // $ANTLR start "rule__ConnectionPolicy__Group_3__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3797:1: rule__ConnectionPolicy__Group_3__1__Impl : ( ( rule__ConnectionPolicy__BufferSizeAssignment_3_1 ) ) ;
    public final void rule__ConnectionPolicy__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3801:1: ( ( ( rule__ConnectionPolicy__BufferSizeAssignment_3_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3802:1: ( ( rule__ConnectionPolicy__BufferSizeAssignment_3_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3802:1: ( ( rule__ConnectionPolicy__BufferSizeAssignment_3_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3803:1: ( rule__ConnectionPolicy__BufferSizeAssignment_3_1 )
            {
             before(grammarAccess.getConnectionPolicyAccess().getBufferSizeAssignment_3_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3804:1: ( rule__ConnectionPolicy__BufferSizeAssignment_3_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3804:2: rule__ConnectionPolicy__BufferSizeAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__BufferSizeAssignment_3_1_in_rule__ConnectionPolicy__Group_3__1__Impl7536);
            rule__ConnectionPolicy__BufferSizeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectionPolicyAccess().getBufferSizeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__Group_3__1__Impl"


    // $ANTLR start "rule__ConnectionPolicy__Group_4__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3818:1: rule__ConnectionPolicy__Group_4__0 : rule__ConnectionPolicy__Group_4__0__Impl rule__ConnectionPolicy__Group_4__1 ;
    public final void rule__ConnectionPolicy__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3822:1: ( rule__ConnectionPolicy__Group_4__0__Impl rule__ConnectionPolicy__Group_4__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3823:2: rule__ConnectionPolicy__Group_4__0__Impl rule__ConnectionPolicy__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_4__0__Impl_in_rule__ConnectionPolicy__Group_4__07570);
            rule__ConnectionPolicy__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_4__1_in_rule__ConnectionPolicy__Group_4__07573);
            rule__ConnectionPolicy__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__Group_4__0"


    // $ANTLR start "rule__ConnectionPolicy__Group_4__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3830:1: rule__ConnectionPolicy__Group_4__0__Impl : ( 'lockPolicy' ) ;
    public final void rule__ConnectionPolicy__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3834:1: ( ( 'lockPolicy' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3835:1: ( 'lockPolicy' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3835:1: ( 'lockPolicy' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3836:1: 'lockPolicy'
            {
             before(grammarAccess.getConnectionPolicyAccess().getLockPolicyKeyword_4_0()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__ConnectionPolicy__Group_4__0__Impl7601); 
             after(grammarAccess.getConnectionPolicyAccess().getLockPolicyKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__Group_4__0__Impl"


    // $ANTLR start "rule__ConnectionPolicy__Group_4__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3849:1: rule__ConnectionPolicy__Group_4__1 : rule__ConnectionPolicy__Group_4__1__Impl ;
    public final void rule__ConnectionPolicy__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3853:1: ( rule__ConnectionPolicy__Group_4__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3854:2: rule__ConnectionPolicy__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_4__1__Impl_in_rule__ConnectionPolicy__Group_4__17632);
            rule__ConnectionPolicy__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__Group_4__1"


    // $ANTLR start "rule__ConnectionPolicy__Group_4__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3860:1: rule__ConnectionPolicy__Group_4__1__Impl : ( ( rule__ConnectionPolicy__LockPolicyAssignment_4_1 ) ) ;
    public final void rule__ConnectionPolicy__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3864:1: ( ( ( rule__ConnectionPolicy__LockPolicyAssignment_4_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3865:1: ( ( rule__ConnectionPolicy__LockPolicyAssignment_4_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3865:1: ( ( rule__ConnectionPolicy__LockPolicyAssignment_4_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3866:1: ( rule__ConnectionPolicy__LockPolicyAssignment_4_1 )
            {
             before(grammarAccess.getConnectionPolicyAccess().getLockPolicyAssignment_4_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3867:1: ( rule__ConnectionPolicy__LockPolicyAssignment_4_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3867:2: rule__ConnectionPolicy__LockPolicyAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__LockPolicyAssignment_4_1_in_rule__ConnectionPolicy__Group_4__1__Impl7659);
            rule__ConnectionPolicy__LockPolicyAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectionPolicyAccess().getLockPolicyAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__Group_4__1__Impl"


    // $ANTLR start "rule__ConnectionPolicy__Group_5__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3881:1: rule__ConnectionPolicy__Group_5__0 : rule__ConnectionPolicy__Group_5__0__Impl rule__ConnectionPolicy__Group_5__1 ;
    public final void rule__ConnectionPolicy__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3885:1: ( rule__ConnectionPolicy__Group_5__0__Impl rule__ConnectionPolicy__Group_5__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3886:2: rule__ConnectionPolicy__Group_5__0__Impl rule__ConnectionPolicy__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_5__0__Impl_in_rule__ConnectionPolicy__Group_5__07693);
            rule__ConnectionPolicy__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_5__1_in_rule__ConnectionPolicy__Group_5__07696);
            rule__ConnectionPolicy__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__Group_5__0"


    // $ANTLR start "rule__ConnectionPolicy__Group_5__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3893:1: rule__ConnectionPolicy__Group_5__0__Impl : ( 'type' ) ;
    public final void rule__ConnectionPolicy__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3897:1: ( ( 'type' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3898:1: ( 'type' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3898:1: ( 'type' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3899:1: 'type'
            {
             before(grammarAccess.getConnectionPolicyAccess().getTypeKeyword_5_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__ConnectionPolicy__Group_5__0__Impl7724); 
             after(grammarAccess.getConnectionPolicyAccess().getTypeKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__Group_5__0__Impl"


    // $ANTLR start "rule__ConnectionPolicy__Group_5__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3912:1: rule__ConnectionPolicy__Group_5__1 : rule__ConnectionPolicy__Group_5__1__Impl ;
    public final void rule__ConnectionPolicy__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3916:1: ( rule__ConnectionPolicy__Group_5__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3917:2: rule__ConnectionPolicy__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_5__1__Impl_in_rule__ConnectionPolicy__Group_5__17755);
            rule__ConnectionPolicy__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__Group_5__1"


    // $ANTLR start "rule__ConnectionPolicy__Group_5__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3923:1: rule__ConnectionPolicy__Group_5__1__Impl : ( ( rule__ConnectionPolicy__TypeAssignment_5_1 ) ) ;
    public final void rule__ConnectionPolicy__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3927:1: ( ( ( rule__ConnectionPolicy__TypeAssignment_5_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3928:1: ( ( rule__ConnectionPolicy__TypeAssignment_5_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3928:1: ( ( rule__ConnectionPolicy__TypeAssignment_5_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3929:1: ( rule__ConnectionPolicy__TypeAssignment_5_1 )
            {
             before(grammarAccess.getConnectionPolicyAccess().getTypeAssignment_5_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3930:1: ( rule__ConnectionPolicy__TypeAssignment_5_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3930:2: rule__ConnectionPolicy__TypeAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__TypeAssignment_5_1_in_rule__ConnectionPolicy__Group_5__1__Impl7782);
            rule__ConnectionPolicy__TypeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectionPolicyAccess().getTypeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__Group_5__1__Impl"


    // $ANTLR start "rule__InputPort__Group__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3944:1: rule__InputPort__Group__0 : rule__InputPort__Group__0__Impl rule__InputPort__Group__1 ;
    public final void rule__InputPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3948:1: ( rule__InputPort__Group__0__Impl rule__InputPort__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3949:2: rule__InputPort__Group__0__Impl rule__InputPort__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__0__Impl_in_rule__InputPort__Group__07816);
            rule__InputPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__1_in_rule__InputPort__Group__07819);
            rule__InputPort__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__0"


    // $ANTLR start "rule__InputPort__Group__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3956:1: rule__InputPort__Group__0__Impl : ( ( rule__InputPort__IsEventPortAssignment_0 ) ) ;
    public final void rule__InputPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3960:1: ( ( ( rule__InputPort__IsEventPortAssignment_0 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3961:1: ( ( rule__InputPort__IsEventPortAssignment_0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3961:1: ( ( rule__InputPort__IsEventPortAssignment_0 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3962:1: ( rule__InputPort__IsEventPortAssignment_0 )
            {
             before(grammarAccess.getInputPortAccess().getIsEventPortAssignment_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3963:1: ( rule__InputPort__IsEventPortAssignment_0 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3963:2: rule__InputPort__IsEventPortAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__IsEventPortAssignment_0_in_rule__InputPort__Group__0__Impl7846);
            rule__InputPort__IsEventPortAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInputPortAccess().getIsEventPortAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__0__Impl"


    // $ANTLR start "rule__InputPort__Group__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3973:1: rule__InputPort__Group__1 : rule__InputPort__Group__1__Impl rule__InputPort__Group__2 ;
    public final void rule__InputPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3977:1: ( rule__InputPort__Group__1__Impl rule__InputPort__Group__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3978:2: rule__InputPort__Group__1__Impl rule__InputPort__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__1__Impl_in_rule__InputPort__Group__17876);
            rule__InputPort__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__2_in_rule__InputPort__Group__17879);
            rule__InputPort__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__1"


    // $ANTLR start "rule__InputPort__Group__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3985:1: rule__InputPort__Group__1__Impl : ( 'InputPort' ) ;
    public final void rule__InputPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3989:1: ( ( 'InputPort' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3990:1: ( 'InputPort' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3990:1: ( 'InputPort' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3991:1: 'InputPort'
            {
             before(grammarAccess.getInputPortAccess().getInputPortKeyword_1()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__InputPort__Group__1__Impl7907); 
             after(grammarAccess.getInputPortAccess().getInputPortKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__1__Impl"


    // $ANTLR start "rule__InputPort__Group__2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4004:1: rule__InputPort__Group__2 : rule__InputPort__Group__2__Impl rule__InputPort__Group__3 ;
    public final void rule__InputPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4008:1: ( rule__InputPort__Group__2__Impl rule__InputPort__Group__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4009:2: rule__InputPort__Group__2__Impl rule__InputPort__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__2__Impl_in_rule__InputPort__Group__27938);
            rule__InputPort__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__3_in_rule__InputPort__Group__27941);
            rule__InputPort__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__2"


    // $ANTLR start "rule__InputPort__Group__2__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4016:1: rule__InputPort__Group__2__Impl : ( ( rule__InputPort__NameAssignment_2 ) ) ;
    public final void rule__InputPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4020:1: ( ( ( rule__InputPort__NameAssignment_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4021:1: ( ( rule__InputPort__NameAssignment_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4021:1: ( ( rule__InputPort__NameAssignment_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4022:1: ( rule__InputPort__NameAssignment_2 )
            {
             before(grammarAccess.getInputPortAccess().getNameAssignment_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4023:1: ( rule__InputPort__NameAssignment_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4023:2: rule__InputPort__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__NameAssignment_2_in_rule__InputPort__Group__2__Impl7968);
            rule__InputPort__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInputPortAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__2__Impl"


    // $ANTLR start "rule__InputPort__Group__3"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4033:1: rule__InputPort__Group__3 : rule__InputPort__Group__3__Impl rule__InputPort__Group__4 ;
    public final void rule__InputPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4037:1: ( rule__InputPort__Group__3__Impl rule__InputPort__Group__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4038:2: rule__InputPort__Group__3__Impl rule__InputPort__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__3__Impl_in_rule__InputPort__Group__37998);
            rule__InputPort__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__4_in_rule__InputPort__Group__38001);
            rule__InputPort__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__3"


    // $ANTLR start "rule__InputPort__Group__3__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4045:1: rule__InputPort__Group__3__Impl : ( '{' ) ;
    public final void rule__InputPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4049:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4050:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4050:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4051:1: '{'
            {
             before(grammarAccess.getInputPortAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__InputPort__Group__3__Impl8029); 
             after(grammarAccess.getInputPortAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__3__Impl"


    // $ANTLR start "rule__InputPort__Group__4"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4064:1: rule__InputPort__Group__4 : rule__InputPort__Group__4__Impl rule__InputPort__Group__5 ;
    public final void rule__InputPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4068:1: ( rule__InputPort__Group__4__Impl rule__InputPort__Group__5 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4069:2: rule__InputPort__Group__4__Impl rule__InputPort__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__4__Impl_in_rule__InputPort__Group__48060);
            rule__InputPort__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__5_in_rule__InputPort__Group__48063);
            rule__InputPort__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__4"


    // $ANTLR start "rule__InputPort__Group__4__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4076:1: rule__InputPort__Group__4__Impl : ( ( rule__InputPort__Group_4__0 )? ) ;
    public final void rule__InputPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4080:1: ( ( ( rule__InputPort__Group_4__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4081:1: ( ( rule__InputPort__Group_4__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4081:1: ( ( rule__InputPort__Group_4__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4082:1: ( rule__InputPort__Group_4__0 )?
            {
             before(grammarAccess.getInputPortAccess().getGroup_4()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4083:1: ( rule__InputPort__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==46) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4083:2: rule__InputPort__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group_4__0_in_rule__InputPort__Group__4__Impl8090);
                    rule__InputPort__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputPortAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__4__Impl"


    // $ANTLR start "rule__InputPort__Group__5"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4093:1: rule__InputPort__Group__5 : rule__InputPort__Group__5__Impl rule__InputPort__Group__6 ;
    public final void rule__InputPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4097:1: ( rule__InputPort__Group__5__Impl rule__InputPort__Group__6 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4098:2: rule__InputPort__Group__5__Impl rule__InputPort__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__5__Impl_in_rule__InputPort__Group__58121);
            rule__InputPort__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__6_in_rule__InputPort__Group__58124);
            rule__InputPort__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__5"


    // $ANTLR start "rule__InputPort__Group__5__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4105:1: rule__InputPort__Group__5__Impl : ( ( rule__InputPort__Group_5__0 )? ) ;
    public final void rule__InputPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4109:1: ( ( ( rule__InputPort__Group_5__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4110:1: ( ( rule__InputPort__Group_5__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4110:1: ( ( rule__InputPort__Group_5__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4111:1: ( rule__InputPort__Group_5__0 )?
            {
             before(grammarAccess.getInputPortAccess().getGroup_5()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4112:1: ( rule__InputPort__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==47) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4112:2: rule__InputPort__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group_5__0_in_rule__InputPort__Group__5__Impl8151);
                    rule__InputPort__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputPortAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__5__Impl"


    // $ANTLR start "rule__InputPort__Group__6"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4122:1: rule__InputPort__Group__6 : rule__InputPort__Group__6__Impl ;
    public final void rule__InputPort__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4126:1: ( rule__InputPort__Group__6__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4127:2: rule__InputPort__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__6__Impl_in_rule__InputPort__Group__68182);
            rule__InputPort__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__6"


    // $ANTLR start "rule__InputPort__Group__6__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4133:1: rule__InputPort__Group__6__Impl : ( '}' ) ;
    public final void rule__InputPort__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4137:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4138:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4138:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4139:1: '}'
            {
             before(grammarAccess.getInputPortAccess().getRightCurlyBracketKeyword_6()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__InputPort__Group__6__Impl8210); 
             after(grammarAccess.getInputPortAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__6__Impl"


    // $ANTLR start "rule__InputPort__Group_4__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4166:1: rule__InputPort__Group_4__0 : rule__InputPort__Group_4__0__Impl rule__InputPort__Group_4__1 ;
    public final void rule__InputPort__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4170:1: ( rule__InputPort__Group_4__0__Impl rule__InputPort__Group_4__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4171:2: rule__InputPort__Group_4__0__Impl rule__InputPort__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group_4__0__Impl_in_rule__InputPort__Group_4__08255);
            rule__InputPort__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group_4__1_in_rule__InputPort__Group_4__08258);
            rule__InputPort__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group_4__0"


    // $ANTLR start "rule__InputPort__Group_4__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4178:1: rule__InputPort__Group_4__0__Impl : ( 'dataType' ) ;
    public final void rule__InputPort__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4182:1: ( ( 'dataType' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4183:1: ( 'dataType' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4183:1: ( 'dataType' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4184:1: 'dataType'
            {
             before(grammarAccess.getInputPortAccess().getDataTypeKeyword_4_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__InputPort__Group_4__0__Impl8286); 
             after(grammarAccess.getInputPortAccess().getDataTypeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group_4__0__Impl"


    // $ANTLR start "rule__InputPort__Group_4__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4197:1: rule__InputPort__Group_4__1 : rule__InputPort__Group_4__1__Impl ;
    public final void rule__InputPort__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4201:1: ( rule__InputPort__Group_4__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4202:2: rule__InputPort__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group_4__1__Impl_in_rule__InputPort__Group_4__18317);
            rule__InputPort__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group_4__1"


    // $ANTLR start "rule__InputPort__Group_4__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4208:1: rule__InputPort__Group_4__1__Impl : ( ( rule__InputPort__DataTypeAssignment_4_1 ) ) ;
    public final void rule__InputPort__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4212:1: ( ( ( rule__InputPort__DataTypeAssignment_4_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4213:1: ( ( rule__InputPort__DataTypeAssignment_4_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4213:1: ( ( rule__InputPort__DataTypeAssignment_4_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4214:1: ( rule__InputPort__DataTypeAssignment_4_1 )
            {
             before(grammarAccess.getInputPortAccess().getDataTypeAssignment_4_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4215:1: ( rule__InputPort__DataTypeAssignment_4_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4215:2: rule__InputPort__DataTypeAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__DataTypeAssignment_4_1_in_rule__InputPort__Group_4__1__Impl8344);
            rule__InputPort__DataTypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getInputPortAccess().getDataTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group_4__1__Impl"


    // $ANTLR start "rule__InputPort__Group_5__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4229:1: rule__InputPort__Group_5__0 : rule__InputPort__Group_5__0__Impl rule__InputPort__Group_5__1 ;
    public final void rule__InputPort__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4233:1: ( rule__InputPort__Group_5__0__Impl rule__InputPort__Group_5__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4234:2: rule__InputPort__Group_5__0__Impl rule__InputPort__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group_5__0__Impl_in_rule__InputPort__Group_5__08378);
            rule__InputPort__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group_5__1_in_rule__InputPort__Group_5__08381);
            rule__InputPort__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group_5__0"


    // $ANTLR start "rule__InputPort__Group_5__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4241:1: rule__InputPort__Group_5__0__Impl : ( 'inputConnectionPolicy' ) ;
    public final void rule__InputPort__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4245:1: ( ( 'inputConnectionPolicy' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4246:1: ( 'inputConnectionPolicy' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4246:1: ( 'inputConnectionPolicy' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4247:1: 'inputConnectionPolicy'
            {
             before(grammarAccess.getInputPortAccess().getInputConnectionPolicyKeyword_5_0()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__InputPort__Group_5__0__Impl8409); 
             after(grammarAccess.getInputPortAccess().getInputConnectionPolicyKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group_5__0__Impl"


    // $ANTLR start "rule__InputPort__Group_5__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4260:1: rule__InputPort__Group_5__1 : rule__InputPort__Group_5__1__Impl ;
    public final void rule__InputPort__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4264:1: ( rule__InputPort__Group_5__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4265:2: rule__InputPort__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group_5__1__Impl_in_rule__InputPort__Group_5__18440);
            rule__InputPort__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group_5__1"


    // $ANTLR start "rule__InputPort__Group_5__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4271:1: rule__InputPort__Group_5__1__Impl : ( ( rule__InputPort__InputConnectionPolicyAssignment_5_1 ) ) ;
    public final void rule__InputPort__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4275:1: ( ( ( rule__InputPort__InputConnectionPolicyAssignment_5_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4276:1: ( ( rule__InputPort__InputConnectionPolicyAssignment_5_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4276:1: ( ( rule__InputPort__InputConnectionPolicyAssignment_5_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4277:1: ( rule__InputPort__InputConnectionPolicyAssignment_5_1 )
            {
             before(grammarAccess.getInputPortAccess().getInputConnectionPolicyAssignment_5_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4278:1: ( rule__InputPort__InputConnectionPolicyAssignment_5_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4278:2: rule__InputPort__InputConnectionPolicyAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__InputConnectionPolicyAssignment_5_1_in_rule__InputPort__Group_5__1__Impl8467);
            rule__InputPort__InputConnectionPolicyAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getInputPortAccess().getInputConnectionPolicyAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group_5__1__Impl"


    // $ANTLR start "rule__OutputPort__Group__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4292:1: rule__OutputPort__Group__0 : rule__OutputPort__Group__0__Impl rule__OutputPort__Group__1 ;
    public final void rule__OutputPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4296:1: ( rule__OutputPort__Group__0__Impl rule__OutputPort__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4297:2: rule__OutputPort__Group__0__Impl rule__OutputPort__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__0__Impl_in_rule__OutputPort__Group__08501);
            rule__OutputPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__1_in_rule__OutputPort__Group__08504);
            rule__OutputPort__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__0"


    // $ANTLR start "rule__OutputPort__Group__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4304:1: rule__OutputPort__Group__0__Impl : ( 'OutputPort' ) ;
    public final void rule__OutputPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4308:1: ( ( 'OutputPort' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4309:1: ( 'OutputPort' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4309:1: ( 'OutputPort' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4310:1: 'OutputPort'
            {
             before(grammarAccess.getOutputPortAccess().getOutputPortKeyword_0()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__OutputPort__Group__0__Impl8532); 
             after(grammarAccess.getOutputPortAccess().getOutputPortKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__0__Impl"


    // $ANTLR start "rule__OutputPort__Group__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4323:1: rule__OutputPort__Group__1 : rule__OutputPort__Group__1__Impl rule__OutputPort__Group__2 ;
    public final void rule__OutputPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4327:1: ( rule__OutputPort__Group__1__Impl rule__OutputPort__Group__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4328:2: rule__OutputPort__Group__1__Impl rule__OutputPort__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__1__Impl_in_rule__OutputPort__Group__18563);
            rule__OutputPort__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__2_in_rule__OutputPort__Group__18566);
            rule__OutputPort__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__1"


    // $ANTLR start "rule__OutputPort__Group__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4335:1: rule__OutputPort__Group__1__Impl : ( ( rule__OutputPort__NameAssignment_1 ) ) ;
    public final void rule__OutputPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4339:1: ( ( ( rule__OutputPort__NameAssignment_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4340:1: ( ( rule__OutputPort__NameAssignment_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4340:1: ( ( rule__OutputPort__NameAssignment_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4341:1: ( rule__OutputPort__NameAssignment_1 )
            {
             before(grammarAccess.getOutputPortAccess().getNameAssignment_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4342:1: ( rule__OutputPort__NameAssignment_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4342:2: rule__OutputPort__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__NameAssignment_1_in_rule__OutputPort__Group__1__Impl8593);
            rule__OutputPort__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOutputPortAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__1__Impl"


    // $ANTLR start "rule__OutputPort__Group__2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4352:1: rule__OutputPort__Group__2 : rule__OutputPort__Group__2__Impl rule__OutputPort__Group__3 ;
    public final void rule__OutputPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4356:1: ( rule__OutputPort__Group__2__Impl rule__OutputPort__Group__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4357:2: rule__OutputPort__Group__2__Impl rule__OutputPort__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__2__Impl_in_rule__OutputPort__Group__28623);
            rule__OutputPort__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__3_in_rule__OutputPort__Group__28626);
            rule__OutputPort__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__2"


    // $ANTLR start "rule__OutputPort__Group__2__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4364:1: rule__OutputPort__Group__2__Impl : ( '{' ) ;
    public final void rule__OutputPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4368:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4369:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4369:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4370:1: '{'
            {
             before(grammarAccess.getOutputPortAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__OutputPort__Group__2__Impl8654); 
             after(grammarAccess.getOutputPortAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__2__Impl"


    // $ANTLR start "rule__OutputPort__Group__3"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4383:1: rule__OutputPort__Group__3 : rule__OutputPort__Group__3__Impl rule__OutputPort__Group__4 ;
    public final void rule__OutputPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4387:1: ( rule__OutputPort__Group__3__Impl rule__OutputPort__Group__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4388:2: rule__OutputPort__Group__3__Impl rule__OutputPort__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__3__Impl_in_rule__OutputPort__Group__38685);
            rule__OutputPort__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__4_in_rule__OutputPort__Group__38688);
            rule__OutputPort__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__3"


    // $ANTLR start "rule__OutputPort__Group__3__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4395:1: rule__OutputPort__Group__3__Impl : ( ( rule__OutputPort__Group_3__0 )? ) ;
    public final void rule__OutputPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4399:1: ( ( ( rule__OutputPort__Group_3__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4400:1: ( ( rule__OutputPort__Group_3__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4400:1: ( ( rule__OutputPort__Group_3__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4401:1: ( rule__OutputPort__Group_3__0 )?
            {
             before(grammarAccess.getOutputPortAccess().getGroup_3()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4402:1: ( rule__OutputPort__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==46) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4402:2: rule__OutputPort__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group_3__0_in_rule__OutputPort__Group__3__Impl8715);
                    rule__OutputPort__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOutputPortAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__3__Impl"


    // $ANTLR start "rule__OutputPort__Group__4"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4412:1: rule__OutputPort__Group__4 : rule__OutputPort__Group__4__Impl rule__OutputPort__Group__5 ;
    public final void rule__OutputPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4416:1: ( rule__OutputPort__Group__4__Impl rule__OutputPort__Group__5 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4417:2: rule__OutputPort__Group__4__Impl rule__OutputPort__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__4__Impl_in_rule__OutputPort__Group__48746);
            rule__OutputPort__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__5_in_rule__OutputPort__Group__48749);
            rule__OutputPort__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__4"


    // $ANTLR start "rule__OutputPort__Group__4__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4424:1: rule__OutputPort__Group__4__Impl : ( ( rule__OutputPort__Group_4__0 )? ) ;
    public final void rule__OutputPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4428:1: ( ( ( rule__OutputPort__Group_4__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4429:1: ( ( rule__OutputPort__Group_4__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4429:1: ( ( rule__OutputPort__Group_4__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4430:1: ( rule__OutputPort__Group_4__0 )?
            {
             before(grammarAccess.getOutputPortAccess().getGroup_4()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4431:1: ( rule__OutputPort__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==49) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4431:2: rule__OutputPort__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group_4__0_in_rule__OutputPort__Group__4__Impl8776);
                    rule__OutputPort__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOutputPortAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__4__Impl"


    // $ANTLR start "rule__OutputPort__Group__5"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4441:1: rule__OutputPort__Group__5 : rule__OutputPort__Group__5__Impl ;
    public final void rule__OutputPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4445:1: ( rule__OutputPort__Group__5__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4446:2: rule__OutputPort__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__5__Impl_in_rule__OutputPort__Group__58807);
            rule__OutputPort__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__5"


    // $ANTLR start "rule__OutputPort__Group__5__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4452:1: rule__OutputPort__Group__5__Impl : ( '}' ) ;
    public final void rule__OutputPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4456:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4457:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4457:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4458:1: '}'
            {
             before(grammarAccess.getOutputPortAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__OutputPort__Group__5__Impl8835); 
             after(grammarAccess.getOutputPortAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__5__Impl"


    // $ANTLR start "rule__OutputPort__Group_3__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4483:1: rule__OutputPort__Group_3__0 : rule__OutputPort__Group_3__0__Impl rule__OutputPort__Group_3__1 ;
    public final void rule__OutputPort__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4487:1: ( rule__OutputPort__Group_3__0__Impl rule__OutputPort__Group_3__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4488:2: rule__OutputPort__Group_3__0__Impl rule__OutputPort__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group_3__0__Impl_in_rule__OutputPort__Group_3__08878);
            rule__OutputPort__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group_3__1_in_rule__OutputPort__Group_3__08881);
            rule__OutputPort__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group_3__0"


    // $ANTLR start "rule__OutputPort__Group_3__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4495:1: rule__OutputPort__Group_3__0__Impl : ( 'dataType' ) ;
    public final void rule__OutputPort__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4499:1: ( ( 'dataType' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4500:1: ( 'dataType' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4500:1: ( 'dataType' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4501:1: 'dataType'
            {
             before(grammarAccess.getOutputPortAccess().getDataTypeKeyword_3_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__OutputPort__Group_3__0__Impl8909); 
             after(grammarAccess.getOutputPortAccess().getDataTypeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group_3__0__Impl"


    // $ANTLR start "rule__OutputPort__Group_3__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4514:1: rule__OutputPort__Group_3__1 : rule__OutputPort__Group_3__1__Impl ;
    public final void rule__OutputPort__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4518:1: ( rule__OutputPort__Group_3__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4519:2: rule__OutputPort__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group_3__1__Impl_in_rule__OutputPort__Group_3__18940);
            rule__OutputPort__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group_3__1"


    // $ANTLR start "rule__OutputPort__Group_3__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4525:1: rule__OutputPort__Group_3__1__Impl : ( ( rule__OutputPort__DataTypeAssignment_3_1 ) ) ;
    public final void rule__OutputPort__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4529:1: ( ( ( rule__OutputPort__DataTypeAssignment_3_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4530:1: ( ( rule__OutputPort__DataTypeAssignment_3_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4530:1: ( ( rule__OutputPort__DataTypeAssignment_3_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4531:1: ( rule__OutputPort__DataTypeAssignment_3_1 )
            {
             before(grammarAccess.getOutputPortAccess().getDataTypeAssignment_3_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4532:1: ( rule__OutputPort__DataTypeAssignment_3_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4532:2: rule__OutputPort__DataTypeAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__DataTypeAssignment_3_1_in_rule__OutputPort__Group_3__1__Impl8967);
            rule__OutputPort__DataTypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOutputPortAccess().getDataTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group_3__1__Impl"


    // $ANTLR start "rule__OutputPort__Group_4__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4546:1: rule__OutputPort__Group_4__0 : rule__OutputPort__Group_4__0__Impl rule__OutputPort__Group_4__1 ;
    public final void rule__OutputPort__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4550:1: ( rule__OutputPort__Group_4__0__Impl rule__OutputPort__Group_4__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4551:2: rule__OutputPort__Group_4__0__Impl rule__OutputPort__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group_4__0__Impl_in_rule__OutputPort__Group_4__09001);
            rule__OutputPort__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group_4__1_in_rule__OutputPort__Group_4__09004);
            rule__OutputPort__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group_4__0"


    // $ANTLR start "rule__OutputPort__Group_4__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4558:1: rule__OutputPort__Group_4__0__Impl : ( 'outputConnectionPolicy' ) ;
    public final void rule__OutputPort__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4562:1: ( ( 'outputConnectionPolicy' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4563:1: ( 'outputConnectionPolicy' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4563:1: ( 'outputConnectionPolicy' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4564:1: 'outputConnectionPolicy'
            {
             before(grammarAccess.getOutputPortAccess().getOutputConnectionPolicyKeyword_4_0()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__OutputPort__Group_4__0__Impl9032); 
             after(grammarAccess.getOutputPortAccess().getOutputConnectionPolicyKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group_4__0__Impl"


    // $ANTLR start "rule__OutputPort__Group_4__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4577:1: rule__OutputPort__Group_4__1 : rule__OutputPort__Group_4__1__Impl ;
    public final void rule__OutputPort__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4581:1: ( rule__OutputPort__Group_4__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4582:2: rule__OutputPort__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group_4__1__Impl_in_rule__OutputPort__Group_4__19063);
            rule__OutputPort__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group_4__1"


    // $ANTLR start "rule__OutputPort__Group_4__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4588:1: rule__OutputPort__Group_4__1__Impl : ( ( rule__OutputPort__OutputConnectionPolicyAssignment_4_1 ) ) ;
    public final void rule__OutputPort__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4592:1: ( ( ( rule__OutputPort__OutputConnectionPolicyAssignment_4_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4593:1: ( ( rule__OutputPort__OutputConnectionPolicyAssignment_4_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4593:1: ( ( rule__OutputPort__OutputConnectionPolicyAssignment_4_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4594:1: ( rule__OutputPort__OutputConnectionPolicyAssignment_4_1 )
            {
             before(grammarAccess.getOutputPortAccess().getOutputConnectionPolicyAssignment_4_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4595:1: ( rule__OutputPort__OutputConnectionPolicyAssignment_4_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4595:2: rule__OutputPort__OutputConnectionPolicyAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__OutputConnectionPolicyAssignment_4_1_in_rule__OutputPort__Group_4__1__Impl9090);
            rule__OutputPort__OutputConnectionPolicyAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOutputPortAccess().getOutputConnectionPolicyAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group_4__1__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4609:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4613:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4614:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__09124);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__1_in_rule__Property__Group__09127);
            rule__Property__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4621:1: rule__Property__Group__0__Impl : ( () ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4625:1: ( ( () ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4626:1: ( () )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4626:1: ( () )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4627:1: ()
            {
             before(grammarAccess.getPropertyAccess().getPropertyAction_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4628:1: ()
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4630:1: 
            {
            }

             after(grammarAccess.getPropertyAccess().getPropertyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4640:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4644:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4645:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__19185);
            rule__Property__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__2_in_rule__Property__Group__19188);
            rule__Property__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4652:1: rule__Property__Group__1__Impl : ( 'Property' ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4656:1: ( ( 'Property' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4657:1: ( 'Property' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4657:1: ( 'Property' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4658:1: 'Property'
            {
             before(grammarAccess.getPropertyAccess().getPropertyKeyword_1()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__Property__Group__1__Impl9216); 
             after(grammarAccess.getPropertyAccess().getPropertyKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4671:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4675:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4676:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__29247);
            rule__Property__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__3_in_rule__Property__Group__29250);
            rule__Property__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2"


    // $ANTLR start "rule__Property__Group__2__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4683:1: rule__Property__Group__2__Impl : ( ( rule__Property__NameAssignment_2 ) ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4687:1: ( ( ( rule__Property__NameAssignment_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4688:1: ( ( rule__Property__NameAssignment_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4688:1: ( ( rule__Property__NameAssignment_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4689:1: ( rule__Property__NameAssignment_2 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4690:1: ( rule__Property__NameAssignment_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4690:2: rule__Property__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__NameAssignment_2_in_rule__Property__Group__2__Impl9277);
            rule__Property__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2__Impl"


    // $ANTLR start "rule__Property__Group__3"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4700:1: rule__Property__Group__3 : rule__Property__Group__3__Impl rule__Property__Group__4 ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4704:1: ( rule__Property__Group__3__Impl rule__Property__Group__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4705:2: rule__Property__Group__3__Impl rule__Property__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__3__Impl_in_rule__Property__Group__39307);
            rule__Property__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__4_in_rule__Property__Group__39310);
            rule__Property__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__3"


    // $ANTLR start "rule__Property__Group__3__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4712:1: rule__Property__Group__3__Impl : ( '{' ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4716:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4717:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4717:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4718:1: '{'
            {
             before(grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Property__Group__3__Impl9338); 
             after(grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__3__Impl"


    // $ANTLR start "rule__Property__Group__4"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4731:1: rule__Property__Group__4 : rule__Property__Group__4__Impl rule__Property__Group__5 ;
    public final void rule__Property__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4735:1: ( rule__Property__Group__4__Impl rule__Property__Group__5 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4736:2: rule__Property__Group__4__Impl rule__Property__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__4__Impl_in_rule__Property__Group__49369);
            rule__Property__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__5_in_rule__Property__Group__49372);
            rule__Property__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__4"


    // $ANTLR start "rule__Property__Group__4__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4743:1: rule__Property__Group__4__Impl : ( ( rule__Property__Group_4__0 )? ) ;
    public final void rule__Property__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4747:1: ( ( ( rule__Property__Group_4__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4748:1: ( ( rule__Property__Group_4__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4748:1: ( ( rule__Property__Group_4__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4749:1: ( rule__Property__Group_4__0 )?
            {
             before(grammarAccess.getPropertyAccess().getGroup_4()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4750:1: ( rule__Property__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==51) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4750:2: rule__Property__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Property__Group_4__0_in_rule__Property__Group__4__Impl9399);
                    rule__Property__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__4__Impl"


    // $ANTLR start "rule__Property__Group__5"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4760:1: rule__Property__Group__5 : rule__Property__Group__5__Impl rule__Property__Group__6 ;
    public final void rule__Property__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4764:1: ( rule__Property__Group__5__Impl rule__Property__Group__6 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4765:2: rule__Property__Group__5__Impl rule__Property__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__5__Impl_in_rule__Property__Group__59430);
            rule__Property__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__6_in_rule__Property__Group__59433);
            rule__Property__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__5"


    // $ANTLR start "rule__Property__Group__5__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4772:1: rule__Property__Group__5__Impl : ( ( rule__Property__Group_5__0 )? ) ;
    public final void rule__Property__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4776:1: ( ( ( rule__Property__Group_5__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4777:1: ( ( rule__Property__Group_5__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4777:1: ( ( rule__Property__Group_5__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4778:1: ( rule__Property__Group_5__0 )?
            {
             before(grammarAccess.getPropertyAccess().getGroup_5()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4779:1: ( rule__Property__Group_5__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==52) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4779:2: rule__Property__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Property__Group_5__0_in_rule__Property__Group__5__Impl9460);
                    rule__Property__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__5__Impl"


    // $ANTLR start "rule__Property__Group__6"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4789:1: rule__Property__Group__6 : rule__Property__Group__6__Impl rule__Property__Group__7 ;
    public final void rule__Property__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4793:1: ( rule__Property__Group__6__Impl rule__Property__Group__7 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4794:2: rule__Property__Group__6__Impl rule__Property__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__6__Impl_in_rule__Property__Group__69491);
            rule__Property__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__7_in_rule__Property__Group__69494);
            rule__Property__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__6"


    // $ANTLR start "rule__Property__Group__6__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4801:1: rule__Property__Group__6__Impl : ( ( rule__Property__Group_6__0 )? ) ;
    public final void rule__Property__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4805:1: ( ( ( rule__Property__Group_6__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4806:1: ( ( rule__Property__Group_6__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4806:1: ( ( rule__Property__Group_6__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4807:1: ( rule__Property__Group_6__0 )?
            {
             before(grammarAccess.getPropertyAccess().getGroup_6()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4808:1: ( rule__Property__Group_6__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==29) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4808:2: rule__Property__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Property__Group_6__0_in_rule__Property__Group__6__Impl9521);
                    rule__Property__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__6__Impl"


    // $ANTLR start "rule__Property__Group__7"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4818:1: rule__Property__Group__7 : rule__Property__Group__7__Impl ;
    public final void rule__Property__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4822:1: ( rule__Property__Group__7__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4823:2: rule__Property__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__7__Impl_in_rule__Property__Group__79552);
            rule__Property__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__7"


    // $ANTLR start "rule__Property__Group__7__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4829:1: rule__Property__Group__7__Impl : ( '}' ) ;
    public final void rule__Property__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4833:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4834:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4834:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4835:1: '}'
            {
             before(grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_7()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Property__Group__7__Impl9580); 
             after(grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__7__Impl"


    // $ANTLR start "rule__Property__Group_4__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4864:1: rule__Property__Group_4__0 : rule__Property__Group_4__0__Impl rule__Property__Group_4__1 ;
    public final void rule__Property__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4868:1: ( rule__Property__Group_4__0__Impl rule__Property__Group_4__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4869:2: rule__Property__Group_4__0__Impl rule__Property__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group_4__0__Impl_in_rule__Property__Group_4__09627);
            rule__Property__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group_4__1_in_rule__Property__Group_4__09630);
            rule__Property__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4__0"


    // $ANTLR start "rule__Property__Group_4__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4876:1: rule__Property__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__Property__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4880:1: ( ( 'description' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4881:1: ( 'description' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4881:1: ( 'description' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4882:1: 'description'
            {
             before(grammarAccess.getPropertyAccess().getDescriptionKeyword_4_0()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__Property__Group_4__0__Impl9658); 
             after(grammarAccess.getPropertyAccess().getDescriptionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4__0__Impl"


    // $ANTLR start "rule__Property__Group_4__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4895:1: rule__Property__Group_4__1 : rule__Property__Group_4__1__Impl ;
    public final void rule__Property__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4899:1: ( rule__Property__Group_4__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4900:2: rule__Property__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group_4__1__Impl_in_rule__Property__Group_4__19689);
            rule__Property__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4__1"


    // $ANTLR start "rule__Property__Group_4__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4906:1: rule__Property__Group_4__1__Impl : ( ( rule__Property__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Property__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4910:1: ( ( ( rule__Property__DescriptionAssignment_4_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4911:1: ( ( rule__Property__DescriptionAssignment_4_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4911:1: ( ( rule__Property__DescriptionAssignment_4_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4912:1: ( rule__Property__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getPropertyAccess().getDescriptionAssignment_4_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4913:1: ( rule__Property__DescriptionAssignment_4_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4913:2: rule__Property__DescriptionAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__DescriptionAssignment_4_1_in_rule__Property__Group_4__1__Impl9716);
            rule__Property__DescriptionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getDescriptionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4__1__Impl"


    // $ANTLR start "rule__Property__Group_5__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4927:1: rule__Property__Group_5__0 : rule__Property__Group_5__0__Impl rule__Property__Group_5__1 ;
    public final void rule__Property__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4931:1: ( rule__Property__Group_5__0__Impl rule__Property__Group_5__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4932:2: rule__Property__Group_5__0__Impl rule__Property__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group_5__0__Impl_in_rule__Property__Group_5__09750);
            rule__Property__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group_5__1_in_rule__Property__Group_5__09753);
            rule__Property__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_5__0"


    // $ANTLR start "rule__Property__Group_5__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4939:1: rule__Property__Group_5__0__Impl : ( 'value' ) ;
    public final void rule__Property__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4943:1: ( ( 'value' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4944:1: ( 'value' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4944:1: ( 'value' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4945:1: 'value'
            {
             before(grammarAccess.getPropertyAccess().getValueKeyword_5_0()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__Property__Group_5__0__Impl9781); 
             after(grammarAccess.getPropertyAccess().getValueKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_5__0__Impl"


    // $ANTLR start "rule__Property__Group_5__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4958:1: rule__Property__Group_5__1 : rule__Property__Group_5__1__Impl ;
    public final void rule__Property__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4962:1: ( rule__Property__Group_5__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4963:2: rule__Property__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group_5__1__Impl_in_rule__Property__Group_5__19812);
            rule__Property__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_5__1"


    // $ANTLR start "rule__Property__Group_5__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4969:1: rule__Property__Group_5__1__Impl : ( ( rule__Property__ValueAssignment_5_1 ) ) ;
    public final void rule__Property__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4973:1: ( ( ( rule__Property__ValueAssignment_5_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4974:1: ( ( rule__Property__ValueAssignment_5_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4974:1: ( ( rule__Property__ValueAssignment_5_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4975:1: ( rule__Property__ValueAssignment_5_1 )
            {
             before(grammarAccess.getPropertyAccess().getValueAssignment_5_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4976:1: ( rule__Property__ValueAssignment_5_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4976:2: rule__Property__ValueAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__ValueAssignment_5_1_in_rule__Property__Group_5__1__Impl9839);
            rule__Property__ValueAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getValueAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_5__1__Impl"


    // $ANTLR start "rule__Property__Group_6__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4990:1: rule__Property__Group_6__0 : rule__Property__Group_6__0__Impl rule__Property__Group_6__1 ;
    public final void rule__Property__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4994:1: ( rule__Property__Group_6__0__Impl rule__Property__Group_6__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4995:2: rule__Property__Group_6__0__Impl rule__Property__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group_6__0__Impl_in_rule__Property__Group_6__09873);
            rule__Property__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group_6__1_in_rule__Property__Group_6__09876);
            rule__Property__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_6__0"


    // $ANTLR start "rule__Property__Group_6__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5002:1: rule__Property__Group_6__0__Impl : ( 'type' ) ;
    public final void rule__Property__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5006:1: ( ( 'type' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5007:1: ( 'type' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5007:1: ( 'type' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5008:1: 'type'
            {
             before(grammarAccess.getPropertyAccess().getTypeKeyword_6_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Property__Group_6__0__Impl9904); 
             after(grammarAccess.getPropertyAccess().getTypeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_6__0__Impl"


    // $ANTLR start "rule__Property__Group_6__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5021:1: rule__Property__Group_6__1 : rule__Property__Group_6__1__Impl ;
    public final void rule__Property__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5025:1: ( rule__Property__Group_6__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5026:2: rule__Property__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group_6__1__Impl_in_rule__Property__Group_6__19935);
            rule__Property__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_6__1"


    // $ANTLR start "rule__Property__Group_6__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5032:1: rule__Property__Group_6__1__Impl : ( ( rule__Property__TypeAssignment_6_1 ) ) ;
    public final void rule__Property__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5036:1: ( ( ( rule__Property__TypeAssignment_6_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5037:1: ( ( rule__Property__TypeAssignment_6_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5037:1: ( ( rule__Property__TypeAssignment_6_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5038:1: ( rule__Property__TypeAssignment_6_1 )
            {
             before(grammarAccess.getPropertyAccess().getTypeAssignment_6_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5039:1: ( rule__Property__TypeAssignment_6_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5039:2: rule__Property__TypeAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__TypeAssignment_6_1_in_rule__Property__Group_6__1__Impl9962);
            rule__Property__TypeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getTypeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_6__1__Impl"


    // $ANTLR start "rule__Operation__Group__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5053:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5057:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5058:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__09996);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__09999);
            rule__Operation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0"


    // $ANTLR start "rule__Operation__Group__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5065:1: rule__Operation__Group__0__Impl : ( () ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5069:1: ( ( () ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5070:1: ( () )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5070:1: ( () )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5071:1: ()
            {
             before(grammarAccess.getOperationAccess().getOperationAction_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5072:1: ()
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5074:1: 
            {
            }

             after(grammarAccess.getOperationAccess().getOperationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0__Impl"


    // $ANTLR start "rule__Operation__Group__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5084:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5088:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5089:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__110057);
            rule__Operation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__110060);
            rule__Operation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1"


    // $ANTLR start "rule__Operation__Group__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5096:1: rule__Operation__Group__1__Impl : ( 'Operation' ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5100:1: ( ( 'Operation' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5101:1: ( 'Operation' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5101:1: ( 'Operation' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5102:1: 'Operation'
            {
             before(grammarAccess.getOperationAccess().getOperationKeyword_1()); 
            match(input,53,FollowSets000.FOLLOW_53_in_rule__Operation__Group__1__Impl10088); 
             after(grammarAccess.getOperationAccess().getOperationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1__Impl"


    // $ANTLR start "rule__Operation__Group__2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5115:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5119:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5120:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__210119);
            rule__Operation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__210122);
            rule__Operation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2"


    // $ANTLR start "rule__Operation__Group__2__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5127:1: rule__Operation__Group__2__Impl : ( ( rule__Operation__NameAssignment_2 ) ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5131:1: ( ( ( rule__Operation__NameAssignment_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5132:1: ( ( rule__Operation__NameAssignment_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5132:1: ( ( rule__Operation__NameAssignment_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5133:1: ( rule__Operation__NameAssignment_2 )
            {
             before(grammarAccess.getOperationAccess().getNameAssignment_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5134:1: ( rule__Operation__NameAssignment_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5134:2: rule__Operation__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__NameAssignment_2_in_rule__Operation__Group__2__Impl10149);
            rule__Operation__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2__Impl"


    // $ANTLR start "rule__Operation__Group__3"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5144:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5148:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5149:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__310179);
            rule__Operation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__310182);
            rule__Operation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3"


    // $ANTLR start "rule__Operation__Group__3__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5156:1: rule__Operation__Group__3__Impl : ( '{' ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5160:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5161:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5161:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5162:1: '{'
            {
             before(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Operation__Group__3__Impl10210); 
             after(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3__Impl"


    // $ANTLR start "rule__Operation__Group__4"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5175:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5179:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5180:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__410241);
            rule__Operation__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__410244);
            rule__Operation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__4"


    // $ANTLR start "rule__Operation__Group__4__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5187:1: rule__Operation__Group__4__Impl : ( ( rule__Operation__Group_4__0 )? ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5191:1: ( ( ( rule__Operation__Group_4__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5192:1: ( ( rule__Operation__Group_4__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5192:1: ( ( rule__Operation__Group_4__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5193:1: ( rule__Operation__Group_4__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_4()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5194:1: ( rule__Operation__Group_4__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==54) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5194:2: rule__Operation__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_4__0_in_rule__Operation__Group__4__Impl10271);
                    rule__Operation__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__4__Impl"


    // $ANTLR start "rule__Operation__Group__5"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5204:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl rule__Operation__Group__6 ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5208:1: ( rule__Operation__Group__5__Impl rule__Operation__Group__6 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5209:2: rule__Operation__Group__5__Impl rule__Operation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__510302);
            rule__Operation__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__6_in_rule__Operation__Group__510305);
            rule__Operation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__5"


    // $ANTLR start "rule__Operation__Group__5__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5216:1: rule__Operation__Group__5__Impl : ( ( rule__Operation__Group_5__0 )? ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5220:1: ( ( ( rule__Operation__Group_5__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5221:1: ( ( rule__Operation__Group_5__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5221:1: ( ( rule__Operation__Group_5__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5222:1: ( rule__Operation__Group_5__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_5()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5223:1: ( rule__Operation__Group_5__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==55) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5223:2: rule__Operation__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_5__0_in_rule__Operation__Group__5__Impl10332);
                    rule__Operation__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__5__Impl"


    // $ANTLR start "rule__Operation__Group__6"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5233:1: rule__Operation__Group__6 : rule__Operation__Group__6__Impl ;
    public final void rule__Operation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5237:1: ( rule__Operation__Group__6__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5238:2: rule__Operation__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__6__Impl_in_rule__Operation__Group__610363);
            rule__Operation__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__6"


    // $ANTLR start "rule__Operation__Group__6__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5244:1: rule__Operation__Group__6__Impl : ( '}' ) ;
    public final void rule__Operation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5248:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5249:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5249:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5250:1: '}'
            {
             before(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Operation__Group__6__Impl10391); 
             after(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__6__Impl"


    // $ANTLR start "rule__Operation__Group_4__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5277:1: rule__Operation__Group_4__0 : rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 ;
    public final void rule__Operation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5281:1: ( rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5282:2: rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_4__0__Impl_in_rule__Operation__Group_4__010436);
            rule__Operation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_4__1_in_rule__Operation__Group_4__010439);
            rule__Operation__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__0"


    // $ANTLR start "rule__Operation__Group_4__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5289:1: rule__Operation__Group_4__0__Impl : ( 'documentation' ) ;
    public final void rule__Operation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5293:1: ( ( 'documentation' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5294:1: ( 'documentation' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5294:1: ( 'documentation' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5295:1: 'documentation'
            {
             before(grammarAccess.getOperationAccess().getDocumentationKeyword_4_0()); 
            match(input,54,FollowSets000.FOLLOW_54_in_rule__Operation__Group_4__0__Impl10467); 
             after(grammarAccess.getOperationAccess().getDocumentationKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__0__Impl"


    // $ANTLR start "rule__Operation__Group_4__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5308:1: rule__Operation__Group_4__1 : rule__Operation__Group_4__1__Impl ;
    public final void rule__Operation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5312:1: ( rule__Operation__Group_4__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5313:2: rule__Operation__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_4__1__Impl_in_rule__Operation__Group_4__110498);
            rule__Operation__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__1"


    // $ANTLR start "rule__Operation__Group_4__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5319:1: rule__Operation__Group_4__1__Impl : ( ( rule__Operation__DocumentationAssignment_4_1 ) ) ;
    public final void rule__Operation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5323:1: ( ( ( rule__Operation__DocumentationAssignment_4_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5324:1: ( ( rule__Operation__DocumentationAssignment_4_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5324:1: ( ( rule__Operation__DocumentationAssignment_4_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5325:1: ( rule__Operation__DocumentationAssignment_4_1 )
            {
             before(grammarAccess.getOperationAccess().getDocumentationAssignment_4_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5326:1: ( rule__Operation__DocumentationAssignment_4_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5326:2: rule__Operation__DocumentationAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__DocumentationAssignment_4_1_in_rule__Operation__Group_4__1__Impl10525);
            rule__Operation__DocumentationAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getDocumentationAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__1__Impl"


    // $ANTLR start "rule__Operation__Group_5__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5340:1: rule__Operation__Group_5__0 : rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1 ;
    public final void rule__Operation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5344:1: ( rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5345:2: rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_5__0__Impl_in_rule__Operation__Group_5__010559);
            rule__Operation__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_5__1_in_rule__Operation__Group_5__010562);
            rule__Operation__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_5__0"


    // $ANTLR start "rule__Operation__Group_5__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5352:1: rule__Operation__Group_5__0__Impl : ( 'returnType' ) ;
    public final void rule__Operation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5356:1: ( ( 'returnType' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5357:1: ( 'returnType' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5357:1: ( 'returnType' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5358:1: 'returnType'
            {
             before(grammarAccess.getOperationAccess().getReturnTypeKeyword_5_0()); 
            match(input,55,FollowSets000.FOLLOW_55_in_rule__Operation__Group_5__0__Impl10590); 
             after(grammarAccess.getOperationAccess().getReturnTypeKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_5__0__Impl"


    // $ANTLR start "rule__Operation__Group_5__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5371:1: rule__Operation__Group_5__1 : rule__Operation__Group_5__1__Impl ;
    public final void rule__Operation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5375:1: ( rule__Operation__Group_5__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5376:2: rule__Operation__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_5__1__Impl_in_rule__Operation__Group_5__110621);
            rule__Operation__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_5__1"


    // $ANTLR start "rule__Operation__Group_5__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5382:1: rule__Operation__Group_5__1__Impl : ( ( rule__Operation__ReturnTypeAssignment_5_1 ) ) ;
    public final void rule__Operation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5386:1: ( ( ( rule__Operation__ReturnTypeAssignment_5_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5387:1: ( ( rule__Operation__ReturnTypeAssignment_5_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5387:1: ( ( rule__Operation__ReturnTypeAssignment_5_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5388:1: ( rule__Operation__ReturnTypeAssignment_5_1 )
            {
             before(grammarAccess.getOperationAccess().getReturnTypeAssignment_5_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5389:1: ( rule__Operation__ReturnTypeAssignment_5_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5389:2: rule__Operation__ReturnTypeAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__ReturnTypeAssignment_5_1_in_rule__Operation__Group_5__1__Impl10648);
            rule__Operation__ReturnTypeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getReturnTypeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_5__1__Impl"


    // $ANTLR start "rule__EShort__Group__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5403:1: rule__EShort__Group__0 : rule__EShort__Group__0__Impl rule__EShort__Group__1 ;
    public final void rule__EShort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5407:1: ( rule__EShort__Group__0__Impl rule__EShort__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5408:2: rule__EShort__Group__0__Impl rule__EShort__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EShort__Group__0__Impl_in_rule__EShort__Group__010682);
            rule__EShort__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EShort__Group__1_in_rule__EShort__Group__010685);
            rule__EShort__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EShort__Group__0"


    // $ANTLR start "rule__EShort__Group__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5415:1: rule__EShort__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EShort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5419:1: ( ( ( '-' )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5420:1: ( ( '-' )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5420:1: ( ( '-' )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5421:1: ( '-' )?
            {
             before(grammarAccess.getEShortAccess().getHyphenMinusKeyword_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5422:1: ( '-' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==56) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5423:2: '-'
                    {
                    match(input,56,FollowSets000.FOLLOW_56_in_rule__EShort__Group__0__Impl10714); 

                    }
                    break;

            }

             after(grammarAccess.getEShortAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EShort__Group__0__Impl"


    // $ANTLR start "rule__EShort__Group__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5434:1: rule__EShort__Group__1 : rule__EShort__Group__1__Impl ;
    public final void rule__EShort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5438:1: ( rule__EShort__Group__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5439:2: rule__EShort__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EShort__Group__1__Impl_in_rule__EShort__Group__110747);
            rule__EShort__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EShort__Group__1"


    // $ANTLR start "rule__EShort__Group__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5445:1: rule__EShort__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EShort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5449:1: ( ( RULE_INT ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5450:1: ( RULE_INT )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5450:1: ( RULE_INT )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5451:1: RULE_INT
            {
             before(grammarAccess.getEShortAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EShort__Group__1__Impl10774); 
             after(grammarAccess.getEShortAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EShort__Group__1__Impl"


    // $ANTLR start "rule__Activity__Group__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5466:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5470:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5471:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__010807);
            rule__Activity__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__010810);
            rule__Activity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__0"


    // $ANTLR start "rule__Activity__Group__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5478:1: rule__Activity__Group__0__Impl : ( 'Activity' ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5482:1: ( ( 'Activity' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5483:1: ( 'Activity' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5483:1: ( 'Activity' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5484:1: 'Activity'
            {
             before(grammarAccess.getActivityAccess().getActivityKeyword_0()); 
            match(input,57,FollowSets000.FOLLOW_57_in_rule__Activity__Group__0__Impl10838); 
             after(grammarAccess.getActivityAccess().getActivityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__0__Impl"


    // $ANTLR start "rule__Activity__Group__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5497:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5501:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5502:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__110869);
            rule__Activity__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__110872);
            rule__Activity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__1"


    // $ANTLR start "rule__Activity__Group__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5509:1: rule__Activity__Group__1__Impl : ( ( rule__Activity__NameAssignment_1 ) ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5513:1: ( ( ( rule__Activity__NameAssignment_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5514:1: ( ( rule__Activity__NameAssignment_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5514:1: ( ( rule__Activity__NameAssignment_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5515:1: ( rule__Activity__NameAssignment_1 )
            {
             before(grammarAccess.getActivityAccess().getNameAssignment_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5516:1: ( rule__Activity__NameAssignment_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5516:2: rule__Activity__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__NameAssignment_1_in_rule__Activity__Group__1__Impl10899);
            rule__Activity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__1__Impl"


    // $ANTLR start "rule__Activity__Group__2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5526:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5530:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5531:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__210929);
            rule__Activity__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__210932);
            rule__Activity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__2"


    // $ANTLR start "rule__Activity__Group__2__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5538:1: rule__Activity__Group__2__Impl : ( '{' ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5542:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5543:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5543:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5544:1: '{'
            {
             before(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Activity__Group__2__Impl10960); 
             after(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__2__Impl"


    // $ANTLR start "rule__Activity__Group__3"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5557:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl rule__Activity__Group__4 ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5561:1: ( rule__Activity__Group__3__Impl rule__Activity__Group__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5562:2: rule__Activity__Group__3__Impl rule__Activity__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__310991);
            rule__Activity__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__310994);
            rule__Activity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__3"


    // $ANTLR start "rule__Activity__Group__3__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5569:1: rule__Activity__Group__3__Impl : ( 'scheduler' ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5573:1: ( ( 'scheduler' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5574:1: ( 'scheduler' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5574:1: ( 'scheduler' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5575:1: 'scheduler'
            {
             before(grammarAccess.getActivityAccess().getSchedulerKeyword_3()); 
            match(input,58,FollowSets000.FOLLOW_58_in_rule__Activity__Group__3__Impl11022); 
             after(grammarAccess.getActivityAccess().getSchedulerKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__3__Impl"


    // $ANTLR start "rule__Activity__Group__4"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5588:1: rule__Activity__Group__4 : rule__Activity__Group__4__Impl rule__Activity__Group__5 ;
    public final void rule__Activity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5592:1: ( rule__Activity__Group__4__Impl rule__Activity__Group__5 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5593:2: rule__Activity__Group__4__Impl rule__Activity__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__411053);
            rule__Activity__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__411056);
            rule__Activity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__4"


    // $ANTLR start "rule__Activity__Group__4__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5600:1: rule__Activity__Group__4__Impl : ( ( rule__Activity__SchedulerAssignment_4 ) ) ;
    public final void rule__Activity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5604:1: ( ( ( rule__Activity__SchedulerAssignment_4 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5605:1: ( ( rule__Activity__SchedulerAssignment_4 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5605:1: ( ( rule__Activity__SchedulerAssignment_4 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5606:1: ( rule__Activity__SchedulerAssignment_4 )
            {
             before(grammarAccess.getActivityAccess().getSchedulerAssignment_4()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5607:1: ( rule__Activity__SchedulerAssignment_4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5607:2: rule__Activity__SchedulerAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__SchedulerAssignment_4_in_rule__Activity__Group__4__Impl11083);
            rule__Activity__SchedulerAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getSchedulerAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__4__Impl"


    // $ANTLR start "rule__Activity__Group__5"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5617:1: rule__Activity__Group__5 : rule__Activity__Group__5__Impl rule__Activity__Group__6 ;
    public final void rule__Activity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5621:1: ( rule__Activity__Group__5__Impl rule__Activity__Group__6 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5622:2: rule__Activity__Group__5__Impl rule__Activity__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__511113);
            rule__Activity__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__511116);
            rule__Activity__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__5"


    // $ANTLR start "rule__Activity__Group__5__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5629:1: rule__Activity__Group__5__Impl : ( 'cpuAffinity' ) ;
    public final void rule__Activity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5633:1: ( ( 'cpuAffinity' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5634:1: ( 'cpuAffinity' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5634:1: ( 'cpuAffinity' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5635:1: 'cpuAffinity'
            {
             before(grammarAccess.getActivityAccess().getCpuAffinityKeyword_5()); 
            match(input,59,FollowSets000.FOLLOW_59_in_rule__Activity__Group__5__Impl11144); 
             after(grammarAccess.getActivityAccess().getCpuAffinityKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__5__Impl"


    // $ANTLR start "rule__Activity__Group__6"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5648:1: rule__Activity__Group__6 : rule__Activity__Group__6__Impl rule__Activity__Group__7 ;
    public final void rule__Activity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5652:1: ( rule__Activity__Group__6__Impl rule__Activity__Group__7 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5653:2: rule__Activity__Group__6__Impl rule__Activity__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__611175);
            rule__Activity__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__611178);
            rule__Activity__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__6"


    // $ANTLR start "rule__Activity__Group__6__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5660:1: rule__Activity__Group__6__Impl : ( ( rule__Activity__CpuAffinityAssignment_6 ) ) ;
    public final void rule__Activity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5664:1: ( ( ( rule__Activity__CpuAffinityAssignment_6 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5665:1: ( ( rule__Activity__CpuAffinityAssignment_6 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5665:1: ( ( rule__Activity__CpuAffinityAssignment_6 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5666:1: ( rule__Activity__CpuAffinityAssignment_6 )
            {
             before(grammarAccess.getActivityAccess().getCpuAffinityAssignment_6()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5667:1: ( rule__Activity__CpuAffinityAssignment_6 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5667:2: rule__Activity__CpuAffinityAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__CpuAffinityAssignment_6_in_rule__Activity__Group__6__Impl11205);
            rule__Activity__CpuAffinityAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getCpuAffinityAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__6__Impl"


    // $ANTLR start "rule__Activity__Group__7"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5677:1: rule__Activity__Group__7 : rule__Activity__Group__7__Impl rule__Activity__Group__8 ;
    public final void rule__Activity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5681:1: ( rule__Activity__Group__7__Impl rule__Activity__Group__8 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5682:2: rule__Activity__Group__7__Impl rule__Activity__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__711235);
            rule__Activity__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__8_in_rule__Activity__Group__711238);
            rule__Activity__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__7"


    // $ANTLR start "rule__Activity__Group__7__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5689:1: rule__Activity__Group__7__Impl : ( 'period' ) ;
    public final void rule__Activity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5693:1: ( ( 'period' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5694:1: ( 'period' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5694:1: ( 'period' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5695:1: 'period'
            {
             before(grammarAccess.getActivityAccess().getPeriodKeyword_7()); 
            match(input,60,FollowSets000.FOLLOW_60_in_rule__Activity__Group__7__Impl11266); 
             after(grammarAccess.getActivityAccess().getPeriodKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__7__Impl"


    // $ANTLR start "rule__Activity__Group__8"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5708:1: rule__Activity__Group__8 : rule__Activity__Group__8__Impl rule__Activity__Group__9 ;
    public final void rule__Activity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5712:1: ( rule__Activity__Group__8__Impl rule__Activity__Group__9 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5713:2: rule__Activity__Group__8__Impl rule__Activity__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__8__Impl_in_rule__Activity__Group__811297);
            rule__Activity__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__9_in_rule__Activity__Group__811300);
            rule__Activity__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__8"


    // $ANTLR start "rule__Activity__Group__8__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5720:1: rule__Activity__Group__8__Impl : ( ( rule__Activity__PeriodAssignment_8 ) ) ;
    public final void rule__Activity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5724:1: ( ( ( rule__Activity__PeriodAssignment_8 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5725:1: ( ( rule__Activity__PeriodAssignment_8 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5725:1: ( ( rule__Activity__PeriodAssignment_8 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5726:1: ( rule__Activity__PeriodAssignment_8 )
            {
             before(grammarAccess.getActivityAccess().getPeriodAssignment_8()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5727:1: ( rule__Activity__PeriodAssignment_8 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5727:2: rule__Activity__PeriodAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__PeriodAssignment_8_in_rule__Activity__Group__8__Impl11327);
            rule__Activity__PeriodAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getPeriodAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__8__Impl"


    // $ANTLR start "rule__Activity__Group__9"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5737:1: rule__Activity__Group__9 : rule__Activity__Group__9__Impl rule__Activity__Group__10 ;
    public final void rule__Activity__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5741:1: ( rule__Activity__Group__9__Impl rule__Activity__Group__10 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5742:2: rule__Activity__Group__9__Impl rule__Activity__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__9__Impl_in_rule__Activity__Group__911357);
            rule__Activity__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__10_in_rule__Activity__Group__911360);
            rule__Activity__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__9"


    // $ANTLR start "rule__Activity__Group__9__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5749:1: rule__Activity__Group__9__Impl : ( 'priority' ) ;
    public final void rule__Activity__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5753:1: ( ( 'priority' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5754:1: ( 'priority' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5754:1: ( 'priority' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5755:1: 'priority'
            {
             before(grammarAccess.getActivityAccess().getPriorityKeyword_9()); 
            match(input,61,FollowSets000.FOLLOW_61_in_rule__Activity__Group__9__Impl11388); 
             after(grammarAccess.getActivityAccess().getPriorityKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__9__Impl"


    // $ANTLR start "rule__Activity__Group__10"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5768:1: rule__Activity__Group__10 : rule__Activity__Group__10__Impl rule__Activity__Group__11 ;
    public final void rule__Activity__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5772:1: ( rule__Activity__Group__10__Impl rule__Activity__Group__11 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5773:2: rule__Activity__Group__10__Impl rule__Activity__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__10__Impl_in_rule__Activity__Group__1011419);
            rule__Activity__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__11_in_rule__Activity__Group__1011422);
            rule__Activity__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__10"


    // $ANTLR start "rule__Activity__Group__10__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5780:1: rule__Activity__Group__10__Impl : ( ( rule__Activity__PriorityAssignment_10 ) ) ;
    public final void rule__Activity__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5784:1: ( ( ( rule__Activity__PriorityAssignment_10 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5785:1: ( ( rule__Activity__PriorityAssignment_10 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5785:1: ( ( rule__Activity__PriorityAssignment_10 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5786:1: ( rule__Activity__PriorityAssignment_10 )
            {
             before(grammarAccess.getActivityAccess().getPriorityAssignment_10()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5787:1: ( rule__Activity__PriorityAssignment_10 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5787:2: rule__Activity__PriorityAssignment_10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__PriorityAssignment_10_in_rule__Activity__Group__10__Impl11449);
            rule__Activity__PriorityAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getPriorityAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__10__Impl"


    // $ANTLR start "rule__Activity__Group__11"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5797:1: rule__Activity__Group__11 : rule__Activity__Group__11__Impl rule__Activity__Group__12 ;
    public final void rule__Activity__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5801:1: ( rule__Activity__Group__11__Impl rule__Activity__Group__12 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5802:2: rule__Activity__Group__11__Impl rule__Activity__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__11__Impl_in_rule__Activity__Group__1111479);
            rule__Activity__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__12_in_rule__Activity__Group__1111482);
            rule__Activity__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__11"


    // $ANTLR start "rule__Activity__Group__11__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5809:1: rule__Activity__Group__11__Impl : ( ( rule__Activity__Group_11__0 )? ) ;
    public final void rule__Activity__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5813:1: ( ( ( rule__Activity__Group_11__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5814:1: ( ( rule__Activity__Group_11__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5814:1: ( ( rule__Activity__Group_11__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5815:1: ( rule__Activity__Group_11__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_11()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5816:1: ( rule__Activity__Group_11__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==62) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5816:2: rule__Activity__Group_11__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_11__0_in_rule__Activity__Group__11__Impl11509);
                    rule__Activity__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__11__Impl"


    // $ANTLR start "rule__Activity__Group__12"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5826:1: rule__Activity__Group__12 : rule__Activity__Group__12__Impl rule__Activity__Group__13 ;
    public final void rule__Activity__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5830:1: ( rule__Activity__Group__12__Impl rule__Activity__Group__13 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5831:2: rule__Activity__Group__12__Impl rule__Activity__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__12__Impl_in_rule__Activity__Group__1211540);
            rule__Activity__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__13_in_rule__Activity__Group__1211543);
            rule__Activity__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__12"


    // $ANTLR start "rule__Activity__Group__12__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5838:1: rule__Activity__Group__12__Impl : ( ( rule__Activity__Group_12__0 )? ) ;
    public final void rule__Activity__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5842:1: ( ( ( rule__Activity__Group_12__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5843:1: ( ( rule__Activity__Group_12__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5843:1: ( ( rule__Activity__Group_12__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5844:1: ( rule__Activity__Group_12__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_12()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5845:1: ( rule__Activity__Group_12__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==63) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5845:2: rule__Activity__Group_12__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12__0_in_rule__Activity__Group__12__Impl11570);
                    rule__Activity__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__12__Impl"


    // $ANTLR start "rule__Activity__Group__13"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5855:1: rule__Activity__Group__13 : rule__Activity__Group__13__Impl ;
    public final void rule__Activity__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5859:1: ( rule__Activity__Group__13__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5860:2: rule__Activity__Group__13__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__13__Impl_in_rule__Activity__Group__1311601);
            rule__Activity__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__13"


    // $ANTLR start "rule__Activity__Group__13__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5866:1: rule__Activity__Group__13__Impl : ( '}' ) ;
    public final void rule__Activity__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5870:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5871:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5871:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5872:1: '}'
            {
             before(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_13()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Activity__Group__13__Impl11629); 
             after(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__13__Impl"


    // $ANTLR start "rule__Activity__Group_11__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5913:1: rule__Activity__Group_11__0 : rule__Activity__Group_11__0__Impl rule__Activity__Group_11__1 ;
    public final void rule__Activity__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5917:1: ( rule__Activity__Group_11__0__Impl rule__Activity__Group_11__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5918:2: rule__Activity__Group_11__0__Impl rule__Activity__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_11__0__Impl_in_rule__Activity__Group_11__011688);
            rule__Activity__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_11__1_in_rule__Activity__Group_11__011691);
            rule__Activity__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_11__0"


    // $ANTLR start "rule__Activity__Group_11__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5925:1: rule__Activity__Group_11__0__Impl : ( 'taskContext' ) ;
    public final void rule__Activity__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5929:1: ( ( 'taskContext' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5930:1: ( 'taskContext' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5930:1: ( 'taskContext' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5931:1: 'taskContext'
            {
             before(grammarAccess.getActivityAccess().getTaskContextKeyword_11_0()); 
            match(input,62,FollowSets000.FOLLOW_62_in_rule__Activity__Group_11__0__Impl11719); 
             after(grammarAccess.getActivityAccess().getTaskContextKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_11__0__Impl"


    // $ANTLR start "rule__Activity__Group_11__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5944:1: rule__Activity__Group_11__1 : rule__Activity__Group_11__1__Impl ;
    public final void rule__Activity__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5948:1: ( rule__Activity__Group_11__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5949:2: rule__Activity__Group_11__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_11__1__Impl_in_rule__Activity__Group_11__111750);
            rule__Activity__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_11__1"


    // $ANTLR start "rule__Activity__Group_11__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5955:1: rule__Activity__Group_11__1__Impl : ( ( rule__Activity__TaskContextAssignment_11_1 ) ) ;
    public final void rule__Activity__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5959:1: ( ( ( rule__Activity__TaskContextAssignment_11_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5960:1: ( ( rule__Activity__TaskContextAssignment_11_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5960:1: ( ( rule__Activity__TaskContextAssignment_11_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5961:1: ( rule__Activity__TaskContextAssignment_11_1 )
            {
             before(grammarAccess.getActivityAccess().getTaskContextAssignment_11_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5962:1: ( rule__Activity__TaskContextAssignment_11_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5962:2: rule__Activity__TaskContextAssignment_11_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__TaskContextAssignment_11_1_in_rule__Activity__Group_11__1__Impl11777);
            rule__Activity__TaskContextAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getTaskContextAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_11__1__Impl"


    // $ANTLR start "rule__Activity__Group_12__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5976:1: rule__Activity__Group_12__0 : rule__Activity__Group_12__0__Impl rule__Activity__Group_12__1 ;
    public final void rule__Activity__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5980:1: ( rule__Activity__Group_12__0__Impl rule__Activity__Group_12__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5981:2: rule__Activity__Group_12__0__Impl rule__Activity__Group_12__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12__0__Impl_in_rule__Activity__Group_12__011811);
            rule__Activity__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12__1_in_rule__Activity__Group_12__011814);
            rule__Activity__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_12__0"


    // $ANTLR start "rule__Activity__Group_12__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5988:1: rule__Activity__Group_12__0__Impl : ( 'slave' ) ;
    public final void rule__Activity__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5992:1: ( ( 'slave' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5993:1: ( 'slave' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5993:1: ( 'slave' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5994:1: 'slave'
            {
             before(grammarAccess.getActivityAccess().getSlaveKeyword_12_0()); 
            match(input,63,FollowSets000.FOLLOW_63_in_rule__Activity__Group_12__0__Impl11842); 
             after(grammarAccess.getActivityAccess().getSlaveKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_12__0__Impl"


    // $ANTLR start "rule__Activity__Group_12__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6007:1: rule__Activity__Group_12__1 : rule__Activity__Group_12__1__Impl rule__Activity__Group_12__2 ;
    public final void rule__Activity__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6011:1: ( rule__Activity__Group_12__1__Impl rule__Activity__Group_12__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6012:2: rule__Activity__Group_12__1__Impl rule__Activity__Group_12__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12__1__Impl_in_rule__Activity__Group_12__111873);
            rule__Activity__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12__2_in_rule__Activity__Group_12__111876);
            rule__Activity__Group_12__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_12__1"


    // $ANTLR start "rule__Activity__Group_12__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6019:1: rule__Activity__Group_12__1__Impl : ( '{' ) ;
    public final void rule__Activity__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6023:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6024:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6024:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6025:1: '{'
            {
             before(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_12_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Activity__Group_12__1__Impl11904); 
             after(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_12__1__Impl"


    // $ANTLR start "rule__Activity__Group_12__2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6038:1: rule__Activity__Group_12__2 : rule__Activity__Group_12__2__Impl rule__Activity__Group_12__3 ;
    public final void rule__Activity__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6042:1: ( rule__Activity__Group_12__2__Impl rule__Activity__Group_12__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6043:2: rule__Activity__Group_12__2__Impl rule__Activity__Group_12__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12__2__Impl_in_rule__Activity__Group_12__211935);
            rule__Activity__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12__3_in_rule__Activity__Group_12__211938);
            rule__Activity__Group_12__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_12__2"


    // $ANTLR start "rule__Activity__Group_12__2__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6050:1: rule__Activity__Group_12__2__Impl : ( ( rule__Activity__SlaveAssignment_12_2 ) ) ;
    public final void rule__Activity__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6054:1: ( ( ( rule__Activity__SlaveAssignment_12_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6055:1: ( ( rule__Activity__SlaveAssignment_12_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6055:1: ( ( rule__Activity__SlaveAssignment_12_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6056:1: ( rule__Activity__SlaveAssignment_12_2 )
            {
             before(grammarAccess.getActivityAccess().getSlaveAssignment_12_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6057:1: ( rule__Activity__SlaveAssignment_12_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6057:2: rule__Activity__SlaveAssignment_12_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__SlaveAssignment_12_2_in_rule__Activity__Group_12__2__Impl11965);
            rule__Activity__SlaveAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getSlaveAssignment_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_12__2__Impl"


    // $ANTLR start "rule__Activity__Group_12__3"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6067:1: rule__Activity__Group_12__3 : rule__Activity__Group_12__3__Impl rule__Activity__Group_12__4 ;
    public final void rule__Activity__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6071:1: ( rule__Activity__Group_12__3__Impl rule__Activity__Group_12__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6072:2: rule__Activity__Group_12__3__Impl rule__Activity__Group_12__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12__3__Impl_in_rule__Activity__Group_12__311995);
            rule__Activity__Group_12__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12__4_in_rule__Activity__Group_12__311998);
            rule__Activity__Group_12__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_12__3"


    // $ANTLR start "rule__Activity__Group_12__3__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6079:1: rule__Activity__Group_12__3__Impl : ( ( rule__Activity__Group_12_3__0 )* ) ;
    public final void rule__Activity__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6083:1: ( ( ( rule__Activity__Group_12_3__0 )* ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6084:1: ( ( rule__Activity__Group_12_3__0 )* )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6084:1: ( ( rule__Activity__Group_12_3__0 )* )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6085:1: ( rule__Activity__Group_12_3__0 )*
            {
             before(grammarAccess.getActivityAccess().getGroup_12_3()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6086:1: ( rule__Activity__Group_12_3__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==24) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6086:2: rule__Activity__Group_12_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12_3__0_in_rule__Activity__Group_12__3__Impl12025);
            	    rule__Activity__Group_12_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getActivityAccess().getGroup_12_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_12__3__Impl"


    // $ANTLR start "rule__Activity__Group_12__4"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6096:1: rule__Activity__Group_12__4 : rule__Activity__Group_12__4__Impl ;
    public final void rule__Activity__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6100:1: ( rule__Activity__Group_12__4__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6101:2: rule__Activity__Group_12__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12__4__Impl_in_rule__Activity__Group_12__412056);
            rule__Activity__Group_12__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_12__4"


    // $ANTLR start "rule__Activity__Group_12__4__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6107:1: rule__Activity__Group_12__4__Impl : ( '}' ) ;
    public final void rule__Activity__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6111:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6112:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6112:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6113:1: '}'
            {
             before(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_12_4()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Activity__Group_12__4__Impl12084); 
             after(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_12_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_12__4__Impl"


    // $ANTLR start "rule__Activity__Group_12_3__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6136:1: rule__Activity__Group_12_3__0 : rule__Activity__Group_12_3__0__Impl rule__Activity__Group_12_3__1 ;
    public final void rule__Activity__Group_12_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6140:1: ( rule__Activity__Group_12_3__0__Impl rule__Activity__Group_12_3__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6141:2: rule__Activity__Group_12_3__0__Impl rule__Activity__Group_12_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12_3__0__Impl_in_rule__Activity__Group_12_3__012125);
            rule__Activity__Group_12_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12_3__1_in_rule__Activity__Group_12_3__012128);
            rule__Activity__Group_12_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_12_3__0"


    // $ANTLR start "rule__Activity__Group_12_3__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6148:1: rule__Activity__Group_12_3__0__Impl : ( ',' ) ;
    public final void rule__Activity__Group_12_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6152:1: ( ( ',' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6153:1: ( ',' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6153:1: ( ',' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6154:1: ','
            {
             before(grammarAccess.getActivityAccess().getCommaKeyword_12_3_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Activity__Group_12_3__0__Impl12156); 
             after(grammarAccess.getActivityAccess().getCommaKeyword_12_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_12_3__0__Impl"


    // $ANTLR start "rule__Activity__Group_12_3__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6167:1: rule__Activity__Group_12_3__1 : rule__Activity__Group_12_3__1__Impl ;
    public final void rule__Activity__Group_12_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6171:1: ( rule__Activity__Group_12_3__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6172:2: rule__Activity__Group_12_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12_3__1__Impl_in_rule__Activity__Group_12_3__112187);
            rule__Activity__Group_12_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_12_3__1"


    // $ANTLR start "rule__Activity__Group_12_3__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6178:1: rule__Activity__Group_12_3__1__Impl : ( ( rule__Activity__SlaveAssignment_12_3_1 ) ) ;
    public final void rule__Activity__Group_12_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6182:1: ( ( ( rule__Activity__SlaveAssignment_12_3_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6183:1: ( ( rule__Activity__SlaveAssignment_12_3_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6183:1: ( ( rule__Activity__SlaveAssignment_12_3_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6184:1: ( rule__Activity__SlaveAssignment_12_3_1 )
            {
             before(grammarAccess.getActivityAccess().getSlaveAssignment_12_3_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6185:1: ( rule__Activity__SlaveAssignment_12_3_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6185:2: rule__Activity__SlaveAssignment_12_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__SlaveAssignment_12_3_1_in_rule__Activity__Group_12_3__1__Impl12214);
            rule__Activity__SlaveAssignment_12_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getSlaveAssignment_12_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_12_3__1__Impl"


    // $ANTLR start "rule__Slave__Group__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6199:1: rule__Slave__Group__0 : rule__Slave__Group__0__Impl rule__Slave__Group__1 ;
    public final void rule__Slave__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6203:1: ( rule__Slave__Group__0__Impl rule__Slave__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6204:2: rule__Slave__Group__0__Impl rule__Slave__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group__0__Impl_in_rule__Slave__Group__012248);
            rule__Slave__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group__1_in_rule__Slave__Group__012251);
            rule__Slave__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slave__Group__0"


    // $ANTLR start "rule__Slave__Group__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6211:1: rule__Slave__Group__0__Impl : ( () ) ;
    public final void rule__Slave__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6215:1: ( ( () ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6216:1: ( () )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6216:1: ( () )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6217:1: ()
            {
             before(grammarAccess.getSlaveAccess().getSlaveAction_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6218:1: ()
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6220:1: 
            {
            }

             after(grammarAccess.getSlaveAccess().getSlaveAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slave__Group__0__Impl"


    // $ANTLR start "rule__Slave__Group__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6230:1: rule__Slave__Group__1 : rule__Slave__Group__1__Impl rule__Slave__Group__2 ;
    public final void rule__Slave__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6234:1: ( rule__Slave__Group__1__Impl rule__Slave__Group__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6235:2: rule__Slave__Group__1__Impl rule__Slave__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group__1__Impl_in_rule__Slave__Group__112309);
            rule__Slave__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group__2_in_rule__Slave__Group__112312);
            rule__Slave__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slave__Group__1"


    // $ANTLR start "rule__Slave__Group__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6242:1: rule__Slave__Group__1__Impl : ( 'Slave' ) ;
    public final void rule__Slave__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6246:1: ( ( 'Slave' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6247:1: ( 'Slave' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6247:1: ( 'Slave' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6248:1: 'Slave'
            {
             before(grammarAccess.getSlaveAccess().getSlaveKeyword_1()); 
            match(input,64,FollowSets000.FOLLOW_64_in_rule__Slave__Group__1__Impl12340); 
             after(grammarAccess.getSlaveAccess().getSlaveKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slave__Group__1__Impl"


    // $ANTLR start "rule__Slave__Group__2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6261:1: rule__Slave__Group__2 : rule__Slave__Group__2__Impl rule__Slave__Group__3 ;
    public final void rule__Slave__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6265:1: ( rule__Slave__Group__2__Impl rule__Slave__Group__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6266:2: rule__Slave__Group__2__Impl rule__Slave__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group__2__Impl_in_rule__Slave__Group__212371);
            rule__Slave__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group__3_in_rule__Slave__Group__212374);
            rule__Slave__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slave__Group__2"


    // $ANTLR start "rule__Slave__Group__2__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6273:1: rule__Slave__Group__2__Impl : ( ( rule__Slave__NameAssignment_2 ) ) ;
    public final void rule__Slave__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6277:1: ( ( ( rule__Slave__NameAssignment_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6278:1: ( ( rule__Slave__NameAssignment_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6278:1: ( ( rule__Slave__NameAssignment_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6279:1: ( rule__Slave__NameAssignment_2 )
            {
             before(grammarAccess.getSlaveAccess().getNameAssignment_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6280:1: ( rule__Slave__NameAssignment_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6280:2: rule__Slave__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slave__NameAssignment_2_in_rule__Slave__Group__2__Impl12401);
            rule__Slave__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSlaveAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slave__Group__2__Impl"


    // $ANTLR start "rule__Slave__Group__3"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6290:1: rule__Slave__Group__3 : rule__Slave__Group__3__Impl rule__Slave__Group__4 ;
    public final void rule__Slave__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6294:1: ( rule__Slave__Group__3__Impl rule__Slave__Group__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6295:2: rule__Slave__Group__3__Impl rule__Slave__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group__3__Impl_in_rule__Slave__Group__312431);
            rule__Slave__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group__4_in_rule__Slave__Group__312434);
            rule__Slave__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slave__Group__3"


    // $ANTLR start "rule__Slave__Group__3__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6302:1: rule__Slave__Group__3__Impl : ( '{' ) ;
    public final void rule__Slave__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6306:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6307:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6307:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6308:1: '{'
            {
             before(grammarAccess.getSlaveAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Slave__Group__3__Impl12462); 
             after(grammarAccess.getSlaveAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slave__Group__3__Impl"


    // $ANTLR start "rule__Slave__Group__4"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6321:1: rule__Slave__Group__4 : rule__Slave__Group__4__Impl rule__Slave__Group__5 ;
    public final void rule__Slave__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6325:1: ( rule__Slave__Group__4__Impl rule__Slave__Group__5 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6326:2: rule__Slave__Group__4__Impl rule__Slave__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group__4__Impl_in_rule__Slave__Group__412493);
            rule__Slave__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group__5_in_rule__Slave__Group__412496);
            rule__Slave__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slave__Group__4"


    // $ANTLR start "rule__Slave__Group__4__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6333:1: rule__Slave__Group__4__Impl : ( ( rule__Slave__Group_4__0 )? ) ;
    public final void rule__Slave__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6337:1: ( ( ( rule__Slave__Group_4__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6338:1: ( ( rule__Slave__Group_4__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6338:1: ( ( rule__Slave__Group_4__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6339:1: ( rule__Slave__Group_4__0 )?
            {
             before(grammarAccess.getSlaveAccess().getGroup_4()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6340:1: ( rule__Slave__Group_4__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==62) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6340:2: rule__Slave__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Slave__Group_4__0_in_rule__Slave__Group__4__Impl12523);
                    rule__Slave__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSlaveAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slave__Group__4__Impl"


    // $ANTLR start "rule__Slave__Group__5"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6350:1: rule__Slave__Group__5 : rule__Slave__Group__5__Impl ;
    public final void rule__Slave__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6354:1: ( rule__Slave__Group__5__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6355:2: rule__Slave__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group__5__Impl_in_rule__Slave__Group__512554);
            rule__Slave__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slave__Group__5"


    // $ANTLR start "rule__Slave__Group__5__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6361:1: rule__Slave__Group__5__Impl : ( '}' ) ;
    public final void rule__Slave__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6365:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6366:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6366:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6367:1: '}'
            {
             before(grammarAccess.getSlaveAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Slave__Group__5__Impl12582); 
             after(grammarAccess.getSlaveAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slave__Group__5__Impl"


    // $ANTLR start "rule__Slave__Group_4__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6392:1: rule__Slave__Group_4__0 : rule__Slave__Group_4__0__Impl rule__Slave__Group_4__1 ;
    public final void rule__Slave__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6396:1: ( rule__Slave__Group_4__0__Impl rule__Slave__Group_4__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6397:2: rule__Slave__Group_4__0__Impl rule__Slave__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group_4__0__Impl_in_rule__Slave__Group_4__012625);
            rule__Slave__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group_4__1_in_rule__Slave__Group_4__012628);
            rule__Slave__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slave__Group_4__0"


    // $ANTLR start "rule__Slave__Group_4__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6404:1: rule__Slave__Group_4__0__Impl : ( 'taskContext' ) ;
    public final void rule__Slave__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6408:1: ( ( 'taskContext' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6409:1: ( 'taskContext' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6409:1: ( 'taskContext' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6410:1: 'taskContext'
            {
             before(grammarAccess.getSlaveAccess().getTaskContextKeyword_4_0()); 
            match(input,62,FollowSets000.FOLLOW_62_in_rule__Slave__Group_4__0__Impl12656); 
             after(grammarAccess.getSlaveAccess().getTaskContextKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slave__Group_4__0__Impl"


    // $ANTLR start "rule__Slave__Group_4__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6423:1: rule__Slave__Group_4__1 : rule__Slave__Group_4__1__Impl ;
    public final void rule__Slave__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6427:1: ( rule__Slave__Group_4__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6428:2: rule__Slave__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group_4__1__Impl_in_rule__Slave__Group_4__112687);
            rule__Slave__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slave__Group_4__1"


    // $ANTLR start "rule__Slave__Group_4__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6434:1: rule__Slave__Group_4__1__Impl : ( ( rule__Slave__TaskContextAssignment_4_1 ) ) ;
    public final void rule__Slave__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6438:1: ( ( ( rule__Slave__TaskContextAssignment_4_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6439:1: ( ( rule__Slave__TaskContextAssignment_4_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6439:1: ( ( rule__Slave__TaskContextAssignment_4_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6440:1: ( rule__Slave__TaskContextAssignment_4_1 )
            {
             before(grammarAccess.getSlaveAccess().getTaskContextAssignment_4_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6441:1: ( rule__Slave__TaskContextAssignment_4_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6441:2: rule__Slave__TaskContextAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slave__TaskContextAssignment_4_1_in_rule__Slave__Group_4__1__Impl12714);
            rule__Slave__TaskContextAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSlaveAccess().getTaskContextAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slave__Group_4__1__Impl"


    // $ANTLR start "rule__EFloat__Group__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6455:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6459:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6460:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__0__Impl_in_rule__EFloat__Group__012748);
            rule__EFloat__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__1_in_rule__EFloat__Group__012751);
            rule__EFloat__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__0"


    // $ANTLR start "rule__EFloat__Group__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6467:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6471:1: ( ( ( '-' )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6472:1: ( ( '-' )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6472:1: ( ( '-' )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6473:1: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6474:1: ( '-' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==56) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6475:2: '-'
                    {
                    match(input,56,FollowSets000.FOLLOW_56_in_rule__EFloat__Group__0__Impl12780); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__0__Impl"


    // $ANTLR start "rule__EFloat__Group__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6486:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6490:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6491:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__1__Impl_in_rule__EFloat__Group__112813);
            rule__EFloat__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__2_in_rule__EFloat__Group__112816);
            rule__EFloat__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__1"


    // $ANTLR start "rule__EFloat__Group__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6498:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6502:1: ( ( ( RULE_INT )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6503:1: ( ( RULE_INT )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6503:1: ( ( RULE_INT )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6504:1: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6505:1: ( RULE_INT )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_INT) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6505:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EFloat__Group__1__Impl12844); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__1__Impl"


    // $ANTLR start "rule__EFloat__Group__2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6515:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6519:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6520:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__2__Impl_in_rule__EFloat__Group__212875);
            rule__EFloat__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__3_in_rule__EFloat__Group__212878);
            rule__EFloat__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__2"


    // $ANTLR start "rule__EFloat__Group__2__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6527:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6531:1: ( ( '.' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6532:1: ( '.' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6532:1: ( '.' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6533:1: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            match(input,65,FollowSets000.FOLLOW_65_in_rule__EFloat__Group__2__Impl12906); 
             after(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__2__Impl"


    // $ANTLR start "rule__EFloat__Group__3"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6546:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6550:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6551:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__3__Impl_in_rule__EFloat__Group__312937);
            rule__EFloat__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__4_in_rule__EFloat__Group__312940);
            rule__EFloat__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__3"


    // $ANTLR start "rule__EFloat__Group__3__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6558:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6562:1: ( ( RULE_INT ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6563:1: ( RULE_INT )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6563:1: ( RULE_INT )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6564:1: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EFloat__Group__3__Impl12967); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__3__Impl"


    // $ANTLR start "rule__EFloat__Group__4"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6575:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6579:1: ( rule__EFloat__Group__4__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6580:2: rule__EFloat__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__4__Impl_in_rule__EFloat__Group__412996);
            rule__EFloat__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__4"


    // $ANTLR start "rule__EFloat__Group__4__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6586:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6590:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6591:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6591:1: ( ( rule__EFloat__Group_4__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6592:1: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6593:1: ( rule__EFloat__Group_4__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=11 && LA41_0<=12)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6593:2: rule__EFloat__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__0_in_rule__EFloat__Group__4__Impl13023);
                    rule__EFloat__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__4__Impl"


    // $ANTLR start "rule__EFloat__Group_4__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6613:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6617:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6618:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__0__Impl_in_rule__EFloat__Group_4__013064);
            rule__EFloat__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__1_in_rule__EFloat__Group_4__013067);
            rule__EFloat__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__0"


    // $ANTLR start "rule__EFloat__Group_4__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6625:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6629:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6630:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6630:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6631:1: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6632:1: ( rule__EFloat__Alternatives_4_0 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6632:2: rule__EFloat__Alternatives_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Alternatives_4_0_in_rule__EFloat__Group_4__0__Impl13094);
            rule__EFloat__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__0__Impl"


    // $ANTLR start "rule__EFloat__Group_4__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6642:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6646:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6647:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__1__Impl_in_rule__EFloat__Group_4__113124);
            rule__EFloat__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__2_in_rule__EFloat__Group_4__113127);
            rule__EFloat__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__1"


    // $ANTLR start "rule__EFloat__Group_4__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6654:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6658:1: ( ( ( '-' )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6659:1: ( ( '-' )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6659:1: ( ( '-' )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6660:1: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6661:1: ( '-' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==56) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6662:2: '-'
                    {
                    match(input,56,FollowSets000.FOLLOW_56_in_rule__EFloat__Group_4__1__Impl13156); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__1__Impl"


    // $ANTLR start "rule__EFloat__Group_4__2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6673:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6677:1: ( rule__EFloat__Group_4__2__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6678:2: rule__EFloat__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__2__Impl_in_rule__EFloat__Group_4__213189);
            rule__EFloat__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__2"


    // $ANTLR start "rule__EFloat__Group_4__2__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6684:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6688:1: ( ( RULE_INT ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6689:1: ( RULE_INT )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6689:1: ( RULE_INT )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6690:1: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EFloat__Group_4__2__Impl13216); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6707:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6711:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6712:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__013251);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__013254);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6719:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6723:1: ( ( ( '-' )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6724:1: ( ( '-' )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6724:1: ( ( '-' )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6725:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6726:1: ( '-' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==56) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6727:2: '-'
                    {
                    match(input,56,FollowSets000.FOLLOW_56_in_rule__EInt__Group__0__Impl13283); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6738:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6742:1: ( rule__EInt__Group__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6743:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__113316);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6749:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6753:1: ( ( RULE_INT ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6754:1: ( RULE_INT )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6754:1: ( RULE_INT )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6755:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl13343); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6770:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6774:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6775:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__013376);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__013379);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6782:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6786:1: ( ( RULE_ID ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6787:1: ( RULE_ID )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6787:1: ( RULE_ID )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6788:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl13406); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6799:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6803:1: ( rule__QualifiedName__Group__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6804:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__113435);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6810:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6814:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6815:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6815:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6816:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6817:1: ( rule__QualifiedName__Group_1__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==66) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6817:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl13462);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6831:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6835:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6836:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__013497);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__013500);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6843:1: rule__QualifiedName__Group_1__0__Impl : ( '::' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6847:1: ( ( '::' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6848:1: ( '::' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6848:1: ( '::' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6849:1: '::'
            {
             before(grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0()); 
            match(input,66,FollowSets000.FOLLOW_66_in_rule__QualifiedName__Group_1__0__Impl13528); 
             after(grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6862:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6866:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6867:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__113559);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6873:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6877:1: ( ( RULE_ID ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6878:1: ( RULE_ID )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6878:1: ( RULE_ID )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6879:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl13586); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithDot__Group__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6894:1: rule__QualifiedNameWithDot__Group__0 : rule__QualifiedNameWithDot__Group__0__Impl rule__QualifiedNameWithDot__Group__1 ;
    public final void rule__QualifiedNameWithDot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6898:1: ( rule__QualifiedNameWithDot__Group__0__Impl rule__QualifiedNameWithDot__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6899:2: rule__QualifiedNameWithDot__Group__0__Impl rule__QualifiedNameWithDot__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedNameWithDot__Group__0__Impl_in_rule__QualifiedNameWithDot__Group__013619);
            rule__QualifiedNameWithDot__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QualifiedNameWithDot__Group__1_in_rule__QualifiedNameWithDot__Group__013622);
            rule__QualifiedNameWithDot__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithDot__Group__0"


    // $ANTLR start "rule__QualifiedNameWithDot__Group__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6906:1: rule__QualifiedNameWithDot__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithDot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6910:1: ( ( ruleQualifiedName ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6911:1: ( ruleQualifiedName )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6911:1: ( ruleQualifiedName )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6912:1: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithDotAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithDot__Group__0__Impl13649);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithDotAccess().getQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithDot__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithDot__Group__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6923:1: rule__QualifiedNameWithDot__Group__1 : rule__QualifiedNameWithDot__Group__1__Impl ;
    public final void rule__QualifiedNameWithDot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6927:1: ( rule__QualifiedNameWithDot__Group__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6928:2: rule__QualifiedNameWithDot__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedNameWithDot__Group__1__Impl_in_rule__QualifiedNameWithDot__Group__113678);
            rule__QualifiedNameWithDot__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithDot__Group__1"


    // $ANTLR start "rule__QualifiedNameWithDot__Group__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6934:1: rule__QualifiedNameWithDot__Group__1__Impl : ( ( rule__QualifiedNameWithDot__Group_1__0 )* ) ;
    public final void rule__QualifiedNameWithDot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6938:1: ( ( ( rule__QualifiedNameWithDot__Group_1__0 )* ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6939:1: ( ( rule__QualifiedNameWithDot__Group_1__0 )* )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6939:1: ( ( rule__QualifiedNameWithDot__Group_1__0 )* )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6940:1: ( rule__QualifiedNameWithDot__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameWithDotAccess().getGroup_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6941:1: ( rule__QualifiedNameWithDot__Group_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==65) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6941:2: rule__QualifiedNameWithDot__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QualifiedNameWithDot__Group_1__0_in_rule__QualifiedNameWithDot__Group__1__Impl13705);
            	    rule__QualifiedNameWithDot__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameWithDotAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithDot__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithDot__Group_1__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6955:1: rule__QualifiedNameWithDot__Group_1__0 : rule__QualifiedNameWithDot__Group_1__0__Impl rule__QualifiedNameWithDot__Group_1__1 ;
    public final void rule__QualifiedNameWithDot__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6959:1: ( rule__QualifiedNameWithDot__Group_1__0__Impl rule__QualifiedNameWithDot__Group_1__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6960:2: rule__QualifiedNameWithDot__Group_1__0__Impl rule__QualifiedNameWithDot__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedNameWithDot__Group_1__0__Impl_in_rule__QualifiedNameWithDot__Group_1__013740);
            rule__QualifiedNameWithDot__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QualifiedNameWithDot__Group_1__1_in_rule__QualifiedNameWithDot__Group_1__013743);
            rule__QualifiedNameWithDot__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithDot__Group_1__0"


    // $ANTLR start "rule__QualifiedNameWithDot__Group_1__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6967:1: rule__QualifiedNameWithDot__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithDot__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6971:1: ( ( '.' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6972:1: ( '.' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6972:1: ( '.' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6973:1: '.'
            {
             before(grammarAccess.getQualifiedNameWithDotAccess().getFullStopKeyword_1_0()); 
            match(input,65,FollowSets000.FOLLOW_65_in_rule__QualifiedNameWithDot__Group_1__0__Impl13771); 
             after(grammarAccess.getQualifiedNameWithDotAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithDot__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithDot__Group_1__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6986:1: rule__QualifiedNameWithDot__Group_1__1 : rule__QualifiedNameWithDot__Group_1__1__Impl ;
    public final void rule__QualifiedNameWithDot__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6990:1: ( rule__QualifiedNameWithDot__Group_1__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6991:2: rule__QualifiedNameWithDot__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedNameWithDot__Group_1__1__Impl_in_rule__QualifiedNameWithDot__Group_1__113802);
            rule__QualifiedNameWithDot__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithDot__Group_1__1"


    // $ANTLR start "rule__QualifiedNameWithDot__Group_1__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6997:1: rule__QualifiedNameWithDot__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedNameWithDot__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7001:1: ( ( RULE_ID ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7002:1: ( RULE_ID )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7002:1: ( RULE_ID )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7003:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameWithDotAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QualifiedNameWithDot__Group_1__1__Impl13829); 
             after(grammarAccess.getQualifiedNameWithDotAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithDot__Group_1__1__Impl"


    // $ANTLR start "rule__Package__NameAssignment_2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7019:1: rule__Package__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Package__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7023:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7024:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7024:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7025:1: ruleEString
            {
             before(grammarAccess.getPackageAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Package__NameAssignment_213867);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__NameAssignment_2"


    // $ANTLR start "rule__Package__TaskContextsAssignment_4_2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7034:1: rule__Package__TaskContextsAssignment_4_2 : ( ruleTaskContext ) ;
    public final void rule__Package__TaskContextsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7038:1: ( ( ruleTaskContext ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7039:1: ( ruleTaskContext )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7039:1: ( ruleTaskContext )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7040:1: ruleTaskContext
            {
             before(grammarAccess.getPackageAccess().getTaskContextsTaskContextParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTaskContext_in_rule__Package__TaskContextsAssignment_4_213898);
            ruleTaskContext();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getTaskContextsTaskContextParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__TaskContextsAssignment_4_2"


    // $ANTLR start "rule__Package__TaskContextsAssignment_4_3_1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7049:1: rule__Package__TaskContextsAssignment_4_3_1 : ( ruleTaskContext ) ;
    public final void rule__Package__TaskContextsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7053:1: ( ( ruleTaskContext ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7054:1: ( ruleTaskContext )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7054:1: ( ruleTaskContext )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7055:1: ruleTaskContext
            {
             before(grammarAccess.getPackageAccess().getTaskContextsTaskContextParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTaskContext_in_rule__Package__TaskContextsAssignment_4_3_113929);
            ruleTaskContext();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getTaskContextsTaskContextParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__TaskContextsAssignment_4_3_1"


    // $ANTLR start "rule__Package__ConnectionPoliciesAssignment_5_2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7064:1: rule__Package__ConnectionPoliciesAssignment_5_2 : ( ruleConnectionPolicy ) ;
    public final void rule__Package__ConnectionPoliciesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7068:1: ( ( ruleConnectionPolicy ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7069:1: ( ruleConnectionPolicy )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7069:1: ( ruleConnectionPolicy )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7070:1: ruleConnectionPolicy
            {
             before(grammarAccess.getPackageAccess().getConnectionPoliciesConnectionPolicyParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConnectionPolicy_in_rule__Package__ConnectionPoliciesAssignment_5_213960);
            ruleConnectionPolicy();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getConnectionPoliciesConnectionPolicyParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__ConnectionPoliciesAssignment_5_2"


    // $ANTLR start "rule__Package__ConnectionPoliciesAssignment_5_3_1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7079:1: rule__Package__ConnectionPoliciesAssignment_5_3_1 : ( ruleConnectionPolicy ) ;
    public final void rule__Package__ConnectionPoliciesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7083:1: ( ( ruleConnectionPolicy ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7084:1: ( ruleConnectionPolicy )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7084:1: ( ruleConnectionPolicy )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7085:1: ruleConnectionPolicy
            {
             before(grammarAccess.getPackageAccess().getConnectionPoliciesConnectionPolicyParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConnectionPolicy_in_rule__Package__ConnectionPoliciesAssignment_5_3_113991);
            ruleConnectionPolicy();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getConnectionPoliciesConnectionPolicyParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__ConnectionPoliciesAssignment_5_3_1"


    // $ANTLR start "rule__Package__PeerGroupsAssignment_6_2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7094:1: rule__Package__PeerGroupsAssignment_6_2 : ( rulePeerGroup ) ;
    public final void rule__Package__PeerGroupsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7098:1: ( ( rulePeerGroup ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7099:1: ( rulePeerGroup )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7099:1: ( rulePeerGroup )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7100:1: rulePeerGroup
            {
             before(grammarAccess.getPackageAccess().getPeerGroupsPeerGroupParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePeerGroup_in_rule__Package__PeerGroupsAssignment_6_214022);
            rulePeerGroup();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getPeerGroupsPeerGroupParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__PeerGroupsAssignment_6_2"


    // $ANTLR start "rule__Package__PeerGroupsAssignment_6_3_1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7109:1: rule__Package__PeerGroupsAssignment_6_3_1 : ( rulePeerGroup ) ;
    public final void rule__Package__PeerGroupsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7113:1: ( ( rulePeerGroup ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7114:1: ( rulePeerGroup )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7114:1: ( rulePeerGroup )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7115:1: rulePeerGroup
            {
             before(grammarAccess.getPackageAccess().getPeerGroupsPeerGroupParserRuleCall_6_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePeerGroup_in_rule__Package__PeerGroupsAssignment_6_3_114053);
            rulePeerGroup();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getPeerGroupsPeerGroupParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__PeerGroupsAssignment_6_3_1"


    // $ANTLR start "rule__TaskContext__NameAssignment_1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7124:1: rule__TaskContext__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TaskContext__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7128:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7129:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7129:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7130:1: ruleEString
            {
             before(grammarAccess.getTaskContextAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TaskContext__NameAssignment_114084);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTaskContextAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__NameAssignment_1"


    // $ANTLR start "rule__TaskContext__NamespaceAssignment_4"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7139:1: rule__TaskContext__NamespaceAssignment_4 : ( ruleQualifiedNameWithDot ) ;
    public final void rule__TaskContext__NamespaceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7143:1: ( ( ruleQualifiedNameWithDot ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7144:1: ( ruleQualifiedNameWithDot )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7144:1: ( ruleQualifiedNameWithDot )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7145:1: ruleQualifiedNameWithDot
            {
             before(grammarAccess.getTaskContextAccess().getNamespaceQualifiedNameWithDotParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_rule__TaskContext__NamespaceAssignment_414115);
            ruleQualifiedNameWithDot();

            state._fsp--;

             after(grammarAccess.getTaskContextAccess().getNamespaceQualifiedNameWithDotParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__NamespaceAssignment_4"


    // $ANTLR start "rule__TaskContext__TypeAssignment_6"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7154:1: rule__TaskContext__TypeAssignment_6 : ( ruleQualifiedNameWithDot ) ;
    public final void rule__TaskContext__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7158:1: ( ( ruleQualifiedNameWithDot ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7159:1: ( ruleQualifiedNameWithDot )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7159:1: ( ruleQualifiedNameWithDot )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7160:1: ruleQualifiedNameWithDot
            {
             before(grammarAccess.getTaskContextAccess().getTypeQualifiedNameWithDotParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_rule__TaskContext__TypeAssignment_614146);
            ruleQualifiedNameWithDot();

            state._fsp--;

             after(grammarAccess.getTaskContextAccess().getTypeQualifiedNameWithDotParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__TypeAssignment_6"


    // $ANTLR start "rule__TaskContext__ActivityAssignment_8"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7169:1: rule__TaskContext__ActivityAssignment_8 : ( ruleActivity ) ;
    public final void rule__TaskContext__ActivityAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7173:1: ( ( ruleActivity ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7174:1: ( ruleActivity )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7174:1: ( ruleActivity )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7175:1: ruleActivity
            {
             before(grammarAccess.getTaskContextAccess().getActivityActivityParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleActivity_in_rule__TaskContext__ActivityAssignment_814177);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getTaskContextAccess().getActivityActivityParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__ActivityAssignment_8"


    // $ANTLR start "rule__TaskContext__InputPortsAssignment_9_2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7184:1: rule__TaskContext__InputPortsAssignment_9_2 : ( ruleInputPort ) ;
    public final void rule__TaskContext__InputPortsAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7188:1: ( ( ruleInputPort ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7189:1: ( ruleInputPort )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7189:1: ( ruleInputPort )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7190:1: ruleInputPort
            {
             before(grammarAccess.getTaskContextAccess().getInputPortsInputPortParserRuleCall_9_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputPort_in_rule__TaskContext__InputPortsAssignment_9_214208);
            ruleInputPort();

            state._fsp--;

             after(grammarAccess.getTaskContextAccess().getInputPortsInputPortParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__InputPortsAssignment_9_2"


    // $ANTLR start "rule__TaskContext__InputPortsAssignment_9_3_1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7199:1: rule__TaskContext__InputPortsAssignment_9_3_1 : ( ruleInputPort ) ;
    public final void rule__TaskContext__InputPortsAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7203:1: ( ( ruleInputPort ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7204:1: ( ruleInputPort )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7204:1: ( ruleInputPort )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7205:1: ruleInputPort
            {
             before(grammarAccess.getTaskContextAccess().getInputPortsInputPortParserRuleCall_9_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputPort_in_rule__TaskContext__InputPortsAssignment_9_3_114239);
            ruleInputPort();

            state._fsp--;

             after(grammarAccess.getTaskContextAccess().getInputPortsInputPortParserRuleCall_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__InputPortsAssignment_9_3_1"


    // $ANTLR start "rule__TaskContext__OutputPortsAssignment_10_2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7214:1: rule__TaskContext__OutputPortsAssignment_10_2 : ( ruleOutputPort ) ;
    public final void rule__TaskContext__OutputPortsAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7218:1: ( ( ruleOutputPort ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7219:1: ( ruleOutputPort )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7219:1: ( ruleOutputPort )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7220:1: ruleOutputPort
            {
             before(grammarAccess.getTaskContextAccess().getOutputPortsOutputPortParserRuleCall_10_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOutputPort_in_rule__TaskContext__OutputPortsAssignment_10_214270);
            ruleOutputPort();

            state._fsp--;

             after(grammarAccess.getTaskContextAccess().getOutputPortsOutputPortParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__OutputPortsAssignment_10_2"


    // $ANTLR start "rule__TaskContext__OutputPortsAssignment_10_3_1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7229:1: rule__TaskContext__OutputPortsAssignment_10_3_1 : ( ruleOutputPort ) ;
    public final void rule__TaskContext__OutputPortsAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7233:1: ( ( ruleOutputPort ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7234:1: ( ruleOutputPort )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7234:1: ( ruleOutputPort )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7235:1: ruleOutputPort
            {
             before(grammarAccess.getTaskContextAccess().getOutputPortsOutputPortParserRuleCall_10_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOutputPort_in_rule__TaskContext__OutputPortsAssignment_10_3_114301);
            ruleOutputPort();

            state._fsp--;

             after(grammarAccess.getTaskContextAccess().getOutputPortsOutputPortParserRuleCall_10_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__OutputPortsAssignment_10_3_1"


    // $ANTLR start "rule__TaskContext__PropertiesAssignment_11_2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7244:1: rule__TaskContext__PropertiesAssignment_11_2 : ( ruleProperty ) ;
    public final void rule__TaskContext__PropertiesAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7248:1: ( ( ruleProperty ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7249:1: ( ruleProperty )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7249:1: ( ruleProperty )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7250:1: ruleProperty
            {
             before(grammarAccess.getTaskContextAccess().getPropertiesPropertyParserRuleCall_11_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_rule__TaskContext__PropertiesAssignment_11_214332);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getTaskContextAccess().getPropertiesPropertyParserRuleCall_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__PropertiesAssignment_11_2"


    // $ANTLR start "rule__TaskContext__PropertiesAssignment_11_3_1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7259:1: rule__TaskContext__PropertiesAssignment_11_3_1 : ( ruleProperty ) ;
    public final void rule__TaskContext__PropertiesAssignment_11_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7263:1: ( ( ruleProperty ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7264:1: ( ruleProperty )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7264:1: ( ruleProperty )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7265:1: ruleProperty
            {
             before(grammarAccess.getTaskContextAccess().getPropertiesPropertyParserRuleCall_11_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_rule__TaskContext__PropertiesAssignment_11_3_114363);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getTaskContextAccess().getPropertiesPropertyParserRuleCall_11_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__PropertiesAssignment_11_3_1"


    // $ANTLR start "rule__TaskContext__OperationsAssignment_12_2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7274:1: rule__TaskContext__OperationsAssignment_12_2 : ( ruleOperation ) ;
    public final void rule__TaskContext__OperationsAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7278:1: ( ( ruleOperation ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7279:1: ( ruleOperation )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7279:1: ( ruleOperation )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7280:1: ruleOperation
            {
             before(grammarAccess.getTaskContextAccess().getOperationsOperationParserRuleCall_12_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_rule__TaskContext__OperationsAssignment_12_214394);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getTaskContextAccess().getOperationsOperationParserRuleCall_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__OperationsAssignment_12_2"


    // $ANTLR start "rule__TaskContext__OperationsAssignment_12_3_1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7289:1: rule__TaskContext__OperationsAssignment_12_3_1 : ( ruleOperation ) ;
    public final void rule__TaskContext__OperationsAssignment_12_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7293:1: ( ( ruleOperation ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7294:1: ( ruleOperation )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7294:1: ( ruleOperation )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7295:1: ruleOperation
            {
             before(grammarAccess.getTaskContextAccess().getOperationsOperationParserRuleCall_12_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_rule__TaskContext__OperationsAssignment_12_3_114425);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getTaskContextAccess().getOperationsOperationParserRuleCall_12_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__OperationsAssignment_12_3_1"


    // $ANTLR start "rule__PeerGroup__NameAssignment_1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7304:1: rule__PeerGroup__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__PeerGroup__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7308:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7309:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7309:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7310:1: ruleEString
            {
             before(grammarAccess.getPeerGroupAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__PeerGroup__NameAssignment_114456);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPeerGroupAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeerGroup__NameAssignment_1"


    // $ANTLR start "rule__PeerGroup__CoordinatorAssignment_4"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7319:1: rule__PeerGroup__CoordinatorAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__PeerGroup__CoordinatorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7323:1: ( ( ( ruleEString ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7324:1: ( ( ruleEString ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7324:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7325:1: ( ruleEString )
            {
             before(grammarAccess.getPeerGroupAccess().getCoordinatorTaskContextCrossReference_4_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7326:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7327:1: ruleEString
            {
             before(grammarAccess.getPeerGroupAccess().getCoordinatorTaskContextEStringParserRuleCall_4_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__PeerGroup__CoordinatorAssignment_414491);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPeerGroupAccess().getCoordinatorTaskContextEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getPeerGroupAccess().getCoordinatorTaskContextCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeerGroup__CoordinatorAssignment_4"


    // $ANTLR start "rule__PeerGroup__MembersAssignment_5_2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7338:1: rule__PeerGroup__MembersAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__PeerGroup__MembersAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7342:1: ( ( ( ruleEString ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7343:1: ( ( ruleEString ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7343:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7344:1: ( ruleEString )
            {
             before(grammarAccess.getPeerGroupAccess().getMembersTaskContextCrossReference_5_2_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7345:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7346:1: ruleEString
            {
             before(grammarAccess.getPeerGroupAccess().getMembersTaskContextEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__PeerGroup__MembersAssignment_5_214530);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPeerGroupAccess().getMembersTaskContextEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getPeerGroupAccess().getMembersTaskContextCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeerGroup__MembersAssignment_5_2"


    // $ANTLR start "rule__PeerGroup__MembersAssignment_5_3_1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7357:1: rule__PeerGroup__MembersAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__PeerGroup__MembersAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7361:1: ( ( ( ruleEString ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7362:1: ( ( ruleEString ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7362:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7363:1: ( ruleEString )
            {
             before(grammarAccess.getPeerGroupAccess().getMembersTaskContextCrossReference_5_3_1_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7364:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7365:1: ruleEString
            {
             before(grammarAccess.getPeerGroupAccess().getMembersTaskContextEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__PeerGroup__MembersAssignment_5_3_114569);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPeerGroupAccess().getMembersTaskContextEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getPeerGroupAccess().getMembersTaskContextCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeerGroup__MembersAssignment_5_3_1"


    // $ANTLR start "rule__ConnectionPolicy__NameAssignment_1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7376:1: rule__ConnectionPolicy__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ConnectionPolicy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7380:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7381:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7381:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7382:1: ruleEString
            {
             before(grammarAccess.getConnectionPolicyAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ConnectionPolicy__NameAssignment_114604);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConnectionPolicyAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__NameAssignment_1"


    // $ANTLR start "rule__ConnectionPolicy__BufferSizeAssignment_3_1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7391:1: rule__ConnectionPolicy__BufferSizeAssignment_3_1 : ( ruleEShort ) ;
    public final void rule__ConnectionPolicy__BufferSizeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7395:1: ( ( ruleEShort ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7396:1: ( ruleEShort )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7396:1: ( ruleEShort )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7397:1: ruleEShort
            {
             before(grammarAccess.getConnectionPolicyAccess().getBufferSizeEShortParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEShort_in_rule__ConnectionPolicy__BufferSizeAssignment_3_114635);
            ruleEShort();

            state._fsp--;

             after(grammarAccess.getConnectionPolicyAccess().getBufferSizeEShortParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__BufferSizeAssignment_3_1"


    // $ANTLR start "rule__ConnectionPolicy__LockPolicyAssignment_4_1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7406:1: rule__ConnectionPolicy__LockPolicyAssignment_4_1 : ( ruleConnectionPolicyLockPolicy ) ;
    public final void rule__ConnectionPolicy__LockPolicyAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7410:1: ( ( ruleConnectionPolicyLockPolicy ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7411:1: ( ruleConnectionPolicyLockPolicy )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7411:1: ( ruleConnectionPolicyLockPolicy )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7412:1: ruleConnectionPolicyLockPolicy
            {
             before(grammarAccess.getConnectionPolicyAccess().getLockPolicyConnectionPolicyLockPolicyEnumRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConnectionPolicyLockPolicy_in_rule__ConnectionPolicy__LockPolicyAssignment_4_114666);
            ruleConnectionPolicyLockPolicy();

            state._fsp--;

             after(grammarAccess.getConnectionPolicyAccess().getLockPolicyConnectionPolicyLockPolicyEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__LockPolicyAssignment_4_1"


    // $ANTLR start "rule__ConnectionPolicy__TypeAssignment_5_1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7421:1: rule__ConnectionPolicy__TypeAssignment_5_1 : ( ruleConnectionPolicyType ) ;
    public final void rule__ConnectionPolicy__TypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7425:1: ( ( ruleConnectionPolicyType ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7426:1: ( ruleConnectionPolicyType )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7426:1: ( ruleConnectionPolicyType )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7427:1: ruleConnectionPolicyType
            {
             before(grammarAccess.getConnectionPolicyAccess().getTypeConnectionPolicyTypeEnumRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConnectionPolicyType_in_rule__ConnectionPolicy__TypeAssignment_5_114697);
            ruleConnectionPolicyType();

            state._fsp--;

             after(grammarAccess.getConnectionPolicyAccess().getTypeConnectionPolicyTypeEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__TypeAssignment_5_1"


    // $ANTLR start "rule__ConnectionPolicy__InputPortAssignment_7"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7436:1: rule__ConnectionPolicy__InputPortAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__ConnectionPolicy__InputPortAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7440:1: ( ( ( ruleEString ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7441:1: ( ( ruleEString ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7441:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7442:1: ( ruleEString )
            {
             before(grammarAccess.getConnectionPolicyAccess().getInputPortInputPortCrossReference_7_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7443:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7444:1: ruleEString
            {
             before(grammarAccess.getConnectionPolicyAccess().getInputPortInputPortEStringParserRuleCall_7_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ConnectionPolicy__InputPortAssignment_714732);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConnectionPolicyAccess().getInputPortInputPortEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getConnectionPolicyAccess().getInputPortInputPortCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__InputPortAssignment_7"


    // $ANTLR start "rule__ConnectionPolicy__OutputPortAssignment_9"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7455:1: rule__ConnectionPolicy__OutputPortAssignment_9 : ( ( ruleEString ) ) ;
    public final void rule__ConnectionPolicy__OutputPortAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7459:1: ( ( ( ruleEString ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7460:1: ( ( ruleEString ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7460:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7461:1: ( ruleEString )
            {
             before(grammarAccess.getConnectionPolicyAccess().getOutputPortOutputPortCrossReference_9_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7462:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7463:1: ruleEString
            {
             before(grammarAccess.getConnectionPolicyAccess().getOutputPortOutputPortEStringParserRuleCall_9_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ConnectionPolicy__OutputPortAssignment_914771);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConnectionPolicyAccess().getOutputPortOutputPortEStringParserRuleCall_9_0_1()); 

            }

             after(grammarAccess.getConnectionPolicyAccess().getOutputPortOutputPortCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionPolicy__OutputPortAssignment_9"


    // $ANTLR start "rule__InputPort__IsEventPortAssignment_0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7474:1: rule__InputPort__IsEventPortAssignment_0 : ( ( 'isEventPort' ) ) ;
    public final void rule__InputPort__IsEventPortAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7478:1: ( ( ( 'isEventPort' ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7479:1: ( ( 'isEventPort' ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7479:1: ( ( 'isEventPort' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7480:1: ( 'isEventPort' )
            {
             before(grammarAccess.getInputPortAccess().getIsEventPortIsEventPortKeyword_0_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7481:1: ( 'isEventPort' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7482:1: 'isEventPort'
            {
             before(grammarAccess.getInputPortAccess().getIsEventPortIsEventPortKeyword_0_0()); 
            match(input,67,FollowSets000.FOLLOW_67_in_rule__InputPort__IsEventPortAssignment_014811); 
             after(grammarAccess.getInputPortAccess().getIsEventPortIsEventPortKeyword_0_0()); 

            }

             after(grammarAccess.getInputPortAccess().getIsEventPortIsEventPortKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__IsEventPortAssignment_0"


    // $ANTLR start "rule__InputPort__NameAssignment_2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7497:1: rule__InputPort__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__InputPort__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7501:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7502:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7502:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7503:1: ruleEString
            {
             before(grammarAccess.getInputPortAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputPort__NameAssignment_214850);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputPortAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__NameAssignment_2"


    // $ANTLR start "rule__InputPort__DataTypeAssignment_4_1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7512:1: rule__InputPort__DataTypeAssignment_4_1 : ( ( ruleQualifiedNameWithDot ) ) ;
    public final void rule__InputPort__DataTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7516:1: ( ( ( ruleQualifiedNameWithDot ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7517:1: ( ( ruleQualifiedNameWithDot ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7517:1: ( ( ruleQualifiedNameWithDot ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7518:1: ( ruleQualifiedNameWithDot )
            {
             before(grammarAccess.getInputPortAccess().getDataTypeDataTypeCrossReference_4_1_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7519:1: ( ruleQualifiedNameWithDot )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7520:1: ruleQualifiedNameWithDot
            {
             before(grammarAccess.getInputPortAccess().getDataTypeDataTypeQualifiedNameWithDotParserRuleCall_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_rule__InputPort__DataTypeAssignment_4_114885);
            ruleQualifiedNameWithDot();

            state._fsp--;

             after(grammarAccess.getInputPortAccess().getDataTypeDataTypeQualifiedNameWithDotParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getInputPortAccess().getDataTypeDataTypeCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__DataTypeAssignment_4_1"


    // $ANTLR start "rule__InputPort__InputConnectionPolicyAssignment_5_1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7531:1: rule__InputPort__InputConnectionPolicyAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__InputPort__InputConnectionPolicyAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7535:1: ( ( ( ruleEString ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7536:1: ( ( ruleEString ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7536:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7537:1: ( ruleEString )
            {
             before(grammarAccess.getInputPortAccess().getInputConnectionPolicyConnectionPolicyCrossReference_5_1_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7538:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7539:1: ruleEString
            {
             before(grammarAccess.getInputPortAccess().getInputConnectionPolicyConnectionPolicyEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputPort__InputConnectionPolicyAssignment_5_114924);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputPortAccess().getInputConnectionPolicyConnectionPolicyEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getInputPortAccess().getInputConnectionPolicyConnectionPolicyCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__InputConnectionPolicyAssignment_5_1"


    // $ANTLR start "rule__OutputPort__NameAssignment_1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7550:1: rule__OutputPort__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__OutputPort__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7554:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7555:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7555:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7556:1: ruleEString
            {
             before(grammarAccess.getOutputPortAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OutputPort__NameAssignment_114959);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOutputPortAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__NameAssignment_1"


    // $ANTLR start "rule__OutputPort__DataTypeAssignment_3_1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7565:1: rule__OutputPort__DataTypeAssignment_3_1 : ( ( ruleQualifiedNameWithDot ) ) ;
    public final void rule__OutputPort__DataTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7569:1: ( ( ( ruleQualifiedNameWithDot ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7570:1: ( ( ruleQualifiedNameWithDot ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7570:1: ( ( ruleQualifiedNameWithDot ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7571:1: ( ruleQualifiedNameWithDot )
            {
             before(grammarAccess.getOutputPortAccess().getDataTypeDataTypeCrossReference_3_1_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7572:1: ( ruleQualifiedNameWithDot )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7573:1: ruleQualifiedNameWithDot
            {
             before(grammarAccess.getOutputPortAccess().getDataTypeDataTypeQualifiedNameWithDotParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_rule__OutputPort__DataTypeAssignment_3_114994);
            ruleQualifiedNameWithDot();

            state._fsp--;

             after(grammarAccess.getOutputPortAccess().getDataTypeDataTypeQualifiedNameWithDotParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getOutputPortAccess().getDataTypeDataTypeCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__DataTypeAssignment_3_1"


    // $ANTLR start "rule__OutputPort__OutputConnectionPolicyAssignment_4_1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7584:1: rule__OutputPort__OutputConnectionPolicyAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__OutputPort__OutputConnectionPolicyAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7588:1: ( ( ( ruleEString ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7589:1: ( ( ruleEString ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7589:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7590:1: ( ruleEString )
            {
             before(grammarAccess.getOutputPortAccess().getOutputConnectionPolicyConnectionPolicyCrossReference_4_1_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7591:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7592:1: ruleEString
            {
             before(grammarAccess.getOutputPortAccess().getOutputConnectionPolicyConnectionPolicyEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OutputPort__OutputConnectionPolicyAssignment_4_115033);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOutputPortAccess().getOutputConnectionPolicyConnectionPolicyEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getOutputPortAccess().getOutputConnectionPolicyConnectionPolicyCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__OutputConnectionPolicyAssignment_4_1"


    // $ANTLR start "rule__Property__NameAssignment_2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7603:1: rule__Property__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Property__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7607:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7608:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7608:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7609:1: ruleEString
            {
             before(grammarAccess.getPropertyAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Property__NameAssignment_215068);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__NameAssignment_2"


    // $ANTLR start "rule__Property__DescriptionAssignment_4_1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7618:1: rule__Property__DescriptionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Property__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7622:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7623:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7623:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7624:1: ruleEString
            {
             before(grammarAccess.getPropertyAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Property__DescriptionAssignment_4_115099);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getDescriptionEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__DescriptionAssignment_4_1"


    // $ANTLR start "rule__Property__ValueAssignment_5_1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7633:1: rule__Property__ValueAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Property__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7637:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7638:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7638:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7639:1: ruleEString
            {
             before(grammarAccess.getPropertyAccess().getValueEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Property__ValueAssignment_5_115130);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getValueEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__ValueAssignment_5_1"


    // $ANTLR start "rule__Property__TypeAssignment_6_1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7648:1: rule__Property__TypeAssignment_6_1 : ( ( ruleQualifiedNameWithDot ) ) ;
    public final void rule__Property__TypeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7652:1: ( ( ( ruleQualifiedNameWithDot ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7653:1: ( ( ruleQualifiedNameWithDot ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7653:1: ( ( ruleQualifiedNameWithDot ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7654:1: ( ruleQualifiedNameWithDot )
            {
             before(grammarAccess.getPropertyAccess().getTypeDataTypeCrossReference_6_1_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7655:1: ( ruleQualifiedNameWithDot )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7656:1: ruleQualifiedNameWithDot
            {
             before(grammarAccess.getPropertyAccess().getTypeDataTypeQualifiedNameWithDotParserRuleCall_6_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_rule__Property__TypeAssignment_6_115165);
            ruleQualifiedNameWithDot();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getTypeDataTypeQualifiedNameWithDotParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getPropertyAccess().getTypeDataTypeCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__TypeAssignment_6_1"


    // $ANTLR start "rule__Operation__NameAssignment_2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7667:1: rule__Operation__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Operation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7671:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7672:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7672:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7673:1: ruleEString
            {
             before(grammarAccess.getOperationAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Operation__NameAssignment_215200);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__NameAssignment_2"


    // $ANTLR start "rule__Operation__DocumentationAssignment_4_1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7682:1: rule__Operation__DocumentationAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Operation__DocumentationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7686:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7687:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7687:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7688:1: ruleEString
            {
             before(grammarAccess.getOperationAccess().getDocumentationEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Operation__DocumentationAssignment_4_115231);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getDocumentationEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__DocumentationAssignment_4_1"


    // $ANTLR start "rule__Operation__ReturnTypeAssignment_5_1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7697:1: rule__Operation__ReturnTypeAssignment_5_1 : ( ( ruleQualifiedNameWithDot ) ) ;
    public final void rule__Operation__ReturnTypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7701:1: ( ( ( ruleQualifiedNameWithDot ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7702:1: ( ( ruleQualifiedNameWithDot ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7702:1: ( ( ruleQualifiedNameWithDot ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7703:1: ( ruleQualifiedNameWithDot )
            {
             before(grammarAccess.getOperationAccess().getReturnTypeDataTypeCrossReference_5_1_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7704:1: ( ruleQualifiedNameWithDot )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7705:1: ruleQualifiedNameWithDot
            {
             before(grammarAccess.getOperationAccess().getReturnTypeDataTypeQualifiedNameWithDotParserRuleCall_5_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_rule__Operation__ReturnTypeAssignment_5_115266);
            ruleQualifiedNameWithDot();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getReturnTypeDataTypeQualifiedNameWithDotParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getOperationAccess().getReturnTypeDataTypeCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ReturnTypeAssignment_5_1"


    // $ANTLR start "rule__Activity__NameAssignment_1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7716:1: rule__Activity__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Activity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7720:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7721:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7721:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7722:1: ruleEString
            {
             before(grammarAccess.getActivityAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Activity__NameAssignment_115301);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__NameAssignment_1"


    // $ANTLR start "rule__Activity__SchedulerAssignment_4"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7731:1: rule__Activity__SchedulerAssignment_4 : ( ruleScheduler ) ;
    public final void rule__Activity__SchedulerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7735:1: ( ( ruleScheduler ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7736:1: ( ruleScheduler )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7736:1: ( ruleScheduler )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7737:1: ruleScheduler
            {
             before(grammarAccess.getActivityAccess().getSchedulerSchedulerEnumRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleScheduler_in_rule__Activity__SchedulerAssignment_415332);
            ruleScheduler();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getSchedulerSchedulerEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__SchedulerAssignment_4"


    // $ANTLR start "rule__Activity__CpuAffinityAssignment_6"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7746:1: rule__Activity__CpuAffinityAssignment_6 : ( ruleEString ) ;
    public final void rule__Activity__CpuAffinityAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7750:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7751:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7751:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7752:1: ruleEString
            {
             before(grammarAccess.getActivityAccess().getCpuAffinityEStringParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Activity__CpuAffinityAssignment_615363);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getCpuAffinityEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__CpuAffinityAssignment_6"


    // $ANTLR start "rule__Activity__PeriodAssignment_8"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7761:1: rule__Activity__PeriodAssignment_8 : ( ruleEFloat ) ;
    public final void rule__Activity__PeriodAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7765:1: ( ( ruleEFloat ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7766:1: ( ruleEFloat )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7766:1: ( ruleEFloat )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7767:1: ruleEFloat
            {
             before(grammarAccess.getActivityAccess().getPeriodEFloatParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_rule__Activity__PeriodAssignment_815394);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getPeriodEFloatParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__PeriodAssignment_8"


    // $ANTLR start "rule__Activity__PriorityAssignment_10"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7776:1: rule__Activity__PriorityAssignment_10 : ( ruleEInt ) ;
    public final void rule__Activity__PriorityAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7780:1: ( ( ruleEInt ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7781:1: ( ruleEInt )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7781:1: ( ruleEInt )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7782:1: ruleEInt
            {
             before(grammarAccess.getActivityAccess().getPriorityEIntParserRuleCall_10_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Activity__PriorityAssignment_1015425);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getPriorityEIntParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__PriorityAssignment_10"


    // $ANTLR start "rule__Activity__TaskContextAssignment_11_1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7791:1: rule__Activity__TaskContextAssignment_11_1 : ( ( ruleEString ) ) ;
    public final void rule__Activity__TaskContextAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7795:1: ( ( ( ruleEString ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7796:1: ( ( ruleEString ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7796:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7797:1: ( ruleEString )
            {
             before(grammarAccess.getActivityAccess().getTaskContextTaskContextCrossReference_11_1_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7798:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7799:1: ruleEString
            {
             before(grammarAccess.getActivityAccess().getTaskContextTaskContextEStringParserRuleCall_11_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Activity__TaskContextAssignment_11_115460);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getTaskContextTaskContextEStringParserRuleCall_11_1_0_1()); 

            }

             after(grammarAccess.getActivityAccess().getTaskContextTaskContextCrossReference_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__TaskContextAssignment_11_1"


    // $ANTLR start "rule__Activity__SlaveAssignment_12_2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7810:1: rule__Activity__SlaveAssignment_12_2 : ( ruleSlave ) ;
    public final void rule__Activity__SlaveAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7814:1: ( ( ruleSlave ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7815:1: ( ruleSlave )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7815:1: ( ruleSlave )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7816:1: ruleSlave
            {
             before(grammarAccess.getActivityAccess().getSlaveSlaveParserRuleCall_12_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSlave_in_rule__Activity__SlaveAssignment_12_215495);
            ruleSlave();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getSlaveSlaveParserRuleCall_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__SlaveAssignment_12_2"


    // $ANTLR start "rule__Activity__SlaveAssignment_12_3_1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7825:1: rule__Activity__SlaveAssignment_12_3_1 : ( ruleSlave ) ;
    public final void rule__Activity__SlaveAssignment_12_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7829:1: ( ( ruleSlave ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7830:1: ( ruleSlave )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7830:1: ( ruleSlave )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7831:1: ruleSlave
            {
             before(grammarAccess.getActivityAccess().getSlaveSlaveParserRuleCall_12_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSlave_in_rule__Activity__SlaveAssignment_12_3_115526);
            ruleSlave();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getSlaveSlaveParserRuleCall_12_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__SlaveAssignment_12_3_1"


    // $ANTLR start "rule__Slave__NameAssignment_2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7840:1: rule__Slave__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Slave__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7844:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7845:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7845:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7846:1: ruleEString
            {
             before(grammarAccess.getSlaveAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Slave__NameAssignment_215557);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSlaveAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slave__NameAssignment_2"


    // $ANTLR start "rule__Slave__TaskContextAssignment_4_1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7855:1: rule__Slave__TaskContextAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Slave__TaskContextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7859:1: ( ( ( ruleEString ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7860:1: ( ( ruleEString ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7860:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7861:1: ( ruleEString )
            {
             before(grammarAccess.getSlaveAccess().getTaskContextTaskContextCrossReference_4_1_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7862:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7863:1: ruleEString
            {
             before(grammarAccess.getSlaveAccess().getTaskContextTaskContextEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Slave__TaskContextAssignment_4_115592);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSlaveAccess().getTaskContextTaskContextEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getSlaveAccess().getTaskContextTaskContextCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slave__TaskContextAssignment_4_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_rulePackage_in_entryRulePackage61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePackage68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__0_in_rulePackage94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTaskContext_in_entryRuleTaskContext121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTaskContext128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__0_in_ruleTaskContext154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePeerGroup_in_entryRulePeerGroup181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePeerGroup188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group__0_in_rulePeerGroup214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConnectionPolicy_in_entryRuleConnectionPolicy241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConnectionPolicy248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__0_in_ruleConnectionPolicy274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputPort_in_entryRuleInputPort301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputPort308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group__0_in_ruleInputPort334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOutputPort_in_entryRuleOutputPort361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOutputPort368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__0_in_ruleOutputPort394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProperty428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperation488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__0_in_ruleOperation514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEShort_in_entryRuleEShort541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEShort548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EShort__Group__0_in_ruleEShort574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity603 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleActivity610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__0_in_ruleActivity636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSlave_in_entryRuleSlave663 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSlave670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slave__Group__0_in_ruleSlave696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString723 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_entryRuleEFloat783 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEFloat790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__0_in_ruleEFloat816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt843 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName903 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_entryRuleQualifiedNameWithDot963 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithDot970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedNameWithDot__Group__0_in_ruleQualifiedNameWithDot996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicyLockPolicy__Alternatives_in_ruleConnectionPolicyLockPolicy1033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicyType__Alternatives_in_ruleConnectionPolicyType1069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scheduler__Alternatives_in_ruleScheduler1105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__EFloat__Alternatives_4_01191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EFloat__Alternatives_4_01211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__ConnectionPolicyLockPolicy__Alternatives1246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__ConnectionPolicyLockPolicy__Alternatives1267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__ConnectionPolicyLockPolicy__Alternatives1288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__ConnectionPolicyType__Alternatives1324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__ConnectionPolicyType__Alternatives1345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Scheduler__Alternatives1381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Scheduler__Alternatives1402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__01435 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__01438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__11496 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__11499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Package__Group__1__Impl1527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__21558 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Package__Group__3_in_rule__Package__Group__21561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__NameAssignment_2_in_rule__Package__Group__2__Impl1588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__31618 = new BitSet(new long[]{0x0000000006C00000L});
        public static final BitSet FOLLOW_rule__Package__Group__4_in_rule__Package__Group__31621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Package__Group__3__Impl1649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__41680 = new BitSet(new long[]{0x0000000006C00000L});
        public static final BitSet FOLLOW_rule__Package__Group__5_in_rule__Package__Group__41683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__0_in_rule__Package__Group__4__Impl1710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__5__Impl_in_rule__Package__Group__51741 = new BitSet(new long[]{0x0000000006C00000L});
        public static final BitSet FOLLOW_rule__Package__Group__6_in_rule__Package__Group__51744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5__0_in_rule__Package__Group__5__Impl1771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__6__Impl_in_rule__Package__Group__61802 = new BitSet(new long[]{0x0000000006C00000L});
        public static final BitSet FOLLOW_rule__Package__Group__7_in_rule__Package__Group__61805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_6__0_in_rule__Package__Group__6__Impl1832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__7__Impl_in_rule__Package__Group__71863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Package__Group__7__Impl1891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__0__Impl_in_rule__Package__Group_4__01938 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Package__Group_4__1_in_rule__Package__Group_4__01941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Package__Group_4__0__Impl1969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__1__Impl_in_rule__Package__Group_4__12000 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Package__Group_4__2_in_rule__Package__Group_4__12003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Package__Group_4__1__Impl2031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__2__Impl_in_rule__Package__Group_4__22062 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__Package__Group_4__3_in_rule__Package__Group_4__22065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__TaskContextsAssignment_4_2_in_rule__Package__Group_4__2__Impl2092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__3__Impl_in_rule__Package__Group_4__32122 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__Package__Group_4__4_in_rule__Package__Group_4__32125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4_3__0_in_rule__Package__Group_4__3__Impl2152 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__4__Impl_in_rule__Package__Group_4__42183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Package__Group_4__4__Impl2211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4_3__0__Impl_in_rule__Package__Group_4_3__02252 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Package__Group_4_3__1_in_rule__Package__Group_4_3__02255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Package__Group_4_3__0__Impl2283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4_3__1__Impl_in_rule__Package__Group_4_3__12314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__TaskContextsAssignment_4_3_1_in_rule__Package__Group_4_3__1__Impl2341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5__0__Impl_in_rule__Package__Group_5__02375 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Package__Group_5__1_in_rule__Package__Group_5__02378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Package__Group_5__0__Impl2406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5__1__Impl_in_rule__Package__Group_5__12437 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__Package__Group_5__2_in_rule__Package__Group_5__12440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Package__Group_5__1__Impl2468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5__2__Impl_in_rule__Package__Group_5__22499 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__Package__Group_5__3_in_rule__Package__Group_5__22502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__ConnectionPoliciesAssignment_5_2_in_rule__Package__Group_5__2__Impl2529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5__3__Impl_in_rule__Package__Group_5__32559 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__Package__Group_5__4_in_rule__Package__Group_5__32562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5_3__0_in_rule__Package__Group_5__3__Impl2589 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5__4__Impl_in_rule__Package__Group_5__42620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Package__Group_5__4__Impl2648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5_3__0__Impl_in_rule__Package__Group_5_3__02689 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__Package__Group_5_3__1_in_rule__Package__Group_5_3__02692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Package__Group_5_3__0__Impl2720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5_3__1__Impl_in_rule__Package__Group_5_3__12751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__ConnectionPoliciesAssignment_5_3_1_in_rule__Package__Group_5_3__1__Impl2778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_6__0__Impl_in_rule__Package__Group_6__02812 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Package__Group_6__1_in_rule__Package__Group_6__02815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Package__Group_6__0__Impl2843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_6__1__Impl_in_rule__Package__Group_6__12874 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__Package__Group_6__2_in_rule__Package__Group_6__12877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Package__Group_6__1__Impl2905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_6__2__Impl_in_rule__Package__Group_6__22936 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__Package__Group_6__3_in_rule__Package__Group_6__22939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__PeerGroupsAssignment_6_2_in_rule__Package__Group_6__2__Impl2966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_6__3__Impl_in_rule__Package__Group_6__32996 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__Package__Group_6__4_in_rule__Package__Group_6__32999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_6_3__0_in_rule__Package__Group_6__3__Impl3026 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__Package__Group_6__4__Impl_in_rule__Package__Group_6__43057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Package__Group_6__4__Impl3085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_6_3__0__Impl_in_rule__Package__Group_6_3__03126 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__Package__Group_6_3__1_in_rule__Package__Group_6_3__03129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Package__Group_6_3__0__Impl3157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_6_3__1__Impl_in_rule__Package__Group_6_3__13188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__PeerGroupsAssignment_6_3_1_in_rule__Package__Group_6_3__1__Impl3215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__0__Impl_in_rule__TaskContext__Group__03249 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__1_in_rule__TaskContext__Group__03252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__TaskContext__Group__0__Impl3280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__1__Impl_in_rule__TaskContext__Group__13311 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__2_in_rule__TaskContext__Group__13314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__NameAssignment_1_in_rule__TaskContext__Group__1__Impl3341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__2__Impl_in_rule__TaskContext__Group__23371 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__3_in_rule__TaskContext__Group__23374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__TaskContext__Group__2__Impl3402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__3__Impl_in_rule__TaskContext__Group__33433 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__4_in_rule__TaskContext__Group__33436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__TaskContext__Group__3__Impl3464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__4__Impl_in_rule__TaskContext__Group__43495 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__5_in_rule__TaskContext__Group__43498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__NamespaceAssignment_4_in_rule__TaskContext__Group__4__Impl3525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__5__Impl_in_rule__TaskContext__Group__53555 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__6_in_rule__TaskContext__Group__53558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__TaskContext__Group__5__Impl3586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__6__Impl_in_rule__TaskContext__Group__63617 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__7_in_rule__TaskContext__Group__63620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__TypeAssignment_6_in_rule__TaskContext__Group__6__Impl3647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__7__Impl_in_rule__TaskContext__Group__73677 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__8_in_rule__TaskContext__Group__73680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__TaskContext__Group__7__Impl3708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__8__Impl_in_rule__TaskContext__Group__83739 = new BitSet(new long[]{0x0000000780400000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__9_in_rule__TaskContext__Group__83742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__ActivityAssignment_8_in_rule__TaskContext__Group__8__Impl3769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__9__Impl_in_rule__TaskContext__Group__93799 = new BitSet(new long[]{0x0000000780400000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__10_in_rule__TaskContext__Group__93802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9__0_in_rule__TaskContext__Group__9__Impl3829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__10__Impl_in_rule__TaskContext__Group__103860 = new BitSet(new long[]{0x0000000780400000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__11_in_rule__TaskContext__Group__103863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10__0_in_rule__TaskContext__Group__10__Impl3890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__11__Impl_in_rule__TaskContext__Group__113921 = new BitSet(new long[]{0x0000000780400000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__12_in_rule__TaskContext__Group__113924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_11__0_in_rule__TaskContext__Group__11__Impl3951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__12__Impl_in_rule__TaskContext__Group__123982 = new BitSet(new long[]{0x0000000780400000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__13_in_rule__TaskContext__Group__123985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_12__0_in_rule__TaskContext__Group__12__Impl4012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__13__Impl_in_rule__TaskContext__Group__134043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__TaskContext__Group__13__Impl4071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9__0__Impl_in_rule__TaskContext__Group_9__04130 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9__1_in_rule__TaskContext__Group_9__04133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__TaskContext__Group_9__0__Impl4161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9__1__Impl_in_rule__TaskContext__Group_9__14192 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9__2_in_rule__TaskContext__Group_9__14195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__TaskContext__Group_9__1__Impl4223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9__2__Impl_in_rule__TaskContext__Group_9__24254 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9__3_in_rule__TaskContext__Group_9__24257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__InputPortsAssignment_9_2_in_rule__TaskContext__Group_9__2__Impl4284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9__3__Impl_in_rule__TaskContext__Group_9__34314 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9__4_in_rule__TaskContext__Group_9__34317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9_3__0_in_rule__TaskContext__Group_9__3__Impl4344 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9__4__Impl_in_rule__TaskContext__Group_9__44375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__TaskContext__Group_9__4__Impl4403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9_3__0__Impl_in_rule__TaskContext__Group_9_3__04444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9_3__1_in_rule__TaskContext__Group_9_3__04447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__TaskContext__Group_9_3__0__Impl4475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9_3__1__Impl_in_rule__TaskContext__Group_9_3__14506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__InputPortsAssignment_9_3_1_in_rule__TaskContext__Group_9_3__1__Impl4533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10__0__Impl_in_rule__TaskContext__Group_10__04567 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10__1_in_rule__TaskContext__Group_10__04570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__TaskContext__Group_10__0__Impl4598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10__1__Impl_in_rule__TaskContext__Group_10__14629 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10__2_in_rule__TaskContext__Group_10__14632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__TaskContext__Group_10__1__Impl4660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10__2__Impl_in_rule__TaskContext__Group_10__24691 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10__3_in_rule__TaskContext__Group_10__24694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__OutputPortsAssignment_10_2_in_rule__TaskContext__Group_10__2__Impl4721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10__3__Impl_in_rule__TaskContext__Group_10__34751 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10__4_in_rule__TaskContext__Group_10__34754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10_3__0_in_rule__TaskContext__Group_10__3__Impl4781 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10__4__Impl_in_rule__TaskContext__Group_10__44812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__TaskContext__Group_10__4__Impl4840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10_3__0__Impl_in_rule__TaskContext__Group_10_3__04881 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10_3__1_in_rule__TaskContext__Group_10_3__04884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__TaskContext__Group_10_3__0__Impl4912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10_3__1__Impl_in_rule__TaskContext__Group_10_3__14943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__OutputPortsAssignment_10_3_1_in_rule__TaskContext__Group_10_3__1__Impl4970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_11__0__Impl_in_rule__TaskContext__Group_11__05004 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_11__1_in_rule__TaskContext__Group_11__05007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__TaskContext__Group_11__0__Impl5035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_11__1__Impl_in_rule__TaskContext__Group_11__15066 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_11__2_in_rule__TaskContext__Group_11__15069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__TaskContext__Group_11__1__Impl5097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_11__2__Impl_in_rule__TaskContext__Group_11__25128 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_11__3_in_rule__TaskContext__Group_11__25131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__PropertiesAssignment_11_2_in_rule__TaskContext__Group_11__2__Impl5158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_11__3__Impl_in_rule__TaskContext__Group_11__35188 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_11__4_in_rule__TaskContext__Group_11__35191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_11_3__0_in_rule__TaskContext__Group_11__3__Impl5218 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_11__4__Impl_in_rule__TaskContext__Group_11__45249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__TaskContext__Group_11__4__Impl5277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_11_3__0__Impl_in_rule__TaskContext__Group_11_3__05318 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_11_3__1_in_rule__TaskContext__Group_11_3__05321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__TaskContext__Group_11_3__0__Impl5349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_11_3__1__Impl_in_rule__TaskContext__Group_11_3__15380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__PropertiesAssignment_11_3_1_in_rule__TaskContext__Group_11_3__1__Impl5407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_12__0__Impl_in_rule__TaskContext__Group_12__05441 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_12__1_in_rule__TaskContext__Group_12__05444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__TaskContext__Group_12__0__Impl5472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_12__1__Impl_in_rule__TaskContext__Group_12__15503 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_12__2_in_rule__TaskContext__Group_12__15506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__TaskContext__Group_12__1__Impl5534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_12__2__Impl_in_rule__TaskContext__Group_12__25565 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_12__3_in_rule__TaskContext__Group_12__25568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__OperationsAssignment_12_2_in_rule__TaskContext__Group_12__2__Impl5595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_12__3__Impl_in_rule__TaskContext__Group_12__35625 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_12__4_in_rule__TaskContext__Group_12__35628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_12_3__0_in_rule__TaskContext__Group_12__3__Impl5655 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_12__4__Impl_in_rule__TaskContext__Group_12__45686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__TaskContext__Group_12__4__Impl5714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_12_3__0__Impl_in_rule__TaskContext__Group_12_3__05755 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_12_3__1_in_rule__TaskContext__Group_12_3__05758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__TaskContext__Group_12_3__0__Impl5786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_12_3__1__Impl_in_rule__TaskContext__Group_12_3__15817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__OperationsAssignment_12_3_1_in_rule__TaskContext__Group_12_3__1__Impl5844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group__0__Impl_in_rule__PeerGroup__Group__05878 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group__1_in_rule__PeerGroup__Group__05881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__PeerGroup__Group__0__Impl5909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group__1__Impl_in_rule__PeerGroup__Group__15940 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group__2_in_rule__PeerGroup__Group__15943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__NameAssignment_1_in_rule__PeerGroup__Group__1__Impl5970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group__2__Impl_in_rule__PeerGroup__Group__26000 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group__3_in_rule__PeerGroup__Group__26003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__PeerGroup__Group__2__Impl6031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group__3__Impl_in_rule__PeerGroup__Group__36062 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group__4_in_rule__PeerGroup__Group__36065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__PeerGroup__Group__3__Impl6093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group__4__Impl_in_rule__PeerGroup__Group__46124 = new BitSet(new long[]{0x0000002000400000L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group__5_in_rule__PeerGroup__Group__46127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__CoordinatorAssignment_4_in_rule__PeerGroup__Group__4__Impl6154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group__5__Impl_in_rule__PeerGroup__Group__56184 = new BitSet(new long[]{0x0000002000400000L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group__6_in_rule__PeerGroup__Group__56187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group_5__0_in_rule__PeerGroup__Group__5__Impl6214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group__6__Impl_in_rule__PeerGroup__Group__66245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__PeerGroup__Group__6__Impl6273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group_5__0__Impl_in_rule__PeerGroup__Group_5__06318 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group_5__1_in_rule__PeerGroup__Group_5__06321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__PeerGroup__Group_5__0__Impl6349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group_5__1__Impl_in_rule__PeerGroup__Group_5__16380 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group_5__2_in_rule__PeerGroup__Group_5__16383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__PeerGroup__Group_5__1__Impl6411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group_5__2__Impl_in_rule__PeerGroup__Group_5__26442 = new BitSet(new long[]{0x0000008001000000L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group_5__3_in_rule__PeerGroup__Group_5__26445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__MembersAssignment_5_2_in_rule__PeerGroup__Group_5__2__Impl6472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group_5__3__Impl_in_rule__PeerGroup__Group_5__36502 = new BitSet(new long[]{0x0000008001000000L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group_5__4_in_rule__PeerGroup__Group_5__36505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group_5_3__0_in_rule__PeerGroup__Group_5__3__Impl6532 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group_5__4__Impl_in_rule__PeerGroup__Group_5__46563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__PeerGroup__Group_5__4__Impl6591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group_5_3__0__Impl_in_rule__PeerGroup__Group_5_3__06632 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group_5_3__1_in_rule__PeerGroup__Group_5_3__06635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__PeerGroup__Group_5_3__0__Impl6663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group_5_3__1__Impl_in_rule__PeerGroup__Group_5_3__16694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__MembersAssignment_5_3_1_in_rule__PeerGroup__Group_5_3__1__Impl6721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__0__Impl_in_rule__ConnectionPolicy__Group__06755 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__1_in_rule__ConnectionPolicy__Group__06758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__ConnectionPolicy__Group__0__Impl6786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__1__Impl_in_rule__ConnectionPolicy__Group__16817 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__2_in_rule__ConnectionPolicy__Group__16820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__NameAssignment_1_in_rule__ConnectionPolicy__Group__1__Impl6847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__2__Impl_in_rule__ConnectionPolicy__Group__26877 = new BitSet(new long[]{0x00001A0020000000L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__3_in_rule__ConnectionPolicy__Group__26880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__ConnectionPolicy__Group__2__Impl6908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__3__Impl_in_rule__ConnectionPolicy__Group__36939 = new BitSet(new long[]{0x00001A0020000000L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__4_in_rule__ConnectionPolicy__Group__36942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_3__0_in_rule__ConnectionPolicy__Group__3__Impl6969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__4__Impl_in_rule__ConnectionPolicy__Group__47000 = new BitSet(new long[]{0x00001A0020000000L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__5_in_rule__ConnectionPolicy__Group__47003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_4__0_in_rule__ConnectionPolicy__Group__4__Impl7030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__5__Impl_in_rule__ConnectionPolicy__Group__57061 = new BitSet(new long[]{0x00001A0020000000L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__6_in_rule__ConnectionPolicy__Group__57064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_5__0_in_rule__ConnectionPolicy__Group__5__Impl7091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__6__Impl_in_rule__ConnectionPolicy__Group__67122 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__7_in_rule__ConnectionPolicy__Group__67125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__ConnectionPolicy__Group__6__Impl7153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__7__Impl_in_rule__ConnectionPolicy__Group__77184 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__8_in_rule__ConnectionPolicy__Group__77187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__InputPortAssignment_7_in_rule__ConnectionPolicy__Group__7__Impl7214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__8__Impl_in_rule__ConnectionPolicy__Group__87244 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__9_in_rule__ConnectionPolicy__Group__87247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__ConnectionPolicy__Group__8__Impl7275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__9__Impl_in_rule__ConnectionPolicy__Group__97306 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__10_in_rule__ConnectionPolicy__Group__97309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__OutputPortAssignment_9_in_rule__ConnectionPolicy__Group__9__Impl7336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__10__Impl_in_rule__ConnectionPolicy__Group__107366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__ConnectionPolicy__Group__10__Impl7394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_3__0__Impl_in_rule__ConnectionPolicy__Group_3__07447 = new BitSet(new long[]{0x0100000000000040L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_3__1_in_rule__ConnectionPolicy__Group_3__07450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__ConnectionPolicy__Group_3__0__Impl7478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_3__1__Impl_in_rule__ConnectionPolicy__Group_3__17509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__BufferSizeAssignment_3_1_in_rule__ConnectionPolicy__Group_3__1__Impl7536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_4__0__Impl_in_rule__ConnectionPolicy__Group_4__07570 = new BitSet(new long[]{0x000000000000E000L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_4__1_in_rule__ConnectionPolicy__Group_4__07573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__ConnectionPolicy__Group_4__0__Impl7601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_4__1__Impl_in_rule__ConnectionPolicy__Group_4__17632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__LockPolicyAssignment_4_1_in_rule__ConnectionPolicy__Group_4__1__Impl7659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_5__0__Impl_in_rule__ConnectionPolicy__Group_5__07693 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_5__1_in_rule__ConnectionPolicy__Group_5__07696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__ConnectionPolicy__Group_5__0__Impl7724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_5__1__Impl_in_rule__ConnectionPolicy__Group_5__17755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__TypeAssignment_5_1_in_rule__ConnectionPolicy__Group_5__1__Impl7782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group__0__Impl_in_rule__InputPort__Group__07816 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_rule__InputPort__Group__1_in_rule__InputPort__Group__07819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__IsEventPortAssignment_0_in_rule__InputPort__Group__0__Impl7846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group__1__Impl_in_rule__InputPort__Group__17876 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputPort__Group__2_in_rule__InputPort__Group__17879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__InputPort__Group__1__Impl7907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group__2__Impl_in_rule__InputPort__Group__27938 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__InputPort__Group__3_in_rule__InputPort__Group__27941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__NameAssignment_2_in_rule__InputPort__Group__2__Impl7968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group__3__Impl_in_rule__InputPort__Group__37998 = new BitSet(new long[]{0x0000C00000400000L});
        public static final BitSet FOLLOW_rule__InputPort__Group__4_in_rule__InputPort__Group__38001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__InputPort__Group__3__Impl8029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group__4__Impl_in_rule__InputPort__Group__48060 = new BitSet(new long[]{0x0000C00000400000L});
        public static final BitSet FOLLOW_rule__InputPort__Group__5_in_rule__InputPort__Group__48063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group_4__0_in_rule__InputPort__Group__4__Impl8090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group__5__Impl_in_rule__InputPort__Group__58121 = new BitSet(new long[]{0x0000C00000400000L});
        public static final BitSet FOLLOW_rule__InputPort__Group__6_in_rule__InputPort__Group__58124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group_5__0_in_rule__InputPort__Group__5__Impl8151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group__6__Impl_in_rule__InputPort__Group__68182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__InputPort__Group__6__Impl8210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group_4__0__Impl_in_rule__InputPort__Group_4__08255 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__InputPort__Group_4__1_in_rule__InputPort__Group_4__08258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__InputPort__Group_4__0__Impl8286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group_4__1__Impl_in_rule__InputPort__Group_4__18317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__DataTypeAssignment_4_1_in_rule__InputPort__Group_4__1__Impl8344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group_5__0__Impl_in_rule__InputPort__Group_5__08378 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputPort__Group_5__1_in_rule__InputPort__Group_5__08381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__InputPort__Group_5__0__Impl8409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group_5__1__Impl_in_rule__InputPort__Group_5__18440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__InputConnectionPolicyAssignment_5_1_in_rule__InputPort__Group_5__1__Impl8467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__0__Impl_in_rule__OutputPort__Group__08501 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__1_in_rule__OutputPort__Group__08504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__OutputPort__Group__0__Impl8532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__1__Impl_in_rule__OutputPort__Group__18563 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__2_in_rule__OutputPort__Group__18566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__NameAssignment_1_in_rule__OutputPort__Group__1__Impl8593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__2__Impl_in_rule__OutputPort__Group__28623 = new BitSet(new long[]{0x0002400000400000L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__3_in_rule__OutputPort__Group__28626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__OutputPort__Group__2__Impl8654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__3__Impl_in_rule__OutputPort__Group__38685 = new BitSet(new long[]{0x0002400000400000L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__4_in_rule__OutputPort__Group__38688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group_3__0_in_rule__OutputPort__Group__3__Impl8715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__4__Impl_in_rule__OutputPort__Group__48746 = new BitSet(new long[]{0x0002400000400000L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__5_in_rule__OutputPort__Group__48749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group_4__0_in_rule__OutputPort__Group__4__Impl8776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__5__Impl_in_rule__OutputPort__Group__58807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__OutputPort__Group__5__Impl8835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group_3__0__Impl_in_rule__OutputPort__Group_3__08878 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OutputPort__Group_3__1_in_rule__OutputPort__Group_3__08881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__OutputPort__Group_3__0__Impl8909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group_3__1__Impl_in_rule__OutputPort__Group_3__18940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__DataTypeAssignment_3_1_in_rule__OutputPort__Group_3__1__Impl8967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group_4__0__Impl_in_rule__OutputPort__Group_4__09001 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__OutputPort__Group_4__1_in_rule__OutputPort__Group_4__09004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__OutputPort__Group_4__0__Impl9032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group_4__1__Impl_in_rule__OutputPort__Group_4__19063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__OutputConnectionPolicyAssignment_4_1_in_rule__OutputPort__Group_4__1__Impl9090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__09124 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__09127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__19185 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__19188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__Property__Group__1__Impl9216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__29247 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Property__Group__3_in_rule__Property__Group__29250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__NameAssignment_2_in_rule__Property__Group__2__Impl9277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__3__Impl_in_rule__Property__Group__39307 = new BitSet(new long[]{0x0018000020400000L});
        public static final BitSet FOLLOW_rule__Property__Group__4_in_rule__Property__Group__39310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Property__Group__3__Impl9338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__4__Impl_in_rule__Property__Group__49369 = new BitSet(new long[]{0x0018000020400000L});
        public static final BitSet FOLLOW_rule__Property__Group__5_in_rule__Property__Group__49372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group_4__0_in_rule__Property__Group__4__Impl9399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__5__Impl_in_rule__Property__Group__59430 = new BitSet(new long[]{0x0018000020400000L});
        public static final BitSet FOLLOW_rule__Property__Group__6_in_rule__Property__Group__59433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group_5__0_in_rule__Property__Group__5__Impl9460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__6__Impl_in_rule__Property__Group__69491 = new BitSet(new long[]{0x0018000020400000L});
        public static final BitSet FOLLOW_rule__Property__Group__7_in_rule__Property__Group__69494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group_6__0_in_rule__Property__Group__6__Impl9521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__7__Impl_in_rule__Property__Group__79552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Property__Group__7__Impl9580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group_4__0__Impl_in_rule__Property__Group_4__09627 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Property__Group_4__1_in_rule__Property__Group_4__09630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__Property__Group_4__0__Impl9658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group_4__1__Impl_in_rule__Property__Group_4__19689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__DescriptionAssignment_4_1_in_rule__Property__Group_4__1__Impl9716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group_5__0__Impl_in_rule__Property__Group_5__09750 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Property__Group_5__1_in_rule__Property__Group_5__09753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__Property__Group_5__0__Impl9781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group_5__1__Impl_in_rule__Property__Group_5__19812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__ValueAssignment_5_1_in_rule__Property__Group_5__1__Impl9839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group_6__0__Impl_in_rule__Property__Group_6__09873 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Property__Group_6__1_in_rule__Property__Group_6__09876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Property__Group_6__0__Impl9904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group_6__1__Impl_in_rule__Property__Group_6__19935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__TypeAssignment_6_1_in_rule__Property__Group_6__1__Impl9962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__09996 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__09999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__110057 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__110060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rule__Operation__Group__1__Impl10088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__210119 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__210122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__NameAssignment_2_in_rule__Operation__Group__2__Impl10149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__310179 = new BitSet(new long[]{0x00C0000000400000L});
        public static final BitSet FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__310182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Operation__Group__3__Impl10210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__410241 = new BitSet(new long[]{0x00C0000000400000L});
        public static final BitSet FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__410244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_4__0_in_rule__Operation__Group__4__Impl10271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__510302 = new BitSet(new long[]{0x00C0000000400000L});
        public static final BitSet FOLLOW_rule__Operation__Group__6_in_rule__Operation__Group__510305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_5__0_in_rule__Operation__Group__5__Impl10332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__6__Impl_in_rule__Operation__Group__610363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Operation__Group__6__Impl10391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_4__0__Impl_in_rule__Operation__Group_4__010436 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Operation__Group_4__1_in_rule__Operation__Group_4__010439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rule__Operation__Group_4__0__Impl10467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_4__1__Impl_in_rule__Operation__Group_4__110498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__DocumentationAssignment_4_1_in_rule__Operation__Group_4__1__Impl10525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_5__0__Impl_in_rule__Operation__Group_5__010559 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Operation__Group_5__1_in_rule__Operation__Group_5__010562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rule__Operation__Group_5__0__Impl10590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_5__1__Impl_in_rule__Operation__Group_5__110621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__ReturnTypeAssignment_5_1_in_rule__Operation__Group_5__1__Impl10648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EShort__Group__0__Impl_in_rule__EShort__Group__010682 = new BitSet(new long[]{0x0100000000000040L});
        public static final BitSet FOLLOW_rule__EShort__Group__1_in_rule__EShort__Group__010685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rule__EShort__Group__0__Impl10714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EShort__Group__1__Impl_in_rule__EShort__Group__110747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EShort__Group__1__Impl10774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__010807 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__010810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_rule__Activity__Group__0__Impl10838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__110869 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__110872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__NameAssignment_1_in_rule__Activity__Group__1__Impl10899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__210929 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__210932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Activity__Group__2__Impl10960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__310991 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__310994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_rule__Activity__Group__3__Impl11022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__411053 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__411056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__SchedulerAssignment_4_in_rule__Activity__Group__4__Impl11083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__511113 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__511116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_rule__Activity__Group__5__Impl11144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__611175 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__611178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__CpuAffinityAssignment_6_in_rule__Activity__Group__6__Impl11205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__711235 = new BitSet(new long[]{0x0100000000000040L,0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__8_in_rule__Activity__Group__711238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_rule__Activity__Group__7__Impl11266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__8__Impl_in_rule__Activity__Group__811297 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group__9_in_rule__Activity__Group__811300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__PeriodAssignment_8_in_rule__Activity__Group__8__Impl11327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__9__Impl_in_rule__Activity__Group__911357 = new BitSet(new long[]{0x0100000000000040L});
        public static final BitSet FOLLOW_rule__Activity__Group__10_in_rule__Activity__Group__911360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_rule__Activity__Group__9__Impl11388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__10__Impl_in_rule__Activity__Group__1011419 = new BitSet(new long[]{0xC000000000400000L});
        public static final BitSet FOLLOW_rule__Activity__Group__11_in_rule__Activity__Group__1011422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__PriorityAssignment_10_in_rule__Activity__Group__10__Impl11449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__11__Impl_in_rule__Activity__Group__1111479 = new BitSet(new long[]{0xC000000000400000L});
        public static final BitSet FOLLOW_rule__Activity__Group__12_in_rule__Activity__Group__1111482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_11__0_in_rule__Activity__Group__11__Impl11509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__12__Impl_in_rule__Activity__Group__1211540 = new BitSet(new long[]{0xC000000000400000L});
        public static final BitSet FOLLOW_rule__Activity__Group__13_in_rule__Activity__Group__1211543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_12__0_in_rule__Activity__Group__12__Impl11570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__13__Impl_in_rule__Activity__Group__1311601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Activity__Group__13__Impl11629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_11__0__Impl_in_rule__Activity__Group_11__011688 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Activity__Group_11__1_in_rule__Activity__Group_11__011691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_rule__Activity__Group_11__0__Impl11719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_11__1__Impl_in_rule__Activity__Group_11__111750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__TaskContextAssignment_11_1_in_rule__Activity__Group_11__1__Impl11777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_12__0__Impl_in_rule__Activity__Group_12__011811 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Activity__Group_12__1_in_rule__Activity__Group_12__011814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_rule__Activity__Group_12__0__Impl11842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_12__1__Impl_in_rule__Activity__Group_12__111873 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Activity__Group_12__2_in_rule__Activity__Group_12__111876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Activity__Group_12__1__Impl11904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_12__2__Impl_in_rule__Activity__Group_12__211935 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__Activity__Group_12__3_in_rule__Activity__Group_12__211938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__SlaveAssignment_12_2_in_rule__Activity__Group_12__2__Impl11965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_12__3__Impl_in_rule__Activity__Group_12__311995 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__Activity__Group_12__4_in_rule__Activity__Group_12__311998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_12_3__0_in_rule__Activity__Group_12__3__Impl12025 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_12__4__Impl_in_rule__Activity__Group_12__412056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Activity__Group_12__4__Impl12084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_12_3__0__Impl_in_rule__Activity__Group_12_3__012125 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Activity__Group_12_3__1_in_rule__Activity__Group_12_3__012128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Activity__Group_12_3__0__Impl12156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_12_3__1__Impl_in_rule__Activity__Group_12_3__112187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__SlaveAssignment_12_3_1_in_rule__Activity__Group_12_3__1__Impl12214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slave__Group__0__Impl_in_rule__Slave__Group__012248 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Slave__Group__1_in_rule__Slave__Group__012251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slave__Group__1__Impl_in_rule__Slave__Group__112309 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Slave__Group__2_in_rule__Slave__Group__112312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_rule__Slave__Group__1__Impl12340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slave__Group__2__Impl_in_rule__Slave__Group__212371 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Slave__Group__3_in_rule__Slave__Group__212374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slave__NameAssignment_2_in_rule__Slave__Group__2__Impl12401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slave__Group__3__Impl_in_rule__Slave__Group__312431 = new BitSet(new long[]{0x4000000000400000L});
        public static final BitSet FOLLOW_rule__Slave__Group__4_in_rule__Slave__Group__312434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Slave__Group__3__Impl12462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slave__Group__4__Impl_in_rule__Slave__Group__412493 = new BitSet(new long[]{0x4000000000400000L});
        public static final BitSet FOLLOW_rule__Slave__Group__5_in_rule__Slave__Group__412496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slave__Group_4__0_in_rule__Slave__Group__4__Impl12523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slave__Group__5__Impl_in_rule__Slave__Group__512554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Slave__Group__5__Impl12582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slave__Group_4__0__Impl_in_rule__Slave__Group_4__012625 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Slave__Group_4__1_in_rule__Slave__Group_4__012628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_rule__Slave__Group_4__0__Impl12656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slave__Group_4__1__Impl_in_rule__Slave__Group_4__112687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slave__TaskContextAssignment_4_1_in_rule__Slave__Group_4__1__Impl12714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__0__Impl_in_rule__EFloat__Group__012748 = new BitSet(new long[]{0x0100000000000040L,0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__1_in_rule__EFloat__Group__012751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rule__EFloat__Group__0__Impl12780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__1__Impl_in_rule__EFloat__Group__112813 = new BitSet(new long[]{0x0100000000000040L,0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__2_in_rule__EFloat__Group__112816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EFloat__Group__1__Impl12844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__2__Impl_in_rule__EFloat__Group__212875 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group__3_in_rule__EFloat__Group__212878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_rule__EFloat__Group__2__Impl12906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__3__Impl_in_rule__EFloat__Group__312937 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__EFloat__Group__4_in_rule__EFloat__Group__312940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EFloat__Group__3__Impl12967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__4__Impl_in_rule__EFloat__Group__412996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__0_in_rule__EFloat__Group__4__Impl13023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__0__Impl_in_rule__EFloat__Group_4__013064 = new BitSet(new long[]{0x0100000000000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__1_in_rule__EFloat__Group_4__013067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Alternatives_4_0_in_rule__EFloat__Group_4__0__Impl13094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__1__Impl_in_rule__EFloat__Group_4__113124 = new BitSet(new long[]{0x0100000000000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__2_in_rule__EFloat__Group_4__113127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rule__EFloat__Group_4__1__Impl13156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__2__Impl_in_rule__EFloat__Group_4__213189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EFloat__Group_4__2__Impl13216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__013251 = new BitSet(new long[]{0x0100000000000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__013254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rule__EInt__Group__0__Impl13283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__113316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl13343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__013376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__013379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl13406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__113435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl13462 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__013497 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__013500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_rule__QualifiedName__Group_1__0__Impl13528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__113559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl13586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedNameWithDot__Group__0__Impl_in_rule__QualifiedNameWithDot__Group__013619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedNameWithDot__Group__1_in_rule__QualifiedNameWithDot__Group__013622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithDot__Group__0__Impl13649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedNameWithDot__Group__1__Impl_in_rule__QualifiedNameWithDot__Group__113678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedNameWithDot__Group_1__0_in_rule__QualifiedNameWithDot__Group__1__Impl13705 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedNameWithDot__Group_1__0__Impl_in_rule__QualifiedNameWithDot__Group_1__013740 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__QualifiedNameWithDot__Group_1__1_in_rule__QualifiedNameWithDot__Group_1__013743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_rule__QualifiedNameWithDot__Group_1__0__Impl13771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedNameWithDot__Group_1__1__Impl_in_rule__QualifiedNameWithDot__Group_1__113802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedNameWithDot__Group_1__1__Impl13829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Package__NameAssignment_213867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTaskContext_in_rule__Package__TaskContextsAssignment_4_213898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTaskContext_in_rule__Package__TaskContextsAssignment_4_3_113929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConnectionPolicy_in_rule__Package__ConnectionPoliciesAssignment_5_213960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConnectionPolicy_in_rule__Package__ConnectionPoliciesAssignment_5_3_113991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePeerGroup_in_rule__Package__PeerGroupsAssignment_6_214022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePeerGroup_in_rule__Package__PeerGroupsAssignment_6_3_114053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TaskContext__NameAssignment_114084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_rule__TaskContext__NamespaceAssignment_414115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_rule__TaskContext__TypeAssignment_614146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleActivity_in_rule__TaskContext__ActivityAssignment_814177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputPort_in_rule__TaskContext__InputPortsAssignment_9_214208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputPort_in_rule__TaskContext__InputPortsAssignment_9_3_114239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOutputPort_in_rule__TaskContext__OutputPortsAssignment_10_214270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOutputPort_in_rule__TaskContext__OutputPortsAssignment_10_3_114301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_rule__TaskContext__PropertiesAssignment_11_214332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_rule__TaskContext__PropertiesAssignment_11_3_114363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_rule__TaskContext__OperationsAssignment_12_214394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_rule__TaskContext__OperationsAssignment_12_3_114425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__PeerGroup__NameAssignment_114456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__PeerGroup__CoordinatorAssignment_414491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__PeerGroup__MembersAssignment_5_214530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__PeerGroup__MembersAssignment_5_3_114569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ConnectionPolicy__NameAssignment_114604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEShort_in_rule__ConnectionPolicy__BufferSizeAssignment_3_114635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConnectionPolicyLockPolicy_in_rule__ConnectionPolicy__LockPolicyAssignment_4_114666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConnectionPolicyType_in_rule__ConnectionPolicy__TypeAssignment_5_114697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ConnectionPolicy__InputPortAssignment_714732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ConnectionPolicy__OutputPortAssignment_914771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_rule__InputPort__IsEventPortAssignment_014811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputPort__NameAssignment_214850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_rule__InputPort__DataTypeAssignment_4_114885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputPort__InputConnectionPolicyAssignment_5_114924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OutputPort__NameAssignment_114959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_rule__OutputPort__DataTypeAssignment_3_114994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OutputPort__OutputConnectionPolicyAssignment_4_115033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Property__NameAssignment_215068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Property__DescriptionAssignment_4_115099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Property__ValueAssignment_5_115130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_rule__Property__TypeAssignment_6_115165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Operation__NameAssignment_215200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Operation__DocumentationAssignment_4_115231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_rule__Operation__ReturnTypeAssignment_5_115266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Activity__NameAssignment_115301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScheduler_in_rule__Activity__SchedulerAssignment_415332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Activity__CpuAffinityAssignment_615363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_rule__Activity__PeriodAssignment_815394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Activity__PriorityAssignment_1015425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Activity__TaskContextAssignment_11_115460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSlave_in_rule__Activity__SlaveAssignment_12_215495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSlave_in_rule__Activity__SlaveAssignment_12_3_115526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Slave__NameAssignment_215557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Slave__TaskContextAssignment_4_115592 = new BitSet(new long[]{0x0000000000000002L});
    }


}