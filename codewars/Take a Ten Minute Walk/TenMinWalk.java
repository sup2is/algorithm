//Take a Ten Minute Walk: https://www.codewars.com/kata/54da539698b8a2ad76000228 Complete

import java.util.HashMap;
import java.util.Map;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        if(walk.length != 10) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char c : walk) {
            map.compute(c, (character, integer) -> map.getOrDefault(character, 0) + 1);
        }

        int x = map.getOrDefault('n', 0) - map.getOrDefault('s', 0);
        int y = map.getOrDefault('w', 0) - map.getOrDefault('e', 0);
        return x == 0 && y == 0;
    }
}
