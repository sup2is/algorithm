package beakjoon_16234;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   static int[][] map;
   static int[][] open;
   static boolean[][] visited;
   static int[][] dir = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
   static int cnt;
   static int sum;

   public static void main(String[] args) throws NumberFormatException, IOException {
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());

      int n = Integer.parseInt(st.nextToken());
      int l = Integer.parseInt(st.nextToken());
      int r = Integer.parseInt(st.nextToken());

      map = new int[n][n];
      open = new int[n][n];
      visited = new boolean[n][n];

      for (int i = 0; i < n; i++) {
         st = new StringTokenizer(br.readLine());
         for (int j = 0; j < n; j++) {
            map[i][j] = Integer.parseInt(st.nextToken());
         }
      }

      boolean flag = true;
      int answer = 0;
      int color = 0;
      while (flag) {

         flag = false;

         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               if(open[i][j] == 0) {
                  color ++;
                  open(i, j, l, r, color);
               }
            }
         }
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               cnt = 0;
               sum = 0;
               if(open[i][j] != 0 && !visited[i][j]) {
                  dfs(i, j, open[i][j]);
                  int value = sum / cnt;
                  move(i, j, value, open[i][j]);
                  flag = true;
               }
            }
         }

         if(flag) {
            answer ++;
         }
      }
      System.out.println(answer);
   }

   private static void open(int i, int j, int l, int r, int color) {

      int value = map[i][j];

      for (int k = 0; k < dir.length; k++) {

         int ti = i + dir[k][0];
         int tj = j + dir[k][1];

         if(ti < 0 || tj < 0 || ti >= map.length || tj >= map[0].length || open[ti][tj] != 0) {
            continue;
         }

         if(Math.abs(value - map[ti][tj]) >= l && Math.abs(value - map[ti][tj]) <= r) {
            open[i][j] = color;
            open[ti][tj] = color;
            open(ti,tj, l, r, color);
         }
      }
   }

   private static void dfs(int i, int j, int color) {

      cnt ++;
      sum += map[i][j];
      visited[i][j] = true;

      for (int k = 0; k < dir.length; k++) {

         int ti = i + dir[k][0];
         int tj = j + dir[k][1];

         if(ti < 0 || tj < 0 || ti >= map.length || tj >= map[0].length || visited[ti][tj] || open[ti][tj] != color) {
            continue;
         }

         dfs(ti, tj, color);
      }
   }

   private static void move(int i, int j, int value, int color) {

      map[i][j] = value;
      visited[i][j] = false;
      open[i][j] = 0;

      for (int k = 0; k < dir.length; k++) {

         int ti = i + dir[k][0];
         int tj = j + dir[k][1];

         if(ti < 0 || tj < 0 || ti >= map.length || tj >= map[0].length || !visited[ti][tj] || open[ti][tj] != color) {
            continue;
         }

         move(ti,tj,value, color);
      }

   }
}