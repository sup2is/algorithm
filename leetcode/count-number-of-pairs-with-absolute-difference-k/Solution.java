//count-number-of-pairs-with-absolute-difference-k: https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k Complete

class Solution {
    public int countKDifference(int[] nums, int k) {
        
        int answer = 0;
        for (int i = 0; i < nums.length; i ++) {
            for (int j = i + 1; j < nums.length; j ++) {
                if(k == Math.abs(nums[j] - nums[i])) {
                    answer ++;
                }
            }
        }
        
        return answer;
    }
}
