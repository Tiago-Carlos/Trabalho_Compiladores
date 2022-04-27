package analizador.atribuicao;

import analizador.Expression;

public class AtribuicaoInt extends Expression {
    public String id;
    public int value;

    public AtribuicaoInt(String id, int value) {
        this.id = id;
        this.value = value;
    }
}
