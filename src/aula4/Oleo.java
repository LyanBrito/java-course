package aula4;

import java.util.Scanner;

public class Oleo {
    public static void main(String[] args) {
        double raio, altura, volume;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o raio da lata: ");
        raio = sc.nextDouble();
        System.out.print("Digite o altura da lata: ");
        altura = sc.nextDouble();
        volume = (raio * raio) * altura * 3.14159;

        System.out.println("O volume é: " + String.format("%.2f", volume));


    }
}
