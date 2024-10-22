package compilador.comparacao;

import compilador.Expression;

public class Comparacao extends Expression {
    String left;
    String right;

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

    public Comparacao (String left, String right, int line) {
        super(line);
        this.left = left;
        this.right = right;
    }

}
