package analizador.atribuicao;

import analizador.Expression;

public class AtribuicaoComparacao extends Expression {
    public String id;
    public Expression comparacao;

    public AtribuicaoComparacao(String id, Expression comparacao) {
        this.id = id;
        this.comparacao = comparacao;
    }
    @Override
    public String toString() {
        return id + " recebe (" + comparacao.toString();
    }
}
