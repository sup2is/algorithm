//frog_river_one: https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/ Complete

package frog_river_one;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static int solution(int X, int[] A) {
        if(X > A.length) return -1;

        Set<Integer> ts = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            ts.add(A[i]);
            if(ts.size() == X) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(5, new int []{1, 3, 1, 4, 2, 3, 5, 4}));
    }

}


