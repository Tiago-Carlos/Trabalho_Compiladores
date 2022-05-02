package compilador.comparacao;

import compilador.Expression;

public class MenorIgual extends Comparacao {
    public MenorIgual(String left, String right, int line) {
        super(left, right, line);
    }

    @Override
    public String toString() {
        return getLeft() + " <=>= " + getRight();
    }
}
