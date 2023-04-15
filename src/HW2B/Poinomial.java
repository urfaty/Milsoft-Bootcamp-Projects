package HW2B;

public class Poinomial implements Function {

    public double[] coefficients;


    public Poinomial(double[] coefficients) {
        this.coefficients = coefficients;
    }

    public double evaluate(double x) {
        double y = 0.0;
        for (int i = 0; i < coefficients.length; i++) {
            y += coefficients[i] * Math.pow(x, i);
        }
        return y;
    }
}
