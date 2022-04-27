package compilador.atribuicao;

public class AtribuicaoBool extends Atribuicao {
    private boolean value;

    public AtribuicaoBool(String id, boolean value, int line) {
        super(id, line);
        this.value = value;
    }

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }
}
