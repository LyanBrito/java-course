package aula2;

import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, soma;
        System.out.println("1 numero: ");
        x = sc.nextInt();
        System.out.println("2 numero: ");
        y = sc.nextInt();
        soma = (x + y);
        System.out.println("Soma: " + soma);


    }

}