package aula9;

import java.util.ArrayList;
import java.util.Scanner;

public class Ranking {
    public static int poderTotal(ArrayList<Object> heroi) {
        return (int) heroi.get(1) + (int) heroi.get(2) + (int) heroi.get(3);
    }

    public static int tipoPoder(String tipo) {
        Scanner sc = new Scanner(System.in);
        int poder;

        do {
            System.out.print("Digite a " + tipo + " do herói (0 a 10): ");
            poder = sc.nextInt();
            if (poder >= 0 && poder <= 10) {
                break;
            } else {
                System.out.println("valor do atributo" + tipo + " do herói inválido!");
            }
        } while (true);

        return poder;
    }

    public static void MostrarH(ArrayList<ArrayList<Object>> Herois) {
        String[] atributos = {"Nome: ", "Força: ", "Velocidade ", "Inteligencia: ", "Poder total: "};
        if (Herois.isEmpty()) {
            System.out.println("Nenhum herói cadastrado ainda.");
            return;
        }
        Herois.sort((heroi1, heroi2) -> {
            int total1 = poderTotal(heroi1);
            int total2 = poderTotal(heroi2);

            int resultado = Integer.compare(total2, total1);

            if (resultado == 0) {
                String nome1 = (String) heroi1.get(0);
                String nome2 = (String) heroi2.get(0);
                resultado = nome1.compareTo(nome2);
            }
            return resultado;
        });

        for(
            ArrayList<Object> heroi :Herois)

            {
                int i = 0;
                System.out.println("Herói " + heroi.getFirst() + ":");
                for (Object atributo : heroi) {
                    System.out.println(atributos[i] + atributo);
                    i++;
                }
                System.out.println();
            }
        }

        public static ArrayList Heroi () {
            ArrayList<Object> heroi = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o nome do heroi: ");
            heroi.add(sc.nextLine());
            heroi.add(tipoPoder("força"));
            heroi.add(tipoPoder("velocidade"));
            heroi.add(tipoPoder("inteligencia"));
            heroi.add(poderTotal(heroi));



            return heroi;
        }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            int opcao;
            ArrayList<ArrayList<Object>> herois = new ArrayList<>();

            System.out.println("Bem vindos ao Ranking de herois!");
            do {
                System.out.println("""
                        O que deseja fazer?
                        1 - Ver herois
                        2 - Adicionar herois
                        3 - Sair da aplicação
                        """);
                opcao = sc.nextInt();

                if (opcao == 1) {
                    MostrarH(herois);
                } else if (opcao == 2) {
                    herois.add(Heroi());
                } else if (opcao == 3) {
                    System.out.println("Saindo da Maquina ...");
                    break;
                } else
                    System.out.println("opção invalida!");

            } while (true);


        }
    }
