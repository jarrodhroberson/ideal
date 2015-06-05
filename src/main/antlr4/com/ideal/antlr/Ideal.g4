grammar Ideal;

// expressions

evaluate : (statement)+ EOF ;

statement : assignment
          | ATOM
          | COMMENT
          ;

//function_assignment : ID '=>' function_invocation ;

//function_invocation : ID '(' (term (',' term)*)? ')' ;

function_definition : function_signature '=>' expression (',\n' expression)* '.\n' ;

function_signature : function_id LPAREN ID (',' ID)*? RPAREN ;

function_id : ID ;

assignment : function_definition #functionDefinition
           | id_assignment       #idAssignment
           | atom_assignment     #atomAssignment
           ;

id_assignment : ID '=>' expression NL ;

atom_assignment : ATOM '=>' expression;

boolean_expression : expression comparison expression ;

expression : expression POWER expression    #powerExpression
           | expression MULTIPLY expression #multiplyExpression
           | expression DIVIDE expression   #divideExpression
           | expression ADD expression      #addExpression
           | expression SUBTRACT expression #substractExpression
           | LPAREN expression RPAREN       #parenExpression
           | unary                          #unaryExpression
           ;

unary : ('+'|'-')? term ;

term : number #numberTerm
     | string #stringTerm
     | ID     #idTerm
     ;

string : UNICODE_STRING ;

number : HEX_NUMBER #hexNumber
       | DECIMAL    #decimalNumber
       | INTEGER    #integerNumber
       ;

and_or : AND #and
       | OR  #or
       ;

comparison : EQUAL | NOT_EQUAL | LESS_THAN | LESS_THAN_OR_EQUAL | GREATER_THAN | GREATER_THAN_OR_EQUAL ;

// LEXER ================================================================

LBRACKET : '[' ;
RBRACKET : ']' ;
LPAREN : '(' ;
RPAREN : ')' ;
POWER : '^' ;
MODULO : '%' ;
DIVIDE : '/' ;
MULTIPLY : '*' ;
SUBTRACT : '-' ;
ADD : '+' ;
GREATER_THAN_OR_EQUAL : '>=' ;
GREATER_THAN : '>' ;
LESS_THAN_OR_EQUAL : '<=' ;
LESS_THAN : '<' ;
NOT_EQUAL : '!=' ;
EQUAL : '=' ;
AND : '&' ;
OR : '|' ;
AT : '@' ;

HEX_NUMBER : '0x' HEX_DIGIT+;

DECIMAL : INTEGER '.' INTEGER ;

INTEGER : DIGIT+ ;

UNICODE_STRING : '"' ( ESC | ~('\u0000'..'\u001f' | '\\' | '\"' ) )* '"';

TRUE : 'TRUE' ;
FALSE : 'FALSE' ;

WS : (' '|'\r'|'\t')+ -> skip ; // ignore whitespace

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

ID : ('a'..'z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;

NL : '\n' ;

COMMENT : '/*' .*? '*/' ;
