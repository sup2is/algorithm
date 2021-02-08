//perm_missing_elem: https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/ Complete

package perm_missing_elem;

import java.util.Arrays;

public class Solution {

    public static int solution(int[] A) {
        if(A.length == 0) return 1;

        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if(A[i] != i + 1) return i + 1;
        }
        return A.length + 1;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int []{1, 2, 3, 5}));
        System.out.println(solution(new int []{2, 3, 4, 5}));
        System.out.println(solution(new int []{4, 1, 3, 2}));
        System.out.println(solution(new int []{1}));
        System.out.println(solution(new int []{1, 2}));
    }


}


