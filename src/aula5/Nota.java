package aula5;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        int nota;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma nota: ");
        nota = sc.nextInt();

        if (nota >= 7) {
            System.out.println("Aprovado");

        } else {
            System.out.println("Reprovado");
        }
    }
}
