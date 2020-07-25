package shortest_unsorted_continuous_subarray;

import java.util.Arrays;

public class Solution {

    public static int findUnsortedSubarray(int[] nums) {

        int[] sorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sorted);

        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != sorted[i]) break;
            ans++;
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if(nums[i] != sorted[i]) break;
            ans++;
        }

        return (nums.length * 2 == ans) ? 0 : nums.length - ans;
    }
}