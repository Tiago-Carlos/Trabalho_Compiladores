package expression;

public class AtribuicaoFloat extends Expression{
    public String id;
    public Float value;

    public AtribuicaoFloat(String id, Float value) {
        this.id = id;
        this.value = value;
    }
}
