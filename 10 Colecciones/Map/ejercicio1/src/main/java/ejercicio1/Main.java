package ejercicio1;
/*Ejercicio 1:
Crea un programa en Java que:
1. Declare un HashMap y añada pares de palabras (palabra y sinónimo).
2. Muestre el contenido del Map.
3. Solicite al usuario una palabra y muestre su sinónimo si está en el Map, o un mensaje indicando que no se encontró */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> palabras = new HashMap<>();
        // Agregamos las palabras en ambos sentidos
        palabras.put("ordenador", "pc");
        palabras.put("pc", "ordenador");
        palabras.put("ratón", "mouse");
        palabras.put("mouse", "ratón");
        palabras.put("teclado", "keyboard");
        palabras.put("keyboard", "teclado");
        palabras.put("pantalla", "monitor");
        palabras.put("monitor", "pantalla");

        System.out.println(palabras);
        Scanner datos = new Scanner(System.in);
        System.out.println("Introduce una palabra relacionada con la informática:");
        String palabra = datos.nextLine().toLowerCase();
        if (palabras.containsKey(palabra)) {
            System.out.println("El sinónimo de " + palabra + " es: " + palabras.get(palabra));
        } else {
            System.out.println("No se encontró el sinónimo de " + palabra);
        }
        datos.close();
    }
}