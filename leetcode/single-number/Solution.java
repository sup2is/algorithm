//single-number: https://leetcode.com/problems/single-number/ Complete

class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1) return nums[0];
        Arrays.sort(nums);

        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i < nums.length - 1; i ++) {
            if(nums[i] == nums[i + 1]) {
                set.add(nums[i]);
                continue;
            }
            
            if(!set.contains(nums[i])) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}

