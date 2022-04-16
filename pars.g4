grammar pars;
import lex;

prog: ':DECLARACAO' (decl)* ':ALGORITMO' (atri)*         #Program
    ;

decl: TIPO_INT ID             #DeclaracaoInt
    | TIPO_FLOAT ID           #DeclaracaoFloat
    | TIPO_STRING ID          #DeclaracaoString
    | TIPO_BOOL ID            #DeclaracaoBool
    ;

atri: ATRIBUIR NUM A ID       #AtribuirNum
    | ATRIBUIR STRING A ID    #AtribuirString
    | ATRIBUIR BOOL A ID      #AtribuirBool
    | ATRIBUIR FLOAT A ID     #AtribuirFloat
    | ATRIBUIR comp A ID      #AtribuirComparation
    | ATRIBUIR expr A ID      #AtribuirOperation
    ;

comp: ID '>' ID               #MaiorQue
    | ID '<' ID               #MenorQue
    | ID '>=' ID              #MaiorIgual
    | ID '<=' ID              #MenorIgual
    | ID '==' ID              #Igual
    | ID '!=' ID              #Diferente
;

expr: expr '+' expr           #Addition
    | expr '-' expr           #Subtraction
    | expr '*' expr           #Multiplication
    | expr '/' expr           #Division
    | expr '%' expr           #Modulo
    | ID                      #ID
    | NUM                     #Number
;