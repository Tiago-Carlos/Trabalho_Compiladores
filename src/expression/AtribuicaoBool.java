package expression;

public class AtribuicaoBool extends Expression{
    public String id;
    public boolean value;

    public AtribuicaoBool(String id, boolean value) {
        this.id = id;
        this.value = value;
    }
}
