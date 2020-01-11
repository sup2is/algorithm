package beakjoon_9461;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
   
   public static void main(String[] args) throws NumberFormatException, IOException {
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int t = Integer.parseInt(br.readLine());
      
      long[] dp = new long[101];
      int[] arr = new int[t];
      
      dp[1] = 1;
      dp[2] = 1;
      dp[3] = 1;
      dp[4] = 2;
      dp[5] = 2;
      
      int max = 0;
      
      for (int i = 0; i < t; i++) {
         arr[i] = Integer.parseInt(br.readLine());
         max = Math.max(max, arr[i]);
      }
      
      for (int i = 6; i <= max; i++) {
         dp[i] = dp[i - 1] + dp[i - 5];
      }
      
      for (int i = 0; i < arr.length; i++) {
         System.out.println(dp[arr[i]]);
      }
   }
}
