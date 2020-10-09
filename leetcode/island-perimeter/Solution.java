//island-perimeter: https://leetcode.com/problems/island-perimeter/ Complete

class Solution {
    public int islandPerimeter(int[][] grid) {
     
        int[][] dirs = new int[][]{{0, 1}, {0, -1},{1, 0} ,{-1, 0}};
        
        int cnt = 0;
        
        for(int i = 0; i < grid.length; i ++) {
            for(int j = 0; j < grid[0].length; j ++) {
                if(grid[i][j] == 0) continue;
                
                for(int[] dir : dirs) {
                    int x = i + dir[0];
                    int y = j + dir[1];
                
                    if(x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == 0) {
                        cnt ++;
                    }
                }
            }
        }
        return cnt;
    }
}
