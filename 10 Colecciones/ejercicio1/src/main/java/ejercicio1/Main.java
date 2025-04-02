package ejercicio1;
import java.util.*;
/*Crea un programa en Java que:
1. Declare una ArrayList de números enteros.
2. Pida al usuario que introduzca 5 números enteros y los añada a la lista.
3. Muestre la lista completa.
4. Elimine el tercer elemento de la lista y muestre la lista actualizada.
5. Ordene la lista en orden ascendente y muestre el resultado */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner dato = new Scanner(System.in);
        System.out.println("Introduce 5 números enteros:");
        for (int i=0;i<5;i++){
            int numero= dato.nextInt();
             numeros.add(numero);
        }
        for (int j = 0; j < numeros.size(); j++) {
            System.out.println(numeros.get(j));
        }
        System.out.println("Eliminando el tercer elemento de la lista...");
        numeros.remove(2);
        for (int j = 0; j < numeros.size(); j++) {
            System.out.println(numeros.get(j));
        }
        System.out.println("Ordenando la lista en orden ascendente...");
        Collections.sort(numeros);
        for (int j = 0; j < numeros.size(); j++) {
            System.out.println(numeros.get(j));
        }
        dato.close();
    }
}