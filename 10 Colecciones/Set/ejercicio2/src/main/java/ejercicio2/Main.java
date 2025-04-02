package ejercicio2;

import java.util.*;

/*Ejercicio 2:
Crea un programa en Java que:
1. Declare un TreeSet y añada números enteros.
2. Muestre el conjunto para ver que los elementos se ordenan automáticamente.
3. Utiliza el método first() para mostrar el primer elemento y last() para mostrar el último.
4. Pida al usuario un número y utilice higher() y lower() para encontrar el siguiente número más alto y el anterior número más bajo en el
conjunto, respectivamente. */
public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(2);
        System.out.println("Conjunto ordenado: " + treeSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        Scanner dato=new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero = dato.nextInt();
        Integer siguiente = treeSet.higher(numero);
        Integer anterior = treeSet.lower(numero);
        if (siguiente != null) {
            System.out.println("El siguiente número más alto es: " + siguiente);
        } else {
            System.out.println("No hay un número más alto que " + numero);
        }
        if (anterior != null) {
            System.out.println("El número anterior más bajo es: " + anterior);
        } else {
            System.out.println("No hay un número más bajo que " + numero);
        }
        dato.close();
    }
}