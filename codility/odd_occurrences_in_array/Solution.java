//odd_occurrences_in_array: https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/ Complete

package odd_occurrences_in_array;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int i : A) {
            if(set.contains(i)) {
                set.remove(i);
            }else {
                set.add(i);
            }
        }
        return set.iterator().next();
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
    }

}

