//Fold an array: https://www.codewars.com/kata/57ea70aa5500adfe8a000110/train/java Complete

import java.util.Arrays;

public class Kata{
    public static int[] foldArray(int[] array, int runs) {
        for (int i = 0; i < runs; i++) {
            int idx = ((array.length -1) / 2) + 1;
            int[] copy = Arrays.copyOfRange(array, 0, idx);
            idx = length % 2 == 0 ? idx - 1 : idx;
            for (int j = 0; j < idx; j++) {
                copy[j] += array[array.length - 1 - j];
            }
            array = copy;
        }
        return array;
    }

}
