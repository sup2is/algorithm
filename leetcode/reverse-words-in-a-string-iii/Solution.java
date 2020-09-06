//reverse-words-in-a-string-iii: https://leetcode.com/problems/reverse-words-in-a-string-iii/ Complete

class Solution {
    public String reverseWords(String s) {
        List<String> strs = Arrays.stream(s.split(" "))
            .map(st -> new StringBuilder(st).reverse().toString())
            .collect(Collectors.toList());
        return String.join(" ", strs);
    }
}
