package expression;

public class MenorQue extends Expression{
    String left;
    String right;

    public MenorQue(String left, String right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return left + " < " + right;
    }
}
