package binarysearch;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[100000000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        int target = 9449364;
        int idx = binarySearch(arr, target);

        System.out.println(arr[idx] + ", " + target);

    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;

            if(arr[mid] == target) {
                return mid;
            }

            if(arr[mid] < target) {
                start = mid + 1;
            } else {
              end = mid - 1;
            }
        }
        return -1;
    }

}
