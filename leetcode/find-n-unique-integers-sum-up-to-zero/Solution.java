//find-n-unique-integers-sum-up-to-zero: https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/ Complete

class Solution {
    public int[] sumZero(int n) {
        
        int[] arr = new int[n + 1];
        
        for(int i = 0; i < n + 1; i ++) {
            if(i % 2 == 0) {
                arr[i] = (i / 2) * (- 1);
            }else {
                arr[i] = (i / 2) + 1;
            }
        }
        
        return n % 2 != 0 
            ? Arrays.copyOfRange(arr, 0, n) 
            : Arrays.copyOfRange(arr, 1, n + 1);
    }
}
