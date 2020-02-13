package beakjoon_2239;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[][] map = new int[10][10];

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        for (int i = 1; i < 10; i++) {
            s = br.readLine();
            for (int j = 1; j < 10; j++) {
                map[i][j] = s.charAt(j - 1) - 48;
            }
        }
        dfs(1, 1);
    }

    private static void dfs(int i, int j) {

        if (j == 10) {
            i++;
            j = 1;
        }

        if (i == 10) {
            print();
            System.exit(0);
        }

        if (map[i][j] == 0) {
            
            for (int k = 1; k < 10; k++) {
                if (check(i, j, k)) {
                    map[i][j] = k;
                    dfs(i, j + 1);
                    map[i][j] = 0;
                }
            }
        }else {
            dfs(i, j + 1);
        }
    }

    private static boolean check(int i, int j, int k) {
        if(checkRow(i, k) && checkCol(j, k) && checkBox(i, j, k)) {
            return true;
        }
        return false;
    }

    private static boolean checkBox(int i, int j, int v) {
        int ti = (((i -1) / 3) * 3) + 1;
        int tj = (((j -1) / 3) * 3) + 1;

        for (int k = ti; k < ti + 3; k++) {
            for (int o = tj; o < tj  + 3; o++) {
                if(map[k][o] == v) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkCol(int j, int v) {
        for (int k = 1; k < 10; k++) {
            if(map[k][j] == v) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkRow(int i, int v) {
        for (int k = 1; k < 10; k++) {
            if(map[i][k] == v) {
                return false;
            }
        }
        return true;
    }

    private static void print() {
        for (int i = 1; i < map.length; i++) {
            for (int j = 1; j < map.length; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}