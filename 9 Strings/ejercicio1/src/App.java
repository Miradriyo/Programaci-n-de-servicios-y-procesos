/*Crea un programa en Java que realice las siguientes acciones:
1. Solicita al usuario que introduzca dos cadenas de texto (String) por consola.
2. Concatena ambas cadenas en una nueva variable.
3. Muestra la cadena resultante.
4. Pide al usuario que introduzca un carácter y busca ese carácter en la cadena concatenada, mostrando la posición en la que se encuentra.
Si no se encuentra, muestra un mensaje indicando que el carácter no está presente. */
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner datos = new Scanner(System.in);
        String cadena1;
        String cadena2;
        System.out.println("Introduce una cadena de texto");
        cadena1 = datos.nextLine();
        System.out.println("Introduce otra cadena de texto");
        cadena2 = datos.nextLine();
        String cadenaConcatenada = cadena1 + " " + cadena2;
        System.out.println("La cadena concatenada es: " + cadenaConcatenada);
        System.out.println("Introduce un caracter a buscar en la cadena concatenada: ");
        char caracter=datos.next().charAt(0);
        int posicion = cadenaConcatenada.indexOf(caracter);
        if (posicion != -1) {
            System.out.println("El caracter " + caracter + " se encuentra en la posicion: " + posicion);
        } else {
            System.out.println("El caracter " + caracter + " no se encuentra en la cadena concatenada.");
        }
        datos.close();
    }
}
