package aula9;

import java.util.Scanner;

public class CofrinhoSimulator {
    public static double TipoMoeda(Scanner sc) {
        int opcao;
        double valorMoeda = 0;

        System.out.println("Digite o tipo da moeda: ");
        System.out.println("""
                1 - 0,01
                2 - 0,05
                3 - 0,10
                4 - 0,25
                5 - 0,50
                6 - 1,00""");

        while (true) {
            System.out.print("Opção: ");
            if (!sc.hasNextInt()) {
                System.out.println("Entrada inválida. Digite um número de 1 a 6.");
                sc.next();
                continue;
            }
            opcao = sc.nextInt();
            switch (opcao) {
                case 1 -> valorMoeda = 0.01;
                case 2 -> valorMoeda = 0.05;
                case 3 -> valorMoeda = 0.10;
                case 4 -> valorMoeda = 0.25;
                case 5 -> valorMoeda = 0.50;
                case 6 -> valorMoeda = 1.00;
                default -> {
                    System.out.println("Opção inválida. Tente novamente.");
                    continue;
                }
            }
            break;
        }
        return valorMoeda;
    }

    public static int Quantidade(Scanner sc) {
        int quantidade;
        while (true) {
            System.out.print("Digite a quantidade de moedas: ");
            if (!sc.hasNextInt()) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                sc.next();
                continue;
            }
            quantidade = sc.nextInt();
            if (quantidade <= 0) {
                System.out.println("Quantidade não pode ser negativa ou nula. Tente novamente.");
            } else {
                break;
            }
        }
        return quantidade;
    }

    public static int calcularSemanas(double total, double valor) {
        if (total >= 100) {
            return 0;
        }
        double restante = 100.0 - total;
        int semanas = (int) (restante / valor);

        if (semanas * valor < restante) {
            semanas++;
        }
        return semanas;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        String opcao;

        System.out.println("Bem-vindo ao Cofrinho Inteligente!");

        do {
            double moeda = TipoMoeda(sc);
            int quantidade = Quantidade(sc);
            double valorInserido = moeda * quantidade;
            total += valorInserido;
            System.out.printf("Você inseriu R$ %.2f neste lote.%n", valorInserido);
            sc.nextLine();

            System.out.print("Deseja adicionar mais moedas? (S/N): ");
            opcao = sc.nextLine();
        } while (opcao.equalsIgnoreCase("S") || opcao.equalsIgnoreCase("Sim"));

        System.out.printf("Total acumulado no cofrinho: R$ %.2f%n", total);

        int semanas = calcularSemanas(total, total);
        if (semanas == 0) {
            System.out.println("Você já atingiu ou ultrapassou R$ 100,00!");
        } else {
            System.out.printf("\nFaltam %d semanas para chegar a R$ 100,00.%n", semanas);
        }
        sc.close();
    }
}
