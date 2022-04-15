grammar Expr;

@header {
package antlr;
}

prog: (decl | expr)+EOF      #Program
    ;

decl: ID ':'INT_TYPE '=' NUM #Declaration
    ;

expr: expr '*' expr          #Multiplication
    | expr '+' expr          #Addition
    | expr '/' expr          #Division
    | expr '%' expr          #Module
    | ID                     #Variable
    | NUM                    #Number
    ;
ID : [a-z][a-zA-Z0-9_]*
   ;
NUM : '0' | '-'?[1-9][0-9]*
    ;
INT_TYPE: 'INT'
        ;
COMMENT : '--' ~[\r\n]* -> skip
        ;
WS : [ \t\n\r]+ ->skip
   ;