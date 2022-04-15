package expression;

public class Modulo extends Expression{
    Expression left;
    Expression right;

    public Modulo(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return left.toString() + " % " + right.toString();
    }
}
