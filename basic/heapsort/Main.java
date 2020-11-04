package heapsort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int arr[] = { 5, 2, 1, 7, 112, 42, 52, 62 };
        System.out.println(Arrays.toString(arr));
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void heapify(int array[], int n, int i) {
        int p = i;
        int l = i * 2 + 1;
        int r = i * 2 + 2;

        if (l < n && array[p] > array[l]) {
            p = l;
        }

        if (r < n && array[p] > array[r]) {
            p = r;
        }

        if (i != p) {
            swap(array, p, i);
            System.out.println(Arrays.toString(array));
            heapify(array, n, p);
        }
    }

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // init, max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
            System.out.println(Arrays.toString(arr));
        }

        System.out.println("=====");

        // for extract max element from heap
        for (int i = n - 1; i > 0; i--) {
            swap(arr, 0, i);
            System.out.println(Arrays.toString(arr));
            heapify(arr, i, 0);
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

}
