package analizador.atribuicao;

import analizador.Expression;

public class AtribuicaoInt extends Atribuicao {
    private int value;

    public AtribuicaoInt(String id, int value, int line) {
        super(id, line);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
