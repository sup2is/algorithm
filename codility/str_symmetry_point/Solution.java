//str_symmetry_point: https://app.codility.com/programmers/trainings/4/str_symmetry_point/start/ Complete

class Solution {
    public static int solution(String s) {

        if(s.isEmpty() || s.length() % 2 == 0) {
            return -1;
        }

        if(s.length() == 1) {
            return 0;
        }

        int idx = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != s.charAt(idx--)) {
                return -1;
            }
        }

        return s.length() / 2;
    }
}
