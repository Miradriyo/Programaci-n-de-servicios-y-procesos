/*Diseña una clase CuentaBancaria que encapsule el comportamiento de una cuenta.
 Debe tener los atributos privados titular y saldo, y los métodos públicos para depositar() 
 y retirar() dinero, así como getSaldo() para consultar el saldo. 
Implementa también un método mostrarInformacion() para imprimir el titular y el saldo de la cuenta. */

public class App {
    
    public static void main(String[] args) throws Exception {
        CuentaBancaria cuenta1 = new CuentaBancaria("Mireia", 100);
        
        System.out.println("Cuenta de " + cuenta1.getTitular());
        System.out.println("Saldo inicial: " + cuenta1.getSaldo());

        cuenta1.depositar(1000);
        cuenta1.retirar(200);

        cuenta1.mostrarInformacion();

    }
}