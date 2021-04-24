//check-if-the-sentence-is-pangram: https://leetcode.com/problems/check-if-the-sentence-is-pangram/ Complete

class Solution {
    public boolean checkIfPangram(String sentence) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        for(char c : sentence.toCharArray()) {
            if(!set.contains(c)) {
                set.add(c);
                count ++;
            }
        }
        return count == 26 ? true : false;
    }
}