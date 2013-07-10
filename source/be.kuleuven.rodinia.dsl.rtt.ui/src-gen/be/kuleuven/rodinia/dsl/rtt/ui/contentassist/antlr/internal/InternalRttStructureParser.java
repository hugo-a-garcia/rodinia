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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'UNSYNC'", "'LOCKED'", "'LOCK_FREE'", "'DATA'", "'BUFFER'", "'OrocosPackage'", "'{'", "'}'", "'taskContexts'", "','", "'connectionPolicies'", "'TaskContext'", "'namespace'", "'type'", "'inputPorts'", "'outputPorts'", "'ConnectionPolicy'", "'inputPort'", "'outputPort'", "'bufferSize'", "'lockPolicy'", "'InputPort'", "'dataType'", "'inputConnectionPolicy'", "'OutputPort'", "'outputConnectionPolicy'", "'-'", "'isEventPort'"
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
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
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


    // $ANTLR start "entryRuleEString"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:88:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:89:1: ( ruleEString EOF )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:90:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString121);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString128); 

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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:97:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:101:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:102:1: ( ( rule__EString__Alternatives ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:102:1: ( ( rule__EString__Alternatives ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:103:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:104:1: ( rule__EString__Alternatives )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:104:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString154);
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


    // $ANTLR start "entryRuleTaskContext"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:116:1: entryRuleTaskContext : ruleTaskContext EOF ;
    public final void entryRuleTaskContext() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:117:1: ( ruleTaskContext EOF )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:118:1: ruleTaskContext EOF
            {
             before(grammarAccess.getTaskContextRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTaskContext_in_entryRuleTaskContext181);
            ruleTaskContext();

            state._fsp--;

             after(grammarAccess.getTaskContextRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTaskContext188); 

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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:125:1: ruleTaskContext : ( ( rule__TaskContext__Group__0 ) ) ;
    public final void ruleTaskContext() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:129:2: ( ( ( rule__TaskContext__Group__0 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:130:1: ( ( rule__TaskContext__Group__0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:130:1: ( ( rule__TaskContext__Group__0 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:131:1: ( rule__TaskContext__Group__0 )
            {
             before(grammarAccess.getTaskContextAccess().getGroup()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:132:1: ( rule__TaskContext__Group__0 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:132:2: rule__TaskContext__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__0_in_ruleTaskContext214);
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


    // $ANTLR start "entryRuleEShort"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:228:1: entryRuleEShort : ruleEShort EOF ;
    public final void entryRuleEShort() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:229:1: ( ruleEShort EOF )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:230:1: ruleEShort EOF
            {
             before(grammarAccess.getEShortRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEShort_in_entryRuleEShort421);
            ruleEShort();

            state._fsp--;

             after(grammarAccess.getEShortRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEShort428); 

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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:237:1: ruleEShort : ( ( rule__EShort__Group__0 ) ) ;
    public final void ruleEShort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:241:2: ( ( ( rule__EShort__Group__0 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:242:1: ( ( rule__EShort__Group__0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:242:1: ( ( rule__EShort__Group__0 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:243:1: ( rule__EShort__Group__0 )
            {
             before(grammarAccess.getEShortAccess().getGroup()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:244:1: ( rule__EShort__Group__0 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:244:2: rule__EShort__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EShort__Group__0_in_ruleEShort454);
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


    // $ANTLR start "ruleConnectionPolicyLockPolicy"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:257:1: ruleConnectionPolicyLockPolicy : ( ( rule__ConnectionPolicyLockPolicy__Alternatives ) ) ;
    public final void ruleConnectionPolicyLockPolicy() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:261:1: ( ( ( rule__ConnectionPolicyLockPolicy__Alternatives ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:262:1: ( ( rule__ConnectionPolicyLockPolicy__Alternatives ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:262:1: ( ( rule__ConnectionPolicyLockPolicy__Alternatives ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:263:1: ( rule__ConnectionPolicyLockPolicy__Alternatives )
            {
             before(grammarAccess.getConnectionPolicyLockPolicyAccess().getAlternatives()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:264:1: ( rule__ConnectionPolicyLockPolicy__Alternatives )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:264:2: rule__ConnectionPolicyLockPolicy__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicyLockPolicy__Alternatives_in_ruleConnectionPolicyLockPolicy491);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:276:1: ruleConnectionPolicyType : ( ( rule__ConnectionPolicyType__Alternatives ) ) ;
    public final void ruleConnectionPolicyType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:280:1: ( ( ( rule__ConnectionPolicyType__Alternatives ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:281:1: ( ( rule__ConnectionPolicyType__Alternatives ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:281:1: ( ( rule__ConnectionPolicyType__Alternatives ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:282:1: ( rule__ConnectionPolicyType__Alternatives )
            {
             before(grammarAccess.getConnectionPolicyTypeAccess().getAlternatives()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:283:1: ( rule__ConnectionPolicyType__Alternatives )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:283:2: rule__ConnectionPolicyType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicyType__Alternatives_in_ruleConnectionPolicyType527);
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


    // $ANTLR start "rule__EString__Alternatives"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:294:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:298:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:299:1: ( RULE_STRING )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:299:1: ( RULE_STRING )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:300:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives562); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:305:6: ( RULE_ID )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:305:6: ( RULE_ID )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:306:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives579); 
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


    // $ANTLR start "rule__ConnectionPolicyLockPolicy__Alternatives"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:316:1: rule__ConnectionPolicyLockPolicy__Alternatives : ( ( ( 'UNSYNC' ) ) | ( ( 'LOCKED' ) ) | ( ( 'LOCK_FREE' ) ) );
    public final void rule__ConnectionPolicyLockPolicy__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:320:1: ( ( ( 'UNSYNC' ) ) | ( ( 'LOCKED' ) ) | ( ( 'LOCK_FREE' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:321:1: ( ( 'UNSYNC' ) )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:321:1: ( ( 'UNSYNC' ) )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:322:1: ( 'UNSYNC' )
                    {
                     before(grammarAccess.getConnectionPolicyLockPolicyAccess().getUNSYNCEnumLiteralDeclaration_0()); 
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:323:1: ( 'UNSYNC' )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:323:3: 'UNSYNC'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__ConnectionPolicyLockPolicy__Alternatives612); 

                    }

                     after(grammarAccess.getConnectionPolicyLockPolicyAccess().getUNSYNCEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:328:6: ( ( 'LOCKED' ) )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:328:6: ( ( 'LOCKED' ) )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:329:1: ( 'LOCKED' )
                    {
                     before(grammarAccess.getConnectionPolicyLockPolicyAccess().getLOCKEDEnumLiteralDeclaration_1()); 
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:330:1: ( 'LOCKED' )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:330:3: 'LOCKED'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__ConnectionPolicyLockPolicy__Alternatives633); 

                    }

                     after(grammarAccess.getConnectionPolicyLockPolicyAccess().getLOCKEDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:335:6: ( ( 'LOCK_FREE' ) )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:335:6: ( ( 'LOCK_FREE' ) )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:336:1: ( 'LOCK_FREE' )
                    {
                     before(grammarAccess.getConnectionPolicyLockPolicyAccess().getLOCK_FREEEnumLiteralDeclaration_2()); 
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:337:1: ( 'LOCK_FREE' )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:337:3: 'LOCK_FREE'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__ConnectionPolicyLockPolicy__Alternatives654); 

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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:347:1: rule__ConnectionPolicyType__Alternatives : ( ( ( 'DATA' ) ) | ( ( 'BUFFER' ) ) );
    public final void rule__ConnectionPolicyType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:351:1: ( ( ( 'DATA' ) ) | ( ( 'BUFFER' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:352:1: ( ( 'DATA' ) )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:352:1: ( ( 'DATA' ) )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:353:1: ( 'DATA' )
                    {
                     before(grammarAccess.getConnectionPolicyTypeAccess().getDATAEnumLiteralDeclaration_0()); 
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:354:1: ( 'DATA' )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:354:3: 'DATA'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__ConnectionPolicyType__Alternatives690); 

                    }

                     after(grammarAccess.getConnectionPolicyTypeAccess().getDATAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:359:6: ( ( 'BUFFER' ) )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:359:6: ( ( 'BUFFER' ) )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:360:1: ( 'BUFFER' )
                    {
                     before(grammarAccess.getConnectionPolicyTypeAccess().getBUFFEREnumLiteralDeclaration_1()); 
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:361:1: ( 'BUFFER' )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:361:3: 'BUFFER'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__ConnectionPolicyType__Alternatives711); 

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


    // $ANTLR start "rule__Package__Group__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:373:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:377:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:378:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__0744);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__1_in_rule__Package__Group__0747);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:385:1: rule__Package__Group__0__Impl : ( () ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:389:1: ( ( () ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:390:1: ( () )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:390:1: ( () )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:391:1: ()
            {
             before(grammarAccess.getPackageAccess().getOrocosPackageAction_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:392:1: ()
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:394:1: 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:404:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:408:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:409:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__1805);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__2_in_rule__Package__Group__1808);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:416:1: rule__Package__Group__1__Impl : ( 'OrocosPackage' ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:420:1: ( ( 'OrocosPackage' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:421:1: ( 'OrocosPackage' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:421:1: ( 'OrocosPackage' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:422:1: 'OrocosPackage'
            {
             before(grammarAccess.getPackageAccess().getOrocosPackageKeyword_1()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Package__Group__1__Impl836); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:435:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:439:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:440:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__2867);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__3_in_rule__Package__Group__2870);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:447:1: rule__Package__Group__2__Impl : ( ( rule__Package__NameAssignment_2 ) ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:451:1: ( ( ( rule__Package__NameAssignment_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:452:1: ( ( rule__Package__NameAssignment_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:452:1: ( ( rule__Package__NameAssignment_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:453:1: ( rule__Package__NameAssignment_2 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:454:1: ( rule__Package__NameAssignment_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:454:2: rule__Package__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__NameAssignment_2_in_rule__Package__Group__2__Impl897);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:464:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:468:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:469:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__3927);
            rule__Package__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__4_in_rule__Package__Group__3930);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:476:1: rule__Package__Group__3__Impl : ( '{' ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:480:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:481:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:481:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:482:1: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Package__Group__3__Impl958); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:495:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:499:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:500:2: rule__Package__Group__4__Impl rule__Package__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__4989);
            rule__Package__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__5_in_rule__Package__Group__4992);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:507:1: rule__Package__Group__4__Impl : ( ( rule__Package__Group_4__0 )? ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:511:1: ( ( ( rule__Package__Group_4__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:512:1: ( ( rule__Package__Group_4__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:512:1: ( ( rule__Package__Group_4__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:513:1: ( rule__Package__Group_4__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_4()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:514:1: ( rule__Package__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:514:2: rule__Package__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__0_in_rule__Package__Group__4__Impl1019);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:524:1: rule__Package__Group__5 : rule__Package__Group__5__Impl rule__Package__Group__6 ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:528:1: ( rule__Package__Group__5__Impl rule__Package__Group__6 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:529:2: rule__Package__Group__5__Impl rule__Package__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__5__Impl_in_rule__Package__Group__51050);
            rule__Package__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__6_in_rule__Package__Group__51053);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:536:1: rule__Package__Group__5__Impl : ( ( rule__Package__Group_5__0 )? ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:540:1: ( ( ( rule__Package__Group_5__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:541:1: ( ( rule__Package__Group_5__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:541:1: ( ( rule__Package__Group_5__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:542:1: ( rule__Package__Group_5__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_5()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:543:1: ( rule__Package__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:543:2: rule__Package__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__0_in_rule__Package__Group__5__Impl1080);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:553:1: rule__Package__Group__6 : rule__Package__Group__6__Impl ;
    public final void rule__Package__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:557:1: ( rule__Package__Group__6__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:558:2: rule__Package__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__6__Impl_in_rule__Package__Group__61111);
            rule__Package__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:564:1: rule__Package__Group__6__Impl : ( '}' ) ;
    public final void rule__Package__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:568:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:569:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:569:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:570:1: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Package__Group__6__Impl1139); 
             after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Package__Group_4__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:597:1: rule__Package__Group_4__0 : rule__Package__Group_4__0__Impl rule__Package__Group_4__1 ;
    public final void rule__Package__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:601:1: ( rule__Package__Group_4__0__Impl rule__Package__Group_4__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:602:2: rule__Package__Group_4__0__Impl rule__Package__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__0__Impl_in_rule__Package__Group_4__01184);
            rule__Package__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__1_in_rule__Package__Group_4__01187);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:609:1: rule__Package__Group_4__0__Impl : ( 'taskContexts' ) ;
    public final void rule__Package__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:613:1: ( ( 'taskContexts' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:614:1: ( 'taskContexts' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:614:1: ( 'taskContexts' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:615:1: 'taskContexts'
            {
             before(grammarAccess.getPackageAccess().getTaskContextsKeyword_4_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Package__Group_4__0__Impl1215); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:628:1: rule__Package__Group_4__1 : rule__Package__Group_4__1__Impl rule__Package__Group_4__2 ;
    public final void rule__Package__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:632:1: ( rule__Package__Group_4__1__Impl rule__Package__Group_4__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:633:2: rule__Package__Group_4__1__Impl rule__Package__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__1__Impl_in_rule__Package__Group_4__11246);
            rule__Package__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__2_in_rule__Package__Group_4__11249);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:640:1: rule__Package__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Package__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:644:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:645:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:645:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:646:1: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Package__Group_4__1__Impl1277); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:659:1: rule__Package__Group_4__2 : rule__Package__Group_4__2__Impl rule__Package__Group_4__3 ;
    public final void rule__Package__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:663:1: ( rule__Package__Group_4__2__Impl rule__Package__Group_4__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:664:2: rule__Package__Group_4__2__Impl rule__Package__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__2__Impl_in_rule__Package__Group_4__21308);
            rule__Package__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__3_in_rule__Package__Group_4__21311);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:671:1: rule__Package__Group_4__2__Impl : ( ( rule__Package__TaskContextsAssignment_4_2 ) ) ;
    public final void rule__Package__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:675:1: ( ( ( rule__Package__TaskContextsAssignment_4_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:676:1: ( ( rule__Package__TaskContextsAssignment_4_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:676:1: ( ( rule__Package__TaskContextsAssignment_4_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:677:1: ( rule__Package__TaskContextsAssignment_4_2 )
            {
             before(grammarAccess.getPackageAccess().getTaskContextsAssignment_4_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:678:1: ( rule__Package__TaskContextsAssignment_4_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:678:2: rule__Package__TaskContextsAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__TaskContextsAssignment_4_2_in_rule__Package__Group_4__2__Impl1338);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:688:1: rule__Package__Group_4__3 : rule__Package__Group_4__3__Impl rule__Package__Group_4__4 ;
    public final void rule__Package__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:692:1: ( rule__Package__Group_4__3__Impl rule__Package__Group_4__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:693:2: rule__Package__Group_4__3__Impl rule__Package__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__3__Impl_in_rule__Package__Group_4__31368);
            rule__Package__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__4_in_rule__Package__Group_4__31371);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:700:1: rule__Package__Group_4__3__Impl : ( ( rule__Package__Group_4_3__0 )* ) ;
    public final void rule__Package__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:704:1: ( ( ( rule__Package__Group_4_3__0 )* ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:705:1: ( ( rule__Package__Group_4_3__0 )* )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:705:1: ( ( rule__Package__Group_4_3__0 )* )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:706:1: ( rule__Package__Group_4_3__0 )*
            {
             before(grammarAccess.getPackageAccess().getGroup_4_3()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:707:1: ( rule__Package__Group_4_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:707:2: rule__Package__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4_3__0_in_rule__Package__Group_4__3__Impl1398);
            	    rule__Package__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:717:1: rule__Package__Group_4__4 : rule__Package__Group_4__4__Impl ;
    public final void rule__Package__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:721:1: ( rule__Package__Group_4__4__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:722:2: rule__Package__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__4__Impl_in_rule__Package__Group_4__41429);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:728:1: rule__Package__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Package__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:732:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:733:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:733:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:734:1: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Package__Group_4__4__Impl1457); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:757:1: rule__Package__Group_4_3__0 : rule__Package__Group_4_3__0__Impl rule__Package__Group_4_3__1 ;
    public final void rule__Package__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:761:1: ( rule__Package__Group_4_3__0__Impl rule__Package__Group_4_3__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:762:2: rule__Package__Group_4_3__0__Impl rule__Package__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4_3__0__Impl_in_rule__Package__Group_4_3__01498);
            rule__Package__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4_3__1_in_rule__Package__Group_4_3__01501);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:769:1: rule__Package__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Package__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:773:1: ( ( ',' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:774:1: ( ',' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:774:1: ( ',' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:775:1: ','
            {
             before(grammarAccess.getPackageAccess().getCommaKeyword_4_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Package__Group_4_3__0__Impl1529); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:788:1: rule__Package__Group_4_3__1 : rule__Package__Group_4_3__1__Impl ;
    public final void rule__Package__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:792:1: ( rule__Package__Group_4_3__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:793:2: rule__Package__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4_3__1__Impl_in_rule__Package__Group_4_3__11560);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:799:1: rule__Package__Group_4_3__1__Impl : ( ( rule__Package__TaskContextsAssignment_4_3_1 ) ) ;
    public final void rule__Package__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:803:1: ( ( ( rule__Package__TaskContextsAssignment_4_3_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:804:1: ( ( rule__Package__TaskContextsAssignment_4_3_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:804:1: ( ( rule__Package__TaskContextsAssignment_4_3_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:805:1: ( rule__Package__TaskContextsAssignment_4_3_1 )
            {
             before(grammarAccess.getPackageAccess().getTaskContextsAssignment_4_3_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:806:1: ( rule__Package__TaskContextsAssignment_4_3_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:806:2: rule__Package__TaskContextsAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__TaskContextsAssignment_4_3_1_in_rule__Package__Group_4_3__1__Impl1587);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:820:1: rule__Package__Group_5__0 : rule__Package__Group_5__0__Impl rule__Package__Group_5__1 ;
    public final void rule__Package__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:824:1: ( rule__Package__Group_5__0__Impl rule__Package__Group_5__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:825:2: rule__Package__Group_5__0__Impl rule__Package__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__0__Impl_in_rule__Package__Group_5__01621);
            rule__Package__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__1_in_rule__Package__Group_5__01624);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:832:1: rule__Package__Group_5__0__Impl : ( 'connectionPolicies' ) ;
    public final void rule__Package__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:836:1: ( ( 'connectionPolicies' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:837:1: ( 'connectionPolicies' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:837:1: ( 'connectionPolicies' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:838:1: 'connectionPolicies'
            {
             before(grammarAccess.getPackageAccess().getConnectionPoliciesKeyword_5_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Package__Group_5__0__Impl1652); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:851:1: rule__Package__Group_5__1 : rule__Package__Group_5__1__Impl rule__Package__Group_5__2 ;
    public final void rule__Package__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:855:1: ( rule__Package__Group_5__1__Impl rule__Package__Group_5__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:856:2: rule__Package__Group_5__1__Impl rule__Package__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__1__Impl_in_rule__Package__Group_5__11683);
            rule__Package__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__2_in_rule__Package__Group_5__11686);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:863:1: rule__Package__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Package__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:867:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:868:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:868:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:869:1: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Package__Group_5__1__Impl1714); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:882:1: rule__Package__Group_5__2 : rule__Package__Group_5__2__Impl rule__Package__Group_5__3 ;
    public final void rule__Package__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:886:1: ( rule__Package__Group_5__2__Impl rule__Package__Group_5__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:887:2: rule__Package__Group_5__2__Impl rule__Package__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__2__Impl_in_rule__Package__Group_5__21745);
            rule__Package__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__3_in_rule__Package__Group_5__21748);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:894:1: rule__Package__Group_5__2__Impl : ( ( rule__Package__ConnectionPoliciesAssignment_5_2 ) ) ;
    public final void rule__Package__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:898:1: ( ( ( rule__Package__ConnectionPoliciesAssignment_5_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:899:1: ( ( rule__Package__ConnectionPoliciesAssignment_5_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:899:1: ( ( rule__Package__ConnectionPoliciesAssignment_5_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:900:1: ( rule__Package__ConnectionPoliciesAssignment_5_2 )
            {
             before(grammarAccess.getPackageAccess().getConnectionPoliciesAssignment_5_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:901:1: ( rule__Package__ConnectionPoliciesAssignment_5_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:901:2: rule__Package__ConnectionPoliciesAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__ConnectionPoliciesAssignment_5_2_in_rule__Package__Group_5__2__Impl1775);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:911:1: rule__Package__Group_5__3 : rule__Package__Group_5__3__Impl rule__Package__Group_5__4 ;
    public final void rule__Package__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:915:1: ( rule__Package__Group_5__3__Impl rule__Package__Group_5__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:916:2: rule__Package__Group_5__3__Impl rule__Package__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__3__Impl_in_rule__Package__Group_5__31805);
            rule__Package__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__4_in_rule__Package__Group_5__31808);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:923:1: rule__Package__Group_5__3__Impl : ( ( rule__Package__Group_5_3__0 )* ) ;
    public final void rule__Package__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:927:1: ( ( ( rule__Package__Group_5_3__0 )* ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:928:1: ( ( rule__Package__Group_5_3__0 )* )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:928:1: ( ( rule__Package__Group_5_3__0 )* )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:929:1: ( rule__Package__Group_5_3__0 )*
            {
             before(grammarAccess.getPackageAccess().getGroup_5_3()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:930:1: ( rule__Package__Group_5_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:930:2: rule__Package__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5_3__0_in_rule__Package__Group_5__3__Impl1835);
            	    rule__Package__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:940:1: rule__Package__Group_5__4 : rule__Package__Group_5__4__Impl ;
    public final void rule__Package__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:944:1: ( rule__Package__Group_5__4__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:945:2: rule__Package__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__4__Impl_in_rule__Package__Group_5__41866);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:951:1: rule__Package__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Package__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:955:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:956:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:956:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:957:1: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Package__Group_5__4__Impl1894); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:980:1: rule__Package__Group_5_3__0 : rule__Package__Group_5_3__0__Impl rule__Package__Group_5_3__1 ;
    public final void rule__Package__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:984:1: ( rule__Package__Group_5_3__0__Impl rule__Package__Group_5_3__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:985:2: rule__Package__Group_5_3__0__Impl rule__Package__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5_3__0__Impl_in_rule__Package__Group_5_3__01935);
            rule__Package__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5_3__1_in_rule__Package__Group_5_3__01938);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:992:1: rule__Package__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Package__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:996:1: ( ( ',' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:997:1: ( ',' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:997:1: ( ',' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:998:1: ','
            {
             before(grammarAccess.getPackageAccess().getCommaKeyword_5_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Package__Group_5_3__0__Impl1966); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1011:1: rule__Package__Group_5_3__1 : rule__Package__Group_5_3__1__Impl ;
    public final void rule__Package__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1015:1: ( rule__Package__Group_5_3__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1016:2: rule__Package__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5_3__1__Impl_in_rule__Package__Group_5_3__11997);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1022:1: rule__Package__Group_5_3__1__Impl : ( ( rule__Package__ConnectionPoliciesAssignment_5_3_1 ) ) ;
    public final void rule__Package__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1026:1: ( ( ( rule__Package__ConnectionPoliciesAssignment_5_3_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1027:1: ( ( rule__Package__ConnectionPoliciesAssignment_5_3_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1027:1: ( ( rule__Package__ConnectionPoliciesAssignment_5_3_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1028:1: ( rule__Package__ConnectionPoliciesAssignment_5_3_1 )
            {
             before(grammarAccess.getPackageAccess().getConnectionPoliciesAssignment_5_3_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1029:1: ( rule__Package__ConnectionPoliciesAssignment_5_3_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1029:2: rule__Package__ConnectionPoliciesAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__ConnectionPoliciesAssignment_5_3_1_in_rule__Package__Group_5_3__1__Impl2024);
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


    // $ANTLR start "rule__TaskContext__Group__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1043:1: rule__TaskContext__Group__0 : rule__TaskContext__Group__0__Impl rule__TaskContext__Group__1 ;
    public final void rule__TaskContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1047:1: ( rule__TaskContext__Group__0__Impl rule__TaskContext__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1048:2: rule__TaskContext__Group__0__Impl rule__TaskContext__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__0__Impl_in_rule__TaskContext__Group__02058);
            rule__TaskContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__1_in_rule__TaskContext__Group__02061);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1055:1: rule__TaskContext__Group__0__Impl : ( 'TaskContext' ) ;
    public final void rule__TaskContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1059:1: ( ( 'TaskContext' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1060:1: ( 'TaskContext' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1060:1: ( 'TaskContext' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1061:1: 'TaskContext'
            {
             before(grammarAccess.getTaskContextAccess().getTaskContextKeyword_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__TaskContext__Group__0__Impl2089); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1074:1: rule__TaskContext__Group__1 : rule__TaskContext__Group__1__Impl rule__TaskContext__Group__2 ;
    public final void rule__TaskContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1078:1: ( rule__TaskContext__Group__1__Impl rule__TaskContext__Group__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1079:2: rule__TaskContext__Group__1__Impl rule__TaskContext__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__1__Impl_in_rule__TaskContext__Group__12120);
            rule__TaskContext__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__2_in_rule__TaskContext__Group__12123);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1086:1: rule__TaskContext__Group__1__Impl : ( ( rule__TaskContext__NameAssignment_1 ) ) ;
    public final void rule__TaskContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1090:1: ( ( ( rule__TaskContext__NameAssignment_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1091:1: ( ( rule__TaskContext__NameAssignment_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1091:1: ( ( rule__TaskContext__NameAssignment_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1092:1: ( rule__TaskContext__NameAssignment_1 )
            {
             before(grammarAccess.getTaskContextAccess().getNameAssignment_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1093:1: ( rule__TaskContext__NameAssignment_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1093:2: rule__TaskContext__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__NameAssignment_1_in_rule__TaskContext__Group__1__Impl2150);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1103:1: rule__TaskContext__Group__2 : rule__TaskContext__Group__2__Impl rule__TaskContext__Group__3 ;
    public final void rule__TaskContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1107:1: ( rule__TaskContext__Group__2__Impl rule__TaskContext__Group__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1108:2: rule__TaskContext__Group__2__Impl rule__TaskContext__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__2__Impl_in_rule__TaskContext__Group__22180);
            rule__TaskContext__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__3_in_rule__TaskContext__Group__22183);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1115:1: rule__TaskContext__Group__2__Impl : ( '{' ) ;
    public final void rule__TaskContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1119:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1120:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1120:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1121:1: '{'
            {
             before(grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__TaskContext__Group__2__Impl2211); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1134:1: rule__TaskContext__Group__3 : rule__TaskContext__Group__3__Impl rule__TaskContext__Group__4 ;
    public final void rule__TaskContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1138:1: ( rule__TaskContext__Group__3__Impl rule__TaskContext__Group__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1139:2: rule__TaskContext__Group__3__Impl rule__TaskContext__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__3__Impl_in_rule__TaskContext__Group__32242);
            rule__TaskContext__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__4_in_rule__TaskContext__Group__32245);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1146:1: rule__TaskContext__Group__3__Impl : ( 'namespace' ) ;
    public final void rule__TaskContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1150:1: ( ( 'namespace' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1151:1: ( 'namespace' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1151:1: ( 'namespace' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1152:1: 'namespace'
            {
             before(grammarAccess.getTaskContextAccess().getNamespaceKeyword_3()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__TaskContext__Group__3__Impl2273); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1165:1: rule__TaskContext__Group__4 : rule__TaskContext__Group__4__Impl rule__TaskContext__Group__5 ;
    public final void rule__TaskContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1169:1: ( rule__TaskContext__Group__4__Impl rule__TaskContext__Group__5 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1170:2: rule__TaskContext__Group__4__Impl rule__TaskContext__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__4__Impl_in_rule__TaskContext__Group__42304);
            rule__TaskContext__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__5_in_rule__TaskContext__Group__42307);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1177:1: rule__TaskContext__Group__4__Impl : ( ( rule__TaskContext__NamespaceAssignment_4 ) ) ;
    public final void rule__TaskContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1181:1: ( ( ( rule__TaskContext__NamespaceAssignment_4 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1182:1: ( ( rule__TaskContext__NamespaceAssignment_4 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1182:1: ( ( rule__TaskContext__NamespaceAssignment_4 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1183:1: ( rule__TaskContext__NamespaceAssignment_4 )
            {
             before(grammarAccess.getTaskContextAccess().getNamespaceAssignment_4()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1184:1: ( rule__TaskContext__NamespaceAssignment_4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1184:2: rule__TaskContext__NamespaceAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__NamespaceAssignment_4_in_rule__TaskContext__Group__4__Impl2334);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1194:1: rule__TaskContext__Group__5 : rule__TaskContext__Group__5__Impl rule__TaskContext__Group__6 ;
    public final void rule__TaskContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1198:1: ( rule__TaskContext__Group__5__Impl rule__TaskContext__Group__6 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1199:2: rule__TaskContext__Group__5__Impl rule__TaskContext__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__5__Impl_in_rule__TaskContext__Group__52364);
            rule__TaskContext__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__6_in_rule__TaskContext__Group__52367);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1206:1: rule__TaskContext__Group__5__Impl : ( 'type' ) ;
    public final void rule__TaskContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1210:1: ( ( 'type' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1211:1: ( 'type' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1211:1: ( 'type' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1212:1: 'type'
            {
             before(grammarAccess.getTaskContextAccess().getTypeKeyword_5()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__TaskContext__Group__5__Impl2395); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1225:1: rule__TaskContext__Group__6 : rule__TaskContext__Group__6__Impl rule__TaskContext__Group__7 ;
    public final void rule__TaskContext__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1229:1: ( rule__TaskContext__Group__6__Impl rule__TaskContext__Group__7 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1230:2: rule__TaskContext__Group__6__Impl rule__TaskContext__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__6__Impl_in_rule__TaskContext__Group__62426);
            rule__TaskContext__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__7_in_rule__TaskContext__Group__62429);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1237:1: rule__TaskContext__Group__6__Impl : ( ( rule__TaskContext__TypeAssignment_6 ) ) ;
    public final void rule__TaskContext__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1241:1: ( ( ( rule__TaskContext__TypeAssignment_6 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1242:1: ( ( rule__TaskContext__TypeAssignment_6 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1242:1: ( ( rule__TaskContext__TypeAssignment_6 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1243:1: ( rule__TaskContext__TypeAssignment_6 )
            {
             before(grammarAccess.getTaskContextAccess().getTypeAssignment_6()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1244:1: ( rule__TaskContext__TypeAssignment_6 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1244:2: rule__TaskContext__TypeAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__TypeAssignment_6_in_rule__TaskContext__Group__6__Impl2456);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1254:1: rule__TaskContext__Group__7 : rule__TaskContext__Group__7__Impl rule__TaskContext__Group__8 ;
    public final void rule__TaskContext__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1258:1: ( rule__TaskContext__Group__7__Impl rule__TaskContext__Group__8 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1259:2: rule__TaskContext__Group__7__Impl rule__TaskContext__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__7__Impl_in_rule__TaskContext__Group__72486);
            rule__TaskContext__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__8_in_rule__TaskContext__Group__72489);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1266:1: rule__TaskContext__Group__7__Impl : ( ( rule__TaskContext__Group_7__0 )? ) ;
    public final void rule__TaskContext__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1270:1: ( ( ( rule__TaskContext__Group_7__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1271:1: ( ( rule__TaskContext__Group_7__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1271:1: ( ( rule__TaskContext__Group_7__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1272:1: ( rule__TaskContext__Group_7__0 )?
            {
             before(grammarAccess.getTaskContextAccess().getGroup_7()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1273:1: ( rule__TaskContext__Group_7__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1273:2: rule__TaskContext__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7__0_in_rule__TaskContext__Group__7__Impl2516);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1283:1: rule__TaskContext__Group__8 : rule__TaskContext__Group__8__Impl rule__TaskContext__Group__9 ;
    public final void rule__TaskContext__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1287:1: ( rule__TaskContext__Group__8__Impl rule__TaskContext__Group__9 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1288:2: rule__TaskContext__Group__8__Impl rule__TaskContext__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__8__Impl_in_rule__TaskContext__Group__82547);
            rule__TaskContext__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__9_in_rule__TaskContext__Group__82550);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1295:1: rule__TaskContext__Group__8__Impl : ( ( rule__TaskContext__Group_8__0 )? ) ;
    public final void rule__TaskContext__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1299:1: ( ( ( rule__TaskContext__Group_8__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1300:1: ( ( rule__TaskContext__Group_8__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1300:1: ( ( rule__TaskContext__Group_8__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1301:1: ( rule__TaskContext__Group_8__0 )?
            {
             before(grammarAccess.getTaskContextAccess().getGroup_8()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1302:1: ( rule__TaskContext__Group_8__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1302:2: rule__TaskContext__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8__0_in_rule__TaskContext__Group__8__Impl2577);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1312:1: rule__TaskContext__Group__9 : rule__TaskContext__Group__9__Impl ;
    public final void rule__TaskContext__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1316:1: ( rule__TaskContext__Group__9__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1317:2: rule__TaskContext__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__9__Impl_in_rule__TaskContext__Group__92608);
            rule__TaskContext__Group__9__Impl();

            state._fsp--;


            }

        }
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1323:1: rule__TaskContext__Group__9__Impl : ( '}' ) ;
    public final void rule__TaskContext__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1327:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1328:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1328:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1329:1: '}'
            {
             before(grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_9()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__TaskContext__Group__9__Impl2636); 
             after(grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
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


    // $ANTLR start "rule__TaskContext__Group_7__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1362:1: rule__TaskContext__Group_7__0 : rule__TaskContext__Group_7__0__Impl rule__TaskContext__Group_7__1 ;
    public final void rule__TaskContext__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1366:1: ( rule__TaskContext__Group_7__0__Impl rule__TaskContext__Group_7__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1367:2: rule__TaskContext__Group_7__0__Impl rule__TaskContext__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7__0__Impl_in_rule__TaskContext__Group_7__02687);
            rule__TaskContext__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7__1_in_rule__TaskContext__Group_7__02690);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1374:1: rule__TaskContext__Group_7__0__Impl : ( 'inputPorts' ) ;
    public final void rule__TaskContext__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1378:1: ( ( 'inputPorts' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1379:1: ( 'inputPorts' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1379:1: ( 'inputPorts' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1380:1: 'inputPorts'
            {
             before(grammarAccess.getTaskContextAccess().getInputPortsKeyword_7_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__TaskContext__Group_7__0__Impl2718); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1393:1: rule__TaskContext__Group_7__1 : rule__TaskContext__Group_7__1__Impl rule__TaskContext__Group_7__2 ;
    public final void rule__TaskContext__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1397:1: ( rule__TaskContext__Group_7__1__Impl rule__TaskContext__Group_7__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1398:2: rule__TaskContext__Group_7__1__Impl rule__TaskContext__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7__1__Impl_in_rule__TaskContext__Group_7__12749);
            rule__TaskContext__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7__2_in_rule__TaskContext__Group_7__12752);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1405:1: rule__TaskContext__Group_7__1__Impl : ( '{' ) ;
    public final void rule__TaskContext__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1409:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1410:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1410:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1411:1: '{'
            {
             before(grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__TaskContext__Group_7__1__Impl2780); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1424:1: rule__TaskContext__Group_7__2 : rule__TaskContext__Group_7__2__Impl rule__TaskContext__Group_7__3 ;
    public final void rule__TaskContext__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1428:1: ( rule__TaskContext__Group_7__2__Impl rule__TaskContext__Group_7__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1429:2: rule__TaskContext__Group_7__2__Impl rule__TaskContext__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7__2__Impl_in_rule__TaskContext__Group_7__22811);
            rule__TaskContext__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7__3_in_rule__TaskContext__Group_7__22814);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1436:1: rule__TaskContext__Group_7__2__Impl : ( ( rule__TaskContext__InputPortsAssignment_7_2 ) ) ;
    public final void rule__TaskContext__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1440:1: ( ( ( rule__TaskContext__InputPortsAssignment_7_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1441:1: ( ( rule__TaskContext__InputPortsAssignment_7_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1441:1: ( ( rule__TaskContext__InputPortsAssignment_7_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1442:1: ( rule__TaskContext__InputPortsAssignment_7_2 )
            {
             before(grammarAccess.getTaskContextAccess().getInputPortsAssignment_7_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1443:1: ( rule__TaskContext__InputPortsAssignment_7_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1443:2: rule__TaskContext__InputPortsAssignment_7_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__InputPortsAssignment_7_2_in_rule__TaskContext__Group_7__2__Impl2841);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1453:1: rule__TaskContext__Group_7__3 : rule__TaskContext__Group_7__3__Impl rule__TaskContext__Group_7__4 ;
    public final void rule__TaskContext__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1457:1: ( rule__TaskContext__Group_7__3__Impl rule__TaskContext__Group_7__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1458:2: rule__TaskContext__Group_7__3__Impl rule__TaskContext__Group_7__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7__3__Impl_in_rule__TaskContext__Group_7__32871);
            rule__TaskContext__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7__4_in_rule__TaskContext__Group_7__32874);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1465:1: rule__TaskContext__Group_7__3__Impl : ( ( rule__TaskContext__Group_7_3__0 )* ) ;
    public final void rule__TaskContext__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1469:1: ( ( ( rule__TaskContext__Group_7_3__0 )* ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1470:1: ( ( rule__TaskContext__Group_7_3__0 )* )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1470:1: ( ( rule__TaskContext__Group_7_3__0 )* )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1471:1: ( rule__TaskContext__Group_7_3__0 )*
            {
             before(grammarAccess.getTaskContextAccess().getGroup_7_3()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1472:1: ( rule__TaskContext__Group_7_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1472:2: rule__TaskContext__Group_7_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7_3__0_in_rule__TaskContext__Group_7__3__Impl2901);
            	    rule__TaskContext__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1482:1: rule__TaskContext__Group_7__4 : rule__TaskContext__Group_7__4__Impl ;
    public final void rule__TaskContext__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1486:1: ( rule__TaskContext__Group_7__4__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1487:2: rule__TaskContext__Group_7__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7__4__Impl_in_rule__TaskContext__Group_7__42932);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1493:1: rule__TaskContext__Group_7__4__Impl : ( '}' ) ;
    public final void rule__TaskContext__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1497:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1498:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1498:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1499:1: '}'
            {
             before(grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__TaskContext__Group_7__4__Impl2960); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1522:1: rule__TaskContext__Group_7_3__0 : rule__TaskContext__Group_7_3__0__Impl rule__TaskContext__Group_7_3__1 ;
    public final void rule__TaskContext__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1526:1: ( rule__TaskContext__Group_7_3__0__Impl rule__TaskContext__Group_7_3__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1527:2: rule__TaskContext__Group_7_3__0__Impl rule__TaskContext__Group_7_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7_3__0__Impl_in_rule__TaskContext__Group_7_3__03001);
            rule__TaskContext__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7_3__1_in_rule__TaskContext__Group_7_3__03004);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1534:1: rule__TaskContext__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__TaskContext__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1538:1: ( ( ',' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1539:1: ( ',' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1539:1: ( ',' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1540:1: ','
            {
             before(grammarAccess.getTaskContextAccess().getCommaKeyword_7_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__TaskContext__Group_7_3__0__Impl3032); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1553:1: rule__TaskContext__Group_7_3__1 : rule__TaskContext__Group_7_3__1__Impl ;
    public final void rule__TaskContext__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1557:1: ( rule__TaskContext__Group_7_3__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1558:2: rule__TaskContext__Group_7_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_7_3__1__Impl_in_rule__TaskContext__Group_7_3__13063);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1564:1: rule__TaskContext__Group_7_3__1__Impl : ( ( rule__TaskContext__InputPortsAssignment_7_3_1 ) ) ;
    public final void rule__TaskContext__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1568:1: ( ( ( rule__TaskContext__InputPortsAssignment_7_3_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1569:1: ( ( rule__TaskContext__InputPortsAssignment_7_3_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1569:1: ( ( rule__TaskContext__InputPortsAssignment_7_3_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1570:1: ( rule__TaskContext__InputPortsAssignment_7_3_1 )
            {
             before(grammarAccess.getTaskContextAccess().getInputPortsAssignment_7_3_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1571:1: ( rule__TaskContext__InputPortsAssignment_7_3_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1571:2: rule__TaskContext__InputPortsAssignment_7_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__InputPortsAssignment_7_3_1_in_rule__TaskContext__Group_7_3__1__Impl3090);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1585:1: rule__TaskContext__Group_8__0 : rule__TaskContext__Group_8__0__Impl rule__TaskContext__Group_8__1 ;
    public final void rule__TaskContext__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1589:1: ( rule__TaskContext__Group_8__0__Impl rule__TaskContext__Group_8__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1590:2: rule__TaskContext__Group_8__0__Impl rule__TaskContext__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8__0__Impl_in_rule__TaskContext__Group_8__03124);
            rule__TaskContext__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8__1_in_rule__TaskContext__Group_8__03127);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1597:1: rule__TaskContext__Group_8__0__Impl : ( 'outputPorts' ) ;
    public final void rule__TaskContext__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1601:1: ( ( 'outputPorts' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1602:1: ( 'outputPorts' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1602:1: ( 'outputPorts' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1603:1: 'outputPorts'
            {
             before(grammarAccess.getTaskContextAccess().getOutputPortsKeyword_8_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__TaskContext__Group_8__0__Impl3155); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1616:1: rule__TaskContext__Group_8__1 : rule__TaskContext__Group_8__1__Impl rule__TaskContext__Group_8__2 ;
    public final void rule__TaskContext__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1620:1: ( rule__TaskContext__Group_8__1__Impl rule__TaskContext__Group_8__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1621:2: rule__TaskContext__Group_8__1__Impl rule__TaskContext__Group_8__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8__1__Impl_in_rule__TaskContext__Group_8__13186);
            rule__TaskContext__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8__2_in_rule__TaskContext__Group_8__13189);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1628:1: rule__TaskContext__Group_8__1__Impl : ( '{' ) ;
    public final void rule__TaskContext__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1632:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1633:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1633:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1634:1: '{'
            {
             before(grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__TaskContext__Group_8__1__Impl3217); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1647:1: rule__TaskContext__Group_8__2 : rule__TaskContext__Group_8__2__Impl rule__TaskContext__Group_8__3 ;
    public final void rule__TaskContext__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1651:1: ( rule__TaskContext__Group_8__2__Impl rule__TaskContext__Group_8__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1652:2: rule__TaskContext__Group_8__2__Impl rule__TaskContext__Group_8__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8__2__Impl_in_rule__TaskContext__Group_8__23248);
            rule__TaskContext__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8__3_in_rule__TaskContext__Group_8__23251);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1659:1: rule__TaskContext__Group_8__2__Impl : ( ( rule__TaskContext__OutputPortsAssignment_8_2 ) ) ;
    public final void rule__TaskContext__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1663:1: ( ( ( rule__TaskContext__OutputPortsAssignment_8_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1664:1: ( ( rule__TaskContext__OutputPortsAssignment_8_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1664:1: ( ( rule__TaskContext__OutputPortsAssignment_8_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1665:1: ( rule__TaskContext__OutputPortsAssignment_8_2 )
            {
             before(grammarAccess.getTaskContextAccess().getOutputPortsAssignment_8_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1666:1: ( rule__TaskContext__OutputPortsAssignment_8_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1666:2: rule__TaskContext__OutputPortsAssignment_8_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__OutputPortsAssignment_8_2_in_rule__TaskContext__Group_8__2__Impl3278);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1676:1: rule__TaskContext__Group_8__3 : rule__TaskContext__Group_8__3__Impl rule__TaskContext__Group_8__4 ;
    public final void rule__TaskContext__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1680:1: ( rule__TaskContext__Group_8__3__Impl rule__TaskContext__Group_8__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1681:2: rule__TaskContext__Group_8__3__Impl rule__TaskContext__Group_8__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8__3__Impl_in_rule__TaskContext__Group_8__33308);
            rule__TaskContext__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8__4_in_rule__TaskContext__Group_8__33311);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1688:1: rule__TaskContext__Group_8__3__Impl : ( ( rule__TaskContext__Group_8_3__0 )* ) ;
    public final void rule__TaskContext__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1692:1: ( ( ( rule__TaskContext__Group_8_3__0 )* ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1693:1: ( ( rule__TaskContext__Group_8_3__0 )* )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1693:1: ( ( rule__TaskContext__Group_8_3__0 )* )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1694:1: ( rule__TaskContext__Group_8_3__0 )*
            {
             before(grammarAccess.getTaskContextAccess().getGroup_8_3()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1695:1: ( rule__TaskContext__Group_8_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1695:2: rule__TaskContext__Group_8_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8_3__0_in_rule__TaskContext__Group_8__3__Impl3338);
            	    rule__TaskContext__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1705:1: rule__TaskContext__Group_8__4 : rule__TaskContext__Group_8__4__Impl ;
    public final void rule__TaskContext__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1709:1: ( rule__TaskContext__Group_8__4__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1710:2: rule__TaskContext__Group_8__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8__4__Impl_in_rule__TaskContext__Group_8__43369);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1716:1: rule__TaskContext__Group_8__4__Impl : ( '}' ) ;
    public final void rule__TaskContext__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1720:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1721:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1721:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1722:1: '}'
            {
             before(grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__TaskContext__Group_8__4__Impl3397); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1745:1: rule__TaskContext__Group_8_3__0 : rule__TaskContext__Group_8_3__0__Impl rule__TaskContext__Group_8_3__1 ;
    public final void rule__TaskContext__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1749:1: ( rule__TaskContext__Group_8_3__0__Impl rule__TaskContext__Group_8_3__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1750:2: rule__TaskContext__Group_8_3__0__Impl rule__TaskContext__Group_8_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8_3__0__Impl_in_rule__TaskContext__Group_8_3__03438);
            rule__TaskContext__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8_3__1_in_rule__TaskContext__Group_8_3__03441);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1757:1: rule__TaskContext__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__TaskContext__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1761:1: ( ( ',' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1762:1: ( ',' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1762:1: ( ',' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1763:1: ','
            {
             before(grammarAccess.getTaskContextAccess().getCommaKeyword_8_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__TaskContext__Group_8_3__0__Impl3469); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1776:1: rule__TaskContext__Group_8_3__1 : rule__TaskContext__Group_8_3__1__Impl ;
    public final void rule__TaskContext__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1780:1: ( rule__TaskContext__Group_8_3__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1781:2: rule__TaskContext__Group_8_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group_8_3__1__Impl_in_rule__TaskContext__Group_8_3__13500);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1787:1: rule__TaskContext__Group_8_3__1__Impl : ( ( rule__TaskContext__OutputPortsAssignment_8_3_1 ) ) ;
    public final void rule__TaskContext__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1791:1: ( ( ( rule__TaskContext__OutputPortsAssignment_8_3_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1792:1: ( ( rule__TaskContext__OutputPortsAssignment_8_3_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1792:1: ( ( rule__TaskContext__OutputPortsAssignment_8_3_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1793:1: ( rule__TaskContext__OutputPortsAssignment_8_3_1 )
            {
             before(grammarAccess.getTaskContextAccess().getOutputPortsAssignment_8_3_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1794:1: ( rule__TaskContext__OutputPortsAssignment_8_3_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1794:2: rule__TaskContext__OutputPortsAssignment_8_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__OutputPortsAssignment_8_3_1_in_rule__TaskContext__Group_8_3__1__Impl3527);
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


    // $ANTLR start "rule__ConnectionPolicy__Group__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1808:1: rule__ConnectionPolicy__Group__0 : rule__ConnectionPolicy__Group__0__Impl rule__ConnectionPolicy__Group__1 ;
    public final void rule__ConnectionPolicy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1812:1: ( rule__ConnectionPolicy__Group__0__Impl rule__ConnectionPolicy__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1813:2: rule__ConnectionPolicy__Group__0__Impl rule__ConnectionPolicy__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__0__Impl_in_rule__ConnectionPolicy__Group__03561);
            rule__ConnectionPolicy__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__1_in_rule__ConnectionPolicy__Group__03564);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1820:1: rule__ConnectionPolicy__Group__0__Impl : ( 'ConnectionPolicy' ) ;
    public final void rule__ConnectionPolicy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1824:1: ( ( 'ConnectionPolicy' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1825:1: ( 'ConnectionPolicy' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1825:1: ( 'ConnectionPolicy' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1826:1: 'ConnectionPolicy'
            {
             before(grammarAccess.getConnectionPolicyAccess().getConnectionPolicyKeyword_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__ConnectionPolicy__Group__0__Impl3592); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1839:1: rule__ConnectionPolicy__Group__1 : rule__ConnectionPolicy__Group__1__Impl rule__ConnectionPolicy__Group__2 ;
    public final void rule__ConnectionPolicy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1843:1: ( rule__ConnectionPolicy__Group__1__Impl rule__ConnectionPolicy__Group__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1844:2: rule__ConnectionPolicy__Group__1__Impl rule__ConnectionPolicy__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__1__Impl_in_rule__ConnectionPolicy__Group__13623);
            rule__ConnectionPolicy__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__2_in_rule__ConnectionPolicy__Group__13626);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1851:1: rule__ConnectionPolicy__Group__1__Impl : ( ( rule__ConnectionPolicy__NameAssignment_1 ) ) ;
    public final void rule__ConnectionPolicy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1855:1: ( ( ( rule__ConnectionPolicy__NameAssignment_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1856:1: ( ( rule__ConnectionPolicy__NameAssignment_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1856:1: ( ( rule__ConnectionPolicy__NameAssignment_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1857:1: ( rule__ConnectionPolicy__NameAssignment_1 )
            {
             before(grammarAccess.getConnectionPolicyAccess().getNameAssignment_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1858:1: ( rule__ConnectionPolicy__NameAssignment_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1858:2: rule__ConnectionPolicy__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__NameAssignment_1_in_rule__ConnectionPolicy__Group__1__Impl3653);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1868:1: rule__ConnectionPolicy__Group__2 : rule__ConnectionPolicy__Group__2__Impl rule__ConnectionPolicy__Group__3 ;
    public final void rule__ConnectionPolicy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1872:1: ( rule__ConnectionPolicy__Group__2__Impl rule__ConnectionPolicy__Group__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1873:2: rule__ConnectionPolicy__Group__2__Impl rule__ConnectionPolicy__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__2__Impl_in_rule__ConnectionPolicy__Group__23683);
            rule__ConnectionPolicy__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__3_in_rule__ConnectionPolicy__Group__23686);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1880:1: rule__ConnectionPolicy__Group__2__Impl : ( '{' ) ;
    public final void rule__ConnectionPolicy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1884:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1885:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1885:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1886:1: '{'
            {
             before(grammarAccess.getConnectionPolicyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__ConnectionPolicy__Group__2__Impl3714); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1899:1: rule__ConnectionPolicy__Group__3 : rule__ConnectionPolicy__Group__3__Impl rule__ConnectionPolicy__Group__4 ;
    public final void rule__ConnectionPolicy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1903:1: ( rule__ConnectionPolicy__Group__3__Impl rule__ConnectionPolicy__Group__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1904:2: rule__ConnectionPolicy__Group__3__Impl rule__ConnectionPolicy__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__3__Impl_in_rule__ConnectionPolicy__Group__33745);
            rule__ConnectionPolicy__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__4_in_rule__ConnectionPolicy__Group__33748);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1911:1: rule__ConnectionPolicy__Group__3__Impl : ( ( rule__ConnectionPolicy__Group_3__0 )? ) ;
    public final void rule__ConnectionPolicy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1915:1: ( ( ( rule__ConnectionPolicy__Group_3__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1916:1: ( ( rule__ConnectionPolicy__Group_3__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1916:1: ( ( rule__ConnectionPolicy__Group_3__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1917:1: ( rule__ConnectionPolicy__Group_3__0 )?
            {
             before(grammarAccess.getConnectionPolicyAccess().getGroup_3()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1918:1: ( rule__ConnectionPolicy__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1918:2: rule__ConnectionPolicy__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_3__0_in_rule__ConnectionPolicy__Group__3__Impl3775);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1928:1: rule__ConnectionPolicy__Group__4 : rule__ConnectionPolicy__Group__4__Impl rule__ConnectionPolicy__Group__5 ;
    public final void rule__ConnectionPolicy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1932:1: ( rule__ConnectionPolicy__Group__4__Impl rule__ConnectionPolicy__Group__5 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1933:2: rule__ConnectionPolicy__Group__4__Impl rule__ConnectionPolicy__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__4__Impl_in_rule__ConnectionPolicy__Group__43806);
            rule__ConnectionPolicy__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__5_in_rule__ConnectionPolicy__Group__43809);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1940:1: rule__ConnectionPolicy__Group__4__Impl : ( ( rule__ConnectionPolicy__Group_4__0 )? ) ;
    public final void rule__ConnectionPolicy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1944:1: ( ( ( rule__ConnectionPolicy__Group_4__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1945:1: ( ( rule__ConnectionPolicy__Group_4__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1945:1: ( ( rule__ConnectionPolicy__Group_4__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1946:1: ( rule__ConnectionPolicy__Group_4__0 )?
            {
             before(grammarAccess.getConnectionPolicyAccess().getGroup_4()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1947:1: ( rule__ConnectionPolicy__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1947:2: rule__ConnectionPolicy__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_4__0_in_rule__ConnectionPolicy__Group__4__Impl3836);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1957:1: rule__ConnectionPolicy__Group__5 : rule__ConnectionPolicy__Group__5__Impl rule__ConnectionPolicy__Group__6 ;
    public final void rule__ConnectionPolicy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1961:1: ( rule__ConnectionPolicy__Group__5__Impl rule__ConnectionPolicy__Group__6 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1962:2: rule__ConnectionPolicy__Group__5__Impl rule__ConnectionPolicy__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__5__Impl_in_rule__ConnectionPolicy__Group__53867);
            rule__ConnectionPolicy__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__6_in_rule__ConnectionPolicy__Group__53870);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1969:1: rule__ConnectionPolicy__Group__5__Impl : ( ( rule__ConnectionPolicy__Group_5__0 )? ) ;
    public final void rule__ConnectionPolicy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1973:1: ( ( ( rule__ConnectionPolicy__Group_5__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1974:1: ( ( rule__ConnectionPolicy__Group_5__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1974:1: ( ( rule__ConnectionPolicy__Group_5__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1975:1: ( rule__ConnectionPolicy__Group_5__0 )?
            {
             before(grammarAccess.getConnectionPolicyAccess().getGroup_5()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1976:1: ( rule__ConnectionPolicy__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1976:2: rule__ConnectionPolicy__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_5__0_in_rule__ConnectionPolicy__Group__5__Impl3897);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1986:1: rule__ConnectionPolicy__Group__6 : rule__ConnectionPolicy__Group__6__Impl rule__ConnectionPolicy__Group__7 ;
    public final void rule__ConnectionPolicy__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1990:1: ( rule__ConnectionPolicy__Group__6__Impl rule__ConnectionPolicy__Group__7 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1991:2: rule__ConnectionPolicy__Group__6__Impl rule__ConnectionPolicy__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__6__Impl_in_rule__ConnectionPolicy__Group__63928);
            rule__ConnectionPolicy__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__7_in_rule__ConnectionPolicy__Group__63931);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:1998:1: rule__ConnectionPolicy__Group__6__Impl : ( 'inputPort' ) ;
    public final void rule__ConnectionPolicy__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2002:1: ( ( 'inputPort' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2003:1: ( 'inputPort' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2003:1: ( 'inputPort' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2004:1: 'inputPort'
            {
             before(grammarAccess.getConnectionPolicyAccess().getInputPortKeyword_6()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__ConnectionPolicy__Group__6__Impl3959); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2017:1: rule__ConnectionPolicy__Group__7 : rule__ConnectionPolicy__Group__7__Impl rule__ConnectionPolicy__Group__8 ;
    public final void rule__ConnectionPolicy__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2021:1: ( rule__ConnectionPolicy__Group__7__Impl rule__ConnectionPolicy__Group__8 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2022:2: rule__ConnectionPolicy__Group__7__Impl rule__ConnectionPolicy__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__7__Impl_in_rule__ConnectionPolicy__Group__73990);
            rule__ConnectionPolicy__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__8_in_rule__ConnectionPolicy__Group__73993);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2029:1: rule__ConnectionPolicy__Group__7__Impl : ( ( rule__ConnectionPolicy__InputPortAssignment_7 ) ) ;
    public final void rule__ConnectionPolicy__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2033:1: ( ( ( rule__ConnectionPolicy__InputPortAssignment_7 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2034:1: ( ( rule__ConnectionPolicy__InputPortAssignment_7 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2034:1: ( ( rule__ConnectionPolicy__InputPortAssignment_7 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2035:1: ( rule__ConnectionPolicy__InputPortAssignment_7 )
            {
             before(grammarAccess.getConnectionPolicyAccess().getInputPortAssignment_7()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2036:1: ( rule__ConnectionPolicy__InputPortAssignment_7 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2036:2: rule__ConnectionPolicy__InputPortAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__InputPortAssignment_7_in_rule__ConnectionPolicy__Group__7__Impl4020);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2046:1: rule__ConnectionPolicy__Group__8 : rule__ConnectionPolicy__Group__8__Impl rule__ConnectionPolicy__Group__9 ;
    public final void rule__ConnectionPolicy__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2050:1: ( rule__ConnectionPolicy__Group__8__Impl rule__ConnectionPolicy__Group__9 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2051:2: rule__ConnectionPolicy__Group__8__Impl rule__ConnectionPolicy__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__8__Impl_in_rule__ConnectionPolicy__Group__84050);
            rule__ConnectionPolicy__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__9_in_rule__ConnectionPolicy__Group__84053);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2058:1: rule__ConnectionPolicy__Group__8__Impl : ( 'outputPort' ) ;
    public final void rule__ConnectionPolicy__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2062:1: ( ( 'outputPort' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2063:1: ( 'outputPort' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2063:1: ( 'outputPort' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2064:1: 'outputPort'
            {
             before(grammarAccess.getConnectionPolicyAccess().getOutputPortKeyword_8()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__ConnectionPolicy__Group__8__Impl4081); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2077:1: rule__ConnectionPolicy__Group__9 : rule__ConnectionPolicy__Group__9__Impl rule__ConnectionPolicy__Group__10 ;
    public final void rule__ConnectionPolicy__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2081:1: ( rule__ConnectionPolicy__Group__9__Impl rule__ConnectionPolicy__Group__10 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2082:2: rule__ConnectionPolicy__Group__9__Impl rule__ConnectionPolicy__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__9__Impl_in_rule__ConnectionPolicy__Group__94112);
            rule__ConnectionPolicy__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__10_in_rule__ConnectionPolicy__Group__94115);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2089:1: rule__ConnectionPolicy__Group__9__Impl : ( ( rule__ConnectionPolicy__OutputPortAssignment_9 ) ) ;
    public final void rule__ConnectionPolicy__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2093:1: ( ( ( rule__ConnectionPolicy__OutputPortAssignment_9 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2094:1: ( ( rule__ConnectionPolicy__OutputPortAssignment_9 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2094:1: ( ( rule__ConnectionPolicy__OutputPortAssignment_9 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2095:1: ( rule__ConnectionPolicy__OutputPortAssignment_9 )
            {
             before(grammarAccess.getConnectionPolicyAccess().getOutputPortAssignment_9()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2096:1: ( rule__ConnectionPolicy__OutputPortAssignment_9 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2096:2: rule__ConnectionPolicy__OutputPortAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__OutputPortAssignment_9_in_rule__ConnectionPolicy__Group__9__Impl4142);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2106:1: rule__ConnectionPolicy__Group__10 : rule__ConnectionPolicy__Group__10__Impl ;
    public final void rule__ConnectionPolicy__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2110:1: ( rule__ConnectionPolicy__Group__10__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2111:2: rule__ConnectionPolicy__Group__10__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group__10__Impl_in_rule__ConnectionPolicy__Group__104172);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2117:1: rule__ConnectionPolicy__Group__10__Impl : ( '}' ) ;
    public final void rule__ConnectionPolicy__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2121:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2122:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2122:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2123:1: '}'
            {
             before(grammarAccess.getConnectionPolicyAccess().getRightCurlyBracketKeyword_10()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__ConnectionPolicy__Group__10__Impl4200); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2158:1: rule__ConnectionPolicy__Group_3__0 : rule__ConnectionPolicy__Group_3__0__Impl rule__ConnectionPolicy__Group_3__1 ;
    public final void rule__ConnectionPolicy__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2162:1: ( rule__ConnectionPolicy__Group_3__0__Impl rule__ConnectionPolicy__Group_3__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2163:2: rule__ConnectionPolicy__Group_3__0__Impl rule__ConnectionPolicy__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_3__0__Impl_in_rule__ConnectionPolicy__Group_3__04253);
            rule__ConnectionPolicy__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_3__1_in_rule__ConnectionPolicy__Group_3__04256);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2170:1: rule__ConnectionPolicy__Group_3__0__Impl : ( 'bufferSize' ) ;
    public final void rule__ConnectionPolicy__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2174:1: ( ( 'bufferSize' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2175:1: ( 'bufferSize' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2175:1: ( 'bufferSize' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2176:1: 'bufferSize'
            {
             before(grammarAccess.getConnectionPolicyAccess().getBufferSizeKeyword_3_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__ConnectionPolicy__Group_3__0__Impl4284); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2189:1: rule__ConnectionPolicy__Group_3__1 : rule__ConnectionPolicy__Group_3__1__Impl ;
    public final void rule__ConnectionPolicy__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2193:1: ( rule__ConnectionPolicy__Group_3__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2194:2: rule__ConnectionPolicy__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_3__1__Impl_in_rule__ConnectionPolicy__Group_3__14315);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2200:1: rule__ConnectionPolicy__Group_3__1__Impl : ( ( rule__ConnectionPolicy__BufferSizeAssignment_3_1 ) ) ;
    public final void rule__ConnectionPolicy__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2204:1: ( ( ( rule__ConnectionPolicy__BufferSizeAssignment_3_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2205:1: ( ( rule__ConnectionPolicy__BufferSizeAssignment_3_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2205:1: ( ( rule__ConnectionPolicy__BufferSizeAssignment_3_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2206:1: ( rule__ConnectionPolicy__BufferSizeAssignment_3_1 )
            {
             before(grammarAccess.getConnectionPolicyAccess().getBufferSizeAssignment_3_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2207:1: ( rule__ConnectionPolicy__BufferSizeAssignment_3_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2207:2: rule__ConnectionPolicy__BufferSizeAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__BufferSizeAssignment_3_1_in_rule__ConnectionPolicy__Group_3__1__Impl4342);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2221:1: rule__ConnectionPolicy__Group_4__0 : rule__ConnectionPolicy__Group_4__0__Impl rule__ConnectionPolicy__Group_4__1 ;
    public final void rule__ConnectionPolicy__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2225:1: ( rule__ConnectionPolicy__Group_4__0__Impl rule__ConnectionPolicy__Group_4__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2226:2: rule__ConnectionPolicy__Group_4__0__Impl rule__ConnectionPolicy__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_4__0__Impl_in_rule__ConnectionPolicy__Group_4__04376);
            rule__ConnectionPolicy__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_4__1_in_rule__ConnectionPolicy__Group_4__04379);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2233:1: rule__ConnectionPolicy__Group_4__0__Impl : ( 'lockPolicy' ) ;
    public final void rule__ConnectionPolicy__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2237:1: ( ( 'lockPolicy' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2238:1: ( 'lockPolicy' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2238:1: ( 'lockPolicy' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2239:1: 'lockPolicy'
            {
             before(grammarAccess.getConnectionPolicyAccess().getLockPolicyKeyword_4_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__ConnectionPolicy__Group_4__0__Impl4407); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2252:1: rule__ConnectionPolicy__Group_4__1 : rule__ConnectionPolicy__Group_4__1__Impl ;
    public final void rule__ConnectionPolicy__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2256:1: ( rule__ConnectionPolicy__Group_4__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2257:2: rule__ConnectionPolicy__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_4__1__Impl_in_rule__ConnectionPolicy__Group_4__14438);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2263:1: rule__ConnectionPolicy__Group_4__1__Impl : ( ( rule__ConnectionPolicy__LockPolicyAssignment_4_1 ) ) ;
    public final void rule__ConnectionPolicy__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2267:1: ( ( ( rule__ConnectionPolicy__LockPolicyAssignment_4_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2268:1: ( ( rule__ConnectionPolicy__LockPolicyAssignment_4_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2268:1: ( ( rule__ConnectionPolicy__LockPolicyAssignment_4_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2269:1: ( rule__ConnectionPolicy__LockPolicyAssignment_4_1 )
            {
             before(grammarAccess.getConnectionPolicyAccess().getLockPolicyAssignment_4_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2270:1: ( rule__ConnectionPolicy__LockPolicyAssignment_4_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2270:2: rule__ConnectionPolicy__LockPolicyAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__LockPolicyAssignment_4_1_in_rule__ConnectionPolicy__Group_4__1__Impl4465);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2284:1: rule__ConnectionPolicy__Group_5__0 : rule__ConnectionPolicy__Group_5__0__Impl rule__ConnectionPolicy__Group_5__1 ;
    public final void rule__ConnectionPolicy__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2288:1: ( rule__ConnectionPolicy__Group_5__0__Impl rule__ConnectionPolicy__Group_5__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2289:2: rule__ConnectionPolicy__Group_5__0__Impl rule__ConnectionPolicy__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_5__0__Impl_in_rule__ConnectionPolicy__Group_5__04499);
            rule__ConnectionPolicy__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_5__1_in_rule__ConnectionPolicy__Group_5__04502);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2296:1: rule__ConnectionPolicy__Group_5__0__Impl : ( 'type' ) ;
    public final void rule__ConnectionPolicy__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2300:1: ( ( 'type' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2301:1: ( 'type' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2301:1: ( 'type' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2302:1: 'type'
            {
             before(grammarAccess.getConnectionPolicyAccess().getTypeKeyword_5_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__ConnectionPolicy__Group_5__0__Impl4530); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2315:1: rule__ConnectionPolicy__Group_5__1 : rule__ConnectionPolicy__Group_5__1__Impl ;
    public final void rule__ConnectionPolicy__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2319:1: ( rule__ConnectionPolicy__Group_5__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2320:2: rule__ConnectionPolicy__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__Group_5__1__Impl_in_rule__ConnectionPolicy__Group_5__14561);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2326:1: rule__ConnectionPolicy__Group_5__1__Impl : ( ( rule__ConnectionPolicy__TypeAssignment_5_1 ) ) ;
    public final void rule__ConnectionPolicy__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2330:1: ( ( ( rule__ConnectionPolicy__TypeAssignment_5_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2331:1: ( ( rule__ConnectionPolicy__TypeAssignment_5_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2331:1: ( ( rule__ConnectionPolicy__TypeAssignment_5_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2332:1: ( rule__ConnectionPolicy__TypeAssignment_5_1 )
            {
             before(grammarAccess.getConnectionPolicyAccess().getTypeAssignment_5_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2333:1: ( rule__ConnectionPolicy__TypeAssignment_5_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2333:2: rule__ConnectionPolicy__TypeAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConnectionPolicy__TypeAssignment_5_1_in_rule__ConnectionPolicy__Group_5__1__Impl4588);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2347:1: rule__InputPort__Group__0 : rule__InputPort__Group__0__Impl rule__InputPort__Group__1 ;
    public final void rule__InputPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2351:1: ( rule__InputPort__Group__0__Impl rule__InputPort__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2352:2: rule__InputPort__Group__0__Impl rule__InputPort__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__0__Impl_in_rule__InputPort__Group__04622);
            rule__InputPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__1_in_rule__InputPort__Group__04625);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2359:1: rule__InputPort__Group__0__Impl : ( ( rule__InputPort__IsEventPortAssignment_0 ) ) ;
    public final void rule__InputPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2363:1: ( ( ( rule__InputPort__IsEventPortAssignment_0 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2364:1: ( ( rule__InputPort__IsEventPortAssignment_0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2364:1: ( ( rule__InputPort__IsEventPortAssignment_0 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2365:1: ( rule__InputPort__IsEventPortAssignment_0 )
            {
             before(grammarAccess.getInputPortAccess().getIsEventPortAssignment_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2366:1: ( rule__InputPort__IsEventPortAssignment_0 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2366:2: rule__InputPort__IsEventPortAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__IsEventPortAssignment_0_in_rule__InputPort__Group__0__Impl4652);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2376:1: rule__InputPort__Group__1 : rule__InputPort__Group__1__Impl rule__InputPort__Group__2 ;
    public final void rule__InputPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2380:1: ( rule__InputPort__Group__1__Impl rule__InputPort__Group__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2381:2: rule__InputPort__Group__1__Impl rule__InputPort__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__1__Impl_in_rule__InputPort__Group__14682);
            rule__InputPort__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__2_in_rule__InputPort__Group__14685);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2388:1: rule__InputPort__Group__1__Impl : ( 'InputPort' ) ;
    public final void rule__InputPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2392:1: ( ( 'InputPort' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2393:1: ( 'InputPort' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2393:1: ( 'InputPort' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2394:1: 'InputPort'
            {
             before(grammarAccess.getInputPortAccess().getInputPortKeyword_1()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__InputPort__Group__1__Impl4713); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2407:1: rule__InputPort__Group__2 : rule__InputPort__Group__2__Impl rule__InputPort__Group__3 ;
    public final void rule__InputPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2411:1: ( rule__InputPort__Group__2__Impl rule__InputPort__Group__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2412:2: rule__InputPort__Group__2__Impl rule__InputPort__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__2__Impl_in_rule__InputPort__Group__24744);
            rule__InputPort__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__3_in_rule__InputPort__Group__24747);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2419:1: rule__InputPort__Group__2__Impl : ( ( rule__InputPort__NameAssignment_2 ) ) ;
    public final void rule__InputPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2423:1: ( ( ( rule__InputPort__NameAssignment_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2424:1: ( ( rule__InputPort__NameAssignment_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2424:1: ( ( rule__InputPort__NameAssignment_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2425:1: ( rule__InputPort__NameAssignment_2 )
            {
             before(grammarAccess.getInputPortAccess().getNameAssignment_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2426:1: ( rule__InputPort__NameAssignment_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2426:2: rule__InputPort__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__NameAssignment_2_in_rule__InputPort__Group__2__Impl4774);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2436:1: rule__InputPort__Group__3 : rule__InputPort__Group__3__Impl rule__InputPort__Group__4 ;
    public final void rule__InputPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2440:1: ( rule__InputPort__Group__3__Impl rule__InputPort__Group__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2441:2: rule__InputPort__Group__3__Impl rule__InputPort__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__3__Impl_in_rule__InputPort__Group__34804);
            rule__InputPort__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__4_in_rule__InputPort__Group__34807);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2448:1: rule__InputPort__Group__3__Impl : ( '{' ) ;
    public final void rule__InputPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2452:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2453:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2453:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2454:1: '{'
            {
             before(grammarAccess.getInputPortAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__InputPort__Group__3__Impl4835); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2467:1: rule__InputPort__Group__4 : rule__InputPort__Group__4__Impl rule__InputPort__Group__5 ;
    public final void rule__InputPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2471:1: ( rule__InputPort__Group__4__Impl rule__InputPort__Group__5 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2472:2: rule__InputPort__Group__4__Impl rule__InputPort__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__4__Impl_in_rule__InputPort__Group__44866);
            rule__InputPort__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__5_in_rule__InputPort__Group__44869);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2479:1: rule__InputPort__Group__4__Impl : ( ( rule__InputPort__Group_4__0 )? ) ;
    public final void rule__InputPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2483:1: ( ( ( rule__InputPort__Group_4__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2484:1: ( ( rule__InputPort__Group_4__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2484:1: ( ( rule__InputPort__Group_4__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2485:1: ( rule__InputPort__Group_4__0 )?
            {
             before(grammarAccess.getInputPortAccess().getGroup_4()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2486:1: ( rule__InputPort__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2486:2: rule__InputPort__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group_4__0_in_rule__InputPort__Group__4__Impl4896);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2496:1: rule__InputPort__Group__5 : rule__InputPort__Group__5__Impl rule__InputPort__Group__6 ;
    public final void rule__InputPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2500:1: ( rule__InputPort__Group__5__Impl rule__InputPort__Group__6 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2501:2: rule__InputPort__Group__5__Impl rule__InputPort__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__5__Impl_in_rule__InputPort__Group__54927);
            rule__InputPort__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__6_in_rule__InputPort__Group__54930);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2508:1: rule__InputPort__Group__5__Impl : ( ( rule__InputPort__Group_5__0 )? ) ;
    public final void rule__InputPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2512:1: ( ( ( rule__InputPort__Group_5__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2513:1: ( ( rule__InputPort__Group_5__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2513:1: ( ( rule__InputPort__Group_5__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2514:1: ( rule__InputPort__Group_5__0 )?
            {
             before(grammarAccess.getInputPortAccess().getGroup_5()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2515:1: ( rule__InputPort__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2515:2: rule__InputPort__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group_5__0_in_rule__InputPort__Group__5__Impl4957);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2525:1: rule__InputPort__Group__6 : rule__InputPort__Group__6__Impl ;
    public final void rule__InputPort__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2529:1: ( rule__InputPort__Group__6__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2530:2: rule__InputPort__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group__6__Impl_in_rule__InputPort__Group__64988);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2536:1: rule__InputPort__Group__6__Impl : ( '}' ) ;
    public final void rule__InputPort__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2540:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2541:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2541:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2542:1: '}'
            {
             before(grammarAccess.getInputPortAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__InputPort__Group__6__Impl5016); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2569:1: rule__InputPort__Group_4__0 : rule__InputPort__Group_4__0__Impl rule__InputPort__Group_4__1 ;
    public final void rule__InputPort__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2573:1: ( rule__InputPort__Group_4__0__Impl rule__InputPort__Group_4__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2574:2: rule__InputPort__Group_4__0__Impl rule__InputPort__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group_4__0__Impl_in_rule__InputPort__Group_4__05061);
            rule__InputPort__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group_4__1_in_rule__InputPort__Group_4__05064);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2581:1: rule__InputPort__Group_4__0__Impl : ( 'dataType' ) ;
    public final void rule__InputPort__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2585:1: ( ( 'dataType' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2586:1: ( 'dataType' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2586:1: ( 'dataType' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2587:1: 'dataType'
            {
             before(grammarAccess.getInputPortAccess().getDataTypeKeyword_4_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__InputPort__Group_4__0__Impl5092); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2600:1: rule__InputPort__Group_4__1 : rule__InputPort__Group_4__1__Impl ;
    public final void rule__InputPort__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2604:1: ( rule__InputPort__Group_4__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2605:2: rule__InputPort__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group_4__1__Impl_in_rule__InputPort__Group_4__15123);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2611:1: rule__InputPort__Group_4__1__Impl : ( ( rule__InputPort__DataTypeAssignment_4_1 ) ) ;
    public final void rule__InputPort__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2615:1: ( ( ( rule__InputPort__DataTypeAssignment_4_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2616:1: ( ( rule__InputPort__DataTypeAssignment_4_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2616:1: ( ( rule__InputPort__DataTypeAssignment_4_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2617:1: ( rule__InputPort__DataTypeAssignment_4_1 )
            {
             before(grammarAccess.getInputPortAccess().getDataTypeAssignment_4_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2618:1: ( rule__InputPort__DataTypeAssignment_4_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2618:2: rule__InputPort__DataTypeAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__DataTypeAssignment_4_1_in_rule__InputPort__Group_4__1__Impl5150);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2632:1: rule__InputPort__Group_5__0 : rule__InputPort__Group_5__0__Impl rule__InputPort__Group_5__1 ;
    public final void rule__InputPort__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2636:1: ( rule__InputPort__Group_5__0__Impl rule__InputPort__Group_5__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2637:2: rule__InputPort__Group_5__0__Impl rule__InputPort__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group_5__0__Impl_in_rule__InputPort__Group_5__05184);
            rule__InputPort__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group_5__1_in_rule__InputPort__Group_5__05187);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2644:1: rule__InputPort__Group_5__0__Impl : ( 'inputConnectionPolicy' ) ;
    public final void rule__InputPort__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2648:1: ( ( 'inputConnectionPolicy' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2649:1: ( 'inputConnectionPolicy' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2649:1: ( 'inputConnectionPolicy' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2650:1: 'inputConnectionPolicy'
            {
             before(grammarAccess.getInputPortAccess().getInputConnectionPolicyKeyword_5_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__InputPort__Group_5__0__Impl5215); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2663:1: rule__InputPort__Group_5__1 : rule__InputPort__Group_5__1__Impl ;
    public final void rule__InputPort__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2667:1: ( rule__InputPort__Group_5__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2668:2: rule__InputPort__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__Group_5__1__Impl_in_rule__InputPort__Group_5__15246);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2674:1: rule__InputPort__Group_5__1__Impl : ( ( rule__InputPort__InputConnectionPolicyAssignment_5_1 ) ) ;
    public final void rule__InputPort__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2678:1: ( ( ( rule__InputPort__InputConnectionPolicyAssignment_5_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2679:1: ( ( rule__InputPort__InputConnectionPolicyAssignment_5_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2679:1: ( ( rule__InputPort__InputConnectionPolicyAssignment_5_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2680:1: ( rule__InputPort__InputConnectionPolicyAssignment_5_1 )
            {
             before(grammarAccess.getInputPortAccess().getInputConnectionPolicyAssignment_5_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2681:1: ( rule__InputPort__InputConnectionPolicyAssignment_5_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2681:2: rule__InputPort__InputConnectionPolicyAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputPort__InputConnectionPolicyAssignment_5_1_in_rule__InputPort__Group_5__1__Impl5273);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2695:1: rule__OutputPort__Group__0 : rule__OutputPort__Group__0__Impl rule__OutputPort__Group__1 ;
    public final void rule__OutputPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2699:1: ( rule__OutputPort__Group__0__Impl rule__OutputPort__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2700:2: rule__OutputPort__Group__0__Impl rule__OutputPort__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__0__Impl_in_rule__OutputPort__Group__05307);
            rule__OutputPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__1_in_rule__OutputPort__Group__05310);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2707:1: rule__OutputPort__Group__0__Impl : ( 'OutputPort' ) ;
    public final void rule__OutputPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2711:1: ( ( 'OutputPort' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2712:1: ( 'OutputPort' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2712:1: ( 'OutputPort' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2713:1: 'OutputPort'
            {
             before(grammarAccess.getOutputPortAccess().getOutputPortKeyword_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__OutputPort__Group__0__Impl5338); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2726:1: rule__OutputPort__Group__1 : rule__OutputPort__Group__1__Impl rule__OutputPort__Group__2 ;
    public final void rule__OutputPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2730:1: ( rule__OutputPort__Group__1__Impl rule__OutputPort__Group__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2731:2: rule__OutputPort__Group__1__Impl rule__OutputPort__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__1__Impl_in_rule__OutputPort__Group__15369);
            rule__OutputPort__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__2_in_rule__OutputPort__Group__15372);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2738:1: rule__OutputPort__Group__1__Impl : ( ( rule__OutputPort__NameAssignment_1 ) ) ;
    public final void rule__OutputPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2742:1: ( ( ( rule__OutputPort__NameAssignment_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2743:1: ( ( rule__OutputPort__NameAssignment_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2743:1: ( ( rule__OutputPort__NameAssignment_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2744:1: ( rule__OutputPort__NameAssignment_1 )
            {
             before(grammarAccess.getOutputPortAccess().getNameAssignment_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2745:1: ( rule__OutputPort__NameAssignment_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2745:2: rule__OutputPort__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__NameAssignment_1_in_rule__OutputPort__Group__1__Impl5399);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2755:1: rule__OutputPort__Group__2 : rule__OutputPort__Group__2__Impl rule__OutputPort__Group__3 ;
    public final void rule__OutputPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2759:1: ( rule__OutputPort__Group__2__Impl rule__OutputPort__Group__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2760:2: rule__OutputPort__Group__2__Impl rule__OutputPort__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__2__Impl_in_rule__OutputPort__Group__25429);
            rule__OutputPort__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__3_in_rule__OutputPort__Group__25432);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2767:1: rule__OutputPort__Group__2__Impl : ( '{' ) ;
    public final void rule__OutputPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2771:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2772:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2772:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2773:1: '{'
            {
             before(grammarAccess.getOutputPortAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__OutputPort__Group__2__Impl5460); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2786:1: rule__OutputPort__Group__3 : rule__OutputPort__Group__3__Impl rule__OutputPort__Group__4 ;
    public final void rule__OutputPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2790:1: ( rule__OutputPort__Group__3__Impl rule__OutputPort__Group__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2791:2: rule__OutputPort__Group__3__Impl rule__OutputPort__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__3__Impl_in_rule__OutputPort__Group__35491);
            rule__OutputPort__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__4_in_rule__OutputPort__Group__35494);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2798:1: rule__OutputPort__Group__3__Impl : ( ( rule__OutputPort__Group_3__0 )? ) ;
    public final void rule__OutputPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2802:1: ( ( ( rule__OutputPort__Group_3__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2803:1: ( ( rule__OutputPort__Group_3__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2803:1: ( ( rule__OutputPort__Group_3__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2804:1: ( rule__OutputPort__Group_3__0 )?
            {
             before(grammarAccess.getOutputPortAccess().getGroup_3()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2805:1: ( rule__OutputPort__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2805:2: rule__OutputPort__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group_3__0_in_rule__OutputPort__Group__3__Impl5521);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2815:1: rule__OutputPort__Group__4 : rule__OutputPort__Group__4__Impl rule__OutputPort__Group__5 ;
    public final void rule__OutputPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2819:1: ( rule__OutputPort__Group__4__Impl rule__OutputPort__Group__5 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2820:2: rule__OutputPort__Group__4__Impl rule__OutputPort__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__4__Impl_in_rule__OutputPort__Group__45552);
            rule__OutputPort__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__5_in_rule__OutputPort__Group__45555);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2827:1: rule__OutputPort__Group__4__Impl : ( ( rule__OutputPort__Group_4__0 )? ) ;
    public final void rule__OutputPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2831:1: ( ( ( rule__OutputPort__Group_4__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2832:1: ( ( rule__OutputPort__Group_4__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2832:1: ( ( rule__OutputPort__Group_4__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2833:1: ( rule__OutputPort__Group_4__0 )?
            {
             before(grammarAccess.getOutputPortAccess().getGroup_4()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2834:1: ( rule__OutputPort__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2834:2: rule__OutputPort__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group_4__0_in_rule__OutputPort__Group__4__Impl5582);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2844:1: rule__OutputPort__Group__5 : rule__OutputPort__Group__5__Impl ;
    public final void rule__OutputPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2848:1: ( rule__OutputPort__Group__5__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2849:2: rule__OutputPort__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group__5__Impl_in_rule__OutputPort__Group__55613);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2855:1: rule__OutputPort__Group__5__Impl : ( '}' ) ;
    public final void rule__OutputPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2859:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2860:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2860:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2861:1: '}'
            {
             before(grammarAccess.getOutputPortAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__OutputPort__Group__5__Impl5641); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2886:1: rule__OutputPort__Group_3__0 : rule__OutputPort__Group_3__0__Impl rule__OutputPort__Group_3__1 ;
    public final void rule__OutputPort__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2890:1: ( rule__OutputPort__Group_3__0__Impl rule__OutputPort__Group_3__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2891:2: rule__OutputPort__Group_3__0__Impl rule__OutputPort__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group_3__0__Impl_in_rule__OutputPort__Group_3__05684);
            rule__OutputPort__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group_3__1_in_rule__OutputPort__Group_3__05687);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2898:1: rule__OutputPort__Group_3__0__Impl : ( 'dataType' ) ;
    public final void rule__OutputPort__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2902:1: ( ( 'dataType' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2903:1: ( 'dataType' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2903:1: ( 'dataType' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2904:1: 'dataType'
            {
             before(grammarAccess.getOutputPortAccess().getDataTypeKeyword_3_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__OutputPort__Group_3__0__Impl5715); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2917:1: rule__OutputPort__Group_3__1 : rule__OutputPort__Group_3__1__Impl ;
    public final void rule__OutputPort__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2921:1: ( rule__OutputPort__Group_3__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2922:2: rule__OutputPort__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group_3__1__Impl_in_rule__OutputPort__Group_3__15746);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2928:1: rule__OutputPort__Group_3__1__Impl : ( ( rule__OutputPort__DataTypeAssignment_3_1 ) ) ;
    public final void rule__OutputPort__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2932:1: ( ( ( rule__OutputPort__DataTypeAssignment_3_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2933:1: ( ( rule__OutputPort__DataTypeAssignment_3_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2933:1: ( ( rule__OutputPort__DataTypeAssignment_3_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2934:1: ( rule__OutputPort__DataTypeAssignment_3_1 )
            {
             before(grammarAccess.getOutputPortAccess().getDataTypeAssignment_3_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2935:1: ( rule__OutputPort__DataTypeAssignment_3_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2935:2: rule__OutputPort__DataTypeAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__DataTypeAssignment_3_1_in_rule__OutputPort__Group_3__1__Impl5773);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2949:1: rule__OutputPort__Group_4__0 : rule__OutputPort__Group_4__0__Impl rule__OutputPort__Group_4__1 ;
    public final void rule__OutputPort__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2953:1: ( rule__OutputPort__Group_4__0__Impl rule__OutputPort__Group_4__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2954:2: rule__OutputPort__Group_4__0__Impl rule__OutputPort__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group_4__0__Impl_in_rule__OutputPort__Group_4__05807);
            rule__OutputPort__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group_4__1_in_rule__OutputPort__Group_4__05810);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2961:1: rule__OutputPort__Group_4__0__Impl : ( 'outputConnectionPolicy' ) ;
    public final void rule__OutputPort__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2965:1: ( ( 'outputConnectionPolicy' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2966:1: ( 'outputConnectionPolicy' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2966:1: ( 'outputConnectionPolicy' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2967:1: 'outputConnectionPolicy'
            {
             before(grammarAccess.getOutputPortAccess().getOutputConnectionPolicyKeyword_4_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__OutputPort__Group_4__0__Impl5838); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2980:1: rule__OutputPort__Group_4__1 : rule__OutputPort__Group_4__1__Impl ;
    public final void rule__OutputPort__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2984:1: ( rule__OutputPort__Group_4__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2985:2: rule__OutputPort__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__Group_4__1__Impl_in_rule__OutputPort__Group_4__15869);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2991:1: rule__OutputPort__Group_4__1__Impl : ( ( rule__OutputPort__OutputConnectionPolicyAssignment_4_1 ) ) ;
    public final void rule__OutputPort__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2995:1: ( ( ( rule__OutputPort__OutputConnectionPolicyAssignment_4_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2996:1: ( ( rule__OutputPort__OutputConnectionPolicyAssignment_4_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2996:1: ( ( rule__OutputPort__OutputConnectionPolicyAssignment_4_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2997:1: ( rule__OutputPort__OutputConnectionPolicyAssignment_4_1 )
            {
             before(grammarAccess.getOutputPortAccess().getOutputConnectionPolicyAssignment_4_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2998:1: ( rule__OutputPort__OutputConnectionPolicyAssignment_4_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:2998:2: rule__OutputPort__OutputConnectionPolicyAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OutputPort__OutputConnectionPolicyAssignment_4_1_in_rule__OutputPort__Group_4__1__Impl5896);
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


    // $ANTLR start "rule__EShort__Group__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3012:1: rule__EShort__Group__0 : rule__EShort__Group__0__Impl rule__EShort__Group__1 ;
    public final void rule__EShort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3016:1: ( rule__EShort__Group__0__Impl rule__EShort__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3017:2: rule__EShort__Group__0__Impl rule__EShort__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EShort__Group__0__Impl_in_rule__EShort__Group__05930);
            rule__EShort__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EShort__Group__1_in_rule__EShort__Group__05933);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3024:1: rule__EShort__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EShort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3028:1: ( ( ( '-' )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3029:1: ( ( '-' )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3029:1: ( ( '-' )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3030:1: ( '-' )?
            {
             before(grammarAccess.getEShortAccess().getHyphenMinusKeyword_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3031:1: ( '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3032:2: '-'
                    {
                    match(input,37,FollowSets000.FOLLOW_37_in_rule__EShort__Group__0__Impl5962); 

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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3043:1: rule__EShort__Group__1 : rule__EShort__Group__1__Impl ;
    public final void rule__EShort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3047:1: ( rule__EShort__Group__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3048:2: rule__EShort__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EShort__Group__1__Impl_in_rule__EShort__Group__15995);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3054:1: rule__EShort__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EShort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3058:1: ( ( RULE_INT ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3059:1: ( RULE_INT )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3059:1: ( RULE_INT )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3060:1: RULE_INT
            {
             before(grammarAccess.getEShortAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EShort__Group__1__Impl6022); 
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


    // $ANTLR start "rule__Package__NameAssignment_2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3076:1: rule__Package__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Package__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3080:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3081:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3081:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3082:1: ruleEString
            {
             before(grammarAccess.getPackageAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Package__NameAssignment_26060);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3091:1: rule__Package__TaskContextsAssignment_4_2 : ( ruleTaskContext ) ;
    public final void rule__Package__TaskContextsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3095:1: ( ( ruleTaskContext ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3096:1: ( ruleTaskContext )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3096:1: ( ruleTaskContext )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3097:1: ruleTaskContext
            {
             before(grammarAccess.getPackageAccess().getTaskContextsTaskContextParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTaskContext_in_rule__Package__TaskContextsAssignment_4_26091);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3106:1: rule__Package__TaskContextsAssignment_4_3_1 : ( ruleTaskContext ) ;
    public final void rule__Package__TaskContextsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3110:1: ( ( ruleTaskContext ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3111:1: ( ruleTaskContext )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3111:1: ( ruleTaskContext )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3112:1: ruleTaskContext
            {
             before(grammarAccess.getPackageAccess().getTaskContextsTaskContextParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTaskContext_in_rule__Package__TaskContextsAssignment_4_3_16122);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3121:1: rule__Package__ConnectionPoliciesAssignment_5_2 : ( ruleConnectionPolicy ) ;
    public final void rule__Package__ConnectionPoliciesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3125:1: ( ( ruleConnectionPolicy ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3126:1: ( ruleConnectionPolicy )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3126:1: ( ruleConnectionPolicy )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3127:1: ruleConnectionPolicy
            {
             before(grammarAccess.getPackageAccess().getConnectionPoliciesConnectionPolicyParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConnectionPolicy_in_rule__Package__ConnectionPoliciesAssignment_5_26153);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3136:1: rule__Package__ConnectionPoliciesAssignment_5_3_1 : ( ruleConnectionPolicy ) ;
    public final void rule__Package__ConnectionPoliciesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3140:1: ( ( ruleConnectionPolicy ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3141:1: ( ruleConnectionPolicy )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3141:1: ( ruleConnectionPolicy )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3142:1: ruleConnectionPolicy
            {
             before(grammarAccess.getPackageAccess().getConnectionPoliciesConnectionPolicyParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConnectionPolicy_in_rule__Package__ConnectionPoliciesAssignment_5_3_16184);
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


    // $ANTLR start "rule__TaskContext__NameAssignment_1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3151:1: rule__TaskContext__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TaskContext__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3155:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3156:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3156:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3157:1: ruleEString
            {
             before(grammarAccess.getTaskContextAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TaskContext__NameAssignment_16215);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3166:1: rule__TaskContext__NamespaceAssignment_4 : ( ruleEString ) ;
    public final void rule__TaskContext__NamespaceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3170:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3171:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3171:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3172:1: ruleEString
            {
             before(grammarAccess.getTaskContextAccess().getNamespaceEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TaskContext__NamespaceAssignment_46246);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTaskContextAccess().getNamespaceEStringParserRuleCall_4_0()); 

            }


            }

        }
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3181:1: rule__TaskContext__TypeAssignment_6 : ( ruleEString ) ;
    public final void rule__TaskContext__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3185:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3186:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3186:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3187:1: ruleEString
            {
             before(grammarAccess.getTaskContextAccess().getTypeEStringParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TaskContext__TypeAssignment_66277);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTaskContextAccess().getTypeEStringParserRuleCall_6_0()); 

            }


            }

        }
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3196:1: rule__TaskContext__InputPortsAssignment_7_2 : ( ruleInputPort ) ;
    public final void rule__TaskContext__InputPortsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3200:1: ( ( ruleInputPort ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3201:1: ( ruleInputPort )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3201:1: ( ruleInputPort )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3202:1: ruleInputPort
            {
             before(grammarAccess.getTaskContextAccess().getInputPortsInputPortParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputPort_in_rule__TaskContext__InputPortsAssignment_7_26308);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3211:1: rule__TaskContext__InputPortsAssignment_7_3_1 : ( ruleInputPort ) ;
    public final void rule__TaskContext__InputPortsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3215:1: ( ( ruleInputPort ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3216:1: ( ruleInputPort )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3216:1: ( ruleInputPort )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3217:1: ruleInputPort
            {
             before(grammarAccess.getTaskContextAccess().getInputPortsInputPortParserRuleCall_7_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputPort_in_rule__TaskContext__InputPortsAssignment_7_3_16339);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3226:1: rule__TaskContext__OutputPortsAssignment_8_2 : ( ruleOutputPort ) ;
    public final void rule__TaskContext__OutputPortsAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3230:1: ( ( ruleOutputPort ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3231:1: ( ruleOutputPort )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3231:1: ( ruleOutputPort )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3232:1: ruleOutputPort
            {
             before(grammarAccess.getTaskContextAccess().getOutputPortsOutputPortParserRuleCall_8_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOutputPort_in_rule__TaskContext__OutputPortsAssignment_8_26370);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3241:1: rule__TaskContext__OutputPortsAssignment_8_3_1 : ( ruleOutputPort ) ;
    public final void rule__TaskContext__OutputPortsAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3245:1: ( ( ruleOutputPort ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3246:1: ( ruleOutputPort )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3246:1: ( ruleOutputPort )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3247:1: ruleOutputPort
            {
             before(grammarAccess.getTaskContextAccess().getOutputPortsOutputPortParserRuleCall_8_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOutputPort_in_rule__TaskContext__OutputPortsAssignment_8_3_16401);
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


    // $ANTLR start "rule__ConnectionPolicy__NameAssignment_1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3256:1: rule__ConnectionPolicy__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ConnectionPolicy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3260:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3261:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3261:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3262:1: ruleEString
            {
             before(grammarAccess.getConnectionPolicyAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ConnectionPolicy__NameAssignment_16432);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3271:1: rule__ConnectionPolicy__BufferSizeAssignment_3_1 : ( ruleEShort ) ;
    public final void rule__ConnectionPolicy__BufferSizeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3275:1: ( ( ruleEShort ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3276:1: ( ruleEShort )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3276:1: ( ruleEShort )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3277:1: ruleEShort
            {
             before(grammarAccess.getConnectionPolicyAccess().getBufferSizeEShortParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEShort_in_rule__ConnectionPolicy__BufferSizeAssignment_3_16463);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3286:1: rule__ConnectionPolicy__LockPolicyAssignment_4_1 : ( ruleConnectionPolicyLockPolicy ) ;
    public final void rule__ConnectionPolicy__LockPolicyAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3290:1: ( ( ruleConnectionPolicyLockPolicy ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3291:1: ( ruleConnectionPolicyLockPolicy )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3291:1: ( ruleConnectionPolicyLockPolicy )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3292:1: ruleConnectionPolicyLockPolicy
            {
             before(grammarAccess.getConnectionPolicyAccess().getLockPolicyConnectionPolicyLockPolicyEnumRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConnectionPolicyLockPolicy_in_rule__ConnectionPolicy__LockPolicyAssignment_4_16494);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3301:1: rule__ConnectionPolicy__TypeAssignment_5_1 : ( ruleConnectionPolicyType ) ;
    public final void rule__ConnectionPolicy__TypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3305:1: ( ( ruleConnectionPolicyType ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3306:1: ( ruleConnectionPolicyType )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3306:1: ( ruleConnectionPolicyType )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3307:1: ruleConnectionPolicyType
            {
             before(grammarAccess.getConnectionPolicyAccess().getTypeConnectionPolicyTypeEnumRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConnectionPolicyType_in_rule__ConnectionPolicy__TypeAssignment_5_16525);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3316:1: rule__ConnectionPolicy__InputPortAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__ConnectionPolicy__InputPortAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3320:1: ( ( ( ruleEString ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3321:1: ( ( ruleEString ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3321:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3322:1: ( ruleEString )
            {
             before(grammarAccess.getConnectionPolicyAccess().getInputPortInputPortCrossReference_7_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3323:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3324:1: ruleEString
            {
             before(grammarAccess.getConnectionPolicyAccess().getInputPortInputPortEStringParserRuleCall_7_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ConnectionPolicy__InputPortAssignment_76560);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3335:1: rule__ConnectionPolicy__OutputPortAssignment_9 : ( ( ruleEString ) ) ;
    public final void rule__ConnectionPolicy__OutputPortAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3339:1: ( ( ( ruleEString ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3340:1: ( ( ruleEString ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3340:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3341:1: ( ruleEString )
            {
             before(grammarAccess.getConnectionPolicyAccess().getOutputPortOutputPortCrossReference_9_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3342:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3343:1: ruleEString
            {
             before(grammarAccess.getConnectionPolicyAccess().getOutputPortOutputPortEStringParserRuleCall_9_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ConnectionPolicy__OutputPortAssignment_96599);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3354:1: rule__InputPort__IsEventPortAssignment_0 : ( ( 'isEventPort' ) ) ;
    public final void rule__InputPort__IsEventPortAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3358:1: ( ( ( 'isEventPort' ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3359:1: ( ( 'isEventPort' ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3359:1: ( ( 'isEventPort' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3360:1: ( 'isEventPort' )
            {
             before(grammarAccess.getInputPortAccess().getIsEventPortIsEventPortKeyword_0_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3361:1: ( 'isEventPort' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3362:1: 'isEventPort'
            {
             before(grammarAccess.getInputPortAccess().getIsEventPortIsEventPortKeyword_0_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__InputPort__IsEventPortAssignment_06639); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3377:1: rule__InputPort__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__InputPort__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3381:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3382:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3382:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3383:1: ruleEString
            {
             before(grammarAccess.getInputPortAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputPort__NameAssignment_26678);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3392:1: rule__InputPort__DataTypeAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__InputPort__DataTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3396:1: ( ( ( ruleEString ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3397:1: ( ( ruleEString ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3397:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3398:1: ( ruleEString )
            {
             before(grammarAccess.getInputPortAccess().getDataTypeDataTypeCrossReference_4_1_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3399:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3400:1: ruleEString
            {
             before(grammarAccess.getInputPortAccess().getDataTypeDataTypeEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputPort__DataTypeAssignment_4_16713);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputPortAccess().getDataTypeDataTypeEStringParserRuleCall_4_1_0_1()); 

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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3411:1: rule__InputPort__InputConnectionPolicyAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__InputPort__InputConnectionPolicyAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3415:1: ( ( ( ruleEString ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3416:1: ( ( ruleEString ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3416:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3417:1: ( ruleEString )
            {
             before(grammarAccess.getInputPortAccess().getInputConnectionPolicyConnectionPolicyCrossReference_5_1_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3418:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3419:1: ruleEString
            {
             before(grammarAccess.getInputPortAccess().getInputConnectionPolicyConnectionPolicyEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputPort__InputConnectionPolicyAssignment_5_16752);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3430:1: rule__OutputPort__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__OutputPort__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3434:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3435:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3435:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3436:1: ruleEString
            {
             before(grammarAccess.getOutputPortAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OutputPort__NameAssignment_16787);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3445:1: rule__OutputPort__DataTypeAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__OutputPort__DataTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3449:1: ( ( ( ruleEString ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3450:1: ( ( ruleEString ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3450:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3451:1: ( ruleEString )
            {
             before(grammarAccess.getOutputPortAccess().getDataTypeDataTypeCrossReference_3_1_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3452:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3453:1: ruleEString
            {
             before(grammarAccess.getOutputPortAccess().getDataTypeDataTypeEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OutputPort__DataTypeAssignment_3_16822);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOutputPortAccess().getDataTypeDataTypeEStringParserRuleCall_3_1_0_1()); 

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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3464:1: rule__OutputPort__OutputConnectionPolicyAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__OutputPort__OutputConnectionPolicyAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3468:1: ( ( ( ruleEString ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3469:1: ( ( ruleEString ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3469:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3470:1: ( ruleEString )
            {
             before(grammarAccess.getOutputPortAccess().getOutputConnectionPolicyConnectionPolicyCrossReference_4_1_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3471:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:3472:1: ruleEString
            {
             before(grammarAccess.getOutputPortAccess().getOutputConnectionPolicyConnectionPolicyEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OutputPort__OutputConnectionPolicyAssignment_4_16861);
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

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_rulePackage_in_entryRulePackage61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePackage68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__0_in_rulePackage94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTaskContext_in_entryRuleTaskContext181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTaskContext188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__0_in_ruleTaskContext214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConnectionPolicy_in_entryRuleConnectionPolicy241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConnectionPolicy248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__0_in_ruleConnectionPolicy274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputPort_in_entryRuleInputPort301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputPort308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group__0_in_ruleInputPort334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOutputPort_in_entryRuleOutputPort361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOutputPort368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__0_in_ruleOutputPort394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEShort_in_entryRuleEShort421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEShort428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EShort__Group__0_in_ruleEShort454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicyLockPolicy__Alternatives_in_ruleConnectionPolicyLockPolicy491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicyType__Alternatives_in_ruleConnectionPolicyType527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__ConnectionPolicyLockPolicy__Alternatives612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__ConnectionPolicyLockPolicy__Alternatives633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__ConnectionPolicyLockPolicy__Alternatives654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__ConnectionPolicyType__Alternatives690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__ConnectionPolicyType__Alternatives711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__0744 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__0747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__1805 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__1808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Package__Group__1__Impl836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__2867 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Package__Group__3_in_rule__Package__Group__2870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__NameAssignment_2_in_rule__Package__Group__2__Impl897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__3927 = new BitSet(new long[]{0x00000000002C0000L});
        public static final BitSet FOLLOW_rule__Package__Group__4_in_rule__Package__Group__3930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Package__Group__3__Impl958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__4989 = new BitSet(new long[]{0x00000000002C0000L});
        public static final BitSet FOLLOW_rule__Package__Group__5_in_rule__Package__Group__4992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__0_in_rule__Package__Group__4__Impl1019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__5__Impl_in_rule__Package__Group__51050 = new BitSet(new long[]{0x00000000002C0000L});
        public static final BitSet FOLLOW_rule__Package__Group__6_in_rule__Package__Group__51053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5__0_in_rule__Package__Group__5__Impl1080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__6__Impl_in_rule__Package__Group__61111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Package__Group__6__Impl1139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__0__Impl_in_rule__Package__Group_4__01184 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Package__Group_4__1_in_rule__Package__Group_4__01187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Package__Group_4__0__Impl1215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__1__Impl_in_rule__Package__Group_4__11246 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Package__Group_4__2_in_rule__Package__Group_4__11249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Package__Group_4__1__Impl1277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__2__Impl_in_rule__Package__Group_4__21308 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_rule__Package__Group_4__3_in_rule__Package__Group_4__21311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__TaskContextsAssignment_4_2_in_rule__Package__Group_4__2__Impl1338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__3__Impl_in_rule__Package__Group_4__31368 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_rule__Package__Group_4__4_in_rule__Package__Group_4__31371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4_3__0_in_rule__Package__Group_4__3__Impl1398 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__4__Impl_in_rule__Package__Group_4__41429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Package__Group_4__4__Impl1457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4_3__0__Impl_in_rule__Package__Group_4_3__01498 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Package__Group_4_3__1_in_rule__Package__Group_4_3__01501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Package__Group_4_3__0__Impl1529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4_3__1__Impl_in_rule__Package__Group_4_3__11560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__TaskContextsAssignment_4_3_1_in_rule__Package__Group_4_3__1__Impl1587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5__0__Impl_in_rule__Package__Group_5__01621 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Package__Group_5__1_in_rule__Package__Group_5__01624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Package__Group_5__0__Impl1652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5__1__Impl_in_rule__Package__Group_5__11683 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Package__Group_5__2_in_rule__Package__Group_5__11686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Package__Group_5__1__Impl1714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5__2__Impl_in_rule__Package__Group_5__21745 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_rule__Package__Group_5__3_in_rule__Package__Group_5__21748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__ConnectionPoliciesAssignment_5_2_in_rule__Package__Group_5__2__Impl1775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5__3__Impl_in_rule__Package__Group_5__31805 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_rule__Package__Group_5__4_in_rule__Package__Group_5__31808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5_3__0_in_rule__Package__Group_5__3__Impl1835 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__Package__Group_5__4__Impl_in_rule__Package__Group_5__41866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Package__Group_5__4__Impl1894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5_3__0__Impl_in_rule__Package__Group_5_3__01935 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Package__Group_5_3__1_in_rule__Package__Group_5_3__01938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Package__Group_5_3__0__Impl1966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5_3__1__Impl_in_rule__Package__Group_5_3__11997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__ConnectionPoliciesAssignment_5_3_1_in_rule__Package__Group_5_3__1__Impl2024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__0__Impl_in_rule__TaskContext__Group__02058 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__1_in_rule__TaskContext__Group__02061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__TaskContext__Group__0__Impl2089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__1__Impl_in_rule__TaskContext__Group__12120 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__2_in_rule__TaskContext__Group__12123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__NameAssignment_1_in_rule__TaskContext__Group__1__Impl2150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__2__Impl_in_rule__TaskContext__Group__22180 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__3_in_rule__TaskContext__Group__22183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__TaskContext__Group__2__Impl2211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__3__Impl_in_rule__TaskContext__Group__32242 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__4_in_rule__TaskContext__Group__32245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__TaskContext__Group__3__Impl2273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__4__Impl_in_rule__TaskContext__Group__42304 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__5_in_rule__TaskContext__Group__42307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__NamespaceAssignment_4_in_rule__TaskContext__Group__4__Impl2334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__5__Impl_in_rule__TaskContext__Group__52364 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__6_in_rule__TaskContext__Group__52367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__TaskContext__Group__5__Impl2395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__6__Impl_in_rule__TaskContext__Group__62426 = new BitSet(new long[]{0x0000000006040000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__7_in_rule__TaskContext__Group__62429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__TypeAssignment_6_in_rule__TaskContext__Group__6__Impl2456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__7__Impl_in_rule__TaskContext__Group__72486 = new BitSet(new long[]{0x0000000006040000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__8_in_rule__TaskContext__Group__72489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7__0_in_rule__TaskContext__Group__7__Impl2516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__8__Impl_in_rule__TaskContext__Group__82547 = new BitSet(new long[]{0x0000000006040000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__9_in_rule__TaskContext__Group__82550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8__0_in_rule__TaskContext__Group__8__Impl2577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__9__Impl_in_rule__TaskContext__Group__92608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__TaskContext__Group__9__Impl2636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7__0__Impl_in_rule__TaskContext__Group_7__02687 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7__1_in_rule__TaskContext__Group_7__02690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__TaskContext__Group_7__0__Impl2718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7__1__Impl_in_rule__TaskContext__Group_7__12749 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7__2_in_rule__TaskContext__Group_7__12752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__TaskContext__Group_7__1__Impl2780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7__2__Impl_in_rule__TaskContext__Group_7__22811 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7__3_in_rule__TaskContext__Group_7__22814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__InputPortsAssignment_7_2_in_rule__TaskContext__Group_7__2__Impl2841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7__3__Impl_in_rule__TaskContext__Group_7__32871 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7__4_in_rule__TaskContext__Group_7__32874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7_3__0_in_rule__TaskContext__Group_7__3__Impl2901 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7__4__Impl_in_rule__TaskContext__Group_7__42932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__TaskContext__Group_7__4__Impl2960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7_3__0__Impl_in_rule__TaskContext__Group_7_3__03001 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7_3__1_in_rule__TaskContext__Group_7_3__03004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__TaskContext__Group_7_3__0__Impl3032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_7_3__1__Impl_in_rule__TaskContext__Group_7_3__13063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__InputPortsAssignment_7_3_1_in_rule__TaskContext__Group_7_3__1__Impl3090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8__0__Impl_in_rule__TaskContext__Group_8__03124 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8__1_in_rule__TaskContext__Group_8__03127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__TaskContext__Group_8__0__Impl3155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8__1__Impl_in_rule__TaskContext__Group_8__13186 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8__2_in_rule__TaskContext__Group_8__13189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__TaskContext__Group_8__1__Impl3217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8__2__Impl_in_rule__TaskContext__Group_8__23248 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8__3_in_rule__TaskContext__Group_8__23251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__OutputPortsAssignment_8_2_in_rule__TaskContext__Group_8__2__Impl3278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8__3__Impl_in_rule__TaskContext__Group_8__33308 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8__4_in_rule__TaskContext__Group_8__33311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8_3__0_in_rule__TaskContext__Group_8__3__Impl3338 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8__4__Impl_in_rule__TaskContext__Group_8__43369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__TaskContext__Group_8__4__Impl3397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8_3__0__Impl_in_rule__TaskContext__Group_8_3__03438 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8_3__1_in_rule__TaskContext__Group_8_3__03441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__TaskContext__Group_8_3__0__Impl3469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group_8_3__1__Impl_in_rule__TaskContext__Group_8_3__13500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__OutputPortsAssignment_8_3_1_in_rule__TaskContext__Group_8_3__1__Impl3527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__0__Impl_in_rule__ConnectionPolicy__Group__03561 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__1_in_rule__ConnectionPolicy__Group__03564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__ConnectionPolicy__Group__0__Impl3592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__1__Impl_in_rule__ConnectionPolicy__Group__13623 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__2_in_rule__ConnectionPolicy__Group__13626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__NameAssignment_1_in_rule__ConnectionPolicy__Group__1__Impl3653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__2__Impl_in_rule__ConnectionPolicy__Group__23683 = new BitSet(new long[]{0x00000000D1000000L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__3_in_rule__ConnectionPolicy__Group__23686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__ConnectionPolicy__Group__2__Impl3714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__3__Impl_in_rule__ConnectionPolicy__Group__33745 = new BitSet(new long[]{0x00000000D1000000L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__4_in_rule__ConnectionPolicy__Group__33748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_3__0_in_rule__ConnectionPolicy__Group__3__Impl3775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__4__Impl_in_rule__ConnectionPolicy__Group__43806 = new BitSet(new long[]{0x00000000D1000000L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__5_in_rule__ConnectionPolicy__Group__43809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_4__0_in_rule__ConnectionPolicy__Group__4__Impl3836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__5__Impl_in_rule__ConnectionPolicy__Group__53867 = new BitSet(new long[]{0x00000000D1000000L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__6_in_rule__ConnectionPolicy__Group__53870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_5__0_in_rule__ConnectionPolicy__Group__5__Impl3897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__6__Impl_in_rule__ConnectionPolicy__Group__63928 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__7_in_rule__ConnectionPolicy__Group__63931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__ConnectionPolicy__Group__6__Impl3959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__7__Impl_in_rule__ConnectionPolicy__Group__73990 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__8_in_rule__ConnectionPolicy__Group__73993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__InputPortAssignment_7_in_rule__ConnectionPolicy__Group__7__Impl4020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__8__Impl_in_rule__ConnectionPolicy__Group__84050 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__9_in_rule__ConnectionPolicy__Group__84053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__ConnectionPolicy__Group__8__Impl4081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__9__Impl_in_rule__ConnectionPolicy__Group__94112 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__10_in_rule__ConnectionPolicy__Group__94115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__OutputPortAssignment_9_in_rule__ConnectionPolicy__Group__9__Impl4142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group__10__Impl_in_rule__ConnectionPolicy__Group__104172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__ConnectionPolicy__Group__10__Impl4200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_3__0__Impl_in_rule__ConnectionPolicy__Group_3__04253 = new BitSet(new long[]{0x0000002000000040L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_3__1_in_rule__ConnectionPolicy__Group_3__04256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__ConnectionPolicy__Group_3__0__Impl4284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_3__1__Impl_in_rule__ConnectionPolicy__Group_3__14315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__BufferSizeAssignment_3_1_in_rule__ConnectionPolicy__Group_3__1__Impl4342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_4__0__Impl_in_rule__ConnectionPolicy__Group_4__04376 = new BitSet(new long[]{0x0000000000003800L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_4__1_in_rule__ConnectionPolicy__Group_4__04379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__ConnectionPolicy__Group_4__0__Impl4407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_4__1__Impl_in_rule__ConnectionPolicy__Group_4__14438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__LockPolicyAssignment_4_1_in_rule__ConnectionPolicy__Group_4__1__Impl4465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_5__0__Impl_in_rule__ConnectionPolicy__Group_5__04499 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_5__1_in_rule__ConnectionPolicy__Group_5__04502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__ConnectionPolicy__Group_5__0__Impl4530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__Group_5__1__Impl_in_rule__ConnectionPolicy__Group_5__14561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConnectionPolicy__TypeAssignment_5_1_in_rule__ConnectionPolicy__Group_5__1__Impl4588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group__0__Impl_in_rule__InputPort__Group__04622 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__InputPort__Group__1_in_rule__InputPort__Group__04625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__IsEventPortAssignment_0_in_rule__InputPort__Group__0__Impl4652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group__1__Impl_in_rule__InputPort__Group__14682 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputPort__Group__2_in_rule__InputPort__Group__14685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__InputPort__Group__1__Impl4713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group__2__Impl_in_rule__InputPort__Group__24744 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__InputPort__Group__3_in_rule__InputPort__Group__24747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__NameAssignment_2_in_rule__InputPort__Group__2__Impl4774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group__3__Impl_in_rule__InputPort__Group__34804 = new BitSet(new long[]{0x0000000600040000L});
        public static final BitSet FOLLOW_rule__InputPort__Group__4_in_rule__InputPort__Group__34807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__InputPort__Group__3__Impl4835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group__4__Impl_in_rule__InputPort__Group__44866 = new BitSet(new long[]{0x0000000600040000L});
        public static final BitSet FOLLOW_rule__InputPort__Group__5_in_rule__InputPort__Group__44869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group_4__0_in_rule__InputPort__Group__4__Impl4896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group__5__Impl_in_rule__InputPort__Group__54927 = new BitSet(new long[]{0x0000000600040000L});
        public static final BitSet FOLLOW_rule__InputPort__Group__6_in_rule__InputPort__Group__54930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group_5__0_in_rule__InputPort__Group__5__Impl4957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group__6__Impl_in_rule__InputPort__Group__64988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__InputPort__Group__6__Impl5016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group_4__0__Impl_in_rule__InputPort__Group_4__05061 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputPort__Group_4__1_in_rule__InputPort__Group_4__05064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__InputPort__Group_4__0__Impl5092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group_4__1__Impl_in_rule__InputPort__Group_4__15123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__DataTypeAssignment_4_1_in_rule__InputPort__Group_4__1__Impl5150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group_5__0__Impl_in_rule__InputPort__Group_5__05184 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputPort__Group_5__1_in_rule__InputPort__Group_5__05187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__InputPort__Group_5__0__Impl5215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__Group_5__1__Impl_in_rule__InputPort__Group_5__15246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputPort__InputConnectionPolicyAssignment_5_1_in_rule__InputPort__Group_5__1__Impl5273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__0__Impl_in_rule__OutputPort__Group__05307 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__1_in_rule__OutputPort__Group__05310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__OutputPort__Group__0__Impl5338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__1__Impl_in_rule__OutputPort__Group__15369 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__2_in_rule__OutputPort__Group__15372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__NameAssignment_1_in_rule__OutputPort__Group__1__Impl5399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__2__Impl_in_rule__OutputPort__Group__25429 = new BitSet(new long[]{0x0000001200040000L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__3_in_rule__OutputPort__Group__25432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__OutputPort__Group__2__Impl5460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__3__Impl_in_rule__OutputPort__Group__35491 = new BitSet(new long[]{0x0000001200040000L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__4_in_rule__OutputPort__Group__35494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group_3__0_in_rule__OutputPort__Group__3__Impl5521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__4__Impl_in_rule__OutputPort__Group__45552 = new BitSet(new long[]{0x0000001200040000L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__5_in_rule__OutputPort__Group__45555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group_4__0_in_rule__OutputPort__Group__4__Impl5582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group__5__Impl_in_rule__OutputPort__Group__55613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__OutputPort__Group__5__Impl5641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group_3__0__Impl_in_rule__OutputPort__Group_3__05684 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__OutputPort__Group_3__1_in_rule__OutputPort__Group_3__05687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__OutputPort__Group_3__0__Impl5715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group_3__1__Impl_in_rule__OutputPort__Group_3__15746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__DataTypeAssignment_3_1_in_rule__OutputPort__Group_3__1__Impl5773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group_4__0__Impl_in_rule__OutputPort__Group_4__05807 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__OutputPort__Group_4__1_in_rule__OutputPort__Group_4__05810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__OutputPort__Group_4__0__Impl5838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__Group_4__1__Impl_in_rule__OutputPort__Group_4__15869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OutputPort__OutputConnectionPolicyAssignment_4_1_in_rule__OutputPort__Group_4__1__Impl5896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EShort__Group__0__Impl_in_rule__EShort__Group__05930 = new BitSet(new long[]{0x0000002000000040L});
        public static final BitSet FOLLOW_rule__EShort__Group__1_in_rule__EShort__Group__05933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__EShort__Group__0__Impl5962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EShort__Group__1__Impl_in_rule__EShort__Group__15995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EShort__Group__1__Impl6022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Package__NameAssignment_26060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTaskContext_in_rule__Package__TaskContextsAssignment_4_26091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTaskContext_in_rule__Package__TaskContextsAssignment_4_3_16122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConnectionPolicy_in_rule__Package__ConnectionPoliciesAssignment_5_26153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConnectionPolicy_in_rule__Package__ConnectionPoliciesAssignment_5_3_16184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TaskContext__NameAssignment_16215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TaskContext__NamespaceAssignment_46246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TaskContext__TypeAssignment_66277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputPort_in_rule__TaskContext__InputPortsAssignment_7_26308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputPort_in_rule__TaskContext__InputPortsAssignment_7_3_16339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOutputPort_in_rule__TaskContext__OutputPortsAssignment_8_26370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOutputPort_in_rule__TaskContext__OutputPortsAssignment_8_3_16401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ConnectionPolicy__NameAssignment_16432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEShort_in_rule__ConnectionPolicy__BufferSizeAssignment_3_16463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConnectionPolicyLockPolicy_in_rule__ConnectionPolicy__LockPolicyAssignment_4_16494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConnectionPolicyType_in_rule__ConnectionPolicy__TypeAssignment_5_16525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ConnectionPolicy__InputPortAssignment_76560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ConnectionPolicy__OutputPortAssignment_96599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__InputPort__IsEventPortAssignment_06639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputPort__NameAssignment_26678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputPort__DataTypeAssignment_4_16713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputPort__InputConnectionPolicyAssignment_5_16752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OutputPort__NameAssignment_16787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OutputPort__DataTypeAssignment_3_16822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OutputPort__OutputConnectionPolicyAssignment_4_16861 = new BitSet(new long[]{0x0000000000000002L});
    }


}