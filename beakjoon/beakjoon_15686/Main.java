package beakjoon_15686;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static ArrayList<int[]> selected = new ArrayList<>();
    static boolean[] visited;
    static int m;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int[][] map = new int[n + 1][n + 1];

        ArrayList<int[]> houses = new ArrayList<>();
        ArrayList<int[]> chickens = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 1) {
                    houses.add(new int[]{i, j});
                }
                if (map[i][j] == 2) {
                    chickens.add(new int[]{i, j});
                }
            }
        }
        visited = new boolean[chickens.size()];
        select(0, chickens.size(), m);

        int minAnswer = Integer.MAX_VALUE;

        for (int[] ints : selected) {
            int answer = 0;
            for (int[] house : houses) {
                int min = n * n;
                for (int pos : ints) {
                    int[] cpos = chickens.get(pos);
                    min = Math.min(min, Math.abs(cpos[0] - house[0]) + Math.abs(cpos[1] - house[1]));
                }
                answer += min;
            }
            minAnswer = Math.min(minAnswer, answer);
        }

        System.out.println(minAnswer);

    }

    private static void select(int start, int n, int r) {

        if (r == 0) {
            select();
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            select(i + 1, n, r - 1);
            visited[i] = false;
        }
    }

    private static void select() {
        int[] temp = new int[m];
        int idx = 0;
        for (int i = 0; i < visited.length; i++) {
            if (visited[i]) {
                temp[idx++] = i;
            }
        }
        selected.add(temp);
    }

}