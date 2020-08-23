//robot-return-to-origin: https://leetcode.com/problems/robot-return-to-origin/ Complete

class Solution {
    public boolean judgeCircle(String moves) {
        Map<Character, Integer> map = new HashMap<>();
        
        map.put('U', 0);
        map.put('D', 0);
        map.put('R', 0);
        map.put('L', 0);
        
        for(char c : moves.toCharArray()) {
            map.put(c, map.get(c) + 1);
        }
        
        return (map.get('U') - map.get('D')) == 0 && (map.get('R') - map.get('L')) == 0;
    }
}
