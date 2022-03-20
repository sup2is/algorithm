//longest_password: https://app.codility.com/programmers/trainings/1/longest_password/start/ Complete

import java.util.*;

class Solution {

    public static int solution(String S) {

        StringTokenizer st = new StringTokenizer(S);
        int answer = -1;

        while (st.hasMoreTokens()) {
            String s = st.nextToken();

            if (s.length() % 2 == 0) {
                continue;
            }

            String str = s.replaceAll("[A-Z,a-z,0-9]", "");

            if (str.length() != 0) {
                continue;
            }

            str = s.replaceAll("([0-9])", "");

            if (str.length() % 2 != 0) {
                continue;
            }

            answer = Math.max(answer, s.length());

        }

        return answer;
    }

    public static void main(String[] args) {
        long solution = solution("zaq!2#edc");
        System.out.println(solution);
    }
}

