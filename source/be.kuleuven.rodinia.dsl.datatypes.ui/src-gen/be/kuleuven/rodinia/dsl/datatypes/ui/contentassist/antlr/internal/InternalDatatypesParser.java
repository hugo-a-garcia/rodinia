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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'.*'", "'DataTypeLibrary'", "'{'", "'}'", "'import'", "'SimpleType'", "'ComplexType'", "'extends'", "'fields'", "','", "':'", "'many'"
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




    // $ANTLR start "entryRuleTypeModel"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:60:1: entryRuleTypeModel : ruleTypeModel EOF ;
    public final void entryRuleTypeModel() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:61:1: ( ruleTypeModel EOF )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:62:1: ruleTypeModel EOF
            {
             before(grammarAccess.getTypeModelRule()); 
            pushFollow(FOLLOW_ruleTypeModel_in_entryRuleTypeModel61);
            ruleTypeModel();

            state._fsp--;

             after(grammarAccess.getTypeModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeModel68); 

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
    // $ANTLR end "entryRuleTypeModel"


    // $ANTLR start "ruleTypeModel"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:69:1: ruleTypeModel : ( ( rule__TypeModel__ElementsAssignment )* ) ;
    public final void ruleTypeModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:73:2: ( ( ( rule__TypeModel__ElementsAssignment )* ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:74:1: ( ( rule__TypeModel__ElementsAssignment )* )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:74:1: ( ( rule__TypeModel__ElementsAssignment )* )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:75:1: ( rule__TypeModel__ElementsAssignment )*
            {
             before(grammarAccess.getTypeModelAccess().getElementsAssignment()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:76:1: ( rule__TypeModel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||(LA1_0>=16 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:76:2: rule__TypeModel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__TypeModel__ElementsAssignment_in_ruleTypeModel94);
            	    rule__TypeModel__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getTypeModelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeModel"


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


    // $ANTLR start "entryRuleComplexType"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:284:1: entryRuleComplexType : ruleComplexType EOF ;
    public final void entryRuleComplexType() throws RecognitionException {
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:285:1: ( ruleComplexType EOF )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:286:1: ruleComplexType EOF
            {
             before(grammarAccess.getComplexTypeRule()); 
            pushFollow(FOLLOW_ruleComplexType_in_entryRuleComplexType542);
            ruleComplexType();

            state._fsp--;

             after(grammarAccess.getComplexTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexType549); 

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
    // $ANTLR end "entryRuleComplexType"


    // $ANTLR start "ruleComplexType"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:293:1: ruleComplexType : ( ( rule__ComplexType__Group__0 ) ) ;
    public final void ruleComplexType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:297:2: ( ( ( rule__ComplexType__Group__0 ) ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:298:1: ( ( rule__ComplexType__Group__0 ) )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:298:1: ( ( rule__ComplexType__Group__0 ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:299:1: ( rule__ComplexType__Group__0 )
            {
             before(grammarAccess.getComplexTypeAccess().getGroup()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:300:1: ( rule__ComplexType__Group__0 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:300:2: rule__ComplexType__Group__0
            {
            pushFollow(FOLLOW_rule__ComplexType__Group__0_in_ruleComplexType575);
            rule__ComplexType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComplexTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplexType"


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
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:368:1: rule__DataType__Alternatives : ( ( ruleSimpleType ) | ( ruleComplexType ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:372:1: ( ( ruleSimpleType ) | ( ruleComplexType ) )
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
                    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:379:6: ( ruleComplexType )
                    {
                    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:379:6: ( ruleComplexType )
                    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:380:1: ruleComplexType
                    {
                     before(grammarAccess.getDataTypeAccess().getComplexTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleComplexType_in_rule__DataType__Alternatives754);
                    ruleComplexType();

                    state._fsp--;

                     after(grammarAccess.getDataTypeAccess().getComplexTypeParserRuleCall_1()); 

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


    // $ANTLR start "rule__ComplexType__Group__0"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:865:1: rule__ComplexType__Group__0 : rule__ComplexType__Group__0__Impl rule__ComplexType__Group__1 ;
    public final void rule__ComplexType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:869:1: ( rule__ComplexType__Group__0__Impl rule__ComplexType__Group__1 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:870:2: rule__ComplexType__Group__0__Impl rule__ComplexType__Group__1
            {
            pushFollow(FOLLOW_rule__ComplexType__Group__0__Impl_in_rule__ComplexType__Group__01712);
            rule__ComplexType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexType__Group__1_in_rule__ComplexType__Group__01715);
            rule__ComplexType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Group__0"


    // $ANTLR start "rule__ComplexType__Group__0__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:877:1: rule__ComplexType__Group__0__Impl : ( 'ComplexType' ) ;
    public final void rule__ComplexType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:881:1: ( ( 'ComplexType' ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:882:1: ( 'ComplexType' )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:882:1: ( 'ComplexType' )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:883:1: 'ComplexType'
            {
             before(grammarAccess.getComplexTypeAccess().getComplexTypeKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__ComplexType__Group__0__Impl1743); 
             after(grammarAccess.getComplexTypeAccess().getComplexTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Group__0__Impl"


    // $ANTLR start "rule__ComplexType__Group__1"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:896:1: rule__ComplexType__Group__1 : rule__ComplexType__Group__1__Impl rule__ComplexType__Group__2 ;
    public final void rule__ComplexType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:900:1: ( rule__ComplexType__Group__1__Impl rule__ComplexType__Group__2 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:901:2: rule__ComplexType__Group__1__Impl rule__ComplexType__Group__2
            {
            pushFollow(FOLLOW_rule__ComplexType__Group__1__Impl_in_rule__ComplexType__Group__11774);
            rule__ComplexType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexType__Group__2_in_rule__ComplexType__Group__11777);
            rule__ComplexType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Group__1"


    // $ANTLR start "rule__ComplexType__Group__1__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:908:1: rule__ComplexType__Group__1__Impl : ( ( rule__ComplexType__NameAssignment_1 ) ) ;
    public final void rule__ComplexType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:912:1: ( ( ( rule__ComplexType__NameAssignment_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:913:1: ( ( rule__ComplexType__NameAssignment_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:913:1: ( ( rule__ComplexType__NameAssignment_1 ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:914:1: ( rule__ComplexType__NameAssignment_1 )
            {
             before(grammarAccess.getComplexTypeAccess().getNameAssignment_1()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:915:1: ( rule__ComplexType__NameAssignment_1 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:915:2: rule__ComplexType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ComplexType__NameAssignment_1_in_rule__ComplexType__Group__1__Impl1804);
            rule__ComplexType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComplexTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Group__1__Impl"


    // $ANTLR start "rule__ComplexType__Group__2"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:925:1: rule__ComplexType__Group__2 : rule__ComplexType__Group__2__Impl rule__ComplexType__Group__3 ;
    public final void rule__ComplexType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:929:1: ( rule__ComplexType__Group__2__Impl rule__ComplexType__Group__3 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:930:2: rule__ComplexType__Group__2__Impl rule__ComplexType__Group__3
            {
            pushFollow(FOLLOW_rule__ComplexType__Group__2__Impl_in_rule__ComplexType__Group__21834);
            rule__ComplexType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexType__Group__3_in_rule__ComplexType__Group__21837);
            rule__ComplexType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Group__2"


    // $ANTLR start "rule__ComplexType__Group__2__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:937:1: rule__ComplexType__Group__2__Impl : ( ( rule__ComplexType__Group_2__0 )? ) ;
    public final void rule__ComplexType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:941:1: ( ( ( rule__ComplexType__Group_2__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:942:1: ( ( rule__ComplexType__Group_2__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:942:1: ( ( rule__ComplexType__Group_2__0 )? )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:943:1: ( rule__ComplexType__Group_2__0 )?
            {
             before(grammarAccess.getComplexTypeAccess().getGroup_2()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:944:1: ( rule__ComplexType__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:944:2: rule__ComplexType__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ComplexType__Group_2__0_in_rule__ComplexType__Group__2__Impl1864);
                    rule__ComplexType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComplexTypeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Group__2__Impl"


    // $ANTLR start "rule__ComplexType__Group__3"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:954:1: rule__ComplexType__Group__3 : rule__ComplexType__Group__3__Impl rule__ComplexType__Group__4 ;
    public final void rule__ComplexType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:958:1: ( rule__ComplexType__Group__3__Impl rule__ComplexType__Group__4 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:959:2: rule__ComplexType__Group__3__Impl rule__ComplexType__Group__4
            {
            pushFollow(FOLLOW_rule__ComplexType__Group__3__Impl_in_rule__ComplexType__Group__31895);
            rule__ComplexType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexType__Group__4_in_rule__ComplexType__Group__31898);
            rule__ComplexType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Group__3"


    // $ANTLR start "rule__ComplexType__Group__3__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:966:1: rule__ComplexType__Group__3__Impl : ( '{' ) ;
    public final void rule__ComplexType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:970:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:971:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:971:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:972:1: '{'
            {
             before(grammarAccess.getComplexTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__ComplexType__Group__3__Impl1926); 
             after(grammarAccess.getComplexTypeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Group__3__Impl"


    // $ANTLR start "rule__ComplexType__Group__4"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:985:1: rule__ComplexType__Group__4 : rule__ComplexType__Group__4__Impl rule__ComplexType__Group__5 ;
    public final void rule__ComplexType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:989:1: ( rule__ComplexType__Group__4__Impl rule__ComplexType__Group__5 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:990:2: rule__ComplexType__Group__4__Impl rule__ComplexType__Group__5
            {
            pushFollow(FOLLOW_rule__ComplexType__Group__4__Impl_in_rule__ComplexType__Group__41957);
            rule__ComplexType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexType__Group__5_in_rule__ComplexType__Group__41960);
            rule__ComplexType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Group__4"


    // $ANTLR start "rule__ComplexType__Group__4__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:997:1: rule__ComplexType__Group__4__Impl : ( ( rule__ComplexType__Group_4__0 )? ) ;
    public final void rule__ComplexType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1001:1: ( ( ( rule__ComplexType__Group_4__0 )? ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1002:1: ( ( rule__ComplexType__Group_4__0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1002:1: ( ( rule__ComplexType__Group_4__0 )? )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1003:1: ( rule__ComplexType__Group_4__0 )?
            {
             before(grammarAccess.getComplexTypeAccess().getGroup_4()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1004:1: ( rule__ComplexType__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1004:2: rule__ComplexType__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ComplexType__Group_4__0_in_rule__ComplexType__Group__4__Impl1987);
                    rule__ComplexType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComplexTypeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Group__4__Impl"


    // $ANTLR start "rule__ComplexType__Group__5"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1014:1: rule__ComplexType__Group__5 : rule__ComplexType__Group__5__Impl ;
    public final void rule__ComplexType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1018:1: ( rule__ComplexType__Group__5__Impl )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1019:2: rule__ComplexType__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ComplexType__Group__5__Impl_in_rule__ComplexType__Group__52018);
            rule__ComplexType__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Group__5"


    // $ANTLR start "rule__ComplexType__Group__5__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1025:1: rule__ComplexType__Group__5__Impl : ( '}' ) ;
    public final void rule__ComplexType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1029:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1030:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1030:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1031:1: '}'
            {
             before(grammarAccess.getComplexTypeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__ComplexType__Group__5__Impl2046); 
             after(grammarAccess.getComplexTypeAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Group__5__Impl"


    // $ANTLR start "rule__ComplexType__Group_2__0"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1056:1: rule__ComplexType__Group_2__0 : rule__ComplexType__Group_2__0__Impl rule__ComplexType__Group_2__1 ;
    public final void rule__ComplexType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1060:1: ( rule__ComplexType__Group_2__0__Impl rule__ComplexType__Group_2__1 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1061:2: rule__ComplexType__Group_2__0__Impl rule__ComplexType__Group_2__1
            {
            pushFollow(FOLLOW_rule__ComplexType__Group_2__0__Impl_in_rule__ComplexType__Group_2__02089);
            rule__ComplexType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexType__Group_2__1_in_rule__ComplexType__Group_2__02092);
            rule__ComplexType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Group_2__0"


    // $ANTLR start "rule__ComplexType__Group_2__0__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1068:1: rule__ComplexType__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__ComplexType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1072:1: ( ( 'extends' ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1073:1: ( 'extends' )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1073:1: ( 'extends' )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1074:1: 'extends'
            {
             before(grammarAccess.getComplexTypeAccess().getExtendsKeyword_2_0()); 
            match(input,19,FOLLOW_19_in_rule__ComplexType__Group_2__0__Impl2120); 
             after(grammarAccess.getComplexTypeAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Group_2__0__Impl"


    // $ANTLR start "rule__ComplexType__Group_2__1"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1087:1: rule__ComplexType__Group_2__1 : rule__ComplexType__Group_2__1__Impl ;
    public final void rule__ComplexType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1091:1: ( rule__ComplexType__Group_2__1__Impl )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1092:2: rule__ComplexType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ComplexType__Group_2__1__Impl_in_rule__ComplexType__Group_2__12151);
            rule__ComplexType__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Group_2__1"


    // $ANTLR start "rule__ComplexType__Group_2__1__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1098:1: rule__ComplexType__Group_2__1__Impl : ( ( rule__ComplexType__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__ComplexType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1102:1: ( ( ( rule__ComplexType__SuperTypeAssignment_2_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1103:1: ( ( rule__ComplexType__SuperTypeAssignment_2_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1103:1: ( ( rule__ComplexType__SuperTypeAssignment_2_1 ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1104:1: ( rule__ComplexType__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getComplexTypeAccess().getSuperTypeAssignment_2_1()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1105:1: ( rule__ComplexType__SuperTypeAssignment_2_1 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1105:2: rule__ComplexType__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ComplexType__SuperTypeAssignment_2_1_in_rule__ComplexType__Group_2__1__Impl2178);
            rule__ComplexType__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getComplexTypeAccess().getSuperTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Group_2__1__Impl"


    // $ANTLR start "rule__ComplexType__Group_4__0"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1119:1: rule__ComplexType__Group_4__0 : rule__ComplexType__Group_4__0__Impl rule__ComplexType__Group_4__1 ;
    public final void rule__ComplexType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1123:1: ( rule__ComplexType__Group_4__0__Impl rule__ComplexType__Group_4__1 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1124:2: rule__ComplexType__Group_4__0__Impl rule__ComplexType__Group_4__1
            {
            pushFollow(FOLLOW_rule__ComplexType__Group_4__0__Impl_in_rule__ComplexType__Group_4__02212);
            rule__ComplexType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexType__Group_4__1_in_rule__ComplexType__Group_4__02215);
            rule__ComplexType__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Group_4__0"


    // $ANTLR start "rule__ComplexType__Group_4__0__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1131:1: rule__ComplexType__Group_4__0__Impl : ( 'fields' ) ;
    public final void rule__ComplexType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1135:1: ( ( 'fields' ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1136:1: ( 'fields' )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1136:1: ( 'fields' )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1137:1: 'fields'
            {
             before(grammarAccess.getComplexTypeAccess().getFieldsKeyword_4_0()); 
            match(input,20,FOLLOW_20_in_rule__ComplexType__Group_4__0__Impl2243); 
             after(grammarAccess.getComplexTypeAccess().getFieldsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Group_4__0__Impl"


    // $ANTLR start "rule__ComplexType__Group_4__1"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1150:1: rule__ComplexType__Group_4__1 : rule__ComplexType__Group_4__1__Impl rule__ComplexType__Group_4__2 ;
    public final void rule__ComplexType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1154:1: ( rule__ComplexType__Group_4__1__Impl rule__ComplexType__Group_4__2 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1155:2: rule__ComplexType__Group_4__1__Impl rule__ComplexType__Group_4__2
            {
            pushFollow(FOLLOW_rule__ComplexType__Group_4__1__Impl_in_rule__ComplexType__Group_4__12274);
            rule__ComplexType__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexType__Group_4__2_in_rule__ComplexType__Group_4__12277);
            rule__ComplexType__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Group_4__1"


    // $ANTLR start "rule__ComplexType__Group_4__1__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1162:1: rule__ComplexType__Group_4__1__Impl : ( '{' ) ;
    public final void rule__ComplexType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1166:1: ( ( '{' ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1167:1: ( '{' )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1167:1: ( '{' )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1168:1: '{'
            {
             before(grammarAccess.getComplexTypeAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,14,FOLLOW_14_in_rule__ComplexType__Group_4__1__Impl2305); 
             after(grammarAccess.getComplexTypeAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Group_4__1__Impl"


    // $ANTLR start "rule__ComplexType__Group_4__2"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1181:1: rule__ComplexType__Group_4__2 : rule__ComplexType__Group_4__2__Impl rule__ComplexType__Group_4__3 ;
    public final void rule__ComplexType__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1185:1: ( rule__ComplexType__Group_4__2__Impl rule__ComplexType__Group_4__3 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1186:2: rule__ComplexType__Group_4__2__Impl rule__ComplexType__Group_4__3
            {
            pushFollow(FOLLOW_rule__ComplexType__Group_4__2__Impl_in_rule__ComplexType__Group_4__22336);
            rule__ComplexType__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexType__Group_4__3_in_rule__ComplexType__Group_4__22339);
            rule__ComplexType__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Group_4__2"


    // $ANTLR start "rule__ComplexType__Group_4__2__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1193:1: rule__ComplexType__Group_4__2__Impl : ( ( rule__ComplexType__FieldsAssignment_4_2 ) ) ;
    public final void rule__ComplexType__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1197:1: ( ( ( rule__ComplexType__FieldsAssignment_4_2 ) ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1198:1: ( ( rule__ComplexType__FieldsAssignment_4_2 ) )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1198:1: ( ( rule__ComplexType__FieldsAssignment_4_2 ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1199:1: ( rule__ComplexType__FieldsAssignment_4_2 )
            {
             before(grammarAccess.getComplexTypeAccess().getFieldsAssignment_4_2()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1200:1: ( rule__ComplexType__FieldsAssignment_4_2 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1200:2: rule__ComplexType__FieldsAssignment_4_2
            {
            pushFollow(FOLLOW_rule__ComplexType__FieldsAssignment_4_2_in_rule__ComplexType__Group_4__2__Impl2366);
            rule__ComplexType__FieldsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getComplexTypeAccess().getFieldsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Group_4__2__Impl"


    // $ANTLR start "rule__ComplexType__Group_4__3"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1210:1: rule__ComplexType__Group_4__3 : rule__ComplexType__Group_4__3__Impl rule__ComplexType__Group_4__4 ;
    public final void rule__ComplexType__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1214:1: ( rule__ComplexType__Group_4__3__Impl rule__ComplexType__Group_4__4 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1215:2: rule__ComplexType__Group_4__3__Impl rule__ComplexType__Group_4__4
            {
            pushFollow(FOLLOW_rule__ComplexType__Group_4__3__Impl_in_rule__ComplexType__Group_4__32396);
            rule__ComplexType__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexType__Group_4__4_in_rule__ComplexType__Group_4__32399);
            rule__ComplexType__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Group_4__3"


    // $ANTLR start "rule__ComplexType__Group_4__3__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1222:1: rule__ComplexType__Group_4__3__Impl : ( ( rule__ComplexType__Group_4_3__0 )* ) ;
    public final void rule__ComplexType__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1226:1: ( ( ( rule__ComplexType__Group_4_3__0 )* ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1227:1: ( ( rule__ComplexType__Group_4_3__0 )* )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1227:1: ( ( rule__ComplexType__Group_4_3__0 )* )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1228:1: ( rule__ComplexType__Group_4_3__0 )*
            {
             before(grammarAccess.getComplexTypeAccess().getGroup_4_3()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1229:1: ( rule__ComplexType__Group_4_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1229:2: rule__ComplexType__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ComplexType__Group_4_3__0_in_rule__ComplexType__Group_4__3__Impl2426);
            	    rule__ComplexType__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getComplexTypeAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Group_4__3__Impl"


    // $ANTLR start "rule__ComplexType__Group_4__4"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1239:1: rule__ComplexType__Group_4__4 : rule__ComplexType__Group_4__4__Impl ;
    public final void rule__ComplexType__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1243:1: ( rule__ComplexType__Group_4__4__Impl )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1244:2: rule__ComplexType__Group_4__4__Impl
            {
            pushFollow(FOLLOW_rule__ComplexType__Group_4__4__Impl_in_rule__ComplexType__Group_4__42457);
            rule__ComplexType__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Group_4__4"


    // $ANTLR start "rule__ComplexType__Group_4__4__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1250:1: rule__ComplexType__Group_4__4__Impl : ( '}' ) ;
    public final void rule__ComplexType__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1254:1: ( ( '}' ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1255:1: ( '}' )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1255:1: ( '}' )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1256:1: '}'
            {
             before(grammarAccess.getComplexTypeAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,15,FOLLOW_15_in_rule__ComplexType__Group_4__4__Impl2485); 
             after(grammarAccess.getComplexTypeAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Group_4__4__Impl"


    // $ANTLR start "rule__ComplexType__Group_4_3__0"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1279:1: rule__ComplexType__Group_4_3__0 : rule__ComplexType__Group_4_3__0__Impl rule__ComplexType__Group_4_3__1 ;
    public final void rule__ComplexType__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1283:1: ( rule__ComplexType__Group_4_3__0__Impl rule__ComplexType__Group_4_3__1 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1284:2: rule__ComplexType__Group_4_3__0__Impl rule__ComplexType__Group_4_3__1
            {
            pushFollow(FOLLOW_rule__ComplexType__Group_4_3__0__Impl_in_rule__ComplexType__Group_4_3__02526);
            rule__ComplexType__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexType__Group_4_3__1_in_rule__ComplexType__Group_4_3__02529);
            rule__ComplexType__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Group_4_3__0"


    // $ANTLR start "rule__ComplexType__Group_4_3__0__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1291:1: rule__ComplexType__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__ComplexType__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1295:1: ( ( ',' ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1296:1: ( ',' )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1296:1: ( ',' )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1297:1: ','
            {
             before(grammarAccess.getComplexTypeAccess().getCommaKeyword_4_3_0()); 
            match(input,21,FOLLOW_21_in_rule__ComplexType__Group_4_3__0__Impl2557); 
             after(grammarAccess.getComplexTypeAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Group_4_3__0__Impl"


    // $ANTLR start "rule__ComplexType__Group_4_3__1"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1310:1: rule__ComplexType__Group_4_3__1 : rule__ComplexType__Group_4_3__1__Impl ;
    public final void rule__ComplexType__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1314:1: ( rule__ComplexType__Group_4_3__1__Impl )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1315:2: rule__ComplexType__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ComplexType__Group_4_3__1__Impl_in_rule__ComplexType__Group_4_3__12588);
            rule__ComplexType__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Group_4_3__1"


    // $ANTLR start "rule__ComplexType__Group_4_3__1__Impl"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1321:1: rule__ComplexType__Group_4_3__1__Impl : ( ( rule__ComplexType__FieldsAssignment_4_3_1 ) ) ;
    public final void rule__ComplexType__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1325:1: ( ( ( rule__ComplexType__FieldsAssignment_4_3_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1326:1: ( ( rule__ComplexType__FieldsAssignment_4_3_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1326:1: ( ( rule__ComplexType__FieldsAssignment_4_3_1 ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1327:1: ( rule__ComplexType__FieldsAssignment_4_3_1 )
            {
             before(grammarAccess.getComplexTypeAccess().getFieldsAssignment_4_3_1()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1328:1: ( rule__ComplexType__FieldsAssignment_4_3_1 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1328:2: rule__ComplexType__FieldsAssignment_4_3_1
            {
            pushFollow(FOLLOW_rule__ComplexType__FieldsAssignment_4_3_1_in_rule__ComplexType__Group_4_3__1__Impl2615);
            rule__ComplexType__FieldsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComplexTypeAccess().getFieldsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Group_4_3__1__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1342:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1346:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1347:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__02649);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__02652);
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
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1354:1: rule__Field__Group__0__Impl : ( ( rule__Field__ManyAssignment_0 )? ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1358:1: ( ( ( rule__Field__ManyAssignment_0 )? ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1359:1: ( ( rule__Field__ManyAssignment_0 )? )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1359:1: ( ( rule__Field__ManyAssignment_0 )? )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1360:1: ( rule__Field__ManyAssignment_0 )?
            {
             before(grammarAccess.getFieldAccess().getManyAssignment_0()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1361:1: ( rule__Field__ManyAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1361:2: rule__Field__ManyAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Field__ManyAssignment_0_in_rule__Field__Group__0__Impl2679);
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
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1371:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1375:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1376:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__12710);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__12713);
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
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1383:1: rule__Field__Group__1__Impl : ( ( rule__Field__NameAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1387:1: ( ( ( rule__Field__NameAssignment_1 ) ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1388:1: ( ( rule__Field__NameAssignment_1 ) )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1388:1: ( ( rule__Field__NameAssignment_1 ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1389:1: ( rule__Field__NameAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_1()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1390:1: ( rule__Field__NameAssignment_1 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1390:2: rule__Field__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_1_in_rule__Field__Group__1__Impl2740);
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
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1400:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1404:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1405:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__22770);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__22773);
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
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1412:1: rule__Field__Group__2__Impl : ( ':' ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1416:1: ( ( ':' ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1417:1: ( ':' )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1417:1: ( ':' )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1418:1: ':'
            {
             before(grammarAccess.getFieldAccess().getColonKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__Field__Group__2__Impl2801); 
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
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1431:1: rule__Field__Group__3 : rule__Field__Group__3__Impl ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1435:1: ( rule__Field__Group__3__Impl )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1436:2: rule__Field__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__32832);
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
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1442:1: rule__Field__Group__3__Impl : ( ( rule__Field__TypeAssignment_3 ) ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1446:1: ( ( ( rule__Field__TypeAssignment_3 ) ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1447:1: ( ( rule__Field__TypeAssignment_3 ) )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1447:1: ( ( rule__Field__TypeAssignment_3 ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1448:1: ( rule__Field__TypeAssignment_3 )
            {
             before(grammarAccess.getFieldAccess().getTypeAssignment_3()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1449:1: ( rule__Field__TypeAssignment_3 )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1449:2: rule__Field__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Field__TypeAssignment_3_in_rule__Field__Group__3__Impl2859);
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


    // $ANTLR start "rule__TypeModel__ElementsAssignment"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1468:1: rule__TypeModel__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__TypeModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1472:1: ( ( ruleAbstractElement ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1473:1: ( ruleAbstractElement )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1473:1: ( ruleAbstractElement )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1474:1: ruleAbstractElement
            {
             before(grammarAccess.getTypeModelAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__TypeModel__ElementsAssignment2902);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getTypeModelAccess().getElementsAbstractElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeModel__ElementsAssignment"


    // $ANTLR start "rule__DataTypeLibrary__NameAssignment_1"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1483:1: rule__DataTypeLibrary__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__DataTypeLibrary__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1487:1: ( ( ruleQualifiedName ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1488:1: ( ruleQualifiedName )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1488:1: ( ruleQualifiedName )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1489:1: ruleQualifiedName
            {
             before(grammarAccess.getDataTypeLibraryAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__DataTypeLibrary__NameAssignment_12933);
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
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1498:1: rule__DataTypeLibrary__ElementsAssignment_3 : ( ruleAbstractElement ) ;
    public final void rule__DataTypeLibrary__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1502:1: ( ( ruleAbstractElement ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1503:1: ( ruleAbstractElement )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1503:1: ( ruleAbstractElement )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1504:1: ruleAbstractElement
            {
             before(grammarAccess.getDataTypeLibraryAccess().getElementsAbstractElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__DataTypeLibrary__ElementsAssignment_32964);
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
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1513:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1517:1: ( ( ruleQualifiedNameWithWildcard ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1518:1: ( ruleQualifiedNameWithWildcard )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1518:1: ( ruleQualifiedNameWithWildcard )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1519:1: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_12995);
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
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1528:1: rule__SimpleType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SimpleType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1532:1: ( ( RULE_ID ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1533:1: ( RULE_ID )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1533:1: ( RULE_ID )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1534:1: RULE_ID
            {
             before(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleType__NameAssignment_13026); 
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


    // $ANTLR start "rule__ComplexType__NameAssignment_1"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1543:1: rule__ComplexType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ComplexType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1547:1: ( ( RULE_ID ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1548:1: ( RULE_ID )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1548:1: ( RULE_ID )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1549:1: RULE_ID
            {
             before(grammarAccess.getComplexTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ComplexType__NameAssignment_13057); 
             after(grammarAccess.getComplexTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__NameAssignment_1"


    // $ANTLR start "rule__ComplexType__SuperTypeAssignment_2_1"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1558:1: rule__ComplexType__SuperTypeAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ComplexType__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1562:1: ( ( ( ruleQualifiedName ) ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1563:1: ( ( ruleQualifiedName ) )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1563:1: ( ( ruleQualifiedName ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1564:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getComplexTypeAccess().getSuperTypeComplexTypeCrossReference_2_1_0()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1565:1: ( ruleQualifiedName )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1566:1: ruleQualifiedName
            {
             before(grammarAccess.getComplexTypeAccess().getSuperTypeComplexTypeQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ComplexType__SuperTypeAssignment_2_13092);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getComplexTypeAccess().getSuperTypeComplexTypeQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getComplexTypeAccess().getSuperTypeComplexTypeCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__ComplexType__FieldsAssignment_4_2"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1577:1: rule__ComplexType__FieldsAssignment_4_2 : ( ruleField ) ;
    public final void rule__ComplexType__FieldsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1581:1: ( ( ruleField ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1582:1: ( ruleField )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1582:1: ( ruleField )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1583:1: ruleField
            {
             before(grammarAccess.getComplexTypeAccess().getFieldsFieldParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__ComplexType__FieldsAssignment_4_23127);
            ruleField();

            state._fsp--;

             after(grammarAccess.getComplexTypeAccess().getFieldsFieldParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__FieldsAssignment_4_2"


    // $ANTLR start "rule__ComplexType__FieldsAssignment_4_3_1"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1592:1: rule__ComplexType__FieldsAssignment_4_3_1 : ( ruleField ) ;
    public final void rule__ComplexType__FieldsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1596:1: ( ( ruleField ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1597:1: ( ruleField )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1597:1: ( ruleField )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1598:1: ruleField
            {
             before(grammarAccess.getComplexTypeAccess().getFieldsFieldParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__ComplexType__FieldsAssignment_4_3_13158);
            ruleField();

            state._fsp--;

             after(grammarAccess.getComplexTypeAccess().getFieldsFieldParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__FieldsAssignment_4_3_1"


    // $ANTLR start "rule__Field__ManyAssignment_0"
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1607:1: rule__Field__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Field__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1611:1: ( ( ( 'many' ) ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1612:1: ( ( 'many' ) )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1612:1: ( ( 'many' ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1613:1: ( 'many' )
            {
             before(grammarAccess.getFieldAccess().getManyManyKeyword_0_0()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1614:1: ( 'many' )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1615:1: 'many'
            {
             before(grammarAccess.getFieldAccess().getManyManyKeyword_0_0()); 
            match(input,23,FOLLOW_23_in_rule__Field__ManyAssignment_03194); 
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
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1630:1: rule__Field__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1634:1: ( ( RULE_ID ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1635:1: ( RULE_ID )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1635:1: ( RULE_ID )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1636:1: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__NameAssignment_13233); 
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
    // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1645:1: rule__Field__TypeAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Field__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1649:1: ( ( ( ruleQualifiedName ) ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1650:1: ( ( ruleQualifiedName ) )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1650:1: ( ( ruleQualifiedName ) )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1651:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getFieldAccess().getTypeDataTypeCrossReference_3_0()); 
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1652:1: ( ruleQualifiedName )
            // ../be.kuleuven.rodinia.dsl.datatypes.ui/src-gen/be/kuleuven/rodinia/dsl/datatypes/ui/contentassist/antlr/internal/InternalDatatypes.g:1653:1: ruleQualifiedName
            {
             before(grammarAccess.getFieldAccess().getTypeDataTypeQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Field__TypeAssignment_33268);
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


 

    public static final BitSet FOLLOW_ruleTypeModel_in_entryRuleTypeModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeModel__ElementsAssignment_in_ruleTypeModel94 = new BitSet(new long[]{0x0000000000072002L});
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
    public static final BitSet FOLLOW_ruleComplexType_in_entryRuleComplexType542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexType549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__Group__0_in_ruleComplexType575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0_in_ruleField635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeLibrary_in_rule__AbstractElement__Alternatives671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__AbstractElement__Alternatives688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__AbstractElement__Alternatives705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_rule__DataType__Alternatives737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexType_in_rule__DataType__Alternatives754 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_rule__ComplexType__Group__0__Impl_in_rule__ComplexType__Group__01712 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ComplexType__Group__1_in_rule__ComplexType__Group__01715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ComplexType__Group__0__Impl1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__Group__1__Impl_in_rule__ComplexType__Group__11774 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_rule__ComplexType__Group__2_in_rule__ComplexType__Group__11777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__NameAssignment_1_in_rule__ComplexType__Group__1__Impl1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__Group__2__Impl_in_rule__ComplexType__Group__21834 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_rule__ComplexType__Group__3_in_rule__ComplexType__Group__21837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__Group_2__0_in_rule__ComplexType__Group__2__Impl1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__Group__3__Impl_in_rule__ComplexType__Group__31895 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_rule__ComplexType__Group__4_in_rule__ComplexType__Group__31898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ComplexType__Group__3__Impl1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__Group__4__Impl_in_rule__ComplexType__Group__41957 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_rule__ComplexType__Group__5_in_rule__ComplexType__Group__41960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__Group_4__0_in_rule__ComplexType__Group__4__Impl1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__Group__5__Impl_in_rule__ComplexType__Group__52018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ComplexType__Group__5__Impl2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__Group_2__0__Impl_in_rule__ComplexType__Group_2__02089 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ComplexType__Group_2__1_in_rule__ComplexType__Group_2__02092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ComplexType__Group_2__0__Impl2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__Group_2__1__Impl_in_rule__ComplexType__Group_2__12151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__SuperTypeAssignment_2_1_in_rule__ComplexType__Group_2__1__Impl2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__Group_4__0__Impl_in_rule__ComplexType__Group_4__02212 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ComplexType__Group_4__1_in_rule__ComplexType__Group_4__02215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ComplexType__Group_4__0__Impl2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__Group_4__1__Impl_in_rule__ComplexType__Group_4__12274 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__ComplexType__Group_4__2_in_rule__ComplexType__Group_4__12277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ComplexType__Group_4__1__Impl2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__Group_4__2__Impl_in_rule__ComplexType__Group_4__22336 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_rule__ComplexType__Group_4__3_in_rule__ComplexType__Group_4__22339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__FieldsAssignment_4_2_in_rule__ComplexType__Group_4__2__Impl2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__Group_4__3__Impl_in_rule__ComplexType__Group_4__32396 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_rule__ComplexType__Group_4__4_in_rule__ComplexType__Group_4__32399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__Group_4_3__0_in_rule__ComplexType__Group_4__3__Impl2426 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__ComplexType__Group_4__4__Impl_in_rule__ComplexType__Group_4__42457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ComplexType__Group_4__4__Impl2485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__Group_4_3__0__Impl_in_rule__ComplexType__Group_4_3__02526 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__ComplexType__Group_4_3__1_in_rule__ComplexType__Group_4_3__02529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ComplexType__Group_4_3__0__Impl2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__Group_4_3__1__Impl_in_rule__ComplexType__Group_4_3__12588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexType__FieldsAssignment_4_3_1_in_rule__ComplexType__Group_4_3__1__Impl2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__02649 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__02652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__ManyAssignment_0_in_rule__Field__Group__0__Impl2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__12710 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__12713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_1_in_rule__Field__Group__1__Impl2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__22770 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__22773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Field__Group__2__Impl2801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__32832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__TypeAssignment_3_in_rule__Field__Group__3__Impl2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__TypeModel__ElementsAssignment2902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__DataTypeLibrary__NameAssignment_12933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__DataTypeLibrary__ElementsAssignment_32964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_12995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleType__NameAssignment_13026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ComplexType__NameAssignment_13057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ComplexType__SuperTypeAssignment_2_13092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__ComplexType__FieldsAssignment_4_23127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__ComplexType__FieldsAssignment_4_3_13158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Field__ManyAssignment_03194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__NameAssignment_13233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Field__TypeAssignment_33268 = new BitSet(new long[]{0x0000000000000002L});

}