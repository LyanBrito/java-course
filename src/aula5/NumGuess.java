package aula5;

import java.util.Random;
import java.util.Scanner;

public class NumGuess {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int number = 0;
        int randomNum = rand.nextInt(10);
        int guess = 0;
        int maxGuess = 10;

        System.out.println("Digite um numero de 1 a 10.");
        while (guess < maxGuess) {
            System.out.print("Você tem " + (11 - (guess + 1)) + " tentativas. Digite um numero de 1 a 10: ");
            number = sc.nextInt();
            guess++;
            if (number == randomNum) {
                System.out.println("Você acertou o valor da maquina em " + guess + " vezes!");
                break;
            } else {
                System.out.println("Você errou Tente novamente");
            }
        }
        if (number != randomNum) {
            System.out.println("você não conseguiu acertar, o numero era: " + guess);
        }
        sc.close();
    }
}



