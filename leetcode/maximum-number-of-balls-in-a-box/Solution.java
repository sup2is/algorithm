package maximum_number_of_balls_in_a_box;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int countBalls(int lowLimit, int highLimit) {
        int max = 0;
        Map<Long, Integer> map = new HashMap<>();
        for (int i = lowLimit; i <= highLimit; i++) {
            long v = to(i + "");
            map.put(v, map.getOrDefault(v, 0) + 1);
            max = Math.max(max, map.get(v));
        }
        return max;
    }

    public long to(String s) {
        return s.chars()
                .map(c -> c - 48)
                .sum();
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        s.countBalls(19 , 28);
    }
}
