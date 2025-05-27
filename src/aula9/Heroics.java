package aula9;

import java.util.ArrayList;
import java.util.Scanner;

public class Heroics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> Herois = new ArrayList<>();

        System.out.println("Bem vindo CARALHO");

        System.out.println("Digite o nome do heroi");
        Herois.add(sc.next());
        System.out.println("Digite a força do heroi");
        Herois.add(sc.next());
        System.out.println("Digite o popo do heroi");
        Herois.add(sc.next());

        for (String herois : Herois) {
            System.out.print(herois);
        }
    }
}
