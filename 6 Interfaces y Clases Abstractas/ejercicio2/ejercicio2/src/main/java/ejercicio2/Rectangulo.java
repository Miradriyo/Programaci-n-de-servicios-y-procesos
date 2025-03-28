package ejercicio2;

public class Rectangulo extends FiguraGeometrica {
    //atributos
    private double base;
    private double altura;

    //constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", area=" + calcularArea() +
                '}';
    }

}
