//generate-a-string-with-characters-that-have-odd-counts: https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts Complete

class Solution {
    public String generateTheString(int n) {
        if(n == 1) return "a";
        if(n % 2 == 0) {
            return IntStream.range(0, n - 1)
                .mapToObj(i -> "a")
                .collect(Collectors.joining()) + "b";
        } else {
            return IntStream.range(0, n - 2)
                    .mapToObj(i -> "a")
                    .collect(Collectors.joining()) + "bc";
        }
    }
}
