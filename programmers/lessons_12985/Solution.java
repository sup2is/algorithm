package lessons_12985;

public class Solution {

   public int solution(int n, int a, int b) {
      int answer = 1;

      if (a > b) {
         int t = b;
         b = a;
         a = t;
      }
      
      while (b - a != 1 || a % 2 == 0) {
         answer++;
         a = a % 2 == 0 ? a / 2 : a / 2 + 1;
         b = b % 2 == 0 ? b / 2 : b / 2 + 1;
      }
      
      return answer;
   }

   public static void main(String[] args) {
      Solution solution = new Solution();
      System.out.println(solution.solution(8, 2, 3));
   }

}