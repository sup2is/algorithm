//passing_cars: https://app.codility.com/programmers/lessons/5-prefix_sums/passing_cars/ Complete

package passing_cars;

public class Solution {

    public static int solution(int[] A) {

        int zeroCnt = -1;
        int cnt = 0;

        for(int i = 0; i < A.length; i ++){
            if(A[i] == 1) {
                cnt += zeroCnt + 1;

                if(cnt > 1000000000) {
                    return -1;
                }

            }else {
                zeroCnt ++;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{0,1,0,1,1}));
    }
}

