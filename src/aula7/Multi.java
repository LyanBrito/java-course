package aula7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Multi {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[5];
        vetor = randMeth.getRandom(5, vetor, rand);

        System.out.println("Vetor original: " + Arrays.toString(vetor));

        System.out.print("Digite um número para multiplicar: ");
        int multiplicador = sc.nextInt();

        int[] novoVetor = new int[5];
        for (int i = 0; i < vetor.length; i++) {
            novoVetor[i] = vetor[i] * multiplicador;
        }

        System.out.println("Novo vetor: " + Arrays.toString(novoVetor));
    }
}
