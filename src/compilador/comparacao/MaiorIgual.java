package compilador.comparacao;

import compilador.Expression;

public class MaiorIgual extends Comparacao {

    public MaiorIgual(String left, String right, int line) {
        super(left, right, line);
    }

    @Override
    public String toString() {
        return getLeft() + " >= " + getRight();
    }

}
