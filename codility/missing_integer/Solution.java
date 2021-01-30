//missing_integer: https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/ Complete

// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        final int MAX = 100001;
        Set<Integer> set = new HashSet<>();
        for(int i : A){
            if(i > 0) set.add(i);
        }

        for(int i = 1; i <= MAX; i ++) {
            if(!set.contains(i))
                return i;
        }

        return -1;
    }
}
