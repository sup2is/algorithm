package quicksort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[]{9, 6, 7, 4 ,2 ,5 ,1, 3, 8};
        System.out.println(Arrays.toString(arr));
        quickSort(0, arr.length - 1, arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void quickSort(int left, int right, int[] arr) {

        int pivot = arr[(left + right) / 2];
        int i = left;
        int j = right;

        while (i <= j) {
            while (pivot > arr[i]) i ++;
            while (pivot < arr[j]) j --;

            if(i <= j) {
                swap(i, j, arr);
                i ++;
                j --;
            }
        }

        if(left < j ) quickSort(left, j, arr);
        if(right > i ) quickSort(i, right, arr);
    }


    private static void swap(int start, int end, int[] arr) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
