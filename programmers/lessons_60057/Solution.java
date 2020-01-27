package lesson_60057;

import java.io.IOException;

public class Solution {

   public int solution(String s) {

      String target = "";
      String sub = "";
      int cutCnt = 0;
      int totalCnt = 0;
      int min = s.length();

      for (int i = 1; i <= s.length() / 2; i++) {

         target = s.substring(0, i);
         totalCnt = 0;
         cutCnt = 0;

         for (int j = i; j < s.length(); j += i) {
            if (j + i <= s.length()) {
               sub = s.substring(j, j + i);
               if (sub.equals(target)) {
                  cutCnt++;
               } else {
                  if (cutCnt != 0) {
                     totalCnt += i;
                     totalCnt += String.valueOf(cutCnt + 1).length();
                  } else {
                     totalCnt += i;
                  }
                  cutCnt = 0;
                  target = sub;
               }
            }else {
               if (cutCnt != 0) {
                  totalCnt += i;
                  totalCnt += String.valueOf(cutCnt + 1).length();
               } else {
                  totalCnt += i;
               }
            }
         }

         if (s.length() % i != 0) {
            totalCnt += s.length() % i;
         }else {
            if (cutCnt != 0) {
               totalCnt += i;
               totalCnt += String.valueOf(cutCnt + 1).length();
            } else {
               totalCnt += i;
            }
         }

         min = Math.min(min, totalCnt);
      }

      return min;
   }

   public static void main(String[] args) throws NumberFormatException, IOException {
      Solution solution = new Solution();
      System.out.println(solution.solution("aabbaccc"));
      System.out.println(solution.solution("ababcdcdababcdcd"));
      System.out.println(solution.solution("abcabcdede"));
      System.out.println(solution.solution("abcabcabcabcdededededede"));
      System.out.println(solution.solution("xababcdcdababcdcd"));
      System.out.println(solution.solution("aaaaaaaaaaaaaaaaaaaabbaaaaaaaaaaaaaaaaaaaa"));
      System.out.println(solution.solution("aaaaaaaaaaaaaaaaaaaabbaaaaaaaaaaaaaaaaaaaa"));
   }
}
