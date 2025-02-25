package aula5;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option, deposito = 0, saque = 0;
        int saldo = 100;


        while (true) {
        System.out.println("O que quer fazer? Digite o numero da opção:");
        System.out.println("1 - Deposito; 2- Saque; 3- Saldo; 4- Sair");
        option = sc.nextInt();

        if (option == 1) {
            System.out.println("Digite o valor do deposito: ");
            deposito = sc.nextInt();
            System.out.println("Deposito feito! Seu saldo é de : " + ((saldo -  saque) + deposito));
        } else if (option == 2) {
            System.out.println("Digite o valor do saque: ");
            saque = sc.nextInt();
            System.out.println("Saque realizado. Seu saldo é de : " + ((saldo + deposito) - saque));
        } else if (option == 3) {
            System.out.println("Seu saldo atual é de: " + (saldo + deposito - saque));
        } else if (option == 4) {
            System.out.println("Saindo da Maquina ...");
            break;
        } else
            System.out.println("Opção invalida! Digite uma das opções");
        }
        }
    }

