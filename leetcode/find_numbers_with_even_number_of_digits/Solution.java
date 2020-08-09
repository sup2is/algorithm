//find-numbers-with-even-number-of-digits: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/ Complete
package find_numbers_with_even_number_of_digits;

import java.util.Arrays;

public class Solution {
    public int findNumbers(int[] nums) {
        return (int) Arrays.stream(nums)
                .mapToObj(i -> String.valueOf(i))
                .filter(s -> s.length() % 2 == 0)
                .count();
    }
}