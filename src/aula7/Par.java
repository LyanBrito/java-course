package aula7;

import java.util.Arrays;
import java.util.Random;

public class Par {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[15];
        int i = 0;
        int[] newArr = randMeth.getRandom(i, arr, rand);
        System.out.println(Arrays.toString(newArr));

        
    }
}
