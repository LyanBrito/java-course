package aula3;

import java.util.Scanner;

public class AlturaMedia {
    public static void main(String[] args) {
        String nome1, nome2;
        double altura1, altura2, media;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um nome: ");
        nome1 = sc.nextLine();
        System.out.println("Digite a altra de "+ nome1 + ":");
        altura1 = sc.nextDouble();

        sc.nextLine();
        System.out.println("Digite um nome: ");
        nome2 = sc.nextLine();
        System.out.println("Digite a altra de "+ nome2 + ":");
        altura2 = sc.nextDouble();

        media = (altura1 + altura2)/2;

        System.out.println("A media da altura de " + nome1 + " e " + nome2 + "é: " + String.format("%.2f", media));

    }
}