package aula9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Votos {
    public static void Percent(ArrayList<Integer> Votos) {
        double total, cand1, cand2, cand3;

        total = Votos.size();
        cand1 = Collections.frequency(Votos, 1);
        cand2 = Collections.frequency(Votos, 2);
        cand3 = Collections.frequency(Votos, 3);

        double percent1 = (cand1 / total * 100);
        double percent2 = (cand2 / total * 100);
        double percent3 = (cand3 / total * 100);

//      tornar mais dinamico

        System.out.printf("\nTotal de votos: ", total);
        System.out.printf("Votos de Tigrinho:  %.2f%%\n", cand1);
        System.out.printf("Votos de Smiliguido:  %.2f%%\n", cand2);
        System.out.printf("Votos de Sagui:  %.2f%%\n", cand3);

        System.out.println("\nPorcentagem de votos:");
        System.out.printf("Tigrinho: %.2f%%\n", percent1);
        System.out.printf("Smiliguido: %.2f%%\n", percent2);
        System.out.printf("Sagui: %.2f%%\n", percent3);

    }

    public static void main(String[] args) {
        int voto;
        ArrayList<Integer> Votos = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Bem vindos ao sistema de votação para o Mascote de Turma!
                Vote Conscientemente nos candidatos abaixo:
                """);

        while (true) {
            System.out.println("""
                    Vote em um candidato:
                    1 - Tigrinho
                    2 - Smiliguido
                    3 - Sagui
                    4 - Fim
                    """);
            voto = sc.nextInt();

            if (voto == 1 || voto == 2 || voto == 3) {
                Votos.add(voto);
            } else if (voto == 4) {
                Percent(Votos);
                break;
            } else System.out.println("invvalido");

        }
    }
}
