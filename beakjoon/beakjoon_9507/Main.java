package beakjoon_9507;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int t = Integer.parseInt(br.readLine());
      long[] dp = new long[70];
      
      dp[0] = 1;
      dp[1] = 1;
      dp[2] = 2;
      dp[3] = 4;
      
      for (int i = 4; i < dp.length; i++) {
         dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3] + dp[i - 4];
      }
      
      while (t-- > 0) {
         System.out.println(dp[Integer.parseInt(br.readLine())]);
      }
      
   }
}