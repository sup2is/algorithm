//find-words-that-can-be-formed-by-characters: https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/ Complete

class Solution {
    public int countCharacters(String[] words, String chars) {
        int answer = 0;
        Map<Character, Integer> map = new HashMap<>();
        boolean flag = false;
        for(String w : words) {
            init(map, chars);
            flag = true;
            for(char c : w.toCharArray()) {
                if(!map.containsKey(c) || map.get(c) == 0) {
                    flag = false;
                    break;
                } else {
                    map.put(c, map.get(c) -1);
                }
            }
            
            if(flag) {
               answer += w.length();
            }
        }
        return answer;
    }
    public void init(Map<Character, Integer> map, String chars) {
        map.clear();
        for(char c : chars.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
    }
}
