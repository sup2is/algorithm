//cyclic_rotation: https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/ Complete

package cyclic_rotation;

import java.util.Arrays;

public class Solution {

    public static int[] solution(int[] A, int K) {
        if(A.length == K) return A;
        int[] arr = new int[A.length];

        for(int i = 0; i < A.length; i ++) {
            arr[(i + K) % A.length] = A[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int []{3, 8, 9, 7, 6}, 3)));
//        System.out.println(Arrays.toString(solution(new int []{5, -1000}, 2)));
    }


}

