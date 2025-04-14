package aula7;

import java.util.Arrays;
import java.util.Random;

public class Contrario {
    public static void main(String[] args) {
        int i = 0;
        Random rand = new Random();
        int[] arr = new int[6];
        int[] newArr = randMeth.getRandom(i, arr, rand);
        System.out.println(Arrays.toString(newArr));

        int a = newArr.length -1;
        for (int b = 0; b < newArr.length; b++){
            System.out.print(newArr[a] + " ");
            a--;
        }
    }
}
