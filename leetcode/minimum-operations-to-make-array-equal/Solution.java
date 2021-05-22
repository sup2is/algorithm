//minimum-operations-to-make-array-equal: https://leetcode.com/problems/minimum-operations-to-make-array-equal/ Complete

class Solution {
    public int minOperations(int n) {
        int idx = n % 2 == 0 ? n / 2 - 1 : n / 2;
        int value = idx * 2 + 1;
        if(n % 2 == 0) value ++;
        int cnt = 0;
        for (int i = 0; i <= idx; i++) {
            cnt += value - (i * 2 + 1);
        }
        return cnt;
    }
}
