grammar Ideal;

tokens { ANONYMOUS,
         CONTEXT, 
         MAP, 
         LIST, 
         ASSIGNMENT, 
         FUNCTION,
         EXPRESSION, 
         TYPE, 
         NAME,
         NUMBER,
         STRING, 
         PARAMETERS,
         INDEX,
         VALUE,
         INVOCATION,
         PAIR,
         TRUE,
         FALSE,
         SUPER,
         TYPE_DEF
       }

eval : program EOF ;

program : (statement'.')* ;

statement : type_definition
          | function_invocation
          | assignment
          | ATOM
          ;	
                 
assignment : id_assignment
           | atom_assignment
           | function_assignment
           ;
           
function_assignment : function_signature '->' ( assignment ',' )* expression ;

id_assignment : associative_array_assignment
              | TYPE_ID ID '->' expression
	          | ID '->' expression
	          ;
         
atom_assignment : TYPE_ID ATOM '->' expression
	        | ATOM '->' expression
	        ;    
         
associative_array_assignment : key ':' value ID '->' associative_array
		             | ID '->' associative_array
		             ;
			     	
key : TYPE_ID ;
value : TYPE_ID ;	 

type_definition : super_types? TYPE_ID '=>' expression? (type_members (',' type_members)*)? ;

super_types : TYPE_ID (':' TYPE_ID)* ;

type_members : assignment 
             | TYPE_ID ID ('<-' expression (',' expression)*)?
             | ID ('<-' expression (',' expression)*)?
             ;	

container : '[' container_contents ( ',' container_contents )* ']' ;

container_contents : expression ;

associative_array : '[' associative_array_key ':' associative_array_value (',' associative_array_key ':' associative_array_value )* ']' ;

associative_array_value : expression ;

associative_array_key :	TYPE_ID | ATOM | string | number ;

container_access : ID '[' index ']' ;

index :	ID | ATOM | string | number ;

function_signature : ID '(' function_parameters? ')' ;

function_parameters : function_parameter (',' function_parameter)* ;

function_parameter : TYPE_ID ID
		           | ID
		           ;

function_invocation : ID '(' (term (',' term)*)? ')' ;

string : UNICODE_STRING ;

number : HEX_NUMBER
//       | DECIMAL
       | INTEGER
       ;

// expressions

modulo : modulo MODULO addOrSub
       | addOrSub
       ;

addOrSub : addOrSub ADD multOrDiv
         | addOrSub SUBTRACT multOrDiv
         | multOrDiv
         ;

multOrDiv : multOrDiv MULTIPLY pow
          | multOrDiv DIVIDE pow
          | pow
          ;

pow : unary POWER unary
    | unary
    ;

unary : ('+'|'-')? term ;

term : LPAREN expression RPAREN
     | number
     | string
     | container_access
     | function_invocation
     | ATOM 
     | ID
     ;
	 
and_or : AND
       | OR
       ;
expression : relation (and_or relation)* ;

relation : unary (relationships unary)* ;

relationships : EQUAL | NOT_EQUAL | LESS_THAN | LESS_THAN_OR_EQUAL | GREATER_THAN | GREATER_THAN_OR_EQUAL ;

// LEXER ================================================================

LPAREN : '(' ;
RPAREN : ')' ;
POWER : '^' ;
MODULO : '%' ;
DIVIDE : '/' ;
MULTIPLY : '*' ;
SUBTRACT : '-' ;
ADD : '+' ;
GREATER_THAN_OR_EQUAL : GREATER_THAN EQUAL ;
GREATER_THAN : '>' ;
LESS_THAN_OR_EQUAL : LESS_THAN EQUAL ;
LESS_THAN : '<' ;
NOT_EQUAL : '!=' ;
EQUAL : '=' ;
AND : '&' ;
OR : '|' ;
AT : '@' ;
        
HEX_NUMBER : '0x' HEX_DIGIT+;

//DECIMAL : INTEGER '.' INTEGER+ ;

INTEGER : DIGIT+ ;

UNICODE_STRING : '"' ( ESC | ~('\u0000'..'\u001f' | '\\' | '\"' ) )* '"';

WS : (' '|'\n'|'\r'|'\t')+ -> skip ; // ignore whitespace

fragment
ESC : '\\' ( UNI_ESC |'b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\' );

fragment
UNI_ESC : 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT;

fragment
HEX_DIGIT : (DIGIT|'a'..'f'|'A'..'F') ;

fragment
DIGIT : [0-9] ;

//ATOM is all UPPER_CASE
ATOM : ('A'..'Z')('A'..'Z'|'0'..'9'|'_')+ ; 

TYPE_ID : ('A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')+ ;

fragment
TYPES : TYPE_ID ( ';' TYPE_ID )* ;

ID : ('a'..'z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;

COMMENT : '/*' .*? '*/' -> skip ;
