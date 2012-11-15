grammar Ideal;

options 
{
   output = AST;
   language = Java;
   ASTLabelType = CommonTree;
}

tokens { ANONYMOUS; MAP; LIST; ASSIGNMENT; FUNCTION; TYPE; NAME; }

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
                 
assignment : associative_array_assignment -> ^( ASSIGNMENT associative_array_assignment )
	         | container_assignment -> ^( ASSIGNMENT container_assignment )
           | id_assignment -> ^( ASSIGNMENT id_assignment )
           | atom_assignment -> ^( ASSIGNMENT atom_assignment )
           | function_signature '->' ( assignment ',' )* expression -> ^( FUNCTION TYPE_ID function_signature '->' ( assignment ',' )* expression )
           ;

id_assignment :	TYPE_ID ID '->' expression -> ^(TYPE TYPE_ID) ID '->' expression
	            | ID '->' expression -> ^(TYPE ANONYMOUS ID) '->' expression
	            ;
         
atom_assignment : TYPE_ID ATOM '->' expression -> ^(TYPE TYPE_ID) ATOM expression
	              | ATOM '->' expression -> ^(TYPE ANONYMOUS) ATOM expression
	              ;
         
container_assignment : TYPE_ID ID '->' container -> ^(TYPE TYPE_ID) ^(NAME ID) container
		                 | ID '->' container -> ^(TYPE ANONYMOUS) ^(NAME ID) container
		                 ;	
          
associative_array_assignment : key ':' value ID '->' associative_array -> ^(TYPE key) ^(TYPE value) ^(NAME ID) associative_array
			                       | ID '->' associative_array -> ^(TYPE ANONYMOUS) ^(TYPE ANONYMOUS) ^(NAME ID) associative_array
			                       ;
			     	
key : ( TYPE_ID | ATOM | string | number ) ;
value : ( TYPE_ID | ATOM | string | number ) ;	 

type_definition : TYPES ':' TYPE_ID assignment (',' assignment)*  ;	

container : '{' container_contents ( ',' container_contents )* '}' ->  ^( LIST container_contents ( container_contents )* )
          ;

container_contents : expression | container | associative_array ;

associative_array : '{' associative_array_key ':' associative_array_value (',' associative_array_key ':' associative_array_value )* '}' ->
									  ^( MAP associative_array_key associative_array_value ( associative_array_key associative_array_value )* )
									;

associative_array_value :	expression | container | associative_array ;
associative_array_key :	TYPE_ID | ATOM | string | number ;

container_access : ID '[' ( ID | ATOM | string | number ) ']' ;	

function_signature : TYPES ID '(' function_parameters ')' -> ^( TYPES ID '(' function_parameters ')' )
		               | ID '(' function_parameters ')' -> ^( ANONYMOUS ID '(' function_parameters ')' )
		               ;

function_parameters : function_parameter (',' function_parameter)* ;

function_parameter : TYPE_ID ID -> ^( TYPE_ID ID )
		               | ID -> ^( ANONYMOUS ID)
		               ;	

function_invocation : ( TYPE_ID '.' |  ID '.' | '.' ) ID '('! term (',' term)* ')'! ;

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

expression : relation (('&' | '|') relation)* | string  | container_access ;

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
ATOM : ('A'..'Z')('A'..'Z'|'0'..'9'|'_')+ ; 

TYPE_ID : ('A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')+ ;

fragment
TYPES : TYPE_ID ( ':' TYPE_ID )* ;

ID : ('a'..'z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;

COMMENT : '/*' .* '*/' {$channel = HIDDEN;} ;
