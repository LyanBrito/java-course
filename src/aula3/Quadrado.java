package aula3;

import java.util.Scanner;

public class Quadrado {

public static void main(String[] args) {
    double lrg, alt, area, perimetro, diagonal;
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o valor do largura do quadrado: ");
    lrg = sc.nextDouble();
    System.out.print("Digite o altura do quadrado: ");
    alt = sc.nextDouble();
    perimetro = (lrg * 2) + (alt * 2);
    area = lrg * alt;
    diagonal = Math.sqrt((lrg * lrg) + (alt * alt));

    System.out.println("Perimetro: " + String.format("%.4f", perimetro));
    System.out.println("Area: " + String.format("%.4f", area));
    System.out.println("Diagonal²: " + String.format("%.4f", diagonal));


}
}