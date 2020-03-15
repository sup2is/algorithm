package beakjoon_1743;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] map;
    static int[][] dir = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    static int max = 0;
    static int cnt = 0;

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        map = new int[n][m];

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            map[Integer.parseInt(st.nextToken()) - 1][Integer.parseInt(st.nextToken()) - 1] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(map[i][j] == 1) {
                    cnt = 0;
                    dfs(i, j);
                    max = Math.max(cnt, max);
                }
            }
        }

        System.out.println(max);
    }

    private static void dfs(int i, int j) {

        map[i][j] = 0;
        cnt ++;

        for (int k = 0; k < dir.length; k++) {

            int ti = i + dir[k][0];
            int tj = j + dir[k][1];

            if (ti < 0 || tj < 0 || ti >= map.length || tj >= map[0].length || map[ti][tj] != 1) {
                continue;
            }
            dfs(ti, tj);
        }
    }
}