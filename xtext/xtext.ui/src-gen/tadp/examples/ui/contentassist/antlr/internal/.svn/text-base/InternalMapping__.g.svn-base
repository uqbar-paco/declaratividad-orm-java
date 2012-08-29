lexer grammar InternalMapping;
@header {
package tadp.examples.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'String' ;
T12 : 'Date' ;
T13 : 'entity' ;
T14 : '{' ;
T15 : '}' ;
T16 : 'table:' ;
T17 : 'property' ;
T18 : 'type:' ;
T19 : 'column:' ;

// $ANTLR src "../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g" 770
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g" 772
RULE_INT : ('0'..'9')+;

// $ANTLR src "../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g" 774
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g" 776
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g" 778
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g" 780
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../xtext.ui/src-gen/tadp/examples/ui/contentassist/antlr/internal/InternalMapping.g" 782
RULE_ANY_OTHER : .;


