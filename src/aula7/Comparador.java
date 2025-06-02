package aula7;

import java.util.Arrays;
import java.util.Random;

public class Comparador {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        vetorA = randMeth.getRandom(5, vetorA, rand);
        vetorB = randMeth.getRandom(5, vetorB, rand);

        System.out.println("Vetor A: " + Arrays.toString(vetorA));
        System.out.println("Vetor B: " + Arrays.toString(vetorB));

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] == vetorB[i]) {
                System.out.println("Posição " + i + ": " + vetorA[i]);
            }
        }
    }
}
