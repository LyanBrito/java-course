package aula2;

import java.util.Scanner;

public class Aula1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        int num;
        num = sc.nextInt();

        System.out.print(text +" "+ num);
        sc.close();
    }

}