//number-complement: https://leetcode.com/problems/number-complement/ Complete

class Solution {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        
        StringBuilder sb = new StringBuilder();
        
        for(char c : s.toCharArray()) {
            int i = c == '0' ? 1 : 0;
            sb.append(i);
        }
        
        return Integer.parseInt(sb.toString(), 2);
        
    }
}
