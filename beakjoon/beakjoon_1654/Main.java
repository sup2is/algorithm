package beakjoon_1654;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int arr[] = new int[k];
        long start = 0;
        long end = Integer.MAX_VALUE;
        long max = 0;

        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        while (start <= end) {

            long mid = (start + end) / 2;
            long value = 0;

            for (int i = 0; i < k; i++) {
                value += arr[i] / mid;
            }

            if (value >= n) {
                start = mid + 1;
                if(mid > max) {
                   max = mid;
                }
            } else {
                end = mid - 1;
            }
        }
        System.out.println(max);
    }
}
