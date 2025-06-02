package aula7;

import java.util.Random;

public class randMeth {
    public static int[] getRandom(int tamanho, int[] arr, Random rand) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        return arr;
    }
}
