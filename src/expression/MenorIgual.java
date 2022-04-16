package expression;

public class MenorIgual extends Expression{
    String left;
    String right;

    public MenorIgual(String left, String right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return left + " <=>= " + right;
    }
}
