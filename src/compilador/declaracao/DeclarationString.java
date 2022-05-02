package compilador.declaracao;

import compilador.Expression;

public class DeclarationString extends Expression {
    public String id;
    public String value;


    public DeclarationString(String id, String value, int line) {
        super(line);
        this.id = id;
        this.value = value;
    }
}
