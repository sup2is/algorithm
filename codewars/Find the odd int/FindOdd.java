//Find the odd int: https://www.codewars.com/kata/54da5a58ea159efa38000836 Complete

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindOdd {
    public static int findIt(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(a)
                .forEach(i -> map.compute(i, (k, v) -> map.getOrDefault(k, 0) + 1));
        return map.entrySet().stream()
                .filter(e -> e.getValue() % 2 != 0)
                .map(Map.Entry::getKey)
                .findFirst()
                .get().intValue();
    }
}
