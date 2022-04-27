package compilador.atribuicao;

import compilador.Expression;

public abstract class Atribuicao extends Expression {
    private int line;
    private String id;

    public Atribuicao(String id, int line) {
        this.id = id;
        this.line = line;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
