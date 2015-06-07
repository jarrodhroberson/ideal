grammar Ideal;

// expressions

parse : statement (NL statement)* EOF ;

statement : assignment '.' #assignmentStatement
          | empty_line     #emptyLineStatement
          ;

assignment : ID LPAREN parameters RPAREN (assignment ',' NL )*  expression    #functionAssignment
           | ID LPAREN pattern_match RPAREN (assignment ',' NL )*  expression #patternMatchAssignment
           | ID '->' expression   #idAssignment
           | ATOM '->' expression #atomAssignment
           ;

pattern_match : key_value (',' key_value )* ;

key_value : ID ':' expression #expressionKeyValue
          ;

parameters : ID (',' ID)* ;

expression : expression POWER expression      #powerExpression
           | expression MULTIPLY expression   #multiplyExpression
           | expression DIVIDE expression     #divideExpression
           | expression ADD expression        #addExpression
           | expression SUBTRACT expression   #substractExpression
           | LPAREN expression RPAREN         #parenExpression
           | expression comparison expression #booleanExpression
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

empty_line : WS* NL+ ;

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

//ID lowerCamelCaseAlphaNumeric_
ID : ('a'..'z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;

NL : '\n';

COMMENT : '/*' ~[\r\n]* '*/' '\r'? '\n' ;
