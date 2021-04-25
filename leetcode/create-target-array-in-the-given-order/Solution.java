//create-target-array-in-the-given-order: https://leetcode.com/problems/create-target-array-in-the-given-order/ Complete

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList();
        
        for(int i = 0; i < nums.length; i ++) {
            list.add(index[i], nums[i]);    
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}