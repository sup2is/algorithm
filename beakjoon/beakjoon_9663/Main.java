package beakjoon_9663;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

   static boolean[][] visited;
   static int n;
   static int result;
   public static void main(String[] args) throws NumberFormatException, IOException {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      n = Integer.parseInt(br.readLine());
      visited = new boolean[n][n];

      dfs(0);
      System.out.println(result);
   }
   private static void dfs(int i) {
      if(i == n) {
         result ++;
         return;
      }

      for (int j = 0; j < n; j++) {
         if(!check(i,j)) continue;
         visited[i][j] = true;
         dfs(i + 1);
         visited[i][j] = false;
      }
   }

   private static boolean check(int i, int j) {

      for (int k = i; k >= 0; k--) {
         if(visited[k][j]) return false;
      }

      int ti = i - 1;
      int tj = j - 1;

      while (ti >= 0 && tj >= 0) {
         if(visited[ti][tj]) return false;
         ti --;
         tj --;
      }

      ti = i - 1;
      tj = j + 1;

      while (ti >= 0 && tj < n) {
         if(visited[ti][tj]) return false;
         ti --;
         tj ++;
      }

      return true;
   }
}