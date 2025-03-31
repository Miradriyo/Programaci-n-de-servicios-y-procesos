package ejercicio3;

import java.util.Random;

/*Crea una matriz de 3x3 de tipo int y llénala con números aleatorios del 1 al 9. Después, imprime la matriz en formato de cuadrícula, mostrando
los números en su disposición de filas y columnas. */
public class Main {
    public static void main(String[] args) {
        int matriz [][] = new int[3][3];
        // Llenar la matriz con números aleatorios del 1 al 9
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(0,9);
            }
        }
        // Imprimir la matriz en formato de cuadrícula
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}