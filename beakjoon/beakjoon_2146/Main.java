package beakjoon_2146;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[][] map;
    static int[][] dir = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    static int min = Integer.MAX_VALUE;
    static boolean[][][] visited;
    static Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        map = new int[n][n];

        int flag = 2;

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1) {
                    map[i][j] = flag;
                    painting(i, j, flag);
                    flag++;
                }
            }
        }

        visited = new boolean[n][n][flag + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 0) continue;
                for (int k = 0; k < 4; k++) {
                    int ti = (i + dir[k][0]);
                    int tj = (j + dir[k][1]);
                    if (ti >= 0 && tj >= 0 && ti < map.length && tj < map[0].length && map[ti][tj] == 0) {
                        queue.add(new int[]{ti, tj, 1});
                        bfs(map[i][j]);
                    }
                }
            }
        }

       System.out.println(min);
    }

    private static void bfs(int flag) {

        while (!queue.isEmpty()) {

            int[] data = queue.poll();

            for (int k = 0; k < 4; k++) {
                int ti = (data[0] + dir[k][0]);
                int tj = (data[1] + dir[k][1]);

                if (ti < 0 || tj < 0 || ti >= map.length || tj >= map.length || map[ti][tj] == flag || data[2] > min) {
                    continue;
                }

                if (map[ti][tj] == 0) {
                    if(!visited[ti][tj][flag]) {
                        visited[ti][tj][flag] = true;
                        queue.add(new int[]{ti, tj, data[2] + 1});
                    }
                } else {
                    min = Math.min(min, data[2]);
                }
            }
        }
    }

    private static void painting(int i, int j, int flag) {
        for (int k = 0; k < 4; k++) {
            int ti = (i + dir[k][0]);
            int tj = (j + dir[k][1]);

            if (ti < 0 || tj < 0 || ti >= map.length || tj >= map.length || map[ti][tj] != 1) {
                continue;
            }
            map[ti][tj] = flag;
            painting(ti, tj, flag);
        }
    }
}