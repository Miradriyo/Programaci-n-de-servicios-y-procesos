/*Escribe un programa que convierta grados Celsius a Fahrenheit. 
El usuario debe ingresar la temperatura en Celsius como un float, 
y el programa debe mostrar el resultado en Fahrenheit utilizando el tipo double. 
La fórmula para la conversión es F = C * 9/5 + 32. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduzca Grados Celsius: ");
        Scanner dato = new Scanner(System.in);
        float celsius=dato.nextFloat();

        double Fahrenheit=celsius*9/5+32;
        
        System.out.println(celsius + "Celsius son: "+ Fahrenheit);
        dato.close();
    }
}
