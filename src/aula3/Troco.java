package aula3;

import java.util.Scanner;

public class Troco {
    public static void main(String[] args) {
          double qntProduct, valorUnni, pgmt, troco;

          Scanner sc = new Scanner(System.in);

          System.out.print("Digite o valor do produto: ");
          valorUnni = sc.nextDouble();

          System.out.print("Digite o quantidade de produtos: ");
          qntProduct = sc.nextDouble();

          System.out.print("Digite o pagamento: ");
          pgmt = sc.nextDouble();

          troco = pgmt - (valorUnni * qntProduct) ;
          System.out.println("seu troco é: R$" + String.format("%.2f", troco));


//
    }
}
