package ejercicio2;

import java.util.Scanner;

public class Motocicleta extends Vehiculo {

    private boolean tieneSidecar;

    //constructores
    public Motocicleta() {
    }

    public Motocicleta(String marca, String modelo, int año, boolean tieneSidecar) {
        super(marca, modelo, año);
        this.tieneSidecar = tieneSidecar;
    }

    //getters y setters
    public boolean isTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }

  public void mostratDatos() {
        super.mostratDatos();
        Scanner dato= new Scanner(System.in);
        System.out.println("¿Tiene sidecar? " + (tieneSidecar ? "Sí" : "No"));
        tieneSidecar = dato.nextBoolean();
        if (tieneSidecar) {
            System.out.println("La motocicleta tiene sidecar.");
        } else {
            System.out.println("La motocicleta no tiene sidecar.");
        }
        dato.close();
    }
}