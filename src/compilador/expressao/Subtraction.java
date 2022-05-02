package compilador.expressao;

import compilador.Expression;

public class Subtraction extends Expr {
    public Subtraction(Expression left, Expression right, int line) {
        super(left, right, line);
    }

    @Override
    public String toString() {
        return getLeft().toString() + " - " + getRight().toString();
    }
}
