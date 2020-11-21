//distribute-candies-to-people: https://leetcode.com/problems/distribute-candies-to-people/ Complete

class Solution {
    public static int[] distributeCandies(int candies, int num_people) {
        int[] arr = new int[num_people];

        int idx = 0;
        int val = 1;

        while (candies > 0) {
            if(candies - val > 0) {
                arr[idx % num_people] += val;
                candies -= val;
            }else {
                arr[idx % num_people] += candies;
                candies = 0;
            }
            idx ++;
            val ++;
        }
        return arr;
    }
}
