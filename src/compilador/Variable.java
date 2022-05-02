package compilador;

public class Variable extends Expression{
    String id;
    public Variable(String id, int line) {
        super(line);
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
