package ejercicio2;

public class Triangulo extends FiguraGeometrica {
    //atributos
    private double base;
    private double altura;

    //constructor
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", area=" + calcularArea() +
                '}';
    }

}
