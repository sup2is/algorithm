package beakjoon_3967;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    static char map[][] = new char[5][9];
    static List<int[]> points = new ArrayList<>();

    static int[][][] dir = new int[][][]{
            {{0, 4}, {1, 3}, {2, 2}, {3, 1}},
            {{1, 1}, {1, 3}, {1, 5}, {1, 7}},
            {{0, 4}, {1, 5}, {2, 6}, {3, 7}},
            {{3, 1}, {3, 3}, {3, 5}, {3, 7}},
            {{1, 1}, {2, 2}, {3, 3}, {4, 4}},
            {{1, 7}, {2, 6}, {3, 5}, {4, 4}}
    };
    static char[] alphabet = new char[12];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;
        Arrays.fill(alphabet , '0');

        for (int i = 0; i < 5; i++) {
            s = br.readLine();
            for (int j = 0; j < 9; j++) {
                map[i][j] = s.charAt(j);
                if(map[i][j] != '.' && map[i][j] != 'x'){
                    alphabet[map[i][j] - 65] = map[i][j];
                }else if(map[i][j] == 'x') {
                    points.add(new int[]{i,j});
                }
            }
        }

        dfs(0);

    }

    private static void dfs(int idx) {

        if(idx == points.size() && check()) {
            print();
            System.exit(0);
        }

        for (int i = 0; i < alphabet.length; i++) {
            if(alphabet[i] == '0') {
                int[] t = points.get(idx);
                map[t[0]][t[1]] = (char)(i + 65);
                alphabet[i] = (char)(i + 65);
                dfs(idx + 1);
                map[t[0]][t[1]] = 'x';
                alphabet[i] = '0';
            }
        }


    }

    private static boolean check() {

        for (int k = 0; k < 6; k++) {
            int sum = 0;
            for (int i = 0; i < 4; i++) {
                sum += map[dir[k][i][0]][dir[k][i][1]] - 64;
            }
            if(sum != 26) return false;
        }
        return true;
    }


    private static void print() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }

}