package compilador.comparacao;

import compilador.Expression;

public class Diferente extends Comparacao {

    public Diferente(String left, String right, int line) {
        super(left, right, line);
    }

    @Override
    public String toString() {
        return getLeft() + " != " + getRight();
    }
}
