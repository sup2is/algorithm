//group-the-people-given-the-group-size-they-belong-to: https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/ Complete

import java.util.*;

class Solution {
    public static List<List<Integer>> groupThePeople(int[] groupSizes) {

        List<List<Integer>> lists = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < groupSizes.length; i++) {

            if(map.containsKey(groupSizes[i])) {
                map.get(groupSizes[i]).add(i);
            }else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(groupSizes[i], list);
            }

            if(map.get(groupSizes[i]).size() == groupSizes[i]) {
                lists.add(map.get(groupSizes[i]));
                map.remove(groupSizes[i]);
            }
        }

        map.values().stream()
                .forEach(lists::add);


        return lists;
    }

}
