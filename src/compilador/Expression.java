package compilador;

public abstract class Expression {
    private int line;

    public Expression(int line) {
        this.line = line;
    }
    public int getLine() {
        return line;
    }
    public void setLine(int line) {
        this.line = line;
    }
}
