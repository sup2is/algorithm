//minimum-number-of-operations-to-move-all-balls-to-each-box: https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box Complete

import java.util.*;

class Solution {
    public int[] minOperations(String boxes) {
        char[] boxArr = boxes.toCharArray();
        int[] answer = new int[boxArr.length];
        List<Integer> list = new ArrayList<>();
        IntStream.range(0, boxArr.length)
            .filter(i -> (boxArr[i] - '0') != 0)
            .forEach(list::add);
        
        for(int i = 0; i < boxArr.length; i ++) {
            for(int x : list) {
                if(i == x) continue;
                answer[i] += Math.abs(i - x);
            }    
        }
        return answer;
    }
}