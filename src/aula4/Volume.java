package aula4;

import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        double altura, largura, comprimento, volume;
        Scanner sc = new Scanner(System.in);

        System.out.println("informe a altura: ");
        altura = sc.nextDouble();
        System.out.println("informe a largura: ");
        largura = sc.nextDouble();
        System.out.println("informe a comprimento: ");
        comprimento = sc.nextDouble();

        volume = altura * largura * comprimento;
        System.out.println("Volume: " + volume);
    }
}
