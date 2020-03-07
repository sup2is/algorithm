package beakjoon_15558;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[][] map;
    static boolean[][] visited;

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        String s;

        map = new int[2][n + k + 1];
        visited = new boolean[2][n + k + 1];

        Arrays.fill(map[0], n, n + k + 1, 1);
        Arrays.fill(map[1], n, n + k + 1, 1);

        for (int i = 0; i < 2; i++) {
            s = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j + 1] = s.charAt(j) - 48;
            }
        }

        visited[0][1] = true;
        dfs(1,0, 0, n, k);

        System.out.println(0);
    }

    private static void dfs(int i, int x, int removed, int n, int k) {

        if(i > n) {
            System.out.println(1);
            System.exit(0);
        }

        if(map[x][i + 1] == 1 && !visited[x][i + 1]) {
            visited[x][i + 1] = true;
            dfs(i + 1, x, removed + 1, n, k);
            visited[x][i + 1] = false;
        }

        if(i - 1 >= 0 && removed + 1 < i - 1 && map[x][i - 1] == 1 && !visited[x][i - 1]) {
            visited[x][i - 1] = true;
            dfs(i - 1, x, removed + 1, n, k);
            visited[x][i - 1] = false;
        }

        if(map[(x + 1) % 2][i + k] == 1 && !visited[(x + 1) % 2][i + k]) {
            visited[(x + 1) % 2][i + k] = true;
            dfs(i + k, (x + 1) % 2, removed + 1, n, k);
            visited[(x + 1) % 2][i + k] = false;
        }
    }
}