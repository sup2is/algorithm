//final-value-of-variable-after-performing-operations: https://leetcode.com/problems/final-value-of-variable-after-performing-operations Complete

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String s : operations) {
            if(s.contains("++")) {
                x ++;
            } else {
                x --;
            }
        }
        return x;
    }
}
