package analizador.atribuicao;

import analizador.Expression;

public class AtribuicaoOperacao extends Expression {
    public String id;
    public Expression operacao;

    public AtribuicaoOperacao(String id, Expression operacao) {
        this.id = id;
        this.operacao = operacao;
    }
    @Override
    public String toString() {
        return id + " recebe (" + operacao.toString();
    }
}
