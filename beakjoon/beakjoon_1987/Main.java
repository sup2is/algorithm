package beakjoon_1987;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    static char[][] map;
    static int r;
    static int c;
    static int[][] dir = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    static int max = -1;
    static Set<Character> set = new HashSet<>();

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        map = new char[r][c];

        String s;
        for (int i = 0; i < r; i++) {
            s = br.readLine();
            for (int j = 0; j < c; j++) {
                map[i][j] = s.charAt(j);
            }
        }

       set.add(map[0][0]);
        dfs(0, 0, 1);

        System.out.println(max);
    }

    private static void dfs(int i, int j, int cnt) {

        for (int k = 0; k < 4; k++) {
            int ti = (i + dir[k][0]);
            int tj = (j + dir[k][1]);

            if (ti < 0 || tj < 0 || ti >= r || tj >= c) {
                continue;
            }

            if (!set.contains(map[ti][tj])) {
                set.add(map[ti][tj]);
                dfs(ti, tj, cnt + 1);
                set.remove(map[ti][tj]);
            } else {
                max = Math.max(cnt, max);
            }
        }
    }
}