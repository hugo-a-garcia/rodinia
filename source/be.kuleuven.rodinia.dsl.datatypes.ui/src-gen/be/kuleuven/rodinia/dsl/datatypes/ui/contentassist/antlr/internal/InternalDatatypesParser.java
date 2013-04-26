package be.kuleuven.rodinia.dsl.datatypes.ui.contentassist.antlr.internal; 

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
import be.kuleuven.rodinia.dsl.datatypes.services.DatatypesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDatatypesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'.*'", "'DataTypeLibrary'", "'{'", "'}'", "'import'", "'SimpleType'", "'CustomType'", "'superType'", "'fields'", "','", "':'", "'many'"
    };
    public static final int RULE_ID=4;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalDatatypesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDatatypesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDatatypesParser.tokenNames; }
    public String getGrammarFileName() { return "../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g"; }


     
     	private DatatypesGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DatatypesGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleDomainmodel"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:60:1: entryRuleDomainmodel : ruleDomainmodel EOF ;
    public final void entryRuleDomainmodel() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:61:1: ( ruleDomainmodel EOF )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:62:1: ruleDomainmodel EOF
            {
             before(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_ruleDomainmodel_in_entryRuleDomainmodel61);
            ruleDomainmodel();

            state._fsp--;

             after(grammarAccess.getDomainmodelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainmodel68); 

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
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:69:1: ruleDomainmodel : ( ( rule__Domainmodel__ElementsAssignment )* ) ;
    public final void ruleDomainmodel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:73:2: ( ( ( rule__Domainmodel__ElementsAssignment )* ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:74:1: ( ( rule__Domainmodel__ElementsAssignment )* )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:74:1: ( ( rule__Domainmodel__ElementsAssignment )* )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:75:1: ( rule__Domainmodel__ElementsAssignment )*
            {
             before(grammarAccess.getDomainmodelAccess().getElementsAssignment()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:76:1: ( rule__Domainmodel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||(LA1_0>=16 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:76:2: rule__Domainmodel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Domainmodel__ElementsAssignment_in_ruleDomainmodel94);
            	    rule__Domainmodel__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDomainmodelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleQualifiedName"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:88:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:89:1: ( ruleQualifiedName EOF )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:90:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName122);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName129); 

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
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:97:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:101:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:102:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:102:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:103:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:104:1: ( rule__QualifiedName__Group__0 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:104:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName155);
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


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:116:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:117:1: ( ruleQualifiedNameWithWildcard EOF )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:118:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard182);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard189); 

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:125:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:129:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:130:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:130:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:131:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:132:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:132:2: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard215);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleAbstractElement"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:144:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:145:1: ( ruleAbstractElement EOF )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:146:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement242);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement249); 

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:153:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:157:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:158:1: ( ( rule__AbstractElement__Alternatives ) )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:158:1: ( ( rule__AbstractElement__Alternatives ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:159:1: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:160:1: ( rule__AbstractElement__Alternatives )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:160:2: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement275);
            rule__AbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleDataTypeLibrary"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:172:1: entryRuleDataTypeLibrary : ruleDataTypeLibrary EOF ;
    public final void entryRuleDataTypeLibrary() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:173:1: ( ruleDataTypeLibrary EOF )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:174:1: ruleDataTypeLibrary EOF
            {
             before(grammarAccess.getDataTypeLibraryRule()); 
            pushFollow(FOLLOW_ruleDataTypeLibrary_in_entryRuleDataTypeLibrary302);
            ruleDataTypeLibrary();

            state._fsp--;

             after(grammarAccess.getDataTypeLibraryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeLibrary309); 

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
    // $ANTLR end "entryRuleDataTypeLibrary"


    // $ANTLR start "ruleDataTypeLibrary"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:181:1: ruleDataTypeLibrary : ( ( rule__DataTypeLibrary__Group__0 ) ) ;
    public final void ruleDataTypeLibrary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:185:2: ( ( ( rule__DataTypeLibrary__Group__0 ) ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:186:1: ( ( rule__DataTypeLibrary__Group__0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:186:1: ( ( rule__DataTypeLibrary__Group__0 ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:187:1: ( rule__DataTypeLibrary__Group__0 )
            {
             before(grammarAccess.getDataTypeLibraryAccess().getGroup()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:188:1: ( rule__DataTypeLibrary__Group__0 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:188:2: rule__DataTypeLibrary__Group__0
            {
            pushFollow(FOLLOW_rule__DataTypeLibrary__Group__0_in_ruleDataTypeLibrary335);
            rule__DataTypeLibrary__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeLibraryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataTypeLibrary"


    // $ANTLR start "entryRuleImport"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:200:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:201:1: ( ruleImport EOF )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:202:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport362);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport369); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:209:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:213:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:214:1: ( ( rule__Import__Group__0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:214:1: ( ( rule__Import__Group__0 ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:215:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:216:1: ( rule__Import__Group__0 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:216:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport395);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleDataType"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:228:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:229:1: ( ruleDataType EOF )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:230:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType422);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType429); 

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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:237:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:241:2: ( ( ( rule__DataType__Alternatives ) ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:242:1: ( ( rule__DataType__Alternatives ) )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:242:1: ( ( rule__DataType__Alternatives ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:243:1: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:244:1: ( rule__DataType__Alternatives )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:244:2: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_rule__DataType__Alternatives_in_ruleDataType455);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleSimpleType"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:256:1: entryRuleSimpleType : ruleSimpleType EOF ;
    public final void entryRuleSimpleType() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:257:1: ( ruleSimpleType EOF )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:258:1: ruleSimpleType EOF
            {
             before(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType482);
            ruleSimpleType();

            state._fsp--;

             after(grammarAccess.getSimpleTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType489); 

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
    // $ANTLR end "entryRuleSimpleType"


    // $ANTLR start "ruleSimpleType"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:265:1: ruleSimpleType : ( ( rule__SimpleType__Group__0 ) ) ;
    public final void ruleSimpleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:269:2: ( ( ( rule__SimpleType__Group__0 ) ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:270:1: ( ( rule__SimpleType__Group__0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:270:1: ( ( rule__SimpleType__Group__0 ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:271:1: ( rule__SimpleType__Group__0 )
            {
             before(grammarAccess.getSimpleTypeAccess().getGroup()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:272:1: ( rule__SimpleType__Group__0 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:272:2: rule__SimpleType__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__0_in_ruleSimpleType515);
            rule__SimpleType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleType"


    // $ANTLR start "entryRuleCustomType"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:284:1: entryRuleCustomType : ruleCustomType EOF ;
    public final void entryRuleCustomType() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:285:1: ( ruleCustomType EOF )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:286:1: ruleCustomType EOF
            {
             before(grammarAccess.getCustomTypeRule()); 
            pushFollow(FOLLOW_ruleCustomType_in_entryRuleCustomType542);
            ruleCustomType();

            state._fsp--;

             after(grammarAccess.getCustomTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomType549); 

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
    // $ANTLR end "entryRuleCustomType"


    // $ANTLR start "ruleCustomType"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:293:1: ruleCustomType : ( ( rule__CustomType__Group__0 ) ) ;
    public final void ruleCustomType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:297:2: ( ( ( rule__CustomType__Group__0 ) ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:298:1: ( ( rule__CustomType__Group__0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:298:1: ( ( rule__CustomType__Group__0 ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:299:1: ( rule__CustomType__Group__0 )
            {
             before(grammarAccess.getCustomTypeAccess().getGroup()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:300:1: ( rule__CustomType__Group__0 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:300:2: rule__CustomType__Group__0
            {
            pushFollow(FOLLOW_rule__CustomType__Group__0_in_ruleCustomType575);
            rule__CustomType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomType"


    // $ANTLR start "entryRuleField"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:312:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:313:1: ( ruleField EOF )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:314:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField602);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField609); 

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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:321:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:325:2: ( ( ( rule__Field__Group__0 ) ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:326:1: ( ( rule__Field__Group__0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:326:1: ( ( rule__Field__Group__0 ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:327:1: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:328:1: ( rule__Field__Group__0 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:328:2: rule__Field__Group__0
            {
            pushFollow(FOLLOW_rule__Field__Group__0_in_ruleField635);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:340:1: rule__AbstractElement__Alternatives : ( ( ruleDataTypeLibrary ) | ( ruleDataType ) | ( ruleImport ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:344:1: ( ( ruleDataTypeLibrary ) | ( ruleDataType ) | ( ruleImport ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 17:
            case 18:
                {
                alt2=2;
                }
                break;
            case 16:
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
                    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:345:1: ( ruleDataTypeLibrary )
                    {
                    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:345:1: ( ruleDataTypeLibrary )
                    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:346:1: ruleDataTypeLibrary
                    {
                     before(grammarAccess.getAbstractElementAccess().getDataTypeLibraryParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDataTypeLibrary_in_rule__AbstractElement__Alternatives671);
                    ruleDataTypeLibrary();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getDataTypeLibraryParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:351:6: ( ruleDataType )
                    {
                    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:351:6: ( ruleDataType )
                    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:352:1: ruleDataType
                    {
                     before(grammarAccess.getAbstractElementAccess().getDataTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDataType_in_rule__AbstractElement__Alternatives688);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getDataTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:357:6: ( ruleImport )
                    {
                    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:357:6: ( ruleImport )
                    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:358:1: ruleImport
                    {
                     before(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleImport_in_rule__AbstractElement__Alternatives705);
                    ruleImport();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2()); 

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
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__DataType__Alternatives"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:368:1: rule__DataType__Alternatives : ( ( ruleSimpleType ) | ( ruleCustomType ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:372:1: ( ( ruleSimpleType ) | ( ruleCustomType ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:373:1: ( ruleSimpleType )
                    {
                    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:373:1: ( ruleSimpleType )
                    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:374:1: ruleSimpleType
                    {
                     before(grammarAccess.getDataTypeAccess().getSimpleTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSimpleType_in_rule__DataType__Alternatives737);
                    ruleSimpleType();

                    state._fsp--;

                     after(grammarAccess.getDataTypeAccess().getSimpleTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:379:6: ( ruleCustomType )
                    {
                    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:379:6: ( ruleCustomType )
                    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:380:1: ruleCustomType
                    {
                     before(grammarAccess.getDataTypeAccess().getCustomTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCustomType_in_rule__DataType__Alternatives754);
                    ruleCustomType();

                    state._fsp--;

                     after(grammarAccess.getDataTypeAccess().getCustomTypeParserRuleCall_1()); 

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
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:392:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:396:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:397:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__0784);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__0787);
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
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:404:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:408:1: ( ( RULE_ID ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:409:1: ( RULE_ID )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:409:1: ( RULE_ID )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:410:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl814); 
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
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:421:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:425:1: ( rule__QualifiedName__Group__1__Impl )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:426:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__1843);
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
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:432:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:436:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:437:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:437:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:438:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:439:1: ( rule__QualifiedName__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:439:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl870);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:453:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:457:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:458:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__0905);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__0908);
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
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:465:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:469:1: ( ( '.' ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:470:1: ( '.' )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:470:1: ( '.' )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:471:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,11,FOLLOW_11_in_rule__QualifiedName__Group_1__0__Impl936); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
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
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:484:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:488:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:489:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__1967);
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
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:495:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:499:1: ( ( RULE_ID ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:500:1: ( RULE_ID )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:500:1: ( RULE_ID )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:501:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl994); 
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


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:516:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:520:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:521:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__01027);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__01030);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:528:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:532:1: ( ( ruleQualifiedName ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:533:1: ( ruleQualifiedName )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:533:1: ( ruleQualifiedName )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:534:1: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl1057);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:545:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:549:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:550:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__11086);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:556:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:560:1: ( ( ( '.*' )? ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:561:1: ( ( '.*' )? )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:561:1: ( ( '.*' )? )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:562:1: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:563:1: ( '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:564:2: '.*'
                    {
                    match(input,12,FOLLOW_12_in_rule__QualifiedNameWithWildcard__Group__1__Impl1115); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__DataTypeLibrary__Group__0"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:579:1: rule__DataTypeLibrary__Group__0 : rule__DataTypeLibrary__Group__0__Impl rule__DataTypeLibrary__Group__1 ;
    public final void rule__DataTypeLibrary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:583:1: ( rule__DataTypeLibrary__Group__0__Impl rule__DataTypeLibrary__Group__1 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:584:2: rule__DataTypeLibrary__Group__0__Impl rule__DataTypeLibrary__Group__1
            {
            pushFollow(FOLLOW_rule__DataTypeLibrary__Group__0__Impl_in_rule__DataTypeLibrary__Group__01152);
            rule__DataTypeLibrary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataTypeLibrary__Group__1_in_rule__DataTypeLibrary__Group__01155);
            rule__DataTypeLibrary__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeLibrary__Group__0"


    // $ANTLR start "rule__DataTypeLibrary__Group__0__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:591:1: rule__DataTypeLibrary__Group__0__Impl : ( 'DataTypeLibrary' ) ;
    public final void rule__DataTypeLibrary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:595:1: ( ( 'DataTypeLibrary' ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:596:1: ( 'DataTypeLibrary' )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:596:1: ( 'DataTypeLibrary' )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:597:1: 'DataTypeLibrary'
            {
             before(grammarAccess.getDataTypeLibraryAccess().getDataTypeLibraryKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__DataTypeLibrary__Group__0__Impl1183); 
             after(grammarAccess.getDataTypeLibraryAccess().getDataTypeLibraryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeLibrary__Group__0__Impl"


    // $ANTLR start "rule__DataTypeLibrary__Group__1"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:610:1: rule__DataTypeLibrary__Group__1 : rule__DataTypeLibrary__Group__1__Impl rule__DataTypeLibrary__Group__2 ;
    public final void rule__DataTypeLibrary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:614:1: ( rule__DataTypeLibrary__Group__1__Impl rule__DataTypeLibrary__Group__2 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:615:2: rule__DataTypeLibrary__Group__1__Impl rule__DataTypeLibrary__Group__2
            {
            pushFollow(FOLLOW_rule__DataTypeLibrary__Group__1__Impl_in_rule__DataTypeLibrary__Group__11214);
            rule__DataTypeLibrary__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataTypeLibrary__Group__2_in_rule__DataTypeLibrary__Group__11217);
            rule__DataTypeLibrary__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeLibrary__Group__1"


    // $ANTLR start "rule__DataTypeLibrary__Group__1__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:622:1: rule__DataTypeLibrary__Group__1__Impl : ( ( rule__DataTypeLibrary__NameAssignment_1 ) ) ;
    public final void rule__DataTypeLibrary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:626:1: ( ( ( rule__DataTypeLibrary__NameAssignment_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:627:1: ( ( rule__DataTypeLibrary__NameAssignment_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:627:1: ( ( rule__DataTypeLibrary__NameAssignment_1 ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:628:1: ( rule__DataTypeLibrary__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeLibraryAccess().getNameAssignment_1()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:629:1: ( rule__DataTypeLibrary__NameAssignment_1 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:629:2: rule__DataTypeLibrary__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DataTypeLibrary__NameAssignment_1_in_rule__DataTypeLibrary__Group__1__Impl1244);
            rule__DataTypeLibrary__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeLibraryAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeLibrary__Group__1__Impl"


    // $ANTLR start "rule__DataTypeLibrary__Group__2"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:639:1: rule__DataTypeLibrary__Group__2 : rule__DataTypeLibrary__Group__2__Impl rule__DataTypeLibrary__Group__3 ;
    public final void rule__DataTypeLibrary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:643:1: ( rule__DataTypeLibrary__Group__2__Impl rule__DataTypeLibrary__Group__3 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:644:2: rule__DataTypeLibrary__Group__2__Impl rule__DataTypeLibrary__Group__3
            {
            pushFollow(FOLLOW_rule__DataTypeLibrary__Group__2__Impl_in_rule__DataTypeLibrary__Group__21274);
            rule__DataTypeLibrary__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataTypeLibrary__Group__3_in_rule__DataTypeLibrary__Group__21277);
            rule__DataTypeLibrary__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeLibrary__Group__2"


    // $ANTLR start "rule__DataTypeLibrary__Group__2__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:651:1: rule__DataTypeLibrary__Group__2__Impl : ( '{' ) ;
    public final void rule__DataTypeLibrary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:655:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:656:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:656:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:657:1: '{'
            {
             before(grammarAccess.getDataTypeLibraryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__DataTypeLibrary__Group__2__Impl1305); 
             after(grammarAccess.getDataTypeLibraryAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeLibrary__Group__2__Impl"


    // $ANTLR start "rule__DataTypeLibrary__Group__3"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:670:1: rule__DataTypeLibrary__Group__3 : rule__DataTypeLibrary__Group__3__Impl rule__DataTypeLibrary__Group__4 ;
    public final void rule__DataTypeLibrary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:674:1: ( rule__DataTypeLibrary__Group__3__Impl rule__DataTypeLibrary__Group__4 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:675:2: rule__DataTypeLibrary__Group__3__Impl rule__DataTypeLibrary__Group__4
            {
            pushFollow(FOLLOW_rule__DataTypeLibrary__Group__3__Impl_in_rule__DataTypeLibrary__Group__31336);
            rule__DataTypeLibrary__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataTypeLibrary__Group__4_in_rule__DataTypeLibrary__Group__31339);
            rule__DataTypeLibrary__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeLibrary__Group__3"


    // $ANTLR start "rule__DataTypeLibrary__Group__3__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:682:1: rule__DataTypeLibrary__Group__3__Impl : ( ( rule__DataTypeLibrary__ElementsAssignment_3 )* ) ;
    public final void rule__DataTypeLibrary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:686:1: ( ( ( rule__DataTypeLibrary__ElementsAssignment_3 )* ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:687:1: ( ( rule__DataTypeLibrary__ElementsAssignment_3 )* )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:687:1: ( ( rule__DataTypeLibrary__ElementsAssignment_3 )* )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:688:1: ( rule__DataTypeLibrary__ElementsAssignment_3 )*
            {
             before(grammarAccess.getDataTypeLibraryAccess().getElementsAssignment_3()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:689:1: ( rule__DataTypeLibrary__ElementsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13||(LA6_0>=16 && LA6_0<=18)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:689:2: rule__DataTypeLibrary__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__DataTypeLibrary__ElementsAssignment_3_in_rule__DataTypeLibrary__Group__3__Impl1366);
            	    rule__DataTypeLibrary__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getDataTypeLibraryAccess().getElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeLibrary__Group__3__Impl"


    // $ANTLR start "rule__DataTypeLibrary__Group__4"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:699:1: rule__DataTypeLibrary__Group__4 : rule__DataTypeLibrary__Group__4__Impl ;
    public final void rule__DataTypeLibrary__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:703:1: ( rule__DataTypeLibrary__Group__4__Impl )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:704:2: rule__DataTypeLibrary__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__DataTypeLibrary__Group__4__Impl_in_rule__DataTypeLibrary__Group__41397);
            rule__DataTypeLibrary__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeLibrary__Group__4"


    // $ANTLR start "rule__DataTypeLibrary__Group__4__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:710:1: rule__DataTypeLibrary__Group__4__Impl : ( '}' ) ;
    public final void rule__DataTypeLibrary__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:714:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:715:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:715:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:716:1: '}'
            {
             before(grammarAccess.getDataTypeLibraryAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__DataTypeLibrary__Group__4__Impl1425); 
             after(grammarAccess.getDataTypeLibraryAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeLibrary__Group__4__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:739:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:743:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:744:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01466);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01469);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:751:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:755:1: ( ( 'import' ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:756:1: ( 'import' )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:756:1: ( 'import' )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:757:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Import__Group__0__Impl1497); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:770:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:774:1: ( rule__Import__Group__1__Impl )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:775:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11528);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:781:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:785:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:786:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:786:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:787:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:788:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:788:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1555);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__SimpleType__Group__0"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:802:1: rule__SimpleType__Group__0 : rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1 ;
    public final void rule__SimpleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:806:1: ( rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:807:2: rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__0__Impl_in_rule__SimpleType__Group__01589);
            rule__SimpleType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleType__Group__1_in_rule__SimpleType__Group__01592);
            rule__SimpleType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleType__Group__0"


    // $ANTLR start "rule__SimpleType__Group__0__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:814:1: rule__SimpleType__Group__0__Impl : ( 'SimpleType' ) ;
    public final void rule__SimpleType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:818:1: ( ( 'SimpleType' ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:819:1: ( 'SimpleType' )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:819:1: ( 'SimpleType' )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:820:1: 'SimpleType'
            {
             before(grammarAccess.getSimpleTypeAccess().getSimpleTypeKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__SimpleType__Group__0__Impl1620); 
             after(grammarAccess.getSimpleTypeAccess().getSimpleTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleType__Group__0__Impl"


    // $ANTLR start "rule__SimpleType__Group__1"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:833:1: rule__SimpleType__Group__1 : rule__SimpleType__Group__1__Impl ;
    public final void rule__SimpleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:837:1: ( rule__SimpleType__Group__1__Impl )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:838:2: rule__SimpleType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SimpleType__Group__1__Impl_in_rule__SimpleType__Group__11651);
            rule__SimpleType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleType__Group__1"


    // $ANTLR start "rule__SimpleType__Group__1__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:844:1: rule__SimpleType__Group__1__Impl : ( ( rule__SimpleType__NameAssignment_1 ) ) ;
    public final void rule__SimpleType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:848:1: ( ( ( rule__SimpleType__NameAssignment_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:849:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:849:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:850:1: ( rule__SimpleType__NameAssignment_1 )
            {
             before(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:851:1: ( rule__SimpleType__NameAssignment_1 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:851:2: rule__SimpleType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SimpleType__NameAssignment_1_in_rule__SimpleType__Group__1__Impl1678);
            rule__SimpleType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleType__Group__1__Impl"


    // $ANTLR start "rule__CustomType__Group__0"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:865:1: rule__CustomType__Group__0 : rule__CustomType__Group__0__Impl rule__CustomType__Group__1 ;
    public final void rule__CustomType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:869:1: ( rule__CustomType__Group__0__Impl rule__CustomType__Group__1 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:870:2: rule__CustomType__Group__0__Impl rule__CustomType__Group__1
            {
            pushFollow(FOLLOW_rule__CustomType__Group__0__Impl_in_rule__CustomType__Group__01712);
            rule__CustomType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomType__Group__1_in_rule__CustomType__Group__01715);
            rule__CustomType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomType__Group__0"


    // $ANTLR start "rule__CustomType__Group__0__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:877:1: rule__CustomType__Group__0__Impl : ( 'CustomType' ) ;
    public final void rule__CustomType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:881:1: ( ( 'CustomType' ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:882:1: ( 'CustomType' )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:882:1: ( 'CustomType' )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:883:1: 'CustomType'
            {
             before(grammarAccess.getCustomTypeAccess().getCustomTypeKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__CustomType__Group__0__Impl1743); 
             after(grammarAccess.getCustomTypeAccess().getCustomTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomType__Group__0__Impl"


    // $ANTLR start "rule__CustomType__Group__1"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:896:1: rule__CustomType__Group__1 : rule__CustomType__Group__1__Impl rule__CustomType__Group__2 ;
    public final void rule__CustomType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:900:1: ( rule__CustomType__Group__1__Impl rule__CustomType__Group__2 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:901:2: rule__CustomType__Group__1__Impl rule__CustomType__Group__2
            {
            pushFollow(FOLLOW_rule__CustomType__Group__1__Impl_in_rule__CustomType__Group__11774);
            rule__CustomType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomType__Group__2_in_rule__CustomType__Group__11777);
            rule__CustomType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomType__Group__1"


    // $ANTLR start "rule__CustomType__Group__1__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:908:1: rule__CustomType__Group__1__Impl : ( ( rule__CustomType__NameAssignment_1 ) ) ;
    public final void rule__CustomType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:912:1: ( ( ( rule__CustomType__NameAssignment_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:913:1: ( ( rule__CustomType__NameAssignment_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:913:1: ( ( rule__CustomType__NameAssignment_1 ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:914:1: ( rule__CustomType__NameAssignment_1 )
            {
             before(grammarAccess.getCustomTypeAccess().getNameAssignment_1()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:915:1: ( rule__CustomType__NameAssignment_1 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:915:2: rule__CustomType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__CustomType__NameAssignment_1_in_rule__CustomType__Group__1__Impl1804);
            rule__CustomType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomType__Group__1__Impl"


    // $ANTLR start "rule__CustomType__Group__2"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:925:1: rule__CustomType__Group__2 : rule__CustomType__Group__2__Impl rule__CustomType__Group__3 ;
    public final void rule__CustomType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:929:1: ( rule__CustomType__Group__2__Impl rule__CustomType__Group__3 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:930:2: rule__CustomType__Group__2__Impl rule__CustomType__Group__3
            {
            pushFollow(FOLLOW_rule__CustomType__Group__2__Impl_in_rule__CustomType__Group__21834);
            rule__CustomType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomType__Group__3_in_rule__CustomType__Group__21837);
            rule__CustomType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomType__Group__2"


    // $ANTLR start "rule__CustomType__Group__2__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:937:1: rule__CustomType__Group__2__Impl : ( ( rule__CustomType__Group_2__0 )? ) ;
    public final void rule__CustomType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:941:1: ( ( ( rule__CustomType__Group_2__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:942:1: ( ( rule__CustomType__Group_2__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:942:1: ( ( rule__CustomType__Group_2__0 )? )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:943:1: ( rule__CustomType__Group_2__0 )?
            {
             before(grammarAccess.getCustomTypeAccess().getGroup_2()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:944:1: ( rule__CustomType__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:944:2: rule__CustomType__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__CustomType__Group_2__0_in_rule__CustomType__Group__2__Impl1864);
                    rule__CustomType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomTypeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomType__Group__2__Impl"


    // $ANTLR start "rule__CustomType__Group__3"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:954:1: rule__CustomType__Group__3 : rule__CustomType__Group__3__Impl ;
    public final void rule__CustomType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:958:1: ( rule__CustomType__Group__3__Impl )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:959:2: rule__CustomType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__CustomType__Group__3__Impl_in_rule__CustomType__Group__31895);
            rule__CustomType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomType__Group__3"


    // $ANTLR start "rule__CustomType__Group__3__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:965:1: rule__CustomType__Group__3__Impl : ( ( rule__CustomType__Group_3__0 )? ) ;
    public final void rule__CustomType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:969:1: ( ( ( rule__CustomType__Group_3__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:970:1: ( ( rule__CustomType__Group_3__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:970:1: ( ( rule__CustomType__Group_3__0 )? )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:971:1: ( rule__CustomType__Group_3__0 )?
            {
             before(grammarAccess.getCustomTypeAccess().getGroup_3()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:972:1: ( rule__CustomType__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:972:2: rule__CustomType__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__CustomType__Group_3__0_in_rule__CustomType__Group__3__Impl1922);
                    rule__CustomType__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomTypeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomType__Group__3__Impl"


    // $ANTLR start "rule__CustomType__Group_2__0"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:990:1: rule__CustomType__Group_2__0 : rule__CustomType__Group_2__0__Impl rule__CustomType__Group_2__1 ;
    public final void rule__CustomType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:994:1: ( rule__CustomType__Group_2__0__Impl rule__CustomType__Group_2__1 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:995:2: rule__CustomType__Group_2__0__Impl rule__CustomType__Group_2__1
            {
            pushFollow(FOLLOW_rule__CustomType__Group_2__0__Impl_in_rule__CustomType__Group_2__01961);
            rule__CustomType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomType__Group_2__1_in_rule__CustomType__Group_2__01964);
            rule__CustomType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomType__Group_2__0"


    // $ANTLR start "rule__CustomType__Group_2__0__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1002:1: rule__CustomType__Group_2__0__Impl : ( 'superType' ) ;
    public final void rule__CustomType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1006:1: ( ( 'superType' ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1007:1: ( 'superType' )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1007:1: ( 'superType' )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1008:1: 'superType'
            {
             before(grammarAccess.getCustomTypeAccess().getSuperTypeKeyword_2_0()); 
            match(input,19,FOLLOW_19_in_rule__CustomType__Group_2__0__Impl1992); 
             after(grammarAccess.getCustomTypeAccess().getSuperTypeKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomType__Group_2__0__Impl"


    // $ANTLR start "rule__CustomType__Group_2__1"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1021:1: rule__CustomType__Group_2__1 : rule__CustomType__Group_2__1__Impl ;
    public final void rule__CustomType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1025:1: ( rule__CustomType__Group_2__1__Impl )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1026:2: rule__CustomType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__CustomType__Group_2__1__Impl_in_rule__CustomType__Group_2__12023);
            rule__CustomType__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomType__Group_2__1"


    // $ANTLR start "rule__CustomType__Group_2__1__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1032:1: rule__CustomType__Group_2__1__Impl : ( ( rule__CustomType__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__CustomType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1036:1: ( ( ( rule__CustomType__SuperTypeAssignment_2_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1037:1: ( ( rule__CustomType__SuperTypeAssignment_2_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1037:1: ( ( rule__CustomType__SuperTypeAssignment_2_1 ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1038:1: ( rule__CustomType__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getCustomTypeAccess().getSuperTypeAssignment_2_1()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1039:1: ( rule__CustomType__SuperTypeAssignment_2_1 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1039:2: rule__CustomType__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__CustomType__SuperTypeAssignment_2_1_in_rule__CustomType__Group_2__1__Impl2050);
            rule__CustomType__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomTypeAccess().getSuperTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomType__Group_2__1__Impl"


    // $ANTLR start "rule__CustomType__Group_3__0"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1053:1: rule__CustomType__Group_3__0 : rule__CustomType__Group_3__0__Impl rule__CustomType__Group_3__1 ;
    public final void rule__CustomType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1057:1: ( rule__CustomType__Group_3__0__Impl rule__CustomType__Group_3__1 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1058:2: rule__CustomType__Group_3__0__Impl rule__CustomType__Group_3__1
            {
            pushFollow(FOLLOW_rule__CustomType__Group_3__0__Impl_in_rule__CustomType__Group_3__02084);
            rule__CustomType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomType__Group_3__1_in_rule__CustomType__Group_3__02087);
            rule__CustomType__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomType__Group_3__0"


    // $ANTLR start "rule__CustomType__Group_3__0__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1065:1: rule__CustomType__Group_3__0__Impl : ( 'fields' ) ;
    public final void rule__CustomType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1069:1: ( ( 'fields' ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1070:1: ( 'fields' )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1070:1: ( 'fields' )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1071:1: 'fields'
            {
             before(grammarAccess.getCustomTypeAccess().getFieldsKeyword_3_0()); 
            match(input,20,FOLLOW_20_in_rule__CustomType__Group_3__0__Impl2115); 
             after(grammarAccess.getCustomTypeAccess().getFieldsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomType__Group_3__0__Impl"


    // $ANTLR start "rule__CustomType__Group_3__1"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1084:1: rule__CustomType__Group_3__1 : rule__CustomType__Group_3__1__Impl rule__CustomType__Group_3__2 ;
    public final void rule__CustomType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1088:1: ( rule__CustomType__Group_3__1__Impl rule__CustomType__Group_3__2 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1089:2: rule__CustomType__Group_3__1__Impl rule__CustomType__Group_3__2
            {
            pushFollow(FOLLOW_rule__CustomType__Group_3__1__Impl_in_rule__CustomType__Group_3__12146);
            rule__CustomType__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomType__Group_3__2_in_rule__CustomType__Group_3__12149);
            rule__CustomType__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomType__Group_3__1"


    // $ANTLR start "rule__CustomType__Group_3__1__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1096:1: rule__CustomType__Group_3__1__Impl : ( '{' ) ;
    public final void rule__CustomType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1100:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1101:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1101:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1102:1: '{'
            {
             before(grammarAccess.getCustomTypeAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,14,FOLLOW_14_in_rule__CustomType__Group_3__1__Impl2177); 
             after(grammarAccess.getCustomTypeAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomType__Group_3__1__Impl"


    // $ANTLR start "rule__CustomType__Group_3__2"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1115:1: rule__CustomType__Group_3__2 : rule__CustomType__Group_3__2__Impl rule__CustomType__Group_3__3 ;
    public final void rule__CustomType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1119:1: ( rule__CustomType__Group_3__2__Impl rule__CustomType__Group_3__3 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1120:2: rule__CustomType__Group_3__2__Impl rule__CustomType__Group_3__3
            {
            pushFollow(FOLLOW_rule__CustomType__Group_3__2__Impl_in_rule__CustomType__Group_3__22208);
            rule__CustomType__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomType__Group_3__3_in_rule__CustomType__Group_3__22211);
            rule__CustomType__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomType__Group_3__2"


    // $ANTLR start "rule__CustomType__Group_3__2__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1127:1: rule__CustomType__Group_3__2__Impl : ( ( rule__CustomType__FieldsAssignment_3_2 ) ) ;
    public final void rule__CustomType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1131:1: ( ( ( rule__CustomType__FieldsAssignment_3_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1132:1: ( ( rule__CustomType__FieldsAssignment_3_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1132:1: ( ( rule__CustomType__FieldsAssignment_3_2 ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1133:1: ( rule__CustomType__FieldsAssignment_3_2 )
            {
             before(grammarAccess.getCustomTypeAccess().getFieldsAssignment_3_2()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1134:1: ( rule__CustomType__FieldsAssignment_3_2 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1134:2: rule__CustomType__FieldsAssignment_3_2
            {
            pushFollow(FOLLOW_rule__CustomType__FieldsAssignment_3_2_in_rule__CustomType__Group_3__2__Impl2238);
            rule__CustomType__FieldsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getCustomTypeAccess().getFieldsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomType__Group_3__2__Impl"


    // $ANTLR start "rule__CustomType__Group_3__3"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1144:1: rule__CustomType__Group_3__3 : rule__CustomType__Group_3__3__Impl rule__CustomType__Group_3__4 ;
    public final void rule__CustomType__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1148:1: ( rule__CustomType__Group_3__3__Impl rule__CustomType__Group_3__4 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1149:2: rule__CustomType__Group_3__3__Impl rule__CustomType__Group_3__4
            {
            pushFollow(FOLLOW_rule__CustomType__Group_3__3__Impl_in_rule__CustomType__Group_3__32268);
            rule__CustomType__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomType__Group_3__4_in_rule__CustomType__Group_3__32271);
            rule__CustomType__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomType__Group_3__3"


    // $ANTLR start "rule__CustomType__Group_3__3__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1156:1: rule__CustomType__Group_3__3__Impl : ( ( rule__CustomType__Group_3_3__0 )* ) ;
    public final void rule__CustomType__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1160:1: ( ( ( rule__CustomType__Group_3_3__0 )* ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1161:1: ( ( rule__CustomType__Group_3_3__0 )* )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1161:1: ( ( rule__CustomType__Group_3_3__0 )* )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1162:1: ( rule__CustomType__Group_3_3__0 )*
            {
             before(grammarAccess.getCustomTypeAccess().getGroup_3_3()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1163:1: ( rule__CustomType__Group_3_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1163:2: rule__CustomType__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_rule__CustomType__Group_3_3__0_in_rule__CustomType__Group_3__3__Impl2298);
            	    rule__CustomType__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getCustomTypeAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomType__Group_3__3__Impl"


    // $ANTLR start "rule__CustomType__Group_3__4"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1173:1: rule__CustomType__Group_3__4 : rule__CustomType__Group_3__4__Impl ;
    public final void rule__CustomType__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1177:1: ( rule__CustomType__Group_3__4__Impl )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1178:2: rule__CustomType__Group_3__4__Impl
            {
            pushFollow(FOLLOW_rule__CustomType__Group_3__4__Impl_in_rule__CustomType__Group_3__42329);
            rule__CustomType__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomType__Group_3__4"


    // $ANTLR start "rule__CustomType__Group_3__4__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1184:1: rule__CustomType__Group_3__4__Impl : ( '}' ) ;
    public final void rule__CustomType__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1188:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1189:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1189:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1190:1: '}'
            {
             before(grammarAccess.getCustomTypeAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,15,FOLLOW_15_in_rule__CustomType__Group_3__4__Impl2357); 
             after(grammarAccess.getCustomTypeAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomType__Group_3__4__Impl"


    // $ANTLR start "rule__CustomType__Group_3_3__0"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1213:1: rule__CustomType__Group_3_3__0 : rule__CustomType__Group_3_3__0__Impl rule__CustomType__Group_3_3__1 ;
    public final void rule__CustomType__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1217:1: ( rule__CustomType__Group_3_3__0__Impl rule__CustomType__Group_3_3__1 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1218:2: rule__CustomType__Group_3_3__0__Impl rule__CustomType__Group_3_3__1
            {
            pushFollow(FOLLOW_rule__CustomType__Group_3_3__0__Impl_in_rule__CustomType__Group_3_3__02398);
            rule__CustomType__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomType__Group_3_3__1_in_rule__CustomType__Group_3_3__02401);
            rule__CustomType__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomType__Group_3_3__0"


    // $ANTLR start "rule__CustomType__Group_3_3__0__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1225:1: rule__CustomType__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__CustomType__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1229:1: ( ( ',' ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1230:1: ( ',' )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1230:1: ( ',' )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1231:1: ','
            {
             before(grammarAccess.getCustomTypeAccess().getCommaKeyword_3_3_0()); 
            match(input,21,FOLLOW_21_in_rule__CustomType__Group_3_3__0__Impl2429); 
             after(grammarAccess.getCustomTypeAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomType__Group_3_3__0__Impl"


    // $ANTLR start "rule__CustomType__Group_3_3__1"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1244:1: rule__CustomType__Group_3_3__1 : rule__CustomType__Group_3_3__1__Impl ;
    public final void rule__CustomType__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1248:1: ( rule__CustomType__Group_3_3__1__Impl )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1249:2: rule__CustomType__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_rule__CustomType__Group_3_3__1__Impl_in_rule__CustomType__Group_3_3__12460);
            rule__CustomType__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomType__Group_3_3__1"


    // $ANTLR start "rule__CustomType__Group_3_3__1__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1255:1: rule__CustomType__Group_3_3__1__Impl : ( ( rule__CustomType__FieldsAssignment_3_3_1 ) ) ;
    public final void rule__CustomType__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1259:1: ( ( ( rule__CustomType__FieldsAssignment_3_3_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1260:1: ( ( rule__CustomType__FieldsAssignment_3_3_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1260:1: ( ( rule__CustomType__FieldsAssignment_3_3_1 ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1261:1: ( rule__CustomType__FieldsAssignment_3_3_1 )
            {
             before(grammarAccess.getCustomTypeAccess().getFieldsAssignment_3_3_1()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1262:1: ( rule__CustomType__FieldsAssignment_3_3_1 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1262:2: rule__CustomType__FieldsAssignment_3_3_1
            {
            pushFollow(FOLLOW_rule__CustomType__FieldsAssignment_3_3_1_in_rule__CustomType__Group_3_3__1__Impl2487);
            rule__CustomType__FieldsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomTypeAccess().getFieldsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomType__Group_3_3__1__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1276:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1280:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1281:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__02521);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__02524);
            rule__Field__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1288:1: rule__Field__Group__0__Impl : ( ( rule__Field__ManyAssignment_0 )? ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1292:1: ( ( ( rule__Field__ManyAssignment_0 )? ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1293:1: ( ( rule__Field__ManyAssignment_0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1293:1: ( ( rule__Field__ManyAssignment_0 )? )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1294:1: ( rule__Field__ManyAssignment_0 )?
            {
             before(grammarAccess.getFieldAccess().getManyAssignment_0()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1295:1: ( rule__Field__ManyAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1295:2: rule__Field__ManyAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Field__ManyAssignment_0_in_rule__Field__Group__0__Impl2551);
                    rule__Field__ManyAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldAccess().getManyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1305:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1309:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1310:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__12582);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__12585);
            rule__Field__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1317:1: rule__Field__Group__1__Impl : ( ( rule__Field__NameAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1321:1: ( ( ( rule__Field__NameAssignment_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1322:1: ( ( rule__Field__NameAssignment_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1322:1: ( ( rule__Field__NameAssignment_1 ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1323:1: ( rule__Field__NameAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_1()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1324:1: ( rule__Field__NameAssignment_1 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1324:2: rule__Field__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_1_in_rule__Field__Group__1__Impl2612);
            rule__Field__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1334:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1338:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1339:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__22642);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__22645);
            rule__Field__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1346:1: rule__Field__Group__2__Impl : ( ':' ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1350:1: ( ( ':' ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1351:1: ( ':' )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1351:1: ( ':' )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1352:1: ':'
            {
             before(grammarAccess.getFieldAccess().getColonKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__Field__Group__2__Impl2673); 
             after(grammarAccess.getFieldAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__Field__Group__3"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1365:1: rule__Field__Group__3 : rule__Field__Group__3__Impl ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1369:1: ( rule__Field__Group__3__Impl )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1370:2: rule__Field__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__32704);
            rule__Field__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__3"


    // $ANTLR start "rule__Field__Group__3__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1376:1: rule__Field__Group__3__Impl : ( ( rule__Field__TypeAssignment_3 ) ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1380:1: ( ( ( rule__Field__TypeAssignment_3 ) ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1381:1: ( ( rule__Field__TypeAssignment_3 ) )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1381:1: ( ( rule__Field__TypeAssignment_3 ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1382:1: ( rule__Field__TypeAssignment_3 )
            {
             before(grammarAccess.getFieldAccess().getTypeAssignment_3()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1383:1: ( rule__Field__TypeAssignment_3 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1383:2: rule__Field__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Field__TypeAssignment_3_in_rule__Field__Group__3__Impl2731);
            rule__Field__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__3__Impl"


    // $ANTLR start "rule__Domainmodel__ElementsAssignment"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1402:1: rule__Domainmodel__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__Domainmodel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1406:1: ( ( ruleAbstractElement ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1407:1: ( ruleAbstractElement )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1407:1: ( ruleAbstractElement )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1408:1: ruleAbstractElement
            {
             before(grammarAccess.getDomainmodelAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__Domainmodel__ElementsAssignment2774);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getDomainmodelAccess().getElementsAbstractElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__ElementsAssignment"


    // $ANTLR start "rule__DataTypeLibrary__NameAssignment_1"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1417:1: rule__DataTypeLibrary__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__DataTypeLibrary__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1421:1: ( ( ruleQualifiedName ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1422:1: ( ruleQualifiedName )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1422:1: ( ruleQualifiedName )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1423:1: ruleQualifiedName
            {
             before(grammarAccess.getDataTypeLibraryAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__DataTypeLibrary__NameAssignment_12805);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDataTypeLibraryAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeLibrary__NameAssignment_1"


    // $ANTLR start "rule__DataTypeLibrary__ElementsAssignment_3"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1432:1: rule__DataTypeLibrary__ElementsAssignment_3 : ( ruleAbstractElement ) ;
    public final void rule__DataTypeLibrary__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1436:1: ( ( ruleAbstractElement ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1437:1: ( ruleAbstractElement )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1437:1: ( ruleAbstractElement )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1438:1: ruleAbstractElement
            {
             before(grammarAccess.getDataTypeLibraryAccess().getElementsAbstractElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__DataTypeLibrary__ElementsAssignment_32836);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getDataTypeLibraryAccess().getElementsAbstractElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeLibrary__ElementsAssignment_3"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1447:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1451:1: ( ( ruleQualifiedNameWithWildcard ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1452:1: ( ruleQualifiedNameWithWildcard )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1452:1: ( ruleQualifiedNameWithWildcard )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1453:1: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_12867);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__SimpleType__NameAssignment_1"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1462:1: rule__SimpleType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SimpleType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1466:1: ( ( RULE_ID ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1467:1: ( RULE_ID )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1467:1: ( RULE_ID )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1468:1: RULE_ID
            {
             before(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleType__NameAssignment_12898); 
             after(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleType__NameAssignment_1"


    // $ANTLR start "rule__CustomType__NameAssignment_1"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1477:1: rule__CustomType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CustomType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1481:1: ( ( RULE_ID ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1482:1: ( RULE_ID )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1482:1: ( RULE_ID )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1483:1: RULE_ID
            {
             before(grammarAccess.getCustomTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CustomType__NameAssignment_12929); 
             after(grammarAccess.getCustomTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomType__NameAssignment_1"


    // $ANTLR start "rule__CustomType__SuperTypeAssignment_2_1"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1492:1: rule__CustomType__SuperTypeAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__CustomType__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1496:1: ( ( ( ruleQualifiedName ) ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1497:1: ( ( ruleQualifiedName ) )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1497:1: ( ( ruleQualifiedName ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1498:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getCustomTypeAccess().getSuperTypeCustomTypeCrossReference_2_1_0()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1499:1: ( ruleQualifiedName )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1500:1: ruleQualifiedName
            {
             before(grammarAccess.getCustomTypeAccess().getSuperTypeCustomTypeQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__CustomType__SuperTypeAssignment_2_12964);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getCustomTypeAccess().getSuperTypeCustomTypeQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getCustomTypeAccess().getSuperTypeCustomTypeCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomType__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__CustomType__FieldsAssignment_3_2"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1511:1: rule__CustomType__FieldsAssignment_3_2 : ( ruleField ) ;
    public final void rule__CustomType__FieldsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1515:1: ( ( ruleField ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1516:1: ( ruleField )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1516:1: ( ruleField )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1517:1: ruleField
            {
             before(grammarAccess.getCustomTypeAccess().getFieldsFieldParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__CustomType__FieldsAssignment_3_22999);
            ruleField();

            state._fsp--;

             after(grammarAccess.getCustomTypeAccess().getFieldsFieldParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomType__FieldsAssignment_3_2"


    // $ANTLR start "rule__CustomType__FieldsAssignment_3_3_1"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1526:1: rule__CustomType__FieldsAssignment_3_3_1 : ( ruleField ) ;
    public final void rule__CustomType__FieldsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1530:1: ( ( ruleField ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1531:1: ( ruleField )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1531:1: ( ruleField )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1532:1: ruleField
            {
             before(grammarAccess.getCustomTypeAccess().getFieldsFieldParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__CustomType__FieldsAssignment_3_3_13030);
            ruleField();

            state._fsp--;

             after(grammarAccess.getCustomTypeAccess().getFieldsFieldParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomType__FieldsAssignment_3_3_1"


    // $ANTLR start "rule__Field__ManyAssignment_0"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1541:1: rule__Field__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Field__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1545:1: ( ( ( 'many' ) ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1546:1: ( ( 'many' ) )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1546:1: ( ( 'many' ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1547:1: ( 'many' )
            {
             before(grammarAccess.getFieldAccess().getManyManyKeyword_0_0()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1548:1: ( 'many' )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1549:1: 'many'
            {
             before(grammarAccess.getFieldAccess().getManyManyKeyword_0_0()); 
            match(input,23,FOLLOW_23_in_rule__Field__ManyAssignment_03066); 
             after(grammarAccess.getFieldAccess().getManyManyKeyword_0_0()); 

            }

             after(grammarAccess.getFieldAccess().getManyManyKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__ManyAssignment_0"


    // $ANTLR start "rule__Field__NameAssignment_1"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1564:1: rule__Field__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1568:1: ( ( RULE_ID ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1569:1: ( RULE_ID )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1569:1: ( RULE_ID )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1570:1: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__NameAssignment_13105); 
             after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__NameAssignment_1"


    // $ANTLR start "rule__Field__TypeAssignment_3"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1579:1: rule__Field__TypeAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Field__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1583:1: ( ( ( ruleQualifiedName ) ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1584:1: ( ( ruleQualifiedName ) )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1584:1: ( ( ruleQualifiedName ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1585:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getFieldAccess().getTypeDataTypeCrossReference_3_0()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1586:1: ( ruleQualifiedName )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1587:1: ruleQualifiedName
            {
             before(grammarAccess.getFieldAccess().getTypeDataTypeQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Field__TypeAssignment_33140);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getTypeDataTypeQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getFieldAccess().getTypeDataTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__TypeAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDomainmodel_in_entryRuleDomainmodel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainmodel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domainmodel__ElementsAssignment_in_ruleDomainmodel94 = new BitSet(new long[]{0x0000000000072002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeLibrary_in_entryRuleDataTypeLibrary302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeLibrary309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataTypeLibrary__Group__0_in_ruleDataTypeLibrary335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Alternatives_in_ruleDataType455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__0_in_ruleSimpleType515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomType_in_entryRuleCustomType542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomType549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomType__Group__0_in_ruleCustomType575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0_in_ruleField635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeLibrary_in_rule__AbstractElement__Alternatives671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__AbstractElement__Alternatives688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__AbstractElement__Alternatives705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_rule__DataType__Alternatives737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomType_in_rule__DataType__Alternatives754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__0784 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__0787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl870 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__0905 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__0908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__QualifiedName__Group_1__0__Impl936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__01027 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__01030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__11086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__QualifiedNameWithWildcard__Group__1__Impl1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataTypeLibrary__Group__0__Impl_in_rule__DataTypeLibrary__Group__01152 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataTypeLibrary__Group__1_in_rule__DataTypeLibrary__Group__01155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__DataTypeLibrary__Group__0__Impl1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataTypeLibrary__Group__1__Impl_in_rule__DataTypeLibrary__Group__11214 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__DataTypeLibrary__Group__2_in_rule__DataTypeLibrary__Group__11217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataTypeLibrary__NameAssignment_1_in_rule__DataTypeLibrary__Group__1__Impl1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataTypeLibrary__Group__2__Impl_in_rule__DataTypeLibrary__Group__21274 = new BitSet(new long[]{0x000000000007A000L});
    public static final BitSet FOLLOW_rule__DataTypeLibrary__Group__3_in_rule__DataTypeLibrary__Group__21277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DataTypeLibrary__Group__2__Impl1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataTypeLibrary__Group__3__Impl_in_rule__DataTypeLibrary__Group__31336 = new BitSet(new long[]{0x000000000007A000L});
    public static final BitSet FOLLOW_rule__DataTypeLibrary__Group__4_in_rule__DataTypeLibrary__Group__31339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataTypeLibrary__ElementsAssignment_3_in_rule__DataTypeLibrary__Group__3__Impl1366 = new BitSet(new long[]{0x0000000000072002L});
    public static final BitSet FOLLOW_rule__DataTypeLibrary__Group__4__Impl_in_rule__DataTypeLibrary__Group__41397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DataTypeLibrary__Group__4__Impl1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01466 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Import__Group__0__Impl1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__0__Impl_in_rule__SimpleType__Group__01589 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__1_in_rule__SimpleType__Group__01592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SimpleType__Group__0__Impl1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Group__1__Impl_in_rule__SimpleType__Group__11651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__NameAssignment_1_in_rule__SimpleType__Group__1__Impl1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomType__Group__0__Impl_in_rule__CustomType__Group__01712 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CustomType__Group__1_in_rule__CustomType__Group__01715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CustomType__Group__0__Impl1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomType__Group__1__Impl_in_rule__CustomType__Group__11774 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__CustomType__Group__2_in_rule__CustomType__Group__11777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomType__NameAssignment_1_in_rule__CustomType__Group__1__Impl1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomType__Group__2__Impl_in_rule__CustomType__Group__21834 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__CustomType__Group__3_in_rule__CustomType__Group__21837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomType__Group_2__0_in_rule__CustomType__Group__2__Impl1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomType__Group__3__Impl_in_rule__CustomType__Group__31895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomType__Group_3__0_in_rule__CustomType__Group__3__Impl1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomType__Group_2__0__Impl_in_rule__CustomType__Group_2__01961 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CustomType__Group_2__1_in_rule__CustomType__Group_2__01964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CustomType__Group_2__0__Impl1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomType__Group_2__1__Impl_in_rule__CustomType__Group_2__12023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomType__SuperTypeAssignment_2_1_in_rule__CustomType__Group_2__1__Impl2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomType__Group_3__0__Impl_in_rule__CustomType__Group_3__02084 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__CustomType__Group_3__1_in_rule__CustomType__Group_3__02087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CustomType__Group_3__0__Impl2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomType__Group_3__1__Impl_in_rule__CustomType__Group_3__12146 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__CustomType__Group_3__2_in_rule__CustomType__Group_3__12149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__CustomType__Group_3__1__Impl2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomType__Group_3__2__Impl_in_rule__CustomType__Group_3__22208 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_rule__CustomType__Group_3__3_in_rule__CustomType__Group_3__22211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomType__FieldsAssignment_3_2_in_rule__CustomType__Group_3__2__Impl2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomType__Group_3__3__Impl_in_rule__CustomType__Group_3__32268 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_rule__CustomType__Group_3__4_in_rule__CustomType__Group_3__32271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomType__Group_3_3__0_in_rule__CustomType__Group_3__3__Impl2298 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__CustomType__Group_3__4__Impl_in_rule__CustomType__Group_3__42329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__CustomType__Group_3__4__Impl2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomType__Group_3_3__0__Impl_in_rule__CustomType__Group_3_3__02398 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__CustomType__Group_3_3__1_in_rule__CustomType__Group_3_3__02401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__CustomType__Group_3_3__0__Impl2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomType__Group_3_3__1__Impl_in_rule__CustomType__Group_3_3__12460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomType__FieldsAssignment_3_3_1_in_rule__CustomType__Group_3_3__1__Impl2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__02521 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__02524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__ManyAssignment_0_in_rule__Field__Group__0__Impl2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__12582 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__12585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_1_in_rule__Field__Group__1__Impl2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__22642 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__22645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Field__Group__2__Impl2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__32704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__TypeAssignment_3_in_rule__Field__Group__3__Impl2731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__Domainmodel__ElementsAssignment2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__DataTypeLibrary__NameAssignment_12805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__DataTypeLibrary__ElementsAssignment_32836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_12867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleType__NameAssignment_12898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CustomType__NameAssignment_12929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__CustomType__SuperTypeAssignment_2_12964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__CustomType__FieldsAssignment_3_22999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__CustomType__FieldsAssignment_3_3_13030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Field__ManyAssignment_03066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__NameAssignment_13105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Field__TypeAssignment_33140 = new BitSet(new long[]{0x0000000000000002L});

}