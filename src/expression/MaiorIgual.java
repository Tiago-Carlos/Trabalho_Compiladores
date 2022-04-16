package expression;

public class MaiorIgual extends Expression{
    String left;
    String right;

    public MaiorIgual(String left, String right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return left + " >= " + right;
    }
}
