package compilador.declaracao;

import compilador.Expression;

public class DeclarationFloat extends Expression {
    public String id;
    public String type;
    public Float value;


    public DeclarationFloat(String id, String type, int line) {
        super(line);
        this.id = id;
        this.type = type;
        this.value = 0.0f;
    }
}