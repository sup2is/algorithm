//max_product_of_three: https://app.codility.com/programmers/lessons/6-sorting/max_product_of_three/ Complete

package max_product_of_three;

import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        return Math.max(A[A.length - 3] * A[A.length - 2] * A[A.length - 1],
                          A[0] * A[1] * A[A.length - 1]);
    }
}
