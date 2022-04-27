package analizador.declaracao;

import analizador.Expression;

public class DeclarationInt extends Expression {
    public String id;
    public String type;
    public int value;


    public DeclarationInt(String id, String type) {
        this.id = id;
        this.type = type;
        this.value = 0;
    }
}
