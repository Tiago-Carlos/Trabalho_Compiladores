package analizador.atribuicao;

import analizador.Expression;

public class AtribuicaoFloat extends Atribuicao {
    private Float value;

    public AtribuicaoFloat(String id, Float value, int line) {
        super(id, line);
        this.value = value;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }
}
