//Snail: https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1/train/java Complete

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Snail {

    static int stack;
    static int[][] direction = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    static List<Integer> list;

    public static int[] snail(int[][] array) {
      
        if(array[0].length == 0) {
            return new int[]{};
        }
        list = new ArrayList<>();
        stack = 0;
        list.add(array[0][0]);
        array[0][0] = -1;
        dfs(array, 0, 0);

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    private static void dfs(int[][] array, int y, int x) {
        y += direction[stack % 4][0];
        x += direction[stack % 4][1];

        if (y >= 0 && y < array.length && x >= 0 && x < array.length && array[y][x] != -1) {
            list.add(array[y][x]);
            array[y][x] = -1;
        } else {
            int i = stack % 4;
            if (i == 0) {
                x --;
            }
            if (i == 1) {
                y --;
            }
            if (i == 2) {
                x ++;
            }
            if (i == 3) {
                y ++;
            }
            stack++;
        }
        if(list.size() < array.length * array.length) {
            dfs(array, y, x);
        }
    }
}
