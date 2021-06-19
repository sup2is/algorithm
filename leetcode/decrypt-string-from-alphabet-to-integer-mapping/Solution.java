//decrypt-string-from-alphabet-to-integer-mapping: https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/ Complete
class Solution {
    public static String freqAlphabets(String s) {
        int idx = s.length() - 1;
        List<Character> list = new ArrayList<>();
        while (idx >= 0) {
            if (s.charAt(idx) == '#') {
                list.add((char) (Integer.parseInt(s.substring(idx - 2, idx)) + 96));
                idx -= 3;
            } else {
                list.add((char) (s.charAt(idx) - 48 + 96));
                idx --;
            }
        }

        StringBuilder sb = new StringBuilder();
        list.stream()
                .forEach(sb::append);
        return sb.reverse().toString();
    }
}
