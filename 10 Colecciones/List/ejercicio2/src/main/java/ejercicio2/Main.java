package ejercicio2;

import java.util.*;

/*Crea un programa en Java que:
1. Declare una LinkedList de cadenas de texto (Strings).
2. Añada a la lista las siguientes cadenas: "Java", "Python", "C++", "JavaScript".
3. Muestre la lista.
4. Solicite al usuario una cadena de texto para buscar en la lista y muestre si está o no presente.
5. Invierta el orden de los elementos en la lista y muestre el resultado. */
public class Main {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("C++");
        lista.add("JavaScript");
        System.out.println("Lista original: " + lista);
        Scanner datos = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto para buscar en la lista: ");
        String cadena = datos.nextLine();
        if (lista.contains(cadena)) {
            System.out.println("La cadena '" + cadena + "' está presente en la lista.");
        } else {
            System.out.println("La cadena '" + cadena + "' no está presente en la lista.");
        }
        Collections.reverse(lista);
        System.out.println("Lista invertida: " + lista);
        datos.close();
    }
}