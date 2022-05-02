package compilador.comparacao;

import compilador.Expression;

public class MaiorQue extends Comparacao {
    public MaiorQue(String left, String right, int line) {
        super(left, right, line);
    }

    @Override
    public String toString() {
        return getLeft() + " > " + getRight();
    }
}
