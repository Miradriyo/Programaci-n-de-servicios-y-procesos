/*Crea una clase Calculadora que contenga métodos para sumar, restar, multiplicar y dividir dos números 
pasados como parámetros. 
Luego, crea una instancia de esta clase en el main y utiliza cada uno de los métodos. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner dato = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int n1=dato.nextInt();
        System.out.println("Introduzca otro número");       
        int n2=dato.nextInt();
        dato.nextLine();
        Calculadora calculadora=new Calculadora(n1, n2);
        System.out.println("¿Qué desea hacer? Presione número de la opción correcta");
        System.out.println("1-Suma");
        System.out.println("2-Resta");
        System.out.println("3 Multiplicación");
        System.out.println("4 División");
        int opcion=dato.nextInt();

        switch (opcion) {
            case 1:
                int suma=calculadora.sumar();
                System.out.println(suma);
                break;
            case 2:
                int resta=calculadora.restar();
                System.out.println(resta);
                break;
            case 3:
                int multiplicación=calculadora.multiplicar();
                System.out.println(multiplicación);
            case 4:
                double dividir=calculadora.dividir();
                System.out.println(dividir);
            default:
                System.out.println("No es una elección válida");
                break;
        }
        dato.close();
    }
}
