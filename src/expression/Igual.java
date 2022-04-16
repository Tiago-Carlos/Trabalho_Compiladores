package expression;

public class Igual extends Expression{
    String left;
    String right;

    public Igual(String left, String right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return left + " == " + right;
    }
}
