//sort-integers-by-the-number-of-1-bits: https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/ Complete

class Solution {
    public int[] sortByBits(int[] arr) {
        
        return Arrays.stream(arr)
            .boxed()
            .sorted((a, b) -> {
                int x = Integer.bitCount(a);
                int y = Integer.bitCount(b);
                return x == y ? Integer.compare(a, b) : Integer.compare(x, y);
            })
            .mapToInt(i -> i)
            .toArray();
        
        
    }
}

