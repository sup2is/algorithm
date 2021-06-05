//sorting-the-sentence: https://leetcode.com/problems/sorting-the-sentence/ Complete

import java.util.*;

class Solution {
    public String sortSentence(String s) {
        StringTokenizer st = new StringTokenizer(s);
        String[] strs = new String[st.countTokens()];
        while(st.hasMoreTokens()) {
            String str = st.nextToken();
            int idx = str.charAt(str.length() - 1) - 48;
            strs[idx - 1] = str.substring(0, str.length() - 1);
        }
        
        return Arrays.stream(strs)
            .collect(Collectors.joining(" "));
    }
}
