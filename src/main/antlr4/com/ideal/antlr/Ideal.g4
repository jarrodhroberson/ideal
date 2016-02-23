grammar Ideal;

// expressions

parse : statement (NL statement)* EOF ;

statement : assignment '.'  #assignmentStatement
          | type_assignment #typeAssignmentStatement
          ;

assignment : ID LPAREN parameters RPAREN (assignment ',' NL )*  expression    #functionAssignment
           | ID LPAREN pattern_match RPAREN (assignment ',' NL )*  expression #patternMatchAssignment
           | ID '=>' LBRACKET (expression (',' expression)*)? RBRACKET        #arrayAssignment
           | ID LBRACKET expression RBRACKET '=>' expression                  #arrayIndexAssignment
           | ID '=>' expression                                               #idAssignment
           | ATOM '=>' expression                                             #atomAssignment
           ;

type_assignment : TYPE_ID NL? LBRACE NL? member (',' NL? member)* NL? RBRACE ;

member : ID (constraint (and_or ID constraint)*)? ;

constraint : comparison expression
           | expression
           ;

pattern_match : key_value (',' key_value )* ;

key_value : ID ':' expression #expressionKeyValue ;

parameters : ID (',' ID)* ;

expression : expression comparison expression #booleanExpression
           | expression POWER expression      #powerExpression
           | expression MODULO expression     #moduloExpression
           | expression MULTIPLY expression   #multiplyExpression
           | expression DIVIDE expression     #divideExpression
           | expression ADD expression        #addExpression
           | expression SUBTRACT expression   #substractExpression
           | LPAREN expression RPAREN         #parenExpression
           | ID LBRACKET expression RBRACKET  #arrayElementExpression
           | unary                            #unaryExpression
           ;

unary : ('+'|'-')? term ;

term : ID LPAREN key_value (',' key_value )* RPAREN #invocationTerm
     | number                                       #numberTerm
     | string                                       #stringTerm
     | bool                                         #booleanTerm
     | ID                                           #idTerm
     | ATOM                                         #atomTerm
     ;

string : UNICODE_STRING ;

number : HEX_NUMBER #hexNumber
       | DECIMAL    #decimalNumber
       | INTEGER    #integerNumber
       ;

and_or : AND #and
       | OR  #or
       ;

bool : TRUE | FALSE ;

comparison : EQUAL | NOT_EQUAL | LESS_THAN | LESS_THAN_OR_EQUAL | GREATER_THAN | GREATER_THAN_OR_EQUAL ;

// LEXER ================================================================

LSHIFT : '<<' ;
RSHIFT : '>>' ;
LBRACE : '{' ;
RBRACE : '}' ;
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

UNICODE_STRING : '\'' ( ESC | ~('\u0000'..'\u001f' | '\\' | '\"' ) )* '\'';

TRUE : 'TRUE' ;
FALSE : 'FALSE' ;

// ignore whitespace
WS : (' '|'\r'|'\t')+ -> skip ;

fragment
ESC : '\\' ( UNI_ESC |'b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\' );

fragment
UNI_ESC : 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT;

fragment
HEX_DIGIT : (DIGIT|'a'..'f'|'A'..'F') ;

fragment
DIGIT : [0-9] ;

//ATOM is all UPPER_CASE_NUMERIC
ATOM : ('A'..'Z')('A'..'Z'|'0'..'9'|'_')* ;

// TypeId is UpperCamelCaseNumeric
TYPE_ID : ('A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')* ;

//ID lowerCamelCaseAlphaNumeric
ID : ('a'..'z')('a'..'z'|'A'..'Z'|'0'..'9')* ;

NL : '\n'+ ;

COMMENT : '/*' ~[\r\n]* '*/' '\r'? '\n' ;
