//n-repeated-element-in-size-2n-array: https://leetcode.com/problems/n-repeated-element-in-size-2n-array/ Complete

class Solution {
    public int repeatedNTimes(int[] A) {
        int[] arr = new int[10001];
        
        for(int i : A) {
            arr[i]++;
        }
        
        int max = 0;
        int maxIdx = 0;
        for(int i = 0; i < arr.length; i ++) {
            if(max < arr[i]) {
                max = arr[i];
                maxIdx = i;
            }
        }
        return maxIdx;
    }
}
