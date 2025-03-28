package ejercicio2;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de las figuras
        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(4, 6);
        Triangulo triangulo = new Triangulo(3, 4);

        // Imprimir los detalles de cada figura
        System.out.println(circulo);
        System.out.println(rectangulo);
        System.out.println(triangulo);
    }
}