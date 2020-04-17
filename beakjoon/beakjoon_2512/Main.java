package beakjoon_2512;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int total = 0;
        int start = 0;
        int end = -1;
        int answer = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            end = Math.max(end , arr[i]);
            total += arr[i];
        }
        int m = Integer.parseInt(br.readLine());

        if(total > m) {
            while (start <= end) {

                int sum = 0;
                int mid = (start + end) / 2;

                for (int i = 0; i < n; i++) {
                    if(arr[i] > mid) {
                        sum += mid;
                    }else {
                        sum += arr[i];
                    }
                }

                if(sum > m) {
                    end = mid - 1;
                }else {
                    start = mid + 1;
                    if(answer < mid) {
                        answer = mid;
                    }
                }
            }
            System.out.println(answer);
        }else {
            System.out.println(end);
        }
    }
}
