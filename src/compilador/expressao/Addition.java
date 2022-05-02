package compilador.expressao;

import compilador.Expression;

public class Addition extends Expr {

    public Addition(Expression left, Expression right, int line) {
        super(left, right, line);
    }

    @Override
    public String toString() {
        return getLeft().toString() + " + " + getRight().toString();
    }
}
