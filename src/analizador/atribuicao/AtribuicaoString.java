package analizador.atribuicao;

import analizador.Expression;

public class AtribuicaoString extends Atribuicao {
    private String value;

    public AtribuicaoString(String id, String value, int line) {
        super(id, line);
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
