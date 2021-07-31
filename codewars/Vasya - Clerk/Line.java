//Vasya - Clerk: https://www.codewars.com/kata/555615a77ebc7c2c8a0000b8 Complete

import java.util.HashMap;
import java.util.Map;

public class Line {
    public static String Tickets(int[] peopleInLine) {

        Map<Integer, Integer> map = new HashMap<>();

         for (int pee : peopleInLine) {
            if(pee == 25) {
                map.compute(25, (tf, value) -> map.getOrDefault(tf, 0) + 1);
            } else if (pee == 50) {
                if (map.containsKey(25) && map.get(25) > 1) {
                    map.put(25, map.get(25) - 1);
                } else {
                    return "NO";
                }
                map.put(50, map.getOrDefault(50, 0) + 1);
            } else if (pee == 100) {
                if(map.containsKey(50) && map.get(50) > 0 && map.containsKey(25) && map.get(25) > 0) {
                    map.put(50, map.get(50) - 1);
                    map.put(25, map.get(25) - 1);
                } else if (map.containsKey(25) && map.get(25) > 2) {
                    map.put(25, map.get(25) - 3);
                } else {
                    return "NO";
                }
                map.put(100, map.getOrDefault(100, 0) + 1);
            }
        }
        return "YES";
    }
}
