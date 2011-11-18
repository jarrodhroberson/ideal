grammar Ideal;

options 
{
   output = AST;
   language = Java;
   ASTLabelType = CommonTree;
}


eval : program EOF! ;

program : (statement'.')* ;

statement : function_invocation
          | assignment
          | type_definition
          | ATOM
          ;	
               
assignment : ID '->' expression
           | ATOM '->' ( string | number )
           | function_signature '->' ( assignment ',' )* expression 
           ;

type_definition : TYPE_ID '->' assignment (',' assignment)*
		;	 

function_signature : ID '(' ID (',' ID)* ')' ;

function_invocation : ( NAMESPACE ':' | TYPE_ID ':' | ID ':' | ':' )? ID '(' expression (',' expression)* ')' ;

string : UNICODE_STRING;

number : HEX_NUMBER
       | FLOAT
       | INTEGER
       ;

// expressions

term : '(' expression ')'
     | number
     | string
     | function_invocation
     | ID
     | ATOM
     ;

negation : '!'* term;

unary : ('+'|'-')* negation;

mult : unary (('*' | '/' | ('%'|'mod') ) unary)*;

add : mult (('+' | '-') mult)*;

relation : add (('=' | '!=' | '<' | '<=' | '>=' | '>') add)*;

expression : relation (('&&' | '||') relation)*;

// LEXER ================================================================

HEX_NUMBER : '0x' HEX_DIGIT+;

fragment 
FLOAT: ;

INTEGER : DIGIT+ ({input.LA(1)=='.' && input.LA(2)>='0' && input.LA(2)<='9'}?=> '.' DIGIT+ {$type=FLOAT;})? ;

UNICODE_STRING : '"' ( ESC | ~('\u0000'..'\u001f' | '\\' | '\"' ) )* '"' ;

WS : (' '|'\n'|'\r'|'\t')+ {$channel = HIDDEN;} ; // ignore whitespace

fragment
ESC : '\\' ( UNI_ESC |'b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\' );

fragment
UNI_ESC : 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT;

fragment
HEX_DIGIT : (DIGIT|'a'..'f'|'A'..'F') ;

fragment
DIGIT : ('0'..'9') ;

ATOM : ('A'..'Z')('A'..'Z'|'0'..'9'|'_')* ; 

TYPE_ID : ('A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')* ;

fragment
NAMESPACE : (TYPE_ID ( ':' TYPE_ID )*)? ;

ID : ('a'..'z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;

COMMENT : '/*' .* '*/' {$channel = HIDDEN;} ;
