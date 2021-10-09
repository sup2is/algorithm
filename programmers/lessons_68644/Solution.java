//두 개 뽑아서 더하기: https://programmers.co.kr/learn/courses/30/lessons/68644 Complete

import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        TreeSet<Integer> set = new TreeSet<>();
        
        for (int i = 0; i < numbers.length; i ++) {
            for (int j = i + 1; j < numbers.length; j ++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        Integer[] arr = set.toArray(new Integer[0]);
        
        return Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
    }
}
