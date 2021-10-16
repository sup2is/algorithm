//내적: https://programmers.co.kr/learn/courses/30/lessons/70128 Complete

import java.util.stream.IntStream;

class Solution {
    public int solution(int[] a, int[] b) {
        return IntStream.range(0, a.length)
            .map(i -> a[i] * b[i])
            .sum();
    }
}
