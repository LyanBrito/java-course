package aula4;

import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        double altura, peso, IMC;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua altura (metros): ");
        altura = sc.nextDouble();
        System.out.print("Digite seu peso (kilos): ");
        peso = sc.nextDouble();

        IMC = peso / (altura * altura);

        System.out.println("seu IMC é " + String.format("%.2f", IMC));

        if (IMC < 18.5) {
            System.out.println("Você esta abaixo do normal");
        } else if (IMC < 25) {
            System.out.println("Você esta com peso normal");
        } else if (IMC < 30) {
            System.out.println("Você esta em sobrepeso");
        } else if (IMC < 35) {
            System.out.println("Você esta obeso (nivel 1)");
        } else if (IMC < 40) {
            System.out.println("Você esta obeso (nivel 2)");
        } else if (IMC > 40) {
            System.out.println("Você esta obeso (nivel 3)");
        }

    }
}
