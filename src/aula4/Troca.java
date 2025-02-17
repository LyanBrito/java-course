package aula4;

import java.util.Scanner;

public class Troca {
    public static void main(String[] args) {
        double a, b, x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor de a: ");
        a = sc.nextDouble();
        System.out.println("Digite um valor de b: ");
        b = sc.nextDouble();
        x = a;
        a = b;
        b = x;
        System.out.println("Dado a troca de valores: a: " + a + " b: " + b);
    }
}
