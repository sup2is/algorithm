//flipping-an-image: https://leetcode.com/problems/flipping-an-image/submissions/ Complete

class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int[][] arr = new int[A.length][A[0].length];
        for(int i = 0; i < A.length; i ++) {
            for(int j = 0; j < A[0].length; j ++) {
                arr[i][j] = A[i][(A[0].length - 1) - j] == 0 ? 1 : 0;
            }
        }
        return arr;
    }
}
