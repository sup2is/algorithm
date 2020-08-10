//destination-city: https://leetcode.com/problems/destination-city/submissions/ Complete

class Solution {
    public String destCity(List<List<String>> paths) {
     
        Map<String, String> map = new HashMap<>();
        
        String v = null;
        for(List<String> list : paths) {
            map.put(list.get(0), list.get(1));
        }
        
        for(String s : map.values()) {
            if(!map.containsKey(s)) {
                v = s;
                break;
            }
        }
        return v;
    }
}
