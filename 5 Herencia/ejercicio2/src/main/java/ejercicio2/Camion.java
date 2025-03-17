package ejercicio2;

public class Camion extends Vehiculo {

    private int capacidadCarga;

    //constructores
    public Camion() {
    }

    public Camion(String marca, String modelo, int año, int capacidadCarga) {
        super(marca, modelo, año);
        this.capacidadCarga = capacidadCarga;
    }

    //getters y setters
    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void mostratDatos() {
        super.mostratDatos();
        System.out.println("Capacidad de carga: " + capacidadCarga + " kg");
    }

}
