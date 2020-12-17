//minimum-absolute-difference: https://leetcode.com/problems/minimum-absolute-difference/ Complete

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        var ans = new ArrayList<List<Integer>>();
        for(int i = 0; i < arr.length -1; i ++) {
            min = Math.min(arr[i + 1] - arr[i], min);
        }
        for(int i = 0; i < arr.length -1; i ++) {
            if(arr[i + 1] - arr[i] == min) {
                ans.add(Arrays.asList(arr[i], arr[i + 1]));    
            }
        }
        return ans;
    }
}
