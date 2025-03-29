package ejercicio1;

import java.util.Random;

/*Crea un array de enteros de tamaño 10. Llena el array con números aleatorios del 1 al 100 y luego imprime todos los elementos del array en
orden. A continuación, imprime los elementos del array en orden inverso. */
public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        // Llenar el array con números aleatorios del 1 al 100
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100)+1; //le sumo 1 para que genere desde el 1 y no el 0
        }
        // Imprimir el array en orden
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}