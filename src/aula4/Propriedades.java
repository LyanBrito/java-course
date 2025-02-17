package aula4;

import java.util.Scanner;

public class Propriedades {
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        a = scanner.nextInt();
        System.out.print("Digite o valor de B: ");
        b = scanner.nextInt();
        System.out.print("Digite o valor de C: ");
        c = scanner.nextInt();
        System.out.print("Digite o valor de D: ");
        d = scanner.nextInt();

        System.out.println("Adições:");
        System.out.println("A + B = " + (a + b));
        System.out.println("A + C = " + (a + c));
        System.out.println("A + D = " + (a + d));
        System.out.println("B + C = " + (b + c));
        System.out.println("B + D = " + (b + d));
        System.out.println("C + D = " + (c + d));

        System.out.println("Multiplicações:");
        System.out.println("A * B = " + (a * b));
        System.out.println("A * C = " + (a * c));
        System.out.println("A * D = " + (a * d));
        System.out.println("B * C = " + (b * c));
        System.out.println("B * D = " + (b * d));
        System.out.println("C * D = " + (c * d));
    }
}
