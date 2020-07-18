package can_make_arithmetic_progression_from_sequence;

import java.util.Arrays;

public class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {

        Arrays.sort(arr);
        int interval = Math.abs(arr[0] - arr[1]);

        for (int i = 1; i < arr.length - 1; i++) {
            if(Math.abs(arr[i] - arr[i + 1]) != interval) {
                return false;
            }
        }

        return true;

    }

}