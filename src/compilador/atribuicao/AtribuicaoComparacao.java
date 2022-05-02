package compilador.atribuicao;

import compilador.Expression;

public class AtribuicaoComparacao extends Atribuicao {
    private Expression comparacao;

    public AtribuicaoComparacao(String id, Expression comparacao, int line) {
        super(id, line);
        this.comparacao = comparacao;
    }
    @Override
    public String toString() {
        return "["+getId()+"]" + " recebeu " + comparacao.toString();
    }

    public Expression getComparacao() {
        return comparacao;
    }

    public void setComparacao(Expression comparacao) {
        this.comparacao = comparacao;
    }
}
