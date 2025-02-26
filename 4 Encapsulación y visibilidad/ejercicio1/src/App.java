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

        ArrayList<CuentaBancaria> cuentasBancarias = new ArrayList<>(); // Creamos un ArrayList para guardar objetos CuentaBancaria
        switch (opcion) {
            case 1:
                System.out.println("Introduzca el nombre del titular de la cuenta");
                Scanner titular=new Scanner(System.in);
                String nombre=titular.nextLine();
                double saldo=0; //el sldo inicial es 0 porque acabamos de crear la cuenta
                CuentaBancaria cuenta=new CuentaBancaria(nombre, saldo);
                cuentasBancarias.add(cuenta) //agregamos la cuenta creada
                System.out.println("Cuenta bancaria creada a nombre de: "+ nombre);
                titular.close();
                break;
            case 2: //pedir al usuario que elija cual quiere usar, pedirle cantidad a depositar y realizar el depósito
                System.out.println("Introduzca el nombre de la cuenta");
                Scanner titular= new Scanner(SysteScannerm.in);
                String nombreTitular=titular.nextLine();
                for (CuentaBancaria cuenta:cuentasBancarias){ //Recorremos la lista de cuentas
                    if()
                }
                double deposito.depositar();
            default:
                break;
        }
      }
    }
}
