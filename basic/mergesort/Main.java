package mergesort;

import java.util.Arrays;

public class Main {

    static int[] temp;

    public static void main(String[] args) {

        int[] arr = new int[]{9, 6, 7, 4, 2, 5, 1, 3, 8, 0};
        temp = new int[arr.length];

        System.out.println(Arrays.toString(arr));
        mergeSort(0, arr.length - 1, arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void mergeSort(int start, int end, int[] arr) {

        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(start, mid, arr);
            mergeSort(mid + 1, end, arr);

            int i = start;
            int j = mid + 1;
            int idx = i;

            while (i <= mid && j <= end) {
                if(arr[i] < arr[j]) {
                    temp[idx ++] = arr[i++];
                }else {
                    temp[idx ++] = arr[j++];
                }
            }

            while (i <= mid) temp[idx ++] = arr[i++];
            while (j <= end) temp[idx ++] = arr[j++];

            for (int k = start; k <= end; k++) {
                arr[k] = temp[k];
            }

            System.out.println(Arrays.toString(arr));


        }

    }


}
