package aula9;

import java.util.Scanner;

public class SimuladorMoeda {
    public static double TipoMoeda() {
        Scanner sc = new Scanner(System.in);
        int opcao;
        double moeda = 0;

        System.out.println("Digite o tipo da moeda: ");
        System.out.println("""
                1 - 0,01
                2 - 0,05
                3 - 0,10
                4 - 0,25
                5 - 0,50
                6 - 1,00""");
        do {
            opcao = sc.nextInt();
            if (opcao >= 1 && opcao <= 6) {
                moeda = switch (opcao) {
                    case 1 -> 0.01;
                    case 2 -> 0.05;
                    case 3 -> 0.1;
                    case 4 -> 0.25;
                    case 5 -> 0.5;
                    case 6 -> 1;
                    default -> moeda;
                };
                break;
            } else {
                System.out.println("Opção invalida!");
            }
        } while (true);

        return moeda;
    }
    public static double Quantida() {
        double moeda = 0;
        int quant;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o quantidade de moeda: ");
        quant = sc.nextInt();

        return quant * moeda;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcao;
        System.out.println("bem vindo ao cofrinho ingteligente!");
        do {

        TipoMoeda();
        Quantida();
            System.out.println("Deseja adicionar mais moedas? (S/N)");
            opcao = sc.nextLine();

        }
        while (opcao.equalsIgnoreCase("S" + "s" + "Sim" + "sim"));
        sc.close();

        System.out.println();
    }
}