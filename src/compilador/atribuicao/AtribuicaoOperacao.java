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
        if (operacao != null) {
            return "[" + getId() + "]" + " recebe " + operacao.toString();
        }
        return (char)27 + "[31m"+"(linha " + getLine() + ") - ERRO - Operação ilegal" + (char)27 + "[00;00m";
    }

    public Expression getOperacao() {
        return operacao;
    }

    public void setOperacao(Expression operacao) {
        this.operacao = operacao;
    }
}
