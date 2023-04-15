package HW2B;

public class Sinusoidal implements Function {
    private final double a;
    private final double b;
    private final double c;

    public Sinusoidal(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double evaluate(double x) {
        double y = a * Math.sin(b * x + c);
        return y;
    }
}