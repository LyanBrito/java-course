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
            String cpf1 = cpf.substring(0, 9), cpf2 = cpf.substring(0, 10);
            int[] multi1 = {10, 9, 8, 7, 6, 5, 4, 3, 2}, multi2 = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
            int dig1, dig2, soma1 = 0, soma2 = 0;
            int cpfDig1 = Character.getNumericValue(cpf.charAt(9)), cpfDig2 = Character.getNumericValue(cpf.charAt(10));

// Verificador 1
            dig1 = getDig(cpf1, multi1, soma1);
// Verificador 2
            dig2 = getDig(cpf2, multi2, soma2);

            if (dig1 == cpfDig1 && dig2 == cpfDig2) {
                System.out.println("CPF verdadeiro");
            } else {
                System.out.println("CPF invalido");
            }
        }
    }

    private static int getDig(String cpf, int[] multi, int soma) {
        int dig;
        for (int i = 0; i < cpf.length(); i++) {
            char result = cpf.charAt(i);
            int numericValue = Character.getNumericValue(result);
            soma += numericValue * multi[i];
        }
        if (soma % 11 >= 2) {
            dig = 11 - soma % 11;
        } else {
            dig = 0;
        }
        return dig;
    }
}

