package aula7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ParImpar {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] vetor = new int[10];
        vetor = randMeth.getRandom(10, vetor, rand);

        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for (int num : vetor) {
            if (num % 2 == 0) {
                pares.add(num);
            } else {
                impares.add(num);
            }
        }

        System.out.println("Vetor original: " + Arrays.toString(vetor));
        System.out.println("Números pares: " + pares);
        System.out.println("Números ímpares: " + impares);
    }
}
