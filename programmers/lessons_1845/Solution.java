package lessons_1845;

import java.util.HashSet;

public class Solution {

   public int solution(int[] nums) {
      
      HashSet<Integer> set = new HashSet<>();

      for (int i = 0; i < nums.length; i++) {
         set.add(nums[i]);
      }
      
      return set.size() > nums.length / 2 ? nums.length / 2 : set.size() ;
   }

   public static void main(String[] args) {
      Solution solution = new Solution();
      System.out.println(solution.solution(new int[] {3,1,2,3}));
   }

}