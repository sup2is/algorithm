//max_counters: https://app.codility.com/programmers/lessons/4-counting_elements/max_counters/ Complete

package max_counters;

import java.util.Arrays;

public class Solution {

    public static int[] solution(int N, int[] A) {

        int max = 0;
        int targetMax = 0;
        int[] answer = new int[N];

        for (int i = 0; i < A.length; i++) {
            if(A[i] > N) {
                targetMax = max;
            }else {
                int idx = A[i] - 1;
                if(targetMax > answer[idx]){
                    answer[idx] = targetMax;
                }
                answer[idx] ++;
                max = Math.max(answer[idx], max);
            }
        }
        for (int i = 0; i < answer.length; i++) {
            if(answer[i] < targetMax) answer[i] = targetMax;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int []{3,4,4,6,1,4,4})));
    }

}


