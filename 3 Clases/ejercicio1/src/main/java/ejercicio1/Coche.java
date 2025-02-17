package ejercicio1;

public class Coche {

    private String modelo;
    private int velocidadMaxima;
    
    public Coche(String modelo, int velocidadMaxima) {
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarCaracteristicas(){
        System.out.println("El modelo es: "+modelo+ " y la velocidad máxima es: " + velocidadMaxima);
    }
}
