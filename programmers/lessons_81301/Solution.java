//숫자 문자열과 영단어: https://programmers.co.kr/learn/courses/30/lessons/81301 Complete

class Solution {
    public int solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] digits = {"0","1","2","3","4","5","6","7","8","9"};
        String[] alphabets = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(int i=0; i<10; i++){
            s = s.replaceAll(alphabets[i],digits[i]);
        }

        return Integer.parseInt(s);
    }
}
