//maximum-product-of-two-elements-in-an-array: https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/ Complete

class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        for(int i = 0; i < nums.length; i ++) {
            for(int j = i + 1; j < nums.length; j ++) {
                max = Math.max((nums[i] - 1) * (nums[j] - 1), max);
            }
        }
        return max;
    }
} 
