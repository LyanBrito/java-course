package aula5;

import java.util.Scanner;

public class Primo {

    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dgiita um numero");
        numero = sc.nextInt();

        if (numero < 2) {
            System.out.println("n primo");
        } else {
            boolean primo = true;
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            } if (primo) {
                System.out.println("primo");
            } else {
                System.out.println("n primo");
            }
        }
//        sem for
//        if (numero == 2 || numero == 3 || numero == 5 || numero == 7) {
//            System.out.println("Primo");
//        } else if (numero % 2 == 0 || numero % 3 == 0 || numero % 5 == 0 || numero % 7 == 0) {
//            System.out.println("não Primo");
//        } else {
//            System.out.println("Primo");
//        }
    }
}

