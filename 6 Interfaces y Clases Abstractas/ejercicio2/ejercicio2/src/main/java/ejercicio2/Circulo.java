package ejercicio2;

public class Circulo extends FiguraGeometrica {
    //atributo
    private double radio;
    //constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", area=" + calcularArea() +
                '}';
    }

}
