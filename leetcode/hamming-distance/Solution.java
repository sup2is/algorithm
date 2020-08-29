//hamming-distance: https://leetcode.com/problems/hamming-distance/ Complete

class Solution {
    public int hammingDistance(int x, int y) {
        String xs = Integer.toBinaryString(x);
        String ys = Integer.toBinaryString(y);
        
        if(xs.length() < ys.length()) {
            xs = lpadZero(xs, ys.length() - xs.length());
        } else {
            ys = lpadZero(ys, xs.length() - ys.length());
        }
        
        int cnt = 0;
        
        for(int i = 0; i < xs.length(); i ++) {
            if(xs.charAt(i) != ys.charAt(i)) cnt ++;
        }
        return cnt;
        
    }
    
    public String lpadZero(String s, int length) {
        System.out.println(length);
        StringBuilder sb = new StringBuilder();    
        while(length-- > 0) sb.append("0");
        sb.append(s);
        return sb.toString();
    }
}
