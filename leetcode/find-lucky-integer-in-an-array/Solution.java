//find-lucky-integer-in-an-array: https://leetcode.com/problems/find-lucky-integer-in-an-array/ Complete

class Solution {
    public int findLucky(int[] arr) {
        var map = new TreeMap<Integer, Integer>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        return map.entrySet()
                .stream()
                .filter(e -> e.getKey() == e.getValue())
                .map(e -> e.getKey())
                .max((o1, o2) -> Integer.compare(o1, o2))
                .orElse(-1);
    }
}
