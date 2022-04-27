package compilador.atribuicao;

import compilador.Expression;

public class AtribuicaoOperacao extends Atribuicao {
    private Expression operacao;

    public AtribuicaoOperacao(String id, Expression operacao, int line) {
        super(id, line);
        this.operacao = operacao;
    }
    @Override
    public String toString() {
        return getId() + " recebe (" + operacao.toString();
    }

    public Expression getOperacao() {
        return operacao;
    }

    public void setOperacao(Expression operacao) {
        this.operacao = operacao;
    }
}
