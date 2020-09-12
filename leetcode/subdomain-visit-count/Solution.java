//subdomain-visit-count: https://leetcode.com/problems/subdomain-visit-count/ Complete

import java.util.StringTokenizer;

class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        
        Map<String, Integer> map = new HashMap<>();
        
        for(String s: cpdomains) {
            
            StringTokenizer st = new StringTokenizer(s);
            int score = Integer.parseInt(st.nextToken());
            
            String domain = st.nextToken();
            
            while(domain.contains(".")){
                map.put(domain, map.getOrDefault(domain, 0) + score);
                domain = domain.substring(domain.indexOf('.') + 1);
            }
            map.put(domain, map.getOrDefault(domain, 0) + score);
        
        }
        
        return map.entrySet()
            .stream()
            .map(v -> v.getValue() + " " + v.getKey())
            .collect(Collectors.toList());
  
    }
}
