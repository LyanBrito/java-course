package aula7;

import java.util.Arrays;
import java.util.Scanner;

public class MaiorArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[8];
        int i = 0;
        int numero = 0;

        System.out.println("Digite 8 valores");
        while (i < arr.length) {
            arr[i] = sc.nextInt();
            i++;
        }

        Arrays.sort(arr);
        System.out.println("Maior valor: " + arr[arr.length - 1] + " e menor valor: " + arr[0]);

    }
}
