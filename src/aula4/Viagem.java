package aula4;

import java.util.Scanner;

public class Viagem {
    public static void main(String[] args) {
        double  velocidade, tempo, gasolina, distancia;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o velocidade media: ");
        velocidade = sc.nextDouble();
        System.out.println("Digite o tempo gasto: ");
        tempo = sc.nextDouble();
        distancia = velocidade * tempo;
        gasolina = distancia * 12;

        System.out.println("distancia percorrida (m): " + distancia);
        System.out.println("gasolina gasta (mL): " + gasolina);


    }
}
