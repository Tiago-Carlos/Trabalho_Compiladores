package compilador.comparacao;

import compilador.Expression;

public class MenorQue extends Comparacao {
    public MenorQue(String left, String right, int line) {
        super(left, right, line);
    }

    @Override
    public String toString() {
        return getLeft() + " < " + getRight();
    }

}
