package aula7;
import java.util.Arrays;
import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int i = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 5 valores");
        while (i < arr.length) {
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.println("Valores: " + Arrays.toString(arr));
//        System.out.println("Valores: ");
//        for (i = 0; i < 5; i++) {
//            System.out.print("[" + arr[i] + "]");
//
//        }
    }
}
