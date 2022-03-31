//메뉴 리뉴얼: https://programmers.co.kr/learn/courses/30/lessons/72411

import java.util.*;

public class Solution {
    public static String[] solution(String[] orders, int[] course) {
        
        String[] temp = new String[orders.length];

        for (int i = 0; i < orders.length; i++) {
            char[] chars = orders[i].toCharArray();
            Arrays.sort(chars);
            temp[i] = new String(chars);
        }

        orders = temp;

        TreeSet<String> answers = new TreeSet<>();

        for (int i = 0; i < course.length; i++) {

            Map<String, Integer> map = new HashMap<>();

            for (int j = 0; j < orders.length; j++) {

                boolean[] visited = new boolean[orders[j].length()];
                recursive(map, orders[j], visited, course[i], 0, "");

            }

            if (map.isEmpty()) {
                continue;
            }

            Integer max = map.entrySet().stream()
                    .max(Comparator.comparingInt(Map.Entry::getValue))
                    .get()
                    .getValue();

            if (max < 2) {
                continue;
            }

            map.entrySet().stream()
                    .filter(e -> e.getValue() == max)
                    .forEach(e -> answers.add(e.getKey()));

        }
        
        return answers.toArray(new String[]{});
    }

    private static void recursive(final Map<String, Integer> map, final String org, final boolean[] visited, final int r, final int start, final String target) {
        if(r == 0) {
            map.put(target, map.getOrDefault(target, 0) + 1);
            return;
        }

        for (int i = start; i < org.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                recursive(map, org, visited, r - 1, i + 1, target + org.charAt(i));
                visited[i] = false;
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(
                        solution(new String[] {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"}, new int[]{2, 3, 4})
                )
        );
        System.out.println(
                Arrays.toString(
                        solution(new String[] {"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"}, new int[]{2, 3, 5})
                )
        );
        System.out.println(
                Arrays.toString(
                        solution(new String[] {"XYZ", "XWY", "WXA"}, new int[]{2, 3, 4})
                )
        );

        System.out.println();
    }
}
