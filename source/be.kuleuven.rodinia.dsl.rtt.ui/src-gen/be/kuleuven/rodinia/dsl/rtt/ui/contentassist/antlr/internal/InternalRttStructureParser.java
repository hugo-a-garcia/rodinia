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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Package'", "'{'", "'}'", "'taskContexts'", "','", "'TaskContext'", "'namespace'", "'type'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

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


    // $ANTLR start "rule__EString__Alternatives"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:144:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:148:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:149:1: ( RULE_STRING )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:149:1: ( RULE_STRING )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:150:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives250); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:155:6: ( RULE_ID )
                    {
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:155:6: ( RULE_ID )
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:156:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives267); 
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


    // $ANTLR start "rule__Package__Group__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:168:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:172:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:173:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__0297);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__1_in_rule__Package__Group__0300);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:180:1: rule__Package__Group__0__Impl : ( () ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:184:1: ( ( () ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:185:1: ( () )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:185:1: ( () )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:186:1: ()
            {
             before(grammarAccess.getPackageAccess().getPackageAction_0()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:187:1: ()
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:189:1: 
            {
            }

             after(grammarAccess.getPackageAccess().getPackageAction_0()); 

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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:199:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:203:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:204:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__1358);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__2_in_rule__Package__Group__1361);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:211:1: rule__Package__Group__1__Impl : ( 'Package' ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:215:1: ( ( 'Package' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:216:1: ( 'Package' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:216:1: ( 'Package' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:217:1: 'Package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_1()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Package__Group__1__Impl389); 
             after(grammarAccess.getPackageAccess().getPackageKeyword_1()); 

            }


            }

        }
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:230:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:234:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:235:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__2420);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__3_in_rule__Package__Group__2423);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:242:1: rule__Package__Group__2__Impl : ( ( rule__Package__NameAssignment_2 ) ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:246:1: ( ( ( rule__Package__NameAssignment_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:247:1: ( ( rule__Package__NameAssignment_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:247:1: ( ( rule__Package__NameAssignment_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:248:1: ( rule__Package__NameAssignment_2 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:249:1: ( rule__Package__NameAssignment_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:249:2: rule__Package__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__NameAssignment_2_in_rule__Package__Group__2__Impl450);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:259:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:263:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:264:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__3480);
            rule__Package__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__4_in_rule__Package__Group__3483);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:271:1: rule__Package__Group__3__Impl : ( '{' ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:275:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:276:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:276:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:277:1: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Package__Group__3__Impl511); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:290:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:294:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:295:2: rule__Package__Group__4__Impl rule__Package__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__4542);
            rule__Package__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__5_in_rule__Package__Group__4545);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:302:1: rule__Package__Group__4__Impl : ( ( rule__Package__Group_4__0 )? ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:306:1: ( ( ( rule__Package__Group_4__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:307:1: ( ( rule__Package__Group_4__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:307:1: ( ( rule__Package__Group_4__0 )? )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:308:1: ( rule__Package__Group_4__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_4()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:309:1: ( rule__Package__Group_4__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:309:2: rule__Package__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__0_in_rule__Package__Group__4__Impl572);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:319:1: rule__Package__Group__5 : rule__Package__Group__5__Impl ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:323:1: ( rule__Package__Group__5__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:324:2: rule__Package__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__5__Impl_in_rule__Package__Group__5603);
            rule__Package__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:330:1: rule__Package__Group__5__Impl : ( '}' ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:334:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:335:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:335:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:336:1: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Package__Group__5__Impl631); 
             after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Package__Group_4__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:361:1: rule__Package__Group_4__0 : rule__Package__Group_4__0__Impl rule__Package__Group_4__1 ;
    public final void rule__Package__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:365:1: ( rule__Package__Group_4__0__Impl rule__Package__Group_4__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:366:2: rule__Package__Group_4__0__Impl rule__Package__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__0__Impl_in_rule__Package__Group_4__0674);
            rule__Package__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__1_in_rule__Package__Group_4__0677);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:373:1: rule__Package__Group_4__0__Impl : ( 'taskContexts' ) ;
    public final void rule__Package__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:377:1: ( ( 'taskContexts' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:378:1: ( 'taskContexts' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:378:1: ( 'taskContexts' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:379:1: 'taskContexts'
            {
             before(grammarAccess.getPackageAccess().getTaskContextsKeyword_4_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Package__Group_4__0__Impl705); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:392:1: rule__Package__Group_4__1 : rule__Package__Group_4__1__Impl rule__Package__Group_4__2 ;
    public final void rule__Package__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:396:1: ( rule__Package__Group_4__1__Impl rule__Package__Group_4__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:397:2: rule__Package__Group_4__1__Impl rule__Package__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__1__Impl_in_rule__Package__Group_4__1736);
            rule__Package__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__2_in_rule__Package__Group_4__1739);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:404:1: rule__Package__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Package__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:408:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:409:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:409:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:410:1: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Package__Group_4__1__Impl767); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:423:1: rule__Package__Group_4__2 : rule__Package__Group_4__2__Impl rule__Package__Group_4__3 ;
    public final void rule__Package__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:427:1: ( rule__Package__Group_4__2__Impl rule__Package__Group_4__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:428:2: rule__Package__Group_4__2__Impl rule__Package__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__2__Impl_in_rule__Package__Group_4__2798);
            rule__Package__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__3_in_rule__Package__Group_4__2801);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:435:1: rule__Package__Group_4__2__Impl : ( ( rule__Package__TaskContextsAssignment_4_2 ) ) ;
    public final void rule__Package__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:439:1: ( ( ( rule__Package__TaskContextsAssignment_4_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:440:1: ( ( rule__Package__TaskContextsAssignment_4_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:440:1: ( ( rule__Package__TaskContextsAssignment_4_2 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:441:1: ( rule__Package__TaskContextsAssignment_4_2 )
            {
             before(grammarAccess.getPackageAccess().getTaskContextsAssignment_4_2()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:442:1: ( rule__Package__TaskContextsAssignment_4_2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:442:2: rule__Package__TaskContextsAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__TaskContextsAssignment_4_2_in_rule__Package__Group_4__2__Impl828);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:452:1: rule__Package__Group_4__3 : rule__Package__Group_4__3__Impl rule__Package__Group_4__4 ;
    public final void rule__Package__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:456:1: ( rule__Package__Group_4__3__Impl rule__Package__Group_4__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:457:2: rule__Package__Group_4__3__Impl rule__Package__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__3__Impl_in_rule__Package__Group_4__3858);
            rule__Package__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__4_in_rule__Package__Group_4__3861);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:464:1: rule__Package__Group_4__3__Impl : ( ( rule__Package__Group_4_3__0 )* ) ;
    public final void rule__Package__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:468:1: ( ( ( rule__Package__Group_4_3__0 )* ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:469:1: ( ( rule__Package__Group_4_3__0 )* )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:469:1: ( ( rule__Package__Group_4_3__0 )* )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:470:1: ( rule__Package__Group_4_3__0 )*
            {
             before(grammarAccess.getPackageAccess().getGroup_4_3()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:471:1: ( rule__Package__Group_4_3__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:471:2: rule__Package__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4_3__0_in_rule__Package__Group_4__3__Impl888);
            	    rule__Package__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:481:1: rule__Package__Group_4__4 : rule__Package__Group_4__4__Impl ;
    public final void rule__Package__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:485:1: ( rule__Package__Group_4__4__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:486:2: rule__Package__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__4__Impl_in_rule__Package__Group_4__4919);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:492:1: rule__Package__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Package__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:496:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:497:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:497:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:498:1: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Package__Group_4__4__Impl947); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:521:1: rule__Package__Group_4_3__0 : rule__Package__Group_4_3__0__Impl rule__Package__Group_4_3__1 ;
    public final void rule__Package__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:525:1: ( rule__Package__Group_4_3__0__Impl rule__Package__Group_4_3__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:526:2: rule__Package__Group_4_3__0__Impl rule__Package__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4_3__0__Impl_in_rule__Package__Group_4_3__0988);
            rule__Package__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4_3__1_in_rule__Package__Group_4_3__0991);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:533:1: rule__Package__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Package__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:537:1: ( ( ',' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:538:1: ( ',' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:538:1: ( ',' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:539:1: ','
            {
             before(grammarAccess.getPackageAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Package__Group_4_3__0__Impl1019); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:552:1: rule__Package__Group_4_3__1 : rule__Package__Group_4_3__1__Impl ;
    public final void rule__Package__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:556:1: ( rule__Package__Group_4_3__1__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:557:2: rule__Package__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4_3__1__Impl_in_rule__Package__Group_4_3__11050);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:563:1: rule__Package__Group_4_3__1__Impl : ( ( rule__Package__TaskContextsAssignment_4_3_1 ) ) ;
    public final void rule__Package__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:567:1: ( ( ( rule__Package__TaskContextsAssignment_4_3_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:568:1: ( ( rule__Package__TaskContextsAssignment_4_3_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:568:1: ( ( rule__Package__TaskContextsAssignment_4_3_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:569:1: ( rule__Package__TaskContextsAssignment_4_3_1 )
            {
             before(grammarAccess.getPackageAccess().getTaskContextsAssignment_4_3_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:570:1: ( rule__Package__TaskContextsAssignment_4_3_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:570:2: rule__Package__TaskContextsAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__TaskContextsAssignment_4_3_1_in_rule__Package__Group_4_3__1__Impl1077);
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


    // $ANTLR start "rule__TaskContext__Group__0"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:584:1: rule__TaskContext__Group__0 : rule__TaskContext__Group__0__Impl rule__TaskContext__Group__1 ;
    public final void rule__TaskContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:588:1: ( rule__TaskContext__Group__0__Impl rule__TaskContext__Group__1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:589:2: rule__TaskContext__Group__0__Impl rule__TaskContext__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__0__Impl_in_rule__TaskContext__Group__01111);
            rule__TaskContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__1_in_rule__TaskContext__Group__01114);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:596:1: rule__TaskContext__Group__0__Impl : ( 'TaskContext' ) ;
    public final void rule__TaskContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:600:1: ( ( 'TaskContext' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:601:1: ( 'TaskContext' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:601:1: ( 'TaskContext' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:602:1: 'TaskContext'
            {
             before(grammarAccess.getTaskContextAccess().getTaskContextKeyword_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__TaskContext__Group__0__Impl1142); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:615:1: rule__TaskContext__Group__1 : rule__TaskContext__Group__1__Impl rule__TaskContext__Group__2 ;
    public final void rule__TaskContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:619:1: ( rule__TaskContext__Group__1__Impl rule__TaskContext__Group__2 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:620:2: rule__TaskContext__Group__1__Impl rule__TaskContext__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__1__Impl_in_rule__TaskContext__Group__11173);
            rule__TaskContext__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__2_in_rule__TaskContext__Group__11176);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:627:1: rule__TaskContext__Group__1__Impl : ( ( rule__TaskContext__NameAssignment_1 ) ) ;
    public final void rule__TaskContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:631:1: ( ( ( rule__TaskContext__NameAssignment_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:632:1: ( ( rule__TaskContext__NameAssignment_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:632:1: ( ( rule__TaskContext__NameAssignment_1 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:633:1: ( rule__TaskContext__NameAssignment_1 )
            {
             before(grammarAccess.getTaskContextAccess().getNameAssignment_1()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:634:1: ( rule__TaskContext__NameAssignment_1 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:634:2: rule__TaskContext__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__NameAssignment_1_in_rule__TaskContext__Group__1__Impl1203);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:644:1: rule__TaskContext__Group__2 : rule__TaskContext__Group__2__Impl rule__TaskContext__Group__3 ;
    public final void rule__TaskContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:648:1: ( rule__TaskContext__Group__2__Impl rule__TaskContext__Group__3 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:649:2: rule__TaskContext__Group__2__Impl rule__TaskContext__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__2__Impl_in_rule__TaskContext__Group__21233);
            rule__TaskContext__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__3_in_rule__TaskContext__Group__21236);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:656:1: rule__TaskContext__Group__2__Impl : ( '{' ) ;
    public final void rule__TaskContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:660:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:661:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:661:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:662:1: '{'
            {
             before(grammarAccess.getTaskContextAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__TaskContext__Group__2__Impl1264); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:675:1: rule__TaskContext__Group__3 : rule__TaskContext__Group__3__Impl rule__TaskContext__Group__4 ;
    public final void rule__TaskContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:679:1: ( rule__TaskContext__Group__3__Impl rule__TaskContext__Group__4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:680:2: rule__TaskContext__Group__3__Impl rule__TaskContext__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__3__Impl_in_rule__TaskContext__Group__31295);
            rule__TaskContext__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__4_in_rule__TaskContext__Group__31298);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:687:1: rule__TaskContext__Group__3__Impl : ( 'namespace' ) ;
    public final void rule__TaskContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:691:1: ( ( 'namespace' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:692:1: ( 'namespace' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:692:1: ( 'namespace' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:693:1: 'namespace'
            {
             before(grammarAccess.getTaskContextAccess().getNamespaceKeyword_3()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__TaskContext__Group__3__Impl1326); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:706:1: rule__TaskContext__Group__4 : rule__TaskContext__Group__4__Impl rule__TaskContext__Group__5 ;
    public final void rule__TaskContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:710:1: ( rule__TaskContext__Group__4__Impl rule__TaskContext__Group__5 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:711:2: rule__TaskContext__Group__4__Impl rule__TaskContext__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__4__Impl_in_rule__TaskContext__Group__41357);
            rule__TaskContext__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__5_in_rule__TaskContext__Group__41360);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:718:1: rule__TaskContext__Group__4__Impl : ( ( rule__TaskContext__NamespaceAssignment_4 ) ) ;
    public final void rule__TaskContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:722:1: ( ( ( rule__TaskContext__NamespaceAssignment_4 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:723:1: ( ( rule__TaskContext__NamespaceAssignment_4 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:723:1: ( ( rule__TaskContext__NamespaceAssignment_4 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:724:1: ( rule__TaskContext__NamespaceAssignment_4 )
            {
             before(grammarAccess.getTaskContextAccess().getNamespaceAssignment_4()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:725:1: ( rule__TaskContext__NamespaceAssignment_4 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:725:2: rule__TaskContext__NamespaceAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__NamespaceAssignment_4_in_rule__TaskContext__Group__4__Impl1387);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:735:1: rule__TaskContext__Group__5 : rule__TaskContext__Group__5__Impl rule__TaskContext__Group__6 ;
    public final void rule__TaskContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:739:1: ( rule__TaskContext__Group__5__Impl rule__TaskContext__Group__6 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:740:2: rule__TaskContext__Group__5__Impl rule__TaskContext__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__5__Impl_in_rule__TaskContext__Group__51417);
            rule__TaskContext__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__6_in_rule__TaskContext__Group__51420);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:747:1: rule__TaskContext__Group__5__Impl : ( 'type' ) ;
    public final void rule__TaskContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:751:1: ( ( 'type' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:752:1: ( 'type' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:752:1: ( 'type' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:753:1: 'type'
            {
             before(grammarAccess.getTaskContextAccess().getTypeKeyword_5()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__TaskContext__Group__5__Impl1448); 
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:766:1: rule__TaskContext__Group__6 : rule__TaskContext__Group__6__Impl rule__TaskContext__Group__7 ;
    public final void rule__TaskContext__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:770:1: ( rule__TaskContext__Group__6__Impl rule__TaskContext__Group__7 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:771:2: rule__TaskContext__Group__6__Impl rule__TaskContext__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__6__Impl_in_rule__TaskContext__Group__61479);
            rule__TaskContext__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__7_in_rule__TaskContext__Group__61482);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:778:1: rule__TaskContext__Group__6__Impl : ( ( rule__TaskContext__TypeAssignment_6 ) ) ;
    public final void rule__TaskContext__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:782:1: ( ( ( rule__TaskContext__TypeAssignment_6 ) ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:783:1: ( ( rule__TaskContext__TypeAssignment_6 ) )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:783:1: ( ( rule__TaskContext__TypeAssignment_6 ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:784:1: ( rule__TaskContext__TypeAssignment_6 )
            {
             before(grammarAccess.getTaskContextAccess().getTypeAssignment_6()); 
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:785:1: ( rule__TaskContext__TypeAssignment_6 )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:785:2: rule__TaskContext__TypeAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__TypeAssignment_6_in_rule__TaskContext__Group__6__Impl1509);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:795:1: rule__TaskContext__Group__7 : rule__TaskContext__Group__7__Impl ;
    public final void rule__TaskContext__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:799:1: ( rule__TaskContext__Group__7__Impl )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:800:2: rule__TaskContext__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TaskContext__Group__7__Impl_in_rule__TaskContext__Group__71539);
            rule__TaskContext__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:806:1: rule__TaskContext__Group__7__Impl : ( '}' ) ;
    public final void rule__TaskContext__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:810:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:811:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:811:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:812:1: '}'
            {
             before(grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__TaskContext__Group__7__Impl1567); 
             after(grammarAccess.getTaskContextAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__Package__NameAssignment_2"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:842:1: rule__Package__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Package__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:846:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:847:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:847:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:848:1: ruleEString
            {
             before(grammarAccess.getPackageAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Package__NameAssignment_21619);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:857:1: rule__Package__TaskContextsAssignment_4_2 : ( ruleTaskContext ) ;
    public final void rule__Package__TaskContextsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:861:1: ( ( ruleTaskContext ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:862:1: ( ruleTaskContext )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:862:1: ( ruleTaskContext )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:863:1: ruleTaskContext
            {
             before(grammarAccess.getPackageAccess().getTaskContextsTaskContextParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTaskContext_in_rule__Package__TaskContextsAssignment_4_21650);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:872:1: rule__Package__TaskContextsAssignment_4_3_1 : ( ruleTaskContext ) ;
    public final void rule__Package__TaskContextsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:876:1: ( ( ruleTaskContext ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:877:1: ( ruleTaskContext )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:877:1: ( ruleTaskContext )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:878:1: ruleTaskContext
            {
             before(grammarAccess.getPackageAccess().getTaskContextsTaskContextParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTaskContext_in_rule__Package__TaskContextsAssignment_4_3_11681);
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


    // $ANTLR start "rule__TaskContext__NameAssignment_1"
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:887:1: rule__TaskContext__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TaskContext__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:891:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:892:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:892:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:893:1: ruleEString
            {
             before(grammarAccess.getTaskContextAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TaskContext__NameAssignment_11712);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:902:1: rule__TaskContext__NamespaceAssignment_4 : ( ruleEString ) ;
    public final void rule__TaskContext__NamespaceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:906:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:907:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:907:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:908:1: ruleEString
            {
             before(grammarAccess.getTaskContextAccess().getNamespaceEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TaskContext__NamespaceAssignment_41743);
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
    // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:917:1: rule__TaskContext__TypeAssignment_6 : ( ruleEString ) ;
    public final void rule__TaskContext__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:921:1: ( ( ruleEString ) )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:922:1: ( ruleEString )
            {
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:922:1: ( ruleEString )
            // ../be.kuleuven.rodinia.dsl.rtt.ui/src-gen/be/kuleuven/rodinia/dsl/rtt/ui/contentassist/antlr/internal/InternalRttStructure.g:923:1: ruleEString
            {
             before(grammarAccess.getTaskContextAccess().getTypeEStringParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TaskContext__TypeAssignment_61774);
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
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__0297 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__0300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__1358 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__1361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Package__Group__1__Impl389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__2420 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Package__Group__3_in_rule__Package__Group__2423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__NameAssignment_2_in_rule__Package__Group__2__Impl450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__3480 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__Package__Group__4_in_rule__Package__Group__3483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Package__Group__3__Impl511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__4542 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__Package__Group__5_in_rule__Package__Group__4545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__0_in_rule__Package__Group__4__Impl572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__5__Impl_in_rule__Package__Group__5603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Package__Group__5__Impl631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__0__Impl_in_rule__Package__Group_4__0674 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Package__Group_4__1_in_rule__Package__Group_4__0677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Package__Group_4__0__Impl705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__1__Impl_in_rule__Package__Group_4__1736 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Package__Group_4__2_in_rule__Package__Group_4__1739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Package__Group_4__1__Impl767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__2__Impl_in_rule__Package__Group_4__2798 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__Package__Group_4__3_in_rule__Package__Group_4__2801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__TaskContextsAssignment_4_2_in_rule__Package__Group_4__2__Impl828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__3__Impl_in_rule__Package__Group_4__3858 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__Package__Group_4__4_in_rule__Package__Group_4__3861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4_3__0_in_rule__Package__Group_4__3__Impl888 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__4__Impl_in_rule__Package__Group_4__4919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Package__Group_4__4__Impl947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4_3__0__Impl_in_rule__Package__Group_4_3__0988 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Package__Group_4_3__1_in_rule__Package__Group_4_3__0991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Package__Group_4_3__0__Impl1019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4_3__1__Impl_in_rule__Package__Group_4_3__11050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__TaskContextsAssignment_4_3_1_in_rule__Package__Group_4_3__1__Impl1077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__0__Impl_in_rule__TaskContext__Group__01111 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__1_in_rule__TaskContext__Group__01114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TaskContext__Group__0__Impl1142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__1__Impl_in_rule__TaskContext__Group__11173 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__2_in_rule__TaskContext__Group__11176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__NameAssignment_1_in_rule__TaskContext__Group__1__Impl1203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__2__Impl_in_rule__TaskContext__Group__21233 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__3_in_rule__TaskContext__Group__21236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__TaskContext__Group__2__Impl1264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__3__Impl_in_rule__TaskContext__Group__31295 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__4_in_rule__TaskContext__Group__31298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__TaskContext__Group__3__Impl1326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__4__Impl_in_rule__TaskContext__Group__41357 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__5_in_rule__TaskContext__Group__41360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__NamespaceAssignment_4_in_rule__TaskContext__Group__4__Impl1387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__5__Impl_in_rule__TaskContext__Group__51417 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__6_in_rule__TaskContext__Group__51420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__TaskContext__Group__5__Impl1448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__6__Impl_in_rule__TaskContext__Group__61479 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__7_in_rule__TaskContext__Group__61482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__TypeAssignment_6_in_rule__TaskContext__Group__6__Impl1509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TaskContext__Group__7__Impl_in_rule__TaskContext__Group__71539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__TaskContext__Group__7__Impl1567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Package__NameAssignment_21619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTaskContext_in_rule__Package__TaskContextsAssignment_4_21650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTaskContext_in_rule__Package__TaskContextsAssignment_4_3_11681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TaskContext__NameAssignment_11712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TaskContext__NamespaceAssignment_41743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TaskContext__TypeAssignment_61774 = new BitSet(new long[]{0x0000000000000002L});
    }


}