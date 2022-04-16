package expression;

public class AtribuicaoString extends Expression{
    public String id;
    public String value;

    public AtribuicaoString(String id, String value) {
        this.id = id;
        this.value = value;
    }
}
