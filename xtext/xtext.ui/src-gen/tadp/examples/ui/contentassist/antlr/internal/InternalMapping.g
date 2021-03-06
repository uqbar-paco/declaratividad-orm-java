/*
* generated by Xtext
*/
grammar InternalMapping;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package tadp.examples.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}

@parser::members {
 
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

}




// Entry rule entryRuleMapping
entryRuleMapping 
:
{ before(grammarAccess.getMappingRule()); }
	 ruleMapping
{ after(grammarAccess.getMappingRule()); } 
	 EOF 
;

// Rule Mapping
ruleMapping
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMappingAccess().getGroup()); }
(rule__Mapping__Group__0)
{ after(grammarAccess.getMappingAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleProperty
entryRuleProperty 
:
{ before(grammarAccess.getPropertyRule()); }
	 ruleProperty
{ after(grammarAccess.getPropertyRule()); } 
	 EOF 
;

// Rule Property
ruleProperty
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPropertyAccess().getGroup()); }
(rule__Property__Group__0)
{ after(grammarAccess.getPropertyAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleType
entryRuleType 
:
{ before(grammarAccess.getTypeRule()); }
	 ruleType
{ after(grammarAccess.getTypeRule()); } 
	 EOF 
;

// Rule Type
ruleType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTypeAccess().getAlternatives()); }
(rule__Type__Alternatives)
{ after(grammarAccess.getTypeAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__Type__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeAccess().getStringKeyword_0()); }

	'String' 

{ after(grammarAccess.getTypeAccess().getStringKeyword_0()); }
)

    |(
{ before(grammarAccess.getTypeAccess().getDateKeyword_1()); }

	'Date' 

{ after(grammarAccess.getTypeAccess().getDateKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Mapping__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Mapping__Group__0__Impl
	rule__Mapping__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Mapping__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMappingAccess().getEntityKeyword_0()); }

	'entity' 

{ after(grammarAccess.getMappingAccess().getEntityKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Mapping__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Mapping__Group__1__Impl
	rule__Mapping__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Mapping__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMappingAccess().getNameAssignment_1()); }
(rule__Mapping__NameAssignment_1)
{ after(grammarAccess.getMappingAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Mapping__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Mapping__Group__2__Impl
	rule__Mapping__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Mapping__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMappingAccess().getGroup_2()); }
(rule__Mapping__Group_2__0)?
{ after(grammarAccess.getMappingAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Mapping__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Mapping__Group__3__Impl
	rule__Mapping__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Mapping__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Mapping__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Mapping__Group__4__Impl
	rule__Mapping__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Mapping__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMappingAccess().getPropertiesAssignment_4()); }
(rule__Mapping__PropertiesAssignment_4)*
{ after(grammarAccess.getMappingAccess().getPropertiesAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Mapping__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Mapping__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Mapping__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__Mapping__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Mapping__Group_2__0__Impl
	rule__Mapping__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Mapping__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMappingAccess().getTableKeyword_2_0()); }

	'table:' 

{ after(grammarAccess.getMappingAccess().getTableKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Mapping__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Mapping__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Mapping__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMappingAccess().getTableAssignment_2_1()); }
(rule__Mapping__TableAssignment_2_1)
{ after(grammarAccess.getMappingAccess().getTableAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Property__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Property__Group__0__Impl
	rule__Property__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getPropertyKeyword_0()); }

	'property' 

{ after(grammarAccess.getPropertyAccess().getPropertyKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Property__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Property__Group__1__Impl
	rule__Property__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getNameAssignment_1()); }
(rule__Property__NameAssignment_1)
{ after(grammarAccess.getPropertyAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Property__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Property__Group__2__Impl
	rule__Property__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getGroup_2()); }
(rule__Property__Group_2__0)?
{ after(grammarAccess.getPropertyAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Property__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Property__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getGroup_3()); }
(rule__Property__Group_3__0)?
{ after(grammarAccess.getPropertyAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Property__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Property__Group_2__0__Impl
	rule__Property__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getTypeKeyword_2_0()); }

	'type:' 

{ after(grammarAccess.getPropertyAccess().getTypeKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Property__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Property__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getTypeAssignment_2_1()); }
(rule__Property__TypeAssignment_2_1)
{ after(grammarAccess.getPropertyAccess().getTypeAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Property__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Property__Group_3__0__Impl
	rule__Property__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getColumnKeyword_3_0()); }

	'column:' 

{ after(grammarAccess.getPropertyAccess().getColumnKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Property__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Property__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getColumnAssignment_3_1()); }
(rule__Property__ColumnAssignment_3_1)
{ after(grammarAccess.getPropertyAccess().getColumnAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__Mapping__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMappingAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getMappingAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Mapping__TableAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMappingAccess().getTableSTRINGTerminalRuleCall_2_1_0()); }
	RULE_STRING{ after(grammarAccess.getMappingAccess().getTableSTRINGTerminalRuleCall_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Mapping__PropertiesAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMappingAccess().getPropertiesPropertyParserRuleCall_4_0()); }
	ruleProperty{ after(grammarAccess.getMappingAccess().getPropertiesPropertyParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Property__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Property__TypeAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getTypeTypeParserRuleCall_2_1_0()); }
	ruleType{ after(grammarAccess.getPropertyAccess().getTypeTypeParserRuleCall_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Property__ColumnAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getColumnSTRINGTerminalRuleCall_3_1_0()); }
	RULE_STRING{ after(grammarAccess.getPropertyAccess().getColumnSTRINGTerminalRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


