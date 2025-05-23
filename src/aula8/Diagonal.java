package aula8;

import java.util.Random;

public class Diagonal {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] matriz = new int[3][3];

        System.out.println("Valores da matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf(String.valueOf(matriz[i][j] = rand.nextInt(100)) + "\t");
            }
            System.out.print("\n");
        }
        System.out.print("\nValores da diagonal principal: \n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
               if (i == j){
                   System.out.println(matriz[i][j]);
               }


            }
        }
    }
}
