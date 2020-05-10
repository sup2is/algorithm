package beakjoon_1268;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] map = new int[n][5];
        int max = -1;
        int cnt;
        int answer = n + 1;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int k = 0; k < n; k++) {
            cnt = 0;
            for (int i = 0; i < n; i++) {
                if(k == i) continue;
                for (int j = 0; j < 5; j++) {
                    if(map[k][j] == map[i][j]) {
                        cnt ++;
                        break;
                    }
                }
            }

            if(max < cnt) {
                max = cnt;
                answer = k;
            }


        }
        System.out.println(answer + 1);
    }
}
