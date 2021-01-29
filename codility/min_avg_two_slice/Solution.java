//min_avg_two_slice: https://app.codility.com/programmers/lessons/5-prefix_sums/min_avg_two_slice/ Complete

package min_avg_two_slice;

public class Solution {

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int idx = A.length;
        double minAvg = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            double avg;
            if(i + 1 < A.length) {
                avg = (double) (A[i] + A[i + 1]) / 2;
                if(avg < minAvg) {
                    minAvg = avg;
                    idx = i;
                }
            }

            if(i + 2 < A.length) {
                avg = (double) (A[i] + A[i + 1]) / 2;
                if(avg < minAvg) {
                    minAvg = avg;
                    idx = i;
                }
            }
        }
        return idx;
    }
    public static void main(String[] args) {
//        System.out.println(solution(new int[]{4,2,2,5,2,2,8}));
        System.out.println(solution(new int[]{4,2}));
//        System.out.println(solution(new int[]{-100,2,-200,5,1,5,8}));
    }
}

