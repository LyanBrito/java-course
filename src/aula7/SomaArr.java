package aula7;

import java.util.Arrays;
import java.util.Random;

public class SomaArr {

    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();
        int soma = 0;
        int i = 0;

        int[] newArr = randMeth.getRandom(i, arr, rand);
        while (i < newArr.length) {
            soma += newArr[i];
            i++;
        }

        System.out.println("Valores: " + Arrays.toString(newArr) + ", soma: " + soma);
    }



    }

