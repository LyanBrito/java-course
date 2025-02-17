package aula4;

import java.util.Scanner;

public class ConversaoC {

    public static void main(String[] args) {
        double Celsius, Fahrenheit;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        Celsius = sc.nextDouble();
        Fahrenheit = ((Celsius * 9 / 5) + 32);
        System.out.println(String.format("%.1f", Celsius) + "ºC em Fahrenheit é " + String.format("%.1f", Fahrenheit) + "ºF");
    }
}

