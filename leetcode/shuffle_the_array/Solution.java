package shuffle_the_array;

public class Solution {
    public static int[] shuffle(int[] nums, int n) {
        int[] copy = new int[nums.length];
        int idx = 0;
        int target = 0;
        while (idx < n * 2) {
            if(idx % 2 == 0) {
                copy[idx] = nums[target];
                target += n;
            }else {
                copy[idx] = nums[target];
                target -= n - 1;
            }
            idx ++;
        }



        return copy;
    }

    public static void main(String[] args) {
        shuffle(new int[] {1,1, 2, 2} , 2);
    }
}