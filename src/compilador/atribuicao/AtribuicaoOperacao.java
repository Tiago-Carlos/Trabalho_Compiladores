package compilador.atribuicao;

import compilador.Expression;
import compilador.expressao.Expr;

public class AtribuicaoOperacao extends Atribuicao {
    private Expr operacao;

    public AtribuicaoOperacao(String id, Expression operacao, int line) {
        super(id, line);
        this.operacao = (Expr) operacao;
    }
    @Override
    public String toString() {
        if ((operacao != null) && (operacao.getLeft() != null) && (operacao.getRight() != null)) {
            return "[" + getId() + "]" + " recebeu " + operacao.toString();
        }
        return (char)27 + "[31m"+"(linha " + getLine() + ") - ERRO - Operação ilegal" + (char)27 + "[00;00m";
    }

    public Expr getOperacao() {
        return operacao;
    }

    public void setOperacao(Expr operacao) {
        this.operacao = operacao;
    }
}
