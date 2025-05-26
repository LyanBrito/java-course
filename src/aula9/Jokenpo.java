package aula9;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {
    public static String Opcoes(int opcao) {
        String jogada = switch (opcao) {
            case 1 -> "Pedra";
            case 2 -> "Papel";
            case 3 -> "Tesoura";
            case 4 -> "Lagarto";
            case 5 -> "Spock";
            default -> "hahah";
        };
        return jogada;
    }
    public static String Vencedor(String player, String cpu) {
        String[][] regras = {
                {"Papel", "Pedra", "Papel vence pedra"},
                {"Pedra", "Tesoura", "Pedra vence Tesoura"},
                {"Tesoura", "Papel", "Tesoura vence Papel"},
                {"Pedra", "Lagarto", "Pedra vence Lagarto"},
                {"Lagarto", "Spock", "Lagarto vence Spok"},
                {"Tesoura", "Lagarto", "Tesoura vence Lagarto"},
                {"Papel", "Spock", "Papel vence Spock"},
                {"Spock", "Pedra", "Spock vence pedra"},

        };
        for (int i = 0; i < regras.length; i++) {
            if (player.equals(regras[i][0]) && cpu.equals(regras[i][1])) {
                return "\nVocê venceu! " + regras[i][2];
            } else if (cpu.equals(regras[i][0]) && player.equals(regras[i][1])) {
                return "\nVocê perdeu! " + regras[i][2];
            }
        }

        return "Empate";
    }
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int opcao;
        String cpu, player;
        System.out.println("""
                Digite uma opção:
                1 - Pedra
                2 - Papel
                3 - Tesoura
                4 - Lagarto
                5 - Spock
                """);
        opcao = sc.nextInt();
        player = Opcoes(opcao);
        cpu = Opcoes(random.nextInt(1, 6));


        System.out.println("Sua jogada: " + player);
        System.out.println("Jogada do cpu: " + cpu);

        String vencedor = Vencedor(player, cpu);
        System.out.println(vencedor);


    }
}