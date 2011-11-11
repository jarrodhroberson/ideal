grammar Ideal;

options { 
    output = AST; 
    language = Java; 
}
	
@header { package ideal; }

@lexer::header { package ideal; }

program : (statement'.')* ;

function : ID '(' args ')' ('->' (statement | expression) (',' (statement | expression))*)? ;	

args 	: arg (',' arg)*;		

arg 	: ID ('->' expression)?;

statement : assignment 
          | function
          ;

assignment : ID '->' (expression | function | string) ;	

string 	: UNICODE_STRING;
	
number : HEX_NUMBER 
       | (INTEGER '.' INTEGER)=> INTEGER '.' INTEGER
       | INTEGER;

// expressions

term 	: ID | '(' expression ')' | number ;

negation : '!'* term;	

unary 	: ('+'|'-')* negation;

mult 	: unary (('*' | '/' | ('%'|'mod') ) unary)*;	

add 	: mult (('+' | '-') mult)*; 

relation : add (('=' | '!=' | '<' | '<=' | '>=' | '>') add)*;
			
expression :	relation (('&&' | '||') relation)*;

// ================================================================

HEX_NUMBER : '0x' HEX_DIGIT+;

INTEGER : DIGIT+;

UNICODE_STRING 	: '"' (ESC | ~('\u0000'..'\u001f' | '\\' | '\"' ) )* '"'
                | '\'' (ESC | ~('\u0000'..'\u001f' | '\\' | '\'' ) )* '\'';

WS: (' '|'\n'|'\r'|'\t')+ {$channel = HIDDEN;} ; // ignore whitespace

fragment 
ESC   	:   '\\' (UNI_ESC |'b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\');

fragment 
UNI_ESC	: 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
DIGIT   :   ('0'..'9');

ATOM 	: ('A'..'Z'|'_')+;

ID  :   ('a'..'z'|'_')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

COMMENT : '/*' .* '*/' {$channel = HIDDEN;};




