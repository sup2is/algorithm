//running-sum-of-1d-array: https://leetcode.com/problems/running-sum-of-1d-array/ Complete

class Solution {
    public int[] runningSum(int[] nums) {
        int arr[] = new int[nums.length];
        int sum = 0;
        for(int i = 0; i < nums.length; i ++) {
            sum += nums[i];
            arr[i] = sum;
        }
        return arr;
    }
}
