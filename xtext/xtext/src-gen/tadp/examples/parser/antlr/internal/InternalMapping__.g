lexer grammar InternalMapping;
@header {
package tadp.examples.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'entity' ;
T12 : 'table:' ;
T13 : '{' ;
T14 : '}' ;
T15 : 'property' ;
T16 : 'type:' ;
T17 : 'column:' ;
T18 : 'String' ;
T19 : 'Date' ;

// $ANTLR src "../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g" 330
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g" 332
RULE_INT : ('0'..'9')+;

// $ANTLR src "../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g" 334
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g" 336
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g" 338
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g" 340
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../xtext/src-gen/tadp/examples/parser/antlr/internal/InternalMapping.g" 342
RULE_ANY_OTHER : .;


