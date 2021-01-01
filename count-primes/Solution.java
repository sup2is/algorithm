//count-primes: https://leetcode.com/problems/count-primes Complete

class Solution {
    public int countPrimes(int n) {
        
        boolean[] p = new boolean[n];
        Arrays.fill(p, true);
        
        for(int i = 2; i < n; i ++) {
            if(p[i]) {
                for(int j = i * 2; j < n; j += i) {
                    p[j] = false;
                }
            }
        }
    
        
        int cnt = 0;
        for(int i = 2; i < n; i ++) {
            if(p[i]) cnt ++;
        }
        
        return cnt;
    }
}
