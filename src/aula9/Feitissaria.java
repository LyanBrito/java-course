package aula9;

import java.util.Scanner;

public class Feitissaria {
    public static int buscaBinaria(String[] feiticos, String posicao) {
        int inicio = 0;
        int fim = feiticos.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            int compar = posicao.compareTo(feiticos[meio]);

            if (compar == 0) {
                return meio;
            } else if (compar < 0) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] feiticos = {
                "Accio", "Alohomora", "Anapneo", "Aranea Exumai", "Aresto Momentum", "Avada Kedavra", "Braquium Remendo", "Cara-de-Lesma",
                "Colloportus", "Confringo", "Confundus", "Crucio", "Descendo", "Densaugeo", "Diffindo", "Ebublio", "Episkey", "Estupefaça",
                "Estupore", "Expecto Patronum", "Expelliarmus", "Finite Incatatem", "Flipendo", "Furnunculus", "Germinio", "Glacius",
                "Homenum Revelio", "Homorfo", "Immobilus", "Impedimenta", "Imperio", "Incendio", "Langlock", "Levicorpus", "Liberacorpus",
                "Locomotor", "Locomotor Mortis", "Lumos", "Lumos Solem", "Lumos Máxima", "Mobiliarbus", "Mobilicorpus", "Morsmorde", "Nox",
                "Obliviate", "Oppugno", "Pack", "Piertotum Locomotor", "Pericullum", "Petrificus Totalus", "Piertotum Locomotor", "Portus",
                "Prior Incantato", "Protego", "Protego Totalum", "Protego Horribilis", "Reducio", "Reducto", "Reparo", "Repello Trouxatum",
                "Rictumsempra", "Ridikkullus", "Sectumsempra", "Serpensortia", "Silêncio", "Sonorus", "Tarantallegra", "Vipera Evanesca",
                "Vulnerar Sanentur", "Wingardium Leviosa"
        };


        System.out.println("Digite o feitiço a ser encontrado:");
        String posicao = sc.nextLine();

        int alvo = buscaBinaria(feiticos, posicao);

        if (alvo >= 0) {
            System.out.println("Feitiço encontrado na posição " + alvo);
        } else {
            System.out.println("Feitiço não encontrado.");
        }
    }
}
