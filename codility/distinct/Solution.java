//distinct: https://app.codility.com/programmers/lessons/6-sorting/distinct/ Complete

package distinct;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        for(int i : A) {

            set.add(i);
        }
        return set.size();
    }

    public static void main(String[] args) {
        System.out.println(solution(new int []{2, 1, 1, 2, 3, 1}));
    }

}


