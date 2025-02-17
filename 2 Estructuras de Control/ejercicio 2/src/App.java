/*Escribe un programa que imprima los primeros 10 números de la serie Fibonacci. 
La serie Fibonacci es una secuencia donde cada número es la suma de los dos anteriores,
 empezando por 0 y 1. */
public class App {
    public static void main(String[] args) throws Exception {

        int n1=0;
        int n2=1;
        for (int i = 0; i < 10; i++) {
            System.out.println(n1);
            int n3=n1+n2;
            n1=n2;
            n2=n3;
        }
        
    }
}
