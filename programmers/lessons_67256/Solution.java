//2020 카카오 인턴십 키패드 누르기: https://programmers.co.kr/learn/courses/30/lessons/67256 Complete

import java.util.HashMap;
import java.util.Map;

class Solution {

    public static String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        Map<Integer, int[]> map = new HashMap<>();
        map.put(0, new int[]{3, 1});
        int v = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                map.put(v++, new int[]{i, j});
            }
        }

        int[] left = new int[]{3, 0};
        int[] right = new int[]{3, 2};

        for (int number : numbers) {
            if(number == 1 || number == 4 || number == 7) {
                left = map.get(number);
                sb.append("L");
                continue;
            }

            if(number == 3 || number == 6 || number == 9) {
                right = map.get(number);
                sb.append("R");
                continue;
            }

            int[] point = map.get(number);

            int leftValue = Math.abs(left[0] - point[0]) + Math.abs(left[1] - point[1]);
            int rightValue = Math.abs(right[0] - point[0]) + Math.abs(right[1] - point[1]);

            if(leftValue < rightValue) {
                left = map.get(number);
                sb.append("L");
            } else if (leftValue > rightValue){
                right = map.get(number);
                sb.append("R");
            } else {
                if(hand.equals("right")) {
                    right = map.get(number);
                    sb.append("R");
                }else {
                    left = map.get(number);
                    sb.append("L");
                }
            }
        }

        return sb.toString();
    }

}
