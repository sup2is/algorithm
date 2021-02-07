//perm_check: https://app.codility.com/programmers/lessons/4-counting_elements/perm_check/ Complete

// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        
        Arrays.sort(A);

        for(int i = 0; i < A.length; i ++) {
            if(i + 1 != A[i]) return 0;
        }

        return 1;

    }
}
