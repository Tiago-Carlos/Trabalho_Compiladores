package compilador;

public class Number extends Expression{
    float num;

    public Number(int num, int line) {
        super(line);
        this.num = num;
    }

    @Override
    public String toString() {
        return Float.toString(num);
    }
}
