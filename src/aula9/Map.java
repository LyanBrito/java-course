package aula9;

import java.util.Scanner;

public class Map {
    public static String Codigo(String codigo) {
        String codigoComp = codigo.toUpperCase();
        char[] c = codigoComp.toCharArray();
        for (int i = 0; i < codigoComp.length(); i += 2) {
            int rep =  Character.getNumericValue(c[i]);
            char let = c[i+1];
            for (int j = 0; j < rep; j++) {
                System.out.println(let);
            }
        }
        return codigoComp;
    }

    public static void main(String[] args) {
        String codigo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o codigo:");
        codigo = sc.nextLine();
        Codigo(codigo);
        sc.close();
    }
}
