/*Crea un programa que pida al usuario un número y determine si es par o impar 
utilizando una estructura if-else. Además, el programa debe permitir al usuario 
introducir números hasta que ingrese un 0, momento en el cual el programa terminará. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner dato =  new Scanner(System.in); 
       
        int numero= dato.nextInt();
        if (numero!=0) {
            if (numero %2 == 0){
                System.out.println("El número es par");
            }else{
                System.out.println("El numero es impar");
            }
        } else {
            System.out.println("introduce un número");
        }
        dato.close();
    }
}
