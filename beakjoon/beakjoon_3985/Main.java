package beakjoon_3985;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<int[]> pq = new PriorityQueue<>((o1, o2) -> {
            if(o1[1] == o2[1]){
                return Integer.compare(o1[0], o2[0]);
            }else {
                return Integer.compare(o2[1], o1[1]);
            }
        });

        int l = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[l + 1];
        int[][] visitor = new int[n][2];

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            visitor[i][0] = Integer.parseInt(st.nextToken());
            visitor[i][1] = Integer.parseInt(st.nextToken());

            pq.add(new int[]{i, visitor[i][1] - visitor[i][0]});
        }

        int max = -1;
        int maxIdx = 1;

        for (int i = 0; i < n; i++) {

            int cnt = 0;
            int from = visitor[i][0];
            int to = visitor[i][1];

            for (int j = from; j <= to; j++) {
                if(arr[j] == 0) {
                    cnt ++;
                    arr[j] = i + 1;
                }
            }
            if(max < cnt) {
                max = cnt;
                maxIdx = i;
            }
        }

        System.out.println(pq.poll()[0] + 1);
        System.out.println(maxIdx + 1);

    }
}