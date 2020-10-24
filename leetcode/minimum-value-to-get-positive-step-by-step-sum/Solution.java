//minimum-value-to-get-positive-step-by-step-sum: https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum/ Complete

class Solution {
    public int minStartValue(int[] nums) {
        
        
        int start = 1;
        
        int idx = 0;
        int sum = start;
        
        while(idx < nums.length) {
            
            sum += nums[idx];
            
            if(sum < 1) {
                idx = 0;
                start ++;
                sum = start;
            }else {
                idx ++;
            }
        }
        
        return start;
    }
}
