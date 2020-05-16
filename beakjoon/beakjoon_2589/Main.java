package beakjoon_2589;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[][] matrix;
    static boolean[][] visited;
    static char[][] map;
    static int max;
    static Queue<int[]> queue = new LinkedList<>();
    static int[][] dir = new int[][] {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        map = new char[n][m];
        matrix = new int[n][m];
        visited = new boolean[n][m];

        init(n, m);

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = s.charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(map[i][j] == 'L') {
                    queue.add(new int[] {i, j, 0});
                    visited[i][j] = true;
                    bfs();
                    print();
                    findMax();
                    init(n, m);
                }
            }
        }

        System.out.println(max);

    }

    private static void findMax() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] != matrix.length * matrix[0].length) {
                    max = Math.max(max, matrix[i][j]);
                }
            }
        }
    }

    private static void init(int n, int m) {
        for (int k = 0; k < n; k++) {
            Arrays.fill(matrix[k], n * m);
        }
        visited = new boolean[n][m];
    }

    private static void bfs() {

        while (!queue.isEmpty()) {
            int[] d = queue.poll();

            for (int k = 0; k < dir.length; k++) {

                int ti = dir[k][0] + d[0];
                int tj = dir[k][1] + d[1];

                if(ti < 0 || ti >= map.length ||
                        tj < 0 || tj >= map[0].length ||
                        map[ti][tj] == 'W' || visited[ti][tj]) {
                    continue;
                }
                visited[ti][tj] = true;
                matrix[ti][tj] = d[2] + 1;
                queue.add(new int[]{ti, tj, d[2] + 1});
            }
        }
    }
    static void print() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == matrix.length * matrix[0].length) {
                    System.out.print(0);
                }else {
                    System.out.print(matrix[i][j]);
                }
            }
            System.out.println("");
        }
        System.out.println("=====");
    }

}