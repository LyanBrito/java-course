package aula9;

import java.util.Scanner;
import java.util.Random;

public class CalculadoraErrada {

    public static double calcular(double a, double b, char operacao) {
        double resultado = 0;

        if (operacao == '+') {
            resultado = a + b;
        } else if (operacao == '-') {
            resultado = a - b;
        } else if (operacao == '*') {
            resultado = a * b;
        } else if (operacao == '/') {
            if (b != 0) {
                resultado = a / b;
            } else {
                System.out.println("Divisão por zero não permitida.");
                return 0;
            }
        }
        Random random = new Random();
        double erro = 1 + (random.nextDouble() * 0.01); 
        return resultado * erro;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        char op;

        System.out.println("Digite o primeiro número:");
        a = sc.nextDouble();

        System.out.println("Digite a operação (+, -, *, /):");
        op = sc.next().charAt(0);

        System.out.println("Digite o segundo número:");
        b = sc.nextDouble();

        double resultadoErrado = calcular(a, b, op);

        System.out.printf("Resultado com erro de 1%%: %.2f\n", resultadoErrado);
    }
}
