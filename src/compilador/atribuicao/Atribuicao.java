package compilador.atribuicao;

import compilador.Expression;

public abstract class Atribuicao extends Expression {
    private String id;

    public Atribuicao(String id, int line) {
        super(line);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
