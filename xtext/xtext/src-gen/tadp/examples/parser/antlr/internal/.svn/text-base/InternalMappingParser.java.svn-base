package tadp.examples.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import tadp.examples.services.MappingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMappingParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'entity'", "'table:'", "'{'", "'}'", "'property'", "'type:'", "'column:'", "'String'", "'Date'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalMappingParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g"; }



     	private MappingGrammarAccess grammarAccess;
     	
        public InternalMappingParser(TokenStream input, IAstFactory factory, MappingGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("tadp/examples/parser/antlr/internal/InternalMapping.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Mapping";	
       	}
       	
       	@Override
       	protected MappingGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleMapping
    // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:77:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:78:2: (iv_ruleMapping= ruleMapping EOF )
            // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:79:2: iv_ruleMapping= ruleMapping EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMappingRule(), currentNode); 
            pushFollow(FOLLOW_ruleMapping_in_entryRuleMapping75);
            iv_ruleMapping=ruleMapping();
            _fsp--;

             current =iv_ruleMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapping85); 

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
    // $ANTLR end entryRuleMapping


    // $ANTLR start ruleMapping
    // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:86:1: ruleMapping returns [EObject current=null] : ( 'entity' ( (lv_name_1_0= RULE_ID ) ) ( 'table:' ( (lv_table_3_0= RULE_STRING ) ) )? '{' ( (lv_properties_5_0= ruleProperty ) )* '}' ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_table_3_0=null;
        EObject lv_properties_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:91:6: ( ( 'entity' ( (lv_name_1_0= RULE_ID ) ) ( 'table:' ( (lv_table_3_0= RULE_STRING ) ) )? '{' ( (lv_properties_5_0= ruleProperty ) )* '}' ) )
            // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:92:1: ( 'entity' ( (lv_name_1_0= RULE_ID ) ) ( 'table:' ( (lv_table_3_0= RULE_STRING ) ) )? '{' ( (lv_properties_5_0= ruleProperty ) )* '}' )
            {
            // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:92:1: ( 'entity' ( (lv_name_1_0= RULE_ID ) ) ( 'table:' ( (lv_table_3_0= RULE_STRING ) ) )? '{' ( (lv_properties_5_0= ruleProperty ) )* '}' )
            // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:92:3: 'entity' ( (lv_name_1_0= RULE_ID ) ) ( 'table:' ( (lv_table_3_0= RULE_STRING ) ) )? '{' ( (lv_properties_5_0= ruleProperty ) )* '}'
            {
            match(input,11,FOLLOW_11_in_ruleMapping120); 

                    createLeafNode(grammarAccess.getMappingAccess().getEntityKeyword_0(), null); 
                
            // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:96:1: ( (lv_name_1_0= RULE_ID ) )
            // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:97:1: (lv_name_1_0= RULE_ID )
            {
            // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:97:1: (lv_name_1_0= RULE_ID )
            // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:98:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapping137); 

            			createLeafNode(grammarAccess.getMappingAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMappingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:120:2: ( 'table:' ( (lv_table_3_0= RULE_STRING ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:120:4: 'table:' ( (lv_table_3_0= RULE_STRING ) )
                    {
                    match(input,12,FOLLOW_12_in_ruleMapping153); 

                            createLeafNode(grammarAccess.getMappingAccess().getTableKeyword_2_0(), null); 
                        
                    // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:124:1: ( (lv_table_3_0= RULE_STRING ) )
                    // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:125:1: (lv_table_3_0= RULE_STRING )
                    {
                    // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:125:1: (lv_table_3_0= RULE_STRING )
                    // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:126:3: lv_table_3_0= RULE_STRING
                    {
                    lv_table_3_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMapping170); 

                    			createLeafNode(grammarAccess.getMappingAccess().getTableSTRINGTerminalRuleCall_2_1_0(), "table"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMappingRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"table",
                    	        		lv_table_3_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_ruleMapping187); 

                    createLeafNode(grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:152:1: ( (lv_properties_5_0= ruleProperty ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:153:1: (lv_properties_5_0= ruleProperty )
            	    {
            	    // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:153:1: (lv_properties_5_0= ruleProperty )
            	    // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:154:3: lv_properties_5_0= ruleProperty
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getMappingAccess().getPropertiesPropertyParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_ruleMapping208);
            	    lv_properties_5_0=ruleProperty();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getMappingRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"properties",
            	    	        		lv_properties_5_0, 
            	    	        		"Property", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_ruleMapping219); 

                    createLeafNode(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMapping


    // $ANTLR start entryRuleProperty
    // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:188:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:189:2: (iv_ruleProperty= ruleProperty EOF )
            // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:190:2: iv_ruleProperty= ruleProperty EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPropertyRule(), currentNode); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty255);
            iv_ruleProperty=ruleProperty();
            _fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty265); 

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
    // $ANTLR end entryRuleProperty


    // $ANTLR start ruleProperty
    // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:197:1: ruleProperty returns [EObject current=null] : ( 'property' ( (lv_name_1_0= RULE_ID ) ) ( 'type:' ( (lv_type_3_0= ruleType ) ) )? ( 'column:' ( (lv_column_5_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_column_5_0=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:202:6: ( ( 'property' ( (lv_name_1_0= RULE_ID ) ) ( 'type:' ( (lv_type_3_0= ruleType ) ) )? ( 'column:' ( (lv_column_5_0= RULE_STRING ) ) )? ) )
            // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:203:1: ( 'property' ( (lv_name_1_0= RULE_ID ) ) ( 'type:' ( (lv_type_3_0= ruleType ) ) )? ( 'column:' ( (lv_column_5_0= RULE_STRING ) ) )? )
            {
            // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:203:1: ( 'property' ( (lv_name_1_0= RULE_ID ) ) ( 'type:' ( (lv_type_3_0= ruleType ) ) )? ( 'column:' ( (lv_column_5_0= RULE_STRING ) ) )? )
            // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:203:3: 'property' ( (lv_name_1_0= RULE_ID ) ) ( 'type:' ( (lv_type_3_0= ruleType ) ) )? ( 'column:' ( (lv_column_5_0= RULE_STRING ) ) )?
            {
            match(input,15,FOLLOW_15_in_ruleProperty300); 

                    createLeafNode(grammarAccess.getPropertyAccess().getPropertyKeyword_0(), null); 
                
            // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:207:1: ( (lv_name_1_0= RULE_ID ) )
            // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:208:1: (lv_name_1_0= RULE_ID )
            {
            // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:208:1: (lv_name_1_0= RULE_ID )
            // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:209:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty317); 

            			createLeafNode(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPropertyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:231:2: ( 'type:' ( (lv_type_3_0= ruleType ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:231:4: 'type:' ( (lv_type_3_0= ruleType ) )
                    {
                    match(input,16,FOLLOW_16_in_ruleProperty333); 

                            createLeafNode(grammarAccess.getPropertyAccess().getTypeKeyword_2_0(), null); 
                        
                    // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:235:1: ( (lv_type_3_0= ruleType ) )
                    // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:236:1: (lv_type_3_0= ruleType )
                    {
                    // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:236:1: (lv_type_3_0= ruleType )
                    // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:237:3: lv_type_3_0= ruleType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPropertyAccess().getTypeTypeParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleProperty354);
                    lv_type_3_0=ruleType();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"type",
                    	        		lv_type_3_0, 
                    	        		"Type", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:259:4: ( 'column:' ( (lv_column_5_0= RULE_STRING ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:259:6: 'column:' ( (lv_column_5_0= RULE_STRING ) )
                    {
                    match(input,17,FOLLOW_17_in_ruleProperty367); 

                            createLeafNode(grammarAccess.getPropertyAccess().getColumnKeyword_3_0(), null); 
                        
                    // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:263:1: ( (lv_column_5_0= RULE_STRING ) )
                    // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:264:1: (lv_column_5_0= RULE_STRING )
                    {
                    // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:264:1: (lv_column_5_0= RULE_STRING )
                    // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:265:3: lv_column_5_0= RULE_STRING
                    {
                    lv_column_5_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProperty384); 

                    			createLeafNode(grammarAccess.getPropertyAccess().getColumnSTRINGTerminalRuleCall_3_1_0(), "column"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPropertyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"column",
                    	        		lv_column_5_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleProperty


    // $ANTLR start entryRuleType
    // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:295:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:296:2: (iv_ruleType= ruleType EOF )
            // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:297:2: iv_ruleType= ruleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType428);
            iv_ruleType=ruleType();
            _fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType439); 

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
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:304:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'String' | kw= 'Date' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:309:6: ( (kw= 'String' | kw= 'Date' ) )
            // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:310:1: (kw= 'String' | kw= 'Date' )
            {
            // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:310:1: (kw= 'String' | kw= 'Date' )
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
                    new NoViableAltException("310:1: (kw= 'String' | kw= 'Date' )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:311:2: kw= 'String'
                    {
                    kw=(Token)input.LT(1);
                    match(input,18,FOLLOW_18_in_ruleType477); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getTypeAccess().getStringKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g:318:2: kw= 'Date'
                    {
                    kw=(Token)input.LT(1);
                    match(input,19,FOLLOW_19_in_ruleType496); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getTypeAccess().getDateKeyword_1(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleType


 

    public static final BitSet FOLLOW_ruleMapping_in_entryRuleMapping75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleMapping120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapping137 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleMapping153 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMapping170 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMapping187 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleMapping208 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleMapping219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleProperty300 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty317 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_16_in_ruleProperty333 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_ruleType_in_ruleProperty354 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleProperty367 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProperty384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleType477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleType496 = new BitSet(new long[]{0x0000000000000002L});

}