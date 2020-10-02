//shortest-distance-to-a-character: https://leetcode.com/problems/shortest-distance-to-a-character/ Complete

class Solution {
    public int[] shortestToChar(String S, char C) {
        
        int[] arr = new int[S.length()];
        
        Arrays.fill(arr, S.length() * 2);
        
        for(int i = 0; i < S.length(); i ++) {
            if(S.charAt(i) == C) {
                
                arr[i] = 0;
                
                int weight = 1;
                for(int j = i - 1; j >= 0; j --) {
                    if(S.charAt(j) == C) break;
                    System.out.println(S.charAt(j));
                    arr[j] = Math.min(arr[j], weight);
                    weight++;
                }
                
                weight = 1;
                for(int k = i + 1; k < S.length(); k ++) {
                    if(S.charAt(k) == C) break;
                    arr[k] = Math.min(arr[k], weight);
                    weight++;
                }
            
            }
        }
        
        return arr;
    }
}
