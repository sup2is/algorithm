//max-increase-to-keep-city-skyline: https://leetcode.com/problems/max-increase-to-keep-city-skyline/ Complete

class Solution {
    public static int maxIncreaseKeepingSkyline(int[][] grid) {

        int[] horizontal = new int[grid[0].length];
        int[] vertical = new int[grid.length];

        int maxX = 0;
        int maxY = 0;
        int answer = 0;

        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid.length; j++) {
                maxX = Math.max(grid[i][j], maxX);
            }
            horizontal[i] = maxX;
            maxX = 0;
        }

        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid.length; j++) {
                maxY = Math.max(grid[j][i], maxY);
            }
            vertical[i] = maxY;
            maxY = 0;
        }

        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid.length; j++) {
                answer += Math.min(vertical[i], horizontal[j]) - grid[i][j];
            }
        }

        return answer;
    }
}
