package aula5;

import java.util.Scanner;

public class Bissexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ano;
        System.out.println("Digite um ano: ");
        ano = sc.nextInt();

        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.println("Ano Bissexto");
        } else {
            System.out.println("Ano Fiscal");
        }
    }
}
