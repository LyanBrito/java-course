package aula8;

import java.util.Scanner;

public class Soma2x3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[2][3];

        System.out.println("digite os valores da matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        int soma = 0;
        for (int[] row : matriz) {
            for (int i : row) {
                soma += i + row[i];
            }
            System.out.println("a soma é" + soma);
        }
    }
}
