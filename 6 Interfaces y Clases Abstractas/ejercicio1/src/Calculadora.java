public class Calculadora implements OperacionesMatematicas {

    @Override
    public double suma(double a, double b) {
        return a + b;
    }

    @Override
    public double resta(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplicacion(double a, double b) {
        return a * b;
    }

    @Override
    public double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }
        return a / b;
    }

}
