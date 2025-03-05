/*Crea una clase Vehiculo con atributos marca, modelo y kilometraje. 
Luego, crea una clase Coche que herede de Vehiculo y añade un atributo numeroDePuertas. 
Implementa los métodos para obtener y establecer el valor de los atributos. 
Crea instancias de Coche y utiliza los métodos heredados y propios. */
package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Coche coche1=new Coche("Seat","Leon",10000,5);
        System.out.println("Marca: "+coche1.getMarca());
        System.out.println("Modelo: "+coche1.getModelo());
        System.out.println("Kilometraje: "+coche1.getKilometraje());
        
    }
}