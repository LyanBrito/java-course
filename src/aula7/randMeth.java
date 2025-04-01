package aula7;

import java.util.Random;

public class randMeth {
    public static int[] getRandom(int i, int[] arr, Random rand) {
        while (i < arr.length) {
            arr[i] = rand.nextInt(100);
            i++;
        }
    return arr;
    }

}
