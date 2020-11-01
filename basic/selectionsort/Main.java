package selectionsort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 9, 8, 5, 4, 2, 3, 7, 6};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            int minIdx = i;

            for (int j = i + 1; j < arr.length; j++) {
                if(arr[minIdx] > arr[j]) {
                    minIdx = j;
                }
            }

            if(minIdx != i) {
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
            }
        }
    }
}
