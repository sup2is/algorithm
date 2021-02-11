//tape_equilibrium: https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/ Complete

package tape_equilibrium;

public class Solution {

    public static int solution(int[] A) {
        int x = 0;
        int min = 100001;

        int totalP = 0;

        for (int i = 1; i < A.length; i++) {
            totalP += A[i];
        }

        for (int i = 0; i < A.length - 1; i++) {
            x += A[i];
            min = Math.min(Math.abs(x - totalP), min);
            totalP -= A[i + 1];
        }

        return min;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int []{3, 1, 2, 4, 3}));
    }


}


