//sum-of-all-odd-length-subarrays: https://leetcode.com/problems/sum-of-all-odd-length-subarrays/ Complete

class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int ans = 0;
        int level = 0;
        while(arr.length >= level) {
            for(int i = level; i < arr.length; i ++) {
                ans += sum(arr, i, level);
            }
            System.out.println(ans);
            level += 2;
        }
        return ans;
    }
    
    public int sum(int[] arr, int idx, int level) {
        if(level == -1) {
            return 0;
        }
        
        return arr[idx] + sum(arr, idx - 1, level - 1);
    }
}
