//1주차_부족한 금액 계산하기: https://programmers.co.kr/learn/courses/30/lessons/82612 Complete

class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;

        for (int i = 1; i <= count; i ++) {
            answer += i * price;
        }
        
        return answer <= money ? 0 : answer - money;
    }
}
