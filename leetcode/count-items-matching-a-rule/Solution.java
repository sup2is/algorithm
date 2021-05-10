//count-items-matching-a-rule: https://leetcode.com/problems/count-items-matching-a-rule/ Complete

class Solution {
    
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int idx = 0;
        switch(ruleKey) {
            case "type": idx = 0; break;
            case "color": idx = 1; break;
            case "name": idx = 2; break;
        }

        final int finalIdx = idx;
        return (int) items.stream()
            .filter(strings -> strings.get(finalIdx).equals(ruleValue))
            .count();
    }

}