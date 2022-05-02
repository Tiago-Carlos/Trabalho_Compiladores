package compilador.comparacao;

import compilador.Expression;

public class Igual extends Comparacao {
    public Igual(String left, String right, int line) {
        super(left, right, line);
    }

    @Override
    public String toString() {
        return getLeft() + " == " + getRight();
    }
}
