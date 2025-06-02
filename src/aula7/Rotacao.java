package aula7;

import java.util.Arrays;
import java.util.Random;

public class Rotacao {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] vetor = new int[5];
        vetor = randMeth.getRandom(5, vetor, rand);

        System.out.println("Vetor original: " + Arrays.toString(vetor));

        int ultimo = vetor[vetor.length - 1];

        for (int i = vetor.length - 1; i > 0; i--) {
            vetor[i] = vetor[i - 1];
        }

        vetor[0] = ultimo;

        System.out.println("Vetor rotacionado: " + Arrays.toString(vetor));
    }
}
