package cz.cuni.mff.d3s.dsl.deeco.ui.contentassist.antlr.internal; 

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
import cz.cuni.mff.d3s.dsl.deeco.services.DEECoDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDEECoDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'System'", "'{'", "'}'", "'components'", "','", "'ensembles'", "'Component'", "'process'", "'ensembleMember'", "'ensembleCordinator'", "'Ensemble'", "'coordinator'", "'members'", "'('", "')'", "'Process'"
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
    public String getGrammarFileName() { return "../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g"; }


     
     	private DEECoDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DEECoDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleSystem"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:60:1: entryRuleSystem : ruleSystem EOF ;
    public final void entryRuleSystem() throws RecognitionException {
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:61:1: ( ruleSystem EOF )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:62:1: ruleSystem EOF
            {
             before(grammarAccess.getSystemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSystem_in_entryRuleSystem61);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getSystemRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSystem68); 

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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:69:1: ruleSystem : ( ( rule__System__Group__0 ) ) ;
    public final void ruleSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:73:2: ( ( ( rule__System__Group__0 ) ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:74:1: ( ( rule__System__Group__0 ) )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:74:1: ( ( rule__System__Group__0 ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:75:1: ( rule__System__Group__0 )
            {
             before(grammarAccess.getSystemAccess().getGroup()); 
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:76:1: ( rule__System__Group__0 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:76:2: rule__System__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__System__Group__0_in_ruleSystem94);
            rule__System__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleEString"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:88:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:89:1: ( ruleEString EOF )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:90:1: ruleEString EOF
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
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:97:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:101:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:102:1: ( ( rule__EString__Alternatives ) )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:102:1: ( ( rule__EString__Alternatives ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:103:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:104:1: ( rule__EString__Alternatives )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:104:2: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleComponent"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:116:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:117:1: ( ruleComponent EOF )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:118:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComponent_in_entryRuleComponent181);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComponent188); 

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:125:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:129:2: ( ( ( rule__Component__Group__0 ) ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:130:1: ( ( rule__Component__Group__0 ) )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:130:1: ( ( rule__Component__Group__0 ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:131:1: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:132:1: ( rule__Component__Group__0 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:132:2: rule__Component__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Component__Group__0_in_ruleComponent214);
            rule__Component__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleEnsemble"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:144:1: entryRuleEnsemble : ruleEnsemble EOF ;
    public final void entryRuleEnsemble() throws RecognitionException {
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:145:1: ( ruleEnsemble EOF )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:146:1: ruleEnsemble EOF
            {
             before(grammarAccess.getEnsembleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnsemble_in_entryRuleEnsemble241);
            ruleEnsemble();

            state._fsp--;

             after(grammarAccess.getEnsembleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnsemble248); 

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
    // $ANTLR end "entryRuleEnsemble"


    // $ANTLR start "ruleEnsemble"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:153:1: ruleEnsemble : ( ( rule__Ensemble__Group__0 ) ) ;
    public final void ruleEnsemble() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:157:2: ( ( ( rule__Ensemble__Group__0 ) ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:158:1: ( ( rule__Ensemble__Group__0 ) )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:158:1: ( ( rule__Ensemble__Group__0 ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:159:1: ( rule__Ensemble__Group__0 )
            {
             before(grammarAccess.getEnsembleAccess().getGroup()); 
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:160:1: ( rule__Ensemble__Group__0 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:160:2: rule__Ensemble__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group__0_in_ruleEnsemble274);
            rule__Ensemble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnsembleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnsemble"


    // $ANTLR start "entryRuleProcess"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:172:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:173:1: ( ruleProcess EOF )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:174:1: ruleProcess EOF
            {
             before(grammarAccess.getProcessRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProcess_in_entryRuleProcess301);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getProcessRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProcess308); 

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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:181:1: ruleProcess : ( ( rule__Process__Group__0 ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:185:2: ( ( ( rule__Process__Group__0 ) ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:186:1: ( ( rule__Process__Group__0 ) )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:186:1: ( ( rule__Process__Group__0 ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:187:1: ( rule__Process__Group__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup()); 
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:188:1: ( rule__Process__Group__0 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:188:2: rule__Process__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Process__Group__0_in_ruleProcess334);
            rule__Process__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcess"


    // $ANTLR start "rule__EString__Alternatives"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:200:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:204:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:205:1: ( RULE_STRING )
                    {
                    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:205:1: ( RULE_STRING )
                    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:206:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives370); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:211:6: ( RULE_ID )
                    {
                    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:211:6: ( RULE_ID )
                    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:212:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives387); 
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


    // $ANTLR start "rule__System__Group__0"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:224:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:228:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:229:2: rule__System__Group__0__Impl rule__System__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__System__Group__0__Impl_in_rule__System__Group__0417);
            rule__System__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__System__Group__1_in_rule__System__Group__0420);
            rule__System__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__0"


    // $ANTLR start "rule__System__Group__0__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:236:1: rule__System__Group__0__Impl : ( () ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:240:1: ( ( () ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:241:1: ( () )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:241:1: ( () )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:242:1: ()
            {
             before(grammarAccess.getSystemAccess().getSystemAction_0()); 
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:243:1: ()
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:245:1: 
            {
            }

             after(grammarAccess.getSystemAccess().getSystemAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__0__Impl"


    // $ANTLR start "rule__System__Group__1"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:255:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:259:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:260:2: rule__System__Group__1__Impl rule__System__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__System__Group__1__Impl_in_rule__System__Group__1478);
            rule__System__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__System__Group__2_in_rule__System__Group__1481);
            rule__System__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__1"


    // $ANTLR start "rule__System__Group__1__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:267:1: rule__System__Group__1__Impl : ( 'System' ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:271:1: ( ( 'System' ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:272:1: ( 'System' )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:272:1: ( 'System' )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:273:1: 'System'
            {
             before(grammarAccess.getSystemAccess().getSystemKeyword_1()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__System__Group__1__Impl509); 
             after(grammarAccess.getSystemAccess().getSystemKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__1__Impl"


    // $ANTLR start "rule__System__Group__2"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:286:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:290:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:291:2: rule__System__Group__2__Impl rule__System__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__System__Group__2__Impl_in_rule__System__Group__2540);
            rule__System__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__System__Group__3_in_rule__System__Group__2543);
            rule__System__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__2"


    // $ANTLR start "rule__System__Group__2__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:298:1: rule__System__Group__2__Impl : ( ( rule__System__NameAssignment_2 ) ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:302:1: ( ( ( rule__System__NameAssignment_2 ) ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:303:1: ( ( rule__System__NameAssignment_2 ) )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:303:1: ( ( rule__System__NameAssignment_2 ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:304:1: ( rule__System__NameAssignment_2 )
            {
             before(grammarAccess.getSystemAccess().getNameAssignment_2()); 
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:305:1: ( rule__System__NameAssignment_2 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:305:2: rule__System__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__System__NameAssignment_2_in_rule__System__Group__2__Impl570);
            rule__System__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__2__Impl"


    // $ANTLR start "rule__System__Group__3"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:315:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:319:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:320:2: rule__System__Group__3__Impl rule__System__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__System__Group__3__Impl_in_rule__System__Group__3600);
            rule__System__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__System__Group__4_in_rule__System__Group__3603);
            rule__System__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__3"


    // $ANTLR start "rule__System__Group__3__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:327:1: rule__System__Group__3__Impl : ( '{' ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:331:1: ( ( '{' ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:332:1: ( '{' )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:332:1: ( '{' )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:333:1: '{'
            {
             before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__System__Group__3__Impl631); 
             after(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__3__Impl"


    // $ANTLR start "rule__System__Group__4"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:346:1: rule__System__Group__4 : rule__System__Group__4__Impl rule__System__Group__5 ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:350:1: ( rule__System__Group__4__Impl rule__System__Group__5 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:351:2: rule__System__Group__4__Impl rule__System__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__System__Group__4__Impl_in_rule__System__Group__4662);
            rule__System__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__System__Group__5_in_rule__System__Group__4665);
            rule__System__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__4"


    // $ANTLR start "rule__System__Group__4__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:358:1: rule__System__Group__4__Impl : ( ( rule__System__Group_4__0 )? ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:362:1: ( ( ( rule__System__Group_4__0 )? ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:363:1: ( ( rule__System__Group_4__0 )? )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:363:1: ( ( rule__System__Group_4__0 )? )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:364:1: ( rule__System__Group_4__0 )?
            {
             before(grammarAccess.getSystemAccess().getGroup_4()); 
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:365:1: ( rule__System__Group_4__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:365:2: rule__System__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__System__Group_4__0_in_rule__System__Group__4__Impl692);
                    rule__System__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSystemAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__4__Impl"


    // $ANTLR start "rule__System__Group__5"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:375:1: rule__System__Group__5 : rule__System__Group__5__Impl rule__System__Group__6 ;
    public final void rule__System__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:379:1: ( rule__System__Group__5__Impl rule__System__Group__6 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:380:2: rule__System__Group__5__Impl rule__System__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__System__Group__5__Impl_in_rule__System__Group__5723);
            rule__System__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__System__Group__6_in_rule__System__Group__5726);
            rule__System__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__5"


    // $ANTLR start "rule__System__Group__5__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:387:1: rule__System__Group__5__Impl : ( ( rule__System__Group_5__0 )? ) ;
    public final void rule__System__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:391:1: ( ( ( rule__System__Group_5__0 )? ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:392:1: ( ( rule__System__Group_5__0 )? )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:392:1: ( ( rule__System__Group_5__0 )? )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:393:1: ( rule__System__Group_5__0 )?
            {
             before(grammarAccess.getSystemAccess().getGroup_5()); 
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:394:1: ( rule__System__Group_5__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:394:2: rule__System__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__System__Group_5__0_in_rule__System__Group__5__Impl753);
                    rule__System__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSystemAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__5__Impl"


    // $ANTLR start "rule__System__Group__6"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:404:1: rule__System__Group__6 : rule__System__Group__6__Impl ;
    public final void rule__System__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:408:1: ( rule__System__Group__6__Impl )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:409:2: rule__System__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__System__Group__6__Impl_in_rule__System__Group__6784);
            rule__System__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__6"


    // $ANTLR start "rule__System__Group__6__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:415:1: rule__System__Group__6__Impl : ( '}' ) ;
    public final void rule__System__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:419:1: ( ( '}' ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:420:1: ( '}' )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:420:1: ( '}' )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:421:1: '}'
            {
             before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__System__Group__6__Impl812); 
             after(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__6__Impl"


    // $ANTLR start "rule__System__Group_4__0"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:448:1: rule__System__Group_4__0 : rule__System__Group_4__0__Impl rule__System__Group_4__1 ;
    public final void rule__System__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:452:1: ( rule__System__Group_4__0__Impl rule__System__Group_4__1 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:453:2: rule__System__Group_4__0__Impl rule__System__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__System__Group_4__0__Impl_in_rule__System__Group_4__0857);
            rule__System__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__System__Group_4__1_in_rule__System__Group_4__0860);
            rule__System__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_4__0"


    // $ANTLR start "rule__System__Group_4__0__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:460:1: rule__System__Group_4__0__Impl : ( 'components' ) ;
    public final void rule__System__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:464:1: ( ( 'components' ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:465:1: ( 'components' )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:465:1: ( 'components' )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:466:1: 'components'
            {
             before(grammarAccess.getSystemAccess().getComponentsKeyword_4_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__System__Group_4__0__Impl888); 
             after(grammarAccess.getSystemAccess().getComponentsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_4__0__Impl"


    // $ANTLR start "rule__System__Group_4__1"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:479:1: rule__System__Group_4__1 : rule__System__Group_4__1__Impl rule__System__Group_4__2 ;
    public final void rule__System__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:483:1: ( rule__System__Group_4__1__Impl rule__System__Group_4__2 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:484:2: rule__System__Group_4__1__Impl rule__System__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__System__Group_4__1__Impl_in_rule__System__Group_4__1919);
            rule__System__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__System__Group_4__2_in_rule__System__Group_4__1922);
            rule__System__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_4__1"


    // $ANTLR start "rule__System__Group_4__1__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:491:1: rule__System__Group_4__1__Impl : ( '{' ) ;
    public final void rule__System__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:495:1: ( ( '{' ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:496:1: ( '{' )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:496:1: ( '{' )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:497:1: '{'
            {
             before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__System__Group_4__1__Impl950); 
             after(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_4__1__Impl"


    // $ANTLR start "rule__System__Group_4__2"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:510:1: rule__System__Group_4__2 : rule__System__Group_4__2__Impl rule__System__Group_4__3 ;
    public final void rule__System__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:514:1: ( rule__System__Group_4__2__Impl rule__System__Group_4__3 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:515:2: rule__System__Group_4__2__Impl rule__System__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__System__Group_4__2__Impl_in_rule__System__Group_4__2981);
            rule__System__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__System__Group_4__3_in_rule__System__Group_4__2984);
            rule__System__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_4__2"


    // $ANTLR start "rule__System__Group_4__2__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:522:1: rule__System__Group_4__2__Impl : ( ( rule__System__ComponentsAssignment_4_2 ) ) ;
    public final void rule__System__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:526:1: ( ( ( rule__System__ComponentsAssignment_4_2 ) ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:527:1: ( ( rule__System__ComponentsAssignment_4_2 ) )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:527:1: ( ( rule__System__ComponentsAssignment_4_2 ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:528:1: ( rule__System__ComponentsAssignment_4_2 )
            {
             before(grammarAccess.getSystemAccess().getComponentsAssignment_4_2()); 
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:529:1: ( rule__System__ComponentsAssignment_4_2 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:529:2: rule__System__ComponentsAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__System__ComponentsAssignment_4_2_in_rule__System__Group_4__2__Impl1011);
            rule__System__ComponentsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getComponentsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_4__2__Impl"


    // $ANTLR start "rule__System__Group_4__3"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:539:1: rule__System__Group_4__3 : rule__System__Group_4__3__Impl rule__System__Group_4__4 ;
    public final void rule__System__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:543:1: ( rule__System__Group_4__3__Impl rule__System__Group_4__4 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:544:2: rule__System__Group_4__3__Impl rule__System__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__System__Group_4__3__Impl_in_rule__System__Group_4__31041);
            rule__System__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__System__Group_4__4_in_rule__System__Group_4__31044);
            rule__System__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_4__3"


    // $ANTLR start "rule__System__Group_4__3__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:551:1: rule__System__Group_4__3__Impl : ( ( rule__System__Group_4_3__0 )* ) ;
    public final void rule__System__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:555:1: ( ( ( rule__System__Group_4_3__0 )* ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:556:1: ( ( rule__System__Group_4_3__0 )* )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:556:1: ( ( rule__System__Group_4_3__0 )* )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:557:1: ( rule__System__Group_4_3__0 )*
            {
             before(grammarAccess.getSystemAccess().getGroup_4_3()); 
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:558:1: ( rule__System__Group_4_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:558:2: rule__System__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__System__Group_4_3__0_in_rule__System__Group_4__3__Impl1071);
            	    rule__System__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_4__3__Impl"


    // $ANTLR start "rule__System__Group_4__4"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:568:1: rule__System__Group_4__4 : rule__System__Group_4__4__Impl ;
    public final void rule__System__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:572:1: ( rule__System__Group_4__4__Impl )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:573:2: rule__System__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__System__Group_4__4__Impl_in_rule__System__Group_4__41102);
            rule__System__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_4__4"


    // $ANTLR start "rule__System__Group_4__4__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:579:1: rule__System__Group_4__4__Impl : ( '}' ) ;
    public final void rule__System__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:583:1: ( ( '}' ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:584:1: ( '}' )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:584:1: ( '}' )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:585:1: '}'
            {
             before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__System__Group_4__4__Impl1130); 
             after(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_4__4__Impl"


    // $ANTLR start "rule__System__Group_4_3__0"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:608:1: rule__System__Group_4_3__0 : rule__System__Group_4_3__0__Impl rule__System__Group_4_3__1 ;
    public final void rule__System__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:612:1: ( rule__System__Group_4_3__0__Impl rule__System__Group_4_3__1 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:613:2: rule__System__Group_4_3__0__Impl rule__System__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__System__Group_4_3__0__Impl_in_rule__System__Group_4_3__01171);
            rule__System__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__System__Group_4_3__1_in_rule__System__Group_4_3__01174);
            rule__System__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_4_3__0"


    // $ANTLR start "rule__System__Group_4_3__0__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:620:1: rule__System__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__System__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:624:1: ( ( ',' ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:625:1: ( ',' )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:625:1: ( ',' )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:626:1: ','
            {
             before(grammarAccess.getSystemAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__System__Group_4_3__0__Impl1202); 
             after(grammarAccess.getSystemAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_4_3__0__Impl"


    // $ANTLR start "rule__System__Group_4_3__1"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:639:1: rule__System__Group_4_3__1 : rule__System__Group_4_3__1__Impl ;
    public final void rule__System__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:643:1: ( rule__System__Group_4_3__1__Impl )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:644:2: rule__System__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__System__Group_4_3__1__Impl_in_rule__System__Group_4_3__11233);
            rule__System__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_4_3__1"


    // $ANTLR start "rule__System__Group_4_3__1__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:650:1: rule__System__Group_4_3__1__Impl : ( ( rule__System__ComponentsAssignment_4_3_1 ) ) ;
    public final void rule__System__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:654:1: ( ( ( rule__System__ComponentsAssignment_4_3_1 ) ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:655:1: ( ( rule__System__ComponentsAssignment_4_3_1 ) )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:655:1: ( ( rule__System__ComponentsAssignment_4_3_1 ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:656:1: ( rule__System__ComponentsAssignment_4_3_1 )
            {
             before(grammarAccess.getSystemAccess().getComponentsAssignment_4_3_1()); 
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:657:1: ( rule__System__ComponentsAssignment_4_3_1 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:657:2: rule__System__ComponentsAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__System__ComponentsAssignment_4_3_1_in_rule__System__Group_4_3__1__Impl1260);
            rule__System__ComponentsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getComponentsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_4_3__1__Impl"


    // $ANTLR start "rule__System__Group_5__0"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:671:1: rule__System__Group_5__0 : rule__System__Group_5__0__Impl rule__System__Group_5__1 ;
    public final void rule__System__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:675:1: ( rule__System__Group_5__0__Impl rule__System__Group_5__1 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:676:2: rule__System__Group_5__0__Impl rule__System__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__System__Group_5__0__Impl_in_rule__System__Group_5__01294);
            rule__System__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__System__Group_5__1_in_rule__System__Group_5__01297);
            rule__System__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_5__0"


    // $ANTLR start "rule__System__Group_5__0__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:683:1: rule__System__Group_5__0__Impl : ( 'ensembles' ) ;
    public final void rule__System__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:687:1: ( ( 'ensembles' ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:688:1: ( 'ensembles' )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:688:1: ( 'ensembles' )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:689:1: 'ensembles'
            {
             before(grammarAccess.getSystemAccess().getEnsemblesKeyword_5_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__System__Group_5__0__Impl1325); 
             after(grammarAccess.getSystemAccess().getEnsemblesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_5__0__Impl"


    // $ANTLR start "rule__System__Group_5__1"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:702:1: rule__System__Group_5__1 : rule__System__Group_5__1__Impl rule__System__Group_5__2 ;
    public final void rule__System__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:706:1: ( rule__System__Group_5__1__Impl rule__System__Group_5__2 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:707:2: rule__System__Group_5__1__Impl rule__System__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__System__Group_5__1__Impl_in_rule__System__Group_5__11356);
            rule__System__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__System__Group_5__2_in_rule__System__Group_5__11359);
            rule__System__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_5__1"


    // $ANTLR start "rule__System__Group_5__1__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:714:1: rule__System__Group_5__1__Impl : ( '{' ) ;
    public final void rule__System__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:718:1: ( ( '{' ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:719:1: ( '{' )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:719:1: ( '{' )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:720:1: '{'
            {
             before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__System__Group_5__1__Impl1387); 
             after(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_5__1__Impl"


    // $ANTLR start "rule__System__Group_5__2"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:733:1: rule__System__Group_5__2 : rule__System__Group_5__2__Impl rule__System__Group_5__3 ;
    public final void rule__System__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:737:1: ( rule__System__Group_5__2__Impl rule__System__Group_5__3 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:738:2: rule__System__Group_5__2__Impl rule__System__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__System__Group_5__2__Impl_in_rule__System__Group_5__21418);
            rule__System__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__System__Group_5__3_in_rule__System__Group_5__21421);
            rule__System__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_5__2"


    // $ANTLR start "rule__System__Group_5__2__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:745:1: rule__System__Group_5__2__Impl : ( ( rule__System__EnsemblesAssignment_5_2 ) ) ;
    public final void rule__System__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:749:1: ( ( ( rule__System__EnsemblesAssignment_5_2 ) ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:750:1: ( ( rule__System__EnsemblesAssignment_5_2 ) )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:750:1: ( ( rule__System__EnsemblesAssignment_5_2 ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:751:1: ( rule__System__EnsemblesAssignment_5_2 )
            {
             before(grammarAccess.getSystemAccess().getEnsemblesAssignment_5_2()); 
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:752:1: ( rule__System__EnsemblesAssignment_5_2 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:752:2: rule__System__EnsemblesAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__System__EnsemblesAssignment_5_2_in_rule__System__Group_5__2__Impl1448);
            rule__System__EnsemblesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getEnsemblesAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_5__2__Impl"


    // $ANTLR start "rule__System__Group_5__3"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:762:1: rule__System__Group_5__3 : rule__System__Group_5__3__Impl rule__System__Group_5__4 ;
    public final void rule__System__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:766:1: ( rule__System__Group_5__3__Impl rule__System__Group_5__4 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:767:2: rule__System__Group_5__3__Impl rule__System__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__System__Group_5__3__Impl_in_rule__System__Group_5__31478);
            rule__System__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__System__Group_5__4_in_rule__System__Group_5__31481);
            rule__System__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_5__3"


    // $ANTLR start "rule__System__Group_5__3__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:774:1: rule__System__Group_5__3__Impl : ( ( rule__System__Group_5_3__0 )* ) ;
    public final void rule__System__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:778:1: ( ( ( rule__System__Group_5_3__0 )* ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:779:1: ( ( rule__System__Group_5_3__0 )* )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:779:1: ( ( rule__System__Group_5_3__0 )* )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:780:1: ( rule__System__Group_5_3__0 )*
            {
             before(grammarAccess.getSystemAccess().getGroup_5_3()); 
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:781:1: ( rule__System__Group_5_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:781:2: rule__System__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__System__Group_5_3__0_in_rule__System__Group_5__3__Impl1508);
            	    rule__System__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_5__3__Impl"


    // $ANTLR start "rule__System__Group_5__4"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:791:1: rule__System__Group_5__4 : rule__System__Group_5__4__Impl ;
    public final void rule__System__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:795:1: ( rule__System__Group_5__4__Impl )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:796:2: rule__System__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__System__Group_5__4__Impl_in_rule__System__Group_5__41539);
            rule__System__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_5__4"


    // $ANTLR start "rule__System__Group_5__4__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:802:1: rule__System__Group_5__4__Impl : ( '}' ) ;
    public final void rule__System__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:806:1: ( ( '}' ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:807:1: ( '}' )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:807:1: ( '}' )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:808:1: '}'
            {
             before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__System__Group_5__4__Impl1567); 
             after(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_5__4__Impl"


    // $ANTLR start "rule__System__Group_5_3__0"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:831:1: rule__System__Group_5_3__0 : rule__System__Group_5_3__0__Impl rule__System__Group_5_3__1 ;
    public final void rule__System__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:835:1: ( rule__System__Group_5_3__0__Impl rule__System__Group_5_3__1 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:836:2: rule__System__Group_5_3__0__Impl rule__System__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__System__Group_5_3__0__Impl_in_rule__System__Group_5_3__01608);
            rule__System__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__System__Group_5_3__1_in_rule__System__Group_5_3__01611);
            rule__System__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_5_3__0"


    // $ANTLR start "rule__System__Group_5_3__0__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:843:1: rule__System__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__System__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:847:1: ( ( ',' ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:848:1: ( ',' )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:848:1: ( ',' )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:849:1: ','
            {
             before(grammarAccess.getSystemAccess().getCommaKeyword_5_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__System__Group_5_3__0__Impl1639); 
             after(grammarAccess.getSystemAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_5_3__0__Impl"


    // $ANTLR start "rule__System__Group_5_3__1"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:862:1: rule__System__Group_5_3__1 : rule__System__Group_5_3__1__Impl ;
    public final void rule__System__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:866:1: ( rule__System__Group_5_3__1__Impl )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:867:2: rule__System__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__System__Group_5_3__1__Impl_in_rule__System__Group_5_3__11670);
            rule__System__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_5_3__1"


    // $ANTLR start "rule__System__Group_5_3__1__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:873:1: rule__System__Group_5_3__1__Impl : ( ( rule__System__EnsemblesAssignment_5_3_1 ) ) ;
    public final void rule__System__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:877:1: ( ( ( rule__System__EnsemblesAssignment_5_3_1 ) ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:878:1: ( ( rule__System__EnsemblesAssignment_5_3_1 ) )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:878:1: ( ( rule__System__EnsemblesAssignment_5_3_1 ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:879:1: ( rule__System__EnsemblesAssignment_5_3_1 )
            {
             before(grammarAccess.getSystemAccess().getEnsemblesAssignment_5_3_1()); 
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:880:1: ( rule__System__EnsemblesAssignment_5_3_1 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:880:2: rule__System__EnsemblesAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__System__EnsemblesAssignment_5_3_1_in_rule__System__Group_5_3__1__Impl1697);
            rule__System__EnsemblesAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getEnsemblesAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_5_3__1__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:894:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:898:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:899:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Component__Group__0__Impl_in_rule__Component__Group__01731);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Component__Group__1_in_rule__Component__Group__01734);
            rule__Component__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:906:1: rule__Component__Group__0__Impl : ( 'Component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:910:1: ( ( 'Component' ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:911:1: ( 'Component' )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:911:1: ( 'Component' )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:912:1: 'Component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Component__Group__0__Impl1762); 
             after(grammarAccess.getComponentAccess().getComponentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:925:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:929:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:930:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Component__Group__1__Impl_in_rule__Component__Group__11793);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Component__Group__2_in_rule__Component__Group__11796);
            rule__Component__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:937:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:941:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:942:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:942:1: ( ( rule__Component__NameAssignment_1 ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:943:1: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:944:1: ( rule__Component__NameAssignment_1 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:944:2: rule__Component__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Component__NameAssignment_1_in_rule__Component__Group__1__Impl1823);
            rule__Component__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__2"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:954:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:958:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:959:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Component__Group__2__Impl_in_rule__Component__Group__21853);
            rule__Component__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Component__Group__3_in_rule__Component__Group__21856);
            rule__Component__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2"


    // $ANTLR start "rule__Component__Group__2__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:966:1: rule__Component__Group__2__Impl : ( '{' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:970:1: ( ( '{' ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:971:1: ( '{' )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:971:1: ( '{' )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:972:1: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Component__Group__2__Impl1884); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__3"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:985:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:989:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:990:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Component__Group__3__Impl_in_rule__Component__Group__31915);
            rule__Component__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Component__Group__4_in_rule__Component__Group__31918);
            rule__Component__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3"


    // $ANTLR start "rule__Component__Group__3__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:997:1: rule__Component__Group__3__Impl : ( 'process' ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1001:1: ( ( 'process' ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1002:1: ( 'process' )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1002:1: ( 'process' )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1003:1: 'process'
            {
             before(grammarAccess.getComponentAccess().getProcessKeyword_3()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Component__Group__3__Impl1946); 
             after(grammarAccess.getComponentAccess().getProcessKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3__Impl"


    // $ANTLR start "rule__Component__Group__4"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1016:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1020:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1021:2: rule__Component__Group__4__Impl rule__Component__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Component__Group__4__Impl_in_rule__Component__Group__41977);
            rule__Component__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Component__Group__5_in_rule__Component__Group__41980);
            rule__Component__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__4"


    // $ANTLR start "rule__Component__Group__4__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1028:1: rule__Component__Group__4__Impl : ( ( rule__Component__ProcessAssignment_4 ) ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1032:1: ( ( ( rule__Component__ProcessAssignment_4 ) ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1033:1: ( ( rule__Component__ProcessAssignment_4 ) )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1033:1: ( ( rule__Component__ProcessAssignment_4 ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1034:1: ( rule__Component__ProcessAssignment_4 )
            {
             before(grammarAccess.getComponentAccess().getProcessAssignment_4()); 
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1035:1: ( rule__Component__ProcessAssignment_4 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1035:2: rule__Component__ProcessAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Component__ProcessAssignment_4_in_rule__Component__Group__4__Impl2007);
            rule__Component__ProcessAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getProcessAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__4__Impl"


    // $ANTLR start "rule__Component__Group__5"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1045:1: rule__Component__Group__5 : rule__Component__Group__5__Impl rule__Component__Group__6 ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1049:1: ( rule__Component__Group__5__Impl rule__Component__Group__6 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1050:2: rule__Component__Group__5__Impl rule__Component__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Component__Group__5__Impl_in_rule__Component__Group__52037);
            rule__Component__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Component__Group__6_in_rule__Component__Group__52040);
            rule__Component__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__5"


    // $ANTLR start "rule__Component__Group__5__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1057:1: rule__Component__Group__5__Impl : ( ( rule__Component__Group_5__0 )? ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1061:1: ( ( ( rule__Component__Group_5__0 )? ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1062:1: ( ( rule__Component__Group_5__0 )? )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1062:1: ( ( rule__Component__Group_5__0 )? )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1063:1: ( rule__Component__Group_5__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_5()); 
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1064:1: ( rule__Component__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1064:2: rule__Component__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Component__Group_5__0_in_rule__Component__Group__5__Impl2067);
                    rule__Component__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__5__Impl"


    // $ANTLR start "rule__Component__Group__6"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1074:1: rule__Component__Group__6 : rule__Component__Group__6__Impl rule__Component__Group__7 ;
    public final void rule__Component__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1078:1: ( rule__Component__Group__6__Impl rule__Component__Group__7 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1079:2: rule__Component__Group__6__Impl rule__Component__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Component__Group__6__Impl_in_rule__Component__Group__62098);
            rule__Component__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Component__Group__7_in_rule__Component__Group__62101);
            rule__Component__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__6"


    // $ANTLR start "rule__Component__Group__6__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1086:1: rule__Component__Group__6__Impl : ( ( rule__Component__Group_6__0 )? ) ;
    public final void rule__Component__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1090:1: ( ( ( rule__Component__Group_6__0 )? ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1091:1: ( ( rule__Component__Group_6__0 )? )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1091:1: ( ( rule__Component__Group_6__0 )? )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1092:1: ( rule__Component__Group_6__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_6()); 
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1093:1: ( rule__Component__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1093:2: rule__Component__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Component__Group_6__0_in_rule__Component__Group__6__Impl2128);
                    rule__Component__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__6__Impl"


    // $ANTLR start "rule__Component__Group__7"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1103:1: rule__Component__Group__7 : rule__Component__Group__7__Impl ;
    public final void rule__Component__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1107:1: ( rule__Component__Group__7__Impl )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1108:2: rule__Component__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Component__Group__7__Impl_in_rule__Component__Group__72159);
            rule__Component__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__7"


    // $ANTLR start "rule__Component__Group__7__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1114:1: rule__Component__Group__7__Impl : ( '}' ) ;
    public final void rule__Component__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1118:1: ( ( '}' ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1119:1: ( '}' )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1119:1: ( '}' )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1120:1: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Component__Group__7__Impl2187); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__7__Impl"


    // $ANTLR start "rule__Component__Group_5__0"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1149:1: rule__Component__Group_5__0 : rule__Component__Group_5__0__Impl rule__Component__Group_5__1 ;
    public final void rule__Component__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1153:1: ( rule__Component__Group_5__0__Impl rule__Component__Group_5__1 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1154:2: rule__Component__Group_5__0__Impl rule__Component__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Component__Group_5__0__Impl_in_rule__Component__Group_5__02234);
            rule__Component__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Component__Group_5__1_in_rule__Component__Group_5__02237);
            rule__Component__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_5__0"


    // $ANTLR start "rule__Component__Group_5__0__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1161:1: rule__Component__Group_5__0__Impl : ( 'ensembleMember' ) ;
    public final void rule__Component__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1165:1: ( ( 'ensembleMember' ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1166:1: ( 'ensembleMember' )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1166:1: ( 'ensembleMember' )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1167:1: 'ensembleMember'
            {
             before(grammarAccess.getComponentAccess().getEnsembleMemberKeyword_5_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Component__Group_5__0__Impl2265); 
             after(grammarAccess.getComponentAccess().getEnsembleMemberKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_5__0__Impl"


    // $ANTLR start "rule__Component__Group_5__1"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1180:1: rule__Component__Group_5__1 : rule__Component__Group_5__1__Impl ;
    public final void rule__Component__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1184:1: ( rule__Component__Group_5__1__Impl )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1185:2: rule__Component__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Component__Group_5__1__Impl_in_rule__Component__Group_5__12296);
            rule__Component__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_5__1"


    // $ANTLR start "rule__Component__Group_5__1__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1191:1: rule__Component__Group_5__1__Impl : ( ( rule__Component__EnsembleMemberAssignment_5_1 ) ) ;
    public final void rule__Component__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1195:1: ( ( ( rule__Component__EnsembleMemberAssignment_5_1 ) ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1196:1: ( ( rule__Component__EnsembleMemberAssignment_5_1 ) )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1196:1: ( ( rule__Component__EnsembleMemberAssignment_5_1 ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1197:1: ( rule__Component__EnsembleMemberAssignment_5_1 )
            {
             before(grammarAccess.getComponentAccess().getEnsembleMemberAssignment_5_1()); 
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1198:1: ( rule__Component__EnsembleMemberAssignment_5_1 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1198:2: rule__Component__EnsembleMemberAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Component__EnsembleMemberAssignment_5_1_in_rule__Component__Group_5__1__Impl2323);
            rule__Component__EnsembleMemberAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getEnsembleMemberAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_5__1__Impl"


    // $ANTLR start "rule__Component__Group_6__0"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1212:1: rule__Component__Group_6__0 : rule__Component__Group_6__0__Impl rule__Component__Group_6__1 ;
    public final void rule__Component__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1216:1: ( rule__Component__Group_6__0__Impl rule__Component__Group_6__1 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1217:2: rule__Component__Group_6__0__Impl rule__Component__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Component__Group_6__0__Impl_in_rule__Component__Group_6__02357);
            rule__Component__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Component__Group_6__1_in_rule__Component__Group_6__02360);
            rule__Component__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_6__0"


    // $ANTLR start "rule__Component__Group_6__0__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1224:1: rule__Component__Group_6__0__Impl : ( 'ensembleCordinator' ) ;
    public final void rule__Component__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1228:1: ( ( 'ensembleCordinator' ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1229:1: ( 'ensembleCordinator' )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1229:1: ( 'ensembleCordinator' )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1230:1: 'ensembleCordinator'
            {
             before(grammarAccess.getComponentAccess().getEnsembleCordinatorKeyword_6_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Component__Group_6__0__Impl2388); 
             after(grammarAccess.getComponentAccess().getEnsembleCordinatorKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_6__0__Impl"


    // $ANTLR start "rule__Component__Group_6__1"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1243:1: rule__Component__Group_6__1 : rule__Component__Group_6__1__Impl ;
    public final void rule__Component__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1247:1: ( rule__Component__Group_6__1__Impl )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1248:2: rule__Component__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Component__Group_6__1__Impl_in_rule__Component__Group_6__12419);
            rule__Component__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_6__1"


    // $ANTLR start "rule__Component__Group_6__1__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1254:1: rule__Component__Group_6__1__Impl : ( ( rule__Component__EnsembleCordinatorAssignment_6_1 ) ) ;
    public final void rule__Component__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1258:1: ( ( ( rule__Component__EnsembleCordinatorAssignment_6_1 ) ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1259:1: ( ( rule__Component__EnsembleCordinatorAssignment_6_1 ) )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1259:1: ( ( rule__Component__EnsembleCordinatorAssignment_6_1 ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1260:1: ( rule__Component__EnsembleCordinatorAssignment_6_1 )
            {
             before(grammarAccess.getComponentAccess().getEnsembleCordinatorAssignment_6_1()); 
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1261:1: ( rule__Component__EnsembleCordinatorAssignment_6_1 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1261:2: rule__Component__EnsembleCordinatorAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Component__EnsembleCordinatorAssignment_6_1_in_rule__Component__Group_6__1__Impl2446);
            rule__Component__EnsembleCordinatorAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getEnsembleCordinatorAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_6__1__Impl"


    // $ANTLR start "rule__Ensemble__Group__0"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1275:1: rule__Ensemble__Group__0 : rule__Ensemble__Group__0__Impl rule__Ensemble__Group__1 ;
    public final void rule__Ensemble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1279:1: ( rule__Ensemble__Group__0__Impl rule__Ensemble__Group__1 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1280:2: rule__Ensemble__Group__0__Impl rule__Ensemble__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group__0__Impl_in_rule__Ensemble__Group__02480);
            rule__Ensemble__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group__1_in_rule__Ensemble__Group__02483);
            rule__Ensemble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group__0"


    // $ANTLR start "rule__Ensemble__Group__0__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1287:1: rule__Ensemble__Group__0__Impl : ( 'Ensemble' ) ;
    public final void rule__Ensemble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1291:1: ( ( 'Ensemble' ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1292:1: ( 'Ensemble' )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1292:1: ( 'Ensemble' )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1293:1: 'Ensemble'
            {
             before(grammarAccess.getEnsembleAccess().getEnsembleKeyword_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Ensemble__Group__0__Impl2511); 
             after(grammarAccess.getEnsembleAccess().getEnsembleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group__0__Impl"


    // $ANTLR start "rule__Ensemble__Group__1"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1306:1: rule__Ensemble__Group__1 : rule__Ensemble__Group__1__Impl rule__Ensemble__Group__2 ;
    public final void rule__Ensemble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1310:1: ( rule__Ensemble__Group__1__Impl rule__Ensemble__Group__2 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1311:2: rule__Ensemble__Group__1__Impl rule__Ensemble__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group__1__Impl_in_rule__Ensemble__Group__12542);
            rule__Ensemble__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group__2_in_rule__Ensemble__Group__12545);
            rule__Ensemble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group__1"


    // $ANTLR start "rule__Ensemble__Group__1__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1318:1: rule__Ensemble__Group__1__Impl : ( ( rule__Ensemble__NameAssignment_1 ) ) ;
    public final void rule__Ensemble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1322:1: ( ( ( rule__Ensemble__NameAssignment_1 ) ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1323:1: ( ( rule__Ensemble__NameAssignment_1 ) )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1323:1: ( ( rule__Ensemble__NameAssignment_1 ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1324:1: ( rule__Ensemble__NameAssignment_1 )
            {
             before(grammarAccess.getEnsembleAccess().getNameAssignment_1()); 
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1325:1: ( rule__Ensemble__NameAssignment_1 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1325:2: rule__Ensemble__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__NameAssignment_1_in_rule__Ensemble__Group__1__Impl2572);
            rule__Ensemble__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnsembleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group__1__Impl"


    // $ANTLR start "rule__Ensemble__Group__2"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1335:1: rule__Ensemble__Group__2 : rule__Ensemble__Group__2__Impl rule__Ensemble__Group__3 ;
    public final void rule__Ensemble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1339:1: ( rule__Ensemble__Group__2__Impl rule__Ensemble__Group__3 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1340:2: rule__Ensemble__Group__2__Impl rule__Ensemble__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group__2__Impl_in_rule__Ensemble__Group__22602);
            rule__Ensemble__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group__3_in_rule__Ensemble__Group__22605);
            rule__Ensemble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group__2"


    // $ANTLR start "rule__Ensemble__Group__2__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1347:1: rule__Ensemble__Group__2__Impl : ( '{' ) ;
    public final void rule__Ensemble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1351:1: ( ( '{' ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1352:1: ( '{' )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1352:1: ( '{' )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1353:1: '{'
            {
             before(grammarAccess.getEnsembleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Ensemble__Group__2__Impl2633); 
             after(grammarAccess.getEnsembleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group__2__Impl"


    // $ANTLR start "rule__Ensemble__Group__3"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1366:1: rule__Ensemble__Group__3 : rule__Ensemble__Group__3__Impl rule__Ensemble__Group__4 ;
    public final void rule__Ensemble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1370:1: ( rule__Ensemble__Group__3__Impl rule__Ensemble__Group__4 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1371:2: rule__Ensemble__Group__3__Impl rule__Ensemble__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group__3__Impl_in_rule__Ensemble__Group__32664);
            rule__Ensemble__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group__4_in_rule__Ensemble__Group__32667);
            rule__Ensemble__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group__3"


    // $ANTLR start "rule__Ensemble__Group__3__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1378:1: rule__Ensemble__Group__3__Impl : ( 'coordinator' ) ;
    public final void rule__Ensemble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1382:1: ( ( 'coordinator' ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1383:1: ( 'coordinator' )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1383:1: ( 'coordinator' )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1384:1: 'coordinator'
            {
             before(grammarAccess.getEnsembleAccess().getCoordinatorKeyword_3()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Ensemble__Group__3__Impl2695); 
             after(grammarAccess.getEnsembleAccess().getCoordinatorKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group__3__Impl"


    // $ANTLR start "rule__Ensemble__Group__4"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1397:1: rule__Ensemble__Group__4 : rule__Ensemble__Group__4__Impl rule__Ensemble__Group__5 ;
    public final void rule__Ensemble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1401:1: ( rule__Ensemble__Group__4__Impl rule__Ensemble__Group__5 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1402:2: rule__Ensemble__Group__4__Impl rule__Ensemble__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group__4__Impl_in_rule__Ensemble__Group__42726);
            rule__Ensemble__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group__5_in_rule__Ensemble__Group__42729);
            rule__Ensemble__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group__4"


    // $ANTLR start "rule__Ensemble__Group__4__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1409:1: rule__Ensemble__Group__4__Impl : ( ( rule__Ensemble__CoordinatorAssignment_4 ) ) ;
    public final void rule__Ensemble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1413:1: ( ( ( rule__Ensemble__CoordinatorAssignment_4 ) ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1414:1: ( ( rule__Ensemble__CoordinatorAssignment_4 ) )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1414:1: ( ( rule__Ensemble__CoordinatorAssignment_4 ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1415:1: ( rule__Ensemble__CoordinatorAssignment_4 )
            {
             before(grammarAccess.getEnsembleAccess().getCoordinatorAssignment_4()); 
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1416:1: ( rule__Ensemble__CoordinatorAssignment_4 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1416:2: rule__Ensemble__CoordinatorAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__CoordinatorAssignment_4_in_rule__Ensemble__Group__4__Impl2756);
            rule__Ensemble__CoordinatorAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEnsembleAccess().getCoordinatorAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group__4__Impl"


    // $ANTLR start "rule__Ensemble__Group__5"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1426:1: rule__Ensemble__Group__5 : rule__Ensemble__Group__5__Impl rule__Ensemble__Group__6 ;
    public final void rule__Ensemble__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1430:1: ( rule__Ensemble__Group__5__Impl rule__Ensemble__Group__6 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1431:2: rule__Ensemble__Group__5__Impl rule__Ensemble__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group__5__Impl_in_rule__Ensemble__Group__52786);
            rule__Ensemble__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group__6_in_rule__Ensemble__Group__52789);
            rule__Ensemble__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group__5"


    // $ANTLR start "rule__Ensemble__Group__5__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1438:1: rule__Ensemble__Group__5__Impl : ( ( rule__Ensemble__Group_5__0 )? ) ;
    public final void rule__Ensemble__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1442:1: ( ( ( rule__Ensemble__Group_5__0 )? ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1443:1: ( ( rule__Ensemble__Group_5__0 )? )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1443:1: ( ( rule__Ensemble__Group_5__0 )? )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1444:1: ( rule__Ensemble__Group_5__0 )?
            {
             before(grammarAccess.getEnsembleAccess().getGroup_5()); 
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1445:1: ( rule__Ensemble__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1445:2: rule__Ensemble__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group_5__0_in_rule__Ensemble__Group__5__Impl2816);
                    rule__Ensemble__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnsembleAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group__5__Impl"


    // $ANTLR start "rule__Ensemble__Group__6"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1455:1: rule__Ensemble__Group__6 : rule__Ensemble__Group__6__Impl ;
    public final void rule__Ensemble__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1459:1: ( rule__Ensemble__Group__6__Impl )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1460:2: rule__Ensemble__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group__6__Impl_in_rule__Ensemble__Group__62847);
            rule__Ensemble__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group__6"


    // $ANTLR start "rule__Ensemble__Group__6__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1466:1: rule__Ensemble__Group__6__Impl : ( '}' ) ;
    public final void rule__Ensemble__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1470:1: ( ( '}' ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1471:1: ( '}' )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1471:1: ( '}' )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1472:1: '}'
            {
             before(grammarAccess.getEnsembleAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Ensemble__Group__6__Impl2875); 
             after(grammarAccess.getEnsembleAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group__6__Impl"


    // $ANTLR start "rule__Ensemble__Group_5__0"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1499:1: rule__Ensemble__Group_5__0 : rule__Ensemble__Group_5__0__Impl rule__Ensemble__Group_5__1 ;
    public final void rule__Ensemble__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1503:1: ( rule__Ensemble__Group_5__0__Impl rule__Ensemble__Group_5__1 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1504:2: rule__Ensemble__Group_5__0__Impl rule__Ensemble__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group_5__0__Impl_in_rule__Ensemble__Group_5__02920);
            rule__Ensemble__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group_5__1_in_rule__Ensemble__Group_5__02923);
            rule__Ensemble__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group_5__0"


    // $ANTLR start "rule__Ensemble__Group_5__0__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1511:1: rule__Ensemble__Group_5__0__Impl : ( 'members' ) ;
    public final void rule__Ensemble__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1515:1: ( ( 'members' ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1516:1: ( 'members' )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1516:1: ( 'members' )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1517:1: 'members'
            {
             before(grammarAccess.getEnsembleAccess().getMembersKeyword_5_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Ensemble__Group_5__0__Impl2951); 
             after(grammarAccess.getEnsembleAccess().getMembersKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group_5__0__Impl"


    // $ANTLR start "rule__Ensemble__Group_5__1"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1530:1: rule__Ensemble__Group_5__1 : rule__Ensemble__Group_5__1__Impl rule__Ensemble__Group_5__2 ;
    public final void rule__Ensemble__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1534:1: ( rule__Ensemble__Group_5__1__Impl rule__Ensemble__Group_5__2 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1535:2: rule__Ensemble__Group_5__1__Impl rule__Ensemble__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group_5__1__Impl_in_rule__Ensemble__Group_5__12982);
            rule__Ensemble__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group_5__2_in_rule__Ensemble__Group_5__12985);
            rule__Ensemble__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group_5__1"


    // $ANTLR start "rule__Ensemble__Group_5__1__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1542:1: rule__Ensemble__Group_5__1__Impl : ( '(' ) ;
    public final void rule__Ensemble__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1546:1: ( ( '(' ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1547:1: ( '(' )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1547:1: ( '(' )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1548:1: '('
            {
             before(grammarAccess.getEnsembleAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Ensemble__Group_5__1__Impl3013); 
             after(grammarAccess.getEnsembleAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group_5__1__Impl"


    // $ANTLR start "rule__Ensemble__Group_5__2"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1561:1: rule__Ensemble__Group_5__2 : rule__Ensemble__Group_5__2__Impl rule__Ensemble__Group_5__3 ;
    public final void rule__Ensemble__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1565:1: ( rule__Ensemble__Group_5__2__Impl rule__Ensemble__Group_5__3 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1566:2: rule__Ensemble__Group_5__2__Impl rule__Ensemble__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group_5__2__Impl_in_rule__Ensemble__Group_5__23044);
            rule__Ensemble__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group_5__3_in_rule__Ensemble__Group_5__23047);
            rule__Ensemble__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group_5__2"


    // $ANTLR start "rule__Ensemble__Group_5__2__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1573:1: rule__Ensemble__Group_5__2__Impl : ( ( rule__Ensemble__MembersAssignment_5_2 ) ) ;
    public final void rule__Ensemble__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1577:1: ( ( ( rule__Ensemble__MembersAssignment_5_2 ) ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1578:1: ( ( rule__Ensemble__MembersAssignment_5_2 ) )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1578:1: ( ( rule__Ensemble__MembersAssignment_5_2 ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1579:1: ( rule__Ensemble__MembersAssignment_5_2 )
            {
             before(grammarAccess.getEnsembleAccess().getMembersAssignment_5_2()); 
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1580:1: ( rule__Ensemble__MembersAssignment_5_2 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1580:2: rule__Ensemble__MembersAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__MembersAssignment_5_2_in_rule__Ensemble__Group_5__2__Impl3074);
            rule__Ensemble__MembersAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getEnsembleAccess().getMembersAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group_5__2__Impl"


    // $ANTLR start "rule__Ensemble__Group_5__3"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1590:1: rule__Ensemble__Group_5__3 : rule__Ensemble__Group_5__3__Impl rule__Ensemble__Group_5__4 ;
    public final void rule__Ensemble__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1594:1: ( rule__Ensemble__Group_5__3__Impl rule__Ensemble__Group_5__4 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1595:2: rule__Ensemble__Group_5__3__Impl rule__Ensemble__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group_5__3__Impl_in_rule__Ensemble__Group_5__33104);
            rule__Ensemble__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group_5__4_in_rule__Ensemble__Group_5__33107);
            rule__Ensemble__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group_5__3"


    // $ANTLR start "rule__Ensemble__Group_5__3__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1602:1: rule__Ensemble__Group_5__3__Impl : ( ( rule__Ensemble__Group_5_3__0 )* ) ;
    public final void rule__Ensemble__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1606:1: ( ( ( rule__Ensemble__Group_5_3__0 )* ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1607:1: ( ( rule__Ensemble__Group_5_3__0 )* )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1607:1: ( ( rule__Ensemble__Group_5_3__0 )* )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1608:1: ( rule__Ensemble__Group_5_3__0 )*
            {
             before(grammarAccess.getEnsembleAccess().getGroup_5_3()); 
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1609:1: ( rule__Ensemble__Group_5_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1609:2: rule__Ensemble__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group_5_3__0_in_rule__Ensemble__Group_5__3__Impl3134);
            	    rule__Ensemble__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getEnsembleAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group_5__3__Impl"


    // $ANTLR start "rule__Ensemble__Group_5__4"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1619:1: rule__Ensemble__Group_5__4 : rule__Ensemble__Group_5__4__Impl ;
    public final void rule__Ensemble__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1623:1: ( rule__Ensemble__Group_5__4__Impl )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1624:2: rule__Ensemble__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group_5__4__Impl_in_rule__Ensemble__Group_5__43165);
            rule__Ensemble__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group_5__4"


    // $ANTLR start "rule__Ensemble__Group_5__4__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1630:1: rule__Ensemble__Group_5__4__Impl : ( ')' ) ;
    public final void rule__Ensemble__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1634:1: ( ( ')' ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1635:1: ( ')' )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1635:1: ( ')' )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1636:1: ')'
            {
             before(grammarAccess.getEnsembleAccess().getRightParenthesisKeyword_5_4()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Ensemble__Group_5__4__Impl3193); 
             after(grammarAccess.getEnsembleAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group_5__4__Impl"


    // $ANTLR start "rule__Ensemble__Group_5_3__0"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1659:1: rule__Ensemble__Group_5_3__0 : rule__Ensemble__Group_5_3__0__Impl rule__Ensemble__Group_5_3__1 ;
    public final void rule__Ensemble__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1663:1: ( rule__Ensemble__Group_5_3__0__Impl rule__Ensemble__Group_5_3__1 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1664:2: rule__Ensemble__Group_5_3__0__Impl rule__Ensemble__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group_5_3__0__Impl_in_rule__Ensemble__Group_5_3__03234);
            rule__Ensemble__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group_5_3__1_in_rule__Ensemble__Group_5_3__03237);
            rule__Ensemble__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group_5_3__0"


    // $ANTLR start "rule__Ensemble__Group_5_3__0__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1671:1: rule__Ensemble__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Ensemble__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1675:1: ( ( ',' ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1676:1: ( ',' )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1676:1: ( ',' )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1677:1: ','
            {
             before(grammarAccess.getEnsembleAccess().getCommaKeyword_5_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Ensemble__Group_5_3__0__Impl3265); 
             after(grammarAccess.getEnsembleAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group_5_3__0__Impl"


    // $ANTLR start "rule__Ensemble__Group_5_3__1"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1690:1: rule__Ensemble__Group_5_3__1 : rule__Ensemble__Group_5_3__1__Impl ;
    public final void rule__Ensemble__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1694:1: ( rule__Ensemble__Group_5_3__1__Impl )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1695:2: rule__Ensemble__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__Group_5_3__1__Impl_in_rule__Ensemble__Group_5_3__13296);
            rule__Ensemble__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group_5_3__1"


    // $ANTLR start "rule__Ensemble__Group_5_3__1__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1701:1: rule__Ensemble__Group_5_3__1__Impl : ( ( rule__Ensemble__MembersAssignment_5_3_1 ) ) ;
    public final void rule__Ensemble__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1705:1: ( ( ( rule__Ensemble__MembersAssignment_5_3_1 ) ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1706:1: ( ( rule__Ensemble__MembersAssignment_5_3_1 ) )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1706:1: ( ( rule__Ensemble__MembersAssignment_5_3_1 ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1707:1: ( rule__Ensemble__MembersAssignment_5_3_1 )
            {
             before(grammarAccess.getEnsembleAccess().getMembersAssignment_5_3_1()); 
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1708:1: ( rule__Ensemble__MembersAssignment_5_3_1 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1708:2: rule__Ensemble__MembersAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ensemble__MembersAssignment_5_3_1_in_rule__Ensemble__Group_5_3__1__Impl3323);
            rule__Ensemble__MembersAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEnsembleAccess().getMembersAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__Group_5_3__1__Impl"


    // $ANTLR start "rule__Process__Group__0"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1722:1: rule__Process__Group__0 : rule__Process__Group__0__Impl rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1726:1: ( rule__Process__Group__0__Impl rule__Process__Group__1 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1727:2: rule__Process__Group__0__Impl rule__Process__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Process__Group__0__Impl_in_rule__Process__Group__03357);
            rule__Process__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Process__Group__1_in_rule__Process__Group__03360);
            rule__Process__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0"


    // $ANTLR start "rule__Process__Group__0__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1734:1: rule__Process__Group__0__Impl : ( () ) ;
    public final void rule__Process__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1738:1: ( ( () ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1739:1: ( () )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1739:1: ( () )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1740:1: ()
            {
             before(grammarAccess.getProcessAccess().getProcessAction_0()); 
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1741:1: ()
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1743:1: 
            {
            }

             after(grammarAccess.getProcessAccess().getProcessAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0__Impl"


    // $ANTLR start "rule__Process__Group__1"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1753:1: rule__Process__Group__1 : rule__Process__Group__1__Impl rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1757:1: ( rule__Process__Group__1__Impl rule__Process__Group__2 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1758:2: rule__Process__Group__1__Impl rule__Process__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Process__Group__1__Impl_in_rule__Process__Group__13418);
            rule__Process__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Process__Group__2_in_rule__Process__Group__13421);
            rule__Process__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__1"


    // $ANTLR start "rule__Process__Group__1__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1765:1: rule__Process__Group__1__Impl : ( 'Process' ) ;
    public final void rule__Process__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1769:1: ( ( 'Process' ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1770:1: ( 'Process' )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1770:1: ( 'Process' )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1771:1: 'Process'
            {
             before(grammarAccess.getProcessAccess().getProcessKeyword_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Process__Group__1__Impl3449); 
             after(grammarAccess.getProcessAccess().getProcessKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__1__Impl"


    // $ANTLR start "rule__Process__Group__2"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1784:1: rule__Process__Group__2 : rule__Process__Group__2__Impl ;
    public final void rule__Process__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1788:1: ( rule__Process__Group__2__Impl )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1789:2: rule__Process__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Process__Group__2__Impl_in_rule__Process__Group__23480);
            rule__Process__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__2"


    // $ANTLR start "rule__Process__Group__2__Impl"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1795:1: rule__Process__Group__2__Impl : ( ( rule__Process__NameAssignment_2 ) ) ;
    public final void rule__Process__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1799:1: ( ( ( rule__Process__NameAssignment_2 ) ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1800:1: ( ( rule__Process__NameAssignment_2 ) )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1800:1: ( ( rule__Process__NameAssignment_2 ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1801:1: ( rule__Process__NameAssignment_2 )
            {
             before(grammarAccess.getProcessAccess().getNameAssignment_2()); 
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1802:1: ( rule__Process__NameAssignment_2 )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1802:2: rule__Process__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Process__NameAssignment_2_in_rule__Process__Group__2__Impl3507);
            rule__Process__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__2__Impl"


    // $ANTLR start "rule__System__NameAssignment_2"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1819:1: rule__System__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__System__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1823:1: ( ( ruleEString ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1824:1: ( ruleEString )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1824:1: ( ruleEString )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1825:1: ruleEString
            {
             before(grammarAccess.getSystemAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__System__NameAssignment_23548);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__NameAssignment_2"


    // $ANTLR start "rule__System__ComponentsAssignment_4_2"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1834:1: rule__System__ComponentsAssignment_4_2 : ( ruleComponent ) ;
    public final void rule__System__ComponentsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1838:1: ( ( ruleComponent ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1839:1: ( ruleComponent )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1839:1: ( ruleComponent )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1840:1: ruleComponent
            {
             before(grammarAccess.getSystemAccess().getComponentsComponentParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleComponent_in_rule__System__ComponentsAssignment_4_23579);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getComponentsComponentParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__ComponentsAssignment_4_2"


    // $ANTLR start "rule__System__ComponentsAssignment_4_3_1"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1849:1: rule__System__ComponentsAssignment_4_3_1 : ( ruleComponent ) ;
    public final void rule__System__ComponentsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1853:1: ( ( ruleComponent ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1854:1: ( ruleComponent )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1854:1: ( ruleComponent )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1855:1: ruleComponent
            {
             before(grammarAccess.getSystemAccess().getComponentsComponentParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleComponent_in_rule__System__ComponentsAssignment_4_3_13610);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getComponentsComponentParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__ComponentsAssignment_4_3_1"


    // $ANTLR start "rule__System__EnsemblesAssignment_5_2"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1864:1: rule__System__EnsemblesAssignment_5_2 : ( ruleEnsemble ) ;
    public final void rule__System__EnsemblesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1868:1: ( ( ruleEnsemble ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1869:1: ( ruleEnsemble )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1869:1: ( ruleEnsemble )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1870:1: ruleEnsemble
            {
             before(grammarAccess.getSystemAccess().getEnsemblesEnsembleParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnsemble_in_rule__System__EnsemblesAssignment_5_23641);
            ruleEnsemble();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getEnsemblesEnsembleParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__EnsemblesAssignment_5_2"


    // $ANTLR start "rule__System__EnsemblesAssignment_5_3_1"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1879:1: rule__System__EnsemblesAssignment_5_3_1 : ( ruleEnsemble ) ;
    public final void rule__System__EnsemblesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1883:1: ( ( ruleEnsemble ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1884:1: ( ruleEnsemble )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1884:1: ( ruleEnsemble )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1885:1: ruleEnsemble
            {
             before(grammarAccess.getSystemAccess().getEnsemblesEnsembleParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnsemble_in_rule__System__EnsemblesAssignment_5_3_13672);
            ruleEnsemble();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getEnsemblesEnsembleParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__EnsemblesAssignment_5_3_1"


    // $ANTLR start "rule__Component__NameAssignment_1"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1894:1: rule__Component__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1898:1: ( ( ruleEString ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1899:1: ( ruleEString )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1899:1: ( ruleEString )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1900:1: ruleEString
            {
             before(grammarAccess.getComponentAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Component__NameAssignment_13703);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__NameAssignment_1"


    // $ANTLR start "rule__Component__ProcessAssignment_4"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1909:1: rule__Component__ProcessAssignment_4 : ( ruleProcess ) ;
    public final void rule__Component__ProcessAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1913:1: ( ( ruleProcess ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1914:1: ( ruleProcess )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1914:1: ( ruleProcess )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1915:1: ruleProcess
            {
             before(grammarAccess.getComponentAccess().getProcessProcessParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleProcess_in_rule__Component__ProcessAssignment_43734);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getProcessProcessParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ProcessAssignment_4"


    // $ANTLR start "rule__Component__EnsembleMemberAssignment_5_1"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1924:1: rule__Component__EnsembleMemberAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__Component__EnsembleMemberAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1928:1: ( ( ( ruleEString ) ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1929:1: ( ( ruleEString ) )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1929:1: ( ( ruleEString ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1930:1: ( ruleEString )
            {
             before(grammarAccess.getComponentAccess().getEnsembleMemberEnsembleCrossReference_5_1_0()); 
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1931:1: ( ruleEString )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1932:1: ruleEString
            {
             before(grammarAccess.getComponentAccess().getEnsembleMemberEnsembleEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Component__EnsembleMemberAssignment_5_13769);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getEnsembleMemberEnsembleEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getComponentAccess().getEnsembleMemberEnsembleCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__EnsembleMemberAssignment_5_1"


    // $ANTLR start "rule__Component__EnsembleCordinatorAssignment_6_1"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1943:1: rule__Component__EnsembleCordinatorAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Component__EnsembleCordinatorAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1947:1: ( ( ( ruleEString ) ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1948:1: ( ( ruleEString ) )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1948:1: ( ( ruleEString ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1949:1: ( ruleEString )
            {
             before(grammarAccess.getComponentAccess().getEnsembleCordinatorEnsembleCrossReference_6_1_0()); 
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1950:1: ( ruleEString )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1951:1: ruleEString
            {
             before(grammarAccess.getComponentAccess().getEnsembleCordinatorEnsembleEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Component__EnsembleCordinatorAssignment_6_13808);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getEnsembleCordinatorEnsembleEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getComponentAccess().getEnsembleCordinatorEnsembleCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__EnsembleCordinatorAssignment_6_1"


    // $ANTLR start "rule__Ensemble__NameAssignment_1"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1962:1: rule__Ensemble__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Ensemble__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1966:1: ( ( ruleEString ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1967:1: ( ruleEString )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1967:1: ( ruleEString )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1968:1: ruleEString
            {
             before(grammarAccess.getEnsembleAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Ensemble__NameAssignment_13843);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnsembleAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__NameAssignment_1"


    // $ANTLR start "rule__Ensemble__CoordinatorAssignment_4"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1977:1: rule__Ensemble__CoordinatorAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Ensemble__CoordinatorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1981:1: ( ( ( ruleEString ) ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1982:1: ( ( ruleEString ) )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1982:1: ( ( ruleEString ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1983:1: ( ruleEString )
            {
             before(grammarAccess.getEnsembleAccess().getCoordinatorComponentCrossReference_4_0()); 
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1984:1: ( ruleEString )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1985:1: ruleEString
            {
             before(grammarAccess.getEnsembleAccess().getCoordinatorComponentEStringParserRuleCall_4_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Ensemble__CoordinatorAssignment_43878);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnsembleAccess().getCoordinatorComponentEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getEnsembleAccess().getCoordinatorComponentCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__CoordinatorAssignment_4"


    // $ANTLR start "rule__Ensemble__MembersAssignment_5_2"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:1996:1: rule__Ensemble__MembersAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__Ensemble__MembersAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:2000:1: ( ( ( ruleEString ) ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:2001:1: ( ( ruleEString ) )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:2001:1: ( ( ruleEString ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:2002:1: ( ruleEString )
            {
             before(grammarAccess.getEnsembleAccess().getMembersComponentCrossReference_5_2_0()); 
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:2003:1: ( ruleEString )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:2004:1: ruleEString
            {
             before(grammarAccess.getEnsembleAccess().getMembersComponentEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Ensemble__MembersAssignment_5_23917);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnsembleAccess().getMembersComponentEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getEnsembleAccess().getMembersComponentCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__MembersAssignment_5_2"


    // $ANTLR start "rule__Ensemble__MembersAssignment_5_3_1"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:2015:1: rule__Ensemble__MembersAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Ensemble__MembersAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:2019:1: ( ( ( ruleEString ) ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:2020:1: ( ( ruleEString ) )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:2020:1: ( ( ruleEString ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:2021:1: ( ruleEString )
            {
             before(grammarAccess.getEnsembleAccess().getMembersComponentCrossReference_5_3_1_0()); 
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:2022:1: ( ruleEString )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:2023:1: ruleEString
            {
             before(grammarAccess.getEnsembleAccess().getMembersComponentEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Ensemble__MembersAssignment_5_3_13956);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnsembleAccess().getMembersComponentEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getEnsembleAccess().getMembersComponentCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ensemble__MembersAssignment_5_3_1"


    // $ANTLR start "rule__Process__NameAssignment_2"
    // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:2034:1: rule__Process__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Process__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:2038:1: ( ( ruleEString ) )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:2039:1: ( ruleEString )
            {
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:2039:1: ( ruleEString )
            // ../cz.cuni.mff.d3s.dsl.deeco.ui/src-gen/cz/cuni/mff/d3s/dsl/deeco/ui/contentassist/antlr/internal/InternalDEECoDsl.g:2040:1: ruleEString
            {
             before(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Process__NameAssignment_23991);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__NameAssignment_2"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSystem68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__System__Group__0_in_ruleSystem94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComponent188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Component__Group__0_in_ruleComponent214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnsemble_in_entryRuleEnsemble241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnsemble248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ensemble__Group__0_in_ruleEnsemble274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProcess308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__Group__0_in_ruleProcess334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__System__Group__0__Impl_in_rule__System__Group__0417 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__System__Group__1_in_rule__System__Group__0420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__System__Group__1__Impl_in_rule__System__Group__1478 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__System__Group__2_in_rule__System__Group__1481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__System__Group__1__Impl509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__System__Group__2__Impl_in_rule__System__Group__2540 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__System__Group__3_in_rule__System__Group__2543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__System__NameAssignment_2_in_rule__System__Group__2__Impl570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__System__Group__3__Impl_in_rule__System__Group__3600 = new BitSet(new long[]{0x0000000000016000L});
        public static final BitSet FOLLOW_rule__System__Group__4_in_rule__System__Group__3603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__System__Group__3__Impl631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__System__Group__4__Impl_in_rule__System__Group__4662 = new BitSet(new long[]{0x0000000000016000L});
        public static final BitSet FOLLOW_rule__System__Group__5_in_rule__System__Group__4665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__System__Group_4__0_in_rule__System__Group__4__Impl692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__System__Group__5__Impl_in_rule__System__Group__5723 = new BitSet(new long[]{0x0000000000016000L});
        public static final BitSet FOLLOW_rule__System__Group__6_in_rule__System__Group__5726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__System__Group_5__0_in_rule__System__Group__5__Impl753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__System__Group__6__Impl_in_rule__System__Group__6784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__System__Group__6__Impl812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__System__Group_4__0__Impl_in_rule__System__Group_4__0857 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__System__Group_4__1_in_rule__System__Group_4__0860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__System__Group_4__0__Impl888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__System__Group_4__1__Impl_in_rule__System__Group_4__1919 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__System__Group_4__2_in_rule__System__Group_4__1922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__System__Group_4__1__Impl950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__System__Group_4__2__Impl_in_rule__System__Group_4__2981 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__System__Group_4__3_in_rule__System__Group_4__2984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__System__ComponentsAssignment_4_2_in_rule__System__Group_4__2__Impl1011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__System__Group_4__3__Impl_in_rule__System__Group_4__31041 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__System__Group_4__4_in_rule__System__Group_4__31044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__System__Group_4_3__0_in_rule__System__Group_4__3__Impl1071 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__System__Group_4__4__Impl_in_rule__System__Group_4__41102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__System__Group_4__4__Impl1130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__System__Group_4_3__0__Impl_in_rule__System__Group_4_3__01171 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__System__Group_4_3__1_in_rule__System__Group_4_3__01174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__System__Group_4_3__0__Impl1202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__System__Group_4_3__1__Impl_in_rule__System__Group_4_3__11233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__System__ComponentsAssignment_4_3_1_in_rule__System__Group_4_3__1__Impl1260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__System__Group_5__0__Impl_in_rule__System__Group_5__01294 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__System__Group_5__1_in_rule__System__Group_5__01297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__System__Group_5__0__Impl1325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__System__Group_5__1__Impl_in_rule__System__Group_5__11356 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__System__Group_5__2_in_rule__System__Group_5__11359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__System__Group_5__1__Impl1387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__System__Group_5__2__Impl_in_rule__System__Group_5__21418 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__System__Group_5__3_in_rule__System__Group_5__21421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__System__EnsemblesAssignment_5_2_in_rule__System__Group_5__2__Impl1448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__System__Group_5__3__Impl_in_rule__System__Group_5__31478 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__System__Group_5__4_in_rule__System__Group_5__31481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__System__Group_5_3__0_in_rule__System__Group_5__3__Impl1508 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__System__Group_5__4__Impl_in_rule__System__Group_5__41539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__System__Group_5__4__Impl1567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__System__Group_5_3__0__Impl_in_rule__System__Group_5_3__01608 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__System__Group_5_3__1_in_rule__System__Group_5_3__01611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__System__Group_5_3__0__Impl1639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__System__Group_5_3__1__Impl_in_rule__System__Group_5_3__11670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__System__EnsemblesAssignment_5_3_1_in_rule__System__Group_5_3__1__Impl1697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Component__Group__0__Impl_in_rule__Component__Group__01731 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Component__Group__1_in_rule__Component__Group__01734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Component__Group__0__Impl1762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Component__Group__1__Impl_in_rule__Component__Group__11793 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Component__Group__2_in_rule__Component__Group__11796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Component__NameAssignment_1_in_rule__Component__Group__1__Impl1823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Component__Group__2__Impl_in_rule__Component__Group__21853 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Component__Group__3_in_rule__Component__Group__21856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Component__Group__2__Impl1884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Component__Group__3__Impl_in_rule__Component__Group__31915 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Component__Group__4_in_rule__Component__Group__31918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Component__Group__3__Impl1946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Component__Group__4__Impl_in_rule__Component__Group__41977 = new BitSet(new long[]{0x0000000000182000L});
        public static final BitSet FOLLOW_rule__Component__Group__5_in_rule__Component__Group__41980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Component__ProcessAssignment_4_in_rule__Component__Group__4__Impl2007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Component__Group__5__Impl_in_rule__Component__Group__52037 = new BitSet(new long[]{0x0000000000182000L});
        public static final BitSet FOLLOW_rule__Component__Group__6_in_rule__Component__Group__52040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Component__Group_5__0_in_rule__Component__Group__5__Impl2067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Component__Group__6__Impl_in_rule__Component__Group__62098 = new BitSet(new long[]{0x0000000000182000L});
        public static final BitSet FOLLOW_rule__Component__Group__7_in_rule__Component__Group__62101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Component__Group_6__0_in_rule__Component__Group__6__Impl2128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Component__Group__7__Impl_in_rule__Component__Group__72159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Component__Group__7__Impl2187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Component__Group_5__0__Impl_in_rule__Component__Group_5__02234 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Component__Group_5__1_in_rule__Component__Group_5__02237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Component__Group_5__0__Impl2265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Component__Group_5__1__Impl_in_rule__Component__Group_5__12296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Component__EnsembleMemberAssignment_5_1_in_rule__Component__Group_5__1__Impl2323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Component__Group_6__0__Impl_in_rule__Component__Group_6__02357 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Component__Group_6__1_in_rule__Component__Group_6__02360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Component__Group_6__0__Impl2388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Component__Group_6__1__Impl_in_rule__Component__Group_6__12419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Component__EnsembleCordinatorAssignment_6_1_in_rule__Component__Group_6__1__Impl2446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ensemble__Group__0__Impl_in_rule__Ensemble__Group__02480 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Ensemble__Group__1_in_rule__Ensemble__Group__02483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Ensemble__Group__0__Impl2511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ensemble__Group__1__Impl_in_rule__Ensemble__Group__12542 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Ensemble__Group__2_in_rule__Ensemble__Group__12545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ensemble__NameAssignment_1_in_rule__Ensemble__Group__1__Impl2572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ensemble__Group__2__Impl_in_rule__Ensemble__Group__22602 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Ensemble__Group__3_in_rule__Ensemble__Group__22605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Ensemble__Group__2__Impl2633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ensemble__Group__3__Impl_in_rule__Ensemble__Group__32664 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Ensemble__Group__4_in_rule__Ensemble__Group__32667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Ensemble__Group__3__Impl2695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ensemble__Group__4__Impl_in_rule__Ensemble__Group__42726 = new BitSet(new long[]{0x0000000000802000L});
        public static final BitSet FOLLOW_rule__Ensemble__Group__5_in_rule__Ensemble__Group__42729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ensemble__CoordinatorAssignment_4_in_rule__Ensemble__Group__4__Impl2756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ensemble__Group__5__Impl_in_rule__Ensemble__Group__52786 = new BitSet(new long[]{0x0000000000802000L});
        public static final BitSet FOLLOW_rule__Ensemble__Group__6_in_rule__Ensemble__Group__52789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ensemble__Group_5__0_in_rule__Ensemble__Group__5__Impl2816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ensemble__Group__6__Impl_in_rule__Ensemble__Group__62847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Ensemble__Group__6__Impl2875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ensemble__Group_5__0__Impl_in_rule__Ensemble__Group_5__02920 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Ensemble__Group_5__1_in_rule__Ensemble__Group_5__02923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Ensemble__Group_5__0__Impl2951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ensemble__Group_5__1__Impl_in_rule__Ensemble__Group_5__12982 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Ensemble__Group_5__2_in_rule__Ensemble__Group_5__12985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Ensemble__Group_5__1__Impl3013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ensemble__Group_5__2__Impl_in_rule__Ensemble__Group_5__23044 = new BitSet(new long[]{0x0000000002008000L});
        public static final BitSet FOLLOW_rule__Ensemble__Group_5__3_in_rule__Ensemble__Group_5__23047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ensemble__MembersAssignment_5_2_in_rule__Ensemble__Group_5__2__Impl3074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ensemble__Group_5__3__Impl_in_rule__Ensemble__Group_5__33104 = new BitSet(new long[]{0x0000000002008000L});
        public static final BitSet FOLLOW_rule__Ensemble__Group_5__4_in_rule__Ensemble__Group_5__33107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ensemble__Group_5_3__0_in_rule__Ensemble__Group_5__3__Impl3134 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__Ensemble__Group_5__4__Impl_in_rule__Ensemble__Group_5__43165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Ensemble__Group_5__4__Impl3193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ensemble__Group_5_3__0__Impl_in_rule__Ensemble__Group_5_3__03234 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Ensemble__Group_5_3__1_in_rule__Ensemble__Group_5_3__03237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Ensemble__Group_5_3__0__Impl3265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ensemble__Group_5_3__1__Impl_in_rule__Ensemble__Group_5_3__13296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ensemble__MembersAssignment_5_3_1_in_rule__Ensemble__Group_5_3__1__Impl3323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__Group__0__Impl_in_rule__Process__Group__03357 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Process__Group__1_in_rule__Process__Group__03360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__Group__1__Impl_in_rule__Process__Group__13418 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Process__Group__2_in_rule__Process__Group__13421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Process__Group__1__Impl3449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__Group__2__Impl_in_rule__Process__Group__23480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__NameAssignment_2_in_rule__Process__Group__2__Impl3507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__System__NameAssignment_23548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComponent_in_rule__System__ComponentsAssignment_4_23579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComponent_in_rule__System__ComponentsAssignment_4_3_13610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnsemble_in_rule__System__EnsemblesAssignment_5_23641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnsemble_in_rule__System__EnsemblesAssignment_5_3_13672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Component__NameAssignment_13703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcess_in_rule__Component__ProcessAssignment_43734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Component__EnsembleMemberAssignment_5_13769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Component__EnsembleCordinatorAssignment_6_13808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Ensemble__NameAssignment_13843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Ensemble__CoordinatorAssignment_43878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Ensemble__MembersAssignment_5_23917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Ensemble__MembersAssignment_5_3_13956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Process__NameAssignment_23991 = new BitSet(new long[]{0x0000000000000002L});
    }


}