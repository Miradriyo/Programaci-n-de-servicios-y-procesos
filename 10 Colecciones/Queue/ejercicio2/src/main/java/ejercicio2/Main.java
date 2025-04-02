package ejercicio2;
/*Crea un programa en Java que:
1. Declare una PriorityQueue de números enteros.
2. Añada números aleatorios a la cola.
3. Muestre cómo, al recuperar y eliminar los elementos con poll(), se obtienen en un orden basado 
en su prioridad natural (menor a mayor). */
import java.util.PriorityQueue;
public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(1);
        queue.add(3);
        queue.add(2);
        while (queue.size() > 0) {
            System.out.println(queue.poll());
            
        }

    }
}