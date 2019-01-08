grammar idl ;

type_def : TYPE_ID (':' TYPE_ID)* ':' LPAREN '(' ')' RPAREN
         ;

invocation : ATTRIBUTE_ID LPAREN key_value (',' key_value )* RPAREN
           | TYPE_ID LPAREN key_value (',' key_value )* RPAREN
           ;

key_value : ATTRIBUTE_ID ':' (expression) #expressionKeyValue ;

expression : expression comparison expression           #booleanExpression
           | expression POWER expression                #powerExpression
           | expression MODULO expression               #moduloExpression
           | expression MULTIPLY expression             #multiplyExpression
           | expression DIVIDE expression               #divideExpression
           | expression ADD expression                  #addExpression
           | expression SUBTRACT expression             #substractExpression
           | LPAREN expression RPAREN                   #parenExpression
           | ATTRIBUTE_ID LBRACKET expression RBRACKET  #arrayElementExpression
           | term                                       #termExpression
           ;

comparison : EQUAL                  #eq
           | NOT_EQUAL              #ne
           | LESS_THAN              #lt
           | LESS_THAN_OR_EQUAL     #lte
           | GREATER_THAN           #gt
           | GREATER_THAN_OR_EQUAL  #gte
           | term '|' term '|' term #betweenInclusive
           | term '|' term '<' term #betweenStartInclusive
           | term '>' term '|' term #betweenEndInclusive
           | term '>' term '<' term #betweenExclusive
           ;

term : ATTRIBUTE_ID LPAREN key_value (',' key_value )* RPAREN #invocationTerm
     | unary                                                  #unaryTerm
     | string                                                 #stringTerm
     | bool                                                   #booleanTerm
     | ATTRIBUTE_ID                                           #idTerm
     | ATOM                                                   #atomTerm
     ;
unary : ('+'|'-')? number ;

regex : '/' '^'? ( PRINTABLE_UNICODE+ )+ '$'? '/' option_flags? ;

option_flags
 : option_flag+
 ;

option_flag
 : 'i'
 | 'J'
 | 'm'
 | 's'
 | 'U'
 | 'x'
 ;

string : STRING ;

number : HEX_NUMBER #hexNumber
       | DECIMAL    #decimalNumber
       | INTEGER    #integerNumber
       ;

and_or : AND #and
       | OR  #or
       ;

bool : TRUE | FALSE ;

// LEXER ================================================================

SORT : '<=>';
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

STRING : '\'' ( ESC | ~('\u0000'..'\u001f' | '\\' | '"' ) )* '\''
       | '"' ( ESC | ~('\u0000'..'\u001f' | '\\' | '\'' ) )* '"'
       | '"""' ( '\\' UNI_ESC | ('\u0000'..'\u0fff') )* '"""'
       ;

PRINTABLE_UNICODE : ~('\u0000'..'\u001f') ;

TRUE : 'TRUE' ;
FALSE : 'FALSE' ;

// ignore whitespace
WS : (' '|'\r'|'\t')+ -> skip ;

fragment
ASCII : ( '\u0020'..'\u007F' )* ;

ESC : '\\' ( UNI_ESC |'b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\' );

fragment
UNI_ESC : 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT;

fragment
HEX_DIGIT : (DIGIT|'a'..'f'|'A'..'F') ;

fragment
DIGIT : [0-9] ;

//ATOM is all UPPER_CASE_NUMERIC_UNDERSCORE
ATOM : ('A'..'Z')('A'..'Z'|'0'..'9'|'_')* ;

// TypeId is UpperCamelCaseNumeric
TYPE_ID : ('A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')* ;

//AttributeId lowerCamelCaseAlphaNumeric
ATTRIBUTE_ID : ('a'..'z')('a'..'z'|'A'..'Z'|'0'..'9')* ;

NL : '\n' ;

COMMENT : '/*' ~[\r\n]* '*/' '\r'? '\n' ;
