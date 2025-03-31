import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        SumaArray sumaArray = new SumaArray();
        int[] numeros = new int[10];
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(0,100);
    }
    int suma = SumaArray.sumarNumeros(numeros);
    System.out.println("La suma de los números es: " + suma);
    }
}