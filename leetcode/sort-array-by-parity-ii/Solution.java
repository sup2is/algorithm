//sort-array-by-parity-ii: https://leetcode.com/problems/sort-array-by-parity-ii/ Complete

class Solution {
    public int[] sortArrayByParityII(int[] A) {
        
        int[] answer = new int[A.length];
        int idx = 0;
        for(int a : A) {
            if(a % 2 == 0) {
                answer[idx] = a;
                idx += 2;
            }
        }
        idx = 1;
        for(int a : A) {
            if(a % 2 != 0) {
                answer[idx] = a;
                idx += 2;
            }
        }
        return answer;
        
    }
}
