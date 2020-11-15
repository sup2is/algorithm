//uncommon-words-from-two-sentences: https://leetcode.com/problems/uncommon-words-from-two-sentences/ Complete


import java.util.HashMap;
import java.util.stream.Collectors;

class Solution {
    public static String[] uncommonFromSentences(String A, String B) {

        var map = new HashMap<String, Integer>();
        for (String str : A.split(" ")) map.put(str, map.getOrDefault(str , 0) + 1);
        for (String str : B.split(" ")) map.put(str, map.getOrDefault(str , 0) + 1);
        return map.entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(e -> e.getKey())
                .collect(Collectors.toList())
                .toArray(String[]::new);
    }
}
