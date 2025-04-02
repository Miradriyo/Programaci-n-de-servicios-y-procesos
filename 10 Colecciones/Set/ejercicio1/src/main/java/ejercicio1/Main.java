package ejercicio1;

import java.util.*;

/*Crea un programa en Java que:
1. Declare un HashSet y añada nombres de personas, asegurándote de que algunos nombres se repitan.
2. Muestre el conjunto para que se vea que los duplicados se eliminan automáticamente.
3. Solicite al usuario un nombre y compruebe si está en el conjunto, mostrando un mensaje adecuado. */
public class Main {
    public static void main(String[] args) {
        HashSet<String> nombres = new HashSet<>();
        nombres.add("Yoel");
        nombres.add("Eloy");    
        nombres.add("Adri");
        nombres.add("Mireia");
        nombres.add("Adri"); //duplicado 

        System.out.println("Nombres: "+nombres);
        Scanner dato = new Scanner(System.in);
        System.out.println("Introduce un nombre:");
        String nombre = dato.nextLine();
        if(nombres.contains(nombre)){
            System.out.println("El nombre " + nombre + " está en el conjunto.");
        } else {
            System.out.println("El nombre " + nombre + " no está en el conjunto.");
        }
        dato.close();
    }
}