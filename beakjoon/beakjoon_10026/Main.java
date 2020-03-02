package beakjoon_10026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static boolean[][] visited;
    static int[][] dir = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    static int colorBlindCnt = 0;
    static int cnt = 0;

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        char[][] map = new char[n][n];
        char[][] blindMap = new char[n][n];
        visited = new boolean[n][n];

        String s;
        for (int i = 0; i < n; i++) {
            s = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = s.charAt(j);
                blindMap[i][j] = s.charAt(j);
                if(blindMap[i][j] == 'G') {
                    blindMap[i][j] = 'R';
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(!visited[i][j]) {
                    cnt ++;
                    visited[i][j] = true;
                    dfs(i,j, map[i][j], map);
                }
            }
        }

        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(!visited[i][j]) {
                    colorBlindCnt ++;
                    visited[i][j] = true;
                    dfs(i,j, blindMap[i][j], blindMap);
                }
            }
        }

        System.out.println(cnt + " " + colorBlindCnt);
    }

    private static void dfs(int i, int j, char c, char[][] map) {

        for (int k = 0; k < dir.length; k++) {

            int ti = i + dir[k][0];
            int tj = j + dir[k][1];

            if (ti < 0 || tj < 0 || ti >= map.length || tj >= map[0].length || visited[ti][tj] || map[ti][tj] != c) {
                continue;
            }

            visited[ti][tj] = true;
            dfs(ti, tj, c, map);

        }
    }
}