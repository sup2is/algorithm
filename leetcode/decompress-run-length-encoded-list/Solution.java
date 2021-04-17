//decompress-run-length-encoded-list: https://leetcode.com/problems/decompress-run-length-encoded-list Complete 

class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length - 1; i += 2) {
            for(int j = 0; j < nums[i]; j ++){
                list.add(nums[i + 1]);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}