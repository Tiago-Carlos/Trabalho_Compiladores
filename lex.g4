lexer grammar lex;

ATRIBUIR: 'ATRIBUIR';
A: 'A';

TIPO_INT: 'int';
TIPO_STRING: 'string';
TIPO_BOOL: 'bool';
TIPO_FLOAT: 'float';

BOOL: 'true' | 'false';
ID: [a-z][a-zA-Z0-9_]*;
COMMENT: '//' ~[\r\n]* -> skip;
WS: [ \t\n\r]+ ->skip;

NUM: '0' | '-'?[1-9][0-9]*;
STRING: '"' (~('\\'|'"') )* '"';
FLOAT: [0-9]*','[0-9]*;