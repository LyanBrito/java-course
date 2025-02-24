package aula5;

import java.util.Scanner;

public class PosiNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero, positivo ou negativo: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }
    }
}
