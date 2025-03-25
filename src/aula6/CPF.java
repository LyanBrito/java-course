package aula6;

import java.util.Scanner;

public class CPF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu CPF:");
        String cpf = sc.nextLine();

        if (cpf.length() != 11) {
            System.out.println("digito invalido");
        } else {
// Verificador 1
            String cpf1 = cpf.substring(0, 9), cpf2 = cpf.substring(0, 10);
            int[] multi = {10, 9, 8, 7, 6, 5, 4, 3, 2}, multi2 = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
            int dig1, dig2, soma = 0, soma2 = 0;
            int cpfDig1 = Character.getNumericValue(cpf.charAt(9)), cpfDig2 = Character.getNumericValue(cpf.charAt(10));

            for (int i = 0; i < cpf1.length(); i++) {
                char result = cpf1.charAt(i);
                int numericValue = Character.getNumericValue(result);
                soma += numericValue * multi[i];
            }
            if (soma % 11 >= 2) {
                dig1 = 11 - soma % 11;
            } else {
                dig1 = 0;
            }
// Verificador 2

            for (int i = 0; i < cpf2.length(); i++) {
                char result = cpf2.charAt(i);
                int numericValue = Character.getNumericValue(result);
                soma2 += numericValue * multi2[i];
            }
            if (soma2 % 11 >= 2) {
                dig2 = 11 - soma2 % 11;
            } else {
                dig2 = 0;
            }
            if (dig1 == cpfDig1 && dig2 == cpfDig2) {
                System.out.println("CPF verdadeiro");
            } else {
                System.out.println("CPF invalido");
            }
        }
    }
}

