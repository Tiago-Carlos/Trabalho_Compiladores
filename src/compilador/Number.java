package compilador;

public class Number extends Expression{
    float num;

    public Number(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return Float.toString(num);
    }
}
