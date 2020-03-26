package beakjoon_4963;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   static int[][] map;
   static boolean[][] visited;
   static int[][] dir = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};
   static int cnt;

   public static void main(String[] args) throws NumberFormatException, IOException {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;


      while (true) {
         st = new StringTokenizer(br.readLine());

         int m = Integer.parseInt(st.nextToken());
         int n = Integer.parseInt(st.nextToken());

         if(n == 0 && m == 0){
            return;
         }

         cnt = 0;
         map = new int[n][m];
         visited = new boolean[n][m];

         for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
               map[i][j] = Integer.parseInt(st.nextToken());
            }
         }

         for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               if(!visited[i][j] && map[i][j] == 1) {
                  cnt ++;
                  visited[i][j] = true;
                  dfs(i, j);
               }
            }
         }

         System.out.println(cnt);
      }
   }

   private static void dfs(int i, int j) {

      for (int k = 0; k < dir.length; k++) {

         int ti = i + dir[k][0];
         int tj = j + dir[k][1];

         if(ti < 0 || tj < 0 || ti >= map.length || tj >= map[0].length || visited[ti][tj] || map[ti][tj] != 1) {
            continue;
         }

         visited[ti][tj] = true;
         dfs(ti,tj);
      }
   }
}