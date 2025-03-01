public class CuentaBancaria {
private String titular;
private double saldo;

public CuentaBancaria(String titular, double saldoInicial) {
    this.titular = titular;
    this.saldo = saldoInicial;
}

//Depositar dinero
public void depositar(double cantidad){
    if(cantidad>0){
        saldo=saldo+cantidad;
        System.out.println("depósito realizado. Saldo: "+ saldo);
    }else{
        System.out.println("dato erróneo. Depósito tiene que ser mayor que 0€");
    }
}

//Retirar dinero
public double retirar(double cantidad){
    if (cantidad>0 && saldo >= cantidad) {
        saldo=saldo-cantidad;
        System.out.println("Cantidad retirada. Nuevo saldo: "+ saldo);
        return saldo;
    } else {
        System.out.println("No hay saldo suficiente o la cantidad es inválida");
        return saldo;
        
    }
}

//Mostrar información
public void mostrarInformacion(){
    System.out.println("Titular: "+ titular);
    System.out.println("Saldo: "+ saldo);
}

public double getSaldo(){
    return saldo;
}

public String getTitular(){
    return titular;
}
}
