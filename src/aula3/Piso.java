package aula3;

import java.util.Scanner;

public class Piso {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double comp, lrg, mquad, area, total;

        System.out.print("Digite a largura: ");
        lrg = sc.nextDouble();

        System.out.print("Digite o comprimento: ");
        comp = sc.nextDouble();
        area = lrg * comp;

        System.out.println("Area Total: " + String.format("%.2f", area)+ "m²");

        System.out.println("Digite o valor do metro quadrado:");
        mquad = sc.nextDouble();
        total = area * mquad;
        System.out.println("Custo total: " + String.format("%.2f", total));
    }
}