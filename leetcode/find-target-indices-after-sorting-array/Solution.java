//find-target-indices-after-sorting-array: https://leetcode.com/problems/find-target-indices-after-sorting-array Complete

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < nums.length; i ++) {
            if(target == nums[i]) answer.add(i);
        }
        return answer;
    }
}
