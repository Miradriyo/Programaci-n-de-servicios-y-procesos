package ejercicio4;

import java.util.Random;

/*Escribe un programa que defina una matriz de 4x4 y la llene con números secuenciales del 1 al 16. Luego, calcula e imprime la suma de los
elementos de la diagonal principal (de arriba a la izquierda hacia abajo a la derecha). */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int matriz[][] = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]= random.nextInt(1,16);
        }
    }
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            System.out.print(matriz[i][j] + " ");
        }
        System.out.println();
    }
        int sumaDiagonal = 0;
        for (int k = 0; k < matriz.length; k++) {
            sumaDiagonal += matriz[k][k];
        }
        System.out.println("La suma de la diagonal principal es: " + sumaDiagonal);
    }


}