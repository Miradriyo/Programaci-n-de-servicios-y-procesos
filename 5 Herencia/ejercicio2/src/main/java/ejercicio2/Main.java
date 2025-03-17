package ejercicio2;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de diferentes vehículos
        Coche coche = new Coche("Toyota", "Corolla", 2022, 4);
        Motocicleta moto = new Motocicleta("Honda", "CBR", 2023, true);
        Camion camion = new Camion("Volvo", "FH16", 2021, 20000);
        // Mostrar información de cada vehículo
        System.out.println("=== Información del Coche ===");
        coche.mostratDatos();
        
        System.out.println("\n=== Información de la Motocicleta ===");
        moto.mostratDatos();
        
        System.out.println("\n=== Información del Camión ===");
        camion.mostratDatos();
    }
}