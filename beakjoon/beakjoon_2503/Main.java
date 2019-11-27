package beakjoon_2503;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      
      int[][]arr = new int[n][3];
      
      StringTokenizer st;
      for (int i = 0; i < n; i++) {
         st = new StringTokenizer(br.readLine());
         for (int j = 0; j < arr[0].length; j++) {
            arr[i][j] = Integer.parseInt(st.nextToken());
         }
      }
      
      int cnt = 0;

      for (int i = 123; i <= 987; i++) {
         cnt = isExpectable(i, arr) ? cnt + 1 : cnt;
      }
      
      System.out.println(cnt);
      
   }

   static String s;
   static String t;
   private static boolean isExpectable(int i, int[][] arr) {
      
      s = String.valueOf(i);
      
      //0제거 중복수 제거
      for (int j = 0; j < s.length(); j++) {
         if(s.charAt(j) == '0') {
            return false;
         }
         
         for (int k = 0; k < s.length(); k++) {
            if(j == k) {
               continue;
            }
            if(s.charAt(j) == s.charAt(k)) {
               return false;
            }
         }
      }
      
      int strike;
      int ball;
      
      for (int j = 0; j < arr.length; j++) {
         t = String.valueOf(arr[j][0]);
         strike = 0;
         ball = 0;
         
         //스트라이크 판별
         for (int k = 0; k < 3; k++) {
            strike = s.charAt(k) == t.charAt(k) ? strike + 1 : strike;
         }
         
         if(strike != arr[j][1]) {
            return false;
         }

         //볼 판별
         
         if(s.charAt(0) == t.charAt(1) || s.charAt(0) == t.charAt(2)) {
            ball ++;
         }
         if(s.charAt(1) == t.charAt(0) || s.charAt(1) == t.charAt(2)) {
            ball ++;
         }
         if(s.charAt(2) == t.charAt(0) || s.charAt(2) == t.charAt(1)) {
            ball ++;
         }
         
         if(ball != arr[j][2]) {
            return false;
         }
      }
      
      return true;
   }
}
