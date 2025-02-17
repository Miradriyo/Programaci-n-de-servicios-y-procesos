package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

/*Define una clase Coche que tenga como atributos el modelo y la velocidadMaxima. 
Añade un método mostrarCaracteristicas() que imprima los datos del coche. 
Crea una instancia de esta clase en el main y llama al método mostrarCaracteristicas().*/
public class Main {
    public static void main(String[] args) {
        Scanner dato= new Scanner (System.in);
        ArrayList<Coche> listacoches = new ArrayList<>();
        char respuesta='S';
        do {
            System.out.println("Introduzca modelo");
            String modelo=dato.nextLine();
            System.out.println("introduzca velocidad máxima");
            int velocidadMaxima=dato.nextInt();
            dato.nextLine();
            Coche coche=new Coche(modelo, velocidadMaxima);
            listacoches.add(coche);

            System.out.println("¿Sigo agregando coches? (S/N");
            respuesta = dato.nextLine().toUpperCase().charAt(0);
        } while (respuesta == 'S');

        System.out.println("Los coches ingresados son: ");
        for (Coche coche :  listacoches){
            coche.mostrarCaracteristicas();
        }
        dato.close();
    }
}