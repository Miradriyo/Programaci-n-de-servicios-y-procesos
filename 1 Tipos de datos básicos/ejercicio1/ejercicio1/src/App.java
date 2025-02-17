/*Crea un programa que solicite al usuario introducir su edad y su altura. 
La edad debe almacenarse en una variable de tipo int, 
y la altura en una variable de tipo double. 
Posteriormente, el programa debe imprimir ambos valores con un mensaje apropiado. */
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner dato = new Scanner(System.in);
        
        System.out.println("Introduzca su edad");
        int edad=dato.nextInt();
        System.out.println("Introduzca la altura");
        double altura=dato.nextDouble();
        System.out.println("La edad es " + edad+ " y la altura es: "+ altura);
        dato.close();
    }
}
