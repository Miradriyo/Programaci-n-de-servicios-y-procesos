public class Calculadora {
private int n1; 
private int n2;

public Calculadora(int n1, int n2) {
    this.n1 = n1;
    this.n2 = n2;
}

public int sumar(){
    int resultado= n1+n2;
    return resultado;
}

public int restar(){
    int resultado=n1-n2;
    return resultado;
}

public int multiplicar(){
    int resultado= n1*n2;
    return resultado;
}

public double dividir(){
    if (n2==0) {
        System.out.println("No se puede dividir entre cero");
        return Double.NaN;
    } else {return (double) n1/n2;
        
    }
}
}
