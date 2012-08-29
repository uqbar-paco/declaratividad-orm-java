package tadp.examples.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import tadp.examples.services.MappingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMappingParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'Date'", "'entity'", "'{'", "'}'", "'table:'", "'property'", "'type:'", "'column:'"
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
    public String getGrammarFileName() { return "../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g"; }


     
     	private MappingGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MappingGrammarAccess grammarAccess) {
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




    // $ANTLR start entryRuleMapping
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:61:1: entryRuleMapping : ruleMapping EOF ;
    public final void entryRuleMapping() throws RecognitionException {
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:62:1: ( ruleMapping EOF )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:63:1: ruleMapping EOF
            {
             before(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_ruleMapping_in_entryRuleMapping61);
            ruleMapping();
            _fsp--;

             after(grammarAccess.getMappingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapping68); 

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
    // $ANTLR end entryRuleMapping


    // $ANTLR start ruleMapping
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:70:1: ruleMapping : ( ( rule__Mapping__Group__0 ) ) ;
    public final void ruleMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:74:2: ( ( ( rule__Mapping__Group__0 ) ) )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:75:1: ( ( rule__Mapping__Group__0 ) )
            {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:75:1: ( ( rule__Mapping__Group__0 ) )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:76:1: ( rule__Mapping__Group__0 )
            {
             before(grammarAccess.getMappingAccess().getGroup()); 
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:77:1: ( rule__Mapping__Group__0 )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:77:2: rule__Mapping__Group__0
            {
            pushFollow(FOLLOW_rule__Mapping__Group__0_in_ruleMapping94);
            rule__Mapping__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMapping


    // $ANTLR start entryRuleProperty
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:89:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:90:1: ( ruleProperty EOF )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:91:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty121);
            ruleProperty();
            _fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty128); 

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
    // $ANTLR end entryRuleProperty


    // $ANTLR start ruleProperty
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:98:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:102:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:103:1: ( ( rule__Property__Group__0 ) )
            {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:103:1: ( ( rule__Property__Group__0 ) )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:104:1: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:105:1: ( rule__Property__Group__0 )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:105:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty154);
            rule__Property__Group__0();
            _fsp--;


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
    // $ANTLR end ruleProperty


    // $ANTLR start entryRuleType
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:117:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:118:1: ( ruleType EOF )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:119:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType181);
            ruleType();
            _fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType188); 

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
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:126:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:130:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:131:1: ( ( rule__Type__Alternatives ) )
            {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:131:1: ( ( rule__Type__Alternatives ) )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:132:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:133:1: ( rule__Type__Alternatives )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:133:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType214);
            rule__Type__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleType


    // $ANTLR start rule__Type__Alternatives
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:145:1: rule__Type__Alternatives : ( ( 'String' ) | ( 'Date' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:149:1: ( ( 'String' ) | ( 'Date' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("145:1: rule__Type__Alternatives : ( ( 'String' ) | ( 'Date' ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:150:1: ( 'String' )
                    {
                    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:150:1: ( 'String' )
                    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:151:1: 'String'
                    {
                     before(grammarAccess.getTypeAccess().getStringKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__Type__Alternatives251); 
                     after(grammarAccess.getTypeAccess().getStringKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:158:6: ( 'Date' )
                    {
                    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:158:6: ( 'Date' )
                    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:159:1: 'Date'
                    {
                     before(grammarAccess.getTypeAccess().getDateKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__Type__Alternatives271); 
                     after(grammarAccess.getTypeAccess().getDateKeyword_1()); 

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
    // $ANTLR end rule__Type__Alternatives


    // $ANTLR start rule__Mapping__Group__0
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:173:1: rule__Mapping__Group__0 : rule__Mapping__Group__0__Impl rule__Mapping__Group__1 ;
    public final void rule__Mapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:177:1: ( rule__Mapping__Group__0__Impl rule__Mapping__Group__1 )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:178:2: rule__Mapping__Group__0__Impl rule__Mapping__Group__1
            {
            pushFollow(FOLLOW_rule__Mapping__Group__0__Impl_in_rule__Mapping__Group__0303);
            rule__Mapping__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__1_in_rule__Mapping__Group__0306);
            rule__Mapping__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapping__Group__0


    // $ANTLR start rule__Mapping__Group__0__Impl
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:185:1: rule__Mapping__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Mapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:189:1: ( ( 'entity' ) )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:190:1: ( 'entity' )
            {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:190:1: ( 'entity' )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:191:1: 'entity'
            {
             before(grammarAccess.getMappingAccess().getEntityKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Mapping__Group__0__Impl334); 
             after(grammarAccess.getMappingAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapping__Group__0__Impl


    // $ANTLR start rule__Mapping__Group__1
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:204:1: rule__Mapping__Group__1 : rule__Mapping__Group__1__Impl rule__Mapping__Group__2 ;
    public final void rule__Mapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:208:1: ( rule__Mapping__Group__1__Impl rule__Mapping__Group__2 )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:209:2: rule__Mapping__Group__1__Impl rule__Mapping__Group__2
            {
            pushFollow(FOLLOW_rule__Mapping__Group__1__Impl_in_rule__Mapping__Group__1365);
            rule__Mapping__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__2_in_rule__Mapping__Group__1368);
            rule__Mapping__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapping__Group__1


    // $ANTLR start rule__Mapping__Group__1__Impl
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:216:1: rule__Mapping__Group__1__Impl : ( ( rule__Mapping__NameAssignment_1 ) ) ;
    public final void rule__Mapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:220:1: ( ( ( rule__Mapping__NameAssignment_1 ) ) )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:221:1: ( ( rule__Mapping__NameAssignment_1 ) )
            {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:221:1: ( ( rule__Mapping__NameAssignment_1 ) )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:222:1: ( rule__Mapping__NameAssignment_1 )
            {
             before(grammarAccess.getMappingAccess().getNameAssignment_1()); 
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:223:1: ( rule__Mapping__NameAssignment_1 )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:223:2: rule__Mapping__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Mapping__NameAssignment_1_in_rule__Mapping__Group__1__Impl395);
            rule__Mapping__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getMappingAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapping__Group__1__Impl


    // $ANTLR start rule__Mapping__Group__2
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:233:1: rule__Mapping__Group__2 : rule__Mapping__Group__2__Impl rule__Mapping__Group__3 ;
    public final void rule__Mapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:237:1: ( rule__Mapping__Group__2__Impl rule__Mapping__Group__3 )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:238:2: rule__Mapping__Group__2__Impl rule__Mapping__Group__3
            {
            pushFollow(FOLLOW_rule__Mapping__Group__2__Impl_in_rule__Mapping__Group__2425);
            rule__Mapping__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__3_in_rule__Mapping__Group__2428);
            rule__Mapping__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapping__Group__2


    // $ANTLR start rule__Mapping__Group__2__Impl
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:245:1: rule__Mapping__Group__2__Impl : ( ( rule__Mapping__Group_2__0 )? ) ;
    public final void rule__Mapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:249:1: ( ( ( rule__Mapping__Group_2__0 )? ) )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:250:1: ( ( rule__Mapping__Group_2__0 )? )
            {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:250:1: ( ( rule__Mapping__Group_2__0 )? )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:251:1: ( rule__Mapping__Group_2__0 )?
            {
             before(grammarAccess.getMappingAccess().getGroup_2()); 
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:252:1: ( rule__Mapping__Group_2__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:252:2: rule__Mapping__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Mapping__Group_2__0_in_rule__Mapping__Group__2__Impl455);
                    rule__Mapping__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapping__Group__2__Impl


    // $ANTLR start rule__Mapping__Group__3
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:262:1: rule__Mapping__Group__3 : rule__Mapping__Group__3__Impl rule__Mapping__Group__4 ;
    public final void rule__Mapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:266:1: ( rule__Mapping__Group__3__Impl rule__Mapping__Group__4 )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:267:2: rule__Mapping__Group__3__Impl rule__Mapping__Group__4
            {
            pushFollow(FOLLOW_rule__Mapping__Group__3__Impl_in_rule__Mapping__Group__3486);
            rule__Mapping__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__4_in_rule__Mapping__Group__3489);
            rule__Mapping__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapping__Group__3


    // $ANTLR start rule__Mapping__Group__3__Impl
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:274:1: rule__Mapping__Group__3__Impl : ( '{' ) ;
    public final void rule__Mapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:278:1: ( ( '{' ) )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:279:1: ( '{' )
            {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:279:1: ( '{' )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:280:1: '{'
            {
             before(grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__Mapping__Group__3__Impl517); 
             after(grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapping__Group__3__Impl


    // $ANTLR start rule__Mapping__Group__4
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:293:1: rule__Mapping__Group__4 : rule__Mapping__Group__4__Impl rule__Mapping__Group__5 ;
    public final void rule__Mapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:297:1: ( rule__Mapping__Group__4__Impl rule__Mapping__Group__5 )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:298:2: rule__Mapping__Group__4__Impl rule__Mapping__Group__5
            {
            pushFollow(FOLLOW_rule__Mapping__Group__4__Impl_in_rule__Mapping__Group__4548);
            rule__Mapping__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__5_in_rule__Mapping__Group__4551);
            rule__Mapping__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapping__Group__4


    // $ANTLR start rule__Mapping__Group__4__Impl
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:305:1: rule__Mapping__Group__4__Impl : ( ( rule__Mapping__PropertiesAssignment_4 )* ) ;
    public final void rule__Mapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:309:1: ( ( ( rule__Mapping__PropertiesAssignment_4 )* ) )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:310:1: ( ( rule__Mapping__PropertiesAssignment_4 )* )
            {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:310:1: ( ( rule__Mapping__PropertiesAssignment_4 )* )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:311:1: ( rule__Mapping__PropertiesAssignment_4 )*
            {
             before(grammarAccess.getMappingAccess().getPropertiesAssignment_4()); 
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:312:1: ( rule__Mapping__PropertiesAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:312:2: rule__Mapping__PropertiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Mapping__PropertiesAssignment_4_in_rule__Mapping__Group__4__Impl578);
            	    rule__Mapping__PropertiesAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getMappingAccess().getPropertiesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapping__Group__4__Impl


    // $ANTLR start rule__Mapping__Group__5
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:322:1: rule__Mapping__Group__5 : rule__Mapping__Group__5__Impl ;
    public final void rule__Mapping__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:326:1: ( rule__Mapping__Group__5__Impl )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:327:2: rule__Mapping__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Mapping__Group__5__Impl_in_rule__Mapping__Group__5609);
            rule__Mapping__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapping__Group__5


    // $ANTLR start rule__Mapping__Group__5__Impl
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:333:1: rule__Mapping__Group__5__Impl : ( '}' ) ;
    public final void rule__Mapping__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:337:1: ( ( '}' ) )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:338:1: ( '}' )
            {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:338:1: ( '}' )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:339:1: '}'
            {
             before(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__Mapping__Group__5__Impl637); 
             after(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapping__Group__5__Impl


    // $ANTLR start rule__Mapping__Group_2__0
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:364:1: rule__Mapping__Group_2__0 : rule__Mapping__Group_2__0__Impl rule__Mapping__Group_2__1 ;
    public final void rule__Mapping__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:368:1: ( rule__Mapping__Group_2__0__Impl rule__Mapping__Group_2__1 )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:369:2: rule__Mapping__Group_2__0__Impl rule__Mapping__Group_2__1
            {
            pushFollow(FOLLOW_rule__Mapping__Group_2__0__Impl_in_rule__Mapping__Group_2__0680);
            rule__Mapping__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group_2__1_in_rule__Mapping__Group_2__0683);
            rule__Mapping__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapping__Group_2__0


    // $ANTLR start rule__Mapping__Group_2__0__Impl
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:376:1: rule__Mapping__Group_2__0__Impl : ( 'table:' ) ;
    public final void rule__Mapping__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:380:1: ( ( 'table:' ) )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:381:1: ( 'table:' )
            {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:381:1: ( 'table:' )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:382:1: 'table:'
            {
             before(grammarAccess.getMappingAccess().getTableKeyword_2_0()); 
            match(input,16,FOLLOW_16_in_rule__Mapping__Group_2__0__Impl711); 
             after(grammarAccess.getMappingAccess().getTableKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapping__Group_2__0__Impl


    // $ANTLR start rule__Mapping__Group_2__1
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:395:1: rule__Mapping__Group_2__1 : rule__Mapping__Group_2__1__Impl ;
    public final void rule__Mapping__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:399:1: ( rule__Mapping__Group_2__1__Impl )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:400:2: rule__Mapping__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Mapping__Group_2__1__Impl_in_rule__Mapping__Group_2__1742);
            rule__Mapping__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapping__Group_2__1


    // $ANTLR start rule__Mapping__Group_2__1__Impl
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:406:1: rule__Mapping__Group_2__1__Impl : ( ( rule__Mapping__TableAssignment_2_1 ) ) ;
    public final void rule__Mapping__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:410:1: ( ( ( rule__Mapping__TableAssignment_2_1 ) ) )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:411:1: ( ( rule__Mapping__TableAssignment_2_1 ) )
            {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:411:1: ( ( rule__Mapping__TableAssignment_2_1 ) )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:412:1: ( rule__Mapping__TableAssignment_2_1 )
            {
             before(grammarAccess.getMappingAccess().getTableAssignment_2_1()); 
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:413:1: ( rule__Mapping__TableAssignment_2_1 )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:413:2: rule__Mapping__TableAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Mapping__TableAssignment_2_1_in_rule__Mapping__Group_2__1__Impl769);
            rule__Mapping__TableAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getMappingAccess().getTableAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapping__Group_2__1__Impl


    // $ANTLR start rule__Property__Group__0
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:427:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:431:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:432:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__0803);
            rule__Property__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__0806);
            rule__Property__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__0


    // $ANTLR start rule__Property__Group__0__Impl
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:439:1: rule__Property__Group__0__Impl : ( 'property' ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:443:1: ( ( 'property' ) )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:444:1: ( 'property' )
            {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:444:1: ( 'property' )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:445:1: 'property'
            {
             before(grammarAccess.getPropertyAccess().getPropertyKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Property__Group__0__Impl834); 
             after(grammarAccess.getPropertyAccess().getPropertyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__0__Impl


    // $ANTLR start rule__Property__Group__1
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:458:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:462:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:463:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__1865);
            rule__Property__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__1868);
            rule__Property__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__1


    // $ANTLR start rule__Property__Group__1__Impl
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:470:1: rule__Property__Group__1__Impl : ( ( rule__Property__NameAssignment_1 ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:474:1: ( ( ( rule__Property__NameAssignment_1 ) ) )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:475:1: ( ( rule__Property__NameAssignment_1 ) )
            {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:475:1: ( ( rule__Property__NameAssignment_1 ) )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:476:1: ( rule__Property__NameAssignment_1 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_1()); 
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:477:1: ( rule__Property__NameAssignment_1 )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:477:2: rule__Property__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Property__NameAssignment_1_in_rule__Property__Group__1__Impl895);
            rule__Property__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__1__Impl


    // $ANTLR start rule__Property__Group__2
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:487:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:491:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:492:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__2925);
            rule__Property__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Property__Group__3_in_rule__Property__Group__2928);
            rule__Property__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__2


    // $ANTLR start rule__Property__Group__2__Impl
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:499:1: rule__Property__Group__2__Impl : ( ( rule__Property__Group_2__0 )? ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:503:1: ( ( ( rule__Property__Group_2__0 )? ) )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:504:1: ( ( rule__Property__Group_2__0 )? )
            {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:504:1: ( ( rule__Property__Group_2__0 )? )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:505:1: ( rule__Property__Group_2__0 )?
            {
             before(grammarAccess.getPropertyAccess().getGroup_2()); 
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:506:1: ( rule__Property__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:506:2: rule__Property__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Property__Group_2__0_in_rule__Property__Group__2__Impl955);
                    rule__Property__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__2__Impl


    // $ANTLR start rule__Property__Group__3
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:516:1: rule__Property__Group__3 : rule__Property__Group__3__Impl ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:520:1: ( rule__Property__Group__3__Impl )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:521:2: rule__Property__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group__3__Impl_in_rule__Property__Group__3986);
            rule__Property__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__3


    // $ANTLR start rule__Property__Group__3__Impl
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:527:1: rule__Property__Group__3__Impl : ( ( rule__Property__Group_3__0 )? ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:531:1: ( ( ( rule__Property__Group_3__0 )? ) )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:532:1: ( ( rule__Property__Group_3__0 )? )
            {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:532:1: ( ( rule__Property__Group_3__0 )? )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:533:1: ( rule__Property__Group_3__0 )?
            {
             before(grammarAccess.getPropertyAccess().getGroup_3()); 
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:534:1: ( rule__Property__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:534:2: rule__Property__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Property__Group_3__0_in_rule__Property__Group__3__Impl1013);
                    rule__Property__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__3__Impl


    // $ANTLR start rule__Property__Group_2__0
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:552:1: rule__Property__Group_2__0 : rule__Property__Group_2__0__Impl rule__Property__Group_2__1 ;
    public final void rule__Property__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:556:1: ( rule__Property__Group_2__0__Impl rule__Property__Group_2__1 )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:557:2: rule__Property__Group_2__0__Impl rule__Property__Group_2__1
            {
            pushFollow(FOLLOW_rule__Property__Group_2__0__Impl_in_rule__Property__Group_2__01052);
            rule__Property__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Property__Group_2__1_in_rule__Property__Group_2__01055);
            rule__Property__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group_2__0


    // $ANTLR start rule__Property__Group_2__0__Impl
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:564:1: rule__Property__Group_2__0__Impl : ( 'type:' ) ;
    public final void rule__Property__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:568:1: ( ( 'type:' ) )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:569:1: ( 'type:' )
            {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:569:1: ( 'type:' )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:570:1: 'type:'
            {
             before(grammarAccess.getPropertyAccess().getTypeKeyword_2_0()); 
            match(input,18,FOLLOW_18_in_rule__Property__Group_2__0__Impl1083); 
             after(grammarAccess.getPropertyAccess().getTypeKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group_2__0__Impl


    // $ANTLR start rule__Property__Group_2__1
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:583:1: rule__Property__Group_2__1 : rule__Property__Group_2__1__Impl ;
    public final void rule__Property__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:587:1: ( rule__Property__Group_2__1__Impl )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:588:2: rule__Property__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group_2__1__Impl_in_rule__Property__Group_2__11114);
            rule__Property__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group_2__1


    // $ANTLR start rule__Property__Group_2__1__Impl
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:594:1: rule__Property__Group_2__1__Impl : ( ( rule__Property__TypeAssignment_2_1 ) ) ;
    public final void rule__Property__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:598:1: ( ( ( rule__Property__TypeAssignment_2_1 ) ) )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:599:1: ( ( rule__Property__TypeAssignment_2_1 ) )
            {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:599:1: ( ( rule__Property__TypeAssignment_2_1 ) )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:600:1: ( rule__Property__TypeAssignment_2_1 )
            {
             before(grammarAccess.getPropertyAccess().getTypeAssignment_2_1()); 
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:601:1: ( rule__Property__TypeAssignment_2_1 )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:601:2: rule__Property__TypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Property__TypeAssignment_2_1_in_rule__Property__Group_2__1__Impl1141);
            rule__Property__TypeAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group_2__1__Impl


    // $ANTLR start rule__Property__Group_3__0
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:615:1: rule__Property__Group_3__0 : rule__Property__Group_3__0__Impl rule__Property__Group_3__1 ;
    public final void rule__Property__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:619:1: ( rule__Property__Group_3__0__Impl rule__Property__Group_3__1 )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:620:2: rule__Property__Group_3__0__Impl rule__Property__Group_3__1
            {
            pushFollow(FOLLOW_rule__Property__Group_3__0__Impl_in_rule__Property__Group_3__01175);
            rule__Property__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Property__Group_3__1_in_rule__Property__Group_3__01178);
            rule__Property__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group_3__0


    // $ANTLR start rule__Property__Group_3__0__Impl
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:627:1: rule__Property__Group_3__0__Impl : ( 'column:' ) ;
    public final void rule__Property__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:631:1: ( ( 'column:' ) )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:632:1: ( 'column:' )
            {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:632:1: ( 'column:' )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:633:1: 'column:'
            {
             before(grammarAccess.getPropertyAccess().getColumnKeyword_3_0()); 
            match(input,19,FOLLOW_19_in_rule__Property__Group_3__0__Impl1206); 
             after(grammarAccess.getPropertyAccess().getColumnKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group_3__0__Impl


    // $ANTLR start rule__Property__Group_3__1
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:646:1: rule__Property__Group_3__1 : rule__Property__Group_3__1__Impl ;
    public final void rule__Property__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:650:1: ( rule__Property__Group_3__1__Impl )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:651:2: rule__Property__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group_3__1__Impl_in_rule__Property__Group_3__11237);
            rule__Property__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group_3__1


    // $ANTLR start rule__Property__Group_3__1__Impl
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:657:1: rule__Property__Group_3__1__Impl : ( ( rule__Property__ColumnAssignment_3_1 ) ) ;
    public final void rule__Property__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:661:1: ( ( ( rule__Property__ColumnAssignment_3_1 ) ) )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:662:1: ( ( rule__Property__ColumnAssignment_3_1 ) )
            {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:662:1: ( ( rule__Property__ColumnAssignment_3_1 ) )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:663:1: ( rule__Property__ColumnAssignment_3_1 )
            {
             before(grammarAccess.getPropertyAccess().getColumnAssignment_3_1()); 
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:664:1: ( rule__Property__ColumnAssignment_3_1 )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:664:2: rule__Property__ColumnAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Property__ColumnAssignment_3_1_in_rule__Property__Group_3__1__Impl1264);
            rule__Property__ColumnAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getColumnAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group_3__1__Impl


    // $ANTLR start rule__Mapping__NameAssignment_1
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:679:1: rule__Mapping__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Mapping__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:683:1: ( ( RULE_ID ) )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:684:1: ( RULE_ID )
            {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:684:1: ( RULE_ID )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:685:1: RULE_ID
            {
             before(grammarAccess.getMappingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Mapping__NameAssignment_11303); 
             after(grammarAccess.getMappingAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapping__NameAssignment_1


    // $ANTLR start rule__Mapping__TableAssignment_2_1
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:694:1: rule__Mapping__TableAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Mapping__TableAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:698:1: ( ( RULE_STRING ) )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:699:1: ( RULE_STRING )
            {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:699:1: ( RULE_STRING )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:700:1: RULE_STRING
            {
             before(grammarAccess.getMappingAccess().getTableSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Mapping__TableAssignment_2_11334); 
             after(grammarAccess.getMappingAccess().getTableSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapping__TableAssignment_2_1


    // $ANTLR start rule__Mapping__PropertiesAssignment_4
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:709:1: rule__Mapping__PropertiesAssignment_4 : ( ruleProperty ) ;
    public final void rule__Mapping__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:713:1: ( ( ruleProperty ) )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:714:1: ( ruleProperty )
            {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:714:1: ( ruleProperty )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:715:1: ruleProperty
            {
             before(grammarAccess.getMappingAccess().getPropertiesPropertyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__Mapping__PropertiesAssignment_41365);
            ruleProperty();
            _fsp--;

             after(grammarAccess.getMappingAccess().getPropertiesPropertyParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mapping__PropertiesAssignment_4


    // $ANTLR start rule__Property__NameAssignment_1
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:724:1: rule__Property__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:728:1: ( ( RULE_ID ) )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:729:1: ( RULE_ID )
            {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:729:1: ( RULE_ID )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:730:1: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__NameAssignment_11396); 
             after(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__NameAssignment_1


    // $ANTLR start rule__Property__TypeAssignment_2_1
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:739:1: rule__Property__TypeAssignment_2_1 : ( ruleType ) ;
    public final void rule__Property__TypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:743:1: ( ( ruleType ) )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:744:1: ( ruleType )
            {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:744:1: ( ruleType )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:745:1: ruleType
            {
             before(grammarAccess.getPropertyAccess().getTypeTypeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Property__TypeAssignment_2_11427);
            ruleType();
            _fsp--;

             after(grammarAccess.getPropertyAccess().getTypeTypeParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__TypeAssignment_2_1


    // $ANTLR start rule__Property__ColumnAssignment_3_1
    // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:754:1: rule__Property__ColumnAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Property__ColumnAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:758:1: ( ( RULE_STRING ) )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:759:1: ( RULE_STRING )
            {
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:759:1: ( RULE_STRING )
            // ../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g:760:1: RULE_STRING
            {
             before(grammarAccess.getPropertyAccess().getColumnSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Property__ColumnAssignment_3_11458); 
             after(grammarAccess.getPropertyAccess().getColumnSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__ColumnAssignment_3_1


 

    public static final BitSet FOLLOW_ruleMapping_in_entryRuleMapping61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__0_in_ruleMapping94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Type__Alternatives251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Type__Alternatives271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__0__Impl_in_rule__Mapping__Group__0303 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Mapping__Group__1_in_rule__Mapping__Group__0306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Mapping__Group__0__Impl334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__1__Impl_in_rule__Mapping__Group__1365 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Mapping__Group__2_in_rule__Mapping__Group__1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__NameAssignment_1_in_rule__Mapping__Group__1__Impl395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__2__Impl_in_rule__Mapping__Group__2425 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Mapping__Group__3_in_rule__Mapping__Group__2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group_2__0_in_rule__Mapping__Group__2__Impl455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__3__Impl_in_rule__Mapping__Group__3486 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__Mapping__Group__4_in_rule__Mapping__Group__3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Mapping__Group__3__Impl517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__4__Impl_in_rule__Mapping__Group__4548 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Mapping__Group__5_in_rule__Mapping__Group__4551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__PropertiesAssignment_4_in_rule__Mapping__Group__4__Impl578 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__5__Impl_in_rule__Mapping__Group__5609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Mapping__Group__5__Impl637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group_2__0__Impl_in_rule__Mapping__Group_2__0680 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Mapping__Group_2__1_in_rule__Mapping__Group_2__0683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Mapping__Group_2__0__Impl711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group_2__1__Impl_in_rule__Mapping__Group_2__1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__TableAssignment_2_1_in_rule__Mapping__Group_2__1__Impl769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__0803 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__0806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Property__Group__0__Impl834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__1865 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__NameAssignment_1_in_rule__Property__Group__1__Impl895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__2925 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Property__Group__3_in_rule__Property__Group__2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_2__0_in_rule__Property__Group__2__Impl955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__3__Impl_in_rule__Property__Group__3986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_3__0_in_rule__Property__Group__3__Impl1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_2__0__Impl_in_rule__Property__Group_2__01052 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Property__Group_2__1_in_rule__Property__Group_2__01055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Property__Group_2__0__Impl1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_2__1__Impl_in_rule__Property__Group_2__11114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__TypeAssignment_2_1_in_rule__Property__Group_2__1__Impl1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_3__0__Impl_in_rule__Property__Group_3__01175 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Property__Group_3__1_in_rule__Property__Group_3__01178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Property__Group_3__0__Impl1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_3__1__Impl_in_rule__Property__Group_3__11237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__ColumnAssignment_3_1_in_rule__Property__Group_3__1__Impl1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Mapping__NameAssignment_11303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Mapping__TableAssignment_2_11334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Mapping__PropertiesAssignment_41365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__NameAssignment_11396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Property__TypeAssignment_2_11427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Property__ColumnAssignment_3_11458 = new BitSet(new long[]{0x0000000000000002L});

}