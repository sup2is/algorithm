package kids_with_the_greatest_number_of_candies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> answers = new ArrayList<>();

        int max = Arrays.stream(candies).max().getAsInt();

        for (int candy : candies) {
            if(candy + extraCandies >= max) {
                answers.add(true);
            }else {
                answers.add(false);
            }
        }

        return answers;
    }

}
