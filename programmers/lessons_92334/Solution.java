//신고 결과 받기: https://programmers.co.kr/learn/courses/30/lessons/92334 Complete

import java.util.*;
import java.util.stream.Collectors;

class Solution {

    public static int[] solution(String[] id_list, String[] report, int k) {

        Map<String, Set<String>> map = new HashMap<>();

        for (String s : id_list) {
            map.put(s, new HashSet<>());
        }

        for (int i = 0; i < report.length; i++) {
            String[] ids = report[i].split(" ");
            map.get(ids[1]).add(ids[0]);
        }

        List<Set<String>> list = map.entrySet()
                .stream()
                .filter(e -> e.getValue().size() >= k)
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());

        int[] answer = new int[id_list.length];

        for (int i = 0; i < id_list.length; i++) {
            for (Set<String> ids : list) {
                if(ids.contains(id_list[i])) {
                    answer[i] ++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(
                solution(new String[]{"muzi", "frodo", "apeach", "neo"},
                        new String[]{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"},
                        2)
        );
    }
}
