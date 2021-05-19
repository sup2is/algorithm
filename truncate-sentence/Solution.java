//truncate-sentence: https://leetcode.com/problems/truncate-sentence Complete

import java.util.StringTokenizer;

class Solution {
    public String truncateSentence(String s, int k) {
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder sb = new StringBuilder();
        while(k-- > 1) {
            sb.append(st.nextToken());
            sb.append(" ");
        }
        sb.append(st.nextToken());
        return sb.toString();
    }
}
