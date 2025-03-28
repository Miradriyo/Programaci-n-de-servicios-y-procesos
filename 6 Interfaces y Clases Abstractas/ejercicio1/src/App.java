import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        double a = dato.nextDouble();
        System.out.println("Ingrese el segundo número: ");
        double b = dato.nextDouble();
        System.out.println("Ingrese la operación que desea realizar: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        int opcion = dato.nextInt();
        Calculadora calculadora = new Calculadora();
        double resultado = 0;
        switch (opcion) {
            case 1:
                resultado = calculadora.suma(a, b);
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:
                resultado = calculadora.resta(a, b);
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 3:
                resultado = calculadora.multiplicacion(a, b);
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case 4:
                try {
                    resultado = calculadora.division(a, b);
                    System.out.println("El resultado de la división es: " + resultado);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Opción no válida.");
        }
        dato.close();
    }
}
