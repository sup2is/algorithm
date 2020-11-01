package insertionsort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 9, 8, 5, 4, 2, 3, 7, 6};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if(arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }else {
                    break;
                }
            }

        }
    }
}
