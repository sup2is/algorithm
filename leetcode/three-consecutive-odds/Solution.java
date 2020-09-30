//three-consecutive-odds: https://leetcode.com/problems/three-consecutive-odds/submissions/ Complete


class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        
        int cnt = 0;
        
        for(int a : arr) {
            if(a % 2 == 0) {
                cnt = 0;
            } else {
                cnt ++;
                if(cnt > 2) {
                    return true;
                }
            }
        }
        
        return false;
        
    }
}
