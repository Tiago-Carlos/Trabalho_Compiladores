grammar par;
import lex;

prog: DECLARACAO (decl)*
    ALGORITMO (expr)*
    ;

decl: TIPO_INT ID
    | TIPO_FLOAT ID
    | TIPO_STRING ID
    | TIPO_BOOL ID
    ;

expr: ATRIBUIR NUM A ID
    | ATRIBUIR STRING A ID
    | ATRIBUIR BOOL A ID
    | ATRIBUIR FLOAT A ID
    | ATRIBUIR comp A ID
    | ATRIBUIR oper A ID
    ;

comp: ID '>' ID
    | ID '<' ID
    | ID '>=' ID
    | ID '<=' ID
    | ID '==' ID
    | ID '!=' ID
;

oper: oper '+' oper         #Addition
    | oper '-' oper         #Subtraction
    | oper '*' oper         #Multiplication
    | oper '/' oper         #Division
    | oper '%' oper         #Modulo
    | ID                    #ID
    | NUM                   #Number
;