package aula4;

import java.util.Scanner;

public class ConversaoF {
    public static void main(String[] args) {
        double Celsius, Fahrenheit;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a temperatura em Fahrenheit: ");
        Fahrenheit = sc.nextDouble();
        Celsius = ((Fahrenheit - 32) * 5/9);
        System.out.println(String.format("%.1f", Fahrenheit) + "ºF em Fahrenheit é " + String.format("%.1f", Celsius) + "ºC");
    }
}
