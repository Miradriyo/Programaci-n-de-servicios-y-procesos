public class Coche extends Vehiculos {
    private int numeroDePuertas;

    public Coche(String marca, String modelo, int kilometraje, int numeroDePuertas) {
        super(marca, modelo, kilometraje);
        this.numeroDePuertas = numeroDePuertas;
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

}
