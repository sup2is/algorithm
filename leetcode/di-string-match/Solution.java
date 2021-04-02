//di-string-match: https://leetcode.com/problems/di-string-match/ Complete

package di_string_match;

import java.util.*;

public class Solution {

    public int[] diStringMatch(String S) {
        int n = S.length(), left = 0, right = n;
        int[] res = new int[n + 1];
        for (int i = 0; i < n; ++i)
            res[i] = S.charAt(i) == 'I' ? left++ : right--;
        res[n] = left;
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.diStringMatch("IDID")));
    }
}
