package aula5;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option, deposito, saque;
        int saldo = 100;

//        deixando saldo como 100 padrão para ter diferença
        System.out.println("O que quer fazer? Digite o numero da opção:");
        System.out.println("1 - Deposito; 2- Saque; 3- Saldo");
        option = sc.nextInt();

// usar while em casa
        if (option == 1) {
            System.out.println("Digite o valor do deposito: ");
            deposito = sc.nextInt();
            System.out.println("Deposito feito! Seu saldo é de : " + (saldo + deposito));
        } else if (option == 2) {
            System.out.println("Digite o valor do saque: ");
            saque = sc.nextInt();
            System.out.println("Saque realizado. Seu saldo é de : " + (saldo - saque));
        } else if (option == 3) {
            System.out.println("Seu saldo atual é de: " + saldo);
        }
        else{
            System.out.println("Opção invalida! Digite uma das opções");

        }
    }
}
