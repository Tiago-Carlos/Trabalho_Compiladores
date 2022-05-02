package compilador.expressao;

import compilador.Expression;

public abstract class Expr extends Expression {
    Expression left;
    Expression right;

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }
    public Expr(Expression left, Expression right, int line) {
        super(line);
        this.left = left;
        this.right = right;
    }
}
