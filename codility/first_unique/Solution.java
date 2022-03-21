// first_unique: https://app.codility.com/programmers/trainings/4/first_unique/start/ Complete 

import java.util.*;

class Solution {
    public static int solution(int[] A) {

        Set<Integer> set = new HashSet<>();
        Set<Integer> unique = new LinkedHashSet<>();

        for (int v : A) {
            if (set.contains(v)) {
                unique.remove(v);
            } else {
                unique.add(v);
                set.add(v);
            }
        }

        return unique.isEmpty() ? -1 : unique.iterator().next();
    }

    public static void main(String[] args) {
        Solution.solution(new int[] {4, 10, 5, 4, 2, 10});
//        Solution.solution(new int[] {1, 1, 1, 2, 3, 3, 3});
    }
}
