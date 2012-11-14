grammar Ideal;

options 
{
   output = AST;
   language = Java;
   ASTLabelType = CommonTree;
}

@lexer::header {
  package ideal;
}
 
@parser::header {
  package ideal;
}

eval : program EOF! ;

program : (statement'.')* ;

statement : function_invocation
          | assignment
          | type_definition
          | ATOM
          ;	
                 
assignment : ID '->' ( expression | container | container_access )
           | ATOM '->' ( expression | container | container_access )
           | function_signature '->' ( assignment ',' )* expression
           ;

type_definition : TYPE_ID ':' assignment (',' assignment)*  ;

container : '[' (( ATOM | string | number ) ':')? ( expression ) (',' ((ATOM | string | number ) ':')? ( expression ) )* ']' ;	

container_access : ID '[' ( ID | ATOM | string | number ) ']' ;	

function_signature : TYPE_ID? ID '('! TYPE_ID? ID (',' TYPE_ID? ID)* ')'! ;

function_invocation : ( NAMESPACE ':' | TYPE_ID ':' | ID ':' | ':' )? ID '('! term (',' term)* ')'! ;

string : UNICODE_STRING;

number : HEX_NUMBER
       | FLOAT
       | INTEGER
       ;

// expressions

term : '(' expression ')'
     | number
     | function_invocation
     | ID
     | ATOM
     ;
              
power : term ('^' term)* ;

negation : '!' negation | power ;

unary : ('+'! | '-'^)* negation ;

mult : unary (('*' | '/' | '%' ) unary)* ;

add : mult (('+' | '-') mult)* ;

relation : add (('=' | '!=' | '<' | '<=' | '>=' | '>') add)* ;

expression : relation (('&' | '|') relation)* | string;

// LEXER ================================================================

HEX_NUMBER : '0x' HEX_DIGIT+;

fragment 
FLOAT: ;

INTEGER : DIGIT+ ({input.LA(1)=='.' && input.LA(2)>='0' && input.LA(2)<='9'}?=> '.' DIGIT+ {$type=FLOAT;})? ;

UNICODE_STRING : '"' ( ESC | ~('\u0000'..'\u001f' | '\\' | '\"' ) )* '"';

WS : (' '|'\n'|'\r'|'\t')+ {$channel = HIDDEN;} ; // ignore whitespace

fragment
ESC : '\\' ( UNI_ESC |'b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\' );

fragment
UNI_ESC : 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT;

fragment
HEX_DIGIT : (DIGIT|'a'..'f'|'A'..'F') ;

fragment
DIGIT : ('0'..'9') ;

//ATOM is all UPPER_CASE
ATOM : ('A'..'Z')('A'..'Z'|'0'..'9'|'_')* ; 

TYPE_ID : ('A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')* ;

fragment
NAMESPACE : (TYPE_ID ( ':' TYPE_ID )*)? ;

ID : ('a'..'z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;

COMMENT : '/*' .* '*/' {$channel = HIDDEN;} ;
