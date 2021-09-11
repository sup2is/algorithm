//concatenation-of-array: https://leetcode.com/problems/concatenation-of-array/ Complete

class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int[] answer = new int[nums.length * 2];
        
        for(int i = 0; i < answer.length; i ++) {
            answer[i] = nums[i % nums.length];
        }
        
        return answer;
    }
}
