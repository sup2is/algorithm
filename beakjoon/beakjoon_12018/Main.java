package beakjoon_12018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());

            if(p < l) {
                arr[i] = 1;
                br.readLine();
                continue;
            }
            st = new StringTokenizer(br.readLine());
            int[] temp = new int[p];

            for (int j = 0; j < p; j++) {
                temp[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(temp);

            arr[i] = temp[p - l];

        }

        int r = 0;
        int ans = 0;

        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            r += arr[i];
            if(r > m) {
                break;
            }
            ans ++;
        }

        System.out.println(ans);

    }
}