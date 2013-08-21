package be.kuleuven.rodinia.dsl.datatypes.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import be.kuleuven.rodinia.dsl.datatypes.services.DatatypesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDatatypesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'.*'", "'DataTypeLibrary'", "'{'", "'}'", "'import'", "'SimpleType'", "'ComplexType'", "'extends'", "'fields'", "','", "'many'", "':'"
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
    public String getGrammarFileName() { return "../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g"; }



     	private DatatypesGrammarAccess grammarAccess;
     	
        public InternalDatatypesParser(TokenStream input, DatatypesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "TypeModel";	
       	}
       	
       	@Override
       	protected DatatypesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleTypeModel"
    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:67:1: entryRuleTypeModel returns [EObject current=null] : iv_ruleTypeModel= ruleTypeModel EOF ;
    public final EObject entryRuleTypeModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeModel = null;


        try {
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:68:2: (iv_ruleTypeModel= ruleTypeModel EOF )
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:69:2: iv_ruleTypeModel= ruleTypeModel EOF
            {
             newCompositeNode(grammarAccess.getTypeModelRule()); 
            pushFollow(FOLLOW_ruleTypeModel_in_entryRuleTypeModel75);
            iv_ruleTypeModel=ruleTypeModel();

            state._fsp--;

             current =iv_ruleTypeModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeModel85); 

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
    // $ANTLR end "entryRuleTypeModel"


    // $ANTLR start "ruleTypeModel"
    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:76:1: ruleTypeModel returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleTypeModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:79:28: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:80:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:80:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||(LA1_0>=16 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:81:1: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:81:1: (lv_elements_0_0= ruleAbstractElement )
            	    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:82:3: lv_elements_0_0= ruleAbstractElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTypeModelAccess().getElementsAbstractElementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleTypeModel130);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTypeModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_0_0, 
            	            		"AbstractElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleTypeModel"


    // $ANTLR start "entryRuleQualifiedName"
    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:106:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:107:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:108:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName167);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName178); 

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
    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:115:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:118:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:119:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:119:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:119:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName218); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:126:1: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:127:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,11,FOLLOW_11_in_ruleQualifiedName237); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName252); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop2;
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


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:147:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:148:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:149:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard300);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard311); 

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:156:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:159:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:160:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:160:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:161:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard358);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:171:1: (kw= '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:172:2: kw= '.*'
                    {
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleQualifiedNameWithWildcard377); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                        

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleAbstractElement"
    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:185:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:186:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:187:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement419);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement429); 

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:194:1: ruleAbstractElement returns [EObject current=null] : (this_DataTypeLibrary_0= ruleDataTypeLibrary | this_DataType_1= ruleDataType | this_Import_2= ruleImport ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_DataTypeLibrary_0 = null;

        EObject this_DataType_1 = null;

        EObject this_Import_2 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:197:28: ( (this_DataTypeLibrary_0= ruleDataTypeLibrary | this_DataType_1= ruleDataType | this_Import_2= ruleImport ) )
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:198:1: (this_DataTypeLibrary_0= ruleDataTypeLibrary | this_DataType_1= ruleDataType | this_Import_2= ruleImport )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:198:1: (this_DataTypeLibrary_0= ruleDataTypeLibrary | this_DataType_1= ruleDataType | this_Import_2= ruleImport )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 17:
            case 18:
                {
                alt4=2;
                }
                break;
            case 16:
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
                    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:199:5: this_DataTypeLibrary_0= ruleDataTypeLibrary
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getDataTypeLibraryParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDataTypeLibrary_in_ruleAbstractElement476);
                    this_DataTypeLibrary_0=ruleDataTypeLibrary();

                    state._fsp--;

                     
                            current = this_DataTypeLibrary_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:209:5: this_DataType_1= ruleDataType
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getDataTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDataType_in_ruleAbstractElement503);
                    this_DataType_1=ruleDataType();

                    state._fsp--;

                     
                            current = this_DataType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:219:5: this_Import_2= ruleImport
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleImport_in_ruleAbstractElement530);
                    this_Import_2=ruleImport();

                    state._fsp--;

                     
                            current = this_Import_2; 
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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleDataTypeLibrary"
    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:235:1: entryRuleDataTypeLibrary returns [EObject current=null] : iv_ruleDataTypeLibrary= ruleDataTypeLibrary EOF ;
    public final EObject entryRuleDataTypeLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeLibrary = null;


        try {
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:236:2: (iv_ruleDataTypeLibrary= ruleDataTypeLibrary EOF )
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:237:2: iv_ruleDataTypeLibrary= ruleDataTypeLibrary EOF
            {
             newCompositeNode(grammarAccess.getDataTypeLibraryRule()); 
            pushFollow(FOLLOW_ruleDataTypeLibrary_in_entryRuleDataTypeLibrary565);
            iv_ruleDataTypeLibrary=ruleDataTypeLibrary();

            state._fsp--;

             current =iv_ruleDataTypeLibrary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeLibrary575); 

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
    // $ANTLR end "entryRuleDataTypeLibrary"


    // $ANTLR start "ruleDataTypeLibrary"
    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:244:1: ruleDataTypeLibrary returns [EObject current=null] : (otherlv_0= 'DataTypeLibrary' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleDataTypeLibrary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:247:28: ( (otherlv_0= 'DataTypeLibrary' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) )
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:248:1: (otherlv_0= 'DataTypeLibrary' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:248:1: (otherlv_0= 'DataTypeLibrary' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:248:3: otherlv_0= 'DataTypeLibrary' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleDataTypeLibrary612); 

                	newLeafNode(otherlv_0, grammarAccess.getDataTypeLibraryAccess().getDataTypeLibraryKeyword_0());
                
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:252:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:253:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:253:1: (lv_name_1_0= ruleQualifiedName )
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:254:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getDataTypeLibraryAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDataTypeLibrary633);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataTypeLibraryRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleDataTypeLibrary645); 

                	newLeafNode(otherlv_2, grammarAccess.getDataTypeLibraryAccess().getLeftCurlyBracketKeyword_2());
                
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:274:1: ( (lv_elements_3_0= ruleAbstractElement ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13||(LA5_0>=16 && LA5_0<=18)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:275:1: (lv_elements_3_0= ruleAbstractElement )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:275:1: (lv_elements_3_0= ruleAbstractElement )
            	    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:276:3: lv_elements_3_0= ruleAbstractElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDataTypeLibraryAccess().getElementsAbstractElementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleDataTypeLibrary666);
            	    lv_elements_3_0=ruleAbstractElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDataTypeLibraryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_3_0, 
            	            		"AbstractElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleDataTypeLibrary679); 

                	newLeafNode(otherlv_4, grammarAccess.getDataTypeLibraryAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleDataTypeLibrary"


    // $ANTLR start "entryRuleImport"
    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:304:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:305:2: (iv_ruleImport= ruleImport EOF )
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:306:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport715);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport725); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:313:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:316:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:317:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:317:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:317:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleImport762); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:321:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:322:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:322:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:323:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport783);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"QualifiedNameWithWildcard");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleDataType"
    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:347:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:348:2: (iv_ruleDataType= ruleDataType EOF )
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:349:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType819);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType829); 

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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:356:1: ruleDataType returns [EObject current=null] : (this_SimpleType_0= ruleSimpleType | this_ComplexType_1= ruleComplexType ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleType_0 = null;

        EObject this_ComplexType_1 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:359:28: ( (this_SimpleType_0= ruleSimpleType | this_ComplexType_1= ruleComplexType ) )
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:360:1: (this_SimpleType_0= ruleSimpleType | this_ComplexType_1= ruleComplexType )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:360:1: (this_SimpleType_0= ruleSimpleType | this_ComplexType_1= ruleComplexType )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:361:5: this_SimpleType_0= ruleSimpleType
                    {
                     
                            newCompositeNode(grammarAccess.getDataTypeAccess().getSimpleTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleType_in_ruleDataType876);
                    this_SimpleType_0=ruleSimpleType();

                    state._fsp--;

                     
                            current = this_SimpleType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:371:5: this_ComplexType_1= ruleComplexType
                    {
                     
                            newCompositeNode(grammarAccess.getDataTypeAccess().getComplexTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleComplexType_in_ruleDataType903);
                    this_ComplexType_1=ruleComplexType();

                    state._fsp--;

                     
                            current = this_ComplexType_1; 
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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleSimpleType"
    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:387:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:388:2: (iv_ruleSimpleType= ruleSimpleType EOF )
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:389:2: iv_ruleSimpleType= ruleSimpleType EOF
            {
             newCompositeNode(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType938);
            iv_ruleSimpleType=ruleSimpleType();

            state._fsp--;

             current =iv_ruleSimpleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType948); 

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
    // $ANTLR end "entryRuleSimpleType"


    // $ANTLR start "ruleSimpleType"
    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:396:1: ruleSimpleType returns [EObject current=null] : (otherlv_0= 'SimpleType' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSimpleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:399:28: ( (otherlv_0= 'SimpleType' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:400:1: (otherlv_0= 'SimpleType' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:400:1: (otherlv_0= 'SimpleType' ( (lv_name_1_0= RULE_ID ) ) )
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:400:3: otherlv_0= 'SimpleType' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleSimpleType985); 

                	newLeafNode(otherlv_0, grammarAccess.getSimpleTypeAccess().getSimpleTypeKeyword_0());
                
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:404:1: ( (lv_name_1_0= RULE_ID ) )
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:405:1: (lv_name_1_0= RULE_ID )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:405:1: (lv_name_1_0= RULE_ID )
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:406:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleType1002); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


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
    // $ANTLR end "ruleSimpleType"


    // $ANTLR start "entryRuleComplexType"
    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:430:1: entryRuleComplexType returns [EObject current=null] : iv_ruleComplexType= ruleComplexType EOF ;
    public final EObject entryRuleComplexType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexType = null;


        try {
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:431:2: (iv_ruleComplexType= ruleComplexType EOF )
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:432:2: iv_ruleComplexType= ruleComplexType EOF
            {
             newCompositeNode(grammarAccess.getComplexTypeRule()); 
            pushFollow(FOLLOW_ruleComplexType_in_entryRuleComplexType1043);
            iv_ruleComplexType=ruleComplexType();

            state._fsp--;

             current =iv_ruleComplexType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexType1053); 

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
    // $ANTLR end "entryRuleComplexType"


    // $ANTLR start "ruleComplexType"
    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:439:1: ruleComplexType returns [EObject current=null] : (otherlv_0= 'ComplexType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' (otherlv_5= 'fields' otherlv_6= '{' ( (lv_fields_7_0= ruleField ) ) (otherlv_8= ',' ( (lv_fields_9_0= ruleField ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleComplexType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_fields_7_0 = null;

        EObject lv_fields_9_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:442:28: ( (otherlv_0= 'ComplexType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' (otherlv_5= 'fields' otherlv_6= '{' ( (lv_fields_7_0= ruleField ) ) (otherlv_8= ',' ( (lv_fields_9_0= ruleField ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:443:1: (otherlv_0= 'ComplexType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' (otherlv_5= 'fields' otherlv_6= '{' ( (lv_fields_7_0= ruleField ) ) (otherlv_8= ',' ( (lv_fields_9_0= ruleField ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:443:1: (otherlv_0= 'ComplexType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' (otherlv_5= 'fields' otherlv_6= '{' ( (lv_fields_7_0= ruleField ) ) (otherlv_8= ',' ( (lv_fields_9_0= ruleField ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:443:3: otherlv_0= 'ComplexType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' (otherlv_5= 'fields' otherlv_6= '{' ( (lv_fields_7_0= ruleField ) ) (otherlv_8= ',' ( (lv_fields_9_0= ruleField ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleComplexType1090); 

                	newLeafNode(otherlv_0, grammarAccess.getComplexTypeAccess().getComplexTypeKeyword_0());
                
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:447:1: ( (lv_name_1_0= RULE_ID ) )
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:448:1: (lv_name_1_0= RULE_ID )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:448:1: (lv_name_1_0= RULE_ID )
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:449:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComplexType1107); 

            			newLeafNode(lv_name_1_0, grammarAccess.getComplexTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComplexTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:465:2: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:465:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleComplexType1125); 

                        	newLeafNode(otherlv_2, grammarAccess.getComplexTypeAccess().getExtendsKeyword_2_0());
                        
                    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:469:1: ( ( ruleQualifiedName ) )
                    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:470:1: ( ruleQualifiedName )
                    {
                    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:470:1: ( ruleQualifiedName )
                    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:471:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getComplexTypeRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getComplexTypeAccess().getSuperTypeComplexTypeCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleComplexType1148);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleComplexType1162); 

                	newLeafNode(otherlv_4, grammarAccess.getComplexTypeAccess().getLeftCurlyBracketKeyword_3());
                
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:488:1: (otherlv_5= 'fields' otherlv_6= '{' ( (lv_fields_7_0= ruleField ) ) (otherlv_8= ',' ( (lv_fields_9_0= ruleField ) ) )* otherlv_10= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:488:3: otherlv_5= 'fields' otherlv_6= '{' ( (lv_fields_7_0= ruleField ) ) (otherlv_8= ',' ( (lv_fields_9_0= ruleField ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleComplexType1175); 

                        	newLeafNode(otherlv_5, grammarAccess.getComplexTypeAccess().getFieldsKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleComplexType1187); 

                        	newLeafNode(otherlv_6, grammarAccess.getComplexTypeAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:496:1: ( (lv_fields_7_0= ruleField ) )
                    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:497:1: (lv_fields_7_0= ruleField )
                    {
                    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:497:1: (lv_fields_7_0= ruleField )
                    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:498:3: lv_fields_7_0= ruleField
                    {
                     
                    	        newCompositeNode(grammarAccess.getComplexTypeAccess().getFieldsFieldParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleField_in_ruleComplexType1208);
                    lv_fields_7_0=ruleField();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComplexTypeRule());
                    	        }
                           		add(
                           			current, 
                           			"fields",
                            		lv_fields_7_0, 
                            		"Field");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:514:2: (otherlv_8= ',' ( (lv_fields_9_0= ruleField ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==21) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:514:4: otherlv_8= ',' ( (lv_fields_9_0= ruleField ) )
                    	    {
                    	    otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleComplexType1221); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getComplexTypeAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:518:1: ( (lv_fields_9_0= ruleField ) )
                    	    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:519:1: (lv_fields_9_0= ruleField )
                    	    {
                    	    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:519:1: (lv_fields_9_0= ruleField )
                    	    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:520:3: lv_fields_9_0= ruleField
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getComplexTypeAccess().getFieldsFieldParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleField_in_ruleComplexType1242);
                    	    lv_fields_9_0=ruleField();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getComplexTypeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"fields",
                    	            		lv_fields_9_0, 
                    	            		"Field");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleComplexType1256); 

                        	newLeafNode(otherlv_10, grammarAccess.getComplexTypeAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleComplexType1270); 

                	newLeafNode(otherlv_11, grammarAccess.getComplexTypeAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleComplexType"


    // $ANTLR start "entryRuleField"
    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:552:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:553:2: (iv_ruleField= ruleField EOF )
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:554:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField1306);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField1316); 

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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:561:1: ruleField returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:564:28: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) ) )
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:565:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:565:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) )
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:565:2: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:565:2: ( (lv_many_0_0= 'many' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:566:1: (lv_many_0_0= 'many' )
                    {
                    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:566:1: (lv_many_0_0= 'many' )
                    // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:567:3: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,22,FOLLOW_22_in_ruleField1359); 

                            newLeafNode(lv_many_0_0, grammarAccess.getFieldAccess().getManyManyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldRule());
                    	        }
                           		setWithLastConsumed(current, "many", true, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:580:3: ( (lv_name_1_0= RULE_ID ) )
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:581:1: (lv_name_1_0= RULE_ID )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:581:1: (lv_name_1_0= RULE_ID )
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:582:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField1390); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleField1407); 

                	newLeafNode(otherlv_2, grammarAccess.getFieldAccess().getColonKeyword_2());
                
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:602:1: ( ( ruleQualifiedName ) )
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:603:1: ( ruleQualifiedName )
            {
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:603:1: ( ruleQualifiedName )
            // ../be.kuleuven.rodinia.dsl.datatypes/src-gen/be/kuleuven/rodinia/dsl/datatypes/parser/antlr/internal/InternalDatatypes.g:604:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getFieldAccess().getTypeDataTypeCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleField1430);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleField"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleTypeModel_in_entryRuleTypeModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleTypeModel130 = new BitSet(new long[]{0x0000000000072002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName218 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleQualifiedName237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName252 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard358 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleQualifiedNameWithWildcard377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeLibrary_in_ruleAbstractElement476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleAbstractElement503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleAbstractElement530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeLibrary_in_entryRuleDataTypeLibrary565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeLibrary575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleDataTypeLibrary612 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDataTypeLibrary633 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDataTypeLibrary645 = new BitSet(new long[]{0x000000000007A000L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleDataTypeLibrary666 = new BitSet(new long[]{0x000000000007A000L});
    public static final BitSet FOLLOW_15_in_ruleDataTypeLibrary679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleImport762 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_ruleDataType876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexType_in_ruleDataType903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType938 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSimpleType985 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleType1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexType_in_entryRuleComplexType1043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexType1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleComplexType1090 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComplexType1107 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_19_in_ruleComplexType1125 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleComplexType1148 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleComplexType1162 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_20_in_ruleComplexType1175 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleComplexType1187 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_ruleField_in_ruleComplexType1208 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_21_in_ruleComplexType1221 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_ruleField_in_ruleComplexType1242 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_15_in_ruleComplexType1256 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleComplexType1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField1306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleField1359 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField1390 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleField1407 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleField1430 = new BitSet(new long[]{0x0000000000000002L});

}