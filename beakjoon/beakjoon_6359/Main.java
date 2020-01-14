package beakjoon_6359;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

   public static void main(String[] args) throws NumberFormatException, IOException {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int t = Integer.parseInt(br.readLine());

      boolean[] dp;

      while (t-- > 0) {

         int n = Integer.parseInt(br.readLine());

         dp = new boolean[n + 1];

         for (int i = 2; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
               dp[j] = !dp[j];
            }
         }
         
         int cnt = 0;
         
         for (int i = 1; i <= n; i++) {
            cnt += !dp[i] ? 1 : 0;
         }
         
         System.out.println(cnt);
         
      }
   }
}