package analizador.comparacao;

import analizador.Expression;

public class Diferente extends Expression {
    String left;

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
