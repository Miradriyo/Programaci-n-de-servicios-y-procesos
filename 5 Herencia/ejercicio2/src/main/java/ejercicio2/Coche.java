package ejercicio2;

public class Coche extends Vehiculo {

    private int numeroDePuertas;

    //constructores
    public Coche() {
    }

    public Coche(String marca, String modelo, int año, int numeroDePuertas) {
        super(marca, modelo, año);
        this.numeroDePuertas = numeroDePuertas;
    }

    //getters y setters

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    @Override
    public void mostratDatos() {
        super.mostratDatos();
        System.out.println("Número de puertas: " + numeroDePuertas);
    }

}
