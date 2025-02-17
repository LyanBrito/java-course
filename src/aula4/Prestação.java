package aula4;

import java.util.Scanner;

public class Prestação {
    public static void main(String[] args) {
        double prestação, valor, tempo, taxa;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da conta atrasada");
        valor = sc.nextDouble();
        System.out.println("Digite o tempo de atraso");
        tempo = sc.nextDouble();
        System.out.println("Digite o taxa de atraso");
        taxa = sc.nextDouble();
        prestação = valor + (valor *  taxa/100) * tempo;

        System.out.println("o valor da prestação é de: " + String.format("%.2f", prestação));
    }

}
