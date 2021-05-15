//replace-all-digits-with-characters: https://leetcode.com/problems/replace-all-digits-with-characters Complete

class Solution {
    public static String replaceDigits(String s) {
        char[] result = new char[s.length()];
        for (int i = 0; i < result.length; i++) {
            if(i % 2 == 0) {
                result[i] = s.charAt(i);
            } else {
                result[i] = (char) (s.charAt(i - 1) + (s.charAt(i) - 48));
            }
        }
        return new String(result);
    }
}
