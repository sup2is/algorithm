//배달: https://programmers.co.kr/learn/courses/30/lessons/12978 Complete

import java.util.*;

class Solution {
    static Set<Integer> set = new HashSet<>();
    static boolean[] check;

    public static int solution(int N, int[][] road, int K) {

        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
        set = new HashSet<>();
        check = new boolean[N + 1];

        check[1] = true;
        set.add(1);

        for (int i = 0; i < N; i++) {
            map.put(i + 1, new HashMap<>());
        }

        for (int[] ints : road) {

            int k1 = ints[0];
            int k2 = ints[1];
            int v = ints[2];

            Map<Integer, Integer> bridge = map.get(k1);
            if (bridge.containsKey(k2)) {
                Integer org = bridge.get(k2);
                if (org > v) {
                    bridge.put(k2, v);
                }
            } else {
                bridge.put(k2, v);
            }

            Map<Integer, Integer> bridge2 = map.get(k2);
            if (bridge2.containsKey(k1)) {
                Integer org = bridge2.get(k1);
                if (org > v) {
                    bridge2.put(k1, v);
                }
            } else {
                bridge2.put(k1, v);
            }

        }

        func(map, map.get(1), 1, 0, K);

        return set.size();
    }

    private static void func(final Map<Integer, Map<Integer, Integer>> map, final Map<Integer, Integer> bridges, final int key, final int curr, final int k) {
        for (Map.Entry<Integer, Integer> bridge : bridges.entrySet()) {
            if (curr + bridge.getValue() <= k && !check[bridge.getKey()]) {
                set.add(bridge.getKey());
                check[bridge.getKey()] = true;
                func(map, map.get(bridge.getKey()), bridge.getKey(), curr + bridge.getValue(), k);
                check[bridge.getKey()] = false;
            }
        }
    }

    public static void main(String[] args) {
//        int solution = solution(5, new int[][]{{1, 2, 1}, {2, 3, 3}, {5, 2, 2}, {1, 4, 2}, {5, 3, 1}, {5, 4, 2}}, 3);
        int solution = solution(6, new int[][]{{1, 2, 1}, {1, 3, 2}, {2, 3, 2}, {3, 4, 3}, {3, 5, 2}, {3, 5, 3}, {5, 6, 1}}, 4);
//        int solution = solution(5, new int[][]{{1, 2, 4}, {1, 3, 1}, {3, 4, 1}, {4, 2, 1}, {2, 5, 1}}, 4);
//        int solution = solution(5, new int[][]{{1, 2, 1}}, 4);
        System.out.println(solution);
    }
}
