package aula7;

import java.util.Arrays;
import java.util.Random;

public class Media {
    public static void main(String[] args) {
        Random rand = new Random();

        double[] notas = new double[6];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            notas[i] = rand.nextDouble() * 10; // notas entre 0 e 10
            soma += notas[i];
        }

        double media = soma / notas.length;

        System.out.println("Notas: " + Arrays.toString(notas));
        System.out.printf("Média: %.2f%n", media);

        if (media >= 7) {
            System.out.println("Resultado: Aprovado");
        } else {
            System.out.println("Resultado: Reprovado");
        }
    }
}
