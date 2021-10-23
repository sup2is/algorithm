//나머지가 1이되는 수 찾기: https://programmers.co.kr/learn/courses/30/lessons/87389 Complete

class Solution {
    public int solution(int n) {
        int min = Integer.MAX_VALUE;

        for (int i = 2; i < n; i++) {
            if(n % i == 1) {
                min = Math.min(i, min);
            }
        }
        return min;
    }
}
