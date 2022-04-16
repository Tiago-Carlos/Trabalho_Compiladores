package expression;

public class MaiorQue extends Expression{
    String left;
    String right;

    public MaiorQue(String left, String right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return left + " > " + right;
    }
}
