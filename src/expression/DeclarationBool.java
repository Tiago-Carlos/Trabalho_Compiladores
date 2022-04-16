package expression;

public class DeclarationBool extends Expression{
    public String id;
    public String type;
    public Boolean value;


    public DeclarationBool(String id, String type) {
        this.id = id;
        this.type = type;
        this.value = false;
    }
}
