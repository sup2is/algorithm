package beakjoon_10972;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int targetIdx;

        for (int i = n - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                targetIdx = i - 1;
                int target = arr[targetIdx];
                int[] copy = Arrays.copyOfRange(arr, targetIdx, arr.length);

                for (int j = copy.length - 1; j >= 0; j--) {
                    if(target < copy[j]) {
                        arr[targetIdx] = copy[j];
                        copy[j] = 0;
                        break;
                    }
                }

                Arrays.sort(copy);

                int idx = 1;
                for (int k = targetIdx + 1; k < n; k++) {
                    arr[k] = copy[idx++];
                }

                for (int k = 0; k < n; k++) {
                    System.out.print(arr[k] + " ");
                }
                return;
            }
        }
        System.out.println(-1);
    }
}