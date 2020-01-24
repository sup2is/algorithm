package beakjoon_2294;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      StringTokenizer st = new StringTokenizer(br.readLine());

      int n = Integer.parseInt(st.nextToken());
      int k = Integer.parseInt(st.nextToken());

      int[] coins = new int[n + 1];
      int[] dp = new int[k + 1];

      int max = k + 1;

      Arrays.fill(dp, max);

      for (int i = 1; i <= n; i++) {
         coins[i] = Integer.parseInt(br.readLine());

         if(coins[i] < k) {
            dp[coins[i]] = 1;
         }
      }

      Arrays.sort(coins);

      for (int i = 1; i <= k; i++) {
         for (int j = 1; j <= n; j++) {
            if(dp[i] == 1) {
               break;
            }
            if(i - coins[j] < 0 || dp[i - coins[j]] == max) {
               continue;
            }

            dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
         }
      }

      System.out.println(dp[k] == max ? -1 : dp[k]);
   }
}
