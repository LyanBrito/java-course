package aula8;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] notas = new int[4];

        System.out.println("Digite as notas:");
        for (int i = 0; i < notas.length; i++) {
            notas[i] = sc.nextInt();
        }
        double media = 0;
        for (int nota : notas) {
            media += nota;
        }
        media = media / notas.length;
        System.out.println(media);
    }
}
