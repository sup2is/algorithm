package beakjoon_14501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
   
   public static void main(String[] args) throws NumberFormatException, IOException {
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      
      int table[][] = new int[n + 1][2];
      int dp[] = new int[n + 1];
      
      StringTokenizer st;
      
      for (int i = 1; i <= n; i++) {
         st = new StringTokenizer(br.readLine());
         table[i][0] = Integer.parseInt(st.nextToken());
         table[i][1] = Integer.parseInt(st.nextToken());
      }

      if(table[1][0] <= n) {
         dp[1] = table[1][1];
      }

      for (int i = 2; i <= n; i++) {
         
         if(i + table[i][0] - 1 > n) {
            dp[i] = dp[i - 1];
            continue;
         }
         
         int max = 0;
         for (int j = i - 1; j > 0; j--) {
            if(table[j][0] + j - 1 < i) {
               max = Math.max(max, dp[j]);
            }
         }

         dp[i] = table[i][1] + max;
         
      }
      
      int max = 0;
      for (int i = 1; i <= n; i++) {
         if(table[i][0] <= n) {
            max = Math.max(max, dp[i]);
         }
      }
      
      System.out.println(max);
      
   }
}