//check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence: https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/ Complete

import java.util.StringTokenizer;

class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        
        StringTokenizer st = new StringTokenizer(sentence);
        
        int cnt = 0;
        
        while(st.hasMoreTokens()) {
            cnt ++;
            if(st.nextToken().startsWith(searchWord)) {
                return cnt;
            }
        }
        
        return -1;
    }
}
