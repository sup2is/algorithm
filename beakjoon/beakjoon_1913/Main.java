package beakjoon_1913;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int m = Integer.parseInt(br.readLine());

      int x = 0;
      int y = 0;

      int[][] map = new int[n][n];

      int start = n * n;

      for (int i = x; i < n; i++) {
         for (int j = y; j < n - y; j++) {
            map[j][i] = start--;
            if(start == 0) {
               print(map, m);
            }
         }
         
         for (int j = x + 1; j < n - x; j++) {
            map[(n - y) - 1][j] = start--;
         }
         
         for (int j = (n - y) - 2; j >= y; j--) {
            map[j][(n - x) - 1] = start--;
         }
         
         for (int j = (n - x) - 2; j >= x + 1; j--) {
            map[y][j] = start--;
         }

         x ++;
         y ++;
      }
   }
   public static void print(int[][] map, int target) {
      StringBuilder sb = new StringBuilder();
      
      int x = 0;
      int y = 0;
      
      for (int i = 0; i < map.length; i++) {
         for (int j = 0; j < map.length; j++) {
            sb.append(map[i][j] + " ");
            
            
            if(map[i][j] == target) {
               x = j + 1;
               y = i + 1;
            }
            
         }
         sb.append("\n");
      }
      System.out.print(sb.toString());
      System.out.println(y + " " + x);
      
   }
}