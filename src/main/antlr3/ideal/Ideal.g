grammar Ideal;

options 
{
   output = AST;
   language = Java;
   ASTLabelType = CommonTree;
}

tokens { ANONYMOUS;
         CONTEXT; 
         MAP; 
         LIST; 
         ASSIGNMENT; 
         FUNCTION;
         EXPRESSION; 
         TYPE; 
         NAME;
         NUMBER;
         STRING; 
         PARAMETERS;
         INDEX;
         VALUE;
         INVOCATION;
         PAIR;
         TRUE;
         FALSE;
         SUPER;
         TYPE_DEF;
         ADD;
         SUBTRACT;
         MULTIPLY;
         DIVIDE;
         MODULO;
         POWER;
         AND;
         OR;
       }

@lexer::header {
  package ideal;
}
 
@parser::header {
  package ideal;
}

eval : program EOF! ;

program : (statement'.'!)* ;

statement : (type_definition)=> type_definition
          | (function_invocation)=> function_invocation
          | assignment
          | (ATOM)=> ATOM
          ;	
                 
assignment : id_assignment -> ^( ASSIGNMENT id_assignment )
           | atom_assignment -> ^( ASSIGNMENT atom_assignment )
           | function_assignment -> ^( ASSIGNMENT function_assignment )
           ;
           
function_assignment : function_signature '->' ( assignment ',' )* expression -> ^( FUNCTION function_signature ( assignment )* expression ) ;

id_assignment :	(associative_array_assignment)=> associative_array_assignment
              | TYPE_ID ID '->' expression -> ^(TYPE TYPE_ID) ^(NAME ID) ^(VALUE expression)
	      | ID '->' expression -> ^(TYPE ANONYMOUS) ^(NAME ID) ^(VALUE expression)
	      ;
         
atom_assignment : TYPE_ID ATOM '->' expression -> ^(TYPE TYPE_ID) ^(NAME ATOM) ^(VALUE expression)
	        | ATOM '->' expression -> ^(TYPE ANONYMOUS) ^(NAME ATOM) ^(VALUE expression)
	        ;    
         
associative_array_assignment : key ':' value ID '->' associative_array -> ^(TYPE key) ^(TYPE value) ^(NAME ID) associative_array
		             | ID '->' associative_array -> ^(TYPE ANONYMOUS) ^(TYPE ANONYMOUS) ^(NAME ID) associative_array
		             ;
			     	
key : TYPE_ID ;
value : TYPE_ID ;	 

type_definition : super_types? TYPE_ID '=>' expression? (type_members (',' type_members)*)? -> ^(TYPE_DEF super_types? ^(NAME TYPE_ID) ^(FUNCTION expression)? (type_members (type_members)*)? ) ;

super_types : TYPE_ID (':' TYPE_ID)* -> ^(SUPER TYPE_ID (TYPE_ID)*) ;

type_members : assignment 
             | TYPE_ID ID ('<-' expression (',' expression)*)? -> ^(TYPE_ID ID ^(FUNCTION (expression (expression)*)? ))
             | ID ('<-' expression (',' expression)*)? -> ^(ANONYMOUS ID ^(FUNCTION (expression (expression)*)? ))
             ;	

container : '[' container_contents ( ',' container_contents )* ']' ->  ^( LIST container_contents ( container_contents )* )
          ;

container_contents : expression ;

associative_array : '[' associative_array_key ':' associative_array_value (',' associative_array_key ':' associative_array_value )* ']' ->
		    ^( MAP ^(PAIR associative_array_key associative_array_value) ( ^(PAIR associative_array_key associative_array_value) )* )
		  ;

associative_array_value : expression ;
associative_array_key :	TYPE_ID | ATOM | string | number ;

container_access : ID '[' index ']' -> ^(NAME ID) ^(INDEX index ) ;	

index :	ID | ATOM | string | number ;

function_signature : TYPE_ID ID '(' function_parameters? ')' -> ^(TYPE TYPE_ID) ^(NAME ID) ^(PARAMETERS function_parameters?) 
		   | ID '(' function_parameters? ')' -> ^(TYPE ANONYMOUS) ^(NAME ID) ^(PARAMETERS function_parameters?)
		   ;

function_parameters : function_parameter (','! function_parameter)* ;

function_parameter : TYPE_ID ID -> ^(TYPE_ID ID )
		   | ID -> ^(ANONYMOUS ID)
		   ;	

function_invocation : ID '(' (term (',' term)*)? ')' -> ^(INVOCATION ^(NAME ID) ^(PARAMETERS (term (term)*)?) ) ;


string : UNICODE_STRING ;

number : HEX_NUMBER
       | FLOAT
       | INTEGER
       ;

// expressions

term : '('! expression ')'!
     | number
     | string
     | (container_access)=> container_access
     | (function_invocation)=> function_invocation 
     | ATOM
     | ID
     ;
  
unary : ('+'! | '-'^)? term ;
pow : (unary -> unary) ('^' s=unary -> ^(POWER $pow $s))*;
mod : (pow -> pow) ('%' s=pow -> ^(MODULO $mod $s))*;
mult : (mod -> mod) ('*' s=mod -> ^(MULTIPLY $mult $s))*;
div : (mult -> mult) ('/' s=mult -> ^(DIVIDE $div $s))*;
sub : (div -> div) ('-' s=div -> ^(SUBTRACT $sub $s))*;
add : (sub -> sub) ('+' s=sub -> ^(ADD $add $s))*;

relation : add (relationships^ add)* ;

relationships : '=' | '!=' | '<' | '<=' | '>=' | '>' ;
	 
and_or : '&' -> AND 
       | '|' -> OR
       ;

expression : relation (and_or^ relation)* ;

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
TYPES : TYPE_ID ( ';' TYPE_ID )* ;

ID : ('a'..'z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;

COMMENT : '/*' .* '*/' {$channel = HIDDEN;} ;
