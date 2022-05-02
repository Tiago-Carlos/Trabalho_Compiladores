package compilador.expressao;

import compilador.Expression;

public class Multiplication extends Expr {
    public Multiplication(Expression left, Expression right, int line) {
        super(left, right, line);
    }

    @Override
    public String toString() {
        return left.toString() + " * " + right.toString();
    }
}
