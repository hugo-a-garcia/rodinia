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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'UNSYNC'", "'LOCKED'", "'LOCK_FREE'", "'DATA'", "'BUFFER'", "'ORO_SCHED_OTHER'", "'ORO_SCHED_RT'", "'OrocosPackage'", "'{'", "'}'", "'taskContexts'", "','", "'connectionPolicies'", "'peerGroups'", "'TaskContext'", "'namespace'", "'type'", "'inputPorts'", "'outputPorts'", "'properties'", "'operations'", "'PeerGroup'", "'coordinator'", "'members'", "'('", "')'", "'ConnectionPolicy'", "'inputPort'", "'outputPort'", "'bufferSize'", "'lockPolicy'", "'InputPort'", "'dataType'", "'inputConnectionPolicy'", "'OutputPort'", "'outputConnectionPolicy'", "'Property'", "'description'", "'value'", "'Operation'", "'documentation'", "'returnType'", "'-'", "'Activity'", "'scheduler'", "'cpuAffinity'", "'period'", "'priority'", "'taskContext'", "'slave'", "'Slave'", "'.'", "'::'", "'isEventPort'"
    };
    public static final int RULE_ID=5;
    public static final int T__66=66;
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1844:1: rule__TaskContext__Group__7__Impl : ( ( rule__TaskContext__Group_7__0 )? ) ;
    public final void rule__TaskContext__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1848:1: ( ( ( rule__TaskContext__Group_7__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1849:1: ( ( rule__TaskContext__Group_7__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1849:1: ( ( rule__TaskContext__Group_7__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1850:1: ( rule__TaskContext__Group_7__0 )?
            {
             before(grammarAccess.getTaskContextAccess().getGroup_7()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1851:1: ( rule__TaskContext__Group_7__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1851:2: rule__TaskContext__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7__0_in_rule__TaskContext__Group__7__Impl3707);
                    rule__TaskContext__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskContextAccess().getGroup_7()); 

            }


            }

        }
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1861:1: rule__TaskContext__Group__8 : rule__TaskContext__Group__8__Impl rule__TaskContext__Group__9 ;
    public final void rule__TaskContext__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1865:1: ( rule__TaskContext__Group__8__Impl rule__TaskContext__Group__9 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1866:2: rule__TaskContext__Group__8__Impl rule__TaskContext__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__8__Impl_in_rule__TaskContext__Group__83738);
            rule__TaskContext__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__9_in_rule__TaskContext__Group__83741);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1873:1: rule__TaskContext__Group__8__Impl : ( ( rule__TaskContext__Group_8__0 )? ) ;
    public final void rule__TaskContext__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1877:1: ( ( ( rule__TaskContext__Group_8__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1878:1: ( ( rule__TaskContext__Group_8__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1878:1: ( ( rule__TaskContext__Group_8__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1879:1: ( rule__TaskContext__Group_8__0 )?
            {
             before(grammarAccess.getTaskContextAccess().getGroup_8()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1880:1: ( rule__TaskContext__Group_8__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1880:2: rule__TaskContext__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8__0_in_rule__TaskContext__Group__8__Impl3768);
                    rule__TaskContext__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskContextAccess().getGroup_8()); 

            }


            }

        }
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1890:1: rule__TaskContext__Group__9 : rule__TaskContext__Group__9__Impl rule__TaskContext__Group__10 ;
    public final void rule__TaskContext__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1894:1: ( rule__TaskContext__Group__9__Impl rule__TaskContext__Group__10 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1895:2: rule__TaskContext__Group__9__Impl rule__TaskContext__Group__10
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1902:1: rule__TaskContext__Group__9__Impl : ( ( rule__TaskContext__Group_9__0 )? ) ;
    public final void rule__TaskContext__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1906:1: ( ( ( rule__TaskContext__Group_9__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1907:1: ( ( rule__TaskContext__Group_9__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1907:1: ( ( rule__TaskContext__Group_9__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1908:1: ( rule__TaskContext__Group_9__0 )?
            {
             before(grammarAccess.getTaskContextAccess().getGroup_9()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1909:1: ( rule__TaskContext__Group_9__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1909:2: rule__TaskContext__Group_9__0
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1919:1: rule__TaskContext__Group__10 : rule__TaskContext__Group__10__Impl rule__TaskContext__Group__11 ;
    public final void rule__TaskContext__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1923:1: ( rule__TaskContext__Group__10__Impl rule__TaskContext__Group__11 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1924:2: rule__TaskContext__Group__10__Impl rule__TaskContext__Group__11
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1931:1: rule__TaskContext__Group__10__Impl : ( ( rule__TaskContext__Group_10__0 )? ) ;
    public final void rule__TaskContext__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1935:1: ( ( ( rule__TaskContext__Group_10__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1936:1: ( ( rule__TaskContext__Group_10__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1936:1: ( ( rule__TaskContext__Group_10__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1937:1: ( rule__TaskContext__Group_10__0 )?
            {
             before(grammarAccess.getTaskContextAccess().getGroup_10()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1938:1: ( rule__TaskContext__Group_10__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1938:2: rule__TaskContext__Group_10__0
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1948:1: rule__TaskContext__Group__11 : rule__TaskContext__Group__11__Impl ;
    public final void rule__TaskContext__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1952:1: ( rule__TaskContext__Group__11__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1953:2: rule__TaskContext__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__11__Impl_in_rule__TaskContext__Group__113921);
            rule__TaskContext__Group__11__Impl();

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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1959:1: rule__TaskContext__Group__11__Impl : ( '}' ) ;
    public final void rule__TaskContext__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1963:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1964:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1964:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1965:1: '}'
            {
             before(grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_11()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__TaskContext__Group__11__Impl3949); 
             after(grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
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


    // $ANTLR start "rule__TaskContext__Group_7__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2002:1: rule__TaskContext__Group_7__0 : rule__TaskContext__Group_7__0__Impl rule__TaskContext__Group_7__1 ;
    public final void rule__TaskContext__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2006:1: ( rule__TaskContext__Group_7__0__Impl rule__TaskContext__Group_7__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2007:2: rule__TaskContext__Group_7__0__Impl rule__TaskContext__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7__0__Impl_in_rule__TaskContext__Group_7__04004);
            rule__TaskContext__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7__1_in_rule__TaskContext__Group_7__04007);
            rule__TaskContext__Group_7__1();

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
    // $ANTLR end "rule__TaskContext__Group_7__0"


    // $ANTLR start "rule__TaskContext__Group_7__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2014:1: rule__TaskContext__Group_7__0__Impl : ( 'inputPorts' ) ;
    public final void rule__TaskContext__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2018:1: ( ( 'inputPorts' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2019:1: ( 'inputPorts' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2019:1: ( 'inputPorts' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2020:1: 'inputPorts'
            {
             before(grammarAccess.getTaskContextAccess().getInputPortsKeyword_7_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__TaskContext__Group_7__0__Impl4035); 
             after(grammarAccess.getTaskContextAccess().getInputPortsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_7__0__Impl"


    // $ANTLR start "rule__TaskContext__Group_7__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2033:1: rule__TaskContext__Group_7__1 : rule__TaskContext__Group_7__1__Impl rule__TaskContext__Group_7__2 ;
    public final void rule__TaskContext__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2037:1: ( rule__TaskContext__Group_7__1__Impl rule__TaskContext__Group_7__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2038:2: rule__TaskContext__Group_7__1__Impl rule__TaskContext__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7__1__Impl_in_rule__TaskContext__Group_7__14066);
            rule__TaskContext__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7__2_in_rule__TaskContext__Group_7__14069);
            rule__TaskContext__Group_7__2();

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
    // $ANTLR end "rule__TaskContext__Group_7__1"


    // $ANTLR start "rule__TaskContext__Group_7__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2045:1: rule__TaskContext__Group_7__1__Impl : ( '{' ) ;
    public final void rule__TaskContext__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2049:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2050:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2050:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2051:1: '{'
            {
             before(grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__TaskContext__Group_7__1__Impl4097); 
             after(grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_7__1__Impl"


    // $ANTLR start "rule__TaskContext__Group_7__2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2064:1: rule__TaskContext__Group_7__2 : rule__TaskContext__Group_7__2__Impl rule__TaskContext__Group_7__3 ;
    public final void rule__TaskContext__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2068:1: ( rule__TaskContext__Group_7__2__Impl rule__TaskContext__Group_7__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2069:2: rule__TaskContext__Group_7__2__Impl rule__TaskContext__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7__2__Impl_in_rule__TaskContext__Group_7__24128);
            rule__TaskContext__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7__3_in_rule__TaskContext__Group_7__24131);
            rule__TaskContext__Group_7__3();

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
    // $ANTLR end "rule__TaskContext__Group_7__2"


    // $ANTLR start "rule__TaskContext__Group_7__2__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2076:1: rule__TaskContext__Group_7__2__Impl : ( ( rule__TaskContext__InputPortsAssignment_7_2 ) ) ;
    public final void rule__TaskContext__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2080:1: ( ( ( rule__TaskContext__InputPortsAssignment_7_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2081:1: ( ( rule__TaskContext__InputPortsAssignment_7_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2081:1: ( ( rule__TaskContext__InputPortsAssignment_7_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2082:1: ( rule__TaskContext__InputPortsAssignment_7_2 )
            {
             before(grammarAccess.getTaskContextAccess().getInputPortsAssignment_7_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2083:1: ( rule__TaskContext__InputPortsAssignment_7_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2083:2: rule__TaskContext__InputPortsAssignment_7_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__InputPortsAssignment_7_2_in_rule__TaskContext__Group_7__2__Impl4158);
            rule__TaskContext__InputPortsAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskContextAccess().getInputPortsAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_7__2__Impl"


    // $ANTLR start "rule__TaskContext__Group_7__3"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2093:1: rule__TaskContext__Group_7__3 : rule__TaskContext__Group_7__3__Impl rule__TaskContext__Group_7__4 ;
    public final void rule__TaskContext__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2097:1: ( rule__TaskContext__Group_7__3__Impl rule__TaskContext__Group_7__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2098:2: rule__TaskContext__Group_7__3__Impl rule__TaskContext__Group_7__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7__3__Impl_in_rule__TaskContext__Group_7__34188);
            rule__TaskContext__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7__4_in_rule__TaskContext__Group_7__34191);
            rule__TaskContext__Group_7__4();

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
    // $ANTLR end "rule__TaskContext__Group_7__3"


    // $ANTLR start "rule__TaskContext__Group_7__3__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2105:1: rule__TaskContext__Group_7__3__Impl : ( ( rule__TaskContext__Group_7_3__0 )* ) ;
    public final void rule__TaskContext__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2109:1: ( ( ( rule__TaskContext__Group_7_3__0 )* ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2110:1: ( ( rule__TaskContext__Group_7_3__0 )* )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2110:1: ( ( rule__TaskContext__Group_7_3__0 )* )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2111:1: ( rule__TaskContext__Group_7_3__0 )*
            {
             before(grammarAccess.getTaskContextAccess().getGroup_7_3()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2112:1: ( rule__TaskContext__Group_7_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2112:2: rule__TaskContext__Group_7_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7_3__0_in_rule__TaskContext__Group_7__3__Impl4218);
            	    rule__TaskContext__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getTaskContextAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_7__3__Impl"


    // $ANTLR start "rule__TaskContext__Group_7__4"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2122:1: rule__TaskContext__Group_7__4 : rule__TaskContext__Group_7__4__Impl ;
    public final void rule__TaskContext__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2126:1: ( rule__TaskContext__Group_7__4__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2127:2: rule__TaskContext__Group_7__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7__4__Impl_in_rule__TaskContext__Group_7__44249);
            rule__TaskContext__Group_7__4__Impl();

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
    // $ANTLR end "rule__TaskContext__Group_7__4"


    // $ANTLR start "rule__TaskContext__Group_7__4__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2133:1: rule__TaskContext__Group_7__4__Impl : ( '}' ) ;
    public final void rule__TaskContext__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2137:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2138:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2138:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2139:1: '}'
            {
             before(grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__TaskContext__Group_7__4__Impl4277); 
             after(grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_7__4__Impl"


    // $ANTLR start "rule__TaskContext__Group_7_3__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2162:1: rule__TaskContext__Group_7_3__0 : rule__TaskContext__Group_7_3__0__Impl rule__TaskContext__Group_7_3__1 ;
    public final void rule__TaskContext__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2166:1: ( rule__TaskContext__Group_7_3__0__Impl rule__TaskContext__Group_7_3__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2167:2: rule__TaskContext__Group_7_3__0__Impl rule__TaskContext__Group_7_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7_3__0__Impl_in_rule__TaskContext__Group_7_3__04318);
            rule__TaskContext__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7_3__1_in_rule__TaskContext__Group_7_3__04321);
            rule__TaskContext__Group_7_3__1();

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
    // $ANTLR end "rule__TaskContext__Group_7_3__0"


    // $ANTLR start "rule__TaskContext__Group_7_3__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2174:1: rule__TaskContext__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__TaskContext__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2178:1: ( ( ',' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2179:1: ( ',' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2179:1: ( ',' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2180:1: ','
            {
             before(grammarAccess.getTaskContextAccess().getCommaKeyword_7_3_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__TaskContext__Group_7_3__0__Impl4349); 
             after(grammarAccess.getTaskContextAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_7_3__0__Impl"


    // $ANTLR start "rule__TaskContext__Group_7_3__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2193:1: rule__TaskContext__Group_7_3__1 : rule__TaskContext__Group_7_3__1__Impl ;
    public final void rule__TaskContext__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2197:1: ( rule__TaskContext__Group_7_3__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2198:2: rule__TaskContext__Group_7_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7_3__1__Impl_in_rule__TaskContext__Group_7_3__14380);
            rule__TaskContext__Group_7_3__1__Impl();

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
    // $ANTLR end "rule__TaskContext__Group_7_3__1"


    // $ANTLR start "rule__TaskContext__Group_7_3__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2204:1: rule__TaskContext__Group_7_3__1__Impl : ( ( rule__TaskContext__InputPortsAssignment_7_3_1 ) ) ;
    public final void rule__TaskContext__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2208:1: ( ( ( rule__TaskContext__InputPortsAssignment_7_3_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2209:1: ( ( rule__TaskContext__InputPortsAssignment_7_3_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2209:1: ( ( rule__TaskContext__InputPortsAssignment_7_3_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2210:1: ( rule__TaskContext__InputPortsAssignment_7_3_1 )
            {
             before(grammarAccess.getTaskContextAccess().getInputPortsAssignment_7_3_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2211:1: ( rule__TaskContext__InputPortsAssignment_7_3_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2211:2: rule__TaskContext__InputPortsAssignment_7_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__InputPortsAssignment_7_3_1_in_rule__TaskContext__Group_7_3__1__Impl4407);
            rule__TaskContext__InputPortsAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskContextAccess().getInputPortsAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_7_3__1__Impl"


    // $ANTLR start "rule__TaskContext__Group_8__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2225:1: rule__TaskContext__Group_8__0 : rule__TaskContext__Group_8__0__Impl rule__TaskContext__Group_8__1 ;
    public final void rule__TaskContext__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2229:1: ( rule__TaskContext__Group_8__0__Impl rule__TaskContext__Group_8__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2230:2: rule__TaskContext__Group_8__0__Impl rule__TaskContext__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8__0__Impl_in_rule__TaskContext__Group_8__04441);
            rule__TaskContext__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8__1_in_rule__TaskContext__Group_8__04444);
            rule__TaskContext__Group_8__1();

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
    // $ANTLR end "rule__TaskContext__Group_8__0"


    // $ANTLR start "rule__TaskContext__Group_8__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2237:1: rule__TaskContext__Group_8__0__Impl : ( 'outputPorts' ) ;
    public final void rule__TaskContext__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2241:1: ( ( 'outputPorts' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2242:1: ( 'outputPorts' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2242:1: ( 'outputPorts' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2243:1: 'outputPorts'
            {
             before(grammarAccess.getTaskContextAccess().getOutputPortsKeyword_8_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__TaskContext__Group_8__0__Impl4472); 
             after(grammarAccess.getTaskContextAccess().getOutputPortsKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_8__0__Impl"


    // $ANTLR start "rule__TaskContext__Group_8__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2256:1: rule__TaskContext__Group_8__1 : rule__TaskContext__Group_8__1__Impl rule__TaskContext__Group_8__2 ;
    public final void rule__TaskContext__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2260:1: ( rule__TaskContext__Group_8__1__Impl rule__TaskContext__Group_8__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2261:2: rule__TaskContext__Group_8__1__Impl rule__TaskContext__Group_8__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8__1__Impl_in_rule__TaskContext__Group_8__14503);
            rule__TaskContext__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8__2_in_rule__TaskContext__Group_8__14506);
            rule__TaskContext__Group_8__2();

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
    // $ANTLR end "rule__TaskContext__Group_8__1"


    // $ANTLR start "rule__TaskContext__Group_8__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2268:1: rule__TaskContext__Group_8__1__Impl : ( '{' ) ;
    public final void rule__TaskContext__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2272:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2273:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2273:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2274:1: '{'
            {
             before(grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__TaskContext__Group_8__1__Impl4534); 
             after(grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_8__1__Impl"


    // $ANTLR start "rule__TaskContext__Group_8__2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2287:1: rule__TaskContext__Group_8__2 : rule__TaskContext__Group_8__2__Impl rule__TaskContext__Group_8__3 ;
    public final void rule__TaskContext__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2291:1: ( rule__TaskContext__Group_8__2__Impl rule__TaskContext__Group_8__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2292:2: rule__TaskContext__Group_8__2__Impl rule__TaskContext__Group_8__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8__2__Impl_in_rule__TaskContext__Group_8__24565);
            rule__TaskContext__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8__3_in_rule__TaskContext__Group_8__24568);
            rule__TaskContext__Group_8__3();

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
    // $ANTLR end "rule__TaskContext__Group_8__2"


    // $ANTLR start "rule__TaskContext__Group_8__2__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2299:1: rule__TaskContext__Group_8__2__Impl : ( ( rule__TaskContext__OutputPortsAssignment_8_2 ) ) ;
    public final void rule__TaskContext__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2303:1: ( ( ( rule__TaskContext__OutputPortsAssignment_8_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2304:1: ( ( rule__TaskContext__OutputPortsAssignment_8_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2304:1: ( ( rule__TaskContext__OutputPortsAssignment_8_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2305:1: ( rule__TaskContext__OutputPortsAssignment_8_2 )
            {
             before(grammarAccess.getTaskContextAccess().getOutputPortsAssignment_8_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2306:1: ( rule__TaskContext__OutputPortsAssignment_8_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2306:2: rule__TaskContext__OutputPortsAssignment_8_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__OutputPortsAssignment_8_2_in_rule__TaskContext__Group_8__2__Impl4595);
            rule__TaskContext__OutputPortsAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskContextAccess().getOutputPortsAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_8__2__Impl"


    // $ANTLR start "rule__TaskContext__Group_8__3"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2316:1: rule__TaskContext__Group_8__3 : rule__TaskContext__Group_8__3__Impl rule__TaskContext__Group_8__4 ;
    public final void rule__TaskContext__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2320:1: ( rule__TaskContext__Group_8__3__Impl rule__TaskContext__Group_8__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2321:2: rule__TaskContext__Group_8__3__Impl rule__TaskContext__Group_8__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8__3__Impl_in_rule__TaskContext__Group_8__34625);
            rule__TaskContext__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8__4_in_rule__TaskContext__Group_8__34628);
            rule__TaskContext__Group_8__4();

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
    // $ANTLR end "rule__TaskContext__Group_8__3"


    // $ANTLR start "rule__TaskContext__Group_8__3__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2328:1: rule__TaskContext__Group_8__3__Impl : ( ( rule__TaskContext__Group_8_3__0 )* ) ;
    public final void rule__TaskContext__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2332:1: ( ( ( rule__TaskContext__Group_8_3__0 )* ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2333:1: ( ( rule__TaskContext__Group_8_3__0 )* )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2333:1: ( ( rule__TaskContext__Group_8_3__0 )* )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2334:1: ( rule__TaskContext__Group_8_3__0 )*
            {
             before(grammarAccess.getTaskContextAccess().getGroup_8_3()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2335:1: ( rule__TaskContext__Group_8_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==24) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2335:2: rule__TaskContext__Group_8_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8_3__0_in_rule__TaskContext__Group_8__3__Impl4655);
            	    rule__TaskContext__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getTaskContextAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_8__3__Impl"


    // $ANTLR start "rule__TaskContext__Group_8__4"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2345:1: rule__TaskContext__Group_8__4 : rule__TaskContext__Group_8__4__Impl ;
    public final void rule__TaskContext__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2349:1: ( rule__TaskContext__Group_8__4__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2350:2: rule__TaskContext__Group_8__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8__4__Impl_in_rule__TaskContext__Group_8__44686);
            rule__TaskContext__Group_8__4__Impl();

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
    // $ANTLR end "rule__TaskContext__Group_8__4"


    // $ANTLR start "rule__TaskContext__Group_8__4__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2356:1: rule__TaskContext__Group_8__4__Impl : ( '}' ) ;
    public final void rule__TaskContext__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2360:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2361:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2361:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2362:1: '}'
            {
             before(grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__TaskContext__Group_8__4__Impl4714); 
             after(grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_8__4__Impl"


    // $ANTLR start "rule__TaskContext__Group_8_3__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2385:1: rule__TaskContext__Group_8_3__0 : rule__TaskContext__Group_8_3__0__Impl rule__TaskContext__Group_8_3__1 ;
    public final void rule__TaskContext__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2389:1: ( rule__TaskContext__Group_8_3__0__Impl rule__TaskContext__Group_8_3__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2390:2: rule__TaskContext__Group_8_3__0__Impl rule__TaskContext__Group_8_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8_3__0__Impl_in_rule__TaskContext__Group_8_3__04755);
            rule__TaskContext__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8_3__1_in_rule__TaskContext__Group_8_3__04758);
            rule__TaskContext__Group_8_3__1();

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
    // $ANTLR end "rule__TaskContext__Group_8_3__0"


    // $ANTLR start "rule__TaskContext__Group_8_3__0__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2397:1: rule__TaskContext__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__TaskContext__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2401:1: ( ( ',' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2402:1: ( ',' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2402:1: ( ',' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2403:1: ','
            {
             before(grammarAccess.getTaskContextAccess().getCommaKeyword_8_3_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__TaskContext__Group_8_3__0__Impl4786); 
             after(grammarAccess.getTaskContextAccess().getCommaKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_8_3__0__Impl"


    // $ANTLR start "rule__TaskContext__Group_8_3__1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2416:1: rule__TaskContext__Group_8_3__1 : rule__TaskContext__Group_8_3__1__Impl ;
    public final void rule__TaskContext__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2420:1: ( rule__TaskContext__Group_8_3__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2421:2: rule__TaskContext__Group_8_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8_3__1__Impl_in_rule__TaskContext__Group_8_3__14817);
            rule__TaskContext__Group_8_3__1__Impl();

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
    // $ANTLR end "rule__TaskContext__Group_8_3__1"


    // $ANTLR start "rule__TaskContext__Group_8_3__1__Impl"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2427:1: rule__TaskContext__Group_8_3__1__Impl : ( ( rule__TaskContext__OutputPortsAssignment_8_3_1 ) ) ;
    public final void rule__TaskContext__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2431:1: ( ( ( rule__TaskContext__OutputPortsAssignment_8_3_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2432:1: ( ( rule__TaskContext__OutputPortsAssignment_8_3_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2432:1: ( ( rule__TaskContext__OutputPortsAssignment_8_3_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2433:1: ( rule__TaskContext__OutputPortsAssignment_8_3_1 )
            {
             before(grammarAccess.getTaskContextAccess().getOutputPortsAssignment_8_3_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2434:1: ( rule__TaskContext__OutputPortsAssignment_8_3_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2434:2: rule__TaskContext__OutputPortsAssignment_8_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__OutputPortsAssignment_8_3_1_in_rule__TaskContext__Group_8_3__1__Impl4844);
            rule__TaskContext__OutputPortsAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskContextAccess().getOutputPortsAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__Group_8_3__1__Impl"


    // $ANTLR start "rule__TaskContext__Group_9__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2448:1: rule__TaskContext__Group_9__0 : rule__TaskContext__Group_9__0__Impl rule__TaskContext__Group_9__1 ;
    public final void rule__TaskContext__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2452:1: ( rule__TaskContext__Group_9__0__Impl rule__TaskContext__Group_9__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2453:2: rule__TaskContext__Group_9__0__Impl rule__TaskContext__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9__0__Impl_in_rule__TaskContext__Group_9__04878);
            rule__TaskContext__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9__1_in_rule__TaskContext__Group_9__04881);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2460:1: rule__TaskContext__Group_9__0__Impl : ( 'properties' ) ;
    public final void rule__TaskContext__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2464:1: ( ( 'properties' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2465:1: ( 'properties' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2465:1: ( 'properties' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2466:1: 'properties'
            {
             before(grammarAccess.getTaskContextAccess().getPropertiesKeyword_9_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__TaskContext__Group_9__0__Impl4909); 
             after(grammarAccess.getTaskContextAccess().getPropertiesKeyword_9_0()); 

            }


            }

        }
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2479:1: rule__TaskContext__Group_9__1 : rule__TaskContext__Group_9__1__Impl rule__TaskContext__Group_9__2 ;
    public final void rule__TaskContext__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2483:1: ( rule__TaskContext__Group_9__1__Impl rule__TaskContext__Group_9__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2484:2: rule__TaskContext__Group_9__1__Impl rule__TaskContext__Group_9__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9__1__Impl_in_rule__TaskContext__Group_9__14940);
            rule__TaskContext__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9__2_in_rule__TaskContext__Group_9__14943);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2491:1: rule__TaskContext__Group_9__1__Impl : ( '{' ) ;
    public final void rule__TaskContext__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2495:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2496:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2496:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2497:1: '{'
            {
             before(grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__TaskContext__Group_9__1__Impl4971); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2510:1: rule__TaskContext__Group_9__2 : rule__TaskContext__Group_9__2__Impl rule__TaskContext__Group_9__3 ;
    public final void rule__TaskContext__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2514:1: ( rule__TaskContext__Group_9__2__Impl rule__TaskContext__Group_9__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2515:2: rule__TaskContext__Group_9__2__Impl rule__TaskContext__Group_9__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9__2__Impl_in_rule__TaskContext__Group_9__25002);
            rule__TaskContext__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9__3_in_rule__TaskContext__Group_9__25005);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2522:1: rule__TaskContext__Group_9__2__Impl : ( ( rule__TaskContext__PropertiesAssignment_9_2 ) ) ;
    public final void rule__TaskContext__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2526:1: ( ( ( rule__TaskContext__PropertiesAssignment_9_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2527:1: ( ( rule__TaskContext__PropertiesAssignment_9_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2527:1: ( ( rule__TaskContext__PropertiesAssignment_9_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2528:1: ( rule__TaskContext__PropertiesAssignment_9_2 )
            {
             before(grammarAccess.getTaskContextAccess().getPropertiesAssignment_9_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2529:1: ( rule__TaskContext__PropertiesAssignment_9_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2529:2: rule__TaskContext__PropertiesAssignment_9_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__PropertiesAssignment_9_2_in_rule__TaskContext__Group_9__2__Impl5032);
            rule__TaskContext__PropertiesAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskContextAccess().getPropertiesAssignment_9_2()); 

            }


            }

        }
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2539:1: rule__TaskContext__Group_9__3 : rule__TaskContext__Group_9__3__Impl rule__TaskContext__Group_9__4 ;
    public final void rule__TaskContext__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2543:1: ( rule__TaskContext__Group_9__3__Impl rule__TaskContext__Group_9__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2544:2: rule__TaskContext__Group_9__3__Impl rule__TaskContext__Group_9__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9__3__Impl_in_rule__TaskContext__Group_9__35062);
            rule__TaskContext__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9__4_in_rule__TaskContext__Group_9__35065);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2551:1: rule__TaskContext__Group_9__3__Impl : ( ( rule__TaskContext__Group_9_3__0 )* ) ;
    public final void rule__TaskContext__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2555:1: ( ( ( rule__TaskContext__Group_9_3__0 )* ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2556:1: ( ( rule__TaskContext__Group_9_3__0 )* )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2556:1: ( ( rule__TaskContext__Group_9_3__0 )* )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2557:1: ( rule__TaskContext__Group_9_3__0 )*
            {
             before(grammarAccess.getTaskContextAccess().getGroup_9_3()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2558:1: ( rule__TaskContext__Group_9_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==24) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2558:2: rule__TaskContext__Group_9_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9_3__0_in_rule__TaskContext__Group_9__3__Impl5092);
            	    rule__TaskContext__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2568:1: rule__TaskContext__Group_9__4 : rule__TaskContext__Group_9__4__Impl ;
    public final void rule__TaskContext__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2572:1: ( rule__TaskContext__Group_9__4__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2573:2: rule__TaskContext__Group_9__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9__4__Impl_in_rule__TaskContext__Group_9__45123);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2579:1: rule__TaskContext__Group_9__4__Impl : ( '}' ) ;
    public final void rule__TaskContext__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2583:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2584:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2584:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2585:1: '}'
            {
             before(grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__TaskContext__Group_9__4__Impl5151); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2608:1: rule__TaskContext__Group_9_3__0 : rule__TaskContext__Group_9_3__0__Impl rule__TaskContext__Group_9_3__1 ;
    public final void rule__TaskContext__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2612:1: ( rule__TaskContext__Group_9_3__0__Impl rule__TaskContext__Group_9_3__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2613:2: rule__TaskContext__Group_9_3__0__Impl rule__TaskContext__Group_9_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9_3__0__Impl_in_rule__TaskContext__Group_9_3__05192);
            rule__TaskContext__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9_3__1_in_rule__TaskContext__Group_9_3__05195);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2620:1: rule__TaskContext__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__TaskContext__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2624:1: ( ( ',' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2625:1: ( ',' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2625:1: ( ',' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2626:1: ','
            {
             before(grammarAccess.getTaskContextAccess().getCommaKeyword_9_3_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__TaskContext__Group_9_3__0__Impl5223); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2639:1: rule__TaskContext__Group_9_3__1 : rule__TaskContext__Group_9_3__1__Impl ;
    public final void rule__TaskContext__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2643:1: ( rule__TaskContext__Group_9_3__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2644:2: rule__TaskContext__Group_9_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9_3__1__Impl_in_rule__TaskContext__Group_9_3__15254);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2650:1: rule__TaskContext__Group_9_3__1__Impl : ( ( rule__TaskContext__PropertiesAssignment_9_3_1 ) ) ;
    public final void rule__TaskContext__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2654:1: ( ( ( rule__TaskContext__PropertiesAssignment_9_3_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2655:1: ( ( rule__TaskContext__PropertiesAssignment_9_3_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2655:1: ( ( rule__TaskContext__PropertiesAssignment_9_3_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2656:1: ( rule__TaskContext__PropertiesAssignment_9_3_1 )
            {
             before(grammarAccess.getTaskContextAccess().getPropertiesAssignment_9_3_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2657:1: ( rule__TaskContext__PropertiesAssignment_9_3_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2657:2: rule__TaskContext__PropertiesAssignment_9_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__PropertiesAssignment_9_3_1_in_rule__TaskContext__Group_9_3__1__Impl5281);
            rule__TaskContext__PropertiesAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskContextAccess().getPropertiesAssignment_9_3_1()); 

            }


            }

        }
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2671:1: rule__TaskContext__Group_10__0 : rule__TaskContext__Group_10__0__Impl rule__TaskContext__Group_10__1 ;
    public final void rule__TaskContext__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2675:1: ( rule__TaskContext__Group_10__0__Impl rule__TaskContext__Group_10__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2676:2: rule__TaskContext__Group_10__0__Impl rule__TaskContext__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10__0__Impl_in_rule__TaskContext__Group_10__05315);
            rule__TaskContext__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10__1_in_rule__TaskContext__Group_10__05318);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2683:1: rule__TaskContext__Group_10__0__Impl : ( 'operations' ) ;
    public final void rule__TaskContext__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2687:1: ( ( 'operations' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2688:1: ( 'operations' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2688:1: ( 'operations' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2689:1: 'operations'
            {
             before(grammarAccess.getTaskContextAccess().getOperationsKeyword_10_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__TaskContext__Group_10__0__Impl5346); 
             after(grammarAccess.getTaskContextAccess().getOperationsKeyword_10_0()); 

            }


            }

        }
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2702:1: rule__TaskContext__Group_10__1 : rule__TaskContext__Group_10__1__Impl rule__TaskContext__Group_10__2 ;
    public final void rule__TaskContext__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2706:1: ( rule__TaskContext__Group_10__1__Impl rule__TaskContext__Group_10__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2707:2: rule__TaskContext__Group_10__1__Impl rule__TaskContext__Group_10__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10__1__Impl_in_rule__TaskContext__Group_10__15377);
            rule__TaskContext__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10__2_in_rule__TaskContext__Group_10__15380);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2714:1: rule__TaskContext__Group_10__1__Impl : ( '{' ) ;
    public final void rule__TaskContext__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2718:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2719:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2719:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2720:1: '{'
            {
             before(grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_10_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__TaskContext__Group_10__1__Impl5408); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2733:1: rule__TaskContext__Group_10__2 : rule__TaskContext__Group_10__2__Impl rule__TaskContext__Group_10__3 ;
    public final void rule__TaskContext__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2737:1: ( rule__TaskContext__Group_10__2__Impl rule__TaskContext__Group_10__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2738:2: rule__TaskContext__Group_10__2__Impl rule__TaskContext__Group_10__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10__2__Impl_in_rule__TaskContext__Group_10__25439);
            rule__TaskContext__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10__3_in_rule__TaskContext__Group_10__25442);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2745:1: rule__TaskContext__Group_10__2__Impl : ( ( rule__TaskContext__OperationsAssignment_10_2 ) ) ;
    public final void rule__TaskContext__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2749:1: ( ( ( rule__TaskContext__OperationsAssignment_10_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2750:1: ( ( rule__TaskContext__OperationsAssignment_10_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2750:1: ( ( rule__TaskContext__OperationsAssignment_10_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2751:1: ( rule__TaskContext__OperationsAssignment_10_2 )
            {
             before(grammarAccess.getTaskContextAccess().getOperationsAssignment_10_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2752:1: ( rule__TaskContext__OperationsAssignment_10_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2752:2: rule__TaskContext__OperationsAssignment_10_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__OperationsAssignment_10_2_in_rule__TaskContext__Group_10__2__Impl5469);
            rule__TaskContext__OperationsAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskContextAccess().getOperationsAssignment_10_2()); 

            }


            }

        }
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2762:1: rule__TaskContext__Group_10__3 : rule__TaskContext__Group_10__3__Impl rule__TaskContext__Group_10__4 ;
    public final void rule__TaskContext__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2766:1: ( rule__TaskContext__Group_10__3__Impl rule__TaskContext__Group_10__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2767:2: rule__TaskContext__Group_10__3__Impl rule__TaskContext__Group_10__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10__3__Impl_in_rule__TaskContext__Group_10__35499);
            rule__TaskContext__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10__4_in_rule__TaskContext__Group_10__35502);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2774:1: rule__TaskContext__Group_10__3__Impl : ( ( rule__TaskContext__Group_10_3__0 )* ) ;
    public final void rule__TaskContext__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2778:1: ( ( ( rule__TaskContext__Group_10_3__0 )* ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2779:1: ( ( rule__TaskContext__Group_10_3__0 )* )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2779:1: ( ( rule__TaskContext__Group_10_3__0 )* )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2780:1: ( rule__TaskContext__Group_10_3__0 )*
            {
             before(grammarAccess.getTaskContextAccess().getGroup_10_3()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2781:1: ( rule__TaskContext__Group_10_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==24) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2781:2: rule__TaskContext__Group_10_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10_3__0_in_rule__TaskContext__Group_10__3__Impl5529);
            	    rule__TaskContext__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2791:1: rule__TaskContext__Group_10__4 : rule__TaskContext__Group_10__4__Impl ;
    public final void rule__TaskContext__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2795:1: ( rule__TaskContext__Group_10__4__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2796:2: rule__TaskContext__Group_10__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10__4__Impl_in_rule__TaskContext__Group_10__45560);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2802:1: rule__TaskContext__Group_10__4__Impl : ( '}' ) ;
    public final void rule__TaskContext__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2806:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2807:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2807:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2808:1: '}'
            {
             before(grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_10_4()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__TaskContext__Group_10__4__Impl5588); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2831:1: rule__TaskContext__Group_10_3__0 : rule__TaskContext__Group_10_3__0__Impl rule__TaskContext__Group_10_3__1 ;
    public final void rule__TaskContext__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2835:1: ( rule__TaskContext__Group_10_3__0__Impl rule__TaskContext__Group_10_3__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2836:2: rule__TaskContext__Group_10_3__0__Impl rule__TaskContext__Group_10_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10_3__0__Impl_in_rule__TaskContext__Group_10_3__05629);
            rule__TaskContext__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10_3__1_in_rule__TaskContext__Group_10_3__05632);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2843:1: rule__TaskContext__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__TaskContext__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2847:1: ( ( ',' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2848:1: ( ',' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2848:1: ( ',' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2849:1: ','
            {
             before(grammarAccess.getTaskContextAccess().getCommaKeyword_10_3_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__TaskContext__Group_10_3__0__Impl5660); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2862:1: rule__TaskContext__Group_10_3__1 : rule__TaskContext__Group_10_3__1__Impl ;
    public final void rule__TaskContext__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2866:1: ( rule__TaskContext__Group_10_3__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2867:2: rule__TaskContext__Group_10_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10_3__1__Impl_in_rule__TaskContext__Group_10_3__15691);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2873:1: rule__TaskContext__Group_10_3__1__Impl : ( ( rule__TaskContext__OperationsAssignment_10_3_1 ) ) ;
    public final void rule__TaskContext__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2877:1: ( ( ( rule__TaskContext__OperationsAssignment_10_3_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2878:1: ( ( rule__TaskContext__OperationsAssignment_10_3_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2878:1: ( ( rule__TaskContext__OperationsAssignment_10_3_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2879:1: ( rule__TaskContext__OperationsAssignment_10_3_1 )
            {
             before(grammarAccess.getTaskContextAccess().getOperationsAssignment_10_3_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2880:1: ( rule__TaskContext__OperationsAssignment_10_3_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2880:2: rule__TaskContext__OperationsAssignment_10_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__OperationsAssignment_10_3_1_in_rule__TaskContext__Group_10_3__1__Impl5718);
            rule__TaskContext__OperationsAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskContextAccess().getOperationsAssignment_10_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__PeerGroup__Group__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2894:1: rule__PeerGroup__Group__0 : rule__PeerGroup__Group__0__Impl rule__PeerGroup__Group__1 ;
    public final void rule__PeerGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2898:1: ( rule__PeerGroup__Group__0__Impl rule__PeerGroup__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2899:2: rule__PeerGroup__Group__0__Impl rule__PeerGroup__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group__0__Impl_in_rule__PeerGroup__Group__05752);
            rule__PeerGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group__1_in_rule__PeerGroup__Group__05755);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2906:1: rule__PeerGroup__Group__0__Impl : ( 'PeerGroup' ) ;
    public final void rule__PeerGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2910:1: ( ( 'PeerGroup' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2911:1: ( 'PeerGroup' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2911:1: ( 'PeerGroup' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2912:1: 'PeerGroup'
            {
             before(grammarAccess.getPeerGroupAccess().getPeerGroupKeyword_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__PeerGroup__Group__0__Impl5783); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2925:1: rule__PeerGroup__Group__1 : rule__PeerGroup__Group__1__Impl rule__PeerGroup__Group__2 ;
    public final void rule__PeerGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2929:1: ( rule__PeerGroup__Group__1__Impl rule__PeerGroup__Group__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2930:2: rule__PeerGroup__Group__1__Impl rule__PeerGroup__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group__1__Impl_in_rule__PeerGroup__Group__15814);
            rule__PeerGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group__2_in_rule__PeerGroup__Group__15817);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2937:1: rule__PeerGroup__Group__1__Impl : ( ( rule__PeerGroup__NameAssignment_1 ) ) ;
    public final void rule__PeerGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2941:1: ( ( ( rule__PeerGroup__NameAssignment_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2942:1: ( ( rule__PeerGroup__NameAssignment_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2942:1: ( ( rule__PeerGroup__NameAssignment_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2943:1: ( rule__PeerGroup__NameAssignment_1 )
            {
             before(grammarAccess.getPeerGroupAccess().getNameAssignment_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2944:1: ( rule__PeerGroup__NameAssignment_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2944:2: rule__PeerGroup__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__NameAssignment_1_in_rule__PeerGroup__Group__1__Impl5844);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2954:1: rule__PeerGroup__Group__2 : rule__PeerGroup__Group__2__Impl rule__PeerGroup__Group__3 ;
    public final void rule__PeerGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2958:1: ( rule__PeerGroup__Group__2__Impl rule__PeerGroup__Group__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2959:2: rule__PeerGroup__Group__2__Impl rule__PeerGroup__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group__2__Impl_in_rule__PeerGroup__Group__25874);
            rule__PeerGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group__3_in_rule__PeerGroup__Group__25877);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2966:1: rule__PeerGroup__Group__2__Impl : ( '{' ) ;
    public final void rule__PeerGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2970:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2971:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2971:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2972:1: '{'
            {
             before(grammarAccess.getPeerGroupAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__PeerGroup__Group__2__Impl5905); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2985:1: rule__PeerGroup__Group__3 : rule__PeerGroup__Group__3__Impl rule__PeerGroup__Group__4 ;
    public final void rule__PeerGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2989:1: ( rule__PeerGroup__Group__3__Impl rule__PeerGroup__Group__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2990:2: rule__PeerGroup__Group__3__Impl rule__PeerGroup__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group__3__Impl_in_rule__PeerGroup__Group__35936);
            rule__PeerGroup__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group__4_in_rule__PeerGroup__Group__35939);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2997:1: rule__PeerGroup__Group__3__Impl : ( 'coordinator' ) ;
    public final void rule__PeerGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3001:1: ( ( 'coordinator' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3002:1: ( 'coordinator' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3002:1: ( 'coordinator' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3003:1: 'coordinator'
            {
             before(grammarAccess.getPeerGroupAccess().getCoordinatorKeyword_3()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__PeerGroup__Group__3__Impl5967); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3016:1: rule__PeerGroup__Group__4 : rule__PeerGroup__Group__4__Impl rule__PeerGroup__Group__5 ;
    public final void rule__PeerGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3020:1: ( rule__PeerGroup__Group__4__Impl rule__PeerGroup__Group__5 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3021:2: rule__PeerGroup__Group__4__Impl rule__PeerGroup__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group__4__Impl_in_rule__PeerGroup__Group__45998);
            rule__PeerGroup__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group__5_in_rule__PeerGroup__Group__46001);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3028:1: rule__PeerGroup__Group__4__Impl : ( ( rule__PeerGroup__CoordinatorAssignment_4 ) ) ;
    public final void rule__PeerGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3032:1: ( ( ( rule__PeerGroup__CoordinatorAssignment_4 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3033:1: ( ( rule__PeerGroup__CoordinatorAssignment_4 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3033:1: ( ( rule__PeerGroup__CoordinatorAssignment_4 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3034:1: ( rule__PeerGroup__CoordinatorAssignment_4 )
            {
             before(grammarAccess.getPeerGroupAccess().getCoordinatorAssignment_4()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3035:1: ( rule__PeerGroup__CoordinatorAssignment_4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3035:2: rule__PeerGroup__CoordinatorAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__CoordinatorAssignment_4_in_rule__PeerGroup__Group__4__Impl6028);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3045:1: rule__PeerGroup__Group__5 : rule__PeerGroup__Group__5__Impl rule__PeerGroup__Group__6 ;
    public final void rule__PeerGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3049:1: ( rule__PeerGroup__Group__5__Impl rule__PeerGroup__Group__6 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3050:2: rule__PeerGroup__Group__5__Impl rule__PeerGroup__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group__5__Impl_in_rule__PeerGroup__Group__56058);
            rule__PeerGroup__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group__6_in_rule__PeerGroup__Group__56061);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3057:1: rule__PeerGroup__Group__5__Impl : ( ( rule__PeerGroup__Group_5__0 )? ) ;
    public final void rule__PeerGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3061:1: ( ( ( rule__PeerGroup__Group_5__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3062:1: ( ( rule__PeerGroup__Group_5__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3062:1: ( ( rule__PeerGroup__Group_5__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3063:1: ( rule__PeerGroup__Group_5__0 )?
            {
             before(grammarAccess.getPeerGroupAccess().getGroup_5()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3064:1: ( rule__PeerGroup__Group_5__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3064:2: rule__PeerGroup__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group_5__0_in_rule__PeerGroup__Group__5__Impl6088);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3074:1: rule__PeerGroup__Group__6 : rule__PeerGroup__Group__6__Impl ;
    public final void rule__PeerGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3078:1: ( rule__PeerGroup__Group__6__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3079:2: rule__PeerGroup__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group__6__Impl_in_rule__PeerGroup__Group__66119);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3085:1: rule__PeerGroup__Group__6__Impl : ( '}' ) ;
    public final void rule__PeerGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3089:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3090:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3090:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3091:1: '}'
            {
             before(grammarAccess.getPeerGroupAccess().getRightCurlyBracketKeyword_6()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__PeerGroup__Group__6__Impl6147); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3118:1: rule__PeerGroup__Group_5__0 : rule__PeerGroup__Group_5__0__Impl rule__PeerGroup__Group_5__1 ;
    public final void rule__PeerGroup__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3122:1: ( rule__PeerGroup__Group_5__0__Impl rule__PeerGroup__Group_5__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3123:2: rule__PeerGroup__Group_5__0__Impl rule__PeerGroup__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group_5__0__Impl_in_rule__PeerGroup__Group_5__06192);
            rule__PeerGroup__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group_5__1_in_rule__PeerGroup__Group_5__06195);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3130:1: rule__PeerGroup__Group_5__0__Impl : ( 'members' ) ;
    public final void rule__PeerGroup__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3134:1: ( ( 'members' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3135:1: ( 'members' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3135:1: ( 'members' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3136:1: 'members'
            {
             before(grammarAccess.getPeerGroupAccess().getMembersKeyword_5_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__PeerGroup__Group_5__0__Impl6223); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3149:1: rule__PeerGroup__Group_5__1 : rule__PeerGroup__Group_5__1__Impl rule__PeerGroup__Group_5__2 ;
    public final void rule__PeerGroup__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3153:1: ( rule__PeerGroup__Group_5__1__Impl rule__PeerGroup__Group_5__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3154:2: rule__PeerGroup__Group_5__1__Impl rule__PeerGroup__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group_5__1__Impl_in_rule__PeerGroup__Group_5__16254);
            rule__PeerGroup__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group_5__2_in_rule__PeerGroup__Group_5__16257);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3161:1: rule__PeerGroup__Group_5__1__Impl : ( '(' ) ;
    public final void rule__PeerGroup__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3165:1: ( ( '(' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3166:1: ( '(' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3166:1: ( '(' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3167:1: '('
            {
             before(grammarAccess.getPeerGroupAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__PeerGroup__Group_5__1__Impl6285); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3180:1: rule__PeerGroup__Group_5__2 : rule__PeerGroup__Group_5__2__Impl rule__PeerGroup__Group_5__3 ;
    public final void rule__PeerGroup__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3184:1: ( rule__PeerGroup__Group_5__2__Impl rule__PeerGroup__Group_5__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3185:2: rule__PeerGroup__Group_5__2__Impl rule__PeerGroup__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group_5__2__Impl_in_rule__PeerGroup__Group_5__26316);
            rule__PeerGroup__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group_5__3_in_rule__PeerGroup__Group_5__26319);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3192:1: rule__PeerGroup__Group_5__2__Impl : ( ( rule__PeerGroup__MembersAssignment_5_2 ) ) ;
    public final void rule__PeerGroup__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3196:1: ( ( ( rule__PeerGroup__MembersAssignment_5_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3197:1: ( ( rule__PeerGroup__MembersAssignment_5_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3197:1: ( ( rule__PeerGroup__MembersAssignment_5_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3198:1: ( rule__PeerGroup__MembersAssignment_5_2 )
            {
             before(grammarAccess.getPeerGroupAccess().getMembersAssignment_5_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3199:1: ( rule__PeerGroup__MembersAssignment_5_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3199:2: rule__PeerGroup__MembersAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__MembersAssignment_5_2_in_rule__PeerGroup__Group_5__2__Impl6346);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3209:1: rule__PeerGroup__Group_5__3 : rule__PeerGroup__Group_5__3__Impl rule__PeerGroup__Group_5__4 ;
    public final void rule__PeerGroup__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3213:1: ( rule__PeerGroup__Group_5__3__Impl rule__PeerGroup__Group_5__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3214:2: rule__PeerGroup__Group_5__3__Impl rule__PeerGroup__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group_5__3__Impl_in_rule__PeerGroup__Group_5__36376);
            rule__PeerGroup__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group_5__4_in_rule__PeerGroup__Group_5__36379);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3221:1: rule__PeerGroup__Group_5__3__Impl : ( ( rule__PeerGroup__Group_5_3__0 )* ) ;
    public final void rule__PeerGroup__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3225:1: ( ( ( rule__PeerGroup__Group_5_3__0 )* ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3226:1: ( ( rule__PeerGroup__Group_5_3__0 )* )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3226:1: ( ( rule__PeerGroup__Group_5_3__0 )* )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3227:1: ( rule__PeerGroup__Group_5_3__0 )*
            {
             before(grammarAccess.getPeerGroupAccess().getGroup_5_3()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3228:1: ( rule__PeerGroup__Group_5_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==24) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3228:2: rule__PeerGroup__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group_5_3__0_in_rule__PeerGroup__Group_5__3__Impl6406);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3238:1: rule__PeerGroup__Group_5__4 : rule__PeerGroup__Group_5__4__Impl ;
    public final void rule__PeerGroup__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3242:1: ( rule__PeerGroup__Group_5__4__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3243:2: rule__PeerGroup__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group_5__4__Impl_in_rule__PeerGroup__Group_5__46437);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3249:1: rule__PeerGroup__Group_5__4__Impl : ( ')' ) ;
    public final void rule__PeerGroup__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3253:1: ( ( ')' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3254:1: ( ')' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3254:1: ( ')' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3255:1: ')'
            {
             before(grammarAccess.getPeerGroupAccess().getRightParenthesisKeyword_5_4()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__PeerGroup__Group_5__4__Impl6465); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3278:1: rule__PeerGroup__Group_5_3__0 : rule__PeerGroup__Group_5_3__0__Impl rule__PeerGroup__Group_5_3__1 ;
    public final void rule__PeerGroup__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3282:1: ( rule__PeerGroup__Group_5_3__0__Impl rule__PeerGroup__Group_5_3__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3283:2: rule__PeerGroup__Group_5_3__0__Impl rule__PeerGroup__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group_5_3__0__Impl_in_rule__PeerGroup__Group_5_3__06506);
            rule__PeerGroup__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group_5_3__1_in_rule__PeerGroup__Group_5_3__06509);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3290:1: rule__PeerGroup__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__PeerGroup__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3294:1: ( ( ',' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3295:1: ( ',' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3295:1: ( ',' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3296:1: ','
            {
             before(grammarAccess.getPeerGroupAccess().getCommaKeyword_5_3_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__PeerGroup__Group_5_3__0__Impl6537); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3309:1: rule__PeerGroup__Group_5_3__1 : rule__PeerGroup__Group_5_3__1__Impl ;
    public final void rule__PeerGroup__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3313:1: ( rule__PeerGroup__Group_5_3__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3314:2: rule__PeerGroup__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__Group_5_3__1__Impl_in_rule__PeerGroup__Group_5_3__16568);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3320:1: rule__PeerGroup__Group_5_3__1__Impl : ( ( rule__PeerGroup__MembersAssignment_5_3_1 ) ) ;
    public final void rule__PeerGroup__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3324:1: ( ( ( rule__PeerGroup__MembersAssignment_5_3_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3325:1: ( ( rule__PeerGroup__MembersAssignment_5_3_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3325:1: ( ( rule__PeerGroup__MembersAssignment_5_3_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3326:1: ( rule__PeerGroup__MembersAssignment_5_3_1 )
            {
             before(grammarAccess.getPeerGroupAccess().getMembersAssignment_5_3_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3327:1: ( rule__PeerGroup__MembersAssignment_5_3_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3327:2: rule__PeerGroup__MembersAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PeerGroup__MembersAssignment_5_3_1_in_rule__PeerGroup__Group_5_3__1__Impl6595);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3341:1: rule__ConnectionPolicy__Group__0 : rule__ConnectionPolicy__Group__0__Impl rule__ConnectionPolicy__Group__1 ;
    public final void rule__ConnectionPolicy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3345:1: ( rule__ConnectionPolicy__Group__0__Impl rule__ConnectionPolicy__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3346:2: rule__ConnectionPolicy__Group__0__Impl rule__ConnectionPolicy__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__0__Impl_in_rule__ConnectionPolicy__Group__06629);
            rule__ConnectionPolicy__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__1_in_rule__ConnectionPolicy__Group__06632);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3353:1: rule__ConnectionPolicy__Group__0__Impl : ( 'ConnectionPolicy' ) ;
    public final void rule__ConnectionPolicy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3357:1: ( ( 'ConnectionPolicy' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3358:1: ( 'ConnectionPolicy' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3358:1: ( 'ConnectionPolicy' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3359:1: 'ConnectionPolicy'
            {
             before(grammarAccess.getConnectionPolicyAccess().getConnectionPolicyKeyword_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__ConnectionPolicy__Group__0__Impl6660); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3372:1: rule__ConnectionPolicy__Group__1 : rule__ConnectionPolicy__Group__1__Impl rule__ConnectionPolicy__Group__2 ;
    public final void rule__ConnectionPolicy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3376:1: ( rule__ConnectionPolicy__Group__1__Impl rule__ConnectionPolicy__Group__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3377:2: rule__ConnectionPolicy__Group__1__Impl rule__ConnectionPolicy__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__1__Impl_in_rule__ConnectionPolicy__Group__16691);
            rule__ConnectionPolicy__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__2_in_rule__ConnectionPolicy__Group__16694);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3384:1: rule__ConnectionPolicy__Group__1__Impl : ( ( rule__ConnectionPolicy__NameAssignment_1 ) ) ;
    public final void rule__ConnectionPolicy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3388:1: ( ( ( rule__ConnectionPolicy__NameAssignment_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3389:1: ( ( rule__ConnectionPolicy__NameAssignment_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3389:1: ( ( rule__ConnectionPolicy__NameAssignment_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3390:1: ( rule__ConnectionPolicy__NameAssignment_1 )
            {
             before(grammarAccess.getConnectionPolicyAccess().getNameAssignment_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3391:1: ( rule__ConnectionPolicy__NameAssignment_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3391:2: rule__ConnectionPolicy__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__NameAssignment_1_in_rule__ConnectionPolicy__Group__1__Impl6721);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3401:1: rule__ConnectionPolicy__Group__2 : rule__ConnectionPolicy__Group__2__Impl rule__ConnectionPolicy__Group__3 ;
    public final void rule__ConnectionPolicy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3405:1: ( rule__ConnectionPolicy__Group__2__Impl rule__ConnectionPolicy__Group__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3406:2: rule__ConnectionPolicy__Group__2__Impl rule__ConnectionPolicy__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__2__Impl_in_rule__ConnectionPolicy__Group__26751);
            rule__ConnectionPolicy__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__3_in_rule__ConnectionPolicy__Group__26754);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3413:1: rule__ConnectionPolicy__Group__2__Impl : ( '{' ) ;
    public final void rule__ConnectionPolicy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3417:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3418:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3418:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3419:1: '{'
            {
             before(grammarAccess.getConnectionPolicyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__ConnectionPolicy__Group__2__Impl6782); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3432:1: rule__ConnectionPolicy__Group__3 : rule__ConnectionPolicy__Group__3__Impl rule__ConnectionPolicy__Group__4 ;
    public final void rule__ConnectionPolicy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3436:1: ( rule__ConnectionPolicy__Group__3__Impl rule__ConnectionPolicy__Group__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3437:2: rule__ConnectionPolicy__Group__3__Impl rule__ConnectionPolicy__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__3__Impl_in_rule__ConnectionPolicy__Group__36813);
            rule__ConnectionPolicy__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__4_in_rule__ConnectionPolicy__Group__36816);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3444:1: rule__ConnectionPolicy__Group__3__Impl : ( ( rule__ConnectionPolicy__Group_3__0 )? ) ;
    public final void rule__ConnectionPolicy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3448:1: ( ( ( rule__ConnectionPolicy__Group_3__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3449:1: ( ( rule__ConnectionPolicy__Group_3__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3449:1: ( ( rule__ConnectionPolicy__Group_3__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3450:1: ( rule__ConnectionPolicy__Group_3__0 )?
            {
             before(grammarAccess.getConnectionPolicyAccess().getGroup_3()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3451:1: ( rule__ConnectionPolicy__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==42) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3451:2: rule__ConnectionPolicy__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_3__0_in_rule__ConnectionPolicy__Group__3__Impl6843);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3461:1: rule__ConnectionPolicy__Group__4 : rule__ConnectionPolicy__Group__4__Impl rule__ConnectionPolicy__Group__5 ;
    public final void rule__ConnectionPolicy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3465:1: ( rule__ConnectionPolicy__Group__4__Impl rule__ConnectionPolicy__Group__5 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3466:2: rule__ConnectionPolicy__Group__4__Impl rule__ConnectionPolicy__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__4__Impl_in_rule__ConnectionPolicy__Group__46874);
            rule__ConnectionPolicy__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__5_in_rule__ConnectionPolicy__Group__46877);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3473:1: rule__ConnectionPolicy__Group__4__Impl : ( ( rule__ConnectionPolicy__Group_4__0 )? ) ;
    public final void rule__ConnectionPolicy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3477:1: ( ( ( rule__ConnectionPolicy__Group_4__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3478:1: ( ( rule__ConnectionPolicy__Group_4__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3478:1: ( ( rule__ConnectionPolicy__Group_4__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3479:1: ( rule__ConnectionPolicy__Group_4__0 )?
            {
             before(grammarAccess.getConnectionPolicyAccess().getGroup_4()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3480:1: ( rule__ConnectionPolicy__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==43) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3480:2: rule__ConnectionPolicy__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_4__0_in_rule__ConnectionPolicy__Group__4__Impl6904);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3490:1: rule__ConnectionPolicy__Group__5 : rule__ConnectionPolicy__Group__5__Impl rule__ConnectionPolicy__Group__6 ;
    public final void rule__ConnectionPolicy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3494:1: ( rule__ConnectionPolicy__Group__5__Impl rule__ConnectionPolicy__Group__6 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3495:2: rule__ConnectionPolicy__Group__5__Impl rule__ConnectionPolicy__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__5__Impl_in_rule__ConnectionPolicy__Group__56935);
            rule__ConnectionPolicy__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__6_in_rule__ConnectionPolicy__Group__56938);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3502:1: rule__ConnectionPolicy__Group__5__Impl : ( ( rule__ConnectionPolicy__Group_5__0 )? ) ;
    public final void rule__ConnectionPolicy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3506:1: ( ( ( rule__ConnectionPolicy__Group_5__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3507:1: ( ( rule__ConnectionPolicy__Group_5__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3507:1: ( ( rule__ConnectionPolicy__Group_5__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3508:1: ( rule__ConnectionPolicy__Group_5__0 )?
            {
             before(grammarAccess.getConnectionPolicyAccess().getGroup_5()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3509:1: ( rule__ConnectionPolicy__Group_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3509:2: rule__ConnectionPolicy__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_5__0_in_rule__ConnectionPolicy__Group__5__Impl6965);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3519:1: rule__ConnectionPolicy__Group__6 : rule__ConnectionPolicy__Group__6__Impl rule__ConnectionPolicy__Group__7 ;
    public final void rule__ConnectionPolicy__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3523:1: ( rule__ConnectionPolicy__Group__6__Impl rule__ConnectionPolicy__Group__7 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3524:2: rule__ConnectionPolicy__Group__6__Impl rule__ConnectionPolicy__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__6__Impl_in_rule__ConnectionPolicy__Group__66996);
            rule__ConnectionPolicy__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__7_in_rule__ConnectionPolicy__Group__66999);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3531:1: rule__ConnectionPolicy__Group__6__Impl : ( 'inputPort' ) ;
    public final void rule__ConnectionPolicy__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3535:1: ( ( 'inputPort' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3536:1: ( 'inputPort' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3536:1: ( 'inputPort' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3537:1: 'inputPort'
            {
             before(grammarAccess.getConnectionPolicyAccess().getInputPortKeyword_6()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__ConnectionPolicy__Group__6__Impl7027); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3550:1: rule__ConnectionPolicy__Group__7 : rule__ConnectionPolicy__Group__7__Impl rule__ConnectionPolicy__Group__8 ;
    public final void rule__ConnectionPolicy__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3554:1: ( rule__ConnectionPolicy__Group__7__Impl rule__ConnectionPolicy__Group__8 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3555:2: rule__ConnectionPolicy__Group__7__Impl rule__ConnectionPolicy__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__7__Impl_in_rule__ConnectionPolicy__Group__77058);
            rule__ConnectionPolicy__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__8_in_rule__ConnectionPolicy__Group__77061);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3562:1: rule__ConnectionPolicy__Group__7__Impl : ( ( rule__ConnectionPolicy__InputPortAssignment_7 ) ) ;
    public final void rule__ConnectionPolicy__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3566:1: ( ( ( rule__ConnectionPolicy__InputPortAssignment_7 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3567:1: ( ( rule__ConnectionPolicy__InputPortAssignment_7 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3567:1: ( ( rule__ConnectionPolicy__InputPortAssignment_7 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3568:1: ( rule__ConnectionPolicy__InputPortAssignment_7 )
            {
             before(grammarAccess.getConnectionPolicyAccess().getInputPortAssignment_7()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3569:1: ( rule__ConnectionPolicy__InputPortAssignment_7 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3569:2: rule__ConnectionPolicy__InputPortAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__InputPortAssignment_7_in_rule__ConnectionPolicy__Group__7__Impl7088);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3579:1: rule__ConnectionPolicy__Group__8 : rule__ConnectionPolicy__Group__8__Impl rule__ConnectionPolicy__Group__9 ;
    public final void rule__ConnectionPolicy__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3583:1: ( rule__ConnectionPolicy__Group__8__Impl rule__ConnectionPolicy__Group__9 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3584:2: rule__ConnectionPolicy__Group__8__Impl rule__ConnectionPolicy__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__8__Impl_in_rule__ConnectionPolicy__Group__87118);
            rule__ConnectionPolicy__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__9_in_rule__ConnectionPolicy__Group__87121);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3591:1: rule__ConnectionPolicy__Group__8__Impl : ( 'outputPort' ) ;
    public final void rule__ConnectionPolicy__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3595:1: ( ( 'outputPort' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3596:1: ( 'outputPort' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3596:1: ( 'outputPort' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3597:1: 'outputPort'
            {
             before(grammarAccess.getConnectionPolicyAccess().getOutputPortKeyword_8()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__ConnectionPolicy__Group__8__Impl7149); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3610:1: rule__ConnectionPolicy__Group__9 : rule__ConnectionPolicy__Group__9__Impl rule__ConnectionPolicy__Group__10 ;
    public final void rule__ConnectionPolicy__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3614:1: ( rule__ConnectionPolicy__Group__9__Impl rule__ConnectionPolicy__Group__10 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3615:2: rule__ConnectionPolicy__Group__9__Impl rule__ConnectionPolicy__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__9__Impl_in_rule__ConnectionPolicy__Group__97180);
            rule__ConnectionPolicy__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__10_in_rule__ConnectionPolicy__Group__97183);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3622:1: rule__ConnectionPolicy__Group__9__Impl : ( ( rule__ConnectionPolicy__OutputPortAssignment_9 ) ) ;
    public final void rule__ConnectionPolicy__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3626:1: ( ( ( rule__ConnectionPolicy__OutputPortAssignment_9 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3627:1: ( ( rule__ConnectionPolicy__OutputPortAssignment_9 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3627:1: ( ( rule__ConnectionPolicy__OutputPortAssignment_9 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3628:1: ( rule__ConnectionPolicy__OutputPortAssignment_9 )
            {
             before(grammarAccess.getConnectionPolicyAccess().getOutputPortAssignment_9()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3629:1: ( rule__ConnectionPolicy__OutputPortAssignment_9 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3629:2: rule__ConnectionPolicy__OutputPortAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__OutputPortAssignment_9_in_rule__ConnectionPolicy__Group__9__Impl7210);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3639:1: rule__ConnectionPolicy__Group__10 : rule__ConnectionPolicy__Group__10__Impl ;
    public final void rule__ConnectionPolicy__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3643:1: ( rule__ConnectionPolicy__Group__10__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3644:2: rule__ConnectionPolicy__Group__10__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__10__Impl_in_rule__ConnectionPolicy__Group__107240);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3650:1: rule__ConnectionPolicy__Group__10__Impl : ( '}' ) ;
    public final void rule__ConnectionPolicy__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3654:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3655:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3655:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3656:1: '}'
            {
             before(grammarAccess.getConnectionPolicyAccess().getRightCurlyBracketKeyword_10()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__ConnectionPolicy__Group__10__Impl7268); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3691:1: rule__ConnectionPolicy__Group_3__0 : rule__ConnectionPolicy__Group_3__0__Impl rule__ConnectionPolicy__Group_3__1 ;
    public final void rule__ConnectionPolicy__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3695:1: ( rule__ConnectionPolicy__Group_3__0__Impl rule__ConnectionPolicy__Group_3__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3696:2: rule__ConnectionPolicy__Group_3__0__Impl rule__ConnectionPolicy__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_3__0__Impl_in_rule__ConnectionPolicy__Group_3__07321);
            rule__ConnectionPolicy__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_3__1_in_rule__ConnectionPolicy__Group_3__07324);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3703:1: rule__ConnectionPolicy__Group_3__0__Impl : ( 'bufferSize' ) ;
    public final void rule__ConnectionPolicy__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3707:1: ( ( 'bufferSize' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3708:1: ( 'bufferSize' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3708:1: ( 'bufferSize' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3709:1: 'bufferSize'
            {
             before(grammarAccess.getConnectionPolicyAccess().getBufferSizeKeyword_3_0()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__ConnectionPolicy__Group_3__0__Impl7352); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3722:1: rule__ConnectionPolicy__Group_3__1 : rule__ConnectionPolicy__Group_3__1__Impl ;
    public final void rule__ConnectionPolicy__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3726:1: ( rule__ConnectionPolicy__Group_3__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3727:2: rule__ConnectionPolicy__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_3__1__Impl_in_rule__ConnectionPolicy__Group_3__17383);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3733:1: rule__ConnectionPolicy__Group_3__1__Impl : ( ( rule__ConnectionPolicy__BufferSizeAssignment_3_1 ) ) ;
    public final void rule__ConnectionPolicy__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3737:1: ( ( ( rule__ConnectionPolicy__BufferSizeAssignment_3_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3738:1: ( ( rule__ConnectionPolicy__BufferSizeAssignment_3_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3738:1: ( ( rule__ConnectionPolicy__BufferSizeAssignment_3_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3739:1: ( rule__ConnectionPolicy__BufferSizeAssignment_3_1 )
            {
             before(grammarAccess.getConnectionPolicyAccess().getBufferSizeAssignment_3_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3740:1: ( rule__ConnectionPolicy__BufferSizeAssignment_3_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3740:2: rule__ConnectionPolicy__BufferSizeAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__BufferSizeAssignment_3_1_in_rule__ConnectionPolicy__Group_3__1__Impl7410);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3754:1: rule__ConnectionPolicy__Group_4__0 : rule__ConnectionPolicy__Group_4__0__Impl rule__ConnectionPolicy__Group_4__1 ;
    public final void rule__ConnectionPolicy__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3758:1: ( rule__ConnectionPolicy__Group_4__0__Impl rule__ConnectionPolicy__Group_4__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3759:2: rule__ConnectionPolicy__Group_4__0__Impl rule__ConnectionPolicy__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_4__0__Impl_in_rule__ConnectionPolicy__Group_4__07444);
            rule__ConnectionPolicy__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_4__1_in_rule__ConnectionPolicy__Group_4__07447);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3766:1: rule__ConnectionPolicy__Group_4__0__Impl : ( 'lockPolicy' ) ;
    public final void rule__ConnectionPolicy__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3770:1: ( ( 'lockPolicy' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3771:1: ( 'lockPolicy' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3771:1: ( 'lockPolicy' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3772:1: 'lockPolicy'
            {
             before(grammarAccess.getConnectionPolicyAccess().getLockPolicyKeyword_4_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__ConnectionPolicy__Group_4__0__Impl7475); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3785:1: rule__ConnectionPolicy__Group_4__1 : rule__ConnectionPolicy__Group_4__1__Impl ;
    public final void rule__ConnectionPolicy__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3789:1: ( rule__ConnectionPolicy__Group_4__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3790:2: rule__ConnectionPolicy__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_4__1__Impl_in_rule__ConnectionPolicy__Group_4__17506);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3796:1: rule__ConnectionPolicy__Group_4__1__Impl : ( ( rule__ConnectionPolicy__LockPolicyAssignment_4_1 ) ) ;
    public final void rule__ConnectionPolicy__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3800:1: ( ( ( rule__ConnectionPolicy__LockPolicyAssignment_4_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3801:1: ( ( rule__ConnectionPolicy__LockPolicyAssignment_4_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3801:1: ( ( rule__ConnectionPolicy__LockPolicyAssignment_4_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3802:1: ( rule__ConnectionPolicy__LockPolicyAssignment_4_1 )
            {
             before(grammarAccess.getConnectionPolicyAccess().getLockPolicyAssignment_4_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3803:1: ( rule__ConnectionPolicy__LockPolicyAssignment_4_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3803:2: rule__ConnectionPolicy__LockPolicyAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__LockPolicyAssignment_4_1_in_rule__ConnectionPolicy__Group_4__1__Impl7533);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3817:1: rule__ConnectionPolicy__Group_5__0 : rule__ConnectionPolicy__Group_5__0__Impl rule__ConnectionPolicy__Group_5__1 ;
    public final void rule__ConnectionPolicy__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3821:1: ( rule__ConnectionPolicy__Group_5__0__Impl rule__ConnectionPolicy__Group_5__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3822:2: rule__ConnectionPolicy__Group_5__0__Impl rule__ConnectionPolicy__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_5__0__Impl_in_rule__ConnectionPolicy__Group_5__07567);
            rule__ConnectionPolicy__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_5__1_in_rule__ConnectionPolicy__Group_5__07570);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3829:1: rule__ConnectionPolicy__Group_5__0__Impl : ( 'type' ) ;
    public final void rule__ConnectionPolicy__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3833:1: ( ( 'type' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3834:1: ( 'type' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3834:1: ( 'type' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3835:1: 'type'
            {
             before(grammarAccess.getConnectionPolicyAccess().getTypeKeyword_5_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__ConnectionPolicy__Group_5__0__Impl7598); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3848:1: rule__ConnectionPolicy__Group_5__1 : rule__ConnectionPolicy__Group_5__1__Impl ;
    public final void rule__ConnectionPolicy__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3852:1: ( rule__ConnectionPolicy__Group_5__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3853:2: rule__ConnectionPolicy__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_5__1__Impl_in_rule__ConnectionPolicy__Group_5__17629);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3859:1: rule__ConnectionPolicy__Group_5__1__Impl : ( ( rule__ConnectionPolicy__TypeAssignment_5_1 ) ) ;
    public final void rule__ConnectionPolicy__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3863:1: ( ( ( rule__ConnectionPolicy__TypeAssignment_5_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3864:1: ( ( rule__ConnectionPolicy__TypeAssignment_5_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3864:1: ( ( rule__ConnectionPolicy__TypeAssignment_5_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3865:1: ( rule__ConnectionPolicy__TypeAssignment_5_1 )
            {
             before(grammarAccess.getConnectionPolicyAccess().getTypeAssignment_5_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3866:1: ( rule__ConnectionPolicy__TypeAssignment_5_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3866:2: rule__ConnectionPolicy__TypeAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__TypeAssignment_5_1_in_rule__ConnectionPolicy__Group_5__1__Impl7656);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3880:1: rule__InputPort__Group__0 : rule__InputPort__Group__0__Impl rule__InputPort__Group__1 ;
    public final void rule__InputPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3884:1: ( rule__InputPort__Group__0__Impl rule__InputPort__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3885:2: rule__InputPort__Group__0__Impl rule__InputPort__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__0__Impl_in_rule__InputPort__Group__07690);
            rule__InputPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__1_in_rule__InputPort__Group__07693);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3892:1: rule__InputPort__Group__0__Impl : ( ( rule__InputPort__IsEventPortAssignment_0 ) ) ;
    public final void rule__InputPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3896:1: ( ( ( rule__InputPort__IsEventPortAssignment_0 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3897:1: ( ( rule__InputPort__IsEventPortAssignment_0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3897:1: ( ( rule__InputPort__IsEventPortAssignment_0 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3898:1: ( rule__InputPort__IsEventPortAssignment_0 )
            {
             before(grammarAccess.getInputPortAccess().getIsEventPortAssignment_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3899:1: ( rule__InputPort__IsEventPortAssignment_0 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3899:2: rule__InputPort__IsEventPortAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__IsEventPortAssignment_0_in_rule__InputPort__Group__0__Impl7720);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3909:1: rule__InputPort__Group__1 : rule__InputPort__Group__1__Impl rule__InputPort__Group__2 ;
    public final void rule__InputPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3913:1: ( rule__InputPort__Group__1__Impl rule__InputPort__Group__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3914:2: rule__InputPort__Group__1__Impl rule__InputPort__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__1__Impl_in_rule__InputPort__Group__17750);
            rule__InputPort__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__2_in_rule__InputPort__Group__17753);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3921:1: rule__InputPort__Group__1__Impl : ( 'InputPort' ) ;
    public final void rule__InputPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3925:1: ( ( 'InputPort' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3926:1: ( 'InputPort' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3926:1: ( 'InputPort' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3927:1: 'InputPort'
            {
             before(grammarAccess.getInputPortAccess().getInputPortKeyword_1()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__InputPort__Group__1__Impl7781); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3940:1: rule__InputPort__Group__2 : rule__InputPort__Group__2__Impl rule__InputPort__Group__3 ;
    public final void rule__InputPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3944:1: ( rule__InputPort__Group__2__Impl rule__InputPort__Group__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3945:2: rule__InputPort__Group__2__Impl rule__InputPort__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__2__Impl_in_rule__InputPort__Group__27812);
            rule__InputPort__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__3_in_rule__InputPort__Group__27815);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3952:1: rule__InputPort__Group__2__Impl : ( ( rule__InputPort__NameAssignment_2 ) ) ;
    public final void rule__InputPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3956:1: ( ( ( rule__InputPort__NameAssignment_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3957:1: ( ( rule__InputPort__NameAssignment_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3957:1: ( ( rule__InputPort__NameAssignment_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3958:1: ( rule__InputPort__NameAssignment_2 )
            {
             before(grammarAccess.getInputPortAccess().getNameAssignment_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3959:1: ( rule__InputPort__NameAssignment_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3959:2: rule__InputPort__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__NameAssignment_2_in_rule__InputPort__Group__2__Impl7842);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3969:1: rule__InputPort__Group__3 : rule__InputPort__Group__3__Impl rule__InputPort__Group__4 ;
    public final void rule__InputPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3973:1: ( rule__InputPort__Group__3__Impl rule__InputPort__Group__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3974:2: rule__InputPort__Group__3__Impl rule__InputPort__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__3__Impl_in_rule__InputPort__Group__37872);
            rule__InputPort__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__4_in_rule__InputPort__Group__37875);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3981:1: rule__InputPort__Group__3__Impl : ( '{' ) ;
    public final void rule__InputPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3985:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3986:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3986:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3987:1: '{'
            {
             before(grammarAccess.getInputPortAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__InputPort__Group__3__Impl7903); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4000:1: rule__InputPort__Group__4 : rule__InputPort__Group__4__Impl rule__InputPort__Group__5 ;
    public final void rule__InputPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4004:1: ( rule__InputPort__Group__4__Impl rule__InputPort__Group__5 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4005:2: rule__InputPort__Group__4__Impl rule__InputPort__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__4__Impl_in_rule__InputPort__Group__47934);
            rule__InputPort__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__5_in_rule__InputPort__Group__47937);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4012:1: rule__InputPort__Group__4__Impl : ( ( rule__InputPort__Group_4__0 )? ) ;
    public final void rule__InputPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4016:1: ( ( ( rule__InputPort__Group_4__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4017:1: ( ( rule__InputPort__Group_4__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4017:1: ( ( rule__InputPort__Group_4__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4018:1: ( rule__InputPort__Group_4__0 )?
            {
             before(grammarAccess.getInputPortAccess().getGroup_4()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4019:1: ( rule__InputPort__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==45) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4019:2: rule__InputPort__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group_4__0_in_rule__InputPort__Group__4__Impl7964);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4029:1: rule__InputPort__Group__5 : rule__InputPort__Group__5__Impl rule__InputPort__Group__6 ;
    public final void rule__InputPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4033:1: ( rule__InputPort__Group__5__Impl rule__InputPort__Group__6 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4034:2: rule__InputPort__Group__5__Impl rule__InputPort__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__5__Impl_in_rule__InputPort__Group__57995);
            rule__InputPort__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__6_in_rule__InputPort__Group__57998);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4041:1: rule__InputPort__Group__5__Impl : ( ( rule__InputPort__Group_5__0 )? ) ;
    public final void rule__InputPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4045:1: ( ( ( rule__InputPort__Group_5__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4046:1: ( ( rule__InputPort__Group_5__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4046:1: ( ( rule__InputPort__Group_5__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4047:1: ( rule__InputPort__Group_5__0 )?
            {
             before(grammarAccess.getInputPortAccess().getGroup_5()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4048:1: ( rule__InputPort__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==46) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4048:2: rule__InputPort__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group_5__0_in_rule__InputPort__Group__5__Impl8025);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4058:1: rule__InputPort__Group__6 : rule__InputPort__Group__6__Impl ;
    public final void rule__InputPort__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4062:1: ( rule__InputPort__Group__6__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4063:2: rule__InputPort__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__6__Impl_in_rule__InputPort__Group__68056);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4069:1: rule__InputPort__Group__6__Impl : ( '}' ) ;
    public final void rule__InputPort__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4073:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4074:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4074:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4075:1: '}'
            {
             before(grammarAccess.getInputPortAccess().getRightCurlyBracketKeyword_6()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__InputPort__Group__6__Impl8084); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4102:1: rule__InputPort__Group_4__0 : rule__InputPort__Group_4__0__Impl rule__InputPort__Group_4__1 ;
    public final void rule__InputPort__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4106:1: ( rule__InputPort__Group_4__0__Impl rule__InputPort__Group_4__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4107:2: rule__InputPort__Group_4__0__Impl rule__InputPort__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group_4__0__Impl_in_rule__InputPort__Group_4__08129);
            rule__InputPort__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group_4__1_in_rule__InputPort__Group_4__08132);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4114:1: rule__InputPort__Group_4__0__Impl : ( 'dataType' ) ;
    public final void rule__InputPort__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4118:1: ( ( 'dataType' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4119:1: ( 'dataType' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4119:1: ( 'dataType' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4120:1: 'dataType'
            {
             before(grammarAccess.getInputPortAccess().getDataTypeKeyword_4_0()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__InputPort__Group_4__0__Impl8160); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4133:1: rule__InputPort__Group_4__1 : rule__InputPort__Group_4__1__Impl ;
    public final void rule__InputPort__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4137:1: ( rule__InputPort__Group_4__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4138:2: rule__InputPort__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group_4__1__Impl_in_rule__InputPort__Group_4__18191);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4144:1: rule__InputPort__Group_4__1__Impl : ( ( rule__InputPort__DataTypeAssignment_4_1 ) ) ;
    public final void rule__InputPort__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4148:1: ( ( ( rule__InputPort__DataTypeAssignment_4_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4149:1: ( ( rule__InputPort__DataTypeAssignment_4_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4149:1: ( ( rule__InputPort__DataTypeAssignment_4_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4150:1: ( rule__InputPort__DataTypeAssignment_4_1 )
            {
             before(grammarAccess.getInputPortAccess().getDataTypeAssignment_4_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4151:1: ( rule__InputPort__DataTypeAssignment_4_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4151:2: rule__InputPort__DataTypeAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__DataTypeAssignment_4_1_in_rule__InputPort__Group_4__1__Impl8218);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4165:1: rule__InputPort__Group_5__0 : rule__InputPort__Group_5__0__Impl rule__InputPort__Group_5__1 ;
    public final void rule__InputPort__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4169:1: ( rule__InputPort__Group_5__0__Impl rule__InputPort__Group_5__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4170:2: rule__InputPort__Group_5__0__Impl rule__InputPort__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group_5__0__Impl_in_rule__InputPort__Group_5__08252);
            rule__InputPort__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group_5__1_in_rule__InputPort__Group_5__08255);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4177:1: rule__InputPort__Group_5__0__Impl : ( 'inputConnectionPolicy' ) ;
    public final void rule__InputPort__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4181:1: ( ( 'inputConnectionPolicy' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4182:1: ( 'inputConnectionPolicy' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4182:1: ( 'inputConnectionPolicy' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4183:1: 'inputConnectionPolicy'
            {
             before(grammarAccess.getInputPortAccess().getInputConnectionPolicyKeyword_5_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__InputPort__Group_5__0__Impl8283); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4196:1: rule__InputPort__Group_5__1 : rule__InputPort__Group_5__1__Impl ;
    public final void rule__InputPort__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4200:1: ( rule__InputPort__Group_5__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4201:2: rule__InputPort__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group_5__1__Impl_in_rule__InputPort__Group_5__18314);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4207:1: rule__InputPort__Group_5__1__Impl : ( ( rule__InputPort__InputConnectionPolicyAssignment_5_1 ) ) ;
    public final void rule__InputPort__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4211:1: ( ( ( rule__InputPort__InputConnectionPolicyAssignment_5_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4212:1: ( ( rule__InputPort__InputConnectionPolicyAssignment_5_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4212:1: ( ( rule__InputPort__InputConnectionPolicyAssignment_5_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4213:1: ( rule__InputPort__InputConnectionPolicyAssignment_5_1 )
            {
             before(grammarAccess.getInputPortAccess().getInputConnectionPolicyAssignment_5_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4214:1: ( rule__InputPort__InputConnectionPolicyAssignment_5_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4214:2: rule__InputPort__InputConnectionPolicyAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__InputConnectionPolicyAssignment_5_1_in_rule__InputPort__Group_5__1__Impl8341);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4228:1: rule__OutputPort__Group__0 : rule__OutputPort__Group__0__Impl rule__OutputPort__Group__1 ;
    public final void rule__OutputPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4232:1: ( rule__OutputPort__Group__0__Impl rule__OutputPort__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4233:2: rule__OutputPort__Group__0__Impl rule__OutputPort__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__0__Impl_in_rule__OutputPort__Group__08375);
            rule__OutputPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__1_in_rule__OutputPort__Group__08378);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4240:1: rule__OutputPort__Group__0__Impl : ( 'OutputPort' ) ;
    public final void rule__OutputPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4244:1: ( ( 'OutputPort' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4245:1: ( 'OutputPort' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4245:1: ( 'OutputPort' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4246:1: 'OutputPort'
            {
             before(grammarAccess.getOutputPortAccess().getOutputPortKeyword_0()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__OutputPort__Group__0__Impl8406); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4259:1: rule__OutputPort__Group__1 : rule__OutputPort__Group__1__Impl rule__OutputPort__Group__2 ;
    public final void rule__OutputPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4263:1: ( rule__OutputPort__Group__1__Impl rule__OutputPort__Group__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4264:2: rule__OutputPort__Group__1__Impl rule__OutputPort__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__1__Impl_in_rule__OutputPort__Group__18437);
            rule__OutputPort__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__2_in_rule__OutputPort__Group__18440);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4271:1: rule__OutputPort__Group__1__Impl : ( ( rule__OutputPort__NameAssignment_1 ) ) ;
    public final void rule__OutputPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4275:1: ( ( ( rule__OutputPort__NameAssignment_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4276:1: ( ( rule__OutputPort__NameAssignment_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4276:1: ( ( rule__OutputPort__NameAssignment_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4277:1: ( rule__OutputPort__NameAssignment_1 )
            {
             before(grammarAccess.getOutputPortAccess().getNameAssignment_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4278:1: ( rule__OutputPort__NameAssignment_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4278:2: rule__OutputPort__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__NameAssignment_1_in_rule__OutputPort__Group__1__Impl8467);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4288:1: rule__OutputPort__Group__2 : rule__OutputPort__Group__2__Impl rule__OutputPort__Group__3 ;
    public final void rule__OutputPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4292:1: ( rule__OutputPort__Group__2__Impl rule__OutputPort__Group__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4293:2: rule__OutputPort__Group__2__Impl rule__OutputPort__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__2__Impl_in_rule__OutputPort__Group__28497);
            rule__OutputPort__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__3_in_rule__OutputPort__Group__28500);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4300:1: rule__OutputPort__Group__2__Impl : ( '{' ) ;
    public final void rule__OutputPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4304:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4305:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4305:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4306:1: '{'
            {
             before(grammarAccess.getOutputPortAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__OutputPort__Group__2__Impl8528); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4319:1: rule__OutputPort__Group__3 : rule__OutputPort__Group__3__Impl rule__OutputPort__Group__4 ;
    public final void rule__OutputPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4323:1: ( rule__OutputPort__Group__3__Impl rule__OutputPort__Group__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4324:2: rule__OutputPort__Group__3__Impl rule__OutputPort__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__3__Impl_in_rule__OutputPort__Group__38559);
            rule__OutputPort__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__4_in_rule__OutputPort__Group__38562);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4331:1: rule__OutputPort__Group__3__Impl : ( ( rule__OutputPort__Group_3__0 )? ) ;
    public final void rule__OutputPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4335:1: ( ( ( rule__OutputPort__Group_3__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4336:1: ( ( rule__OutputPort__Group_3__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4336:1: ( ( rule__OutputPort__Group_3__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4337:1: ( rule__OutputPort__Group_3__0 )?
            {
             before(grammarAccess.getOutputPortAccess().getGroup_3()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4338:1: ( rule__OutputPort__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==45) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4338:2: rule__OutputPort__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group_3__0_in_rule__OutputPort__Group__3__Impl8589);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4348:1: rule__OutputPort__Group__4 : rule__OutputPort__Group__4__Impl rule__OutputPort__Group__5 ;
    public final void rule__OutputPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4352:1: ( rule__OutputPort__Group__4__Impl rule__OutputPort__Group__5 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4353:2: rule__OutputPort__Group__4__Impl rule__OutputPort__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__4__Impl_in_rule__OutputPort__Group__48620);
            rule__OutputPort__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__5_in_rule__OutputPort__Group__48623);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4360:1: rule__OutputPort__Group__4__Impl : ( ( rule__OutputPort__Group_4__0 )? ) ;
    public final void rule__OutputPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4364:1: ( ( ( rule__OutputPort__Group_4__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4365:1: ( ( rule__OutputPort__Group_4__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4365:1: ( ( rule__OutputPort__Group_4__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4366:1: ( rule__OutputPort__Group_4__0 )?
            {
             before(grammarAccess.getOutputPortAccess().getGroup_4()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4367:1: ( rule__OutputPort__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==48) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4367:2: rule__OutputPort__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group_4__0_in_rule__OutputPort__Group__4__Impl8650);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4377:1: rule__OutputPort__Group__5 : rule__OutputPort__Group__5__Impl ;
    public final void rule__OutputPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4381:1: ( rule__OutputPort__Group__5__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4382:2: rule__OutputPort__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__5__Impl_in_rule__OutputPort__Group__58681);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4388:1: rule__OutputPort__Group__5__Impl : ( '}' ) ;
    public final void rule__OutputPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4392:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4393:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4393:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4394:1: '}'
            {
             before(grammarAccess.getOutputPortAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__OutputPort__Group__5__Impl8709); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4419:1: rule__OutputPort__Group_3__0 : rule__OutputPort__Group_3__0__Impl rule__OutputPort__Group_3__1 ;
    public final void rule__OutputPort__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4423:1: ( rule__OutputPort__Group_3__0__Impl rule__OutputPort__Group_3__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4424:2: rule__OutputPort__Group_3__0__Impl rule__OutputPort__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group_3__0__Impl_in_rule__OutputPort__Group_3__08752);
            rule__OutputPort__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group_3__1_in_rule__OutputPort__Group_3__08755);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4431:1: rule__OutputPort__Group_3__0__Impl : ( 'dataType' ) ;
    public final void rule__OutputPort__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4435:1: ( ( 'dataType' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4436:1: ( 'dataType' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4436:1: ( 'dataType' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4437:1: 'dataType'
            {
             before(grammarAccess.getOutputPortAccess().getDataTypeKeyword_3_0()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__OutputPort__Group_3__0__Impl8783); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4450:1: rule__OutputPort__Group_3__1 : rule__OutputPort__Group_3__1__Impl ;
    public final void rule__OutputPort__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4454:1: ( rule__OutputPort__Group_3__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4455:2: rule__OutputPort__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group_3__1__Impl_in_rule__OutputPort__Group_3__18814);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4461:1: rule__OutputPort__Group_3__1__Impl : ( ( rule__OutputPort__DataTypeAssignment_3_1 ) ) ;
    public final void rule__OutputPort__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4465:1: ( ( ( rule__OutputPort__DataTypeAssignment_3_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4466:1: ( ( rule__OutputPort__DataTypeAssignment_3_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4466:1: ( ( rule__OutputPort__DataTypeAssignment_3_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4467:1: ( rule__OutputPort__DataTypeAssignment_3_1 )
            {
             before(grammarAccess.getOutputPortAccess().getDataTypeAssignment_3_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4468:1: ( rule__OutputPort__DataTypeAssignment_3_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4468:2: rule__OutputPort__DataTypeAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__DataTypeAssignment_3_1_in_rule__OutputPort__Group_3__1__Impl8841);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4482:1: rule__OutputPort__Group_4__0 : rule__OutputPort__Group_4__0__Impl rule__OutputPort__Group_4__1 ;
    public final void rule__OutputPort__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4486:1: ( rule__OutputPort__Group_4__0__Impl rule__OutputPort__Group_4__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4487:2: rule__OutputPort__Group_4__0__Impl rule__OutputPort__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group_4__0__Impl_in_rule__OutputPort__Group_4__08875);
            rule__OutputPort__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group_4__1_in_rule__OutputPort__Group_4__08878);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4494:1: rule__OutputPort__Group_4__0__Impl : ( 'outputConnectionPolicy' ) ;
    public final void rule__OutputPort__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4498:1: ( ( 'outputConnectionPolicy' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4499:1: ( 'outputConnectionPolicy' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4499:1: ( 'outputConnectionPolicy' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4500:1: 'outputConnectionPolicy'
            {
             before(grammarAccess.getOutputPortAccess().getOutputConnectionPolicyKeyword_4_0()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__OutputPort__Group_4__0__Impl8906); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4513:1: rule__OutputPort__Group_4__1 : rule__OutputPort__Group_4__1__Impl ;
    public final void rule__OutputPort__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4517:1: ( rule__OutputPort__Group_4__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4518:2: rule__OutputPort__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group_4__1__Impl_in_rule__OutputPort__Group_4__18937);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4524:1: rule__OutputPort__Group_4__1__Impl : ( ( rule__OutputPort__OutputConnectionPolicyAssignment_4_1 ) ) ;
    public final void rule__OutputPort__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4528:1: ( ( ( rule__OutputPort__OutputConnectionPolicyAssignment_4_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4529:1: ( ( rule__OutputPort__OutputConnectionPolicyAssignment_4_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4529:1: ( ( rule__OutputPort__OutputConnectionPolicyAssignment_4_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4530:1: ( rule__OutputPort__OutputConnectionPolicyAssignment_4_1 )
            {
             before(grammarAccess.getOutputPortAccess().getOutputConnectionPolicyAssignment_4_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4531:1: ( rule__OutputPort__OutputConnectionPolicyAssignment_4_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4531:2: rule__OutputPort__OutputConnectionPolicyAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__OutputConnectionPolicyAssignment_4_1_in_rule__OutputPort__Group_4__1__Impl8964);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4545:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4549:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4550:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__08998);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__1_in_rule__Property__Group__09001);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4557:1: rule__Property__Group__0__Impl : ( () ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4561:1: ( ( () ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4562:1: ( () )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4562:1: ( () )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4563:1: ()
            {
             before(grammarAccess.getPropertyAccess().getPropertyAction_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4564:1: ()
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4566:1: 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4576:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4580:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4581:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__19059);
            rule__Property__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__2_in_rule__Property__Group__19062);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4588:1: rule__Property__Group__1__Impl : ( 'Property' ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4592:1: ( ( 'Property' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4593:1: ( 'Property' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4593:1: ( 'Property' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4594:1: 'Property'
            {
             before(grammarAccess.getPropertyAccess().getPropertyKeyword_1()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__Property__Group__1__Impl9090); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4607:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4611:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4612:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__29121);
            rule__Property__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__3_in_rule__Property__Group__29124);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4619:1: rule__Property__Group__2__Impl : ( ( rule__Property__NameAssignment_2 ) ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4623:1: ( ( ( rule__Property__NameAssignment_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4624:1: ( ( rule__Property__NameAssignment_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4624:1: ( ( rule__Property__NameAssignment_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4625:1: ( rule__Property__NameAssignment_2 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4626:1: ( rule__Property__NameAssignment_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4626:2: rule__Property__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__NameAssignment_2_in_rule__Property__Group__2__Impl9151);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4636:1: rule__Property__Group__3 : rule__Property__Group__3__Impl rule__Property__Group__4 ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4640:1: ( rule__Property__Group__3__Impl rule__Property__Group__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4641:2: rule__Property__Group__3__Impl rule__Property__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__3__Impl_in_rule__Property__Group__39181);
            rule__Property__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__4_in_rule__Property__Group__39184);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4648:1: rule__Property__Group__3__Impl : ( '{' ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4652:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4653:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4653:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4654:1: '{'
            {
             before(grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Property__Group__3__Impl9212); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4667:1: rule__Property__Group__4 : rule__Property__Group__4__Impl rule__Property__Group__5 ;
    public final void rule__Property__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4671:1: ( rule__Property__Group__4__Impl rule__Property__Group__5 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4672:2: rule__Property__Group__4__Impl rule__Property__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__4__Impl_in_rule__Property__Group__49243);
            rule__Property__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__5_in_rule__Property__Group__49246);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4679:1: rule__Property__Group__4__Impl : ( ( rule__Property__Group_4__0 )? ) ;
    public final void rule__Property__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4683:1: ( ( ( rule__Property__Group_4__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4684:1: ( ( rule__Property__Group_4__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4684:1: ( ( rule__Property__Group_4__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4685:1: ( rule__Property__Group_4__0 )?
            {
             before(grammarAccess.getPropertyAccess().getGroup_4()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4686:1: ( rule__Property__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==50) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4686:2: rule__Property__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Property__Group_4__0_in_rule__Property__Group__4__Impl9273);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4696:1: rule__Property__Group__5 : rule__Property__Group__5__Impl rule__Property__Group__6 ;
    public final void rule__Property__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4700:1: ( rule__Property__Group__5__Impl rule__Property__Group__6 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4701:2: rule__Property__Group__5__Impl rule__Property__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__5__Impl_in_rule__Property__Group__59304);
            rule__Property__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__6_in_rule__Property__Group__59307);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4708:1: rule__Property__Group__5__Impl : ( ( rule__Property__Group_5__0 )? ) ;
    public final void rule__Property__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4712:1: ( ( ( rule__Property__Group_5__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4713:1: ( ( rule__Property__Group_5__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4713:1: ( ( rule__Property__Group_5__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4714:1: ( rule__Property__Group_5__0 )?
            {
             before(grammarAccess.getPropertyAccess().getGroup_5()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4715:1: ( rule__Property__Group_5__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==51) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4715:2: rule__Property__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Property__Group_5__0_in_rule__Property__Group__5__Impl9334);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4725:1: rule__Property__Group__6 : rule__Property__Group__6__Impl rule__Property__Group__7 ;
    public final void rule__Property__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4729:1: ( rule__Property__Group__6__Impl rule__Property__Group__7 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4730:2: rule__Property__Group__6__Impl rule__Property__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__6__Impl_in_rule__Property__Group__69365);
            rule__Property__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__7_in_rule__Property__Group__69368);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4737:1: rule__Property__Group__6__Impl : ( ( rule__Property__Group_6__0 )? ) ;
    public final void rule__Property__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4741:1: ( ( ( rule__Property__Group_6__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4742:1: ( ( rule__Property__Group_6__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4742:1: ( ( rule__Property__Group_6__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4743:1: ( rule__Property__Group_6__0 )?
            {
             before(grammarAccess.getPropertyAccess().getGroup_6()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4744:1: ( rule__Property__Group_6__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==29) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4744:2: rule__Property__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Property__Group_6__0_in_rule__Property__Group__6__Impl9395);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4754:1: rule__Property__Group__7 : rule__Property__Group__7__Impl ;
    public final void rule__Property__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4758:1: ( rule__Property__Group__7__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4759:2: rule__Property__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__7__Impl_in_rule__Property__Group__79426);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4765:1: rule__Property__Group__7__Impl : ( '}' ) ;
    public final void rule__Property__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4769:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4770:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4770:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4771:1: '}'
            {
             before(grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_7()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Property__Group__7__Impl9454); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4800:1: rule__Property__Group_4__0 : rule__Property__Group_4__0__Impl rule__Property__Group_4__1 ;
    public final void rule__Property__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4804:1: ( rule__Property__Group_4__0__Impl rule__Property__Group_4__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4805:2: rule__Property__Group_4__0__Impl rule__Property__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group_4__0__Impl_in_rule__Property__Group_4__09501);
            rule__Property__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group_4__1_in_rule__Property__Group_4__09504);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4812:1: rule__Property__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__Property__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4816:1: ( ( 'description' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4817:1: ( 'description' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4817:1: ( 'description' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4818:1: 'description'
            {
             before(grammarAccess.getPropertyAccess().getDescriptionKeyword_4_0()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__Property__Group_4__0__Impl9532); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4831:1: rule__Property__Group_4__1 : rule__Property__Group_4__1__Impl ;
    public final void rule__Property__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4835:1: ( rule__Property__Group_4__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4836:2: rule__Property__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group_4__1__Impl_in_rule__Property__Group_4__19563);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4842:1: rule__Property__Group_4__1__Impl : ( ( rule__Property__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Property__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4846:1: ( ( ( rule__Property__DescriptionAssignment_4_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4847:1: ( ( rule__Property__DescriptionAssignment_4_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4847:1: ( ( rule__Property__DescriptionAssignment_4_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4848:1: ( rule__Property__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getPropertyAccess().getDescriptionAssignment_4_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4849:1: ( rule__Property__DescriptionAssignment_4_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4849:2: rule__Property__DescriptionAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__DescriptionAssignment_4_1_in_rule__Property__Group_4__1__Impl9590);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4863:1: rule__Property__Group_5__0 : rule__Property__Group_5__0__Impl rule__Property__Group_5__1 ;
    public final void rule__Property__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4867:1: ( rule__Property__Group_5__0__Impl rule__Property__Group_5__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4868:2: rule__Property__Group_5__0__Impl rule__Property__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group_5__0__Impl_in_rule__Property__Group_5__09624);
            rule__Property__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group_5__1_in_rule__Property__Group_5__09627);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4875:1: rule__Property__Group_5__0__Impl : ( 'value' ) ;
    public final void rule__Property__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4879:1: ( ( 'value' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4880:1: ( 'value' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4880:1: ( 'value' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4881:1: 'value'
            {
             before(grammarAccess.getPropertyAccess().getValueKeyword_5_0()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__Property__Group_5__0__Impl9655); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4894:1: rule__Property__Group_5__1 : rule__Property__Group_5__1__Impl ;
    public final void rule__Property__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4898:1: ( rule__Property__Group_5__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4899:2: rule__Property__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group_5__1__Impl_in_rule__Property__Group_5__19686);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4905:1: rule__Property__Group_5__1__Impl : ( ( rule__Property__ValueAssignment_5_1 ) ) ;
    public final void rule__Property__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4909:1: ( ( ( rule__Property__ValueAssignment_5_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4910:1: ( ( rule__Property__ValueAssignment_5_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4910:1: ( ( rule__Property__ValueAssignment_5_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4911:1: ( rule__Property__ValueAssignment_5_1 )
            {
             before(grammarAccess.getPropertyAccess().getValueAssignment_5_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4912:1: ( rule__Property__ValueAssignment_5_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4912:2: rule__Property__ValueAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__ValueAssignment_5_1_in_rule__Property__Group_5__1__Impl9713);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4926:1: rule__Property__Group_6__0 : rule__Property__Group_6__0__Impl rule__Property__Group_6__1 ;
    public final void rule__Property__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4930:1: ( rule__Property__Group_6__0__Impl rule__Property__Group_6__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4931:2: rule__Property__Group_6__0__Impl rule__Property__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group_6__0__Impl_in_rule__Property__Group_6__09747);
            rule__Property__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group_6__1_in_rule__Property__Group_6__09750);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4938:1: rule__Property__Group_6__0__Impl : ( 'type' ) ;
    public final void rule__Property__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4942:1: ( ( 'type' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4943:1: ( 'type' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4943:1: ( 'type' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4944:1: 'type'
            {
             before(grammarAccess.getPropertyAccess().getTypeKeyword_6_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Property__Group_6__0__Impl9778); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4957:1: rule__Property__Group_6__1 : rule__Property__Group_6__1__Impl ;
    public final void rule__Property__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4961:1: ( rule__Property__Group_6__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4962:2: rule__Property__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group_6__1__Impl_in_rule__Property__Group_6__19809);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4968:1: rule__Property__Group_6__1__Impl : ( ( rule__Property__TypeAssignment_6_1 ) ) ;
    public final void rule__Property__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4972:1: ( ( ( rule__Property__TypeAssignment_6_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4973:1: ( ( rule__Property__TypeAssignment_6_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4973:1: ( ( rule__Property__TypeAssignment_6_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4974:1: ( rule__Property__TypeAssignment_6_1 )
            {
             before(grammarAccess.getPropertyAccess().getTypeAssignment_6_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4975:1: ( rule__Property__TypeAssignment_6_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4975:2: rule__Property__TypeAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__TypeAssignment_6_1_in_rule__Property__Group_6__1__Impl9836);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4989:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4993:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4994:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__09870);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__09873);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5001:1: rule__Operation__Group__0__Impl : ( () ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5005:1: ( ( () ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5006:1: ( () )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5006:1: ( () )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5007:1: ()
            {
             before(grammarAccess.getOperationAccess().getOperationAction_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5008:1: ()
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5010:1: 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5020:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5024:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5025:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__19931);
            rule__Operation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__19934);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5032:1: rule__Operation__Group__1__Impl : ( 'Operation' ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5036:1: ( ( 'Operation' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5037:1: ( 'Operation' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5037:1: ( 'Operation' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5038:1: 'Operation'
            {
             before(grammarAccess.getOperationAccess().getOperationKeyword_1()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__Operation__Group__1__Impl9962); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5051:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5055:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5056:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__29993);
            rule__Operation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__29996);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5063:1: rule__Operation__Group__2__Impl : ( ( rule__Operation__NameAssignment_2 ) ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5067:1: ( ( ( rule__Operation__NameAssignment_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5068:1: ( ( rule__Operation__NameAssignment_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5068:1: ( ( rule__Operation__NameAssignment_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5069:1: ( rule__Operation__NameAssignment_2 )
            {
             before(grammarAccess.getOperationAccess().getNameAssignment_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5070:1: ( rule__Operation__NameAssignment_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5070:2: rule__Operation__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__NameAssignment_2_in_rule__Operation__Group__2__Impl10023);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5080:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5084:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5085:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__310053);
            rule__Operation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__310056);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5092:1: rule__Operation__Group__3__Impl : ( '{' ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5096:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5097:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5097:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5098:1: '{'
            {
             before(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Operation__Group__3__Impl10084); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5111:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5115:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5116:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__410115);
            rule__Operation__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__410118);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5123:1: rule__Operation__Group__4__Impl : ( ( rule__Operation__Group_4__0 )? ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5127:1: ( ( ( rule__Operation__Group_4__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5128:1: ( ( rule__Operation__Group_4__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5128:1: ( ( rule__Operation__Group_4__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5129:1: ( rule__Operation__Group_4__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_4()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5130:1: ( rule__Operation__Group_4__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==53) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5130:2: rule__Operation__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_4__0_in_rule__Operation__Group__4__Impl10145);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5140:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl rule__Operation__Group__6 ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5144:1: ( rule__Operation__Group__5__Impl rule__Operation__Group__6 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5145:2: rule__Operation__Group__5__Impl rule__Operation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__510176);
            rule__Operation__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__6_in_rule__Operation__Group__510179);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5152:1: rule__Operation__Group__5__Impl : ( ( rule__Operation__Group_5__0 )? ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5156:1: ( ( ( rule__Operation__Group_5__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5157:1: ( ( rule__Operation__Group_5__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5157:1: ( ( rule__Operation__Group_5__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5158:1: ( rule__Operation__Group_5__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_5()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5159:1: ( rule__Operation__Group_5__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==54) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5159:2: rule__Operation__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_5__0_in_rule__Operation__Group__5__Impl10206);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5169:1: rule__Operation__Group__6 : rule__Operation__Group__6__Impl ;
    public final void rule__Operation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5173:1: ( rule__Operation__Group__6__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5174:2: rule__Operation__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__6__Impl_in_rule__Operation__Group__610237);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5180:1: rule__Operation__Group__6__Impl : ( '}' ) ;
    public final void rule__Operation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5184:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5185:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5185:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5186:1: '}'
            {
             before(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Operation__Group__6__Impl10265); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5213:1: rule__Operation__Group_4__0 : rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 ;
    public final void rule__Operation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5217:1: ( rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5218:2: rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_4__0__Impl_in_rule__Operation__Group_4__010310);
            rule__Operation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_4__1_in_rule__Operation__Group_4__010313);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5225:1: rule__Operation__Group_4__0__Impl : ( 'documentation' ) ;
    public final void rule__Operation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5229:1: ( ( 'documentation' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5230:1: ( 'documentation' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5230:1: ( 'documentation' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5231:1: 'documentation'
            {
             before(grammarAccess.getOperationAccess().getDocumentationKeyword_4_0()); 
            match(input,53,FollowSets000.FOLLOW_53_in_rule__Operation__Group_4__0__Impl10341); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5244:1: rule__Operation__Group_4__1 : rule__Operation__Group_4__1__Impl ;
    public final void rule__Operation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5248:1: ( rule__Operation__Group_4__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5249:2: rule__Operation__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_4__1__Impl_in_rule__Operation__Group_4__110372);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5255:1: rule__Operation__Group_4__1__Impl : ( ( rule__Operation__DocumentationAssignment_4_1 ) ) ;
    public final void rule__Operation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5259:1: ( ( ( rule__Operation__DocumentationAssignment_4_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5260:1: ( ( rule__Operation__DocumentationAssignment_4_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5260:1: ( ( rule__Operation__DocumentationAssignment_4_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5261:1: ( rule__Operation__DocumentationAssignment_4_1 )
            {
             before(grammarAccess.getOperationAccess().getDocumentationAssignment_4_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5262:1: ( rule__Operation__DocumentationAssignment_4_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5262:2: rule__Operation__DocumentationAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__DocumentationAssignment_4_1_in_rule__Operation__Group_4__1__Impl10399);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5276:1: rule__Operation__Group_5__0 : rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1 ;
    public final void rule__Operation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5280:1: ( rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5281:2: rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_5__0__Impl_in_rule__Operation__Group_5__010433);
            rule__Operation__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_5__1_in_rule__Operation__Group_5__010436);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5288:1: rule__Operation__Group_5__0__Impl : ( 'returnType' ) ;
    public final void rule__Operation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5292:1: ( ( 'returnType' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5293:1: ( 'returnType' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5293:1: ( 'returnType' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5294:1: 'returnType'
            {
             before(grammarAccess.getOperationAccess().getReturnTypeKeyword_5_0()); 
            match(input,54,FollowSets000.FOLLOW_54_in_rule__Operation__Group_5__0__Impl10464); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5307:1: rule__Operation__Group_5__1 : rule__Operation__Group_5__1__Impl ;
    public final void rule__Operation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5311:1: ( rule__Operation__Group_5__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5312:2: rule__Operation__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_5__1__Impl_in_rule__Operation__Group_5__110495);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5318:1: rule__Operation__Group_5__1__Impl : ( ( rule__Operation__ReturnTypeAssignment_5_1 ) ) ;
    public final void rule__Operation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5322:1: ( ( ( rule__Operation__ReturnTypeAssignment_5_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5323:1: ( ( rule__Operation__ReturnTypeAssignment_5_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5323:1: ( ( rule__Operation__ReturnTypeAssignment_5_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5324:1: ( rule__Operation__ReturnTypeAssignment_5_1 )
            {
             before(grammarAccess.getOperationAccess().getReturnTypeAssignment_5_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5325:1: ( rule__Operation__ReturnTypeAssignment_5_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5325:2: rule__Operation__ReturnTypeAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__ReturnTypeAssignment_5_1_in_rule__Operation__Group_5__1__Impl10522);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5339:1: rule__EShort__Group__0 : rule__EShort__Group__0__Impl rule__EShort__Group__1 ;
    public final void rule__EShort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5343:1: ( rule__EShort__Group__0__Impl rule__EShort__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5344:2: rule__EShort__Group__0__Impl rule__EShort__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EShort__Group__0__Impl_in_rule__EShort__Group__010556);
            rule__EShort__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EShort__Group__1_in_rule__EShort__Group__010559);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5351:1: rule__EShort__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EShort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5355:1: ( ( ( '-' )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5356:1: ( ( '-' )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5356:1: ( ( '-' )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5357:1: ( '-' )?
            {
             before(grammarAccess.getEShortAccess().getHyphenMinusKeyword_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5358:1: ( '-' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==55) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5359:2: '-'
                    {
                    match(input,55,FollowSets000.FOLLOW_55_in_rule__EShort__Group__0__Impl10588); 

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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5370:1: rule__EShort__Group__1 : rule__EShort__Group__1__Impl ;
    public final void rule__EShort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5374:1: ( rule__EShort__Group__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5375:2: rule__EShort__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EShort__Group__1__Impl_in_rule__EShort__Group__110621);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5381:1: rule__EShort__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EShort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5385:1: ( ( RULE_INT ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5386:1: ( RULE_INT )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5386:1: ( RULE_INT )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5387:1: RULE_INT
            {
             before(grammarAccess.getEShortAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EShort__Group__1__Impl10648); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5402:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5406:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5407:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__010681);
            rule__Activity__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__010684);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5414:1: rule__Activity__Group__0__Impl : ( 'Activity' ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5418:1: ( ( 'Activity' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5419:1: ( 'Activity' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5419:1: ( 'Activity' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5420:1: 'Activity'
            {
             before(grammarAccess.getActivityAccess().getActivityKeyword_0()); 
            match(input,56,FollowSets000.FOLLOW_56_in_rule__Activity__Group__0__Impl10712); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5433:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5437:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5438:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__110743);
            rule__Activity__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__110746);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5445:1: rule__Activity__Group__1__Impl : ( ( rule__Activity__NameAssignment_1 ) ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5449:1: ( ( ( rule__Activity__NameAssignment_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5450:1: ( ( rule__Activity__NameAssignment_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5450:1: ( ( rule__Activity__NameAssignment_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5451:1: ( rule__Activity__NameAssignment_1 )
            {
             before(grammarAccess.getActivityAccess().getNameAssignment_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5452:1: ( rule__Activity__NameAssignment_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5452:2: rule__Activity__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__NameAssignment_1_in_rule__Activity__Group__1__Impl10773);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5462:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5466:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5467:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__210803);
            rule__Activity__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__210806);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5474:1: rule__Activity__Group__2__Impl : ( '{' ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5478:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5479:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5479:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5480:1: '{'
            {
             before(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Activity__Group__2__Impl10834); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5493:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl rule__Activity__Group__4 ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5497:1: ( rule__Activity__Group__3__Impl rule__Activity__Group__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5498:2: rule__Activity__Group__3__Impl rule__Activity__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__310865);
            rule__Activity__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__310868);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5505:1: rule__Activity__Group__3__Impl : ( 'scheduler' ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5509:1: ( ( 'scheduler' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5510:1: ( 'scheduler' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5510:1: ( 'scheduler' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5511:1: 'scheduler'
            {
             before(grammarAccess.getActivityAccess().getSchedulerKeyword_3()); 
            match(input,57,FollowSets000.FOLLOW_57_in_rule__Activity__Group__3__Impl10896); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5524:1: rule__Activity__Group__4 : rule__Activity__Group__4__Impl rule__Activity__Group__5 ;
    public final void rule__Activity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5528:1: ( rule__Activity__Group__4__Impl rule__Activity__Group__5 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5529:2: rule__Activity__Group__4__Impl rule__Activity__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__410927);
            rule__Activity__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__410930);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5536:1: rule__Activity__Group__4__Impl : ( ( rule__Activity__SchedulerAssignment_4 ) ) ;
    public final void rule__Activity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5540:1: ( ( ( rule__Activity__SchedulerAssignment_4 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5541:1: ( ( rule__Activity__SchedulerAssignment_4 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5541:1: ( ( rule__Activity__SchedulerAssignment_4 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5542:1: ( rule__Activity__SchedulerAssignment_4 )
            {
             before(grammarAccess.getActivityAccess().getSchedulerAssignment_4()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5543:1: ( rule__Activity__SchedulerAssignment_4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5543:2: rule__Activity__SchedulerAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__SchedulerAssignment_4_in_rule__Activity__Group__4__Impl10957);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5553:1: rule__Activity__Group__5 : rule__Activity__Group__5__Impl rule__Activity__Group__6 ;
    public final void rule__Activity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5557:1: ( rule__Activity__Group__5__Impl rule__Activity__Group__6 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5558:2: rule__Activity__Group__5__Impl rule__Activity__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__510987);
            rule__Activity__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__510990);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5565:1: rule__Activity__Group__5__Impl : ( 'cpuAffinity' ) ;
    public final void rule__Activity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5569:1: ( ( 'cpuAffinity' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5570:1: ( 'cpuAffinity' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5570:1: ( 'cpuAffinity' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5571:1: 'cpuAffinity'
            {
             before(grammarAccess.getActivityAccess().getCpuAffinityKeyword_5()); 
            match(input,58,FollowSets000.FOLLOW_58_in_rule__Activity__Group__5__Impl11018); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5584:1: rule__Activity__Group__6 : rule__Activity__Group__6__Impl rule__Activity__Group__7 ;
    public final void rule__Activity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5588:1: ( rule__Activity__Group__6__Impl rule__Activity__Group__7 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5589:2: rule__Activity__Group__6__Impl rule__Activity__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__611049);
            rule__Activity__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__611052);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5596:1: rule__Activity__Group__6__Impl : ( ( rule__Activity__CpuAffinityAssignment_6 ) ) ;
    public final void rule__Activity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5600:1: ( ( ( rule__Activity__CpuAffinityAssignment_6 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5601:1: ( ( rule__Activity__CpuAffinityAssignment_6 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5601:1: ( ( rule__Activity__CpuAffinityAssignment_6 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5602:1: ( rule__Activity__CpuAffinityAssignment_6 )
            {
             before(grammarAccess.getActivityAccess().getCpuAffinityAssignment_6()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5603:1: ( rule__Activity__CpuAffinityAssignment_6 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5603:2: rule__Activity__CpuAffinityAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__CpuAffinityAssignment_6_in_rule__Activity__Group__6__Impl11079);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5613:1: rule__Activity__Group__7 : rule__Activity__Group__7__Impl rule__Activity__Group__8 ;
    public final void rule__Activity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5617:1: ( rule__Activity__Group__7__Impl rule__Activity__Group__8 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5618:2: rule__Activity__Group__7__Impl rule__Activity__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__711109);
            rule__Activity__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__8_in_rule__Activity__Group__711112);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5625:1: rule__Activity__Group__7__Impl : ( 'period' ) ;
    public final void rule__Activity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5629:1: ( ( 'period' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5630:1: ( 'period' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5630:1: ( 'period' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5631:1: 'period'
            {
             before(grammarAccess.getActivityAccess().getPeriodKeyword_7()); 
            match(input,59,FollowSets000.FOLLOW_59_in_rule__Activity__Group__7__Impl11140); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5644:1: rule__Activity__Group__8 : rule__Activity__Group__8__Impl rule__Activity__Group__9 ;
    public final void rule__Activity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5648:1: ( rule__Activity__Group__8__Impl rule__Activity__Group__9 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5649:2: rule__Activity__Group__8__Impl rule__Activity__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__8__Impl_in_rule__Activity__Group__811171);
            rule__Activity__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__9_in_rule__Activity__Group__811174);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5656:1: rule__Activity__Group__8__Impl : ( ( rule__Activity__PeriodAssignment_8 ) ) ;
    public final void rule__Activity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5660:1: ( ( ( rule__Activity__PeriodAssignment_8 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5661:1: ( ( rule__Activity__PeriodAssignment_8 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5661:1: ( ( rule__Activity__PeriodAssignment_8 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5662:1: ( rule__Activity__PeriodAssignment_8 )
            {
             before(grammarAccess.getActivityAccess().getPeriodAssignment_8()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5663:1: ( rule__Activity__PeriodAssignment_8 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5663:2: rule__Activity__PeriodAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__PeriodAssignment_8_in_rule__Activity__Group__8__Impl11201);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5673:1: rule__Activity__Group__9 : rule__Activity__Group__9__Impl rule__Activity__Group__10 ;
    public final void rule__Activity__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5677:1: ( rule__Activity__Group__9__Impl rule__Activity__Group__10 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5678:2: rule__Activity__Group__9__Impl rule__Activity__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__9__Impl_in_rule__Activity__Group__911231);
            rule__Activity__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__10_in_rule__Activity__Group__911234);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5685:1: rule__Activity__Group__9__Impl : ( 'priority' ) ;
    public final void rule__Activity__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5689:1: ( ( 'priority' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5690:1: ( 'priority' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5690:1: ( 'priority' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5691:1: 'priority'
            {
             before(grammarAccess.getActivityAccess().getPriorityKeyword_9()); 
            match(input,60,FollowSets000.FOLLOW_60_in_rule__Activity__Group__9__Impl11262); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5704:1: rule__Activity__Group__10 : rule__Activity__Group__10__Impl rule__Activity__Group__11 ;
    public final void rule__Activity__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5708:1: ( rule__Activity__Group__10__Impl rule__Activity__Group__11 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5709:2: rule__Activity__Group__10__Impl rule__Activity__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__10__Impl_in_rule__Activity__Group__1011293);
            rule__Activity__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__11_in_rule__Activity__Group__1011296);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5716:1: rule__Activity__Group__10__Impl : ( ( rule__Activity__PriorityAssignment_10 ) ) ;
    public final void rule__Activity__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5720:1: ( ( ( rule__Activity__PriorityAssignment_10 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5721:1: ( ( rule__Activity__PriorityAssignment_10 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5721:1: ( ( rule__Activity__PriorityAssignment_10 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5722:1: ( rule__Activity__PriorityAssignment_10 )
            {
             before(grammarAccess.getActivityAccess().getPriorityAssignment_10()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5723:1: ( rule__Activity__PriorityAssignment_10 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5723:2: rule__Activity__PriorityAssignment_10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__PriorityAssignment_10_in_rule__Activity__Group__10__Impl11323);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5733:1: rule__Activity__Group__11 : rule__Activity__Group__11__Impl rule__Activity__Group__12 ;
    public final void rule__Activity__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5737:1: ( rule__Activity__Group__11__Impl rule__Activity__Group__12 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5738:2: rule__Activity__Group__11__Impl rule__Activity__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__11__Impl_in_rule__Activity__Group__1111353);
            rule__Activity__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__12_in_rule__Activity__Group__1111356);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5745:1: rule__Activity__Group__11__Impl : ( ( rule__Activity__Group_11__0 )? ) ;
    public final void rule__Activity__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5749:1: ( ( ( rule__Activity__Group_11__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5750:1: ( ( rule__Activity__Group_11__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5750:1: ( ( rule__Activity__Group_11__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5751:1: ( rule__Activity__Group_11__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_11()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5752:1: ( rule__Activity__Group_11__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==61) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5752:2: rule__Activity__Group_11__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_11__0_in_rule__Activity__Group__11__Impl11383);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5762:1: rule__Activity__Group__12 : rule__Activity__Group__12__Impl rule__Activity__Group__13 ;
    public final void rule__Activity__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5766:1: ( rule__Activity__Group__12__Impl rule__Activity__Group__13 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5767:2: rule__Activity__Group__12__Impl rule__Activity__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__12__Impl_in_rule__Activity__Group__1211414);
            rule__Activity__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__13_in_rule__Activity__Group__1211417);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5774:1: rule__Activity__Group__12__Impl : ( ( rule__Activity__Group_12__0 )? ) ;
    public final void rule__Activity__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5778:1: ( ( ( rule__Activity__Group_12__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5779:1: ( ( rule__Activity__Group_12__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5779:1: ( ( rule__Activity__Group_12__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5780:1: ( rule__Activity__Group_12__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_12()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5781:1: ( rule__Activity__Group_12__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==62) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5781:2: rule__Activity__Group_12__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12__0_in_rule__Activity__Group__12__Impl11444);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5791:1: rule__Activity__Group__13 : rule__Activity__Group__13__Impl ;
    public final void rule__Activity__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5795:1: ( rule__Activity__Group__13__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5796:2: rule__Activity__Group__13__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__13__Impl_in_rule__Activity__Group__1311475);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5802:1: rule__Activity__Group__13__Impl : ( '}' ) ;
    public final void rule__Activity__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5806:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5807:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5807:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5808:1: '}'
            {
             before(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_13()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Activity__Group__13__Impl11503); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5849:1: rule__Activity__Group_11__0 : rule__Activity__Group_11__0__Impl rule__Activity__Group_11__1 ;
    public final void rule__Activity__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5853:1: ( rule__Activity__Group_11__0__Impl rule__Activity__Group_11__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5854:2: rule__Activity__Group_11__0__Impl rule__Activity__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_11__0__Impl_in_rule__Activity__Group_11__011562);
            rule__Activity__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_11__1_in_rule__Activity__Group_11__011565);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5861:1: rule__Activity__Group_11__0__Impl : ( 'taskContext' ) ;
    public final void rule__Activity__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5865:1: ( ( 'taskContext' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5866:1: ( 'taskContext' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5866:1: ( 'taskContext' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5867:1: 'taskContext'
            {
             before(grammarAccess.getActivityAccess().getTaskContextKeyword_11_0()); 
            match(input,61,FollowSets000.FOLLOW_61_in_rule__Activity__Group_11__0__Impl11593); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5880:1: rule__Activity__Group_11__1 : rule__Activity__Group_11__1__Impl ;
    public final void rule__Activity__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5884:1: ( rule__Activity__Group_11__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5885:2: rule__Activity__Group_11__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_11__1__Impl_in_rule__Activity__Group_11__111624);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5891:1: rule__Activity__Group_11__1__Impl : ( ( rule__Activity__TaskContextAssignment_11_1 ) ) ;
    public final void rule__Activity__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5895:1: ( ( ( rule__Activity__TaskContextAssignment_11_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5896:1: ( ( rule__Activity__TaskContextAssignment_11_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5896:1: ( ( rule__Activity__TaskContextAssignment_11_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5897:1: ( rule__Activity__TaskContextAssignment_11_1 )
            {
             before(grammarAccess.getActivityAccess().getTaskContextAssignment_11_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5898:1: ( rule__Activity__TaskContextAssignment_11_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5898:2: rule__Activity__TaskContextAssignment_11_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__TaskContextAssignment_11_1_in_rule__Activity__Group_11__1__Impl11651);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5912:1: rule__Activity__Group_12__0 : rule__Activity__Group_12__0__Impl rule__Activity__Group_12__1 ;
    public final void rule__Activity__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5916:1: ( rule__Activity__Group_12__0__Impl rule__Activity__Group_12__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5917:2: rule__Activity__Group_12__0__Impl rule__Activity__Group_12__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12__0__Impl_in_rule__Activity__Group_12__011685);
            rule__Activity__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12__1_in_rule__Activity__Group_12__011688);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5924:1: rule__Activity__Group_12__0__Impl : ( 'slave' ) ;
    public final void rule__Activity__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5928:1: ( ( 'slave' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5929:1: ( 'slave' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5929:1: ( 'slave' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5930:1: 'slave'
            {
             before(grammarAccess.getActivityAccess().getSlaveKeyword_12_0()); 
            match(input,62,FollowSets000.FOLLOW_62_in_rule__Activity__Group_12__0__Impl11716); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5943:1: rule__Activity__Group_12__1 : rule__Activity__Group_12__1__Impl rule__Activity__Group_12__2 ;
    public final void rule__Activity__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5947:1: ( rule__Activity__Group_12__1__Impl rule__Activity__Group_12__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5948:2: rule__Activity__Group_12__1__Impl rule__Activity__Group_12__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12__1__Impl_in_rule__Activity__Group_12__111747);
            rule__Activity__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12__2_in_rule__Activity__Group_12__111750);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5955:1: rule__Activity__Group_12__1__Impl : ( '{' ) ;
    public final void rule__Activity__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5959:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5960:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5960:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5961:1: '{'
            {
             before(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_12_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Activity__Group_12__1__Impl11778); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5974:1: rule__Activity__Group_12__2 : rule__Activity__Group_12__2__Impl rule__Activity__Group_12__3 ;
    public final void rule__Activity__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5978:1: ( rule__Activity__Group_12__2__Impl rule__Activity__Group_12__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5979:2: rule__Activity__Group_12__2__Impl rule__Activity__Group_12__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12__2__Impl_in_rule__Activity__Group_12__211809);
            rule__Activity__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12__3_in_rule__Activity__Group_12__211812);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5986:1: rule__Activity__Group_12__2__Impl : ( ( rule__Activity__SlaveAssignment_12_2 ) ) ;
    public final void rule__Activity__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5990:1: ( ( ( rule__Activity__SlaveAssignment_12_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5991:1: ( ( rule__Activity__SlaveAssignment_12_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5991:1: ( ( rule__Activity__SlaveAssignment_12_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5992:1: ( rule__Activity__SlaveAssignment_12_2 )
            {
             before(grammarAccess.getActivityAccess().getSlaveAssignment_12_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5993:1: ( rule__Activity__SlaveAssignment_12_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5993:2: rule__Activity__SlaveAssignment_12_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__SlaveAssignment_12_2_in_rule__Activity__Group_12__2__Impl11839);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6003:1: rule__Activity__Group_12__3 : rule__Activity__Group_12__3__Impl rule__Activity__Group_12__4 ;
    public final void rule__Activity__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6007:1: ( rule__Activity__Group_12__3__Impl rule__Activity__Group_12__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6008:2: rule__Activity__Group_12__3__Impl rule__Activity__Group_12__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12__3__Impl_in_rule__Activity__Group_12__311869);
            rule__Activity__Group_12__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12__4_in_rule__Activity__Group_12__311872);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6015:1: rule__Activity__Group_12__3__Impl : ( ( rule__Activity__Group_12_3__0 )* ) ;
    public final void rule__Activity__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6019:1: ( ( ( rule__Activity__Group_12_3__0 )* ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6020:1: ( ( rule__Activity__Group_12_3__0 )* )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6020:1: ( ( rule__Activity__Group_12_3__0 )* )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6021:1: ( rule__Activity__Group_12_3__0 )*
            {
             before(grammarAccess.getActivityAccess().getGroup_12_3()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6022:1: ( rule__Activity__Group_12_3__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==24) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6022:2: rule__Activity__Group_12_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12_3__0_in_rule__Activity__Group_12__3__Impl11899);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6032:1: rule__Activity__Group_12__4 : rule__Activity__Group_12__4__Impl ;
    public final void rule__Activity__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6036:1: ( rule__Activity__Group_12__4__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6037:2: rule__Activity__Group_12__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12__4__Impl_in_rule__Activity__Group_12__411930);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6043:1: rule__Activity__Group_12__4__Impl : ( '}' ) ;
    public final void rule__Activity__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6047:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6048:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6048:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6049:1: '}'
            {
             before(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_12_4()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Activity__Group_12__4__Impl11958); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6072:1: rule__Activity__Group_12_3__0 : rule__Activity__Group_12_3__0__Impl rule__Activity__Group_12_3__1 ;
    public final void rule__Activity__Group_12_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6076:1: ( rule__Activity__Group_12_3__0__Impl rule__Activity__Group_12_3__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6077:2: rule__Activity__Group_12_3__0__Impl rule__Activity__Group_12_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12_3__0__Impl_in_rule__Activity__Group_12_3__011999);
            rule__Activity__Group_12_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12_3__1_in_rule__Activity__Group_12_3__012002);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6084:1: rule__Activity__Group_12_3__0__Impl : ( ',' ) ;
    public final void rule__Activity__Group_12_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6088:1: ( ( ',' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6089:1: ( ',' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6089:1: ( ',' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6090:1: ','
            {
             before(grammarAccess.getActivityAccess().getCommaKeyword_12_3_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Activity__Group_12_3__0__Impl12030); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6103:1: rule__Activity__Group_12_3__1 : rule__Activity__Group_12_3__1__Impl ;
    public final void rule__Activity__Group_12_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6107:1: ( rule__Activity__Group_12_3__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6108:2: rule__Activity__Group_12_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12_3__1__Impl_in_rule__Activity__Group_12_3__112061);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6114:1: rule__Activity__Group_12_3__1__Impl : ( ( rule__Activity__SlaveAssignment_12_3_1 ) ) ;
    public final void rule__Activity__Group_12_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6118:1: ( ( ( rule__Activity__SlaveAssignment_12_3_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6119:1: ( ( rule__Activity__SlaveAssignment_12_3_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6119:1: ( ( rule__Activity__SlaveAssignment_12_3_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6120:1: ( rule__Activity__SlaveAssignment_12_3_1 )
            {
             before(grammarAccess.getActivityAccess().getSlaveAssignment_12_3_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6121:1: ( rule__Activity__SlaveAssignment_12_3_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6121:2: rule__Activity__SlaveAssignment_12_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__SlaveAssignment_12_3_1_in_rule__Activity__Group_12_3__1__Impl12088);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6135:1: rule__Slave__Group__0 : rule__Slave__Group__0__Impl rule__Slave__Group__1 ;
    public final void rule__Slave__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6139:1: ( rule__Slave__Group__0__Impl rule__Slave__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6140:2: rule__Slave__Group__0__Impl rule__Slave__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group__0__Impl_in_rule__Slave__Group__012122);
            rule__Slave__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group__1_in_rule__Slave__Group__012125);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6147:1: rule__Slave__Group__0__Impl : ( () ) ;
    public final void rule__Slave__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6151:1: ( ( () ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6152:1: ( () )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6152:1: ( () )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6153:1: ()
            {
             before(grammarAccess.getSlaveAccess().getSlaveAction_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6154:1: ()
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6156:1: 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6166:1: rule__Slave__Group__1 : rule__Slave__Group__1__Impl rule__Slave__Group__2 ;
    public final void rule__Slave__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6170:1: ( rule__Slave__Group__1__Impl rule__Slave__Group__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6171:2: rule__Slave__Group__1__Impl rule__Slave__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group__1__Impl_in_rule__Slave__Group__112183);
            rule__Slave__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group__2_in_rule__Slave__Group__112186);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6178:1: rule__Slave__Group__1__Impl : ( 'Slave' ) ;
    public final void rule__Slave__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6182:1: ( ( 'Slave' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6183:1: ( 'Slave' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6183:1: ( 'Slave' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6184:1: 'Slave'
            {
             before(grammarAccess.getSlaveAccess().getSlaveKeyword_1()); 
            match(input,63,FollowSets000.FOLLOW_63_in_rule__Slave__Group__1__Impl12214); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6197:1: rule__Slave__Group__2 : rule__Slave__Group__2__Impl rule__Slave__Group__3 ;
    public final void rule__Slave__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6201:1: ( rule__Slave__Group__2__Impl rule__Slave__Group__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6202:2: rule__Slave__Group__2__Impl rule__Slave__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group__2__Impl_in_rule__Slave__Group__212245);
            rule__Slave__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group__3_in_rule__Slave__Group__212248);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6209:1: rule__Slave__Group__2__Impl : ( ( rule__Slave__NameAssignment_2 ) ) ;
    public final void rule__Slave__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6213:1: ( ( ( rule__Slave__NameAssignment_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6214:1: ( ( rule__Slave__NameAssignment_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6214:1: ( ( rule__Slave__NameAssignment_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6215:1: ( rule__Slave__NameAssignment_2 )
            {
             before(grammarAccess.getSlaveAccess().getNameAssignment_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6216:1: ( rule__Slave__NameAssignment_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6216:2: rule__Slave__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slave__NameAssignment_2_in_rule__Slave__Group__2__Impl12275);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6226:1: rule__Slave__Group__3 : rule__Slave__Group__3__Impl rule__Slave__Group__4 ;
    public final void rule__Slave__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6230:1: ( rule__Slave__Group__3__Impl rule__Slave__Group__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6231:2: rule__Slave__Group__3__Impl rule__Slave__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group__3__Impl_in_rule__Slave__Group__312305);
            rule__Slave__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group__4_in_rule__Slave__Group__312308);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6238:1: rule__Slave__Group__3__Impl : ( '{' ) ;
    public final void rule__Slave__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6242:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6243:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6243:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6244:1: '{'
            {
             before(grammarAccess.getSlaveAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Slave__Group__3__Impl12336); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6257:1: rule__Slave__Group__4 : rule__Slave__Group__4__Impl rule__Slave__Group__5 ;
    public final void rule__Slave__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6261:1: ( rule__Slave__Group__4__Impl rule__Slave__Group__5 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6262:2: rule__Slave__Group__4__Impl rule__Slave__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group__4__Impl_in_rule__Slave__Group__412367);
            rule__Slave__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group__5_in_rule__Slave__Group__412370);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6269:1: rule__Slave__Group__4__Impl : ( ( rule__Slave__Group_4__0 )? ) ;
    public final void rule__Slave__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6273:1: ( ( ( rule__Slave__Group_4__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6274:1: ( ( rule__Slave__Group_4__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6274:1: ( ( rule__Slave__Group_4__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6275:1: ( rule__Slave__Group_4__0 )?
            {
             before(grammarAccess.getSlaveAccess().getGroup_4()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6276:1: ( rule__Slave__Group_4__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==61) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6276:2: rule__Slave__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Slave__Group_4__0_in_rule__Slave__Group__4__Impl12397);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6286:1: rule__Slave__Group__5 : rule__Slave__Group__5__Impl ;
    public final void rule__Slave__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6290:1: ( rule__Slave__Group__5__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6291:2: rule__Slave__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group__5__Impl_in_rule__Slave__Group__512428);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6297:1: rule__Slave__Group__5__Impl : ( '}' ) ;
    public final void rule__Slave__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6301:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6302:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6302:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6303:1: '}'
            {
             before(grammarAccess.getSlaveAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Slave__Group__5__Impl12456); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6328:1: rule__Slave__Group_4__0 : rule__Slave__Group_4__0__Impl rule__Slave__Group_4__1 ;
    public final void rule__Slave__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6332:1: ( rule__Slave__Group_4__0__Impl rule__Slave__Group_4__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6333:2: rule__Slave__Group_4__0__Impl rule__Slave__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group_4__0__Impl_in_rule__Slave__Group_4__012499);
            rule__Slave__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group_4__1_in_rule__Slave__Group_4__012502);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6340:1: rule__Slave__Group_4__0__Impl : ( 'taskContext' ) ;
    public final void rule__Slave__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6344:1: ( ( 'taskContext' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6345:1: ( 'taskContext' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6345:1: ( 'taskContext' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6346:1: 'taskContext'
            {
             before(grammarAccess.getSlaveAccess().getTaskContextKeyword_4_0()); 
            match(input,61,FollowSets000.FOLLOW_61_in_rule__Slave__Group_4__0__Impl12530); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6359:1: rule__Slave__Group_4__1 : rule__Slave__Group_4__1__Impl ;
    public final void rule__Slave__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6363:1: ( rule__Slave__Group_4__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6364:2: rule__Slave__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group_4__1__Impl_in_rule__Slave__Group_4__112561);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6370:1: rule__Slave__Group_4__1__Impl : ( ( rule__Slave__TaskContextAssignment_4_1 ) ) ;
    public final void rule__Slave__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6374:1: ( ( ( rule__Slave__TaskContextAssignment_4_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6375:1: ( ( rule__Slave__TaskContextAssignment_4_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6375:1: ( ( rule__Slave__TaskContextAssignment_4_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6376:1: ( rule__Slave__TaskContextAssignment_4_1 )
            {
             before(grammarAccess.getSlaveAccess().getTaskContextAssignment_4_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6377:1: ( rule__Slave__TaskContextAssignment_4_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6377:2: rule__Slave__TaskContextAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slave__TaskContextAssignment_4_1_in_rule__Slave__Group_4__1__Impl12588);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6391:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6395:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6396:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__0__Impl_in_rule__EFloat__Group__012622);
            rule__EFloat__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__1_in_rule__EFloat__Group__012625);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6403:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6407:1: ( ( ( '-' )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6408:1: ( ( '-' )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6408:1: ( ( '-' )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6409:1: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6410:1: ( '-' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==55) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6411:2: '-'
                    {
                    match(input,55,FollowSets000.FOLLOW_55_in_rule__EFloat__Group__0__Impl12654); 

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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6422:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6426:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6427:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__1__Impl_in_rule__EFloat__Group__112687);
            rule__EFloat__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__2_in_rule__EFloat__Group__112690);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6434:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6438:1: ( ( ( RULE_INT )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6439:1: ( ( RULE_INT )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6439:1: ( ( RULE_INT )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6440:1: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6441:1: ( RULE_INT )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_INT) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6441:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EFloat__Group__1__Impl12718); 

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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6451:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6455:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6456:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__2__Impl_in_rule__EFloat__Group__212749);
            rule__EFloat__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__3_in_rule__EFloat__Group__212752);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6463:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6467:1: ( ( '.' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6468:1: ( '.' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6468:1: ( '.' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6469:1: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            match(input,64,FollowSets000.FOLLOW_64_in_rule__EFloat__Group__2__Impl12780); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6482:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6486:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6487:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__3__Impl_in_rule__EFloat__Group__312811);
            rule__EFloat__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__4_in_rule__EFloat__Group__312814);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6494:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6498:1: ( ( RULE_INT ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6499:1: ( RULE_INT )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6499:1: ( RULE_INT )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6500:1: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EFloat__Group__3__Impl12841); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6511:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6515:1: ( rule__EFloat__Group__4__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6516:2: rule__EFloat__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__4__Impl_in_rule__EFloat__Group__412870);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6522:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6526:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6527:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6527:1: ( ( rule__EFloat__Group_4__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6528:1: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6529:1: ( rule__EFloat__Group_4__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=11 && LA41_0<=12)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6529:2: rule__EFloat__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__0_in_rule__EFloat__Group__4__Impl12897);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6549:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6553:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6554:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__0__Impl_in_rule__EFloat__Group_4__012938);
            rule__EFloat__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__1_in_rule__EFloat__Group_4__012941);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6561:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6565:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6566:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6566:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6567:1: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6568:1: ( rule__EFloat__Alternatives_4_0 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6568:2: rule__EFloat__Alternatives_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Alternatives_4_0_in_rule__EFloat__Group_4__0__Impl12968);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6578:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6582:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6583:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__1__Impl_in_rule__EFloat__Group_4__112998);
            rule__EFloat__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__2_in_rule__EFloat__Group_4__113001);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6590:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6594:1: ( ( ( '-' )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6595:1: ( ( '-' )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6595:1: ( ( '-' )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6596:1: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6597:1: ( '-' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==55) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6598:2: '-'
                    {
                    match(input,55,FollowSets000.FOLLOW_55_in_rule__EFloat__Group_4__1__Impl13030); 

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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6609:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6613:1: ( rule__EFloat__Group_4__2__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6614:2: rule__EFloat__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__2__Impl_in_rule__EFloat__Group_4__213063);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6620:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6624:1: ( ( RULE_INT ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6625:1: ( RULE_INT )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6625:1: ( RULE_INT )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6626:1: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EFloat__Group_4__2__Impl13090); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6643:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6647:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6648:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__013125);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__013128);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6655:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6659:1: ( ( ( '-' )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6660:1: ( ( '-' )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6660:1: ( ( '-' )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6661:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6662:1: ( '-' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==55) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6663:2: '-'
                    {
                    match(input,55,FollowSets000.FOLLOW_55_in_rule__EInt__Group__0__Impl13157); 

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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6674:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6678:1: ( rule__EInt__Group__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6679:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__113190);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6685:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6689:1: ( ( RULE_INT ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6690:1: ( RULE_INT )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6690:1: ( RULE_INT )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6691:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl13217); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6706:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6710:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6711:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__013250);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__013253);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6718:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6722:1: ( ( RULE_ID ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6723:1: ( RULE_ID )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6723:1: ( RULE_ID )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6724:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl13280); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6735:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6739:1: ( rule__QualifiedName__Group__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6740:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__113309);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6746:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6750:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6751:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6751:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6752:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6753:1: ( rule__QualifiedName__Group_1__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==65) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6753:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl13336);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6767:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6771:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6772:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__013371);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__013374);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6779:1: rule__QualifiedName__Group_1__0__Impl : ( '::' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6783:1: ( ( '::' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6784:1: ( '::' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6784:1: ( '::' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6785:1: '::'
            {
             before(grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0()); 
            match(input,65,FollowSets000.FOLLOW_65_in_rule__QualifiedName__Group_1__0__Impl13402); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6798:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6802:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6803:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__113433);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6809:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6813:1: ( ( RULE_ID ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6814:1: ( RULE_ID )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6814:1: ( RULE_ID )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6815:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl13460); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6830:1: rule__QualifiedNameWithDot__Group__0 : rule__QualifiedNameWithDot__Group__0__Impl rule__QualifiedNameWithDot__Group__1 ;
    public final void rule__QualifiedNameWithDot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6834:1: ( rule__QualifiedNameWithDot__Group__0__Impl rule__QualifiedNameWithDot__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6835:2: rule__QualifiedNameWithDot__Group__0__Impl rule__QualifiedNameWithDot__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedNameWithDot__Group__0__Impl_in_rule__QualifiedNameWithDot__Group__013493);
            rule__QualifiedNameWithDot__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QualifiedNameWithDot__Group__1_in_rule__QualifiedNameWithDot__Group__013496);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6842:1: rule__QualifiedNameWithDot__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithDot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6846:1: ( ( ruleQualifiedName ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6847:1: ( ruleQualifiedName )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6847:1: ( ruleQualifiedName )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6848:1: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithDotAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithDot__Group__0__Impl13523);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6859:1: rule__QualifiedNameWithDot__Group__1 : rule__QualifiedNameWithDot__Group__1__Impl ;
    public final void rule__QualifiedNameWithDot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6863:1: ( rule__QualifiedNameWithDot__Group__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6864:2: rule__QualifiedNameWithDot__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedNameWithDot__Group__1__Impl_in_rule__QualifiedNameWithDot__Group__113552);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6870:1: rule__QualifiedNameWithDot__Group__1__Impl : ( ( rule__QualifiedNameWithDot__Group_1__0 )* ) ;
    public final void rule__QualifiedNameWithDot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6874:1: ( ( ( rule__QualifiedNameWithDot__Group_1__0 )* ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6875:1: ( ( rule__QualifiedNameWithDot__Group_1__0 )* )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6875:1: ( ( rule__QualifiedNameWithDot__Group_1__0 )* )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6876:1: ( rule__QualifiedNameWithDot__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameWithDotAccess().getGroup_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6877:1: ( rule__QualifiedNameWithDot__Group_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==64) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6877:2: rule__QualifiedNameWithDot__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QualifiedNameWithDot__Group_1__0_in_rule__QualifiedNameWithDot__Group__1__Impl13579);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6891:1: rule__QualifiedNameWithDot__Group_1__0 : rule__QualifiedNameWithDot__Group_1__0__Impl rule__QualifiedNameWithDot__Group_1__1 ;
    public final void rule__QualifiedNameWithDot__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6895:1: ( rule__QualifiedNameWithDot__Group_1__0__Impl rule__QualifiedNameWithDot__Group_1__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6896:2: rule__QualifiedNameWithDot__Group_1__0__Impl rule__QualifiedNameWithDot__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedNameWithDot__Group_1__0__Impl_in_rule__QualifiedNameWithDot__Group_1__013614);
            rule__QualifiedNameWithDot__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QualifiedNameWithDot__Group_1__1_in_rule__QualifiedNameWithDot__Group_1__013617);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6903:1: rule__QualifiedNameWithDot__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithDot__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6907:1: ( ( '.' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6908:1: ( '.' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6908:1: ( '.' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6909:1: '.'
            {
             before(grammarAccess.getQualifiedNameWithDotAccess().getFullStopKeyword_1_0()); 
            match(input,64,FollowSets000.FOLLOW_64_in_rule__QualifiedNameWithDot__Group_1__0__Impl13645); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6922:1: rule__QualifiedNameWithDot__Group_1__1 : rule__QualifiedNameWithDot__Group_1__1__Impl ;
    public final void rule__QualifiedNameWithDot__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6926:1: ( rule__QualifiedNameWithDot__Group_1__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6927:2: rule__QualifiedNameWithDot__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedNameWithDot__Group_1__1__Impl_in_rule__QualifiedNameWithDot__Group_1__113676);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6933:1: rule__QualifiedNameWithDot__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedNameWithDot__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6937:1: ( ( RULE_ID ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6938:1: ( RULE_ID )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6938:1: ( RULE_ID )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6939:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameWithDotAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QualifiedNameWithDot__Group_1__1__Impl13703); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6955:1: rule__Package__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Package__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6959:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6960:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6960:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6961:1: ruleEString
            {
             before(grammarAccess.getPackageAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Package__NameAssignment_213741);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6970:1: rule__Package__TaskContextsAssignment_4_2 : ( ruleTaskContext ) ;
    public final void rule__Package__TaskContextsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6974:1: ( ( ruleTaskContext ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6975:1: ( ruleTaskContext )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6975:1: ( ruleTaskContext )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6976:1: ruleTaskContext
            {
             before(grammarAccess.getPackageAccess().getTaskContextsTaskContextParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTaskContext_in_rule__Package__TaskContextsAssignment_4_213772);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6985:1: rule__Package__TaskContextsAssignment_4_3_1 : ( ruleTaskContext ) ;
    public final void rule__Package__TaskContextsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6989:1: ( ( ruleTaskContext ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6990:1: ( ruleTaskContext )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6990:1: ( ruleTaskContext )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6991:1: ruleTaskContext
            {
             before(grammarAccess.getPackageAccess().getTaskContextsTaskContextParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTaskContext_in_rule__Package__TaskContextsAssignment_4_3_113803);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7000:1: rule__Package__ConnectionPoliciesAssignment_5_2 : ( ruleConnectionPolicy ) ;
    public final void rule__Package__ConnectionPoliciesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7004:1: ( ( ruleConnectionPolicy ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7005:1: ( ruleConnectionPolicy )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7005:1: ( ruleConnectionPolicy )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7006:1: ruleConnectionPolicy
            {
             before(grammarAccess.getPackageAccess().getConnectionPoliciesConnectionPolicyParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConnectionPolicy_in_rule__Package__ConnectionPoliciesAssignment_5_213834);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7015:1: rule__Package__ConnectionPoliciesAssignment_5_3_1 : ( ruleConnectionPolicy ) ;
    public final void rule__Package__ConnectionPoliciesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7019:1: ( ( ruleConnectionPolicy ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7020:1: ( ruleConnectionPolicy )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7020:1: ( ruleConnectionPolicy )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7021:1: ruleConnectionPolicy
            {
             before(grammarAccess.getPackageAccess().getConnectionPoliciesConnectionPolicyParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConnectionPolicy_in_rule__Package__ConnectionPoliciesAssignment_5_3_113865);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7030:1: rule__Package__PeerGroupsAssignment_6_2 : ( rulePeerGroup ) ;
    public final void rule__Package__PeerGroupsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7034:1: ( ( rulePeerGroup ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7035:1: ( rulePeerGroup )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7035:1: ( rulePeerGroup )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7036:1: rulePeerGroup
            {
             before(grammarAccess.getPackageAccess().getPeerGroupsPeerGroupParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePeerGroup_in_rule__Package__PeerGroupsAssignment_6_213896);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7045:1: rule__Package__PeerGroupsAssignment_6_3_1 : ( rulePeerGroup ) ;
    public final void rule__Package__PeerGroupsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7049:1: ( ( rulePeerGroup ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7050:1: ( rulePeerGroup )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7050:1: ( rulePeerGroup )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7051:1: rulePeerGroup
            {
             before(grammarAccess.getPackageAccess().getPeerGroupsPeerGroupParserRuleCall_6_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePeerGroup_in_rule__Package__PeerGroupsAssignment_6_3_113927);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7060:1: rule__TaskContext__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TaskContext__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7064:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7065:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7065:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7066:1: ruleEString
            {
             before(grammarAccess.getTaskContextAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TaskContext__NameAssignment_113958);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7075:1: rule__TaskContext__NamespaceAssignment_4 : ( ruleQualifiedNameWithDot ) ;
    public final void rule__TaskContext__NamespaceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7079:1: ( ( ruleQualifiedNameWithDot ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7080:1: ( ruleQualifiedNameWithDot )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7080:1: ( ruleQualifiedNameWithDot )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7081:1: ruleQualifiedNameWithDot
            {
             before(grammarAccess.getTaskContextAccess().getNamespaceQualifiedNameWithDotParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_rule__TaskContext__NamespaceAssignment_413989);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7090:1: rule__TaskContext__TypeAssignment_6 : ( ruleQualifiedNameWithDot ) ;
    public final void rule__TaskContext__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7094:1: ( ( ruleQualifiedNameWithDot ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7095:1: ( ruleQualifiedNameWithDot )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7095:1: ( ruleQualifiedNameWithDot )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7096:1: ruleQualifiedNameWithDot
            {
             before(grammarAccess.getTaskContextAccess().getTypeQualifiedNameWithDotParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_rule__TaskContext__TypeAssignment_614020);
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


    // $ANTLR start "rule__TaskContext__InputPortsAssignment_7_2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7105:1: rule__TaskContext__InputPortsAssignment_7_2 : ( ruleInputPort ) ;
    public final void rule__TaskContext__InputPortsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7109:1: ( ( ruleInputPort ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7110:1: ( ruleInputPort )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7110:1: ( ruleInputPort )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7111:1: ruleInputPort
            {
             before(grammarAccess.getTaskContextAccess().getInputPortsInputPortParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputPort_in_rule__TaskContext__InputPortsAssignment_7_214051);
            ruleInputPort();

            state._fsp--;

             after(grammarAccess.getTaskContextAccess().getInputPortsInputPortParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__InputPortsAssignment_7_2"


    // $ANTLR start "rule__TaskContext__InputPortsAssignment_7_3_1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7120:1: rule__TaskContext__InputPortsAssignment_7_3_1 : ( ruleInputPort ) ;
    public final void rule__TaskContext__InputPortsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7124:1: ( ( ruleInputPort ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7125:1: ( ruleInputPort )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7125:1: ( ruleInputPort )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7126:1: ruleInputPort
            {
             before(grammarAccess.getTaskContextAccess().getInputPortsInputPortParserRuleCall_7_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputPort_in_rule__TaskContext__InputPortsAssignment_7_3_114082);
            ruleInputPort();

            state._fsp--;

             after(grammarAccess.getTaskContextAccess().getInputPortsInputPortParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__InputPortsAssignment_7_3_1"


    // $ANTLR start "rule__TaskContext__OutputPortsAssignment_8_2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7135:1: rule__TaskContext__OutputPortsAssignment_8_2 : ( ruleOutputPort ) ;
    public final void rule__TaskContext__OutputPortsAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7139:1: ( ( ruleOutputPort ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7140:1: ( ruleOutputPort )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7140:1: ( ruleOutputPort )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7141:1: ruleOutputPort
            {
             before(grammarAccess.getTaskContextAccess().getOutputPortsOutputPortParserRuleCall_8_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOutputPort_in_rule__TaskContext__OutputPortsAssignment_8_214113);
            ruleOutputPort();

            state._fsp--;

             after(grammarAccess.getTaskContextAccess().getOutputPortsOutputPortParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__OutputPortsAssignment_8_2"


    // $ANTLR start "rule__TaskContext__OutputPortsAssignment_8_3_1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7150:1: rule__TaskContext__OutputPortsAssignment_8_3_1 : ( ruleOutputPort ) ;
    public final void rule__TaskContext__OutputPortsAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7154:1: ( ( ruleOutputPort ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7155:1: ( ruleOutputPort )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7155:1: ( ruleOutputPort )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7156:1: ruleOutputPort
            {
             before(grammarAccess.getTaskContextAccess().getOutputPortsOutputPortParserRuleCall_8_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOutputPort_in_rule__TaskContext__OutputPortsAssignment_8_3_114144);
            ruleOutputPort();

            state._fsp--;

             after(grammarAccess.getTaskContextAccess().getOutputPortsOutputPortParserRuleCall_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__OutputPortsAssignment_8_3_1"


    // $ANTLR start "rule__TaskContext__PropertiesAssignment_9_2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7165:1: rule__TaskContext__PropertiesAssignment_9_2 : ( ruleProperty ) ;
    public final void rule__TaskContext__PropertiesAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7169:1: ( ( ruleProperty ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7170:1: ( ruleProperty )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7170:1: ( ruleProperty )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7171:1: ruleProperty
            {
             before(grammarAccess.getTaskContextAccess().getPropertiesPropertyParserRuleCall_9_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_rule__TaskContext__PropertiesAssignment_9_214175);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getTaskContextAccess().getPropertiesPropertyParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__PropertiesAssignment_9_2"


    // $ANTLR start "rule__TaskContext__PropertiesAssignment_9_3_1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7180:1: rule__TaskContext__PropertiesAssignment_9_3_1 : ( ruleProperty ) ;
    public final void rule__TaskContext__PropertiesAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7184:1: ( ( ruleProperty ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7185:1: ( ruleProperty )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7185:1: ( ruleProperty )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7186:1: ruleProperty
            {
             before(grammarAccess.getTaskContextAccess().getPropertiesPropertyParserRuleCall_9_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_rule__TaskContext__PropertiesAssignment_9_3_114206);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getTaskContextAccess().getPropertiesPropertyParserRuleCall_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__PropertiesAssignment_9_3_1"


    // $ANTLR start "rule__TaskContext__OperationsAssignment_10_2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7195:1: rule__TaskContext__OperationsAssignment_10_2 : ( ruleOperation ) ;
    public final void rule__TaskContext__OperationsAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7199:1: ( ( ruleOperation ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7200:1: ( ruleOperation )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7200:1: ( ruleOperation )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7201:1: ruleOperation
            {
             before(grammarAccess.getTaskContextAccess().getOperationsOperationParserRuleCall_10_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_rule__TaskContext__OperationsAssignment_10_214237);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getTaskContextAccess().getOperationsOperationParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__OperationsAssignment_10_2"


    // $ANTLR start "rule__TaskContext__OperationsAssignment_10_3_1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7210:1: rule__TaskContext__OperationsAssignment_10_3_1 : ( ruleOperation ) ;
    public final void rule__TaskContext__OperationsAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7214:1: ( ( ruleOperation ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7215:1: ( ruleOperation )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7215:1: ( ruleOperation )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7216:1: ruleOperation
            {
             before(grammarAccess.getTaskContextAccess().getOperationsOperationParserRuleCall_10_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_rule__TaskContext__OperationsAssignment_10_3_114268);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getTaskContextAccess().getOperationsOperationParserRuleCall_10_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskContext__OperationsAssignment_10_3_1"


    // $ANTLR start "rule__PeerGroup__NameAssignment_1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7225:1: rule__PeerGroup__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__PeerGroup__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7229:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7230:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7230:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7231:1: ruleEString
            {
             before(grammarAccess.getPeerGroupAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__PeerGroup__NameAssignment_114299);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7240:1: rule__PeerGroup__CoordinatorAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__PeerGroup__CoordinatorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7244:1: ( ( ( ruleEString ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7245:1: ( ( ruleEString ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7245:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7246:1: ( ruleEString )
            {
             before(grammarAccess.getPeerGroupAccess().getCoordinatorTaskContextCrossReference_4_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7247:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7248:1: ruleEString
            {
             before(grammarAccess.getPeerGroupAccess().getCoordinatorTaskContextEStringParserRuleCall_4_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__PeerGroup__CoordinatorAssignment_414334);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7259:1: rule__PeerGroup__MembersAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__PeerGroup__MembersAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7263:1: ( ( ( ruleEString ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7264:1: ( ( ruleEString ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7264:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7265:1: ( ruleEString )
            {
             before(grammarAccess.getPeerGroupAccess().getMembersTaskContextCrossReference_5_2_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7266:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7267:1: ruleEString
            {
             before(grammarAccess.getPeerGroupAccess().getMembersTaskContextEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__PeerGroup__MembersAssignment_5_214373);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7278:1: rule__PeerGroup__MembersAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__PeerGroup__MembersAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7282:1: ( ( ( ruleEString ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7283:1: ( ( ruleEString ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7283:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7284:1: ( ruleEString )
            {
             before(grammarAccess.getPeerGroupAccess().getMembersTaskContextCrossReference_5_3_1_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7285:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7286:1: ruleEString
            {
             before(grammarAccess.getPeerGroupAccess().getMembersTaskContextEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__PeerGroup__MembersAssignment_5_3_114412);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7297:1: rule__ConnectionPolicy__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ConnectionPolicy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7301:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7302:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7302:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7303:1: ruleEString
            {
             before(grammarAccess.getConnectionPolicyAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ConnectionPolicy__NameAssignment_114447);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7312:1: rule__ConnectionPolicy__BufferSizeAssignment_3_1 : ( ruleEShort ) ;
    public final void rule__ConnectionPolicy__BufferSizeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7316:1: ( ( ruleEShort ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7317:1: ( ruleEShort )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7317:1: ( ruleEShort )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7318:1: ruleEShort
            {
             before(grammarAccess.getConnectionPolicyAccess().getBufferSizeEShortParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEShort_in_rule__ConnectionPolicy__BufferSizeAssignment_3_114478);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7327:1: rule__ConnectionPolicy__LockPolicyAssignment_4_1 : ( ruleConnectionPolicyLockPolicy ) ;
    public final void rule__ConnectionPolicy__LockPolicyAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7331:1: ( ( ruleConnectionPolicyLockPolicy ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7332:1: ( ruleConnectionPolicyLockPolicy )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7332:1: ( ruleConnectionPolicyLockPolicy )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7333:1: ruleConnectionPolicyLockPolicy
            {
             before(grammarAccess.getConnectionPolicyAccess().getLockPolicyConnectionPolicyLockPolicyEnumRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConnectionPolicyLockPolicy_in_rule__ConnectionPolicy__LockPolicyAssignment_4_114509);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7342:1: rule__ConnectionPolicy__TypeAssignment_5_1 : ( ruleConnectionPolicyType ) ;
    public final void rule__ConnectionPolicy__TypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7346:1: ( ( ruleConnectionPolicyType ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7347:1: ( ruleConnectionPolicyType )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7347:1: ( ruleConnectionPolicyType )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7348:1: ruleConnectionPolicyType
            {
             before(grammarAccess.getConnectionPolicyAccess().getTypeConnectionPolicyTypeEnumRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConnectionPolicyType_in_rule__ConnectionPolicy__TypeAssignment_5_114540);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7357:1: rule__ConnectionPolicy__InputPortAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__ConnectionPolicy__InputPortAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7361:1: ( ( ( ruleEString ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7362:1: ( ( ruleEString ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7362:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7363:1: ( ruleEString )
            {
             before(grammarAccess.getConnectionPolicyAccess().getInputPortInputPortCrossReference_7_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7364:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7365:1: ruleEString
            {
             before(grammarAccess.getConnectionPolicyAccess().getInputPortInputPortEStringParserRuleCall_7_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ConnectionPolicy__InputPortAssignment_714575);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7376:1: rule__ConnectionPolicy__OutputPortAssignment_9 : ( ( ruleEString ) ) ;
    public final void rule__ConnectionPolicy__OutputPortAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7380:1: ( ( ( ruleEString ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7381:1: ( ( ruleEString ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7381:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7382:1: ( ruleEString )
            {
             before(grammarAccess.getConnectionPolicyAccess().getOutputPortOutputPortCrossReference_9_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7383:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7384:1: ruleEString
            {
             before(grammarAccess.getConnectionPolicyAccess().getOutputPortOutputPortEStringParserRuleCall_9_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ConnectionPolicy__OutputPortAssignment_914614);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7395:1: rule__InputPort__IsEventPortAssignment_0 : ( ( 'isEventPort' ) ) ;
    public final void rule__InputPort__IsEventPortAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7399:1: ( ( ( 'isEventPort' ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7400:1: ( ( 'isEventPort' ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7400:1: ( ( 'isEventPort' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7401:1: ( 'isEventPort' )
            {
             before(grammarAccess.getInputPortAccess().getIsEventPortIsEventPortKeyword_0_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7402:1: ( 'isEventPort' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7403:1: 'isEventPort'
            {
             before(grammarAccess.getInputPortAccess().getIsEventPortIsEventPortKeyword_0_0()); 
            match(input,66,FollowSets000.FOLLOW_66_in_rule__InputPort__IsEventPortAssignment_014654); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7418:1: rule__InputPort__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__InputPort__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7422:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7423:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7423:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7424:1: ruleEString
            {
             before(grammarAccess.getInputPortAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputPort__NameAssignment_214693);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7433:1: rule__InputPort__DataTypeAssignment_4_1 : ( ( ruleQualifiedNameWithDot ) ) ;
    public final void rule__InputPort__DataTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7437:1: ( ( ( ruleQualifiedNameWithDot ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7438:1: ( ( ruleQualifiedNameWithDot ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7438:1: ( ( ruleQualifiedNameWithDot ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7439:1: ( ruleQualifiedNameWithDot )
            {
             before(grammarAccess.getInputPortAccess().getDataTypeDataTypeCrossReference_4_1_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7440:1: ( ruleQualifiedNameWithDot )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7441:1: ruleQualifiedNameWithDot
            {
             before(grammarAccess.getInputPortAccess().getDataTypeDataTypeQualifiedNameWithDotParserRuleCall_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_rule__InputPort__DataTypeAssignment_4_114728);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7452:1: rule__InputPort__InputConnectionPolicyAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__InputPort__InputConnectionPolicyAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7456:1: ( ( ( ruleEString ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7457:1: ( ( ruleEString ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7457:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7458:1: ( ruleEString )
            {
             before(grammarAccess.getInputPortAccess().getInputConnectionPolicyConnectionPolicyCrossReference_5_1_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7459:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7460:1: ruleEString
            {
             before(grammarAccess.getInputPortAccess().getInputConnectionPolicyConnectionPolicyEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputPort__InputConnectionPolicyAssignment_5_114767);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7471:1: rule__OutputPort__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__OutputPort__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7475:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7476:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7476:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7477:1: ruleEString
            {
             before(grammarAccess.getOutputPortAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OutputPort__NameAssignment_114802);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7486:1: rule__OutputPort__DataTypeAssignment_3_1 : ( ( ruleQualifiedNameWithDot ) ) ;
    public final void rule__OutputPort__DataTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7490:1: ( ( ( ruleQualifiedNameWithDot ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7491:1: ( ( ruleQualifiedNameWithDot ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7491:1: ( ( ruleQualifiedNameWithDot ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7492:1: ( ruleQualifiedNameWithDot )
            {
             before(grammarAccess.getOutputPortAccess().getDataTypeDataTypeCrossReference_3_1_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7493:1: ( ruleQualifiedNameWithDot )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7494:1: ruleQualifiedNameWithDot
            {
             before(grammarAccess.getOutputPortAccess().getDataTypeDataTypeQualifiedNameWithDotParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_rule__OutputPort__DataTypeAssignment_3_114837);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7505:1: rule__OutputPort__OutputConnectionPolicyAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__OutputPort__OutputConnectionPolicyAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7509:1: ( ( ( ruleEString ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7510:1: ( ( ruleEString ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7510:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7511:1: ( ruleEString )
            {
             before(grammarAccess.getOutputPortAccess().getOutputConnectionPolicyConnectionPolicyCrossReference_4_1_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7512:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7513:1: ruleEString
            {
             before(grammarAccess.getOutputPortAccess().getOutputConnectionPolicyConnectionPolicyEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OutputPort__OutputConnectionPolicyAssignment_4_114876);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7524:1: rule__Property__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Property__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7528:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7529:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7529:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7530:1: ruleEString
            {
             before(grammarAccess.getPropertyAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Property__NameAssignment_214911);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7539:1: rule__Property__DescriptionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Property__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7543:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7544:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7544:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7545:1: ruleEString
            {
             before(grammarAccess.getPropertyAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Property__DescriptionAssignment_4_114942);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7554:1: rule__Property__ValueAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Property__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7558:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7559:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7559:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7560:1: ruleEString
            {
             before(grammarAccess.getPropertyAccess().getValueEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Property__ValueAssignment_5_114973);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7569:1: rule__Property__TypeAssignment_6_1 : ( ( ruleQualifiedNameWithDot ) ) ;
    public final void rule__Property__TypeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7573:1: ( ( ( ruleQualifiedNameWithDot ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7574:1: ( ( ruleQualifiedNameWithDot ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7574:1: ( ( ruleQualifiedNameWithDot ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7575:1: ( ruleQualifiedNameWithDot )
            {
             before(grammarAccess.getPropertyAccess().getTypeDataTypeCrossReference_6_1_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7576:1: ( ruleQualifiedNameWithDot )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7577:1: ruleQualifiedNameWithDot
            {
             before(grammarAccess.getPropertyAccess().getTypeDataTypeQualifiedNameWithDotParserRuleCall_6_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_rule__Property__TypeAssignment_6_115008);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7588:1: rule__Operation__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Operation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7592:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7593:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7593:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7594:1: ruleEString
            {
             before(grammarAccess.getOperationAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Operation__NameAssignment_215043);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7603:1: rule__Operation__DocumentationAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Operation__DocumentationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7607:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7608:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7608:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7609:1: ruleEString
            {
             before(grammarAccess.getOperationAccess().getDocumentationEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Operation__DocumentationAssignment_4_115074);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7618:1: rule__Operation__ReturnTypeAssignment_5_1 : ( ( ruleQualifiedNameWithDot ) ) ;
    public final void rule__Operation__ReturnTypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7622:1: ( ( ( ruleQualifiedNameWithDot ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7623:1: ( ( ruleQualifiedNameWithDot ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7623:1: ( ( ruleQualifiedNameWithDot ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7624:1: ( ruleQualifiedNameWithDot )
            {
             before(grammarAccess.getOperationAccess().getReturnTypeDataTypeCrossReference_5_1_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7625:1: ( ruleQualifiedNameWithDot )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7626:1: ruleQualifiedNameWithDot
            {
             before(grammarAccess.getOperationAccess().getReturnTypeDataTypeQualifiedNameWithDotParserRuleCall_5_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_rule__Operation__ReturnTypeAssignment_5_115109);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7637:1: rule__Activity__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Activity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7641:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7642:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7642:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7643:1: ruleEString
            {
             before(grammarAccess.getActivityAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Activity__NameAssignment_115144);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7652:1: rule__Activity__SchedulerAssignment_4 : ( ruleScheduler ) ;
    public final void rule__Activity__SchedulerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7656:1: ( ( ruleScheduler ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7657:1: ( ruleScheduler )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7657:1: ( ruleScheduler )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7658:1: ruleScheduler
            {
             before(grammarAccess.getActivityAccess().getSchedulerSchedulerEnumRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleScheduler_in_rule__Activity__SchedulerAssignment_415175);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7667:1: rule__Activity__CpuAffinityAssignment_6 : ( ruleEString ) ;
    public final void rule__Activity__CpuAffinityAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7671:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7672:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7672:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7673:1: ruleEString
            {
             before(grammarAccess.getActivityAccess().getCpuAffinityEStringParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Activity__CpuAffinityAssignment_615206);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7682:1: rule__Activity__PeriodAssignment_8 : ( ruleEFloat ) ;
    public final void rule__Activity__PeriodAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7686:1: ( ( ruleEFloat ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7687:1: ( ruleEFloat )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7687:1: ( ruleEFloat )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7688:1: ruleEFloat
            {
             before(grammarAccess.getActivityAccess().getPeriodEFloatParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_rule__Activity__PeriodAssignment_815237);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7697:1: rule__Activity__PriorityAssignment_10 : ( ruleEInt ) ;
    public final void rule__Activity__PriorityAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7701:1: ( ( ruleEInt ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7702:1: ( ruleEInt )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7702:1: ( ruleEInt )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7703:1: ruleEInt
            {
             before(grammarAccess.getActivityAccess().getPriorityEIntParserRuleCall_10_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Activity__PriorityAssignment_1015268);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7712:1: rule__Activity__TaskContextAssignment_11_1 : ( ( ruleEString ) ) ;
    public final void rule__Activity__TaskContextAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7716:1: ( ( ( ruleEString ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7717:1: ( ( ruleEString ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7717:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7718:1: ( ruleEString )
            {
             before(grammarAccess.getActivityAccess().getTaskContextTaskContextCrossReference_11_1_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7719:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7720:1: ruleEString
            {
             before(grammarAccess.getActivityAccess().getTaskContextTaskContextEStringParserRuleCall_11_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Activity__TaskContextAssignment_11_115303);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7731:1: rule__Activity__SlaveAssignment_12_2 : ( ruleSlave ) ;
    public final void rule__Activity__SlaveAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7735:1: ( ( ruleSlave ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7736:1: ( ruleSlave )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7736:1: ( ruleSlave )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7737:1: ruleSlave
            {
             before(grammarAccess.getActivityAccess().getSlaveSlaveParserRuleCall_12_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSlave_in_rule__Activity__SlaveAssignment_12_215338);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7746:1: rule__Activity__SlaveAssignment_12_3_1 : ( ruleSlave ) ;
    public final void rule__Activity__SlaveAssignment_12_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7750:1: ( ( ruleSlave ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7751:1: ( ruleSlave )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7751:1: ( ruleSlave )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7752:1: ruleSlave
            {
             before(grammarAccess.getActivityAccess().getSlaveSlaveParserRuleCall_12_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSlave_in_rule__Activity__SlaveAssignment_12_3_115369);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7761:1: rule__Slave__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Slave__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7765:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7766:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7766:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7767:1: ruleEString
            {
             before(grammarAccess.getSlaveAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Slave__NameAssignment_215400);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7776:1: rule__Slave__TaskContextAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Slave__TaskContextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7780:1: ( ( ( ruleEString ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7781:1: ( ( ruleEString ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7781:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7782:1: ( ruleEString )
            {
             before(grammarAccess.getSlaveAccess().getTaskContextTaskContextCrossReference_4_1_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7783:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7784:1: ruleEString
            {
             before(grammarAccess.getSlaveAccess().getTaskContextTaskContextEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Slave__TaskContextAssignment_4_115435);
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
        public static final BitSet FOLLOW_rule__Package__Group_5__1__Impl_in_rule__Package__Group_5__12437 = new BitSet(new long[]{0x0000008000000000L});
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
        public static final BitSet FOLLOW_rule__Package__Group_5_3__0__Impl_in_rule__Package__Group_5_3__02689 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__Package__Group_5_3__1_in_rule__Package__Group_5_3__02692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Package__Group_5_3__0__Impl2720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5_3__1__Impl_in_rule__Package__Group_5_3__12751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__ConnectionPoliciesAssignment_5_3_1_in_rule__Package__Group_5_3__1__Impl2778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_6__0__Impl_in_rule__Package__Group_6__02812 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Package__Group_6__1_in_rule__Package__Group_6__02815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Package__Group_6__0__Impl2843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_6__1__Impl_in_rule__Package__Group_6__12874 = new BitSet(new long[]{0x0000000400000000L});
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
        public static final BitSet FOLLOW_rule__Package__Group_6_3__0__Impl_in_rule__Package__Group_6_3__03126 = new BitSet(new long[]{0x0000000400000000L});
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
        public static final BitSet FOLLOW_rule__TaskContext__Group__6__Impl_in_rule__TaskContext__Group__63617 = new BitSet(new long[]{0x00000003C0400000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__7_in_rule__TaskContext__Group__63620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__TypeAssignment_6_in_rule__TaskContext__Group__6__Impl3647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__7__Impl_in_rule__TaskContext__Group__73677 = new BitSet(new long[]{0x00000003C0400000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__8_in_rule__TaskContext__Group__73680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7__0_in_rule__TaskContext__Group__7__Impl3707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__8__Impl_in_rule__TaskContext__Group__83738 = new BitSet(new long[]{0x00000003C0400000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__9_in_rule__TaskContext__Group__83741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8__0_in_rule__TaskContext__Group__8__Impl3768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__9__Impl_in_rule__TaskContext__Group__93799 = new BitSet(new long[]{0x00000003C0400000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__10_in_rule__TaskContext__Group__93802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9__0_in_rule__TaskContext__Group__9__Impl3829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__10__Impl_in_rule__TaskContext__Group__103860 = new BitSet(new long[]{0x00000003C0400000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__11_in_rule__TaskContext__Group__103863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10__0_in_rule__TaskContext__Group__10__Impl3890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__11__Impl_in_rule__TaskContext__Group__113921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__TaskContext__Group__11__Impl3949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7__0__Impl_in_rule__TaskContext__Group_7__04004 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7__1_in_rule__TaskContext__Group_7__04007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__TaskContext__Group_7__0__Impl4035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7__1__Impl_in_rule__TaskContext__Group_7__14066 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7__2_in_rule__TaskContext__Group_7__14069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__TaskContext__Group_7__1__Impl4097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7__2__Impl_in_rule__TaskContext__Group_7__24128 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7__3_in_rule__TaskContext__Group_7__24131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__InputPortsAssignment_7_2_in_rule__TaskContext__Group_7__2__Impl4158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7__3__Impl_in_rule__TaskContext__Group_7__34188 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7__4_in_rule__TaskContext__Group_7__34191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7_3__0_in_rule__TaskContext__Group_7__3__Impl4218 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7__4__Impl_in_rule__TaskContext__Group_7__44249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__TaskContext__Group_7__4__Impl4277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7_3__0__Impl_in_rule__TaskContext__Group_7_3__04318 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7_3__1_in_rule__TaskContext__Group_7_3__04321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__TaskContext__Group_7_3__0__Impl4349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7_3__1__Impl_in_rule__TaskContext__Group_7_3__14380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__InputPortsAssignment_7_3_1_in_rule__TaskContext__Group_7_3__1__Impl4407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8__0__Impl_in_rule__TaskContext__Group_8__04441 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8__1_in_rule__TaskContext__Group_8__04444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__TaskContext__Group_8__0__Impl4472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8__1__Impl_in_rule__TaskContext__Group_8__14503 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8__2_in_rule__TaskContext__Group_8__14506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__TaskContext__Group_8__1__Impl4534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8__2__Impl_in_rule__TaskContext__Group_8__24565 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8__3_in_rule__TaskContext__Group_8__24568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__OutputPortsAssignment_8_2_in_rule__TaskContext__Group_8__2__Impl4595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8__3__Impl_in_rule__TaskContext__Group_8__34625 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8__4_in_rule__TaskContext__Group_8__34628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8_3__0_in_rule__TaskContext__Group_8__3__Impl4655 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8__4__Impl_in_rule__TaskContext__Group_8__44686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__TaskContext__Group_8__4__Impl4714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8_3__0__Impl_in_rule__TaskContext__Group_8_3__04755 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8_3__1_in_rule__TaskContext__Group_8_3__04758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__TaskContext__Group_8_3__0__Impl4786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8_3__1__Impl_in_rule__TaskContext__Group_8_3__14817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__OutputPortsAssignment_8_3_1_in_rule__TaskContext__Group_8_3__1__Impl4844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9__0__Impl_in_rule__TaskContext__Group_9__04878 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9__1_in_rule__TaskContext__Group_9__04881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__TaskContext__Group_9__0__Impl4909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9__1__Impl_in_rule__TaskContext__Group_9__14940 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9__2_in_rule__TaskContext__Group_9__14943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__TaskContext__Group_9__1__Impl4971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9__2__Impl_in_rule__TaskContext__Group_9__25002 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9__3_in_rule__TaskContext__Group_9__25005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__PropertiesAssignment_9_2_in_rule__TaskContext__Group_9__2__Impl5032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9__3__Impl_in_rule__TaskContext__Group_9__35062 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9__4_in_rule__TaskContext__Group_9__35065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9_3__0_in_rule__TaskContext__Group_9__3__Impl5092 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9__4__Impl_in_rule__TaskContext__Group_9__45123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__TaskContext__Group_9__4__Impl5151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9_3__0__Impl_in_rule__TaskContext__Group_9_3__05192 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9_3__1_in_rule__TaskContext__Group_9_3__05195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__TaskContext__Group_9_3__0__Impl5223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9_3__1__Impl_in_rule__TaskContext__Group_9_3__15254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__PropertiesAssignment_9_3_1_in_rule__TaskContext__Group_9_3__1__Impl5281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10__0__Impl_in_rule__TaskContext__Group_10__05315 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10__1_in_rule__TaskContext__Group_10__05318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__TaskContext__Group_10__0__Impl5346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10__1__Impl_in_rule__TaskContext__Group_10__15377 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10__2_in_rule__TaskContext__Group_10__15380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__TaskContext__Group_10__1__Impl5408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10__2__Impl_in_rule__TaskContext__Group_10__25439 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10__3_in_rule__TaskContext__Group_10__25442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__OperationsAssignment_10_2_in_rule__TaskContext__Group_10__2__Impl5469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10__3__Impl_in_rule__TaskContext__Group_10__35499 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10__4_in_rule__TaskContext__Group_10__35502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10_3__0_in_rule__TaskContext__Group_10__3__Impl5529 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10__4__Impl_in_rule__TaskContext__Group_10__45560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__TaskContext__Group_10__4__Impl5588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10_3__0__Impl_in_rule__TaskContext__Group_10_3__05629 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10_3__1_in_rule__TaskContext__Group_10_3__05632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__TaskContext__Group_10_3__0__Impl5660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10_3__1__Impl_in_rule__TaskContext__Group_10_3__15691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__OperationsAssignment_10_3_1_in_rule__TaskContext__Group_10_3__1__Impl5718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group__0__Impl_in_rule__PeerGroup__Group__05752 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group__1_in_rule__PeerGroup__Group__05755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__PeerGroup__Group__0__Impl5783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group__1__Impl_in_rule__PeerGroup__Group__15814 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group__2_in_rule__PeerGroup__Group__15817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__NameAssignment_1_in_rule__PeerGroup__Group__1__Impl5844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group__2__Impl_in_rule__PeerGroup__Group__25874 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group__3_in_rule__PeerGroup__Group__25877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__PeerGroup__Group__2__Impl5905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group__3__Impl_in_rule__PeerGroup__Group__35936 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group__4_in_rule__PeerGroup__Group__35939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__PeerGroup__Group__3__Impl5967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group__4__Impl_in_rule__PeerGroup__Group__45998 = new BitSet(new long[]{0x0000001000400000L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group__5_in_rule__PeerGroup__Group__46001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__CoordinatorAssignment_4_in_rule__PeerGroup__Group__4__Impl6028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group__5__Impl_in_rule__PeerGroup__Group__56058 = new BitSet(new long[]{0x0000001000400000L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group__6_in_rule__PeerGroup__Group__56061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group_5__0_in_rule__PeerGroup__Group__5__Impl6088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group__6__Impl_in_rule__PeerGroup__Group__66119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__PeerGroup__Group__6__Impl6147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group_5__0__Impl_in_rule__PeerGroup__Group_5__06192 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group_5__1_in_rule__PeerGroup__Group_5__06195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__PeerGroup__Group_5__0__Impl6223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group_5__1__Impl_in_rule__PeerGroup__Group_5__16254 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group_5__2_in_rule__PeerGroup__Group_5__16257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__PeerGroup__Group_5__1__Impl6285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group_5__2__Impl_in_rule__PeerGroup__Group_5__26316 = new BitSet(new long[]{0x0000004001000000L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group_5__3_in_rule__PeerGroup__Group_5__26319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__MembersAssignment_5_2_in_rule__PeerGroup__Group_5__2__Impl6346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group_5__3__Impl_in_rule__PeerGroup__Group_5__36376 = new BitSet(new long[]{0x0000004001000000L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group_5__4_in_rule__PeerGroup__Group_5__36379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group_5_3__0_in_rule__PeerGroup__Group_5__3__Impl6406 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group_5__4__Impl_in_rule__PeerGroup__Group_5__46437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__PeerGroup__Group_5__4__Impl6465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group_5_3__0__Impl_in_rule__PeerGroup__Group_5_3__06506 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group_5_3__1_in_rule__PeerGroup__Group_5_3__06509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__PeerGroup__Group_5_3__0__Impl6537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__Group_5_3__1__Impl_in_rule__PeerGroup__Group_5_3__16568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PeerGroup__MembersAssignment_5_3_1_in_rule__PeerGroup__Group_5_3__1__Impl6595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__0__Impl_in_rule__ConnectionPolicy__Group__06629 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__1_in_rule__ConnectionPolicy__Group__06632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__ConnectionPolicy__Group__0__Impl6660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__1__Impl_in_rule__ConnectionPolicy__Group__16691 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__2_in_rule__ConnectionPolicy__Group__16694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__NameAssignment_1_in_rule__ConnectionPolicy__Group__1__Impl6721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__2__Impl_in_rule__ConnectionPolicy__Group__26751 = new BitSet(new long[]{0x00000D0020000000L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__3_in_rule__ConnectionPolicy__Group__26754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__ConnectionPolicy__Group__2__Impl6782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__3__Impl_in_rule__ConnectionPolicy__Group__36813 = new BitSet(new long[]{0x00000D0020000000L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__4_in_rule__ConnectionPolicy__Group__36816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_3__0_in_rule__ConnectionPolicy__Group__3__Impl6843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__4__Impl_in_rule__ConnectionPolicy__Group__46874 = new BitSet(new long[]{0x00000D0020000000L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__5_in_rule__ConnectionPolicy__Group__46877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_4__0_in_rule__ConnectionPolicy__Group__4__Impl6904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__5__Impl_in_rule__ConnectionPolicy__Group__56935 = new BitSet(new long[]{0x00000D0020000000L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__6_in_rule__ConnectionPolicy__Group__56938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_5__0_in_rule__ConnectionPolicy__Group__5__Impl6965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__6__Impl_in_rule__ConnectionPolicy__Group__66996 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__7_in_rule__ConnectionPolicy__Group__66999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__ConnectionPolicy__Group__6__Impl7027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__7__Impl_in_rule__ConnectionPolicy__Group__77058 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__8_in_rule__ConnectionPolicy__Group__77061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__InputPortAssignment_7_in_rule__ConnectionPolicy__Group__7__Impl7088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__8__Impl_in_rule__ConnectionPolicy__Group__87118 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__9_in_rule__ConnectionPolicy__Group__87121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__ConnectionPolicy__Group__8__Impl7149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__9__Impl_in_rule__ConnectionPolicy__Group__97180 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__10_in_rule__ConnectionPolicy__Group__97183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__OutputPortAssignment_9_in_rule__ConnectionPolicy__Group__9__Impl7210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__10__Impl_in_rule__ConnectionPolicy__Group__107240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__ConnectionPolicy__Group__10__Impl7268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_3__0__Impl_in_rule__ConnectionPolicy__Group_3__07321 = new BitSet(new long[]{0x0080000000000040L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_3__1_in_rule__ConnectionPolicy__Group_3__07324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__ConnectionPolicy__Group_3__0__Impl7352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_3__1__Impl_in_rule__ConnectionPolicy__Group_3__17383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__BufferSizeAssignment_3_1_in_rule__ConnectionPolicy__Group_3__1__Impl7410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_4__0__Impl_in_rule__ConnectionPolicy__Group_4__07444 = new BitSet(new long[]{0x000000000000E000L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_4__1_in_rule__ConnectionPolicy__Group_4__07447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__ConnectionPolicy__Group_4__0__Impl7475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_4__1__Impl_in_rule__ConnectionPolicy__Group_4__17506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__LockPolicyAssignment_4_1_in_rule__ConnectionPolicy__Group_4__1__Impl7533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_5__0__Impl_in_rule__ConnectionPolicy__Group_5__07567 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_5__1_in_rule__ConnectionPolicy__Group_5__07570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__ConnectionPolicy__Group_5__0__Impl7598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_5__1__Impl_in_rule__ConnectionPolicy__Group_5__17629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__TypeAssignment_5_1_in_rule__ConnectionPolicy__Group_5__1__Impl7656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group__0__Impl_in_rule__InputPort__Group__07690 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_rule__InputPort__Group__1_in_rule__InputPort__Group__07693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__IsEventPortAssignment_0_in_rule__InputPort__Group__0__Impl7720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group__1__Impl_in_rule__InputPort__Group__17750 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputPort__Group__2_in_rule__InputPort__Group__17753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__InputPort__Group__1__Impl7781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group__2__Impl_in_rule__InputPort__Group__27812 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__InputPort__Group__3_in_rule__InputPort__Group__27815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__NameAssignment_2_in_rule__InputPort__Group__2__Impl7842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group__3__Impl_in_rule__InputPort__Group__37872 = new BitSet(new long[]{0x0000600000400000L});
        public static final BitSet FOLLOW_rule__InputPort__Group__4_in_rule__InputPort__Group__37875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__InputPort__Group__3__Impl7903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group__4__Impl_in_rule__InputPort__Group__47934 = new BitSet(new long[]{0x0000600000400000L});
        public static final BitSet FOLLOW_rule__InputPort__Group__5_in_rule__InputPort__Group__47937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group_4__0_in_rule__InputPort__Group__4__Impl7964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group__5__Impl_in_rule__InputPort__Group__57995 = new BitSet(new long[]{0x0000600000400000L});
        public static final BitSet FOLLOW_rule__InputPort__Group__6_in_rule__InputPort__Group__57998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group_5__0_in_rule__InputPort__Group__5__Impl8025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group__6__Impl_in_rule__InputPort__Group__68056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__InputPort__Group__6__Impl8084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group_4__0__Impl_in_rule__InputPort__Group_4__08129 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__InputPort__Group_4__1_in_rule__InputPort__Group_4__08132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__InputPort__Group_4__0__Impl8160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group_4__1__Impl_in_rule__InputPort__Group_4__18191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__DataTypeAssignment_4_1_in_rule__InputPort__Group_4__1__Impl8218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group_5__0__Impl_in_rule__InputPort__Group_5__08252 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputPort__Group_5__1_in_rule__InputPort__Group_5__08255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__InputPort__Group_5__0__Impl8283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group_5__1__Impl_in_rule__InputPort__Group_5__18314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__InputConnectionPolicyAssignment_5_1_in_rule__InputPort__Group_5__1__Impl8341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__0__Impl_in_rule__OutputPort__Group__08375 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__1_in_rule__OutputPort__Group__08378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__OutputPort__Group__0__Impl8406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__1__Impl_in_rule__OutputPort__Group__18437 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__2_in_rule__OutputPort__Group__18440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__NameAssignment_1_in_rule__OutputPort__Group__1__Impl8467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__2__Impl_in_rule__OutputPort__Group__28497 = new BitSet(new long[]{0x0001200000400000L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__3_in_rule__OutputPort__Group__28500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__OutputPort__Group__2__Impl8528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__3__Impl_in_rule__OutputPort__Group__38559 = new BitSet(new long[]{0x0001200000400000L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__4_in_rule__OutputPort__Group__38562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group_3__0_in_rule__OutputPort__Group__3__Impl8589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__4__Impl_in_rule__OutputPort__Group__48620 = new BitSet(new long[]{0x0001200000400000L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__5_in_rule__OutputPort__Group__48623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group_4__0_in_rule__OutputPort__Group__4__Impl8650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__5__Impl_in_rule__OutputPort__Group__58681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__OutputPort__Group__5__Impl8709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group_3__0__Impl_in_rule__OutputPort__Group_3__08752 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OutputPort__Group_3__1_in_rule__OutputPort__Group_3__08755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__OutputPort__Group_3__0__Impl8783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group_3__1__Impl_in_rule__OutputPort__Group_3__18814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__DataTypeAssignment_3_1_in_rule__OutputPort__Group_3__1__Impl8841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group_4__0__Impl_in_rule__OutputPort__Group_4__08875 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__OutputPort__Group_4__1_in_rule__OutputPort__Group_4__08878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__OutputPort__Group_4__0__Impl8906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group_4__1__Impl_in_rule__OutputPort__Group_4__18937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__OutputConnectionPolicyAssignment_4_1_in_rule__OutputPort__Group_4__1__Impl8964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__08998 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__09001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__19059 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__19062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__Property__Group__1__Impl9090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__29121 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Property__Group__3_in_rule__Property__Group__29124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__NameAssignment_2_in_rule__Property__Group__2__Impl9151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__3__Impl_in_rule__Property__Group__39181 = new BitSet(new long[]{0x000C000020400000L});
        public static final BitSet FOLLOW_rule__Property__Group__4_in_rule__Property__Group__39184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Property__Group__3__Impl9212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__4__Impl_in_rule__Property__Group__49243 = new BitSet(new long[]{0x000C000020400000L});
        public static final BitSet FOLLOW_rule__Property__Group__5_in_rule__Property__Group__49246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group_4__0_in_rule__Property__Group__4__Impl9273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__5__Impl_in_rule__Property__Group__59304 = new BitSet(new long[]{0x000C000020400000L});
        public static final BitSet FOLLOW_rule__Property__Group__6_in_rule__Property__Group__59307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group_5__0_in_rule__Property__Group__5__Impl9334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__6__Impl_in_rule__Property__Group__69365 = new BitSet(new long[]{0x000C000020400000L});
        public static final BitSet FOLLOW_rule__Property__Group__7_in_rule__Property__Group__69368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group_6__0_in_rule__Property__Group__6__Impl9395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__7__Impl_in_rule__Property__Group__79426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Property__Group__7__Impl9454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group_4__0__Impl_in_rule__Property__Group_4__09501 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Property__Group_4__1_in_rule__Property__Group_4__09504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__Property__Group_4__0__Impl9532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group_4__1__Impl_in_rule__Property__Group_4__19563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__DescriptionAssignment_4_1_in_rule__Property__Group_4__1__Impl9590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group_5__0__Impl_in_rule__Property__Group_5__09624 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Property__Group_5__1_in_rule__Property__Group_5__09627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__Property__Group_5__0__Impl9655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group_5__1__Impl_in_rule__Property__Group_5__19686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__ValueAssignment_5_1_in_rule__Property__Group_5__1__Impl9713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group_6__0__Impl_in_rule__Property__Group_6__09747 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Property__Group_6__1_in_rule__Property__Group_6__09750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Property__Group_6__0__Impl9778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group_6__1__Impl_in_rule__Property__Group_6__19809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__TypeAssignment_6_1_in_rule__Property__Group_6__1__Impl9836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__09870 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__09873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__19931 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__19934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__Operation__Group__1__Impl9962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__29993 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__29996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__NameAssignment_2_in_rule__Operation__Group__2__Impl10023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__310053 = new BitSet(new long[]{0x0060000000400000L});
        public static final BitSet FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__310056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Operation__Group__3__Impl10084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__410115 = new BitSet(new long[]{0x0060000000400000L});
        public static final BitSet FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__410118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_4__0_in_rule__Operation__Group__4__Impl10145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__510176 = new BitSet(new long[]{0x0060000000400000L});
        public static final BitSet FOLLOW_rule__Operation__Group__6_in_rule__Operation__Group__510179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_5__0_in_rule__Operation__Group__5__Impl10206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__6__Impl_in_rule__Operation__Group__610237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Operation__Group__6__Impl10265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_4__0__Impl_in_rule__Operation__Group_4__010310 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Operation__Group_4__1_in_rule__Operation__Group_4__010313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rule__Operation__Group_4__0__Impl10341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_4__1__Impl_in_rule__Operation__Group_4__110372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__DocumentationAssignment_4_1_in_rule__Operation__Group_4__1__Impl10399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_5__0__Impl_in_rule__Operation__Group_5__010433 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Operation__Group_5__1_in_rule__Operation__Group_5__010436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rule__Operation__Group_5__0__Impl10464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_5__1__Impl_in_rule__Operation__Group_5__110495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__ReturnTypeAssignment_5_1_in_rule__Operation__Group_5__1__Impl10522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EShort__Group__0__Impl_in_rule__EShort__Group__010556 = new BitSet(new long[]{0x0080000000000040L});
        public static final BitSet FOLLOW_rule__EShort__Group__1_in_rule__EShort__Group__010559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rule__EShort__Group__0__Impl10588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EShort__Group__1__Impl_in_rule__EShort__Group__110621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EShort__Group__1__Impl10648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__010681 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__010684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rule__Activity__Group__0__Impl10712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__110743 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__110746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__NameAssignment_1_in_rule__Activity__Group__1__Impl10773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__210803 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__210806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Activity__Group__2__Impl10834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__310865 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__310868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_rule__Activity__Group__3__Impl10896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__410927 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__410930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__SchedulerAssignment_4_in_rule__Activity__Group__4__Impl10957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__510987 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__510990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_rule__Activity__Group__5__Impl11018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__611049 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__611052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__CpuAffinityAssignment_6_in_rule__Activity__Group__6__Impl11079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__711109 = new BitSet(new long[]{0x0080000000000040L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Activity__Group__8_in_rule__Activity__Group__711112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_rule__Activity__Group__7__Impl11140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__8__Impl_in_rule__Activity__Group__811171 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group__9_in_rule__Activity__Group__811174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__PeriodAssignment_8_in_rule__Activity__Group__8__Impl11201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__9__Impl_in_rule__Activity__Group__911231 = new BitSet(new long[]{0x0080000000000040L});
        public static final BitSet FOLLOW_rule__Activity__Group__10_in_rule__Activity__Group__911234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_rule__Activity__Group__9__Impl11262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__10__Impl_in_rule__Activity__Group__1011293 = new BitSet(new long[]{0x6000000000400000L});
        public static final BitSet FOLLOW_rule__Activity__Group__11_in_rule__Activity__Group__1011296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__PriorityAssignment_10_in_rule__Activity__Group__10__Impl11323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__11__Impl_in_rule__Activity__Group__1111353 = new BitSet(new long[]{0x6000000000400000L});
        public static final BitSet FOLLOW_rule__Activity__Group__12_in_rule__Activity__Group__1111356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_11__0_in_rule__Activity__Group__11__Impl11383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__12__Impl_in_rule__Activity__Group__1211414 = new BitSet(new long[]{0x6000000000400000L});
        public static final BitSet FOLLOW_rule__Activity__Group__13_in_rule__Activity__Group__1211417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_12__0_in_rule__Activity__Group__12__Impl11444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__13__Impl_in_rule__Activity__Group__1311475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Activity__Group__13__Impl11503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_11__0__Impl_in_rule__Activity__Group_11__011562 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Activity__Group_11__1_in_rule__Activity__Group_11__011565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_rule__Activity__Group_11__0__Impl11593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_11__1__Impl_in_rule__Activity__Group_11__111624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__TaskContextAssignment_11_1_in_rule__Activity__Group_11__1__Impl11651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_12__0__Impl_in_rule__Activity__Group_12__011685 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Activity__Group_12__1_in_rule__Activity__Group_12__011688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_rule__Activity__Group_12__0__Impl11716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_12__1__Impl_in_rule__Activity__Group_12__111747 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group_12__2_in_rule__Activity__Group_12__111750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Activity__Group_12__1__Impl11778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_12__2__Impl_in_rule__Activity__Group_12__211809 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__Activity__Group_12__3_in_rule__Activity__Group_12__211812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__SlaveAssignment_12_2_in_rule__Activity__Group_12__2__Impl11839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_12__3__Impl_in_rule__Activity__Group_12__311869 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__Activity__Group_12__4_in_rule__Activity__Group_12__311872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_12_3__0_in_rule__Activity__Group_12__3__Impl11899 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_12__4__Impl_in_rule__Activity__Group_12__411930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Activity__Group_12__4__Impl11958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_12_3__0__Impl_in_rule__Activity__Group_12_3__011999 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group_12_3__1_in_rule__Activity__Group_12_3__012002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Activity__Group_12_3__0__Impl12030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_12_3__1__Impl_in_rule__Activity__Group_12_3__112061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__SlaveAssignment_12_3_1_in_rule__Activity__Group_12_3__1__Impl12088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slave__Group__0__Impl_in_rule__Slave__Group__012122 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_rule__Slave__Group__1_in_rule__Slave__Group__012125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slave__Group__1__Impl_in_rule__Slave__Group__112183 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Slave__Group__2_in_rule__Slave__Group__112186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_rule__Slave__Group__1__Impl12214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slave__Group__2__Impl_in_rule__Slave__Group__212245 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Slave__Group__3_in_rule__Slave__Group__212248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slave__NameAssignment_2_in_rule__Slave__Group__2__Impl12275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slave__Group__3__Impl_in_rule__Slave__Group__312305 = new BitSet(new long[]{0x2000000000400000L});
        public static final BitSet FOLLOW_rule__Slave__Group__4_in_rule__Slave__Group__312308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Slave__Group__3__Impl12336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slave__Group__4__Impl_in_rule__Slave__Group__412367 = new BitSet(new long[]{0x2000000000400000L});
        public static final BitSet FOLLOW_rule__Slave__Group__5_in_rule__Slave__Group__412370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slave__Group_4__0_in_rule__Slave__Group__4__Impl12397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slave__Group__5__Impl_in_rule__Slave__Group__512428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Slave__Group__5__Impl12456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slave__Group_4__0__Impl_in_rule__Slave__Group_4__012499 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Slave__Group_4__1_in_rule__Slave__Group_4__012502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_rule__Slave__Group_4__0__Impl12530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slave__Group_4__1__Impl_in_rule__Slave__Group_4__112561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slave__TaskContextAssignment_4_1_in_rule__Slave__Group_4__1__Impl12588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__0__Impl_in_rule__EFloat__Group__012622 = new BitSet(new long[]{0x0080000000000040L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__EFloat__Group__1_in_rule__EFloat__Group__012625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rule__EFloat__Group__0__Impl12654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__1__Impl_in_rule__EFloat__Group__112687 = new BitSet(new long[]{0x0080000000000040L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__EFloat__Group__2_in_rule__EFloat__Group__112690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EFloat__Group__1__Impl12718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__2__Impl_in_rule__EFloat__Group__212749 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group__3_in_rule__EFloat__Group__212752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_rule__EFloat__Group__2__Impl12780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__3__Impl_in_rule__EFloat__Group__312811 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__EFloat__Group__4_in_rule__EFloat__Group__312814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EFloat__Group__3__Impl12841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__4__Impl_in_rule__EFloat__Group__412870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__0_in_rule__EFloat__Group__4__Impl12897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__0__Impl_in_rule__EFloat__Group_4__012938 = new BitSet(new long[]{0x0080000000000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__1_in_rule__EFloat__Group_4__012941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Alternatives_4_0_in_rule__EFloat__Group_4__0__Impl12968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__1__Impl_in_rule__EFloat__Group_4__112998 = new BitSet(new long[]{0x0080000000000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__2_in_rule__EFloat__Group_4__113001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rule__EFloat__Group_4__1__Impl13030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__2__Impl_in_rule__EFloat__Group_4__213063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EFloat__Group_4__2__Impl13090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__013125 = new BitSet(new long[]{0x0080000000000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__013128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rule__EInt__Group__0__Impl13157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__113190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl13217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__013250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__013253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl13280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__113309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl13336 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__013371 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__013374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_rule__QualifiedName__Group_1__0__Impl13402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__113433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl13460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedNameWithDot__Group__0__Impl_in_rule__QualifiedNameWithDot__Group__013493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__QualifiedNameWithDot__Group__1_in_rule__QualifiedNameWithDot__Group__013496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithDot__Group__0__Impl13523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedNameWithDot__Group__1__Impl_in_rule__QualifiedNameWithDot__Group__113552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedNameWithDot__Group_1__0_in_rule__QualifiedNameWithDot__Group__1__Impl13579 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__QualifiedNameWithDot__Group_1__0__Impl_in_rule__QualifiedNameWithDot__Group_1__013614 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__QualifiedNameWithDot__Group_1__1_in_rule__QualifiedNameWithDot__Group_1__013617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_rule__QualifiedNameWithDot__Group_1__0__Impl13645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedNameWithDot__Group_1__1__Impl_in_rule__QualifiedNameWithDot__Group_1__113676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedNameWithDot__Group_1__1__Impl13703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Package__NameAssignment_213741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTaskContext_in_rule__Package__TaskContextsAssignment_4_213772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTaskContext_in_rule__Package__TaskContextsAssignment_4_3_113803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConnectionPolicy_in_rule__Package__ConnectionPoliciesAssignment_5_213834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConnectionPolicy_in_rule__Package__ConnectionPoliciesAssignment_5_3_113865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePeerGroup_in_rule__Package__PeerGroupsAssignment_6_213896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePeerGroup_in_rule__Package__PeerGroupsAssignment_6_3_113927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TaskContext__NameAssignment_113958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_rule__TaskContext__NamespaceAssignment_413989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_rule__TaskContext__TypeAssignment_614020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputPort_in_rule__TaskContext__InputPortsAssignment_7_214051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputPort_in_rule__TaskContext__InputPortsAssignment_7_3_114082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOutputPort_in_rule__TaskContext__OutputPortsAssignment_8_214113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOutputPort_in_rule__TaskContext__OutputPortsAssignment_8_3_114144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_rule__TaskContext__PropertiesAssignment_9_214175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_rule__TaskContext__PropertiesAssignment_9_3_114206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_rule__TaskContext__OperationsAssignment_10_214237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_rule__TaskContext__OperationsAssignment_10_3_114268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__PeerGroup__NameAssignment_114299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__PeerGroup__CoordinatorAssignment_414334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__PeerGroup__MembersAssignment_5_214373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__PeerGroup__MembersAssignment_5_3_114412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ConnectionPolicy__NameAssignment_114447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEShort_in_rule__ConnectionPolicy__BufferSizeAssignment_3_114478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConnectionPolicyLockPolicy_in_rule__ConnectionPolicy__LockPolicyAssignment_4_114509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConnectionPolicyType_in_rule__ConnectionPolicy__TypeAssignment_5_114540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ConnectionPolicy__InputPortAssignment_714575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ConnectionPolicy__OutputPortAssignment_914614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_rule__InputPort__IsEventPortAssignment_014654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputPort__NameAssignment_214693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_rule__InputPort__DataTypeAssignment_4_114728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputPort__InputConnectionPolicyAssignment_5_114767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OutputPort__NameAssignment_114802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_rule__OutputPort__DataTypeAssignment_3_114837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OutputPort__OutputConnectionPolicyAssignment_4_114876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Property__NameAssignment_214911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Property__DescriptionAssignment_4_114942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Property__ValueAssignment_5_114973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_rule__Property__TypeAssignment_6_115008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Operation__NameAssignment_215043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Operation__DocumentationAssignment_4_115074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_rule__Operation__ReturnTypeAssignment_5_115109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Activity__NameAssignment_115144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScheduler_in_rule__Activity__SchedulerAssignment_415175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Activity__CpuAffinityAssignment_615206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_rule__Activity__PeriodAssignment_815237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Activity__PriorityAssignment_1015268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Activity__TaskContextAssignment_11_115303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSlave_in_rule__Activity__SlaveAssignment_12_215338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSlave_in_rule__Activity__SlaveAssignment_12_3_115369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Slave__NameAssignment_215400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Slave__TaskContextAssignment_4_115435 = new BitSet(new long[]{0x0000000000000002L});
    }


}