package expression;

public class Diferente extends Expression{
    String left;
    String right;

    public Diferente(String left, String right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return left + " != " + right;
    }
}
