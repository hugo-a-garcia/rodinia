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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'UNSYNC'", "'LOCKED'", "'LOCK_FREE'", "'DATA'", "'BUFFER'", "'ORO_SCHED_OTHER'", "'ORO_SCHED_RT'", "'OrocosPackage'", "'{'", "'}'", "'taskContexts'", "','", "'connectionPolicies'", "'activities'", "'TaskContext'", "'namespace'", "'type'", "'inputPorts'", "'outputPorts'", "'properties'", "'operations'", "'ConnectionPolicy'", "'inputPort'", "'outputPort'", "'bufferSize'", "'lockPolicy'", "'InputPort'", "'dataType'", "'inputConnectionPolicy'", "'OutputPort'", "'outputConnectionPolicy'", "'Property'", "'description'", "'value'", "'Operation'", "'documentation'", "'returnType'", "'-'", "'Activity'", "'scheduler'", "'cpuAffinity'", "'period'", "'priority'", "'taskContext'", "'slave'", "'Slave'", "'.'", "'::'", "'isEventPort'"
    };
    public static final int RULE_ID=5;
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


    // $ANTLR start "entryRuleConnectionPolicy"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:116:1: entryRuleConnectionPolicy : ruleConnectionPolicy EOF ;
    public final void entryRuleConnectionPolicy() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:117:1: ( ruleConnectionPolicy EOF )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:118:1: ruleConnectionPolicy EOF
            {
             before(grammarAccess.getConnectionPolicyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConnectionPolicy_in_entryRuleConnectionPolicy181);
            ruleConnectionPolicy();

            state._fsp--;

             after(grammarAccess.getConnectionPolicyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConnectionPolicy188); 

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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:125:1: ruleConnectionPolicy : ( ( rule__ConnectionPolicy__Group__0 ) ) ;
    public final void ruleConnectionPolicy() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:129:2: ( ( ( rule__ConnectionPolicy__Group__0 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:130:1: ( ( rule__ConnectionPolicy__Group__0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:130:1: ( ( rule__ConnectionPolicy__Group__0 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:131:1: ( rule__ConnectionPolicy__Group__0 )
            {
             before(grammarAccess.getConnectionPolicyAccess().getGroup()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:132:1: ( rule__ConnectionPolicy__Group__0 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:132:2: rule__ConnectionPolicy__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__0_in_ruleConnectionPolicy214);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:144:1: entryRuleInputPort : ruleInputPort EOF ;
    public final void entryRuleInputPort() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:145:1: ( ruleInputPort EOF )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:146:1: ruleInputPort EOF
            {
             before(grammarAccess.getInputPortRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputPort_in_entryRuleInputPort241);
            ruleInputPort();

            state._fsp--;

             after(grammarAccess.getInputPortRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputPort248); 

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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:153:1: ruleInputPort : ( ( rule__InputPort__Group__0 ) ) ;
    public final void ruleInputPort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:157:2: ( ( ( rule__InputPort__Group__0 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:158:1: ( ( rule__InputPort__Group__0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:158:1: ( ( rule__InputPort__Group__0 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:159:1: ( rule__InputPort__Group__0 )
            {
             before(grammarAccess.getInputPortAccess().getGroup()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:160:1: ( rule__InputPort__Group__0 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:160:2: rule__InputPort__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__0_in_ruleInputPort274);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:172:1: entryRuleOutputPort : ruleOutputPort EOF ;
    public final void entryRuleOutputPort() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:173:1: ( ruleOutputPort EOF )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:174:1: ruleOutputPort EOF
            {
             before(grammarAccess.getOutputPortRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOutputPort_in_entryRuleOutputPort301);
            ruleOutputPort();

            state._fsp--;

             after(grammarAccess.getOutputPortRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOutputPort308); 

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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:181:1: ruleOutputPort : ( ( rule__OutputPort__Group__0 ) ) ;
    public final void ruleOutputPort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:185:2: ( ( ( rule__OutputPort__Group__0 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:186:1: ( ( rule__OutputPort__Group__0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:186:1: ( ( rule__OutputPort__Group__0 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:187:1: ( rule__OutputPort__Group__0 )
            {
             before(grammarAccess.getOutputPortAccess().getGroup()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:188:1: ( rule__OutputPort__Group__0 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:188:2: rule__OutputPort__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__0_in_ruleOutputPort334);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:200:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:201:1: ( ruleProperty EOF )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:202:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_entryRuleProperty361);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProperty368); 

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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:209:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:213:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:214:1: ( ( rule__Property__Group__0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:214:1: ( ( rule__Property__Group__0 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:215:1: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:216:1: ( rule__Property__Group__0 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:216:2: rule__Property__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__0_in_ruleProperty394);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:228:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:229:1: ( ruleOperation EOF )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:230:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_entryRuleOperation421);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperation428); 

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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:237:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:241:2: ( ( ( rule__Operation__Group__0 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:242:1: ( ( rule__Operation__Group__0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:242:1: ( ( rule__Operation__Group__0 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:243:1: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:244:1: ( rule__Operation__Group__0 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:244:2: rule__Operation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__0_in_ruleOperation454);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:256:1: entryRuleEShort : ruleEShort EOF ;
    public final void entryRuleEShort() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:257:1: ( ruleEShort EOF )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:258:1: ruleEShort EOF
            {
             before(grammarAccess.getEShortRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEShort_in_entryRuleEShort481);
            ruleEShort();

            state._fsp--;

             after(grammarAccess.getEShortRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEShort488); 

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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:265:1: ruleEShort : ( ( rule__EShort__Group__0 ) ) ;
    public final void ruleEShort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:269:2: ( ( ( rule__EShort__Group__0 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:270:1: ( ( rule__EShort__Group__0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:270:1: ( ( rule__EShort__Group__0 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:271:1: ( rule__EShort__Group__0 )
            {
             before(grammarAccess.getEShortAccess().getGroup()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:272:1: ( rule__EShort__Group__0 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:272:2: rule__EShort__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EShort__Group__0_in_ruleEShort514);
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


    // $ANTLR start "entryRuleIActivity"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:284:1: entryRuleIActivity : ruleIActivity EOF ;
    public final void entryRuleIActivity() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:285:1: ( ruleIActivity EOF )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:286:1: ruleIActivity EOF
            {
             before(grammarAccess.getIActivityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIActivity_in_entryRuleIActivity541);
            ruleIActivity();

            state._fsp--;

             after(grammarAccess.getIActivityRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIActivity548); 

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
    // $ANTLR end "entryRuleIActivity"


    // $ANTLR start "ruleIActivity"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:293:1: ruleIActivity : ( ( rule__IActivity__Alternatives ) ) ;
    public final void ruleIActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:297:2: ( ( ( rule__IActivity__Alternatives ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:298:1: ( ( rule__IActivity__Alternatives ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:298:1: ( ( rule__IActivity__Alternatives ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:299:1: ( rule__IActivity__Alternatives )
            {
             before(grammarAccess.getIActivityAccess().getAlternatives()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:300:1: ( rule__IActivity__Alternatives )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:300:2: rule__IActivity__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__IActivity__Alternatives_in_ruleIActivity574);
            rule__IActivity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIActivityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIActivity"


    // $ANTLR start "entryRuleActivity"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:312:1: entryRuleActivity : ruleActivity EOF ;
    public final void entryRuleActivity() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:313:1: ( ruleActivity EOF )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:314:1: ruleActivity EOF
            {
             before(grammarAccess.getActivityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleActivity_in_entryRuleActivity601);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getActivityRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleActivity608); 

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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:321:1: ruleActivity : ( ( rule__Activity__Group__0 ) ) ;
    public final void ruleActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:325:2: ( ( ( rule__Activity__Group__0 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:326:1: ( ( rule__Activity__Group__0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:326:1: ( ( rule__Activity__Group__0 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:327:1: ( rule__Activity__Group__0 )
            {
             before(grammarAccess.getActivityAccess().getGroup()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:328:1: ( rule__Activity__Group__0 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:328:2: rule__Activity__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__0_in_ruleActivity634);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:340:1: entryRuleSlave : ruleSlave EOF ;
    public final void entryRuleSlave() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:341:1: ( ruleSlave EOF )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:342:1: ruleSlave EOF
            {
             before(grammarAccess.getSlaveRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSlave_in_entryRuleSlave661);
            ruleSlave();

            state._fsp--;

             after(grammarAccess.getSlaveRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSlave668); 

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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:349:1: ruleSlave : ( ( rule__Slave__Group__0 ) ) ;
    public final void ruleSlave() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:353:2: ( ( ( rule__Slave__Group__0 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:354:1: ( ( rule__Slave__Group__0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:354:1: ( ( rule__Slave__Group__0 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:355:1: ( rule__Slave__Group__0 )
            {
             before(grammarAccess.getSlaveAccess().getGroup()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:356:1: ( rule__Slave__Group__0 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:356:2: rule__Slave__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group__0_in_ruleSlave694);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:368:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:369:1: ( ruleEString EOF )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:370:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString721);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString728); 

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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:377:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:381:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:382:1: ( ( rule__EString__Alternatives ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:382:1: ( ( rule__EString__Alternatives ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:383:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:384:1: ( rule__EString__Alternatives )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:384:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString754);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:396:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:397:1: ( ruleEFloat EOF )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:398:1: ruleEFloat EOF
            {
             before(grammarAccess.getEFloatRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_entryRuleEFloat781);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getEFloatRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEFloat788); 

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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:405:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:409:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:410:1: ( ( rule__EFloat__Group__0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:410:1: ( ( rule__EFloat__Group__0 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:411:1: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:412:1: ( rule__EFloat__Group__0 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:412:2: rule__EFloat__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__0_in_ruleEFloat814);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:424:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:425:1: ( ruleEInt EOF )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:426:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt841);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt848); 

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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:433:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:437:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:438:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:438:1: ( ( rule__EInt__Group__0 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:439:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:440:1: ( rule__EInt__Group__0 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:440:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt874);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:452:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:453:1: ( ruleQualifiedName EOF )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:454:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName901);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedName908); 

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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:461:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:465:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:466:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:466:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:467:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:468:1: ( rule__QualifiedName__Group__0 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:468:2: rule__QualifiedName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName934);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:480:1: entryRuleQualifiedNameWithDot : ruleQualifiedNameWithDot EOF ;
    public final void entryRuleQualifiedNameWithDot() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:481:1: ( ruleQualifiedNameWithDot EOF )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:482:1: ruleQualifiedNameWithDot EOF
            {
             before(grammarAccess.getQualifiedNameWithDotRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_entryRuleQualifiedNameWithDot961);
            ruleQualifiedNameWithDot();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithDotRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedNameWithDot968); 

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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:489:1: ruleQualifiedNameWithDot : ( ( rule__QualifiedNameWithDot__Group__0 ) ) ;
    public final void ruleQualifiedNameWithDot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:493:2: ( ( ( rule__QualifiedNameWithDot__Group__0 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:494:1: ( ( rule__QualifiedNameWithDot__Group__0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:494:1: ( ( rule__QualifiedNameWithDot__Group__0 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:495:1: ( rule__QualifiedNameWithDot__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithDotAccess().getGroup()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:496:1: ( rule__QualifiedNameWithDot__Group__0 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:496:2: rule__QualifiedNameWithDot__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedNameWithDot__Group__0_in_ruleQualifiedNameWithDot994);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:509:1: ruleConnectionPolicyLockPolicy : ( ( rule__ConnectionPolicyLockPolicy__Alternatives ) ) ;
    public final void ruleConnectionPolicyLockPolicy() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:513:1: ( ( ( rule__ConnectionPolicyLockPolicy__Alternatives ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:514:1: ( ( rule__ConnectionPolicyLockPolicy__Alternatives ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:514:1: ( ( rule__ConnectionPolicyLockPolicy__Alternatives ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:515:1: ( rule__ConnectionPolicyLockPolicy__Alternatives )
            {
             before(grammarAccess.getConnectionPolicyLockPolicyAccess().getAlternatives()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:516:1: ( rule__ConnectionPolicyLockPolicy__Alternatives )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:516:2: rule__ConnectionPolicyLockPolicy__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicyLockPolicy__Alternatives_in_ruleConnectionPolicyLockPolicy1031);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:528:1: ruleConnectionPolicyType : ( ( rule__ConnectionPolicyType__Alternatives ) ) ;
    public final void ruleConnectionPolicyType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:532:1: ( ( ( rule__ConnectionPolicyType__Alternatives ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:533:1: ( ( rule__ConnectionPolicyType__Alternatives ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:533:1: ( ( rule__ConnectionPolicyType__Alternatives ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:534:1: ( rule__ConnectionPolicyType__Alternatives )
            {
             before(grammarAccess.getConnectionPolicyTypeAccess().getAlternatives()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:535:1: ( rule__ConnectionPolicyType__Alternatives )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:535:2: rule__ConnectionPolicyType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicyType__Alternatives_in_ruleConnectionPolicyType1067);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:547:1: ruleScheduler : ( ( rule__Scheduler__Alternatives ) ) ;
    public final void ruleScheduler() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:551:1: ( ( ( rule__Scheduler__Alternatives ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:552:1: ( ( rule__Scheduler__Alternatives ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:552:1: ( ( rule__Scheduler__Alternatives ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:553:1: ( rule__Scheduler__Alternatives )
            {
             before(grammarAccess.getSchedulerAccess().getAlternatives()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:554:1: ( rule__Scheduler__Alternatives )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:554:2: rule__Scheduler__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Scheduler__Alternatives_in_ruleScheduler1103);
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


    // $ANTLR start "rule__IActivity__Alternatives"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:565:1: rule__IActivity__Alternatives : ( ( ruleActivity ) | ( ruleSlave ) );
    public final void rule__IActivity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:569:1: ( ( ruleActivity ) | ( ruleSlave ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==51) ) {
                alt1=1;
            }
            else if ( (LA1_0==58) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:570:1: ( ruleActivity )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:570:1: ( ruleActivity )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:571:1: ruleActivity
                    {
                     before(grammarAccess.getIActivityAccess().getActivityParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleActivity_in_rule__IActivity__Alternatives1138);
                    ruleActivity();

                    state._fsp--;

                     after(grammarAccess.getIActivityAccess().getActivityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:576:6: ( ruleSlave )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:576:6: ( ruleSlave )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:577:1: ruleSlave
                    {
                     before(grammarAccess.getIActivityAccess().getSlaveParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSlave_in_rule__IActivity__Alternatives1155);
                    ruleSlave();

                    state._fsp--;

                     after(grammarAccess.getIActivityAccess().getSlaveParserRuleCall_1()); 

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
    // $ANTLR end "rule__IActivity__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:587:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:591:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:592:1: ( RULE_STRING )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:592:1: ( RULE_STRING )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:593:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1187); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:598:6: ( RULE_ID )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:598:6: ( RULE_ID )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:599:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1204); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:609:1: rule__EFloat__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloat__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:613:1: ( ( 'E' ) | ( 'e' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:614:1: ( 'E' )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:614:1: ( 'E' )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:615:1: 'E'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__EFloat__Alternatives_4_01237); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:622:6: ( 'e' )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:622:6: ( 'e' )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:623:1: 'e'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__EFloat__Alternatives_4_01257); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:635:1: rule__ConnectionPolicyLockPolicy__Alternatives : ( ( ( 'UNSYNC' ) ) | ( ( 'LOCKED' ) ) | ( ( 'LOCK_FREE' ) ) );
    public final void rule__ConnectionPolicyLockPolicy__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:639:1: ( ( ( 'UNSYNC' ) ) | ( ( 'LOCKED' ) ) | ( ( 'LOCK_FREE' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:640:1: ( ( 'UNSYNC' ) )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:640:1: ( ( 'UNSYNC' ) )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:641:1: ( 'UNSYNC' )
                    {
                     before(grammarAccess.getConnectionPolicyLockPolicyAccess().getUNSYNCEnumLiteralDeclaration_0()); 
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:642:1: ( 'UNSYNC' )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:642:3: 'UNSYNC'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__ConnectionPolicyLockPolicy__Alternatives1292); 

                    }

                     after(grammarAccess.getConnectionPolicyLockPolicyAccess().getUNSYNCEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:647:6: ( ( 'LOCKED' ) )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:647:6: ( ( 'LOCKED' ) )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:648:1: ( 'LOCKED' )
                    {
                     before(grammarAccess.getConnectionPolicyLockPolicyAccess().getLOCKEDEnumLiteralDeclaration_1()); 
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:649:1: ( 'LOCKED' )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:649:3: 'LOCKED'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__ConnectionPolicyLockPolicy__Alternatives1313); 

                    }

                     after(grammarAccess.getConnectionPolicyLockPolicyAccess().getLOCKEDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:654:6: ( ( 'LOCK_FREE' ) )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:654:6: ( ( 'LOCK_FREE' ) )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:655:1: ( 'LOCK_FREE' )
                    {
                     before(grammarAccess.getConnectionPolicyLockPolicyAccess().getLOCK_FREEEnumLiteralDeclaration_2()); 
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:656:1: ( 'LOCK_FREE' )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:656:3: 'LOCK_FREE'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__ConnectionPolicyLockPolicy__Alternatives1334); 

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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:666:1: rule__ConnectionPolicyType__Alternatives : ( ( ( 'DATA' ) ) | ( ( 'BUFFER' ) ) );
    public final void rule__ConnectionPolicyType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:670:1: ( ( ( 'DATA' ) ) | ( ( 'BUFFER' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:671:1: ( ( 'DATA' ) )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:671:1: ( ( 'DATA' ) )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:672:1: ( 'DATA' )
                    {
                     before(grammarAccess.getConnectionPolicyTypeAccess().getDATAEnumLiteralDeclaration_0()); 
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:673:1: ( 'DATA' )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:673:3: 'DATA'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__ConnectionPolicyType__Alternatives1370); 

                    }

                     after(grammarAccess.getConnectionPolicyTypeAccess().getDATAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:678:6: ( ( 'BUFFER' ) )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:678:6: ( ( 'BUFFER' ) )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:679:1: ( 'BUFFER' )
                    {
                     before(grammarAccess.getConnectionPolicyTypeAccess().getBUFFEREnumLiteralDeclaration_1()); 
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:680:1: ( 'BUFFER' )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:680:3: 'BUFFER'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__ConnectionPolicyType__Alternatives1391); 

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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:690:1: rule__Scheduler__Alternatives : ( ( ( 'ORO_SCHED_OTHER' ) ) | ( ( 'ORO_SCHED_RT' ) ) );
    public final void rule__Scheduler__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:694:1: ( ( ( 'ORO_SCHED_OTHER' ) ) | ( ( 'ORO_SCHED_RT' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:695:1: ( ( 'ORO_SCHED_OTHER' ) )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:695:1: ( ( 'ORO_SCHED_OTHER' ) )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:696:1: ( 'ORO_SCHED_OTHER' )
                    {
                     before(grammarAccess.getSchedulerAccess().getORO_SCHED_OTHEREnumLiteralDeclaration_0()); 
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:697:1: ( 'ORO_SCHED_OTHER' )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:697:3: 'ORO_SCHED_OTHER'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__Scheduler__Alternatives1427); 

                    }

                     after(grammarAccess.getSchedulerAccess().getORO_SCHED_OTHEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:702:6: ( ( 'ORO_SCHED_RT' ) )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:702:6: ( ( 'ORO_SCHED_RT' ) )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:703:1: ( 'ORO_SCHED_RT' )
                    {
                     before(grammarAccess.getSchedulerAccess().getORO_SCHED_RTEnumLiteralDeclaration_1()); 
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:704:1: ( 'ORO_SCHED_RT' )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:704:3: 'ORO_SCHED_RT'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__Scheduler__Alternatives1448); 

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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:716:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:720:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:721:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__01481);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__1_in_rule__Package__Group__01484);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:728:1: rule__Package__Group__0__Impl : ( () ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:732:1: ( ( () ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:733:1: ( () )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:733:1: ( () )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:734:1: ()
            {
             before(grammarAccess.getPackageAccess().getOrocosPackageAction_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:735:1: ()
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:737:1: 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:747:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:751:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:752:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__11542);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__2_in_rule__Package__Group__11545);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:759:1: rule__Package__Group__1__Impl : ( 'OrocosPackage' ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:763:1: ( ( 'OrocosPackage' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:764:1: ( 'OrocosPackage' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:764:1: ( 'OrocosPackage' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:765:1: 'OrocosPackage'
            {
             before(grammarAccess.getPackageAccess().getOrocosPackageKeyword_1()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Package__Group__1__Impl1573); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:778:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:782:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:783:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__21604);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__3_in_rule__Package__Group__21607);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:790:1: rule__Package__Group__2__Impl : ( ( rule__Package__NameAssignment_2 ) ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:794:1: ( ( ( rule__Package__NameAssignment_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:795:1: ( ( rule__Package__NameAssignment_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:795:1: ( ( rule__Package__NameAssignment_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:796:1: ( rule__Package__NameAssignment_2 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:797:1: ( rule__Package__NameAssignment_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:797:2: rule__Package__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__NameAssignment_2_in_rule__Package__Group__2__Impl1634);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:807:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:811:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:812:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__31664);
            rule__Package__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__4_in_rule__Package__Group__31667);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:819:1: rule__Package__Group__3__Impl : ( '{' ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:823:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:824:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:824:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:825:1: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Package__Group__3__Impl1695); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:838:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:842:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:843:2: rule__Package__Group__4__Impl rule__Package__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__41726);
            rule__Package__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__5_in_rule__Package__Group__41729);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:850:1: rule__Package__Group__4__Impl : ( ( rule__Package__Group_4__0 )? ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:854:1: ( ( ( rule__Package__Group_4__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:855:1: ( ( rule__Package__Group_4__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:855:1: ( ( rule__Package__Group_4__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:856:1: ( rule__Package__Group_4__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_4()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:857:1: ( rule__Package__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:857:2: rule__Package__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__0_in_rule__Package__Group__4__Impl1756);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:867:1: rule__Package__Group__5 : rule__Package__Group__5__Impl rule__Package__Group__6 ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:871:1: ( rule__Package__Group__5__Impl rule__Package__Group__6 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:872:2: rule__Package__Group__5__Impl rule__Package__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__5__Impl_in_rule__Package__Group__51787);
            rule__Package__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__6_in_rule__Package__Group__51790);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:879:1: rule__Package__Group__5__Impl : ( ( rule__Package__Group_5__0 )? ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:883:1: ( ( ( rule__Package__Group_5__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:884:1: ( ( rule__Package__Group_5__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:884:1: ( ( rule__Package__Group_5__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:885:1: ( rule__Package__Group_5__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_5()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:886:1: ( rule__Package__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:886:2: rule__Package__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__0_in_rule__Package__Group__5__Impl1817);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:896:1: rule__Package__Group__6 : rule__Package__Group__6__Impl rule__Package__Group__7 ;
    public final void rule__Package__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:900:1: ( rule__Package__Group__6__Impl rule__Package__Group__7 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:901:2: rule__Package__Group__6__Impl rule__Package__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__6__Impl_in_rule__Package__Group__61848);
            rule__Package__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__7_in_rule__Package__Group__61851);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:908:1: rule__Package__Group__6__Impl : ( ( rule__Package__Group_6__0 )? ) ;
    public final void rule__Package__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:912:1: ( ( ( rule__Package__Group_6__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:913:1: ( ( rule__Package__Group_6__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:913:1: ( ( rule__Package__Group_6__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:914:1: ( rule__Package__Group_6__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_6()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:915:1: ( rule__Package__Group_6__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:915:2: rule__Package__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Package__Group_6__0_in_rule__Package__Group__6__Impl1878);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:925:1: rule__Package__Group__7 : rule__Package__Group__7__Impl ;
    public final void rule__Package__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:929:1: ( rule__Package__Group__7__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:930:2: rule__Package__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__7__Impl_in_rule__Package__Group__71909);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:936:1: rule__Package__Group__7__Impl : ( '}' ) ;
    public final void rule__Package__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:940:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:941:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:941:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:942:1: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_7()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Package__Group__7__Impl1937); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:971:1: rule__Package__Group_4__0 : rule__Package__Group_4__0__Impl rule__Package__Group_4__1 ;
    public final void rule__Package__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:975:1: ( rule__Package__Group_4__0__Impl rule__Package__Group_4__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:976:2: rule__Package__Group_4__0__Impl rule__Package__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__0__Impl_in_rule__Package__Group_4__01984);
            rule__Package__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__1_in_rule__Package__Group_4__01987);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:983:1: rule__Package__Group_4__0__Impl : ( 'taskContexts' ) ;
    public final void rule__Package__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:987:1: ( ( 'taskContexts' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:988:1: ( 'taskContexts' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:988:1: ( 'taskContexts' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:989:1: 'taskContexts'
            {
             before(grammarAccess.getPackageAccess().getTaskContextsKeyword_4_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Package__Group_4__0__Impl2015); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1002:1: rule__Package__Group_4__1 : rule__Package__Group_4__1__Impl rule__Package__Group_4__2 ;
    public final void rule__Package__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1006:1: ( rule__Package__Group_4__1__Impl rule__Package__Group_4__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1007:2: rule__Package__Group_4__1__Impl rule__Package__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__1__Impl_in_rule__Package__Group_4__12046);
            rule__Package__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__2_in_rule__Package__Group_4__12049);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1014:1: rule__Package__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Package__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1018:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1019:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1019:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1020:1: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Package__Group_4__1__Impl2077); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1033:1: rule__Package__Group_4__2 : rule__Package__Group_4__2__Impl rule__Package__Group_4__3 ;
    public final void rule__Package__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1037:1: ( rule__Package__Group_4__2__Impl rule__Package__Group_4__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1038:2: rule__Package__Group_4__2__Impl rule__Package__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__2__Impl_in_rule__Package__Group_4__22108);
            rule__Package__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__3_in_rule__Package__Group_4__22111);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1045:1: rule__Package__Group_4__2__Impl : ( ( rule__Package__TaskContextsAssignment_4_2 ) ) ;
    public final void rule__Package__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1049:1: ( ( ( rule__Package__TaskContextsAssignment_4_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1050:1: ( ( rule__Package__TaskContextsAssignment_4_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1050:1: ( ( rule__Package__TaskContextsAssignment_4_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1051:1: ( rule__Package__TaskContextsAssignment_4_2 )
            {
             before(grammarAccess.getPackageAccess().getTaskContextsAssignment_4_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1052:1: ( rule__Package__TaskContextsAssignment_4_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1052:2: rule__Package__TaskContextsAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__TaskContextsAssignment_4_2_in_rule__Package__Group_4__2__Impl2138);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1062:1: rule__Package__Group_4__3 : rule__Package__Group_4__3__Impl rule__Package__Group_4__4 ;
    public final void rule__Package__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1066:1: ( rule__Package__Group_4__3__Impl rule__Package__Group_4__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1067:2: rule__Package__Group_4__3__Impl rule__Package__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__3__Impl_in_rule__Package__Group_4__32168);
            rule__Package__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__4_in_rule__Package__Group_4__32171);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1074:1: rule__Package__Group_4__3__Impl : ( ( rule__Package__Group_4_3__0 )* ) ;
    public final void rule__Package__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1078:1: ( ( ( rule__Package__Group_4_3__0 )* ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1079:1: ( ( rule__Package__Group_4_3__0 )* )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1079:1: ( ( rule__Package__Group_4_3__0 )* )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1080:1: ( rule__Package__Group_4_3__0 )*
            {
             before(grammarAccess.getPackageAccess().getGroup_4_3()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1081:1: ( rule__Package__Group_4_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1081:2: rule__Package__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4_3__0_in_rule__Package__Group_4__3__Impl2198);
            	    rule__Package__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1091:1: rule__Package__Group_4__4 : rule__Package__Group_4__4__Impl ;
    public final void rule__Package__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1095:1: ( rule__Package__Group_4__4__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1096:2: rule__Package__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__4__Impl_in_rule__Package__Group_4__42229);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1102:1: rule__Package__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Package__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1106:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1107:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1107:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1108:1: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Package__Group_4__4__Impl2257); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1131:1: rule__Package__Group_4_3__0 : rule__Package__Group_4_3__0__Impl rule__Package__Group_4_3__1 ;
    public final void rule__Package__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1135:1: ( rule__Package__Group_4_3__0__Impl rule__Package__Group_4_3__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1136:2: rule__Package__Group_4_3__0__Impl rule__Package__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4_3__0__Impl_in_rule__Package__Group_4_3__02298);
            rule__Package__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4_3__1_in_rule__Package__Group_4_3__02301);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1143:1: rule__Package__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Package__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1147:1: ( ( ',' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1148:1: ( ',' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1148:1: ( ',' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1149:1: ','
            {
             before(grammarAccess.getPackageAccess().getCommaKeyword_4_3_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Package__Group_4_3__0__Impl2329); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1162:1: rule__Package__Group_4_3__1 : rule__Package__Group_4_3__1__Impl ;
    public final void rule__Package__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1166:1: ( rule__Package__Group_4_3__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1167:2: rule__Package__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4_3__1__Impl_in_rule__Package__Group_4_3__12360);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1173:1: rule__Package__Group_4_3__1__Impl : ( ( rule__Package__TaskContextsAssignment_4_3_1 ) ) ;
    public final void rule__Package__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1177:1: ( ( ( rule__Package__TaskContextsAssignment_4_3_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1178:1: ( ( rule__Package__TaskContextsAssignment_4_3_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1178:1: ( ( rule__Package__TaskContextsAssignment_4_3_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1179:1: ( rule__Package__TaskContextsAssignment_4_3_1 )
            {
             before(grammarAccess.getPackageAccess().getTaskContextsAssignment_4_3_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1180:1: ( rule__Package__TaskContextsAssignment_4_3_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1180:2: rule__Package__TaskContextsAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__TaskContextsAssignment_4_3_1_in_rule__Package__Group_4_3__1__Impl2387);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1194:1: rule__Package__Group_5__0 : rule__Package__Group_5__0__Impl rule__Package__Group_5__1 ;
    public final void rule__Package__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1198:1: ( rule__Package__Group_5__0__Impl rule__Package__Group_5__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1199:2: rule__Package__Group_5__0__Impl rule__Package__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__0__Impl_in_rule__Package__Group_5__02421);
            rule__Package__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__1_in_rule__Package__Group_5__02424);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1206:1: rule__Package__Group_5__0__Impl : ( 'connectionPolicies' ) ;
    public final void rule__Package__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1210:1: ( ( 'connectionPolicies' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1211:1: ( 'connectionPolicies' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1211:1: ( 'connectionPolicies' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1212:1: 'connectionPolicies'
            {
             before(grammarAccess.getPackageAccess().getConnectionPoliciesKeyword_5_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Package__Group_5__0__Impl2452); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1225:1: rule__Package__Group_5__1 : rule__Package__Group_5__1__Impl rule__Package__Group_5__2 ;
    public final void rule__Package__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1229:1: ( rule__Package__Group_5__1__Impl rule__Package__Group_5__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1230:2: rule__Package__Group_5__1__Impl rule__Package__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__1__Impl_in_rule__Package__Group_5__12483);
            rule__Package__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__2_in_rule__Package__Group_5__12486);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1237:1: rule__Package__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Package__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1241:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1242:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1242:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1243:1: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Package__Group_5__1__Impl2514); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1256:1: rule__Package__Group_5__2 : rule__Package__Group_5__2__Impl rule__Package__Group_5__3 ;
    public final void rule__Package__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1260:1: ( rule__Package__Group_5__2__Impl rule__Package__Group_5__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1261:2: rule__Package__Group_5__2__Impl rule__Package__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__2__Impl_in_rule__Package__Group_5__22545);
            rule__Package__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__3_in_rule__Package__Group_5__22548);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1268:1: rule__Package__Group_5__2__Impl : ( ( rule__Package__ConnectionPoliciesAssignment_5_2 ) ) ;
    public final void rule__Package__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1272:1: ( ( ( rule__Package__ConnectionPoliciesAssignment_5_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1273:1: ( ( rule__Package__ConnectionPoliciesAssignment_5_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1273:1: ( ( rule__Package__ConnectionPoliciesAssignment_5_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1274:1: ( rule__Package__ConnectionPoliciesAssignment_5_2 )
            {
             before(grammarAccess.getPackageAccess().getConnectionPoliciesAssignment_5_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1275:1: ( rule__Package__ConnectionPoliciesAssignment_5_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1275:2: rule__Package__ConnectionPoliciesAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__ConnectionPoliciesAssignment_5_2_in_rule__Package__Group_5__2__Impl2575);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1285:1: rule__Package__Group_5__3 : rule__Package__Group_5__3__Impl rule__Package__Group_5__4 ;
    public final void rule__Package__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1289:1: ( rule__Package__Group_5__3__Impl rule__Package__Group_5__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1290:2: rule__Package__Group_5__3__Impl rule__Package__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__3__Impl_in_rule__Package__Group_5__32605);
            rule__Package__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__4_in_rule__Package__Group_5__32608);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1297:1: rule__Package__Group_5__3__Impl : ( ( rule__Package__Group_5_3__0 )* ) ;
    public final void rule__Package__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1301:1: ( ( ( rule__Package__Group_5_3__0 )* ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1302:1: ( ( rule__Package__Group_5_3__0 )* )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1302:1: ( ( rule__Package__Group_5_3__0 )* )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1303:1: ( rule__Package__Group_5_3__0 )*
            {
             before(grammarAccess.getPackageAccess().getGroup_5_3()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1304:1: ( rule__Package__Group_5_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1304:2: rule__Package__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5_3__0_in_rule__Package__Group_5__3__Impl2635);
            	    rule__Package__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1314:1: rule__Package__Group_5__4 : rule__Package__Group_5__4__Impl ;
    public final void rule__Package__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1318:1: ( rule__Package__Group_5__4__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1319:2: rule__Package__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__4__Impl_in_rule__Package__Group_5__42666);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1325:1: rule__Package__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Package__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1329:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1330:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1330:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1331:1: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Package__Group_5__4__Impl2694); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1354:1: rule__Package__Group_5_3__0 : rule__Package__Group_5_3__0__Impl rule__Package__Group_5_3__1 ;
    public final void rule__Package__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1358:1: ( rule__Package__Group_5_3__0__Impl rule__Package__Group_5_3__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1359:2: rule__Package__Group_5_3__0__Impl rule__Package__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5_3__0__Impl_in_rule__Package__Group_5_3__02735);
            rule__Package__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5_3__1_in_rule__Package__Group_5_3__02738);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1366:1: rule__Package__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Package__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1370:1: ( ( ',' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1371:1: ( ',' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1371:1: ( ',' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1372:1: ','
            {
             before(grammarAccess.getPackageAccess().getCommaKeyword_5_3_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Package__Group_5_3__0__Impl2766); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1385:1: rule__Package__Group_5_3__1 : rule__Package__Group_5_3__1__Impl ;
    public final void rule__Package__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1389:1: ( rule__Package__Group_5_3__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1390:2: rule__Package__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5_3__1__Impl_in_rule__Package__Group_5_3__12797);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1396:1: rule__Package__Group_5_3__1__Impl : ( ( rule__Package__ConnectionPoliciesAssignment_5_3_1 ) ) ;
    public final void rule__Package__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1400:1: ( ( ( rule__Package__ConnectionPoliciesAssignment_5_3_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1401:1: ( ( rule__Package__ConnectionPoliciesAssignment_5_3_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1401:1: ( ( rule__Package__ConnectionPoliciesAssignment_5_3_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1402:1: ( rule__Package__ConnectionPoliciesAssignment_5_3_1 )
            {
             before(grammarAccess.getPackageAccess().getConnectionPoliciesAssignment_5_3_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1403:1: ( rule__Package__ConnectionPoliciesAssignment_5_3_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1403:2: rule__Package__ConnectionPoliciesAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__ConnectionPoliciesAssignment_5_3_1_in_rule__Package__Group_5_3__1__Impl2824);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1417:1: rule__Package__Group_6__0 : rule__Package__Group_6__0__Impl rule__Package__Group_6__1 ;
    public final void rule__Package__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1421:1: ( rule__Package__Group_6__0__Impl rule__Package__Group_6__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1422:2: rule__Package__Group_6__0__Impl rule__Package__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_6__0__Impl_in_rule__Package__Group_6__02858);
            rule__Package__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_6__1_in_rule__Package__Group_6__02861);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1429:1: rule__Package__Group_6__0__Impl : ( 'activities' ) ;
    public final void rule__Package__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1433:1: ( ( 'activities' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1434:1: ( 'activities' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1434:1: ( 'activities' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1435:1: 'activities'
            {
             before(grammarAccess.getPackageAccess().getActivitiesKeyword_6_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Package__Group_6__0__Impl2889); 
             after(grammarAccess.getPackageAccess().getActivitiesKeyword_6_0()); 

            }


            }

        }
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1448:1: rule__Package__Group_6__1 : rule__Package__Group_6__1__Impl ;
    public final void rule__Package__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1452:1: ( rule__Package__Group_6__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1453:2: rule__Package__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_6__1__Impl_in_rule__Package__Group_6__12920);
            rule__Package__Group_6__1__Impl();

            state._fsp--;


            }

        }
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1459:1: rule__Package__Group_6__1__Impl : ( ( rule__Package__ActivitiesAssignment_6_1 ) ) ;
    public final void rule__Package__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1463:1: ( ( ( rule__Package__ActivitiesAssignment_6_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1464:1: ( ( rule__Package__ActivitiesAssignment_6_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1464:1: ( ( rule__Package__ActivitiesAssignment_6_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1465:1: ( rule__Package__ActivitiesAssignment_6_1 )
            {
             before(grammarAccess.getPackageAccess().getActivitiesAssignment_6_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1466:1: ( rule__Package__ActivitiesAssignment_6_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1466:2: rule__Package__ActivitiesAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__ActivitiesAssignment_6_1_in_rule__Package__Group_6__1__Impl2947);
            rule__Package__ActivitiesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getActivitiesAssignment_6_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__TaskContext__Group__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1480:1: rule__TaskContext__Group__0 : rule__TaskContext__Group__0__Impl rule__TaskContext__Group__1 ;
    public final void rule__TaskContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1484:1: ( rule__TaskContext__Group__0__Impl rule__TaskContext__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1485:2: rule__TaskContext__Group__0__Impl rule__TaskContext__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__0__Impl_in_rule__TaskContext__Group__02981);
            rule__TaskContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__1_in_rule__TaskContext__Group__02984);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1492:1: rule__TaskContext__Group__0__Impl : ( 'TaskContext' ) ;
    public final void rule__TaskContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1496:1: ( ( 'TaskContext' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1497:1: ( 'TaskContext' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1497:1: ( 'TaskContext' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1498:1: 'TaskContext'
            {
             before(grammarAccess.getTaskContextAccess().getTaskContextKeyword_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__TaskContext__Group__0__Impl3012); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1511:1: rule__TaskContext__Group__1 : rule__TaskContext__Group__1__Impl rule__TaskContext__Group__2 ;
    public final void rule__TaskContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1515:1: ( rule__TaskContext__Group__1__Impl rule__TaskContext__Group__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1516:2: rule__TaskContext__Group__1__Impl rule__TaskContext__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__1__Impl_in_rule__TaskContext__Group__13043);
            rule__TaskContext__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__2_in_rule__TaskContext__Group__13046);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1523:1: rule__TaskContext__Group__1__Impl : ( ( rule__TaskContext__NameAssignment_1 ) ) ;
    public final void rule__TaskContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1527:1: ( ( ( rule__TaskContext__NameAssignment_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1528:1: ( ( rule__TaskContext__NameAssignment_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1528:1: ( ( rule__TaskContext__NameAssignment_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1529:1: ( rule__TaskContext__NameAssignment_1 )
            {
             before(grammarAccess.getTaskContextAccess().getNameAssignment_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1530:1: ( rule__TaskContext__NameAssignment_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1530:2: rule__TaskContext__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__NameAssignment_1_in_rule__TaskContext__Group__1__Impl3073);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1540:1: rule__TaskContext__Group__2 : rule__TaskContext__Group__2__Impl rule__TaskContext__Group__3 ;
    public final void rule__TaskContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1544:1: ( rule__TaskContext__Group__2__Impl rule__TaskContext__Group__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1545:2: rule__TaskContext__Group__2__Impl rule__TaskContext__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__2__Impl_in_rule__TaskContext__Group__23103);
            rule__TaskContext__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__3_in_rule__TaskContext__Group__23106);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1552:1: rule__TaskContext__Group__2__Impl : ( '{' ) ;
    public final void rule__TaskContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1556:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1557:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1557:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1558:1: '{'
            {
             before(grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__TaskContext__Group__2__Impl3134); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1571:1: rule__TaskContext__Group__3 : rule__TaskContext__Group__3__Impl rule__TaskContext__Group__4 ;
    public final void rule__TaskContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1575:1: ( rule__TaskContext__Group__3__Impl rule__TaskContext__Group__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1576:2: rule__TaskContext__Group__3__Impl rule__TaskContext__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__3__Impl_in_rule__TaskContext__Group__33165);
            rule__TaskContext__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__4_in_rule__TaskContext__Group__33168);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1583:1: rule__TaskContext__Group__3__Impl : ( 'namespace' ) ;
    public final void rule__TaskContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1587:1: ( ( 'namespace' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1588:1: ( 'namespace' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1588:1: ( 'namespace' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1589:1: 'namespace'
            {
             before(grammarAccess.getTaskContextAccess().getNamespaceKeyword_3()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__TaskContext__Group__3__Impl3196); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1602:1: rule__TaskContext__Group__4 : rule__TaskContext__Group__4__Impl rule__TaskContext__Group__5 ;
    public final void rule__TaskContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1606:1: ( rule__TaskContext__Group__4__Impl rule__TaskContext__Group__5 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1607:2: rule__TaskContext__Group__4__Impl rule__TaskContext__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__4__Impl_in_rule__TaskContext__Group__43227);
            rule__TaskContext__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__5_in_rule__TaskContext__Group__43230);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1614:1: rule__TaskContext__Group__4__Impl : ( ( rule__TaskContext__NamespaceAssignment_4 ) ) ;
    public final void rule__TaskContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1618:1: ( ( ( rule__TaskContext__NamespaceAssignment_4 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1619:1: ( ( rule__TaskContext__NamespaceAssignment_4 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1619:1: ( ( rule__TaskContext__NamespaceAssignment_4 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1620:1: ( rule__TaskContext__NamespaceAssignment_4 )
            {
             before(grammarAccess.getTaskContextAccess().getNamespaceAssignment_4()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1621:1: ( rule__TaskContext__NamespaceAssignment_4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1621:2: rule__TaskContext__NamespaceAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__NamespaceAssignment_4_in_rule__TaskContext__Group__4__Impl3257);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1631:1: rule__TaskContext__Group__5 : rule__TaskContext__Group__5__Impl rule__TaskContext__Group__6 ;
    public final void rule__TaskContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1635:1: ( rule__TaskContext__Group__5__Impl rule__TaskContext__Group__6 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1636:2: rule__TaskContext__Group__5__Impl rule__TaskContext__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__5__Impl_in_rule__TaskContext__Group__53287);
            rule__TaskContext__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__6_in_rule__TaskContext__Group__53290);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1643:1: rule__TaskContext__Group__5__Impl : ( 'type' ) ;
    public final void rule__TaskContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1647:1: ( ( 'type' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1648:1: ( 'type' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1648:1: ( 'type' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1649:1: 'type'
            {
             before(grammarAccess.getTaskContextAccess().getTypeKeyword_5()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__TaskContext__Group__5__Impl3318); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1662:1: rule__TaskContext__Group__6 : rule__TaskContext__Group__6__Impl rule__TaskContext__Group__7 ;
    public final void rule__TaskContext__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1666:1: ( rule__TaskContext__Group__6__Impl rule__TaskContext__Group__7 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1667:2: rule__TaskContext__Group__6__Impl rule__TaskContext__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__6__Impl_in_rule__TaskContext__Group__63349);
            rule__TaskContext__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__7_in_rule__TaskContext__Group__63352);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1674:1: rule__TaskContext__Group__6__Impl : ( ( rule__TaskContext__TypeAssignment_6 ) ) ;
    public final void rule__TaskContext__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1678:1: ( ( ( rule__TaskContext__TypeAssignment_6 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1679:1: ( ( rule__TaskContext__TypeAssignment_6 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1679:1: ( ( rule__TaskContext__TypeAssignment_6 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1680:1: ( rule__TaskContext__TypeAssignment_6 )
            {
             before(grammarAccess.getTaskContextAccess().getTypeAssignment_6()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1681:1: ( rule__TaskContext__TypeAssignment_6 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1681:2: rule__TaskContext__TypeAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__TypeAssignment_6_in_rule__TaskContext__Group__6__Impl3379);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1691:1: rule__TaskContext__Group__7 : rule__TaskContext__Group__7__Impl rule__TaskContext__Group__8 ;
    public final void rule__TaskContext__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1695:1: ( rule__TaskContext__Group__7__Impl rule__TaskContext__Group__8 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1696:2: rule__TaskContext__Group__7__Impl rule__TaskContext__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__7__Impl_in_rule__TaskContext__Group__73409);
            rule__TaskContext__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__8_in_rule__TaskContext__Group__73412);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1703:1: rule__TaskContext__Group__7__Impl : ( ( rule__TaskContext__Group_7__0 )? ) ;
    public final void rule__TaskContext__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1707:1: ( ( ( rule__TaskContext__Group_7__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1708:1: ( ( rule__TaskContext__Group_7__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1708:1: ( ( rule__TaskContext__Group_7__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1709:1: ( rule__TaskContext__Group_7__0 )?
            {
             before(grammarAccess.getTaskContextAccess().getGroup_7()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1710:1: ( rule__TaskContext__Group_7__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1710:2: rule__TaskContext__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7__0_in_rule__TaskContext__Group__7__Impl3439);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1720:1: rule__TaskContext__Group__8 : rule__TaskContext__Group__8__Impl rule__TaskContext__Group__9 ;
    public final void rule__TaskContext__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1724:1: ( rule__TaskContext__Group__8__Impl rule__TaskContext__Group__9 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1725:2: rule__TaskContext__Group__8__Impl rule__TaskContext__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__8__Impl_in_rule__TaskContext__Group__83470);
            rule__TaskContext__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__9_in_rule__TaskContext__Group__83473);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1732:1: rule__TaskContext__Group__8__Impl : ( ( rule__TaskContext__Group_8__0 )? ) ;
    public final void rule__TaskContext__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1736:1: ( ( ( rule__TaskContext__Group_8__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1737:1: ( ( rule__TaskContext__Group_8__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1737:1: ( ( rule__TaskContext__Group_8__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1738:1: ( rule__TaskContext__Group_8__0 )?
            {
             before(grammarAccess.getTaskContextAccess().getGroup_8()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1739:1: ( rule__TaskContext__Group_8__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1739:2: rule__TaskContext__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8__0_in_rule__TaskContext__Group__8__Impl3500);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1749:1: rule__TaskContext__Group__9 : rule__TaskContext__Group__9__Impl rule__TaskContext__Group__10 ;
    public final void rule__TaskContext__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1753:1: ( rule__TaskContext__Group__9__Impl rule__TaskContext__Group__10 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1754:2: rule__TaskContext__Group__9__Impl rule__TaskContext__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__9__Impl_in_rule__TaskContext__Group__93531);
            rule__TaskContext__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__10_in_rule__TaskContext__Group__93534);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1761:1: rule__TaskContext__Group__9__Impl : ( ( rule__TaskContext__Group_9__0 )? ) ;
    public final void rule__TaskContext__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1765:1: ( ( ( rule__TaskContext__Group_9__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1766:1: ( ( rule__TaskContext__Group_9__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1766:1: ( ( rule__TaskContext__Group_9__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1767:1: ( rule__TaskContext__Group_9__0 )?
            {
             before(grammarAccess.getTaskContextAccess().getGroup_9()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1768:1: ( rule__TaskContext__Group_9__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1768:2: rule__TaskContext__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9__0_in_rule__TaskContext__Group__9__Impl3561);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1778:1: rule__TaskContext__Group__10 : rule__TaskContext__Group__10__Impl rule__TaskContext__Group__11 ;
    public final void rule__TaskContext__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1782:1: ( rule__TaskContext__Group__10__Impl rule__TaskContext__Group__11 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1783:2: rule__TaskContext__Group__10__Impl rule__TaskContext__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__10__Impl_in_rule__TaskContext__Group__103592);
            rule__TaskContext__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__11_in_rule__TaskContext__Group__103595);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1790:1: rule__TaskContext__Group__10__Impl : ( ( rule__TaskContext__Group_10__0 )? ) ;
    public final void rule__TaskContext__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1794:1: ( ( ( rule__TaskContext__Group_10__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1795:1: ( ( rule__TaskContext__Group_10__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1795:1: ( ( rule__TaskContext__Group_10__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1796:1: ( rule__TaskContext__Group_10__0 )?
            {
             before(grammarAccess.getTaskContextAccess().getGroup_10()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1797:1: ( rule__TaskContext__Group_10__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1797:2: rule__TaskContext__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10__0_in_rule__TaskContext__Group__10__Impl3622);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1807:1: rule__TaskContext__Group__11 : rule__TaskContext__Group__11__Impl ;
    public final void rule__TaskContext__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1811:1: ( rule__TaskContext__Group__11__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1812:2: rule__TaskContext__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__11__Impl_in_rule__TaskContext__Group__113653);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1818:1: rule__TaskContext__Group__11__Impl : ( '}' ) ;
    public final void rule__TaskContext__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1822:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1823:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1823:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1824:1: '}'
            {
             before(grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_11()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__TaskContext__Group__11__Impl3681); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1861:1: rule__TaskContext__Group_7__0 : rule__TaskContext__Group_7__0__Impl rule__TaskContext__Group_7__1 ;
    public final void rule__TaskContext__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1865:1: ( rule__TaskContext__Group_7__0__Impl rule__TaskContext__Group_7__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1866:2: rule__TaskContext__Group_7__0__Impl rule__TaskContext__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7__0__Impl_in_rule__TaskContext__Group_7__03736);
            rule__TaskContext__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7__1_in_rule__TaskContext__Group_7__03739);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1873:1: rule__TaskContext__Group_7__0__Impl : ( 'inputPorts' ) ;
    public final void rule__TaskContext__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1877:1: ( ( 'inputPorts' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1878:1: ( 'inputPorts' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1878:1: ( 'inputPorts' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1879:1: 'inputPorts'
            {
             before(grammarAccess.getTaskContextAccess().getInputPortsKeyword_7_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__TaskContext__Group_7__0__Impl3767); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1892:1: rule__TaskContext__Group_7__1 : rule__TaskContext__Group_7__1__Impl rule__TaskContext__Group_7__2 ;
    public final void rule__TaskContext__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1896:1: ( rule__TaskContext__Group_7__1__Impl rule__TaskContext__Group_7__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1897:2: rule__TaskContext__Group_7__1__Impl rule__TaskContext__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7__1__Impl_in_rule__TaskContext__Group_7__13798);
            rule__TaskContext__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7__2_in_rule__TaskContext__Group_7__13801);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1904:1: rule__TaskContext__Group_7__1__Impl : ( '{' ) ;
    public final void rule__TaskContext__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1908:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1909:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1909:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1910:1: '{'
            {
             before(grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__TaskContext__Group_7__1__Impl3829); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1923:1: rule__TaskContext__Group_7__2 : rule__TaskContext__Group_7__2__Impl rule__TaskContext__Group_7__3 ;
    public final void rule__TaskContext__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1927:1: ( rule__TaskContext__Group_7__2__Impl rule__TaskContext__Group_7__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1928:2: rule__TaskContext__Group_7__2__Impl rule__TaskContext__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7__2__Impl_in_rule__TaskContext__Group_7__23860);
            rule__TaskContext__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7__3_in_rule__TaskContext__Group_7__23863);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1935:1: rule__TaskContext__Group_7__2__Impl : ( ( rule__TaskContext__InputPortsAssignment_7_2 ) ) ;
    public final void rule__TaskContext__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1939:1: ( ( ( rule__TaskContext__InputPortsAssignment_7_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1940:1: ( ( rule__TaskContext__InputPortsAssignment_7_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1940:1: ( ( rule__TaskContext__InputPortsAssignment_7_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1941:1: ( rule__TaskContext__InputPortsAssignment_7_2 )
            {
             before(grammarAccess.getTaskContextAccess().getInputPortsAssignment_7_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1942:1: ( rule__TaskContext__InputPortsAssignment_7_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1942:2: rule__TaskContext__InputPortsAssignment_7_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__InputPortsAssignment_7_2_in_rule__TaskContext__Group_7__2__Impl3890);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1952:1: rule__TaskContext__Group_7__3 : rule__TaskContext__Group_7__3__Impl rule__TaskContext__Group_7__4 ;
    public final void rule__TaskContext__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1956:1: ( rule__TaskContext__Group_7__3__Impl rule__TaskContext__Group_7__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1957:2: rule__TaskContext__Group_7__3__Impl rule__TaskContext__Group_7__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7__3__Impl_in_rule__TaskContext__Group_7__33920);
            rule__TaskContext__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7__4_in_rule__TaskContext__Group_7__33923);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1964:1: rule__TaskContext__Group_7__3__Impl : ( ( rule__TaskContext__Group_7_3__0 )* ) ;
    public final void rule__TaskContext__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1968:1: ( ( ( rule__TaskContext__Group_7_3__0 )* ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1969:1: ( ( rule__TaskContext__Group_7_3__0 )* )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1969:1: ( ( rule__TaskContext__Group_7_3__0 )* )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1970:1: ( rule__TaskContext__Group_7_3__0 )*
            {
             before(grammarAccess.getTaskContextAccess().getGroup_7_3()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1971:1: ( rule__TaskContext__Group_7_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1971:2: rule__TaskContext__Group_7_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7_3__0_in_rule__TaskContext__Group_7__3__Impl3950);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1981:1: rule__TaskContext__Group_7__4 : rule__TaskContext__Group_7__4__Impl ;
    public final void rule__TaskContext__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1985:1: ( rule__TaskContext__Group_7__4__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1986:2: rule__TaskContext__Group_7__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7__4__Impl_in_rule__TaskContext__Group_7__43981);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1992:1: rule__TaskContext__Group_7__4__Impl : ( '}' ) ;
    public final void rule__TaskContext__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1996:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1997:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1997:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1998:1: '}'
            {
             before(grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__TaskContext__Group_7__4__Impl4009); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2021:1: rule__TaskContext__Group_7_3__0 : rule__TaskContext__Group_7_3__0__Impl rule__TaskContext__Group_7_3__1 ;
    public final void rule__TaskContext__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2025:1: ( rule__TaskContext__Group_7_3__0__Impl rule__TaskContext__Group_7_3__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2026:2: rule__TaskContext__Group_7_3__0__Impl rule__TaskContext__Group_7_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7_3__0__Impl_in_rule__TaskContext__Group_7_3__04050);
            rule__TaskContext__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7_3__1_in_rule__TaskContext__Group_7_3__04053);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2033:1: rule__TaskContext__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__TaskContext__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2037:1: ( ( ',' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2038:1: ( ',' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2038:1: ( ',' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2039:1: ','
            {
             before(grammarAccess.getTaskContextAccess().getCommaKeyword_7_3_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__TaskContext__Group_7_3__0__Impl4081); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2052:1: rule__TaskContext__Group_7_3__1 : rule__TaskContext__Group_7_3__1__Impl ;
    public final void rule__TaskContext__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2056:1: ( rule__TaskContext__Group_7_3__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2057:2: rule__TaskContext__Group_7_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7_3__1__Impl_in_rule__TaskContext__Group_7_3__14112);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2063:1: rule__TaskContext__Group_7_3__1__Impl : ( ( rule__TaskContext__InputPortsAssignment_7_3_1 ) ) ;
    public final void rule__TaskContext__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2067:1: ( ( ( rule__TaskContext__InputPortsAssignment_7_3_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2068:1: ( ( rule__TaskContext__InputPortsAssignment_7_3_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2068:1: ( ( rule__TaskContext__InputPortsAssignment_7_3_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2069:1: ( rule__TaskContext__InputPortsAssignment_7_3_1 )
            {
             before(grammarAccess.getTaskContextAccess().getInputPortsAssignment_7_3_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2070:1: ( rule__TaskContext__InputPortsAssignment_7_3_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2070:2: rule__TaskContext__InputPortsAssignment_7_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__InputPortsAssignment_7_3_1_in_rule__TaskContext__Group_7_3__1__Impl4139);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2084:1: rule__TaskContext__Group_8__0 : rule__TaskContext__Group_8__0__Impl rule__TaskContext__Group_8__1 ;
    public final void rule__TaskContext__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2088:1: ( rule__TaskContext__Group_8__0__Impl rule__TaskContext__Group_8__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2089:2: rule__TaskContext__Group_8__0__Impl rule__TaskContext__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8__0__Impl_in_rule__TaskContext__Group_8__04173);
            rule__TaskContext__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8__1_in_rule__TaskContext__Group_8__04176);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2096:1: rule__TaskContext__Group_8__0__Impl : ( 'outputPorts' ) ;
    public final void rule__TaskContext__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2100:1: ( ( 'outputPorts' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2101:1: ( 'outputPorts' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2101:1: ( 'outputPorts' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2102:1: 'outputPorts'
            {
             before(grammarAccess.getTaskContextAccess().getOutputPortsKeyword_8_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__TaskContext__Group_8__0__Impl4204); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2115:1: rule__TaskContext__Group_8__1 : rule__TaskContext__Group_8__1__Impl rule__TaskContext__Group_8__2 ;
    public final void rule__TaskContext__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2119:1: ( rule__TaskContext__Group_8__1__Impl rule__TaskContext__Group_8__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2120:2: rule__TaskContext__Group_8__1__Impl rule__TaskContext__Group_8__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8__1__Impl_in_rule__TaskContext__Group_8__14235);
            rule__TaskContext__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8__2_in_rule__TaskContext__Group_8__14238);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2127:1: rule__TaskContext__Group_8__1__Impl : ( '{' ) ;
    public final void rule__TaskContext__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2131:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2132:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2132:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2133:1: '{'
            {
             before(grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__TaskContext__Group_8__1__Impl4266); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2146:1: rule__TaskContext__Group_8__2 : rule__TaskContext__Group_8__2__Impl rule__TaskContext__Group_8__3 ;
    public final void rule__TaskContext__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2150:1: ( rule__TaskContext__Group_8__2__Impl rule__TaskContext__Group_8__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2151:2: rule__TaskContext__Group_8__2__Impl rule__TaskContext__Group_8__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8__2__Impl_in_rule__TaskContext__Group_8__24297);
            rule__TaskContext__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8__3_in_rule__TaskContext__Group_8__24300);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2158:1: rule__TaskContext__Group_8__2__Impl : ( ( rule__TaskContext__OutputPortsAssignment_8_2 ) ) ;
    public final void rule__TaskContext__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2162:1: ( ( ( rule__TaskContext__OutputPortsAssignment_8_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2163:1: ( ( rule__TaskContext__OutputPortsAssignment_8_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2163:1: ( ( rule__TaskContext__OutputPortsAssignment_8_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2164:1: ( rule__TaskContext__OutputPortsAssignment_8_2 )
            {
             before(grammarAccess.getTaskContextAccess().getOutputPortsAssignment_8_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2165:1: ( rule__TaskContext__OutputPortsAssignment_8_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2165:2: rule__TaskContext__OutputPortsAssignment_8_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__OutputPortsAssignment_8_2_in_rule__TaskContext__Group_8__2__Impl4327);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2175:1: rule__TaskContext__Group_8__3 : rule__TaskContext__Group_8__3__Impl rule__TaskContext__Group_8__4 ;
    public final void rule__TaskContext__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2179:1: ( rule__TaskContext__Group_8__3__Impl rule__TaskContext__Group_8__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2180:2: rule__TaskContext__Group_8__3__Impl rule__TaskContext__Group_8__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8__3__Impl_in_rule__TaskContext__Group_8__34357);
            rule__TaskContext__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8__4_in_rule__TaskContext__Group_8__34360);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2187:1: rule__TaskContext__Group_8__3__Impl : ( ( rule__TaskContext__Group_8_3__0 )* ) ;
    public final void rule__TaskContext__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2191:1: ( ( ( rule__TaskContext__Group_8_3__0 )* ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2192:1: ( ( rule__TaskContext__Group_8_3__0 )* )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2192:1: ( ( rule__TaskContext__Group_8_3__0 )* )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2193:1: ( rule__TaskContext__Group_8_3__0 )*
            {
             before(grammarAccess.getTaskContextAccess().getGroup_8_3()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2194:1: ( rule__TaskContext__Group_8_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==24) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2194:2: rule__TaskContext__Group_8_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8_3__0_in_rule__TaskContext__Group_8__3__Impl4387);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2204:1: rule__TaskContext__Group_8__4 : rule__TaskContext__Group_8__4__Impl ;
    public final void rule__TaskContext__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2208:1: ( rule__TaskContext__Group_8__4__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2209:2: rule__TaskContext__Group_8__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8__4__Impl_in_rule__TaskContext__Group_8__44418);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2215:1: rule__TaskContext__Group_8__4__Impl : ( '}' ) ;
    public final void rule__TaskContext__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2219:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2220:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2220:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2221:1: '}'
            {
             before(grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__TaskContext__Group_8__4__Impl4446); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2244:1: rule__TaskContext__Group_8_3__0 : rule__TaskContext__Group_8_3__0__Impl rule__TaskContext__Group_8_3__1 ;
    public final void rule__TaskContext__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2248:1: ( rule__TaskContext__Group_8_3__0__Impl rule__TaskContext__Group_8_3__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2249:2: rule__TaskContext__Group_8_3__0__Impl rule__TaskContext__Group_8_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8_3__0__Impl_in_rule__TaskContext__Group_8_3__04487);
            rule__TaskContext__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8_3__1_in_rule__TaskContext__Group_8_3__04490);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2256:1: rule__TaskContext__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__TaskContext__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2260:1: ( ( ',' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2261:1: ( ',' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2261:1: ( ',' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2262:1: ','
            {
             before(grammarAccess.getTaskContextAccess().getCommaKeyword_8_3_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__TaskContext__Group_8_3__0__Impl4518); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2275:1: rule__TaskContext__Group_8_3__1 : rule__TaskContext__Group_8_3__1__Impl ;
    public final void rule__TaskContext__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2279:1: ( rule__TaskContext__Group_8_3__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2280:2: rule__TaskContext__Group_8_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8_3__1__Impl_in_rule__TaskContext__Group_8_3__14549);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2286:1: rule__TaskContext__Group_8_3__1__Impl : ( ( rule__TaskContext__OutputPortsAssignment_8_3_1 ) ) ;
    public final void rule__TaskContext__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2290:1: ( ( ( rule__TaskContext__OutputPortsAssignment_8_3_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2291:1: ( ( rule__TaskContext__OutputPortsAssignment_8_3_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2291:1: ( ( rule__TaskContext__OutputPortsAssignment_8_3_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2292:1: ( rule__TaskContext__OutputPortsAssignment_8_3_1 )
            {
             before(grammarAccess.getTaskContextAccess().getOutputPortsAssignment_8_3_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2293:1: ( rule__TaskContext__OutputPortsAssignment_8_3_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2293:2: rule__TaskContext__OutputPortsAssignment_8_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__OutputPortsAssignment_8_3_1_in_rule__TaskContext__Group_8_3__1__Impl4576);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2307:1: rule__TaskContext__Group_9__0 : rule__TaskContext__Group_9__0__Impl rule__TaskContext__Group_9__1 ;
    public final void rule__TaskContext__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2311:1: ( rule__TaskContext__Group_9__0__Impl rule__TaskContext__Group_9__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2312:2: rule__TaskContext__Group_9__0__Impl rule__TaskContext__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9__0__Impl_in_rule__TaskContext__Group_9__04610);
            rule__TaskContext__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9__1_in_rule__TaskContext__Group_9__04613);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2319:1: rule__TaskContext__Group_9__0__Impl : ( 'properties' ) ;
    public final void rule__TaskContext__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2323:1: ( ( 'properties' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2324:1: ( 'properties' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2324:1: ( 'properties' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2325:1: 'properties'
            {
             before(grammarAccess.getTaskContextAccess().getPropertiesKeyword_9_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__TaskContext__Group_9__0__Impl4641); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2338:1: rule__TaskContext__Group_9__1 : rule__TaskContext__Group_9__1__Impl rule__TaskContext__Group_9__2 ;
    public final void rule__TaskContext__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2342:1: ( rule__TaskContext__Group_9__1__Impl rule__TaskContext__Group_9__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2343:2: rule__TaskContext__Group_9__1__Impl rule__TaskContext__Group_9__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9__1__Impl_in_rule__TaskContext__Group_9__14672);
            rule__TaskContext__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9__2_in_rule__TaskContext__Group_9__14675);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2350:1: rule__TaskContext__Group_9__1__Impl : ( '{' ) ;
    public final void rule__TaskContext__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2354:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2355:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2355:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2356:1: '{'
            {
             before(grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__TaskContext__Group_9__1__Impl4703); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2369:1: rule__TaskContext__Group_9__2 : rule__TaskContext__Group_9__2__Impl rule__TaskContext__Group_9__3 ;
    public final void rule__TaskContext__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2373:1: ( rule__TaskContext__Group_9__2__Impl rule__TaskContext__Group_9__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2374:2: rule__TaskContext__Group_9__2__Impl rule__TaskContext__Group_9__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9__2__Impl_in_rule__TaskContext__Group_9__24734);
            rule__TaskContext__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9__3_in_rule__TaskContext__Group_9__24737);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2381:1: rule__TaskContext__Group_9__2__Impl : ( ( rule__TaskContext__PropertiesAssignment_9_2 ) ) ;
    public final void rule__TaskContext__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2385:1: ( ( ( rule__TaskContext__PropertiesAssignment_9_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2386:1: ( ( rule__TaskContext__PropertiesAssignment_9_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2386:1: ( ( rule__TaskContext__PropertiesAssignment_9_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2387:1: ( rule__TaskContext__PropertiesAssignment_9_2 )
            {
             before(grammarAccess.getTaskContextAccess().getPropertiesAssignment_9_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2388:1: ( rule__TaskContext__PropertiesAssignment_9_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2388:2: rule__TaskContext__PropertiesAssignment_9_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__PropertiesAssignment_9_2_in_rule__TaskContext__Group_9__2__Impl4764);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2398:1: rule__TaskContext__Group_9__3 : rule__TaskContext__Group_9__3__Impl rule__TaskContext__Group_9__4 ;
    public final void rule__TaskContext__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2402:1: ( rule__TaskContext__Group_9__3__Impl rule__TaskContext__Group_9__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2403:2: rule__TaskContext__Group_9__3__Impl rule__TaskContext__Group_9__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9__3__Impl_in_rule__TaskContext__Group_9__34794);
            rule__TaskContext__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9__4_in_rule__TaskContext__Group_9__34797);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2410:1: rule__TaskContext__Group_9__3__Impl : ( ( rule__TaskContext__Group_9_3__0 )* ) ;
    public final void rule__TaskContext__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2414:1: ( ( ( rule__TaskContext__Group_9_3__0 )* ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2415:1: ( ( rule__TaskContext__Group_9_3__0 )* )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2415:1: ( ( rule__TaskContext__Group_9_3__0 )* )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2416:1: ( rule__TaskContext__Group_9_3__0 )*
            {
             before(grammarAccess.getTaskContextAccess().getGroup_9_3()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2417:1: ( rule__TaskContext__Group_9_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==24) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2417:2: rule__TaskContext__Group_9_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9_3__0_in_rule__TaskContext__Group_9__3__Impl4824);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2427:1: rule__TaskContext__Group_9__4 : rule__TaskContext__Group_9__4__Impl ;
    public final void rule__TaskContext__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2431:1: ( rule__TaskContext__Group_9__4__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2432:2: rule__TaskContext__Group_9__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9__4__Impl_in_rule__TaskContext__Group_9__44855);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2438:1: rule__TaskContext__Group_9__4__Impl : ( '}' ) ;
    public final void rule__TaskContext__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2442:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2443:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2443:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2444:1: '}'
            {
             before(grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__TaskContext__Group_9__4__Impl4883); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2467:1: rule__TaskContext__Group_9_3__0 : rule__TaskContext__Group_9_3__0__Impl rule__TaskContext__Group_9_3__1 ;
    public final void rule__TaskContext__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2471:1: ( rule__TaskContext__Group_9_3__0__Impl rule__TaskContext__Group_9_3__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2472:2: rule__TaskContext__Group_9_3__0__Impl rule__TaskContext__Group_9_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9_3__0__Impl_in_rule__TaskContext__Group_9_3__04924);
            rule__TaskContext__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9_3__1_in_rule__TaskContext__Group_9_3__04927);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2479:1: rule__TaskContext__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__TaskContext__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2483:1: ( ( ',' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2484:1: ( ',' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2484:1: ( ',' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2485:1: ','
            {
             before(grammarAccess.getTaskContextAccess().getCommaKeyword_9_3_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__TaskContext__Group_9_3__0__Impl4955); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2498:1: rule__TaskContext__Group_9_3__1 : rule__TaskContext__Group_9_3__1__Impl ;
    public final void rule__TaskContext__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2502:1: ( rule__TaskContext__Group_9_3__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2503:2: rule__TaskContext__Group_9_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_9_3__1__Impl_in_rule__TaskContext__Group_9_3__14986);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2509:1: rule__TaskContext__Group_9_3__1__Impl : ( ( rule__TaskContext__PropertiesAssignment_9_3_1 ) ) ;
    public final void rule__TaskContext__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2513:1: ( ( ( rule__TaskContext__PropertiesAssignment_9_3_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2514:1: ( ( rule__TaskContext__PropertiesAssignment_9_3_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2514:1: ( ( rule__TaskContext__PropertiesAssignment_9_3_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2515:1: ( rule__TaskContext__PropertiesAssignment_9_3_1 )
            {
             before(grammarAccess.getTaskContextAccess().getPropertiesAssignment_9_3_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2516:1: ( rule__TaskContext__PropertiesAssignment_9_3_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2516:2: rule__TaskContext__PropertiesAssignment_9_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__PropertiesAssignment_9_3_1_in_rule__TaskContext__Group_9_3__1__Impl5013);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2530:1: rule__TaskContext__Group_10__0 : rule__TaskContext__Group_10__0__Impl rule__TaskContext__Group_10__1 ;
    public final void rule__TaskContext__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2534:1: ( rule__TaskContext__Group_10__0__Impl rule__TaskContext__Group_10__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2535:2: rule__TaskContext__Group_10__0__Impl rule__TaskContext__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10__0__Impl_in_rule__TaskContext__Group_10__05047);
            rule__TaskContext__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10__1_in_rule__TaskContext__Group_10__05050);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2542:1: rule__TaskContext__Group_10__0__Impl : ( 'operations' ) ;
    public final void rule__TaskContext__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2546:1: ( ( 'operations' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2547:1: ( 'operations' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2547:1: ( 'operations' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2548:1: 'operations'
            {
             before(grammarAccess.getTaskContextAccess().getOperationsKeyword_10_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__TaskContext__Group_10__0__Impl5078); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2561:1: rule__TaskContext__Group_10__1 : rule__TaskContext__Group_10__1__Impl rule__TaskContext__Group_10__2 ;
    public final void rule__TaskContext__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2565:1: ( rule__TaskContext__Group_10__1__Impl rule__TaskContext__Group_10__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2566:2: rule__TaskContext__Group_10__1__Impl rule__TaskContext__Group_10__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10__1__Impl_in_rule__TaskContext__Group_10__15109);
            rule__TaskContext__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10__2_in_rule__TaskContext__Group_10__15112);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2573:1: rule__TaskContext__Group_10__1__Impl : ( '{' ) ;
    public final void rule__TaskContext__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2577:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2578:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2578:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2579:1: '{'
            {
             before(grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_10_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__TaskContext__Group_10__1__Impl5140); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2592:1: rule__TaskContext__Group_10__2 : rule__TaskContext__Group_10__2__Impl rule__TaskContext__Group_10__3 ;
    public final void rule__TaskContext__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2596:1: ( rule__TaskContext__Group_10__2__Impl rule__TaskContext__Group_10__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2597:2: rule__TaskContext__Group_10__2__Impl rule__TaskContext__Group_10__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10__2__Impl_in_rule__TaskContext__Group_10__25171);
            rule__TaskContext__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10__3_in_rule__TaskContext__Group_10__25174);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2604:1: rule__TaskContext__Group_10__2__Impl : ( ( rule__TaskContext__OperationsAssignment_10_2 ) ) ;
    public final void rule__TaskContext__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2608:1: ( ( ( rule__TaskContext__OperationsAssignment_10_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2609:1: ( ( rule__TaskContext__OperationsAssignment_10_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2609:1: ( ( rule__TaskContext__OperationsAssignment_10_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2610:1: ( rule__TaskContext__OperationsAssignment_10_2 )
            {
             before(grammarAccess.getTaskContextAccess().getOperationsAssignment_10_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2611:1: ( rule__TaskContext__OperationsAssignment_10_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2611:2: rule__TaskContext__OperationsAssignment_10_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__OperationsAssignment_10_2_in_rule__TaskContext__Group_10__2__Impl5201);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2621:1: rule__TaskContext__Group_10__3 : rule__TaskContext__Group_10__3__Impl rule__TaskContext__Group_10__4 ;
    public final void rule__TaskContext__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2625:1: ( rule__TaskContext__Group_10__3__Impl rule__TaskContext__Group_10__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2626:2: rule__TaskContext__Group_10__3__Impl rule__TaskContext__Group_10__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10__3__Impl_in_rule__TaskContext__Group_10__35231);
            rule__TaskContext__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10__4_in_rule__TaskContext__Group_10__35234);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2633:1: rule__TaskContext__Group_10__3__Impl : ( ( rule__TaskContext__Group_10_3__0 )* ) ;
    public final void rule__TaskContext__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2637:1: ( ( ( rule__TaskContext__Group_10_3__0 )* ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2638:1: ( ( rule__TaskContext__Group_10_3__0 )* )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2638:1: ( ( rule__TaskContext__Group_10_3__0 )* )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2639:1: ( rule__TaskContext__Group_10_3__0 )*
            {
             before(grammarAccess.getTaskContextAccess().getGroup_10_3()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2640:1: ( rule__TaskContext__Group_10_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==24) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2640:2: rule__TaskContext__Group_10_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10_3__0_in_rule__TaskContext__Group_10__3__Impl5261);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2650:1: rule__TaskContext__Group_10__4 : rule__TaskContext__Group_10__4__Impl ;
    public final void rule__TaskContext__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2654:1: ( rule__TaskContext__Group_10__4__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2655:2: rule__TaskContext__Group_10__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10__4__Impl_in_rule__TaskContext__Group_10__45292);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2661:1: rule__TaskContext__Group_10__4__Impl : ( '}' ) ;
    public final void rule__TaskContext__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2665:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2666:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2666:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2667:1: '}'
            {
             before(grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_10_4()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__TaskContext__Group_10__4__Impl5320); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2690:1: rule__TaskContext__Group_10_3__0 : rule__TaskContext__Group_10_3__0__Impl rule__TaskContext__Group_10_3__1 ;
    public final void rule__TaskContext__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2694:1: ( rule__TaskContext__Group_10_3__0__Impl rule__TaskContext__Group_10_3__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2695:2: rule__TaskContext__Group_10_3__0__Impl rule__TaskContext__Group_10_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10_3__0__Impl_in_rule__TaskContext__Group_10_3__05361);
            rule__TaskContext__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10_3__1_in_rule__TaskContext__Group_10_3__05364);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2702:1: rule__TaskContext__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__TaskContext__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2706:1: ( ( ',' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2707:1: ( ',' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2707:1: ( ',' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2708:1: ','
            {
             before(grammarAccess.getTaskContextAccess().getCommaKeyword_10_3_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__TaskContext__Group_10_3__0__Impl5392); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2721:1: rule__TaskContext__Group_10_3__1 : rule__TaskContext__Group_10_3__1__Impl ;
    public final void rule__TaskContext__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2725:1: ( rule__TaskContext__Group_10_3__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2726:2: rule__TaskContext__Group_10_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_10_3__1__Impl_in_rule__TaskContext__Group_10_3__15423);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2732:1: rule__TaskContext__Group_10_3__1__Impl : ( ( rule__TaskContext__OperationsAssignment_10_3_1 ) ) ;
    public final void rule__TaskContext__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2736:1: ( ( ( rule__TaskContext__OperationsAssignment_10_3_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2737:1: ( ( rule__TaskContext__OperationsAssignment_10_3_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2737:1: ( ( rule__TaskContext__OperationsAssignment_10_3_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2738:1: ( rule__TaskContext__OperationsAssignment_10_3_1 )
            {
             before(grammarAccess.getTaskContextAccess().getOperationsAssignment_10_3_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2739:1: ( rule__TaskContext__OperationsAssignment_10_3_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2739:2: rule__TaskContext__OperationsAssignment_10_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__OperationsAssignment_10_3_1_in_rule__TaskContext__Group_10_3__1__Impl5450);
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


    // $ANTLR start "rule__ConnectionPolicy__Group__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2753:1: rule__ConnectionPolicy__Group__0 : rule__ConnectionPolicy__Group__0__Impl rule__ConnectionPolicy__Group__1 ;
    public final void rule__ConnectionPolicy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2757:1: ( rule__ConnectionPolicy__Group__0__Impl rule__ConnectionPolicy__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2758:2: rule__ConnectionPolicy__Group__0__Impl rule__ConnectionPolicy__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__0__Impl_in_rule__ConnectionPolicy__Group__05484);
            rule__ConnectionPolicy__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__1_in_rule__ConnectionPolicy__Group__05487);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2765:1: rule__ConnectionPolicy__Group__0__Impl : ( 'ConnectionPolicy' ) ;
    public final void rule__ConnectionPolicy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2769:1: ( ( 'ConnectionPolicy' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2770:1: ( 'ConnectionPolicy' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2770:1: ( 'ConnectionPolicy' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2771:1: 'ConnectionPolicy'
            {
             before(grammarAccess.getConnectionPolicyAccess().getConnectionPolicyKeyword_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__ConnectionPolicy__Group__0__Impl5515); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2784:1: rule__ConnectionPolicy__Group__1 : rule__ConnectionPolicy__Group__1__Impl rule__ConnectionPolicy__Group__2 ;
    public final void rule__ConnectionPolicy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2788:1: ( rule__ConnectionPolicy__Group__1__Impl rule__ConnectionPolicy__Group__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2789:2: rule__ConnectionPolicy__Group__1__Impl rule__ConnectionPolicy__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__1__Impl_in_rule__ConnectionPolicy__Group__15546);
            rule__ConnectionPolicy__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__2_in_rule__ConnectionPolicy__Group__15549);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2796:1: rule__ConnectionPolicy__Group__1__Impl : ( ( rule__ConnectionPolicy__NameAssignment_1 ) ) ;
    public final void rule__ConnectionPolicy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2800:1: ( ( ( rule__ConnectionPolicy__NameAssignment_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2801:1: ( ( rule__ConnectionPolicy__NameAssignment_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2801:1: ( ( rule__ConnectionPolicy__NameAssignment_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2802:1: ( rule__ConnectionPolicy__NameAssignment_1 )
            {
             before(grammarAccess.getConnectionPolicyAccess().getNameAssignment_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2803:1: ( rule__ConnectionPolicy__NameAssignment_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2803:2: rule__ConnectionPolicy__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__NameAssignment_1_in_rule__ConnectionPolicy__Group__1__Impl5576);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2813:1: rule__ConnectionPolicy__Group__2 : rule__ConnectionPolicy__Group__2__Impl rule__ConnectionPolicy__Group__3 ;
    public final void rule__ConnectionPolicy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2817:1: ( rule__ConnectionPolicy__Group__2__Impl rule__ConnectionPolicy__Group__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2818:2: rule__ConnectionPolicy__Group__2__Impl rule__ConnectionPolicy__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__2__Impl_in_rule__ConnectionPolicy__Group__25606);
            rule__ConnectionPolicy__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__3_in_rule__ConnectionPolicy__Group__25609);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2825:1: rule__ConnectionPolicy__Group__2__Impl : ( '{' ) ;
    public final void rule__ConnectionPolicy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2829:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2830:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2830:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2831:1: '{'
            {
             before(grammarAccess.getConnectionPolicyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__ConnectionPolicy__Group__2__Impl5637); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2844:1: rule__ConnectionPolicy__Group__3 : rule__ConnectionPolicy__Group__3__Impl rule__ConnectionPolicy__Group__4 ;
    public final void rule__ConnectionPolicy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2848:1: ( rule__ConnectionPolicy__Group__3__Impl rule__ConnectionPolicy__Group__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2849:2: rule__ConnectionPolicy__Group__3__Impl rule__ConnectionPolicy__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__3__Impl_in_rule__ConnectionPolicy__Group__35668);
            rule__ConnectionPolicy__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__4_in_rule__ConnectionPolicy__Group__35671);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2856:1: rule__ConnectionPolicy__Group__3__Impl : ( ( rule__ConnectionPolicy__Group_3__0 )? ) ;
    public final void rule__ConnectionPolicy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2860:1: ( ( ( rule__ConnectionPolicy__Group_3__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2861:1: ( ( rule__ConnectionPolicy__Group_3__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2861:1: ( ( rule__ConnectionPolicy__Group_3__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2862:1: ( rule__ConnectionPolicy__Group_3__0 )?
            {
             before(grammarAccess.getConnectionPolicyAccess().getGroup_3()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2863:1: ( rule__ConnectionPolicy__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2863:2: rule__ConnectionPolicy__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_3__0_in_rule__ConnectionPolicy__Group__3__Impl5698);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2873:1: rule__ConnectionPolicy__Group__4 : rule__ConnectionPolicy__Group__4__Impl rule__ConnectionPolicy__Group__5 ;
    public final void rule__ConnectionPolicy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2877:1: ( rule__ConnectionPolicy__Group__4__Impl rule__ConnectionPolicy__Group__5 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2878:2: rule__ConnectionPolicy__Group__4__Impl rule__ConnectionPolicy__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__4__Impl_in_rule__ConnectionPolicy__Group__45729);
            rule__ConnectionPolicy__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__5_in_rule__ConnectionPolicy__Group__45732);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2885:1: rule__ConnectionPolicy__Group__4__Impl : ( ( rule__ConnectionPolicy__Group_4__0 )? ) ;
    public final void rule__ConnectionPolicy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2889:1: ( ( ( rule__ConnectionPolicy__Group_4__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2890:1: ( ( rule__ConnectionPolicy__Group_4__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2890:1: ( ( rule__ConnectionPolicy__Group_4__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2891:1: ( rule__ConnectionPolicy__Group_4__0 )?
            {
             before(grammarAccess.getConnectionPolicyAccess().getGroup_4()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2892:1: ( rule__ConnectionPolicy__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2892:2: rule__ConnectionPolicy__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_4__0_in_rule__ConnectionPolicy__Group__4__Impl5759);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2902:1: rule__ConnectionPolicy__Group__5 : rule__ConnectionPolicy__Group__5__Impl rule__ConnectionPolicy__Group__6 ;
    public final void rule__ConnectionPolicy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2906:1: ( rule__ConnectionPolicy__Group__5__Impl rule__ConnectionPolicy__Group__6 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2907:2: rule__ConnectionPolicy__Group__5__Impl rule__ConnectionPolicy__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__5__Impl_in_rule__ConnectionPolicy__Group__55790);
            rule__ConnectionPolicy__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__6_in_rule__ConnectionPolicy__Group__55793);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2914:1: rule__ConnectionPolicy__Group__5__Impl : ( ( rule__ConnectionPolicy__Group_5__0 )? ) ;
    public final void rule__ConnectionPolicy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2918:1: ( ( ( rule__ConnectionPolicy__Group_5__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2919:1: ( ( rule__ConnectionPolicy__Group_5__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2919:1: ( ( rule__ConnectionPolicy__Group_5__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2920:1: ( rule__ConnectionPolicy__Group_5__0 )?
            {
             before(grammarAccess.getConnectionPolicyAccess().getGroup_5()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2921:1: ( rule__ConnectionPolicy__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2921:2: rule__ConnectionPolicy__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_5__0_in_rule__ConnectionPolicy__Group__5__Impl5820);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2931:1: rule__ConnectionPolicy__Group__6 : rule__ConnectionPolicy__Group__6__Impl rule__ConnectionPolicy__Group__7 ;
    public final void rule__ConnectionPolicy__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2935:1: ( rule__ConnectionPolicy__Group__6__Impl rule__ConnectionPolicy__Group__7 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2936:2: rule__ConnectionPolicy__Group__6__Impl rule__ConnectionPolicy__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__6__Impl_in_rule__ConnectionPolicy__Group__65851);
            rule__ConnectionPolicy__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__7_in_rule__ConnectionPolicy__Group__65854);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2943:1: rule__ConnectionPolicy__Group__6__Impl : ( 'inputPort' ) ;
    public final void rule__ConnectionPolicy__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2947:1: ( ( 'inputPort' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2948:1: ( 'inputPort' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2948:1: ( 'inputPort' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2949:1: 'inputPort'
            {
             before(grammarAccess.getConnectionPolicyAccess().getInputPortKeyword_6()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__ConnectionPolicy__Group__6__Impl5882); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2962:1: rule__ConnectionPolicy__Group__7 : rule__ConnectionPolicy__Group__7__Impl rule__ConnectionPolicy__Group__8 ;
    public final void rule__ConnectionPolicy__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2966:1: ( rule__ConnectionPolicy__Group__7__Impl rule__ConnectionPolicy__Group__8 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2967:2: rule__ConnectionPolicy__Group__7__Impl rule__ConnectionPolicy__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__7__Impl_in_rule__ConnectionPolicy__Group__75913);
            rule__ConnectionPolicy__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__8_in_rule__ConnectionPolicy__Group__75916);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2974:1: rule__ConnectionPolicy__Group__7__Impl : ( ( rule__ConnectionPolicy__InputPortAssignment_7 ) ) ;
    public final void rule__ConnectionPolicy__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2978:1: ( ( ( rule__ConnectionPolicy__InputPortAssignment_7 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2979:1: ( ( rule__ConnectionPolicy__InputPortAssignment_7 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2979:1: ( ( rule__ConnectionPolicy__InputPortAssignment_7 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2980:1: ( rule__ConnectionPolicy__InputPortAssignment_7 )
            {
             before(grammarAccess.getConnectionPolicyAccess().getInputPortAssignment_7()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2981:1: ( rule__ConnectionPolicy__InputPortAssignment_7 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2981:2: rule__ConnectionPolicy__InputPortAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__InputPortAssignment_7_in_rule__ConnectionPolicy__Group__7__Impl5943);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2991:1: rule__ConnectionPolicy__Group__8 : rule__ConnectionPolicy__Group__8__Impl rule__ConnectionPolicy__Group__9 ;
    public final void rule__ConnectionPolicy__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2995:1: ( rule__ConnectionPolicy__Group__8__Impl rule__ConnectionPolicy__Group__9 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2996:2: rule__ConnectionPolicy__Group__8__Impl rule__ConnectionPolicy__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__8__Impl_in_rule__ConnectionPolicy__Group__85973);
            rule__ConnectionPolicy__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__9_in_rule__ConnectionPolicy__Group__85976);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3003:1: rule__ConnectionPolicy__Group__8__Impl : ( 'outputPort' ) ;
    public final void rule__ConnectionPolicy__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3007:1: ( ( 'outputPort' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3008:1: ( 'outputPort' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3008:1: ( 'outputPort' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3009:1: 'outputPort'
            {
             before(grammarAccess.getConnectionPolicyAccess().getOutputPortKeyword_8()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__ConnectionPolicy__Group__8__Impl6004); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3022:1: rule__ConnectionPolicy__Group__9 : rule__ConnectionPolicy__Group__9__Impl rule__ConnectionPolicy__Group__10 ;
    public final void rule__ConnectionPolicy__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3026:1: ( rule__ConnectionPolicy__Group__9__Impl rule__ConnectionPolicy__Group__10 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3027:2: rule__ConnectionPolicy__Group__9__Impl rule__ConnectionPolicy__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__9__Impl_in_rule__ConnectionPolicy__Group__96035);
            rule__ConnectionPolicy__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__10_in_rule__ConnectionPolicy__Group__96038);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3034:1: rule__ConnectionPolicy__Group__9__Impl : ( ( rule__ConnectionPolicy__OutputPortAssignment_9 ) ) ;
    public final void rule__ConnectionPolicy__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3038:1: ( ( ( rule__ConnectionPolicy__OutputPortAssignment_9 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3039:1: ( ( rule__ConnectionPolicy__OutputPortAssignment_9 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3039:1: ( ( rule__ConnectionPolicy__OutputPortAssignment_9 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3040:1: ( rule__ConnectionPolicy__OutputPortAssignment_9 )
            {
             before(grammarAccess.getConnectionPolicyAccess().getOutputPortAssignment_9()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3041:1: ( rule__ConnectionPolicy__OutputPortAssignment_9 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3041:2: rule__ConnectionPolicy__OutputPortAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__OutputPortAssignment_9_in_rule__ConnectionPolicy__Group__9__Impl6065);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3051:1: rule__ConnectionPolicy__Group__10 : rule__ConnectionPolicy__Group__10__Impl ;
    public final void rule__ConnectionPolicy__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3055:1: ( rule__ConnectionPolicy__Group__10__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3056:2: rule__ConnectionPolicy__Group__10__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__10__Impl_in_rule__ConnectionPolicy__Group__106095);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3062:1: rule__ConnectionPolicy__Group__10__Impl : ( '}' ) ;
    public final void rule__ConnectionPolicy__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3066:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3067:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3067:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3068:1: '}'
            {
             before(grammarAccess.getConnectionPolicyAccess().getRightCurlyBracketKeyword_10()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__ConnectionPolicy__Group__10__Impl6123); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3103:1: rule__ConnectionPolicy__Group_3__0 : rule__ConnectionPolicy__Group_3__0__Impl rule__ConnectionPolicy__Group_3__1 ;
    public final void rule__ConnectionPolicy__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3107:1: ( rule__ConnectionPolicy__Group_3__0__Impl rule__ConnectionPolicy__Group_3__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3108:2: rule__ConnectionPolicy__Group_3__0__Impl rule__ConnectionPolicy__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_3__0__Impl_in_rule__ConnectionPolicy__Group_3__06176);
            rule__ConnectionPolicy__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_3__1_in_rule__ConnectionPolicy__Group_3__06179);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3115:1: rule__ConnectionPolicy__Group_3__0__Impl : ( 'bufferSize' ) ;
    public final void rule__ConnectionPolicy__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3119:1: ( ( 'bufferSize' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3120:1: ( 'bufferSize' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3120:1: ( 'bufferSize' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3121:1: 'bufferSize'
            {
             before(grammarAccess.getConnectionPolicyAccess().getBufferSizeKeyword_3_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__ConnectionPolicy__Group_3__0__Impl6207); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3134:1: rule__ConnectionPolicy__Group_3__1 : rule__ConnectionPolicy__Group_3__1__Impl ;
    public final void rule__ConnectionPolicy__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3138:1: ( rule__ConnectionPolicy__Group_3__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3139:2: rule__ConnectionPolicy__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_3__1__Impl_in_rule__ConnectionPolicy__Group_3__16238);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3145:1: rule__ConnectionPolicy__Group_3__1__Impl : ( ( rule__ConnectionPolicy__BufferSizeAssignment_3_1 ) ) ;
    public final void rule__ConnectionPolicy__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3149:1: ( ( ( rule__ConnectionPolicy__BufferSizeAssignment_3_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3150:1: ( ( rule__ConnectionPolicy__BufferSizeAssignment_3_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3150:1: ( ( rule__ConnectionPolicy__BufferSizeAssignment_3_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3151:1: ( rule__ConnectionPolicy__BufferSizeAssignment_3_1 )
            {
             before(grammarAccess.getConnectionPolicyAccess().getBufferSizeAssignment_3_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3152:1: ( rule__ConnectionPolicy__BufferSizeAssignment_3_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3152:2: rule__ConnectionPolicy__BufferSizeAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__BufferSizeAssignment_3_1_in_rule__ConnectionPolicy__Group_3__1__Impl6265);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3166:1: rule__ConnectionPolicy__Group_4__0 : rule__ConnectionPolicy__Group_4__0__Impl rule__ConnectionPolicy__Group_4__1 ;
    public final void rule__ConnectionPolicy__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3170:1: ( rule__ConnectionPolicy__Group_4__0__Impl rule__ConnectionPolicy__Group_4__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3171:2: rule__ConnectionPolicy__Group_4__0__Impl rule__ConnectionPolicy__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_4__0__Impl_in_rule__ConnectionPolicy__Group_4__06299);
            rule__ConnectionPolicy__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_4__1_in_rule__ConnectionPolicy__Group_4__06302);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3178:1: rule__ConnectionPolicy__Group_4__0__Impl : ( 'lockPolicy' ) ;
    public final void rule__ConnectionPolicy__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3182:1: ( ( 'lockPolicy' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3183:1: ( 'lockPolicy' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3183:1: ( 'lockPolicy' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3184:1: 'lockPolicy'
            {
             before(grammarAccess.getConnectionPolicyAccess().getLockPolicyKeyword_4_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__ConnectionPolicy__Group_4__0__Impl6330); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3197:1: rule__ConnectionPolicy__Group_4__1 : rule__ConnectionPolicy__Group_4__1__Impl ;
    public final void rule__ConnectionPolicy__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3201:1: ( rule__ConnectionPolicy__Group_4__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3202:2: rule__ConnectionPolicy__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_4__1__Impl_in_rule__ConnectionPolicy__Group_4__16361);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3208:1: rule__ConnectionPolicy__Group_4__1__Impl : ( ( rule__ConnectionPolicy__LockPolicyAssignment_4_1 ) ) ;
    public final void rule__ConnectionPolicy__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3212:1: ( ( ( rule__ConnectionPolicy__LockPolicyAssignment_4_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3213:1: ( ( rule__ConnectionPolicy__LockPolicyAssignment_4_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3213:1: ( ( rule__ConnectionPolicy__LockPolicyAssignment_4_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3214:1: ( rule__ConnectionPolicy__LockPolicyAssignment_4_1 )
            {
             before(grammarAccess.getConnectionPolicyAccess().getLockPolicyAssignment_4_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3215:1: ( rule__ConnectionPolicy__LockPolicyAssignment_4_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3215:2: rule__ConnectionPolicy__LockPolicyAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__LockPolicyAssignment_4_1_in_rule__ConnectionPolicy__Group_4__1__Impl6388);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3229:1: rule__ConnectionPolicy__Group_5__0 : rule__ConnectionPolicy__Group_5__0__Impl rule__ConnectionPolicy__Group_5__1 ;
    public final void rule__ConnectionPolicy__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3233:1: ( rule__ConnectionPolicy__Group_5__0__Impl rule__ConnectionPolicy__Group_5__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3234:2: rule__ConnectionPolicy__Group_5__0__Impl rule__ConnectionPolicy__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_5__0__Impl_in_rule__ConnectionPolicy__Group_5__06422);
            rule__ConnectionPolicy__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_5__1_in_rule__ConnectionPolicy__Group_5__06425);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3241:1: rule__ConnectionPolicy__Group_5__0__Impl : ( 'type' ) ;
    public final void rule__ConnectionPolicy__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3245:1: ( ( 'type' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3246:1: ( 'type' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3246:1: ( 'type' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3247:1: 'type'
            {
             before(grammarAccess.getConnectionPolicyAccess().getTypeKeyword_5_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__ConnectionPolicy__Group_5__0__Impl6453); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3260:1: rule__ConnectionPolicy__Group_5__1 : rule__ConnectionPolicy__Group_5__1__Impl ;
    public final void rule__ConnectionPolicy__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3264:1: ( rule__ConnectionPolicy__Group_5__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3265:2: rule__ConnectionPolicy__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_5__1__Impl_in_rule__ConnectionPolicy__Group_5__16484);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3271:1: rule__ConnectionPolicy__Group_5__1__Impl : ( ( rule__ConnectionPolicy__TypeAssignment_5_1 ) ) ;
    public final void rule__ConnectionPolicy__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3275:1: ( ( ( rule__ConnectionPolicy__TypeAssignment_5_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3276:1: ( ( rule__ConnectionPolicy__TypeAssignment_5_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3276:1: ( ( rule__ConnectionPolicy__TypeAssignment_5_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3277:1: ( rule__ConnectionPolicy__TypeAssignment_5_1 )
            {
             before(grammarAccess.getConnectionPolicyAccess().getTypeAssignment_5_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3278:1: ( rule__ConnectionPolicy__TypeAssignment_5_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3278:2: rule__ConnectionPolicy__TypeAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__TypeAssignment_5_1_in_rule__ConnectionPolicy__Group_5__1__Impl6511);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3292:1: rule__InputPort__Group__0 : rule__InputPort__Group__0__Impl rule__InputPort__Group__1 ;
    public final void rule__InputPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3296:1: ( rule__InputPort__Group__0__Impl rule__InputPort__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3297:2: rule__InputPort__Group__0__Impl rule__InputPort__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__0__Impl_in_rule__InputPort__Group__06545);
            rule__InputPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__1_in_rule__InputPort__Group__06548);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3304:1: rule__InputPort__Group__0__Impl : ( ( rule__InputPort__IsEventPortAssignment_0 ) ) ;
    public final void rule__InputPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3308:1: ( ( ( rule__InputPort__IsEventPortAssignment_0 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3309:1: ( ( rule__InputPort__IsEventPortAssignment_0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3309:1: ( ( rule__InputPort__IsEventPortAssignment_0 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3310:1: ( rule__InputPort__IsEventPortAssignment_0 )
            {
             before(grammarAccess.getInputPortAccess().getIsEventPortAssignment_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3311:1: ( rule__InputPort__IsEventPortAssignment_0 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3311:2: rule__InputPort__IsEventPortAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__IsEventPortAssignment_0_in_rule__InputPort__Group__0__Impl6575);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3321:1: rule__InputPort__Group__1 : rule__InputPort__Group__1__Impl rule__InputPort__Group__2 ;
    public final void rule__InputPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3325:1: ( rule__InputPort__Group__1__Impl rule__InputPort__Group__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3326:2: rule__InputPort__Group__1__Impl rule__InputPort__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__1__Impl_in_rule__InputPort__Group__16605);
            rule__InputPort__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__2_in_rule__InputPort__Group__16608);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3333:1: rule__InputPort__Group__1__Impl : ( 'InputPort' ) ;
    public final void rule__InputPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3337:1: ( ( 'InputPort' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3338:1: ( 'InputPort' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3338:1: ( 'InputPort' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3339:1: 'InputPort'
            {
             before(grammarAccess.getInputPortAccess().getInputPortKeyword_1()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__InputPort__Group__1__Impl6636); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3352:1: rule__InputPort__Group__2 : rule__InputPort__Group__2__Impl rule__InputPort__Group__3 ;
    public final void rule__InputPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3356:1: ( rule__InputPort__Group__2__Impl rule__InputPort__Group__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3357:2: rule__InputPort__Group__2__Impl rule__InputPort__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__2__Impl_in_rule__InputPort__Group__26667);
            rule__InputPort__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__3_in_rule__InputPort__Group__26670);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3364:1: rule__InputPort__Group__2__Impl : ( ( rule__InputPort__NameAssignment_2 ) ) ;
    public final void rule__InputPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3368:1: ( ( ( rule__InputPort__NameAssignment_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3369:1: ( ( rule__InputPort__NameAssignment_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3369:1: ( ( rule__InputPort__NameAssignment_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3370:1: ( rule__InputPort__NameAssignment_2 )
            {
             before(grammarAccess.getInputPortAccess().getNameAssignment_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3371:1: ( rule__InputPort__NameAssignment_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3371:2: rule__InputPort__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__NameAssignment_2_in_rule__InputPort__Group__2__Impl6697);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3381:1: rule__InputPort__Group__3 : rule__InputPort__Group__3__Impl rule__InputPort__Group__4 ;
    public final void rule__InputPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3385:1: ( rule__InputPort__Group__3__Impl rule__InputPort__Group__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3386:2: rule__InputPort__Group__3__Impl rule__InputPort__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__3__Impl_in_rule__InputPort__Group__36727);
            rule__InputPort__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__4_in_rule__InputPort__Group__36730);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3393:1: rule__InputPort__Group__3__Impl : ( '{' ) ;
    public final void rule__InputPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3397:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3398:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3398:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3399:1: '{'
            {
             before(grammarAccess.getInputPortAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__InputPort__Group__3__Impl6758); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3412:1: rule__InputPort__Group__4 : rule__InputPort__Group__4__Impl rule__InputPort__Group__5 ;
    public final void rule__InputPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3416:1: ( rule__InputPort__Group__4__Impl rule__InputPort__Group__5 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3417:2: rule__InputPort__Group__4__Impl rule__InputPort__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__4__Impl_in_rule__InputPort__Group__46789);
            rule__InputPort__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__5_in_rule__InputPort__Group__46792);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3424:1: rule__InputPort__Group__4__Impl : ( ( rule__InputPort__Group_4__0 )? ) ;
    public final void rule__InputPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3428:1: ( ( ( rule__InputPort__Group_4__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3429:1: ( ( rule__InputPort__Group_4__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3429:1: ( ( rule__InputPort__Group_4__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3430:1: ( rule__InputPort__Group_4__0 )?
            {
             before(grammarAccess.getInputPortAccess().getGroup_4()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3431:1: ( rule__InputPort__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==40) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3431:2: rule__InputPort__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group_4__0_in_rule__InputPort__Group__4__Impl6819);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3441:1: rule__InputPort__Group__5 : rule__InputPort__Group__5__Impl rule__InputPort__Group__6 ;
    public final void rule__InputPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3445:1: ( rule__InputPort__Group__5__Impl rule__InputPort__Group__6 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3446:2: rule__InputPort__Group__5__Impl rule__InputPort__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__5__Impl_in_rule__InputPort__Group__56850);
            rule__InputPort__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__6_in_rule__InputPort__Group__56853);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3453:1: rule__InputPort__Group__5__Impl : ( ( rule__InputPort__Group_5__0 )? ) ;
    public final void rule__InputPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3457:1: ( ( ( rule__InputPort__Group_5__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3458:1: ( ( rule__InputPort__Group_5__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3458:1: ( ( rule__InputPort__Group_5__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3459:1: ( rule__InputPort__Group_5__0 )?
            {
             before(grammarAccess.getInputPortAccess().getGroup_5()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3460:1: ( rule__InputPort__Group_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==41) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3460:2: rule__InputPort__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group_5__0_in_rule__InputPort__Group__5__Impl6880);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3470:1: rule__InputPort__Group__6 : rule__InputPort__Group__6__Impl ;
    public final void rule__InputPort__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3474:1: ( rule__InputPort__Group__6__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3475:2: rule__InputPort__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__6__Impl_in_rule__InputPort__Group__66911);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3481:1: rule__InputPort__Group__6__Impl : ( '}' ) ;
    public final void rule__InputPort__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3485:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3486:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3486:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3487:1: '}'
            {
             before(grammarAccess.getInputPortAccess().getRightCurlyBracketKeyword_6()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__InputPort__Group__6__Impl6939); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3514:1: rule__InputPort__Group_4__0 : rule__InputPort__Group_4__0__Impl rule__InputPort__Group_4__1 ;
    public final void rule__InputPort__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3518:1: ( rule__InputPort__Group_4__0__Impl rule__InputPort__Group_4__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3519:2: rule__InputPort__Group_4__0__Impl rule__InputPort__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group_4__0__Impl_in_rule__InputPort__Group_4__06984);
            rule__InputPort__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group_4__1_in_rule__InputPort__Group_4__06987);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3526:1: rule__InputPort__Group_4__0__Impl : ( 'dataType' ) ;
    public final void rule__InputPort__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3530:1: ( ( 'dataType' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3531:1: ( 'dataType' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3531:1: ( 'dataType' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3532:1: 'dataType'
            {
             before(grammarAccess.getInputPortAccess().getDataTypeKeyword_4_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__InputPort__Group_4__0__Impl7015); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3545:1: rule__InputPort__Group_4__1 : rule__InputPort__Group_4__1__Impl ;
    public final void rule__InputPort__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3549:1: ( rule__InputPort__Group_4__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3550:2: rule__InputPort__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group_4__1__Impl_in_rule__InputPort__Group_4__17046);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3556:1: rule__InputPort__Group_4__1__Impl : ( ( rule__InputPort__DataTypeAssignment_4_1 ) ) ;
    public final void rule__InputPort__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3560:1: ( ( ( rule__InputPort__DataTypeAssignment_4_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3561:1: ( ( rule__InputPort__DataTypeAssignment_4_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3561:1: ( ( rule__InputPort__DataTypeAssignment_4_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3562:1: ( rule__InputPort__DataTypeAssignment_4_1 )
            {
             before(grammarAccess.getInputPortAccess().getDataTypeAssignment_4_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3563:1: ( rule__InputPort__DataTypeAssignment_4_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3563:2: rule__InputPort__DataTypeAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__DataTypeAssignment_4_1_in_rule__InputPort__Group_4__1__Impl7073);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3577:1: rule__InputPort__Group_5__0 : rule__InputPort__Group_5__0__Impl rule__InputPort__Group_5__1 ;
    public final void rule__InputPort__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3581:1: ( rule__InputPort__Group_5__0__Impl rule__InputPort__Group_5__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3582:2: rule__InputPort__Group_5__0__Impl rule__InputPort__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group_5__0__Impl_in_rule__InputPort__Group_5__07107);
            rule__InputPort__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group_5__1_in_rule__InputPort__Group_5__07110);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3589:1: rule__InputPort__Group_5__0__Impl : ( 'inputConnectionPolicy' ) ;
    public final void rule__InputPort__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3593:1: ( ( 'inputConnectionPolicy' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3594:1: ( 'inputConnectionPolicy' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3594:1: ( 'inputConnectionPolicy' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3595:1: 'inputConnectionPolicy'
            {
             before(grammarAccess.getInputPortAccess().getInputConnectionPolicyKeyword_5_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__InputPort__Group_5__0__Impl7138); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3608:1: rule__InputPort__Group_5__1 : rule__InputPort__Group_5__1__Impl ;
    public final void rule__InputPort__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3612:1: ( rule__InputPort__Group_5__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3613:2: rule__InputPort__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group_5__1__Impl_in_rule__InputPort__Group_5__17169);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3619:1: rule__InputPort__Group_5__1__Impl : ( ( rule__InputPort__InputConnectionPolicyAssignment_5_1 ) ) ;
    public final void rule__InputPort__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3623:1: ( ( ( rule__InputPort__InputConnectionPolicyAssignment_5_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3624:1: ( ( rule__InputPort__InputConnectionPolicyAssignment_5_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3624:1: ( ( rule__InputPort__InputConnectionPolicyAssignment_5_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3625:1: ( rule__InputPort__InputConnectionPolicyAssignment_5_1 )
            {
             before(grammarAccess.getInputPortAccess().getInputConnectionPolicyAssignment_5_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3626:1: ( rule__InputPort__InputConnectionPolicyAssignment_5_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3626:2: rule__InputPort__InputConnectionPolicyAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__InputConnectionPolicyAssignment_5_1_in_rule__InputPort__Group_5__1__Impl7196);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3640:1: rule__OutputPort__Group__0 : rule__OutputPort__Group__0__Impl rule__OutputPort__Group__1 ;
    public final void rule__OutputPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3644:1: ( rule__OutputPort__Group__0__Impl rule__OutputPort__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3645:2: rule__OutputPort__Group__0__Impl rule__OutputPort__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__0__Impl_in_rule__OutputPort__Group__07230);
            rule__OutputPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__1_in_rule__OutputPort__Group__07233);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3652:1: rule__OutputPort__Group__0__Impl : ( 'OutputPort' ) ;
    public final void rule__OutputPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3656:1: ( ( 'OutputPort' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3657:1: ( 'OutputPort' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3657:1: ( 'OutputPort' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3658:1: 'OutputPort'
            {
             before(grammarAccess.getOutputPortAccess().getOutputPortKeyword_0()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__OutputPort__Group__0__Impl7261); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3671:1: rule__OutputPort__Group__1 : rule__OutputPort__Group__1__Impl rule__OutputPort__Group__2 ;
    public final void rule__OutputPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3675:1: ( rule__OutputPort__Group__1__Impl rule__OutputPort__Group__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3676:2: rule__OutputPort__Group__1__Impl rule__OutputPort__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__1__Impl_in_rule__OutputPort__Group__17292);
            rule__OutputPort__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__2_in_rule__OutputPort__Group__17295);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3683:1: rule__OutputPort__Group__1__Impl : ( ( rule__OutputPort__NameAssignment_1 ) ) ;
    public final void rule__OutputPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3687:1: ( ( ( rule__OutputPort__NameAssignment_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3688:1: ( ( rule__OutputPort__NameAssignment_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3688:1: ( ( rule__OutputPort__NameAssignment_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3689:1: ( rule__OutputPort__NameAssignment_1 )
            {
             before(grammarAccess.getOutputPortAccess().getNameAssignment_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3690:1: ( rule__OutputPort__NameAssignment_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3690:2: rule__OutputPort__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__NameAssignment_1_in_rule__OutputPort__Group__1__Impl7322);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3700:1: rule__OutputPort__Group__2 : rule__OutputPort__Group__2__Impl rule__OutputPort__Group__3 ;
    public final void rule__OutputPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3704:1: ( rule__OutputPort__Group__2__Impl rule__OutputPort__Group__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3705:2: rule__OutputPort__Group__2__Impl rule__OutputPort__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__2__Impl_in_rule__OutputPort__Group__27352);
            rule__OutputPort__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__3_in_rule__OutputPort__Group__27355);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3712:1: rule__OutputPort__Group__2__Impl : ( '{' ) ;
    public final void rule__OutputPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3716:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3717:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3717:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3718:1: '{'
            {
             before(grammarAccess.getOutputPortAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__OutputPort__Group__2__Impl7383); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3731:1: rule__OutputPort__Group__3 : rule__OutputPort__Group__3__Impl rule__OutputPort__Group__4 ;
    public final void rule__OutputPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3735:1: ( rule__OutputPort__Group__3__Impl rule__OutputPort__Group__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3736:2: rule__OutputPort__Group__3__Impl rule__OutputPort__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__3__Impl_in_rule__OutputPort__Group__37414);
            rule__OutputPort__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__4_in_rule__OutputPort__Group__37417);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3743:1: rule__OutputPort__Group__3__Impl : ( ( rule__OutputPort__Group_3__0 )? ) ;
    public final void rule__OutputPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3747:1: ( ( ( rule__OutputPort__Group_3__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3748:1: ( ( rule__OutputPort__Group_3__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3748:1: ( ( rule__OutputPort__Group_3__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3749:1: ( rule__OutputPort__Group_3__0 )?
            {
             before(grammarAccess.getOutputPortAccess().getGroup_3()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3750:1: ( rule__OutputPort__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==40) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3750:2: rule__OutputPort__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group_3__0_in_rule__OutputPort__Group__3__Impl7444);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3760:1: rule__OutputPort__Group__4 : rule__OutputPort__Group__4__Impl rule__OutputPort__Group__5 ;
    public final void rule__OutputPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3764:1: ( rule__OutputPort__Group__4__Impl rule__OutputPort__Group__5 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3765:2: rule__OutputPort__Group__4__Impl rule__OutputPort__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__4__Impl_in_rule__OutputPort__Group__47475);
            rule__OutputPort__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__5_in_rule__OutputPort__Group__47478);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3772:1: rule__OutputPort__Group__4__Impl : ( ( rule__OutputPort__Group_4__0 )? ) ;
    public final void rule__OutputPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3776:1: ( ( ( rule__OutputPort__Group_4__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3777:1: ( ( rule__OutputPort__Group_4__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3777:1: ( ( rule__OutputPort__Group_4__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3778:1: ( rule__OutputPort__Group_4__0 )?
            {
             before(grammarAccess.getOutputPortAccess().getGroup_4()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3779:1: ( rule__OutputPort__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==43) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3779:2: rule__OutputPort__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group_4__0_in_rule__OutputPort__Group__4__Impl7505);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3789:1: rule__OutputPort__Group__5 : rule__OutputPort__Group__5__Impl ;
    public final void rule__OutputPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3793:1: ( rule__OutputPort__Group__5__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3794:2: rule__OutputPort__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__5__Impl_in_rule__OutputPort__Group__57536);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3800:1: rule__OutputPort__Group__5__Impl : ( '}' ) ;
    public final void rule__OutputPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3804:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3805:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3805:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3806:1: '}'
            {
             before(grammarAccess.getOutputPortAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__OutputPort__Group__5__Impl7564); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3831:1: rule__OutputPort__Group_3__0 : rule__OutputPort__Group_3__0__Impl rule__OutputPort__Group_3__1 ;
    public final void rule__OutputPort__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3835:1: ( rule__OutputPort__Group_3__0__Impl rule__OutputPort__Group_3__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3836:2: rule__OutputPort__Group_3__0__Impl rule__OutputPort__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group_3__0__Impl_in_rule__OutputPort__Group_3__07607);
            rule__OutputPort__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group_3__1_in_rule__OutputPort__Group_3__07610);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3843:1: rule__OutputPort__Group_3__0__Impl : ( 'dataType' ) ;
    public final void rule__OutputPort__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3847:1: ( ( 'dataType' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3848:1: ( 'dataType' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3848:1: ( 'dataType' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3849:1: 'dataType'
            {
             before(grammarAccess.getOutputPortAccess().getDataTypeKeyword_3_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__OutputPort__Group_3__0__Impl7638); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3862:1: rule__OutputPort__Group_3__1 : rule__OutputPort__Group_3__1__Impl ;
    public final void rule__OutputPort__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3866:1: ( rule__OutputPort__Group_3__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3867:2: rule__OutputPort__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group_3__1__Impl_in_rule__OutputPort__Group_3__17669);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3873:1: rule__OutputPort__Group_3__1__Impl : ( ( rule__OutputPort__DataTypeAssignment_3_1 ) ) ;
    public final void rule__OutputPort__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3877:1: ( ( ( rule__OutputPort__DataTypeAssignment_3_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3878:1: ( ( rule__OutputPort__DataTypeAssignment_3_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3878:1: ( ( rule__OutputPort__DataTypeAssignment_3_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3879:1: ( rule__OutputPort__DataTypeAssignment_3_1 )
            {
             before(grammarAccess.getOutputPortAccess().getDataTypeAssignment_3_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3880:1: ( rule__OutputPort__DataTypeAssignment_3_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3880:2: rule__OutputPort__DataTypeAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__DataTypeAssignment_3_1_in_rule__OutputPort__Group_3__1__Impl7696);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3894:1: rule__OutputPort__Group_4__0 : rule__OutputPort__Group_4__0__Impl rule__OutputPort__Group_4__1 ;
    public final void rule__OutputPort__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3898:1: ( rule__OutputPort__Group_4__0__Impl rule__OutputPort__Group_4__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3899:2: rule__OutputPort__Group_4__0__Impl rule__OutputPort__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group_4__0__Impl_in_rule__OutputPort__Group_4__07730);
            rule__OutputPort__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group_4__1_in_rule__OutputPort__Group_4__07733);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3906:1: rule__OutputPort__Group_4__0__Impl : ( 'outputConnectionPolicy' ) ;
    public final void rule__OutputPort__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3910:1: ( ( 'outputConnectionPolicy' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3911:1: ( 'outputConnectionPolicy' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3911:1: ( 'outputConnectionPolicy' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3912:1: 'outputConnectionPolicy'
            {
             before(grammarAccess.getOutputPortAccess().getOutputConnectionPolicyKeyword_4_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__OutputPort__Group_4__0__Impl7761); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3925:1: rule__OutputPort__Group_4__1 : rule__OutputPort__Group_4__1__Impl ;
    public final void rule__OutputPort__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3929:1: ( rule__OutputPort__Group_4__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3930:2: rule__OutputPort__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group_4__1__Impl_in_rule__OutputPort__Group_4__17792);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3936:1: rule__OutputPort__Group_4__1__Impl : ( ( rule__OutputPort__OutputConnectionPolicyAssignment_4_1 ) ) ;
    public final void rule__OutputPort__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3940:1: ( ( ( rule__OutputPort__OutputConnectionPolicyAssignment_4_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3941:1: ( ( rule__OutputPort__OutputConnectionPolicyAssignment_4_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3941:1: ( ( rule__OutputPort__OutputConnectionPolicyAssignment_4_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3942:1: ( rule__OutputPort__OutputConnectionPolicyAssignment_4_1 )
            {
             before(grammarAccess.getOutputPortAccess().getOutputConnectionPolicyAssignment_4_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3943:1: ( rule__OutputPort__OutputConnectionPolicyAssignment_4_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3943:2: rule__OutputPort__OutputConnectionPolicyAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__OutputConnectionPolicyAssignment_4_1_in_rule__OutputPort__Group_4__1__Impl7819);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3957:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3961:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3962:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__07853);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__1_in_rule__Property__Group__07856);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3969:1: rule__Property__Group__0__Impl : ( () ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3973:1: ( ( () ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3974:1: ( () )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3974:1: ( () )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3975:1: ()
            {
             before(grammarAccess.getPropertyAccess().getPropertyAction_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3976:1: ()
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3978:1: 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3988:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3992:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3993:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__17914);
            rule__Property__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__2_in_rule__Property__Group__17917);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4000:1: rule__Property__Group__1__Impl : ( 'Property' ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4004:1: ( ( 'Property' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4005:1: ( 'Property' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4005:1: ( 'Property' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4006:1: 'Property'
            {
             before(grammarAccess.getPropertyAccess().getPropertyKeyword_1()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Property__Group__1__Impl7945); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4019:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4023:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4024:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__27976);
            rule__Property__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__3_in_rule__Property__Group__27979);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4031:1: rule__Property__Group__2__Impl : ( ( rule__Property__NameAssignment_2 ) ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4035:1: ( ( ( rule__Property__NameAssignment_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4036:1: ( ( rule__Property__NameAssignment_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4036:1: ( ( rule__Property__NameAssignment_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4037:1: ( rule__Property__NameAssignment_2 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4038:1: ( rule__Property__NameAssignment_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4038:2: rule__Property__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__NameAssignment_2_in_rule__Property__Group__2__Impl8006);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4048:1: rule__Property__Group__3 : rule__Property__Group__3__Impl rule__Property__Group__4 ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4052:1: ( rule__Property__Group__3__Impl rule__Property__Group__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4053:2: rule__Property__Group__3__Impl rule__Property__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__3__Impl_in_rule__Property__Group__38036);
            rule__Property__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__4_in_rule__Property__Group__38039);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4060:1: rule__Property__Group__3__Impl : ( '{' ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4064:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4065:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4065:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4066:1: '{'
            {
             before(grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Property__Group__3__Impl8067); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4079:1: rule__Property__Group__4 : rule__Property__Group__4__Impl rule__Property__Group__5 ;
    public final void rule__Property__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4083:1: ( rule__Property__Group__4__Impl rule__Property__Group__5 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4084:2: rule__Property__Group__4__Impl rule__Property__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__4__Impl_in_rule__Property__Group__48098);
            rule__Property__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__5_in_rule__Property__Group__48101);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4091:1: rule__Property__Group__4__Impl : ( ( rule__Property__Group_4__0 )? ) ;
    public final void rule__Property__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4095:1: ( ( ( rule__Property__Group_4__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4096:1: ( ( rule__Property__Group_4__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4096:1: ( ( rule__Property__Group_4__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4097:1: ( rule__Property__Group_4__0 )?
            {
             before(grammarAccess.getPropertyAccess().getGroup_4()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4098:1: ( rule__Property__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==45) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4098:2: rule__Property__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Property__Group_4__0_in_rule__Property__Group__4__Impl8128);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4108:1: rule__Property__Group__5 : rule__Property__Group__5__Impl rule__Property__Group__6 ;
    public final void rule__Property__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4112:1: ( rule__Property__Group__5__Impl rule__Property__Group__6 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4113:2: rule__Property__Group__5__Impl rule__Property__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__5__Impl_in_rule__Property__Group__58159);
            rule__Property__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__6_in_rule__Property__Group__58162);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4120:1: rule__Property__Group__5__Impl : ( ( rule__Property__Group_5__0 )? ) ;
    public final void rule__Property__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4124:1: ( ( ( rule__Property__Group_5__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4125:1: ( ( rule__Property__Group_5__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4125:1: ( ( rule__Property__Group_5__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4126:1: ( rule__Property__Group_5__0 )?
            {
             before(grammarAccess.getPropertyAccess().getGroup_5()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4127:1: ( rule__Property__Group_5__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==46) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4127:2: rule__Property__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Property__Group_5__0_in_rule__Property__Group__5__Impl8189);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4137:1: rule__Property__Group__6 : rule__Property__Group__6__Impl rule__Property__Group__7 ;
    public final void rule__Property__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4141:1: ( rule__Property__Group__6__Impl rule__Property__Group__7 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4142:2: rule__Property__Group__6__Impl rule__Property__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__6__Impl_in_rule__Property__Group__68220);
            rule__Property__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__7_in_rule__Property__Group__68223);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4149:1: rule__Property__Group__6__Impl : ( ( rule__Property__Group_6__0 )? ) ;
    public final void rule__Property__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4153:1: ( ( ( rule__Property__Group_6__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4154:1: ( ( rule__Property__Group_6__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4154:1: ( ( rule__Property__Group_6__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4155:1: ( rule__Property__Group_6__0 )?
            {
             before(grammarAccess.getPropertyAccess().getGroup_6()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4156:1: ( rule__Property__Group_6__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==29) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4156:2: rule__Property__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Property__Group_6__0_in_rule__Property__Group__6__Impl8250);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4166:1: rule__Property__Group__7 : rule__Property__Group__7__Impl ;
    public final void rule__Property__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4170:1: ( rule__Property__Group__7__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4171:2: rule__Property__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group__7__Impl_in_rule__Property__Group__78281);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4177:1: rule__Property__Group__7__Impl : ( '}' ) ;
    public final void rule__Property__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4181:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4182:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4182:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4183:1: '}'
            {
             before(grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_7()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Property__Group__7__Impl8309); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4212:1: rule__Property__Group_4__0 : rule__Property__Group_4__0__Impl rule__Property__Group_4__1 ;
    public final void rule__Property__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4216:1: ( rule__Property__Group_4__0__Impl rule__Property__Group_4__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4217:2: rule__Property__Group_4__0__Impl rule__Property__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group_4__0__Impl_in_rule__Property__Group_4__08356);
            rule__Property__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group_4__1_in_rule__Property__Group_4__08359);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4224:1: rule__Property__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__Property__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4228:1: ( ( 'description' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4229:1: ( 'description' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4229:1: ( 'description' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4230:1: 'description'
            {
             before(grammarAccess.getPropertyAccess().getDescriptionKeyword_4_0()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__Property__Group_4__0__Impl8387); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4243:1: rule__Property__Group_4__1 : rule__Property__Group_4__1__Impl ;
    public final void rule__Property__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4247:1: ( rule__Property__Group_4__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4248:2: rule__Property__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group_4__1__Impl_in_rule__Property__Group_4__18418);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4254:1: rule__Property__Group_4__1__Impl : ( ( rule__Property__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Property__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4258:1: ( ( ( rule__Property__DescriptionAssignment_4_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4259:1: ( ( rule__Property__DescriptionAssignment_4_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4259:1: ( ( rule__Property__DescriptionAssignment_4_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4260:1: ( rule__Property__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getPropertyAccess().getDescriptionAssignment_4_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4261:1: ( rule__Property__DescriptionAssignment_4_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4261:2: rule__Property__DescriptionAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__DescriptionAssignment_4_1_in_rule__Property__Group_4__1__Impl8445);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4275:1: rule__Property__Group_5__0 : rule__Property__Group_5__0__Impl rule__Property__Group_5__1 ;
    public final void rule__Property__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4279:1: ( rule__Property__Group_5__0__Impl rule__Property__Group_5__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4280:2: rule__Property__Group_5__0__Impl rule__Property__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group_5__0__Impl_in_rule__Property__Group_5__08479);
            rule__Property__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group_5__1_in_rule__Property__Group_5__08482);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4287:1: rule__Property__Group_5__0__Impl : ( 'value' ) ;
    public final void rule__Property__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4291:1: ( ( 'value' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4292:1: ( 'value' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4292:1: ( 'value' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4293:1: 'value'
            {
             before(grammarAccess.getPropertyAccess().getValueKeyword_5_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__Property__Group_5__0__Impl8510); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4306:1: rule__Property__Group_5__1 : rule__Property__Group_5__1__Impl ;
    public final void rule__Property__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4310:1: ( rule__Property__Group_5__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4311:2: rule__Property__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group_5__1__Impl_in_rule__Property__Group_5__18541);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4317:1: rule__Property__Group_5__1__Impl : ( ( rule__Property__ValueAssignment_5_1 ) ) ;
    public final void rule__Property__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4321:1: ( ( ( rule__Property__ValueAssignment_5_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4322:1: ( ( rule__Property__ValueAssignment_5_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4322:1: ( ( rule__Property__ValueAssignment_5_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4323:1: ( rule__Property__ValueAssignment_5_1 )
            {
             before(grammarAccess.getPropertyAccess().getValueAssignment_5_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4324:1: ( rule__Property__ValueAssignment_5_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4324:2: rule__Property__ValueAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__ValueAssignment_5_1_in_rule__Property__Group_5__1__Impl8568);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4338:1: rule__Property__Group_6__0 : rule__Property__Group_6__0__Impl rule__Property__Group_6__1 ;
    public final void rule__Property__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4342:1: ( rule__Property__Group_6__0__Impl rule__Property__Group_6__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4343:2: rule__Property__Group_6__0__Impl rule__Property__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group_6__0__Impl_in_rule__Property__Group_6__08602);
            rule__Property__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Property__Group_6__1_in_rule__Property__Group_6__08605);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4350:1: rule__Property__Group_6__0__Impl : ( 'type' ) ;
    public final void rule__Property__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4354:1: ( ( 'type' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4355:1: ( 'type' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4355:1: ( 'type' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4356:1: 'type'
            {
             before(grammarAccess.getPropertyAccess().getTypeKeyword_6_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Property__Group_6__0__Impl8633); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4369:1: rule__Property__Group_6__1 : rule__Property__Group_6__1__Impl ;
    public final void rule__Property__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4373:1: ( rule__Property__Group_6__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4374:2: rule__Property__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__Group_6__1__Impl_in_rule__Property__Group_6__18664);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4380:1: rule__Property__Group_6__1__Impl : ( ( rule__Property__TypeAssignment_6_1 ) ) ;
    public final void rule__Property__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4384:1: ( ( ( rule__Property__TypeAssignment_6_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4385:1: ( ( rule__Property__TypeAssignment_6_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4385:1: ( ( rule__Property__TypeAssignment_6_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4386:1: ( rule__Property__TypeAssignment_6_1 )
            {
             before(grammarAccess.getPropertyAccess().getTypeAssignment_6_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4387:1: ( rule__Property__TypeAssignment_6_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4387:2: rule__Property__TypeAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Property__TypeAssignment_6_1_in_rule__Property__Group_6__1__Impl8691);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4401:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4405:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4406:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__08725);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__08728);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4413:1: rule__Operation__Group__0__Impl : ( () ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4417:1: ( ( () ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4418:1: ( () )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4418:1: ( () )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4419:1: ()
            {
             before(grammarAccess.getOperationAccess().getOperationAction_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4420:1: ()
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4422:1: 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4432:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4436:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4437:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__18786);
            rule__Operation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__18789);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4444:1: rule__Operation__Group__1__Impl : ( 'Operation' ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4448:1: ( ( 'Operation' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4449:1: ( 'Operation' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4449:1: ( 'Operation' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4450:1: 'Operation'
            {
             before(grammarAccess.getOperationAccess().getOperationKeyword_1()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__Operation__Group__1__Impl8817); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4463:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4467:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4468:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__28848);
            rule__Operation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__28851);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4475:1: rule__Operation__Group__2__Impl : ( ( rule__Operation__NameAssignment_2 ) ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4479:1: ( ( ( rule__Operation__NameAssignment_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4480:1: ( ( rule__Operation__NameAssignment_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4480:1: ( ( rule__Operation__NameAssignment_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4481:1: ( rule__Operation__NameAssignment_2 )
            {
             before(grammarAccess.getOperationAccess().getNameAssignment_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4482:1: ( rule__Operation__NameAssignment_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4482:2: rule__Operation__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__NameAssignment_2_in_rule__Operation__Group__2__Impl8878);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4492:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4496:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4497:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__38908);
            rule__Operation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__38911);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4504:1: rule__Operation__Group__3__Impl : ( '{' ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4508:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4509:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4509:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4510:1: '{'
            {
             before(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Operation__Group__3__Impl8939); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4523:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4527:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4528:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__48970);
            rule__Operation__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__48973);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4535:1: rule__Operation__Group__4__Impl : ( ( rule__Operation__Group_4__0 )? ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4539:1: ( ( ( rule__Operation__Group_4__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4540:1: ( ( rule__Operation__Group_4__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4540:1: ( ( rule__Operation__Group_4__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4541:1: ( rule__Operation__Group_4__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_4()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4542:1: ( rule__Operation__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==48) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4542:2: rule__Operation__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_4__0_in_rule__Operation__Group__4__Impl9000);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4552:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl rule__Operation__Group__6 ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4556:1: ( rule__Operation__Group__5__Impl rule__Operation__Group__6 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4557:2: rule__Operation__Group__5__Impl rule__Operation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__59031);
            rule__Operation__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__6_in_rule__Operation__Group__59034);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4564:1: rule__Operation__Group__5__Impl : ( ( rule__Operation__Group_5__0 )? ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4568:1: ( ( ( rule__Operation__Group_5__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4569:1: ( ( rule__Operation__Group_5__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4569:1: ( ( rule__Operation__Group_5__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4570:1: ( rule__Operation__Group_5__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_5()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4571:1: ( rule__Operation__Group_5__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==49) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4571:2: rule__Operation__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_5__0_in_rule__Operation__Group__5__Impl9061);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4581:1: rule__Operation__Group__6 : rule__Operation__Group__6__Impl ;
    public final void rule__Operation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4585:1: ( rule__Operation__Group__6__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4586:2: rule__Operation__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__6__Impl_in_rule__Operation__Group__69092);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4592:1: rule__Operation__Group__6__Impl : ( '}' ) ;
    public final void rule__Operation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4596:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4597:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4597:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4598:1: '}'
            {
             before(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Operation__Group__6__Impl9120); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4625:1: rule__Operation__Group_4__0 : rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 ;
    public final void rule__Operation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4629:1: ( rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4630:2: rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_4__0__Impl_in_rule__Operation__Group_4__09165);
            rule__Operation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_4__1_in_rule__Operation__Group_4__09168);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4637:1: rule__Operation__Group_4__0__Impl : ( 'documentation' ) ;
    public final void rule__Operation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4641:1: ( ( 'documentation' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4642:1: ( 'documentation' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4642:1: ( 'documentation' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4643:1: 'documentation'
            {
             before(grammarAccess.getOperationAccess().getDocumentationKeyword_4_0()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__Operation__Group_4__0__Impl9196); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4656:1: rule__Operation__Group_4__1 : rule__Operation__Group_4__1__Impl ;
    public final void rule__Operation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4660:1: ( rule__Operation__Group_4__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4661:2: rule__Operation__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_4__1__Impl_in_rule__Operation__Group_4__19227);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4667:1: rule__Operation__Group_4__1__Impl : ( ( rule__Operation__DocumentationAssignment_4_1 ) ) ;
    public final void rule__Operation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4671:1: ( ( ( rule__Operation__DocumentationAssignment_4_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4672:1: ( ( rule__Operation__DocumentationAssignment_4_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4672:1: ( ( rule__Operation__DocumentationAssignment_4_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4673:1: ( rule__Operation__DocumentationAssignment_4_1 )
            {
             before(grammarAccess.getOperationAccess().getDocumentationAssignment_4_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4674:1: ( rule__Operation__DocumentationAssignment_4_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4674:2: rule__Operation__DocumentationAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__DocumentationAssignment_4_1_in_rule__Operation__Group_4__1__Impl9254);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4688:1: rule__Operation__Group_5__0 : rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1 ;
    public final void rule__Operation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4692:1: ( rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4693:2: rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_5__0__Impl_in_rule__Operation__Group_5__09288);
            rule__Operation__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_5__1_in_rule__Operation__Group_5__09291);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4700:1: rule__Operation__Group_5__0__Impl : ( 'returnType' ) ;
    public final void rule__Operation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4704:1: ( ( 'returnType' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4705:1: ( 'returnType' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4705:1: ( 'returnType' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4706:1: 'returnType'
            {
             before(grammarAccess.getOperationAccess().getReturnTypeKeyword_5_0()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__Operation__Group_5__0__Impl9319); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4719:1: rule__Operation__Group_5__1 : rule__Operation__Group_5__1__Impl ;
    public final void rule__Operation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4723:1: ( rule__Operation__Group_5__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4724:2: rule__Operation__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_5__1__Impl_in_rule__Operation__Group_5__19350);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4730:1: rule__Operation__Group_5__1__Impl : ( ( rule__Operation__ReturnTypeAssignment_5_1 ) ) ;
    public final void rule__Operation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4734:1: ( ( ( rule__Operation__ReturnTypeAssignment_5_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4735:1: ( ( rule__Operation__ReturnTypeAssignment_5_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4735:1: ( ( rule__Operation__ReturnTypeAssignment_5_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4736:1: ( rule__Operation__ReturnTypeAssignment_5_1 )
            {
             before(grammarAccess.getOperationAccess().getReturnTypeAssignment_5_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4737:1: ( rule__Operation__ReturnTypeAssignment_5_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4737:2: rule__Operation__ReturnTypeAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__ReturnTypeAssignment_5_1_in_rule__Operation__Group_5__1__Impl9377);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4751:1: rule__EShort__Group__0 : rule__EShort__Group__0__Impl rule__EShort__Group__1 ;
    public final void rule__EShort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4755:1: ( rule__EShort__Group__0__Impl rule__EShort__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4756:2: rule__EShort__Group__0__Impl rule__EShort__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EShort__Group__0__Impl_in_rule__EShort__Group__09411);
            rule__EShort__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EShort__Group__1_in_rule__EShort__Group__09414);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4763:1: rule__EShort__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EShort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4767:1: ( ( ( '-' )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4768:1: ( ( '-' )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4768:1: ( ( '-' )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4769:1: ( '-' )?
            {
             before(grammarAccess.getEShortAccess().getHyphenMinusKeyword_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4770:1: ( '-' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==50) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4771:2: '-'
                    {
                    match(input,50,FollowSets000.FOLLOW_50_in_rule__EShort__Group__0__Impl9443); 

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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4782:1: rule__EShort__Group__1 : rule__EShort__Group__1__Impl ;
    public final void rule__EShort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4786:1: ( rule__EShort__Group__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4787:2: rule__EShort__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EShort__Group__1__Impl_in_rule__EShort__Group__19476);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4793:1: rule__EShort__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EShort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4797:1: ( ( RULE_INT ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4798:1: ( RULE_INT )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4798:1: ( RULE_INT )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4799:1: RULE_INT
            {
             before(grammarAccess.getEShortAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EShort__Group__1__Impl9503); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4814:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4818:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4819:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__09536);
            rule__Activity__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__09539);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4826:1: rule__Activity__Group__0__Impl : ( 'Activity' ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4830:1: ( ( 'Activity' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4831:1: ( 'Activity' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4831:1: ( 'Activity' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4832:1: 'Activity'
            {
             before(grammarAccess.getActivityAccess().getActivityKeyword_0()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__Activity__Group__0__Impl9567); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4845:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4849:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4850:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__19598);
            rule__Activity__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__19601);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4857:1: rule__Activity__Group__1__Impl : ( ( rule__Activity__NameAssignment_1 ) ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4861:1: ( ( ( rule__Activity__NameAssignment_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4862:1: ( ( rule__Activity__NameAssignment_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4862:1: ( ( rule__Activity__NameAssignment_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4863:1: ( rule__Activity__NameAssignment_1 )
            {
             before(grammarAccess.getActivityAccess().getNameAssignment_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4864:1: ( rule__Activity__NameAssignment_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4864:2: rule__Activity__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__NameAssignment_1_in_rule__Activity__Group__1__Impl9628);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4874:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4878:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4879:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__29658);
            rule__Activity__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__29661);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4886:1: rule__Activity__Group__2__Impl : ( '{' ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4890:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4891:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4891:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4892:1: '{'
            {
             before(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Activity__Group__2__Impl9689); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4905:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl rule__Activity__Group__4 ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4909:1: ( rule__Activity__Group__3__Impl rule__Activity__Group__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4910:2: rule__Activity__Group__3__Impl rule__Activity__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__39720);
            rule__Activity__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__39723);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4917:1: rule__Activity__Group__3__Impl : ( 'scheduler' ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4921:1: ( ( 'scheduler' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4922:1: ( 'scheduler' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4922:1: ( 'scheduler' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4923:1: 'scheduler'
            {
             before(grammarAccess.getActivityAccess().getSchedulerKeyword_3()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__Activity__Group__3__Impl9751); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4936:1: rule__Activity__Group__4 : rule__Activity__Group__4__Impl rule__Activity__Group__5 ;
    public final void rule__Activity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4940:1: ( rule__Activity__Group__4__Impl rule__Activity__Group__5 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4941:2: rule__Activity__Group__4__Impl rule__Activity__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__49782);
            rule__Activity__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__49785);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4948:1: rule__Activity__Group__4__Impl : ( ( rule__Activity__SchedulerAssignment_4 ) ) ;
    public final void rule__Activity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4952:1: ( ( ( rule__Activity__SchedulerAssignment_4 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4953:1: ( ( rule__Activity__SchedulerAssignment_4 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4953:1: ( ( rule__Activity__SchedulerAssignment_4 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4954:1: ( rule__Activity__SchedulerAssignment_4 )
            {
             before(grammarAccess.getActivityAccess().getSchedulerAssignment_4()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4955:1: ( rule__Activity__SchedulerAssignment_4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4955:2: rule__Activity__SchedulerAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__SchedulerAssignment_4_in_rule__Activity__Group__4__Impl9812);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4965:1: rule__Activity__Group__5 : rule__Activity__Group__5__Impl rule__Activity__Group__6 ;
    public final void rule__Activity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4969:1: ( rule__Activity__Group__5__Impl rule__Activity__Group__6 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4970:2: rule__Activity__Group__5__Impl rule__Activity__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__59842);
            rule__Activity__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__59845);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4977:1: rule__Activity__Group__5__Impl : ( 'cpuAffinity' ) ;
    public final void rule__Activity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4981:1: ( ( 'cpuAffinity' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4982:1: ( 'cpuAffinity' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4982:1: ( 'cpuAffinity' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4983:1: 'cpuAffinity'
            {
             before(grammarAccess.getActivityAccess().getCpuAffinityKeyword_5()); 
            match(input,53,FollowSets000.FOLLOW_53_in_rule__Activity__Group__5__Impl9873); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:4996:1: rule__Activity__Group__6 : rule__Activity__Group__6__Impl rule__Activity__Group__7 ;
    public final void rule__Activity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5000:1: ( rule__Activity__Group__6__Impl rule__Activity__Group__7 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5001:2: rule__Activity__Group__6__Impl rule__Activity__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__69904);
            rule__Activity__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__69907);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5008:1: rule__Activity__Group__6__Impl : ( ( rule__Activity__CpuAffinityAssignment_6 ) ) ;
    public final void rule__Activity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5012:1: ( ( ( rule__Activity__CpuAffinityAssignment_6 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5013:1: ( ( rule__Activity__CpuAffinityAssignment_6 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5013:1: ( ( rule__Activity__CpuAffinityAssignment_6 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5014:1: ( rule__Activity__CpuAffinityAssignment_6 )
            {
             before(grammarAccess.getActivityAccess().getCpuAffinityAssignment_6()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5015:1: ( rule__Activity__CpuAffinityAssignment_6 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5015:2: rule__Activity__CpuAffinityAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__CpuAffinityAssignment_6_in_rule__Activity__Group__6__Impl9934);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5025:1: rule__Activity__Group__7 : rule__Activity__Group__7__Impl rule__Activity__Group__8 ;
    public final void rule__Activity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5029:1: ( rule__Activity__Group__7__Impl rule__Activity__Group__8 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5030:2: rule__Activity__Group__7__Impl rule__Activity__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__79964);
            rule__Activity__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__8_in_rule__Activity__Group__79967);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5037:1: rule__Activity__Group__7__Impl : ( 'period' ) ;
    public final void rule__Activity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5041:1: ( ( 'period' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5042:1: ( 'period' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5042:1: ( 'period' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5043:1: 'period'
            {
             before(grammarAccess.getActivityAccess().getPeriodKeyword_7()); 
            match(input,54,FollowSets000.FOLLOW_54_in_rule__Activity__Group__7__Impl9995); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5056:1: rule__Activity__Group__8 : rule__Activity__Group__8__Impl rule__Activity__Group__9 ;
    public final void rule__Activity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5060:1: ( rule__Activity__Group__8__Impl rule__Activity__Group__9 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5061:2: rule__Activity__Group__8__Impl rule__Activity__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__8__Impl_in_rule__Activity__Group__810026);
            rule__Activity__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__9_in_rule__Activity__Group__810029);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5068:1: rule__Activity__Group__8__Impl : ( ( rule__Activity__PeriodAssignment_8 ) ) ;
    public final void rule__Activity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5072:1: ( ( ( rule__Activity__PeriodAssignment_8 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5073:1: ( ( rule__Activity__PeriodAssignment_8 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5073:1: ( ( rule__Activity__PeriodAssignment_8 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5074:1: ( rule__Activity__PeriodAssignment_8 )
            {
             before(grammarAccess.getActivityAccess().getPeriodAssignment_8()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5075:1: ( rule__Activity__PeriodAssignment_8 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5075:2: rule__Activity__PeriodAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__PeriodAssignment_8_in_rule__Activity__Group__8__Impl10056);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5085:1: rule__Activity__Group__9 : rule__Activity__Group__9__Impl rule__Activity__Group__10 ;
    public final void rule__Activity__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5089:1: ( rule__Activity__Group__9__Impl rule__Activity__Group__10 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5090:2: rule__Activity__Group__9__Impl rule__Activity__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__9__Impl_in_rule__Activity__Group__910086);
            rule__Activity__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__10_in_rule__Activity__Group__910089);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5097:1: rule__Activity__Group__9__Impl : ( 'priority' ) ;
    public final void rule__Activity__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5101:1: ( ( 'priority' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5102:1: ( 'priority' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5102:1: ( 'priority' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5103:1: 'priority'
            {
             before(grammarAccess.getActivityAccess().getPriorityKeyword_9()); 
            match(input,55,FollowSets000.FOLLOW_55_in_rule__Activity__Group__9__Impl10117); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5116:1: rule__Activity__Group__10 : rule__Activity__Group__10__Impl rule__Activity__Group__11 ;
    public final void rule__Activity__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5120:1: ( rule__Activity__Group__10__Impl rule__Activity__Group__11 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5121:2: rule__Activity__Group__10__Impl rule__Activity__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__10__Impl_in_rule__Activity__Group__1010148);
            rule__Activity__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__11_in_rule__Activity__Group__1010151);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5128:1: rule__Activity__Group__10__Impl : ( ( rule__Activity__PriorityAssignment_10 ) ) ;
    public final void rule__Activity__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5132:1: ( ( ( rule__Activity__PriorityAssignment_10 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5133:1: ( ( rule__Activity__PriorityAssignment_10 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5133:1: ( ( rule__Activity__PriorityAssignment_10 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5134:1: ( rule__Activity__PriorityAssignment_10 )
            {
             before(grammarAccess.getActivityAccess().getPriorityAssignment_10()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5135:1: ( rule__Activity__PriorityAssignment_10 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5135:2: rule__Activity__PriorityAssignment_10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__PriorityAssignment_10_in_rule__Activity__Group__10__Impl10178);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5145:1: rule__Activity__Group__11 : rule__Activity__Group__11__Impl rule__Activity__Group__12 ;
    public final void rule__Activity__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5149:1: ( rule__Activity__Group__11__Impl rule__Activity__Group__12 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5150:2: rule__Activity__Group__11__Impl rule__Activity__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__11__Impl_in_rule__Activity__Group__1110208);
            rule__Activity__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__12_in_rule__Activity__Group__1110211);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5157:1: rule__Activity__Group__11__Impl : ( ( rule__Activity__Group_11__0 )? ) ;
    public final void rule__Activity__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5161:1: ( ( ( rule__Activity__Group_11__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5162:1: ( ( rule__Activity__Group_11__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5162:1: ( ( rule__Activity__Group_11__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5163:1: ( rule__Activity__Group_11__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_11()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5164:1: ( rule__Activity__Group_11__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==56) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5164:2: rule__Activity__Group_11__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_11__0_in_rule__Activity__Group__11__Impl10238);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5174:1: rule__Activity__Group__12 : rule__Activity__Group__12__Impl rule__Activity__Group__13 ;
    public final void rule__Activity__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5178:1: ( rule__Activity__Group__12__Impl rule__Activity__Group__13 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5179:2: rule__Activity__Group__12__Impl rule__Activity__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__12__Impl_in_rule__Activity__Group__1210269);
            rule__Activity__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__13_in_rule__Activity__Group__1210272);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5186:1: rule__Activity__Group__12__Impl : ( ( rule__Activity__Group_12__0 )? ) ;
    public final void rule__Activity__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5190:1: ( ( ( rule__Activity__Group_12__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5191:1: ( ( rule__Activity__Group_12__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5191:1: ( ( rule__Activity__Group_12__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5192:1: ( rule__Activity__Group_12__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_12()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5193:1: ( rule__Activity__Group_12__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==57) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5193:2: rule__Activity__Group_12__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12__0_in_rule__Activity__Group__12__Impl10299);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5203:1: rule__Activity__Group__13 : rule__Activity__Group__13__Impl ;
    public final void rule__Activity__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5207:1: ( rule__Activity__Group__13__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5208:2: rule__Activity__Group__13__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__13__Impl_in_rule__Activity__Group__1310330);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5214:1: rule__Activity__Group__13__Impl : ( '}' ) ;
    public final void rule__Activity__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5218:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5219:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5219:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5220:1: '}'
            {
             before(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_13()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Activity__Group__13__Impl10358); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5261:1: rule__Activity__Group_11__0 : rule__Activity__Group_11__0__Impl rule__Activity__Group_11__1 ;
    public final void rule__Activity__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5265:1: ( rule__Activity__Group_11__0__Impl rule__Activity__Group_11__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5266:2: rule__Activity__Group_11__0__Impl rule__Activity__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_11__0__Impl_in_rule__Activity__Group_11__010417);
            rule__Activity__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_11__1_in_rule__Activity__Group_11__010420);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5273:1: rule__Activity__Group_11__0__Impl : ( 'taskContext' ) ;
    public final void rule__Activity__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5277:1: ( ( 'taskContext' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5278:1: ( 'taskContext' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5278:1: ( 'taskContext' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5279:1: 'taskContext'
            {
             before(grammarAccess.getActivityAccess().getTaskContextKeyword_11_0()); 
            match(input,56,FollowSets000.FOLLOW_56_in_rule__Activity__Group_11__0__Impl10448); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5292:1: rule__Activity__Group_11__1 : rule__Activity__Group_11__1__Impl ;
    public final void rule__Activity__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5296:1: ( rule__Activity__Group_11__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5297:2: rule__Activity__Group_11__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_11__1__Impl_in_rule__Activity__Group_11__110479);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5303:1: rule__Activity__Group_11__1__Impl : ( ( rule__Activity__TaskContextAssignment_11_1 ) ) ;
    public final void rule__Activity__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5307:1: ( ( ( rule__Activity__TaskContextAssignment_11_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5308:1: ( ( rule__Activity__TaskContextAssignment_11_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5308:1: ( ( rule__Activity__TaskContextAssignment_11_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5309:1: ( rule__Activity__TaskContextAssignment_11_1 )
            {
             before(grammarAccess.getActivityAccess().getTaskContextAssignment_11_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5310:1: ( rule__Activity__TaskContextAssignment_11_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5310:2: rule__Activity__TaskContextAssignment_11_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__TaskContextAssignment_11_1_in_rule__Activity__Group_11__1__Impl10506);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5324:1: rule__Activity__Group_12__0 : rule__Activity__Group_12__0__Impl rule__Activity__Group_12__1 ;
    public final void rule__Activity__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5328:1: ( rule__Activity__Group_12__0__Impl rule__Activity__Group_12__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5329:2: rule__Activity__Group_12__0__Impl rule__Activity__Group_12__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12__0__Impl_in_rule__Activity__Group_12__010540);
            rule__Activity__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12__1_in_rule__Activity__Group_12__010543);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5336:1: rule__Activity__Group_12__0__Impl : ( 'slave' ) ;
    public final void rule__Activity__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5340:1: ( ( 'slave' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5341:1: ( 'slave' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5341:1: ( 'slave' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5342:1: 'slave'
            {
             before(grammarAccess.getActivityAccess().getSlaveKeyword_12_0()); 
            match(input,57,FollowSets000.FOLLOW_57_in_rule__Activity__Group_12__0__Impl10571); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5355:1: rule__Activity__Group_12__1 : rule__Activity__Group_12__1__Impl rule__Activity__Group_12__2 ;
    public final void rule__Activity__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5359:1: ( rule__Activity__Group_12__1__Impl rule__Activity__Group_12__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5360:2: rule__Activity__Group_12__1__Impl rule__Activity__Group_12__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12__1__Impl_in_rule__Activity__Group_12__110602);
            rule__Activity__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12__2_in_rule__Activity__Group_12__110605);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5367:1: rule__Activity__Group_12__1__Impl : ( '{' ) ;
    public final void rule__Activity__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5371:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5372:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5372:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5373:1: '{'
            {
             before(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_12_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Activity__Group_12__1__Impl10633); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5386:1: rule__Activity__Group_12__2 : rule__Activity__Group_12__2__Impl rule__Activity__Group_12__3 ;
    public final void rule__Activity__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5390:1: ( rule__Activity__Group_12__2__Impl rule__Activity__Group_12__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5391:2: rule__Activity__Group_12__2__Impl rule__Activity__Group_12__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12__2__Impl_in_rule__Activity__Group_12__210664);
            rule__Activity__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12__3_in_rule__Activity__Group_12__210667);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5398:1: rule__Activity__Group_12__2__Impl : ( ( rule__Activity__SlaveAssignment_12_2 ) ) ;
    public final void rule__Activity__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5402:1: ( ( ( rule__Activity__SlaveAssignment_12_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5403:1: ( ( rule__Activity__SlaveAssignment_12_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5403:1: ( ( rule__Activity__SlaveAssignment_12_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5404:1: ( rule__Activity__SlaveAssignment_12_2 )
            {
             before(grammarAccess.getActivityAccess().getSlaveAssignment_12_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5405:1: ( rule__Activity__SlaveAssignment_12_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5405:2: rule__Activity__SlaveAssignment_12_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__SlaveAssignment_12_2_in_rule__Activity__Group_12__2__Impl10694);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5415:1: rule__Activity__Group_12__3 : rule__Activity__Group_12__3__Impl rule__Activity__Group_12__4 ;
    public final void rule__Activity__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5419:1: ( rule__Activity__Group_12__3__Impl rule__Activity__Group_12__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5420:2: rule__Activity__Group_12__3__Impl rule__Activity__Group_12__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12__3__Impl_in_rule__Activity__Group_12__310724);
            rule__Activity__Group_12__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12__4_in_rule__Activity__Group_12__310727);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5427:1: rule__Activity__Group_12__3__Impl : ( ( rule__Activity__Group_12_3__0 )* ) ;
    public final void rule__Activity__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5431:1: ( ( ( rule__Activity__Group_12_3__0 )* ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5432:1: ( ( rule__Activity__Group_12_3__0 )* )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5432:1: ( ( rule__Activity__Group_12_3__0 )* )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5433:1: ( rule__Activity__Group_12_3__0 )*
            {
             before(grammarAccess.getActivityAccess().getGroup_12_3()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5434:1: ( rule__Activity__Group_12_3__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==24) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5434:2: rule__Activity__Group_12_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12_3__0_in_rule__Activity__Group_12__3__Impl10754);
            	    rule__Activity__Group_12_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5444:1: rule__Activity__Group_12__4 : rule__Activity__Group_12__4__Impl ;
    public final void rule__Activity__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5448:1: ( rule__Activity__Group_12__4__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5449:2: rule__Activity__Group_12__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12__4__Impl_in_rule__Activity__Group_12__410785);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5455:1: rule__Activity__Group_12__4__Impl : ( '}' ) ;
    public final void rule__Activity__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5459:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5460:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5460:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5461:1: '}'
            {
             before(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_12_4()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Activity__Group_12__4__Impl10813); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5484:1: rule__Activity__Group_12_3__0 : rule__Activity__Group_12_3__0__Impl rule__Activity__Group_12_3__1 ;
    public final void rule__Activity__Group_12_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5488:1: ( rule__Activity__Group_12_3__0__Impl rule__Activity__Group_12_3__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5489:2: rule__Activity__Group_12_3__0__Impl rule__Activity__Group_12_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12_3__0__Impl_in_rule__Activity__Group_12_3__010854);
            rule__Activity__Group_12_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12_3__1_in_rule__Activity__Group_12_3__010857);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5496:1: rule__Activity__Group_12_3__0__Impl : ( ',' ) ;
    public final void rule__Activity__Group_12_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5500:1: ( ( ',' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5501:1: ( ',' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5501:1: ( ',' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5502:1: ','
            {
             before(grammarAccess.getActivityAccess().getCommaKeyword_12_3_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Activity__Group_12_3__0__Impl10885); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5515:1: rule__Activity__Group_12_3__1 : rule__Activity__Group_12_3__1__Impl ;
    public final void rule__Activity__Group_12_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5519:1: ( rule__Activity__Group_12_3__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5520:2: rule__Activity__Group_12_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group_12_3__1__Impl_in_rule__Activity__Group_12_3__110916);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5526:1: rule__Activity__Group_12_3__1__Impl : ( ( rule__Activity__SlaveAssignment_12_3_1 ) ) ;
    public final void rule__Activity__Group_12_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5530:1: ( ( ( rule__Activity__SlaveAssignment_12_3_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5531:1: ( ( rule__Activity__SlaveAssignment_12_3_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5531:1: ( ( rule__Activity__SlaveAssignment_12_3_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5532:1: ( rule__Activity__SlaveAssignment_12_3_1 )
            {
             before(grammarAccess.getActivityAccess().getSlaveAssignment_12_3_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5533:1: ( rule__Activity__SlaveAssignment_12_3_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5533:2: rule__Activity__SlaveAssignment_12_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__SlaveAssignment_12_3_1_in_rule__Activity__Group_12_3__1__Impl10943);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5547:1: rule__Slave__Group__0 : rule__Slave__Group__0__Impl rule__Slave__Group__1 ;
    public final void rule__Slave__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5551:1: ( rule__Slave__Group__0__Impl rule__Slave__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5552:2: rule__Slave__Group__0__Impl rule__Slave__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group__0__Impl_in_rule__Slave__Group__010977);
            rule__Slave__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group__1_in_rule__Slave__Group__010980);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5559:1: rule__Slave__Group__0__Impl : ( () ) ;
    public final void rule__Slave__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5563:1: ( ( () ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5564:1: ( () )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5564:1: ( () )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5565:1: ()
            {
             before(grammarAccess.getSlaveAccess().getSlaveAction_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5566:1: ()
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5568:1: 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5578:1: rule__Slave__Group__1 : rule__Slave__Group__1__Impl rule__Slave__Group__2 ;
    public final void rule__Slave__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5582:1: ( rule__Slave__Group__1__Impl rule__Slave__Group__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5583:2: rule__Slave__Group__1__Impl rule__Slave__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group__1__Impl_in_rule__Slave__Group__111038);
            rule__Slave__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group__2_in_rule__Slave__Group__111041);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5590:1: rule__Slave__Group__1__Impl : ( 'Slave' ) ;
    public final void rule__Slave__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5594:1: ( ( 'Slave' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5595:1: ( 'Slave' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5595:1: ( 'Slave' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5596:1: 'Slave'
            {
             before(grammarAccess.getSlaveAccess().getSlaveKeyword_1()); 
            match(input,58,FollowSets000.FOLLOW_58_in_rule__Slave__Group__1__Impl11069); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5609:1: rule__Slave__Group__2 : rule__Slave__Group__2__Impl rule__Slave__Group__3 ;
    public final void rule__Slave__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5613:1: ( rule__Slave__Group__2__Impl rule__Slave__Group__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5614:2: rule__Slave__Group__2__Impl rule__Slave__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group__2__Impl_in_rule__Slave__Group__211100);
            rule__Slave__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group__3_in_rule__Slave__Group__211103);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5621:1: rule__Slave__Group__2__Impl : ( ( rule__Slave__NameAssignment_2 ) ) ;
    public final void rule__Slave__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5625:1: ( ( ( rule__Slave__NameAssignment_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5626:1: ( ( rule__Slave__NameAssignment_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5626:1: ( ( rule__Slave__NameAssignment_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5627:1: ( rule__Slave__NameAssignment_2 )
            {
             before(grammarAccess.getSlaveAccess().getNameAssignment_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5628:1: ( rule__Slave__NameAssignment_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5628:2: rule__Slave__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slave__NameAssignment_2_in_rule__Slave__Group__2__Impl11130);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5638:1: rule__Slave__Group__3 : rule__Slave__Group__3__Impl rule__Slave__Group__4 ;
    public final void rule__Slave__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5642:1: ( rule__Slave__Group__3__Impl rule__Slave__Group__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5643:2: rule__Slave__Group__3__Impl rule__Slave__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group__3__Impl_in_rule__Slave__Group__311160);
            rule__Slave__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group__4_in_rule__Slave__Group__311163);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5650:1: rule__Slave__Group__3__Impl : ( '{' ) ;
    public final void rule__Slave__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5654:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5655:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5655:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5656:1: '{'
            {
             before(grammarAccess.getSlaveAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Slave__Group__3__Impl11191); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5669:1: rule__Slave__Group__4 : rule__Slave__Group__4__Impl rule__Slave__Group__5 ;
    public final void rule__Slave__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5673:1: ( rule__Slave__Group__4__Impl rule__Slave__Group__5 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5674:2: rule__Slave__Group__4__Impl rule__Slave__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group__4__Impl_in_rule__Slave__Group__411222);
            rule__Slave__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group__5_in_rule__Slave__Group__411225);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5681:1: rule__Slave__Group__4__Impl : ( ( rule__Slave__Group_4__0 )? ) ;
    public final void rule__Slave__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5685:1: ( ( ( rule__Slave__Group_4__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5686:1: ( ( rule__Slave__Group_4__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5686:1: ( ( rule__Slave__Group_4__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5687:1: ( rule__Slave__Group_4__0 )?
            {
             before(grammarAccess.getSlaveAccess().getGroup_4()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5688:1: ( rule__Slave__Group_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==56) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5688:2: rule__Slave__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Slave__Group_4__0_in_rule__Slave__Group__4__Impl11252);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5698:1: rule__Slave__Group__5 : rule__Slave__Group__5__Impl ;
    public final void rule__Slave__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5702:1: ( rule__Slave__Group__5__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5703:2: rule__Slave__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group__5__Impl_in_rule__Slave__Group__511283);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5709:1: rule__Slave__Group__5__Impl : ( '}' ) ;
    public final void rule__Slave__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5713:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5714:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5714:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5715:1: '}'
            {
             before(grammarAccess.getSlaveAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Slave__Group__5__Impl11311); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5740:1: rule__Slave__Group_4__0 : rule__Slave__Group_4__0__Impl rule__Slave__Group_4__1 ;
    public final void rule__Slave__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5744:1: ( rule__Slave__Group_4__0__Impl rule__Slave__Group_4__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5745:2: rule__Slave__Group_4__0__Impl rule__Slave__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group_4__0__Impl_in_rule__Slave__Group_4__011354);
            rule__Slave__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group_4__1_in_rule__Slave__Group_4__011357);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5752:1: rule__Slave__Group_4__0__Impl : ( 'taskContext' ) ;
    public final void rule__Slave__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5756:1: ( ( 'taskContext' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5757:1: ( 'taskContext' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5757:1: ( 'taskContext' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5758:1: 'taskContext'
            {
             before(grammarAccess.getSlaveAccess().getTaskContextKeyword_4_0()); 
            match(input,56,FollowSets000.FOLLOW_56_in_rule__Slave__Group_4__0__Impl11385); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5771:1: rule__Slave__Group_4__1 : rule__Slave__Group_4__1__Impl ;
    public final void rule__Slave__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5775:1: ( rule__Slave__Group_4__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5776:2: rule__Slave__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slave__Group_4__1__Impl_in_rule__Slave__Group_4__111416);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5782:1: rule__Slave__Group_4__1__Impl : ( ( rule__Slave__TaskContextAssignment_4_1 ) ) ;
    public final void rule__Slave__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5786:1: ( ( ( rule__Slave__TaskContextAssignment_4_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5787:1: ( ( rule__Slave__TaskContextAssignment_4_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5787:1: ( ( rule__Slave__TaskContextAssignment_4_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5788:1: ( rule__Slave__TaskContextAssignment_4_1 )
            {
             before(grammarAccess.getSlaveAccess().getTaskContextAssignment_4_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5789:1: ( rule__Slave__TaskContextAssignment_4_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5789:2: rule__Slave__TaskContextAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slave__TaskContextAssignment_4_1_in_rule__Slave__Group_4__1__Impl11443);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5803:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5807:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5808:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__0__Impl_in_rule__EFloat__Group__011477);
            rule__EFloat__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__1_in_rule__EFloat__Group__011480);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5815:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5819:1: ( ( ( '-' )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5820:1: ( ( '-' )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5820:1: ( ( '-' )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5821:1: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5822:1: ( '-' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==50) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5823:2: '-'
                    {
                    match(input,50,FollowSets000.FOLLOW_50_in_rule__EFloat__Group__0__Impl11509); 

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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5834:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5838:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5839:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__1__Impl_in_rule__EFloat__Group__111542);
            rule__EFloat__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__2_in_rule__EFloat__Group__111545);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5846:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5850:1: ( ( ( RULE_INT )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5851:1: ( ( RULE_INT )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5851:1: ( ( RULE_INT )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5852:1: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5853:1: ( RULE_INT )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_INT) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5853:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EFloat__Group__1__Impl11573); 

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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5863:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5867:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5868:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__2__Impl_in_rule__EFloat__Group__211604);
            rule__EFloat__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__3_in_rule__EFloat__Group__211607);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5875:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5879:1: ( ( '.' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5880:1: ( '.' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5880:1: ( '.' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5881:1: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            match(input,59,FollowSets000.FOLLOW_59_in_rule__EFloat__Group__2__Impl11635); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5894:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5898:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5899:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__3__Impl_in_rule__EFloat__Group__311666);
            rule__EFloat__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__4_in_rule__EFloat__Group__311669);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5906:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5910:1: ( ( RULE_INT ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5911:1: ( RULE_INT )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5911:1: ( RULE_INT )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5912:1: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EFloat__Group__3__Impl11696); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5923:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5927:1: ( rule__EFloat__Group__4__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5928:2: rule__EFloat__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group__4__Impl_in_rule__EFloat__Group__411725);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5934:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5938:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5939:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5939:1: ( ( rule__EFloat__Group_4__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5940:1: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5941:1: ( rule__EFloat__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=11 && LA39_0<=12)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5941:2: rule__EFloat__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__0_in_rule__EFloat__Group__4__Impl11752);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5961:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5965:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5966:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__0__Impl_in_rule__EFloat__Group_4__011793);
            rule__EFloat__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__1_in_rule__EFloat__Group_4__011796);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5973:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5977:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5978:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5978:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5979:1: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5980:1: ( rule__EFloat__Alternatives_4_0 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5980:2: rule__EFloat__Alternatives_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Alternatives_4_0_in_rule__EFloat__Group_4__0__Impl11823);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5990:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5994:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:5995:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__1__Impl_in_rule__EFloat__Group_4__111853);
            rule__EFloat__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__2_in_rule__EFloat__Group_4__111856);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6002:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6006:1: ( ( ( '-' )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6007:1: ( ( '-' )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6007:1: ( ( '-' )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6008:1: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6009:1: ( '-' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==50) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6010:2: '-'
                    {
                    match(input,50,FollowSets000.FOLLOW_50_in_rule__EFloat__Group_4__1__Impl11885); 

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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6021:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6025:1: ( rule__EFloat__Group_4__2__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6026:2: rule__EFloat__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloat__Group_4__2__Impl_in_rule__EFloat__Group_4__211918);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6032:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6036:1: ( ( RULE_INT ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6037:1: ( RULE_INT )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6037:1: ( RULE_INT )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6038:1: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EFloat__Group_4__2__Impl11945); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6055:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6059:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6060:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__011980);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__011983);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6067:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6071:1: ( ( ( '-' )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6072:1: ( ( '-' )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6072:1: ( ( '-' )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6073:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6074:1: ( '-' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==50) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6075:2: '-'
                    {
                    match(input,50,FollowSets000.FOLLOW_50_in_rule__EInt__Group__0__Impl12012); 

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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6086:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6090:1: ( rule__EInt__Group__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6091:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__112045);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6097:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6101:1: ( ( RULE_INT ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6102:1: ( RULE_INT )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6102:1: ( RULE_INT )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6103:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl12072); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6118:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6122:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6123:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__012105);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__012108);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6130:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6134:1: ( ( RULE_ID ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6135:1: ( RULE_ID )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6135:1: ( RULE_ID )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6136:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl12135); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6147:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6151:1: ( rule__QualifiedName__Group__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6152:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__112164);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6158:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6162:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6163:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6163:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6164:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6165:1: ( rule__QualifiedName__Group_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==60) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6165:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl12191);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6179:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6183:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6184:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__012226);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__012229);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6191:1: rule__QualifiedName__Group_1__0__Impl : ( '::' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6195:1: ( ( '::' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6196:1: ( '::' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6196:1: ( '::' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6197:1: '::'
            {
             before(grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0()); 
            match(input,60,FollowSets000.FOLLOW_60_in_rule__QualifiedName__Group_1__0__Impl12257); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6210:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6214:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6215:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__112288);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6221:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6225:1: ( ( RULE_ID ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6226:1: ( RULE_ID )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6226:1: ( RULE_ID )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6227:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl12315); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6242:1: rule__QualifiedNameWithDot__Group__0 : rule__QualifiedNameWithDot__Group__0__Impl rule__QualifiedNameWithDot__Group__1 ;
    public final void rule__QualifiedNameWithDot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6246:1: ( rule__QualifiedNameWithDot__Group__0__Impl rule__QualifiedNameWithDot__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6247:2: rule__QualifiedNameWithDot__Group__0__Impl rule__QualifiedNameWithDot__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedNameWithDot__Group__0__Impl_in_rule__QualifiedNameWithDot__Group__012348);
            rule__QualifiedNameWithDot__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QualifiedNameWithDot__Group__1_in_rule__QualifiedNameWithDot__Group__012351);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6254:1: rule__QualifiedNameWithDot__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithDot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6258:1: ( ( ruleQualifiedName ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6259:1: ( ruleQualifiedName )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6259:1: ( ruleQualifiedName )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6260:1: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithDotAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithDot__Group__0__Impl12378);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6271:1: rule__QualifiedNameWithDot__Group__1 : rule__QualifiedNameWithDot__Group__1__Impl ;
    public final void rule__QualifiedNameWithDot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6275:1: ( rule__QualifiedNameWithDot__Group__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6276:2: rule__QualifiedNameWithDot__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedNameWithDot__Group__1__Impl_in_rule__QualifiedNameWithDot__Group__112407);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6282:1: rule__QualifiedNameWithDot__Group__1__Impl : ( ( rule__QualifiedNameWithDot__Group_1__0 )* ) ;
    public final void rule__QualifiedNameWithDot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6286:1: ( ( ( rule__QualifiedNameWithDot__Group_1__0 )* ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6287:1: ( ( rule__QualifiedNameWithDot__Group_1__0 )* )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6287:1: ( ( rule__QualifiedNameWithDot__Group_1__0 )* )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6288:1: ( rule__QualifiedNameWithDot__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameWithDotAccess().getGroup_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6289:1: ( rule__QualifiedNameWithDot__Group_1__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==59) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6289:2: rule__QualifiedNameWithDot__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QualifiedNameWithDot__Group_1__0_in_rule__QualifiedNameWithDot__Group__1__Impl12434);
            	    rule__QualifiedNameWithDot__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6303:1: rule__QualifiedNameWithDot__Group_1__0 : rule__QualifiedNameWithDot__Group_1__0__Impl rule__QualifiedNameWithDot__Group_1__1 ;
    public final void rule__QualifiedNameWithDot__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6307:1: ( rule__QualifiedNameWithDot__Group_1__0__Impl rule__QualifiedNameWithDot__Group_1__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6308:2: rule__QualifiedNameWithDot__Group_1__0__Impl rule__QualifiedNameWithDot__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedNameWithDot__Group_1__0__Impl_in_rule__QualifiedNameWithDot__Group_1__012469);
            rule__QualifiedNameWithDot__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QualifiedNameWithDot__Group_1__1_in_rule__QualifiedNameWithDot__Group_1__012472);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6315:1: rule__QualifiedNameWithDot__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithDot__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6319:1: ( ( '.' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6320:1: ( '.' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6320:1: ( '.' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6321:1: '.'
            {
             before(grammarAccess.getQualifiedNameWithDotAccess().getFullStopKeyword_1_0()); 
            match(input,59,FollowSets000.FOLLOW_59_in_rule__QualifiedNameWithDot__Group_1__0__Impl12500); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6334:1: rule__QualifiedNameWithDot__Group_1__1 : rule__QualifiedNameWithDot__Group_1__1__Impl ;
    public final void rule__QualifiedNameWithDot__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6338:1: ( rule__QualifiedNameWithDot__Group_1__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6339:2: rule__QualifiedNameWithDot__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedNameWithDot__Group_1__1__Impl_in_rule__QualifiedNameWithDot__Group_1__112531);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6345:1: rule__QualifiedNameWithDot__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedNameWithDot__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6349:1: ( ( RULE_ID ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6350:1: ( RULE_ID )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6350:1: ( RULE_ID )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6351:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameWithDotAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QualifiedNameWithDot__Group_1__1__Impl12558); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6367:1: rule__Package__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Package__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6371:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6372:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6372:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6373:1: ruleEString
            {
             before(grammarAccess.getPackageAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Package__NameAssignment_212596);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6382:1: rule__Package__TaskContextsAssignment_4_2 : ( ruleTaskContext ) ;
    public final void rule__Package__TaskContextsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6386:1: ( ( ruleTaskContext ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6387:1: ( ruleTaskContext )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6387:1: ( ruleTaskContext )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6388:1: ruleTaskContext
            {
             before(grammarAccess.getPackageAccess().getTaskContextsTaskContextParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTaskContext_in_rule__Package__TaskContextsAssignment_4_212627);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6397:1: rule__Package__TaskContextsAssignment_4_3_1 : ( ruleTaskContext ) ;
    public final void rule__Package__TaskContextsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6401:1: ( ( ruleTaskContext ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6402:1: ( ruleTaskContext )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6402:1: ( ruleTaskContext )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6403:1: ruleTaskContext
            {
             before(grammarAccess.getPackageAccess().getTaskContextsTaskContextParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTaskContext_in_rule__Package__TaskContextsAssignment_4_3_112658);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6412:1: rule__Package__ConnectionPoliciesAssignment_5_2 : ( ruleConnectionPolicy ) ;
    public final void rule__Package__ConnectionPoliciesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6416:1: ( ( ruleConnectionPolicy ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6417:1: ( ruleConnectionPolicy )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6417:1: ( ruleConnectionPolicy )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6418:1: ruleConnectionPolicy
            {
             before(grammarAccess.getPackageAccess().getConnectionPoliciesConnectionPolicyParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConnectionPolicy_in_rule__Package__ConnectionPoliciesAssignment_5_212689);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6427:1: rule__Package__ConnectionPoliciesAssignment_5_3_1 : ( ruleConnectionPolicy ) ;
    public final void rule__Package__ConnectionPoliciesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6431:1: ( ( ruleConnectionPolicy ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6432:1: ( ruleConnectionPolicy )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6432:1: ( ruleConnectionPolicy )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6433:1: ruleConnectionPolicy
            {
             before(grammarAccess.getPackageAccess().getConnectionPoliciesConnectionPolicyParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConnectionPolicy_in_rule__Package__ConnectionPoliciesAssignment_5_3_112720);
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


    // $ANTLR start "rule__Package__ActivitiesAssignment_6_1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6442:1: rule__Package__ActivitiesAssignment_6_1 : ( ruleIActivity ) ;
    public final void rule__Package__ActivitiesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6446:1: ( ( ruleIActivity ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6447:1: ( ruleIActivity )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6447:1: ( ruleIActivity )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6448:1: ruleIActivity
            {
             before(grammarAccess.getPackageAccess().getActivitiesIActivityParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIActivity_in_rule__Package__ActivitiesAssignment_6_112751);
            ruleIActivity();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getActivitiesIActivityParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__ActivitiesAssignment_6_1"


    // $ANTLR start "rule__TaskContext__NameAssignment_1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6457:1: rule__TaskContext__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TaskContext__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6461:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6462:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6462:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6463:1: ruleEString
            {
             before(grammarAccess.getTaskContextAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TaskContext__NameAssignment_112782);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6472:1: rule__TaskContext__NamespaceAssignment_4 : ( ruleQualifiedNameWithDot ) ;
    public final void rule__TaskContext__NamespaceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6476:1: ( ( ruleQualifiedNameWithDot ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6477:1: ( ruleQualifiedNameWithDot )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6477:1: ( ruleQualifiedNameWithDot )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6478:1: ruleQualifiedNameWithDot
            {
             before(grammarAccess.getTaskContextAccess().getNamespaceQualifiedNameWithDotParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_rule__TaskContext__NamespaceAssignment_412813);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6487:1: rule__TaskContext__TypeAssignment_6 : ( ruleQualifiedNameWithDot ) ;
    public final void rule__TaskContext__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6491:1: ( ( ruleQualifiedNameWithDot ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6492:1: ( ruleQualifiedNameWithDot )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6492:1: ( ruleQualifiedNameWithDot )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6493:1: ruleQualifiedNameWithDot
            {
             before(grammarAccess.getTaskContextAccess().getTypeQualifiedNameWithDotParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_rule__TaskContext__TypeAssignment_612844);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6502:1: rule__TaskContext__InputPortsAssignment_7_2 : ( ruleInputPort ) ;
    public final void rule__TaskContext__InputPortsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6506:1: ( ( ruleInputPort ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6507:1: ( ruleInputPort )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6507:1: ( ruleInputPort )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6508:1: ruleInputPort
            {
             before(grammarAccess.getTaskContextAccess().getInputPortsInputPortParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputPort_in_rule__TaskContext__InputPortsAssignment_7_212875);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6517:1: rule__TaskContext__InputPortsAssignment_7_3_1 : ( ruleInputPort ) ;
    public final void rule__TaskContext__InputPortsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6521:1: ( ( ruleInputPort ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6522:1: ( ruleInputPort )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6522:1: ( ruleInputPort )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6523:1: ruleInputPort
            {
             before(grammarAccess.getTaskContextAccess().getInputPortsInputPortParserRuleCall_7_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputPort_in_rule__TaskContext__InputPortsAssignment_7_3_112906);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6532:1: rule__TaskContext__OutputPortsAssignment_8_2 : ( ruleOutputPort ) ;
    public final void rule__TaskContext__OutputPortsAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6536:1: ( ( ruleOutputPort ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6537:1: ( ruleOutputPort )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6537:1: ( ruleOutputPort )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6538:1: ruleOutputPort
            {
             before(grammarAccess.getTaskContextAccess().getOutputPortsOutputPortParserRuleCall_8_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOutputPort_in_rule__TaskContext__OutputPortsAssignment_8_212937);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6547:1: rule__TaskContext__OutputPortsAssignment_8_3_1 : ( ruleOutputPort ) ;
    public final void rule__TaskContext__OutputPortsAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6551:1: ( ( ruleOutputPort ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6552:1: ( ruleOutputPort )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6552:1: ( ruleOutputPort )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6553:1: ruleOutputPort
            {
             before(grammarAccess.getTaskContextAccess().getOutputPortsOutputPortParserRuleCall_8_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOutputPort_in_rule__TaskContext__OutputPortsAssignment_8_3_112968);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6562:1: rule__TaskContext__PropertiesAssignment_9_2 : ( ruleProperty ) ;
    public final void rule__TaskContext__PropertiesAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6566:1: ( ( ruleProperty ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6567:1: ( ruleProperty )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6567:1: ( ruleProperty )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6568:1: ruleProperty
            {
             before(grammarAccess.getTaskContextAccess().getPropertiesPropertyParserRuleCall_9_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_rule__TaskContext__PropertiesAssignment_9_212999);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6577:1: rule__TaskContext__PropertiesAssignment_9_3_1 : ( ruleProperty ) ;
    public final void rule__TaskContext__PropertiesAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6581:1: ( ( ruleProperty ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6582:1: ( ruleProperty )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6582:1: ( ruleProperty )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6583:1: ruleProperty
            {
             before(grammarAccess.getTaskContextAccess().getPropertiesPropertyParserRuleCall_9_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_rule__TaskContext__PropertiesAssignment_9_3_113030);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6592:1: rule__TaskContext__OperationsAssignment_10_2 : ( ruleOperation ) ;
    public final void rule__TaskContext__OperationsAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6596:1: ( ( ruleOperation ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6597:1: ( ruleOperation )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6597:1: ( ruleOperation )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6598:1: ruleOperation
            {
             before(grammarAccess.getTaskContextAccess().getOperationsOperationParserRuleCall_10_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_rule__TaskContext__OperationsAssignment_10_213061);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6607:1: rule__TaskContext__OperationsAssignment_10_3_1 : ( ruleOperation ) ;
    public final void rule__TaskContext__OperationsAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6611:1: ( ( ruleOperation ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6612:1: ( ruleOperation )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6612:1: ( ruleOperation )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6613:1: ruleOperation
            {
             before(grammarAccess.getTaskContextAccess().getOperationsOperationParserRuleCall_10_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_rule__TaskContext__OperationsAssignment_10_3_113092);
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


    // $ANTLR start "rule__ConnectionPolicy__NameAssignment_1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6622:1: rule__ConnectionPolicy__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ConnectionPolicy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6626:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6627:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6627:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6628:1: ruleEString
            {
             before(grammarAccess.getConnectionPolicyAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ConnectionPolicy__NameAssignment_113123);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6637:1: rule__ConnectionPolicy__BufferSizeAssignment_3_1 : ( ruleEShort ) ;
    public final void rule__ConnectionPolicy__BufferSizeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6641:1: ( ( ruleEShort ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6642:1: ( ruleEShort )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6642:1: ( ruleEShort )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6643:1: ruleEShort
            {
             before(grammarAccess.getConnectionPolicyAccess().getBufferSizeEShortParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEShort_in_rule__ConnectionPolicy__BufferSizeAssignment_3_113154);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6652:1: rule__ConnectionPolicy__LockPolicyAssignment_4_1 : ( ruleConnectionPolicyLockPolicy ) ;
    public final void rule__ConnectionPolicy__LockPolicyAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6656:1: ( ( ruleConnectionPolicyLockPolicy ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6657:1: ( ruleConnectionPolicyLockPolicy )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6657:1: ( ruleConnectionPolicyLockPolicy )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6658:1: ruleConnectionPolicyLockPolicy
            {
             before(grammarAccess.getConnectionPolicyAccess().getLockPolicyConnectionPolicyLockPolicyEnumRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConnectionPolicyLockPolicy_in_rule__ConnectionPolicy__LockPolicyAssignment_4_113185);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6667:1: rule__ConnectionPolicy__TypeAssignment_5_1 : ( ruleConnectionPolicyType ) ;
    public final void rule__ConnectionPolicy__TypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6671:1: ( ( ruleConnectionPolicyType ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6672:1: ( ruleConnectionPolicyType )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6672:1: ( ruleConnectionPolicyType )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6673:1: ruleConnectionPolicyType
            {
             before(grammarAccess.getConnectionPolicyAccess().getTypeConnectionPolicyTypeEnumRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConnectionPolicyType_in_rule__ConnectionPolicy__TypeAssignment_5_113216);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6682:1: rule__ConnectionPolicy__InputPortAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__ConnectionPolicy__InputPortAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6686:1: ( ( ( ruleEString ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6687:1: ( ( ruleEString ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6687:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6688:1: ( ruleEString )
            {
             before(grammarAccess.getConnectionPolicyAccess().getInputPortInputPortCrossReference_7_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6689:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6690:1: ruleEString
            {
             before(grammarAccess.getConnectionPolicyAccess().getInputPortInputPortEStringParserRuleCall_7_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ConnectionPolicy__InputPortAssignment_713251);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6701:1: rule__ConnectionPolicy__OutputPortAssignment_9 : ( ( ruleEString ) ) ;
    public final void rule__ConnectionPolicy__OutputPortAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6705:1: ( ( ( ruleEString ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6706:1: ( ( ruleEString ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6706:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6707:1: ( ruleEString )
            {
             before(grammarAccess.getConnectionPolicyAccess().getOutputPortOutputPortCrossReference_9_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6708:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6709:1: ruleEString
            {
             before(grammarAccess.getConnectionPolicyAccess().getOutputPortOutputPortEStringParserRuleCall_9_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ConnectionPolicy__OutputPortAssignment_913290);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6720:1: rule__InputPort__IsEventPortAssignment_0 : ( ( 'isEventPort' ) ) ;
    public final void rule__InputPort__IsEventPortAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6724:1: ( ( ( 'isEventPort' ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6725:1: ( ( 'isEventPort' ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6725:1: ( ( 'isEventPort' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6726:1: ( 'isEventPort' )
            {
             before(grammarAccess.getInputPortAccess().getIsEventPortIsEventPortKeyword_0_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6727:1: ( 'isEventPort' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6728:1: 'isEventPort'
            {
             before(grammarAccess.getInputPortAccess().getIsEventPortIsEventPortKeyword_0_0()); 
            match(input,61,FollowSets000.FOLLOW_61_in_rule__InputPort__IsEventPortAssignment_013330); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6743:1: rule__InputPort__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__InputPort__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6747:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6748:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6748:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6749:1: ruleEString
            {
             before(grammarAccess.getInputPortAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputPort__NameAssignment_213369);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6758:1: rule__InputPort__DataTypeAssignment_4_1 : ( ( ruleQualifiedNameWithDot ) ) ;
    public final void rule__InputPort__DataTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6762:1: ( ( ( ruleQualifiedNameWithDot ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6763:1: ( ( ruleQualifiedNameWithDot ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6763:1: ( ( ruleQualifiedNameWithDot ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6764:1: ( ruleQualifiedNameWithDot )
            {
             before(grammarAccess.getInputPortAccess().getDataTypeDataTypeCrossReference_4_1_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6765:1: ( ruleQualifiedNameWithDot )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6766:1: ruleQualifiedNameWithDot
            {
             before(grammarAccess.getInputPortAccess().getDataTypeDataTypeQualifiedNameWithDotParserRuleCall_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_rule__InputPort__DataTypeAssignment_4_113404);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6777:1: rule__InputPort__InputConnectionPolicyAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__InputPort__InputConnectionPolicyAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6781:1: ( ( ( ruleEString ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6782:1: ( ( ruleEString ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6782:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6783:1: ( ruleEString )
            {
             before(grammarAccess.getInputPortAccess().getInputConnectionPolicyConnectionPolicyCrossReference_5_1_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6784:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6785:1: ruleEString
            {
             before(grammarAccess.getInputPortAccess().getInputConnectionPolicyConnectionPolicyEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputPort__InputConnectionPolicyAssignment_5_113443);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6796:1: rule__OutputPort__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__OutputPort__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6800:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6801:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6801:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6802:1: ruleEString
            {
             before(grammarAccess.getOutputPortAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OutputPort__NameAssignment_113478);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6811:1: rule__OutputPort__DataTypeAssignment_3_1 : ( ( ruleQualifiedNameWithDot ) ) ;
    public final void rule__OutputPort__DataTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6815:1: ( ( ( ruleQualifiedNameWithDot ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6816:1: ( ( ruleQualifiedNameWithDot ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6816:1: ( ( ruleQualifiedNameWithDot ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6817:1: ( ruleQualifiedNameWithDot )
            {
             before(grammarAccess.getOutputPortAccess().getDataTypeDataTypeCrossReference_3_1_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6818:1: ( ruleQualifiedNameWithDot )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6819:1: ruleQualifiedNameWithDot
            {
             before(grammarAccess.getOutputPortAccess().getDataTypeDataTypeQualifiedNameWithDotParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_rule__OutputPort__DataTypeAssignment_3_113513);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6830:1: rule__OutputPort__OutputConnectionPolicyAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__OutputPort__OutputConnectionPolicyAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6834:1: ( ( ( ruleEString ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6835:1: ( ( ruleEString ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6835:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6836:1: ( ruleEString )
            {
             before(grammarAccess.getOutputPortAccess().getOutputConnectionPolicyConnectionPolicyCrossReference_4_1_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6837:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6838:1: ruleEString
            {
             before(grammarAccess.getOutputPortAccess().getOutputConnectionPolicyConnectionPolicyEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OutputPort__OutputConnectionPolicyAssignment_4_113552);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6849:1: rule__Property__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Property__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6853:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6854:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6854:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6855:1: ruleEString
            {
             before(grammarAccess.getPropertyAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Property__NameAssignment_213587);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6864:1: rule__Property__DescriptionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Property__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6868:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6869:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6869:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6870:1: ruleEString
            {
             before(grammarAccess.getPropertyAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Property__DescriptionAssignment_4_113618);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6879:1: rule__Property__ValueAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Property__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6883:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6884:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6884:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6885:1: ruleEString
            {
             before(grammarAccess.getPropertyAccess().getValueEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Property__ValueAssignment_5_113649);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6894:1: rule__Property__TypeAssignment_6_1 : ( ( ruleQualifiedNameWithDot ) ) ;
    public final void rule__Property__TypeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6898:1: ( ( ( ruleQualifiedNameWithDot ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6899:1: ( ( ruleQualifiedNameWithDot ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6899:1: ( ( ruleQualifiedNameWithDot ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6900:1: ( ruleQualifiedNameWithDot )
            {
             before(grammarAccess.getPropertyAccess().getTypeDataTypeCrossReference_6_1_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6901:1: ( ruleQualifiedNameWithDot )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6902:1: ruleQualifiedNameWithDot
            {
             before(grammarAccess.getPropertyAccess().getTypeDataTypeQualifiedNameWithDotParserRuleCall_6_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_rule__Property__TypeAssignment_6_113684);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6913:1: rule__Operation__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Operation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6917:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6918:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6918:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6919:1: ruleEString
            {
             before(grammarAccess.getOperationAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Operation__NameAssignment_213719);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6928:1: rule__Operation__DocumentationAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Operation__DocumentationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6932:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6933:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6933:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6934:1: ruleEString
            {
             before(grammarAccess.getOperationAccess().getDocumentationEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Operation__DocumentationAssignment_4_113750);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6943:1: rule__Operation__ReturnTypeAssignment_5_1 : ( ( ruleQualifiedNameWithDot ) ) ;
    public final void rule__Operation__ReturnTypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6947:1: ( ( ( ruleQualifiedNameWithDot ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6948:1: ( ( ruleQualifiedNameWithDot ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6948:1: ( ( ruleQualifiedNameWithDot ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6949:1: ( ruleQualifiedNameWithDot )
            {
             before(grammarAccess.getOperationAccess().getReturnTypeDataTypeCrossReference_5_1_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6950:1: ( ruleQualifiedNameWithDot )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6951:1: ruleQualifiedNameWithDot
            {
             before(grammarAccess.getOperationAccess().getReturnTypeDataTypeQualifiedNameWithDotParserRuleCall_5_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithDot_in_rule__Operation__ReturnTypeAssignment_5_113785);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6962:1: rule__Activity__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Activity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6966:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6967:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6967:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6968:1: ruleEString
            {
             before(grammarAccess.getActivityAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Activity__NameAssignment_113820);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6977:1: rule__Activity__SchedulerAssignment_4 : ( ruleScheduler ) ;
    public final void rule__Activity__SchedulerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6981:1: ( ( ruleScheduler ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6982:1: ( ruleScheduler )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6982:1: ( ruleScheduler )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6983:1: ruleScheduler
            {
             before(grammarAccess.getActivityAccess().getSchedulerSchedulerEnumRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleScheduler_in_rule__Activity__SchedulerAssignment_413851);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6992:1: rule__Activity__CpuAffinityAssignment_6 : ( ruleEString ) ;
    public final void rule__Activity__CpuAffinityAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6996:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6997:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6997:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:6998:1: ruleEString
            {
             before(grammarAccess.getActivityAccess().getCpuAffinityEStringParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Activity__CpuAffinityAssignment_613882);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7007:1: rule__Activity__PeriodAssignment_8 : ( ruleEFloat ) ;
    public final void rule__Activity__PeriodAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7011:1: ( ( ruleEFloat ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7012:1: ( ruleEFloat )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7012:1: ( ruleEFloat )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7013:1: ruleEFloat
            {
             before(grammarAccess.getActivityAccess().getPeriodEFloatParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_rule__Activity__PeriodAssignment_813913);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7022:1: rule__Activity__PriorityAssignment_10 : ( ruleEInt ) ;
    public final void rule__Activity__PriorityAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7026:1: ( ( ruleEInt ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7027:1: ( ruleEInt )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7027:1: ( ruleEInt )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7028:1: ruleEInt
            {
             before(grammarAccess.getActivityAccess().getPriorityEIntParserRuleCall_10_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Activity__PriorityAssignment_1013944);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7037:1: rule__Activity__TaskContextAssignment_11_1 : ( ( ruleEString ) ) ;
    public final void rule__Activity__TaskContextAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7041:1: ( ( ( ruleEString ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7042:1: ( ( ruleEString ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7042:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7043:1: ( ruleEString )
            {
             before(grammarAccess.getActivityAccess().getTaskContextTaskContextCrossReference_11_1_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7044:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7045:1: ruleEString
            {
             before(grammarAccess.getActivityAccess().getTaskContextTaskContextEStringParserRuleCall_11_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Activity__TaskContextAssignment_11_113979);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7056:1: rule__Activity__SlaveAssignment_12_2 : ( ruleSlave ) ;
    public final void rule__Activity__SlaveAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7060:1: ( ( ruleSlave ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7061:1: ( ruleSlave )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7061:1: ( ruleSlave )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7062:1: ruleSlave
            {
             before(grammarAccess.getActivityAccess().getSlaveSlaveParserRuleCall_12_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSlave_in_rule__Activity__SlaveAssignment_12_214014);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7071:1: rule__Activity__SlaveAssignment_12_3_1 : ( ruleSlave ) ;
    public final void rule__Activity__SlaveAssignment_12_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7075:1: ( ( ruleSlave ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7076:1: ( ruleSlave )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7076:1: ( ruleSlave )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7077:1: ruleSlave
            {
             before(grammarAccess.getActivityAccess().getSlaveSlaveParserRuleCall_12_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSlave_in_rule__Activity__SlaveAssignment_12_3_114045);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7086:1: rule__Slave__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Slave__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7090:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7091:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7091:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7092:1: ruleEString
            {
             before(grammarAccess.getSlaveAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Slave__NameAssignment_214076);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7101:1: rule__Slave__TaskContextAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Slave__TaskContextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7105:1: ( ( ( ruleEString ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7106:1: ( ( ruleEString ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7106:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7107:1: ( ruleEString )
            {
             before(grammarAccess.getSlaveAccess().getTaskContextTaskContextCrossReference_4_1_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7108:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:7109:1: ruleEString
            {
             before(grammarAccess.getSlaveAccess().getTaskContextTaskContextEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Slave__TaskContextAssignment_4_114111);
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
        public static final BitSet FOLLOW_ruleConnectionPolicy_in_entryRuleConnectionPolicy181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConnectionPolicy188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__0_in_ruleConnectionPolicy214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputPort_in_entryRuleInputPort241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputPort248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group__0_in_ruleInputPort274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOutputPort_in_entryRuleOutputPort301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOutputPort308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__0_in_ruleOutputPort334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProperty368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperation428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__0_in_ruleOperation454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEShort_in_entryRuleEShort481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEShort488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EShort__Group__0_in_ruleEShort514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIActivity_in_entryRuleIActivity541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIActivity548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IActivity__Alternatives_in_ruleIActivity574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleActivity608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__0_in_ruleActivity634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSlave_in_entryRuleSlave661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSlave668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slave__Group__0_in_ruleSlave694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_entryRuleEFloat781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEFloat788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__0_in_ruleEFloat814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt841 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName901 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_entryRuleQualifiedNameWithDot961 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithDot968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedNameWithDot__Group__0_in_ruleQualifiedNameWithDot994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicyLockPolicy__Alternatives_in_ruleConnectionPolicyLockPolicy1031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicyType__Alternatives_in_ruleConnectionPolicyType1067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Scheduler__Alternatives_in_ruleScheduler1103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleActivity_in_rule__IActivity__Alternatives1138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSlave_in_rule__IActivity__Alternatives1155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__EFloat__Alternatives_4_01237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EFloat__Alternatives_4_01257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__ConnectionPolicyLockPolicy__Alternatives1292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__ConnectionPolicyLockPolicy__Alternatives1313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__ConnectionPolicyLockPolicy__Alternatives1334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__ConnectionPolicyType__Alternatives1370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__ConnectionPolicyType__Alternatives1391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Scheduler__Alternatives1427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Scheduler__Alternatives1448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__01481 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__01484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__11542 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__11545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Package__Group__1__Impl1573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__21604 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Package__Group__3_in_rule__Package__Group__21607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__NameAssignment_2_in_rule__Package__Group__2__Impl1634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__31664 = new BitSet(new long[]{0x0000000006C00000L});
        public static final BitSet FOLLOW_rule__Package__Group__4_in_rule__Package__Group__31667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Package__Group__3__Impl1695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__41726 = new BitSet(new long[]{0x0000000006C00000L});
        public static final BitSet FOLLOW_rule__Package__Group__5_in_rule__Package__Group__41729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__0_in_rule__Package__Group__4__Impl1756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__5__Impl_in_rule__Package__Group__51787 = new BitSet(new long[]{0x0000000006C00000L});
        public static final BitSet FOLLOW_rule__Package__Group__6_in_rule__Package__Group__51790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5__0_in_rule__Package__Group__5__Impl1817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__6__Impl_in_rule__Package__Group__61848 = new BitSet(new long[]{0x0000000006C00000L});
        public static final BitSet FOLLOW_rule__Package__Group__7_in_rule__Package__Group__61851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_6__0_in_rule__Package__Group__6__Impl1878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__7__Impl_in_rule__Package__Group__71909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Package__Group__7__Impl1937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__0__Impl_in_rule__Package__Group_4__01984 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Package__Group_4__1_in_rule__Package__Group_4__01987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Package__Group_4__0__Impl2015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__1__Impl_in_rule__Package__Group_4__12046 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Package__Group_4__2_in_rule__Package__Group_4__12049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Package__Group_4__1__Impl2077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__2__Impl_in_rule__Package__Group_4__22108 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__Package__Group_4__3_in_rule__Package__Group_4__22111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__TaskContextsAssignment_4_2_in_rule__Package__Group_4__2__Impl2138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__3__Impl_in_rule__Package__Group_4__32168 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__Package__Group_4__4_in_rule__Package__Group_4__32171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4_3__0_in_rule__Package__Group_4__3__Impl2198 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__4__Impl_in_rule__Package__Group_4__42229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Package__Group_4__4__Impl2257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4_3__0__Impl_in_rule__Package__Group_4_3__02298 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Package__Group_4_3__1_in_rule__Package__Group_4_3__02301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Package__Group_4_3__0__Impl2329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4_3__1__Impl_in_rule__Package__Group_4_3__12360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__TaskContextsAssignment_4_3_1_in_rule__Package__Group_4_3__1__Impl2387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5__0__Impl_in_rule__Package__Group_5__02421 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Package__Group_5__1_in_rule__Package__Group_5__02424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Package__Group_5__0__Impl2452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5__1__Impl_in_rule__Package__Group_5__12483 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Package__Group_5__2_in_rule__Package__Group_5__12486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Package__Group_5__1__Impl2514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5__2__Impl_in_rule__Package__Group_5__22545 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__Package__Group_5__3_in_rule__Package__Group_5__22548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__ConnectionPoliciesAssignment_5_2_in_rule__Package__Group_5__2__Impl2575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5__3__Impl_in_rule__Package__Group_5__32605 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__Package__Group_5__4_in_rule__Package__Group_5__32608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5_3__0_in_rule__Package__Group_5__3__Impl2635 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5__4__Impl_in_rule__Package__Group_5__42666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Package__Group_5__4__Impl2694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5_3__0__Impl_in_rule__Package__Group_5_3__02735 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Package__Group_5_3__1_in_rule__Package__Group_5_3__02738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Package__Group_5_3__0__Impl2766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5_3__1__Impl_in_rule__Package__Group_5_3__12797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__ConnectionPoliciesAssignment_5_3_1_in_rule__Package__Group_5_3__1__Impl2824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_6__0__Impl_in_rule__Package__Group_6__02858 = new BitSet(new long[]{0x0408000000000000L});
        public static final BitSet FOLLOW_rule__Package__Group_6__1_in_rule__Package__Group_6__02861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Package__Group_6__0__Impl2889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_6__1__Impl_in_rule__Package__Group_6__12920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__ActivitiesAssignment_6_1_in_rule__Package__Group_6__1__Impl2947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__0__Impl_in_rule__TaskContext__Group__02981 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__1_in_rule__TaskContext__Group__02984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__TaskContext__Group__0__Impl3012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__1__Impl_in_rule__TaskContext__Group__13043 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__2_in_rule__TaskContext__Group__13046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__NameAssignment_1_in_rule__TaskContext__Group__1__Impl3073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__2__Impl_in_rule__TaskContext__Group__23103 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__3_in_rule__TaskContext__Group__23106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__TaskContext__Group__2__Impl3134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__3__Impl_in_rule__TaskContext__Group__33165 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__4_in_rule__TaskContext__Group__33168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__TaskContext__Group__3__Impl3196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__4__Impl_in_rule__TaskContext__Group__43227 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__5_in_rule__TaskContext__Group__43230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__NamespaceAssignment_4_in_rule__TaskContext__Group__4__Impl3257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__5__Impl_in_rule__TaskContext__Group__53287 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__6_in_rule__TaskContext__Group__53290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__TaskContext__Group__5__Impl3318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__6__Impl_in_rule__TaskContext__Group__63349 = new BitSet(new long[]{0x00000003C0400000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__7_in_rule__TaskContext__Group__63352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__TypeAssignment_6_in_rule__TaskContext__Group__6__Impl3379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__7__Impl_in_rule__TaskContext__Group__73409 = new BitSet(new long[]{0x00000003C0400000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__8_in_rule__TaskContext__Group__73412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7__0_in_rule__TaskContext__Group__7__Impl3439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__8__Impl_in_rule__TaskContext__Group__83470 = new BitSet(new long[]{0x00000003C0400000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__9_in_rule__TaskContext__Group__83473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8__0_in_rule__TaskContext__Group__8__Impl3500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__9__Impl_in_rule__TaskContext__Group__93531 = new BitSet(new long[]{0x00000003C0400000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__10_in_rule__TaskContext__Group__93534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9__0_in_rule__TaskContext__Group__9__Impl3561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__10__Impl_in_rule__TaskContext__Group__103592 = new BitSet(new long[]{0x00000003C0400000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__11_in_rule__TaskContext__Group__103595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10__0_in_rule__TaskContext__Group__10__Impl3622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__11__Impl_in_rule__TaskContext__Group__113653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__TaskContext__Group__11__Impl3681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7__0__Impl_in_rule__TaskContext__Group_7__03736 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7__1_in_rule__TaskContext__Group_7__03739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__TaskContext__Group_7__0__Impl3767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7__1__Impl_in_rule__TaskContext__Group_7__13798 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7__2_in_rule__TaskContext__Group_7__13801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__TaskContext__Group_7__1__Impl3829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7__2__Impl_in_rule__TaskContext__Group_7__23860 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7__3_in_rule__TaskContext__Group_7__23863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__InputPortsAssignment_7_2_in_rule__TaskContext__Group_7__2__Impl3890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7__3__Impl_in_rule__TaskContext__Group_7__33920 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7__4_in_rule__TaskContext__Group_7__33923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7_3__0_in_rule__TaskContext__Group_7__3__Impl3950 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7__4__Impl_in_rule__TaskContext__Group_7__43981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__TaskContext__Group_7__4__Impl4009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7_3__0__Impl_in_rule__TaskContext__Group_7_3__04050 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7_3__1_in_rule__TaskContext__Group_7_3__04053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__TaskContext__Group_7_3__0__Impl4081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7_3__1__Impl_in_rule__TaskContext__Group_7_3__14112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__InputPortsAssignment_7_3_1_in_rule__TaskContext__Group_7_3__1__Impl4139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8__0__Impl_in_rule__TaskContext__Group_8__04173 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8__1_in_rule__TaskContext__Group_8__04176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__TaskContext__Group_8__0__Impl4204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8__1__Impl_in_rule__TaskContext__Group_8__14235 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8__2_in_rule__TaskContext__Group_8__14238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__TaskContext__Group_8__1__Impl4266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8__2__Impl_in_rule__TaskContext__Group_8__24297 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8__3_in_rule__TaskContext__Group_8__24300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__OutputPortsAssignment_8_2_in_rule__TaskContext__Group_8__2__Impl4327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8__3__Impl_in_rule__TaskContext__Group_8__34357 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8__4_in_rule__TaskContext__Group_8__34360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8_3__0_in_rule__TaskContext__Group_8__3__Impl4387 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8__4__Impl_in_rule__TaskContext__Group_8__44418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__TaskContext__Group_8__4__Impl4446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8_3__0__Impl_in_rule__TaskContext__Group_8_3__04487 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8_3__1_in_rule__TaskContext__Group_8_3__04490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__TaskContext__Group_8_3__0__Impl4518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8_3__1__Impl_in_rule__TaskContext__Group_8_3__14549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__OutputPortsAssignment_8_3_1_in_rule__TaskContext__Group_8_3__1__Impl4576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9__0__Impl_in_rule__TaskContext__Group_9__04610 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9__1_in_rule__TaskContext__Group_9__04613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__TaskContext__Group_9__0__Impl4641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9__1__Impl_in_rule__TaskContext__Group_9__14672 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9__2_in_rule__TaskContext__Group_9__14675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__TaskContext__Group_9__1__Impl4703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9__2__Impl_in_rule__TaskContext__Group_9__24734 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9__3_in_rule__TaskContext__Group_9__24737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__PropertiesAssignment_9_2_in_rule__TaskContext__Group_9__2__Impl4764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9__3__Impl_in_rule__TaskContext__Group_9__34794 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9__4_in_rule__TaskContext__Group_9__34797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9_3__0_in_rule__TaskContext__Group_9__3__Impl4824 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9__4__Impl_in_rule__TaskContext__Group_9__44855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__TaskContext__Group_9__4__Impl4883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9_3__0__Impl_in_rule__TaskContext__Group_9_3__04924 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9_3__1_in_rule__TaskContext__Group_9_3__04927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__TaskContext__Group_9_3__0__Impl4955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_9_3__1__Impl_in_rule__TaskContext__Group_9_3__14986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__PropertiesAssignment_9_3_1_in_rule__TaskContext__Group_9_3__1__Impl5013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10__0__Impl_in_rule__TaskContext__Group_10__05047 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10__1_in_rule__TaskContext__Group_10__05050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__TaskContext__Group_10__0__Impl5078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10__1__Impl_in_rule__TaskContext__Group_10__15109 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10__2_in_rule__TaskContext__Group_10__15112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__TaskContext__Group_10__1__Impl5140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10__2__Impl_in_rule__TaskContext__Group_10__25171 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10__3_in_rule__TaskContext__Group_10__25174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__OperationsAssignment_10_2_in_rule__TaskContext__Group_10__2__Impl5201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10__3__Impl_in_rule__TaskContext__Group_10__35231 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10__4_in_rule__TaskContext__Group_10__35234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10_3__0_in_rule__TaskContext__Group_10__3__Impl5261 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10__4__Impl_in_rule__TaskContext__Group_10__45292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__TaskContext__Group_10__4__Impl5320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10_3__0__Impl_in_rule__TaskContext__Group_10_3__05361 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10_3__1_in_rule__TaskContext__Group_10_3__05364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__TaskContext__Group_10_3__0__Impl5392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_10_3__1__Impl_in_rule__TaskContext__Group_10_3__15423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__OperationsAssignment_10_3_1_in_rule__TaskContext__Group_10_3__1__Impl5450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__0__Impl_in_rule__ConnectionPolicy__Group__05484 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__1_in_rule__ConnectionPolicy__Group__05487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__ConnectionPolicy__Group__0__Impl5515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__1__Impl_in_rule__ConnectionPolicy__Group__15546 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__2_in_rule__ConnectionPolicy__Group__15549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__NameAssignment_1_in_rule__ConnectionPolicy__Group__1__Impl5576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__2__Impl_in_rule__ConnectionPolicy__Group__25606 = new BitSet(new long[]{0x0000006820000000L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__3_in_rule__ConnectionPolicy__Group__25609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__ConnectionPolicy__Group__2__Impl5637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__3__Impl_in_rule__ConnectionPolicy__Group__35668 = new BitSet(new long[]{0x0000006820000000L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__4_in_rule__ConnectionPolicy__Group__35671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_3__0_in_rule__ConnectionPolicy__Group__3__Impl5698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__4__Impl_in_rule__ConnectionPolicy__Group__45729 = new BitSet(new long[]{0x0000006820000000L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__5_in_rule__ConnectionPolicy__Group__45732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_4__0_in_rule__ConnectionPolicy__Group__4__Impl5759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__5__Impl_in_rule__ConnectionPolicy__Group__55790 = new BitSet(new long[]{0x0000006820000000L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__6_in_rule__ConnectionPolicy__Group__55793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_5__0_in_rule__ConnectionPolicy__Group__5__Impl5820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__6__Impl_in_rule__ConnectionPolicy__Group__65851 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__7_in_rule__ConnectionPolicy__Group__65854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__ConnectionPolicy__Group__6__Impl5882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__7__Impl_in_rule__ConnectionPolicy__Group__75913 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__8_in_rule__ConnectionPolicy__Group__75916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__InputPortAssignment_7_in_rule__ConnectionPolicy__Group__7__Impl5943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__8__Impl_in_rule__ConnectionPolicy__Group__85973 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__9_in_rule__ConnectionPolicy__Group__85976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__ConnectionPolicy__Group__8__Impl6004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__9__Impl_in_rule__ConnectionPolicy__Group__96035 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__10_in_rule__ConnectionPolicy__Group__96038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__OutputPortAssignment_9_in_rule__ConnectionPolicy__Group__9__Impl6065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__10__Impl_in_rule__ConnectionPolicy__Group__106095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__ConnectionPolicy__Group__10__Impl6123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_3__0__Impl_in_rule__ConnectionPolicy__Group_3__06176 = new BitSet(new long[]{0x0004000000000040L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_3__1_in_rule__ConnectionPolicy__Group_3__06179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__ConnectionPolicy__Group_3__0__Impl6207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_3__1__Impl_in_rule__ConnectionPolicy__Group_3__16238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__BufferSizeAssignment_3_1_in_rule__ConnectionPolicy__Group_3__1__Impl6265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_4__0__Impl_in_rule__ConnectionPolicy__Group_4__06299 = new BitSet(new long[]{0x000000000000E000L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_4__1_in_rule__ConnectionPolicy__Group_4__06302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__ConnectionPolicy__Group_4__0__Impl6330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_4__1__Impl_in_rule__ConnectionPolicy__Group_4__16361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__LockPolicyAssignment_4_1_in_rule__ConnectionPolicy__Group_4__1__Impl6388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_5__0__Impl_in_rule__ConnectionPolicy__Group_5__06422 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_5__1_in_rule__ConnectionPolicy__Group_5__06425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__ConnectionPolicy__Group_5__0__Impl6453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_5__1__Impl_in_rule__ConnectionPolicy__Group_5__16484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__TypeAssignment_5_1_in_rule__ConnectionPolicy__Group_5__1__Impl6511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group__0__Impl_in_rule__InputPort__Group__06545 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__InputPort__Group__1_in_rule__InputPort__Group__06548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__IsEventPortAssignment_0_in_rule__InputPort__Group__0__Impl6575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group__1__Impl_in_rule__InputPort__Group__16605 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputPort__Group__2_in_rule__InputPort__Group__16608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__InputPort__Group__1__Impl6636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group__2__Impl_in_rule__InputPort__Group__26667 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__InputPort__Group__3_in_rule__InputPort__Group__26670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__NameAssignment_2_in_rule__InputPort__Group__2__Impl6697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group__3__Impl_in_rule__InputPort__Group__36727 = new BitSet(new long[]{0x0000030000400000L});
        public static final BitSet FOLLOW_rule__InputPort__Group__4_in_rule__InputPort__Group__36730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__InputPort__Group__3__Impl6758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group__4__Impl_in_rule__InputPort__Group__46789 = new BitSet(new long[]{0x0000030000400000L});
        public static final BitSet FOLLOW_rule__InputPort__Group__5_in_rule__InputPort__Group__46792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group_4__0_in_rule__InputPort__Group__4__Impl6819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group__5__Impl_in_rule__InputPort__Group__56850 = new BitSet(new long[]{0x0000030000400000L});
        public static final BitSet FOLLOW_rule__InputPort__Group__6_in_rule__InputPort__Group__56853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group_5__0_in_rule__InputPort__Group__5__Impl6880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group__6__Impl_in_rule__InputPort__Group__66911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__InputPort__Group__6__Impl6939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group_4__0__Impl_in_rule__InputPort__Group_4__06984 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__InputPort__Group_4__1_in_rule__InputPort__Group_4__06987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__InputPort__Group_4__0__Impl7015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group_4__1__Impl_in_rule__InputPort__Group_4__17046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__DataTypeAssignment_4_1_in_rule__InputPort__Group_4__1__Impl7073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group_5__0__Impl_in_rule__InputPort__Group_5__07107 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputPort__Group_5__1_in_rule__InputPort__Group_5__07110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__InputPort__Group_5__0__Impl7138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group_5__1__Impl_in_rule__InputPort__Group_5__17169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__InputConnectionPolicyAssignment_5_1_in_rule__InputPort__Group_5__1__Impl7196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__0__Impl_in_rule__OutputPort__Group__07230 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__1_in_rule__OutputPort__Group__07233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__OutputPort__Group__0__Impl7261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__1__Impl_in_rule__OutputPort__Group__17292 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__2_in_rule__OutputPort__Group__17295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__NameAssignment_1_in_rule__OutputPort__Group__1__Impl7322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__2__Impl_in_rule__OutputPort__Group__27352 = new BitSet(new long[]{0x0000090000400000L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__3_in_rule__OutputPort__Group__27355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__OutputPort__Group__2__Impl7383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__3__Impl_in_rule__OutputPort__Group__37414 = new BitSet(new long[]{0x0000090000400000L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__4_in_rule__OutputPort__Group__37417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group_3__0_in_rule__OutputPort__Group__3__Impl7444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__4__Impl_in_rule__OutputPort__Group__47475 = new BitSet(new long[]{0x0000090000400000L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__5_in_rule__OutputPort__Group__47478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group_4__0_in_rule__OutputPort__Group__4__Impl7505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__5__Impl_in_rule__OutputPort__Group__57536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__OutputPort__Group__5__Impl7564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group_3__0__Impl_in_rule__OutputPort__Group_3__07607 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OutputPort__Group_3__1_in_rule__OutputPort__Group_3__07610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__OutputPort__Group_3__0__Impl7638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group_3__1__Impl_in_rule__OutputPort__Group_3__17669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__DataTypeAssignment_3_1_in_rule__OutputPort__Group_3__1__Impl7696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group_4__0__Impl_in_rule__OutputPort__Group_4__07730 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__OutputPort__Group_4__1_in_rule__OutputPort__Group_4__07733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__OutputPort__Group_4__0__Impl7761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group_4__1__Impl_in_rule__OutputPort__Group_4__17792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__OutputConnectionPolicyAssignment_4_1_in_rule__OutputPort__Group_4__1__Impl7819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__07853 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__07856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__17914 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__17917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Property__Group__1__Impl7945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__27976 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Property__Group__3_in_rule__Property__Group__27979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__NameAssignment_2_in_rule__Property__Group__2__Impl8006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__3__Impl_in_rule__Property__Group__38036 = new BitSet(new long[]{0x0000600020400000L});
        public static final BitSet FOLLOW_rule__Property__Group__4_in_rule__Property__Group__38039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Property__Group__3__Impl8067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__4__Impl_in_rule__Property__Group__48098 = new BitSet(new long[]{0x0000600020400000L});
        public static final BitSet FOLLOW_rule__Property__Group__5_in_rule__Property__Group__48101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group_4__0_in_rule__Property__Group__4__Impl8128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__5__Impl_in_rule__Property__Group__58159 = new BitSet(new long[]{0x0000600020400000L});
        public static final BitSet FOLLOW_rule__Property__Group__6_in_rule__Property__Group__58162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group_5__0_in_rule__Property__Group__5__Impl8189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__6__Impl_in_rule__Property__Group__68220 = new BitSet(new long[]{0x0000600020400000L});
        public static final BitSet FOLLOW_rule__Property__Group__7_in_rule__Property__Group__68223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group_6__0_in_rule__Property__Group__6__Impl8250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group__7__Impl_in_rule__Property__Group__78281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Property__Group__7__Impl8309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group_4__0__Impl_in_rule__Property__Group_4__08356 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Property__Group_4__1_in_rule__Property__Group_4__08359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__Property__Group_4__0__Impl8387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group_4__1__Impl_in_rule__Property__Group_4__18418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__DescriptionAssignment_4_1_in_rule__Property__Group_4__1__Impl8445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group_5__0__Impl_in_rule__Property__Group_5__08479 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Property__Group_5__1_in_rule__Property__Group_5__08482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__Property__Group_5__0__Impl8510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group_5__1__Impl_in_rule__Property__Group_5__18541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__ValueAssignment_5_1_in_rule__Property__Group_5__1__Impl8568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group_6__0__Impl_in_rule__Property__Group_6__08602 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Property__Group_6__1_in_rule__Property__Group_6__08605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Property__Group_6__0__Impl8633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__Group_6__1__Impl_in_rule__Property__Group_6__18664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Property__TypeAssignment_6_1_in_rule__Property__Group_6__1__Impl8691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__08725 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__08728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__18786 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__18789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__Operation__Group__1__Impl8817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__28848 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__28851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__NameAssignment_2_in_rule__Operation__Group__2__Impl8878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__38908 = new BitSet(new long[]{0x0003000000400000L});
        public static final BitSet FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__38911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Operation__Group__3__Impl8939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__48970 = new BitSet(new long[]{0x0003000000400000L});
        public static final BitSet FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__48973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_4__0_in_rule__Operation__Group__4__Impl9000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__59031 = new BitSet(new long[]{0x0003000000400000L});
        public static final BitSet FOLLOW_rule__Operation__Group__6_in_rule__Operation__Group__59034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_5__0_in_rule__Operation__Group__5__Impl9061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__6__Impl_in_rule__Operation__Group__69092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Operation__Group__6__Impl9120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_4__0__Impl_in_rule__Operation__Group_4__09165 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Operation__Group_4__1_in_rule__Operation__Group_4__09168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__Operation__Group_4__0__Impl9196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_4__1__Impl_in_rule__Operation__Group_4__19227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__DocumentationAssignment_4_1_in_rule__Operation__Group_4__1__Impl9254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_5__0__Impl_in_rule__Operation__Group_5__09288 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Operation__Group_5__1_in_rule__Operation__Group_5__09291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__Operation__Group_5__0__Impl9319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_5__1__Impl_in_rule__Operation__Group_5__19350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__ReturnTypeAssignment_5_1_in_rule__Operation__Group_5__1__Impl9377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EShort__Group__0__Impl_in_rule__EShort__Group__09411 = new BitSet(new long[]{0x0004000000000040L});
        public static final BitSet FOLLOW_rule__EShort__Group__1_in_rule__EShort__Group__09414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__EShort__Group__0__Impl9443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EShort__Group__1__Impl_in_rule__EShort__Group__19476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EShort__Group__1__Impl9503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__09536 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__09539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__Activity__Group__0__Impl9567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__19598 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__19601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__NameAssignment_1_in_rule__Activity__Group__1__Impl9628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__29658 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__29661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Activity__Group__2__Impl9689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__39720 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__39723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__Activity__Group__3__Impl9751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__49782 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__49785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__SchedulerAssignment_4_in_rule__Activity__Group__4__Impl9812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__59842 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__59845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rule__Activity__Group__5__Impl9873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__69904 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__69907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__CpuAffinityAssignment_6_in_rule__Activity__Group__6__Impl9934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__79964 = new BitSet(new long[]{0x0804000000000040L});
        public static final BitSet FOLLOW_rule__Activity__Group__8_in_rule__Activity__Group__79967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rule__Activity__Group__7__Impl9995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__8__Impl_in_rule__Activity__Group__810026 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group__9_in_rule__Activity__Group__810029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__PeriodAssignment_8_in_rule__Activity__Group__8__Impl10056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__9__Impl_in_rule__Activity__Group__910086 = new BitSet(new long[]{0x0004000000000040L});
        public static final BitSet FOLLOW_rule__Activity__Group__10_in_rule__Activity__Group__910089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rule__Activity__Group__9__Impl10117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__10__Impl_in_rule__Activity__Group__1010148 = new BitSet(new long[]{0x0300000000400000L});
        public static final BitSet FOLLOW_rule__Activity__Group__11_in_rule__Activity__Group__1010151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__PriorityAssignment_10_in_rule__Activity__Group__10__Impl10178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__11__Impl_in_rule__Activity__Group__1110208 = new BitSet(new long[]{0x0300000000400000L});
        public static final BitSet FOLLOW_rule__Activity__Group__12_in_rule__Activity__Group__1110211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_11__0_in_rule__Activity__Group__11__Impl10238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__12__Impl_in_rule__Activity__Group__1210269 = new BitSet(new long[]{0x0300000000400000L});
        public static final BitSet FOLLOW_rule__Activity__Group__13_in_rule__Activity__Group__1210272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_12__0_in_rule__Activity__Group__12__Impl10299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__13__Impl_in_rule__Activity__Group__1310330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Activity__Group__13__Impl10358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_11__0__Impl_in_rule__Activity__Group_11__010417 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Activity__Group_11__1_in_rule__Activity__Group_11__010420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rule__Activity__Group_11__0__Impl10448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_11__1__Impl_in_rule__Activity__Group_11__110479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__TaskContextAssignment_11_1_in_rule__Activity__Group_11__1__Impl10506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_12__0__Impl_in_rule__Activity__Group_12__010540 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Activity__Group_12__1_in_rule__Activity__Group_12__010543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_rule__Activity__Group_12__0__Impl10571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_12__1__Impl_in_rule__Activity__Group_12__110602 = new BitSet(new long[]{0x0408000000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group_12__2_in_rule__Activity__Group_12__110605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Activity__Group_12__1__Impl10633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_12__2__Impl_in_rule__Activity__Group_12__210664 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__Activity__Group_12__3_in_rule__Activity__Group_12__210667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__SlaveAssignment_12_2_in_rule__Activity__Group_12__2__Impl10694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_12__3__Impl_in_rule__Activity__Group_12__310724 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__Activity__Group_12__4_in_rule__Activity__Group_12__310727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_12_3__0_in_rule__Activity__Group_12__3__Impl10754 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_12__4__Impl_in_rule__Activity__Group_12__410785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Activity__Group_12__4__Impl10813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_12_3__0__Impl_in_rule__Activity__Group_12_3__010854 = new BitSet(new long[]{0x0408000000000000L});
        public static final BitSet FOLLOW_rule__Activity__Group_12_3__1_in_rule__Activity__Group_12_3__010857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Activity__Group_12_3__0__Impl10885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group_12_3__1__Impl_in_rule__Activity__Group_12_3__110916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__SlaveAssignment_12_3_1_in_rule__Activity__Group_12_3__1__Impl10943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slave__Group__0__Impl_in_rule__Slave__Group__010977 = new BitSet(new long[]{0x0408000000000000L});
        public static final BitSet FOLLOW_rule__Slave__Group__1_in_rule__Slave__Group__010980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slave__Group__1__Impl_in_rule__Slave__Group__111038 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Slave__Group__2_in_rule__Slave__Group__111041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_rule__Slave__Group__1__Impl11069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slave__Group__2__Impl_in_rule__Slave__Group__211100 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Slave__Group__3_in_rule__Slave__Group__211103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slave__NameAssignment_2_in_rule__Slave__Group__2__Impl11130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slave__Group__3__Impl_in_rule__Slave__Group__311160 = new BitSet(new long[]{0x0100000000400000L});
        public static final BitSet FOLLOW_rule__Slave__Group__4_in_rule__Slave__Group__311163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Slave__Group__3__Impl11191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slave__Group__4__Impl_in_rule__Slave__Group__411222 = new BitSet(new long[]{0x0100000000400000L});
        public static final BitSet FOLLOW_rule__Slave__Group__5_in_rule__Slave__Group__411225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slave__Group_4__0_in_rule__Slave__Group__4__Impl11252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slave__Group__5__Impl_in_rule__Slave__Group__511283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Slave__Group__5__Impl11311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slave__Group_4__0__Impl_in_rule__Slave__Group_4__011354 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Slave__Group_4__1_in_rule__Slave__Group_4__011357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rule__Slave__Group_4__0__Impl11385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slave__Group_4__1__Impl_in_rule__Slave__Group_4__111416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slave__TaskContextAssignment_4_1_in_rule__Slave__Group_4__1__Impl11443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__0__Impl_in_rule__EFloat__Group__011477 = new BitSet(new long[]{0x0804000000000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group__1_in_rule__EFloat__Group__011480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__EFloat__Group__0__Impl11509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__1__Impl_in_rule__EFloat__Group__111542 = new BitSet(new long[]{0x0804000000000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group__2_in_rule__EFloat__Group__111545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EFloat__Group__1__Impl11573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__2__Impl_in_rule__EFloat__Group__211604 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group__3_in_rule__EFloat__Group__211607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_rule__EFloat__Group__2__Impl11635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__3__Impl_in_rule__EFloat__Group__311666 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__EFloat__Group__4_in_rule__EFloat__Group__311669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EFloat__Group__3__Impl11696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group__4__Impl_in_rule__EFloat__Group__411725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__0_in_rule__EFloat__Group__4__Impl11752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__0__Impl_in_rule__EFloat__Group_4__011793 = new BitSet(new long[]{0x0004000000000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__1_in_rule__EFloat__Group_4__011796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Alternatives_4_0_in_rule__EFloat__Group_4__0__Impl11823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__1__Impl_in_rule__EFloat__Group_4__111853 = new BitSet(new long[]{0x0004000000000040L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__2_in_rule__EFloat__Group_4__111856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__EFloat__Group_4__1__Impl11885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloat__Group_4__2__Impl_in_rule__EFloat__Group_4__211918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EFloat__Group_4__2__Impl11945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__011980 = new BitSet(new long[]{0x0004000000000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__011983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__EInt__Group__0__Impl12012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__112045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl12072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__012105 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__012108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl12135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__112164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl12191 = new BitSet(new long[]{0x1000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__012226 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__012229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_rule__QualifiedName__Group_1__0__Impl12257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__112288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl12315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedNameWithDot__Group__0__Impl_in_rule__QualifiedNameWithDot__Group__012348 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_rule__QualifiedNameWithDot__Group__1_in_rule__QualifiedNameWithDot__Group__012351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithDot__Group__0__Impl12378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedNameWithDot__Group__1__Impl_in_rule__QualifiedNameWithDot__Group__112407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedNameWithDot__Group_1__0_in_rule__QualifiedNameWithDot__Group__1__Impl12434 = new BitSet(new long[]{0x0800000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedNameWithDot__Group_1__0__Impl_in_rule__QualifiedNameWithDot__Group_1__012469 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__QualifiedNameWithDot__Group_1__1_in_rule__QualifiedNameWithDot__Group_1__012472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_rule__QualifiedNameWithDot__Group_1__0__Impl12500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedNameWithDot__Group_1__1__Impl_in_rule__QualifiedNameWithDot__Group_1__112531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedNameWithDot__Group_1__1__Impl12558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Package__NameAssignment_212596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTaskContext_in_rule__Package__TaskContextsAssignment_4_212627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTaskContext_in_rule__Package__TaskContextsAssignment_4_3_112658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConnectionPolicy_in_rule__Package__ConnectionPoliciesAssignment_5_212689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConnectionPolicy_in_rule__Package__ConnectionPoliciesAssignment_5_3_112720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIActivity_in_rule__Package__ActivitiesAssignment_6_112751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TaskContext__NameAssignment_112782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_rule__TaskContext__NamespaceAssignment_412813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_rule__TaskContext__TypeAssignment_612844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputPort_in_rule__TaskContext__InputPortsAssignment_7_212875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputPort_in_rule__TaskContext__InputPortsAssignment_7_3_112906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOutputPort_in_rule__TaskContext__OutputPortsAssignment_8_212937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOutputPort_in_rule__TaskContext__OutputPortsAssignment_8_3_112968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_rule__TaskContext__PropertiesAssignment_9_212999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_rule__TaskContext__PropertiesAssignment_9_3_113030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_rule__TaskContext__OperationsAssignment_10_213061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_rule__TaskContext__OperationsAssignment_10_3_113092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ConnectionPolicy__NameAssignment_113123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEShort_in_rule__ConnectionPolicy__BufferSizeAssignment_3_113154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConnectionPolicyLockPolicy_in_rule__ConnectionPolicy__LockPolicyAssignment_4_113185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConnectionPolicyType_in_rule__ConnectionPolicy__TypeAssignment_5_113216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ConnectionPolicy__InputPortAssignment_713251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ConnectionPolicy__OutputPortAssignment_913290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_rule__InputPort__IsEventPortAssignment_013330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputPort__NameAssignment_213369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_rule__InputPort__DataTypeAssignment_4_113404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputPort__InputConnectionPolicyAssignment_5_113443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OutputPort__NameAssignment_113478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_rule__OutputPort__DataTypeAssignment_3_113513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OutputPort__OutputConnectionPolicyAssignment_4_113552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Property__NameAssignment_213587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Property__DescriptionAssignment_4_113618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Property__ValueAssignment_5_113649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_rule__Property__TypeAssignment_6_113684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Operation__NameAssignment_213719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Operation__DocumentationAssignment_4_113750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithDot_in_rule__Operation__ReturnTypeAssignment_5_113785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Activity__NameAssignment_113820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleScheduler_in_rule__Activity__SchedulerAssignment_413851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Activity__CpuAffinityAssignment_613882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_rule__Activity__PeriodAssignment_813913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Activity__PriorityAssignment_1013944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Activity__TaskContextAssignment_11_113979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSlave_in_rule__Activity__SlaveAssignment_12_214014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSlave_in_rule__Activity__SlaveAssignment_12_3_114045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Slave__NameAssignment_214076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Slave__TaskContextAssignment_4_114111 = new BitSet(new long[]{0x0000000000000002L});
    }


}