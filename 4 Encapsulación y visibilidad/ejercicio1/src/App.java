/*Diseña una clase CuentaBancaria que encapsule el comportamiento de una cuenta.
 Debe tener los atributos privados titular y saldo, y los métodos públicos para depositar() 
 y retirar() dinero, así como getSaldo() para consultar el saldo. 
Implementa también un método mostrarInformacion() para imprimir el titular y el saldo de la cuenta. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("¿Qué desea hacer?");
        System.out.println("1. Crear cuenta bancaria");
        System.out.println("2. Depositar dinero");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Consultar saldo");
        System.out.println("5. Mostrar información de la cuenta");
        System.out.println("6. Salir");
        Scanner dato=new Scanner(System.in);
        int opcion=dato.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Introduzca el nombre del titular de la cuenta");
                Scanner titular=new Scanner(System.in);
                String nombre=titular.nextLine();
                double saldo=0;
                CuentaBancaria cuenta=new CuentaBancaria(nombre, saldo);
                break;
            case 2:
            default:
                break;
        }
    }
}
