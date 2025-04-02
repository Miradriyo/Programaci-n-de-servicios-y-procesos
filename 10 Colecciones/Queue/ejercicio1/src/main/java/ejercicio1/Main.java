package ejercicio1;
/*Crea un programa en Java que:
1. Declare una LinkedList como una Queue y añada nombres de tareas en una lista de tareas pendientes.
2. Muestre la cola completa.
3. Procese la cola mostrando y eliminando cada tarea por el orden en que fueron añadidas,
 usando el método poll(). */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<String> tareasPendientes = new LinkedList<>();
        tareasPendientes.add("Cocinar");
        tareasPendientes.add("Limpiar");
        tareasPendientes.add("Estudiar");
        tareasPendientes.add("Hacer ejercicio");
        System.out.println("Lista de tareas pendientes: " + tareasPendientes);
        for (int i = 0; i < tareasPendientes.length; i++) {
            
        }
        
    }
}