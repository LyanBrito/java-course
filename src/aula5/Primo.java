package aula5;

import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dgiita um numero");
        numero = sc.nextInt();

        if (numero % 2 == 0 || numero <= 1) {
            System.out.println("não Primo");
        } else if (numero == 2) {
            System.out.println("Primo");
        } else {
            for (int i = 1; i <= numero / 2; i++) {
                if (i % Math.floor(Math.sqrt(numero)) == 0) {
                    System.out.println("Primo");
                } else {
                    System.out.println("não Primo");
                }
            }
        }

    }
}
