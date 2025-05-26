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
            } else {
                valida = false;
            }
        }
        return valida;
    }

    public static Boolean ValidaMai(String senha) {
        Boolean valida = false;
        for (int i = 0; i < senha.length(); i++) {
            char ch = senha.charAt(i);
            if (senha.toUpperCase().charAt(i) == ch) {
                valida = true;
                asdwbreak;
            } else {
                valida = false;
            }
        }
        return valida;
    }

    public static Boolean ValidaCar(String senha) {
        Boolean valida = false;
        String[] car = {"/?:;.,><]}[{~^´`=+-_)(*&¨%$#@!|"};
        for (int i = 0; i < senha.length(); i++) {
            char ch = senha.charAt(i);
            for (String s : car) {
                if (ch == s.charAt(i)) {
                    valida = true;
                    System.out.println(s.charAt(i));
                    break;
                } else {
                    valida = false;
                }
            }
        }
        return valida;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua senha: ");
        String senha = sc.nextLine();

        ValidaNum(senha);
        ValidaMai(senha);
        ValidaCar(senha);

    }
}
