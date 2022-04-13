lexer grammar lex;

DECLARACAO: ':DECLARACAO';
ALGORITMO: ':ALGORITMO';

ATRIBUIR: 'ATRIBUIR';
A: 'A';

TIPO_INT: 'int';
TIPO_STRING: 'string';
TIPO_BOOL: 'bool';
TIPO_FLOAT: 'float';

ID: [a-z][a-zA-Z0-9_]*;
COMMENT: '//' ~[\r\n]* -> skip;
WS: [ \t\n]+ ->skip;

NUM: '0' | '-'?[1-9][0-9]*;
STRING: '"' (~('\\'|'"') )* '"';
BOOL: 'true' | 'false';
FLOAT: [0-9]*','[0-9]*;