//determine-if-string-halves-are-alike: https://leetcode.com/problems/determine-if-string-halves-are-alike/ Complete

class Solution {
    public static boolean halvesAreAlike(String s) {
        Set<Character> set = new HashSet<>();
        set.addAll(List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        int left = 0;
        int right = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.length() / 2 > i) {
                left = set.contains(s.charAt(i)) ? left + 1 : left;
            } else {
                right = set.contains(s.charAt(i)) ? right + 1 : right;
            }
        }

        return left == right;
    }
}
