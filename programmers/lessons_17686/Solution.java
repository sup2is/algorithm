//파일명 정렬: https://programmers.co.kr/learn/courses/30/lessons/17686 Complete

import java.util.Arrays;

class Solution3 {

    public static String[] solution(String[] files) {

        Arrays.sort(files, (a, b) -> {
            String headOfA = a.split("[0-9]")[0];
            String headOfB = b.split("[0-9]")[0];

            int result = headOfA.toLowerCase().compareTo(headOfB.toLowerCase());

            if (result == 0) {
                return findNum(a, headOfA) - findNum(b, headOfB);
            }

            return result;
        });

        return files;
    }

    private static int findNum(String s, String h) {
        s = s.replace(h, "");
        String result = "";

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c) && result.length() < 5) {
                result += c;
            } else {
                break;
            }
        }

        return Integer.valueOf(result);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"img12111111.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"})));
        System.out.println(Arrays.toString(solution(new String[]{"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"})));
    }
}


