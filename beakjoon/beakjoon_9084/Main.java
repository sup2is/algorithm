package beakjoon_9084;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int t = Integer.parseInt(br.readLine());
      int[][] dp;
      int[] coins;
      
      StringTokenizer st;
      while (t-- > 0) {
         
         int n = Integer.parseInt(br.readLine());
         st = new StringTokenizer(br.readLine());
         int k = Integer.parseInt(br.readLine());
         
         dp = new int[n + 1][k + 1];
         coins = new int[n + 1];
         
         for (int i = 1; i <= n; i++) {
            coins[i] = Integer.parseInt(st.nextToken());
         }
         
         for (int i = 1; i <= n; i++) {
            dp[i][0] = 1;
         }

         for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
               if (j >= coins[i]) {
                  dp[i][j] = dp[i - 1][j] + dp[i][j - coins[i]];
               } else {
                  dp[i][j] = dp[i - 1][j];
               }
            }
         }

         System.out.println(dp[n][k]);
      }
   }
}