//최소직사각형: https://programmers.co.kr/learn/courses/30/lessons/86491 Complete

class Solution {
    public int solution(int[][] sizes) {
        int maxX = 0;
        int maxY = 0;
        
        for(int i = 0; i < sizes.length; i ++) {
            maxX = Math.max(maxX, Math.max(sizes[i][0], sizes[i][1]));
            maxY = Math.max(maxY, Math.min(sizes[i][0], sizes[i][1]));
        }
        
        return maxX * maxY;
    }
}
