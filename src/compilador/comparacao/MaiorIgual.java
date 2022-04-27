package compilador.comparacao;

import compilador.Expression;

public class MaiorIgual extends Expression {
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

    public String getLeft() {
        return left;
    }

    public void setLeft(String left) {
        this.left = left;
    }

    public String getRight() {
        return right;
    }

    public void setRight(String right) {
        this.right = right;
    }
}
