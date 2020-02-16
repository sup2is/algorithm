package lessons_17681;

import java.io.IOException;
import java.util.Arrays;

public class Solution {

   static StringBuilder buffer = new StringBuilder();

   public String[] solution(int n, int[] arr1, int[] arr2) {
      String[] answer = new String[n];
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < n; i++) {

         String s1 = getBinaryStr(n, arr1[i]);
         String s2 = getBinaryStr(n, arr2[i]);

         for (int j = 0; j < n; j++) {
            if(s1.charAt(j) == '1' || s2.charAt(j) == '1') {
               sb.append("#");
            }else {
               sb.append(" ");
            }
         }
         answer[i] = sb.toString();
         sb.setLength(0);
      }
      return answer;
   }

   private String getBinaryStr(int n ,int value) {
      buffer.setLength(0);
      while (value != 0) {
         buffer.append(value % 2);
         value /= 2;
      }

      while (buffer.length() != n) {
         buffer.append('0');
      }

      return buffer.reverse().toString();
   }

   public static void main(String[] args) throws NumberFormatException, IOException {
      Solution solution = new Solution();
      System.out.println(Arrays.toString(solution.solution(5, new int[] {9, 20, 28, 18, 11} , new int[] {30, 1, 21, 17, 28})));
      System.out.println(solution.solution(5, new int[] {9, 20, 28, 18, 11} , new int[] {30, 1, 21, 17, 28}));
   }
}
