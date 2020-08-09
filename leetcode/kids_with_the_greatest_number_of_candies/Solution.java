package kids_with_the_greatest_number_of_candies;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        return  Arrays.stream(candies)
            .mapToObj(value -> value + extraCandies >= max)
            .collect(Collectors.toList());
    }

}
