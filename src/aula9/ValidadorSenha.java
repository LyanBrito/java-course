package aula9;

import java.util.Scanner;

public class ValidadorSenha {
    public static Boolean ValidaNum(String senha) {
        Boolean valida = false;
        for (int i = 0; i < senha.length(); i++) {
            char ch = senha.charAt(i);
            if (ch == '2' || ch == '3' || ch == '5' || ch == '7') {
                valida = true;
                break;
            }
        }
        return valida;
    }
    public static Boolean ValidaMai(String senha) {
        Boolean valida = false;
        for (int i = 0; i < senha.length(); i++) {
            char ch = senha.charAt(i);
            if (Character.isUpperCase(ch)) {
                valida = true;
                break;
            }
        }
        return valida;
    }
    public static Boolean ValidaCar(String senha) {
        Boolean valida = false;
        String car = "/?:;.,><]}[{~^´`=+-_)(*&¨%$#@!|";
        for (int i = 0; i < senha.length(); i++) {
            char ch = senha.charAt(i);
            if (car.indexOf(ch) != -1) {
                valida = true;
                break;
            }
        }
        return valida;
    }
    public static Boolean ValidaDupli(String senha) {
        Boolean valida = false;

        String vogais = "aAeEiIoOuU";
        for (int i = 0; i < senha.length() -1; i++) {
            char ch = senha.charAt(i);
            char prxCh = senha.charAt(i + 1);
            if (vogais.indexOf(ch) != -1 && ch == prxCh) {
                valida = true;
                break;
            }
            else {
                valida = false;
            }
        }
        return valida;
    }

    public static void main(String[] args) {
        Boolean valida = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua senha: ");
        String senha = sc.nextLine();

        if (ValidaCar(senha) && ValidaNum(senha) && ValidaMai(senha) && !ValidaDupli(senha)) {
            valida = true;
        }

        if (!ValidaNum(senha)) {
            System.out.println("Não tem numero primo!");
        }
        if (!ValidaMai(senha)) {
            System.out.println("Não tem maiusculas");
        }
        if (!ValidaCar(senha)) {
            System.out.println("Não tem caracteres especiais");
        }
        if (ValidaDupli(senha)) {
            System.out.println("Tem Vogais duplicadas");
        }
        if (valida) {
            System.out.println("Senha Correta");
        } else {
            System.out.println("Senha Incorreta");
        }

    }
}
