//count-the-number-of-consistent-strings: https://leetcode.com/problems/count-the-number-of-consistent-strings/ Complete

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> chars = new HashSet<>();
        
        for(char c : allowed.toCharArray()) {
            chars.add(c);
        }
        
        int cnt = words.length;
        
        for(String s : words) {
            for(char c : s.toCharArray()) {
                if(!chars.contains(c)){
                    cnt --;
                    break;
                }
            }
        }
        
        return cnt;
    }
}
