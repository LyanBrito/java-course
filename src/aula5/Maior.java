package aula5;

import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        a = sc.nextInt();
        System.out.print("Digite um numero: ");
        b = sc.nextInt();

        if (a > b) {
            System.out.println(a + " > " + b);
        } else {
            System.out.println(b + " > " + a);
        }
    }
}
