package beakjoon_1325;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

   static boolean[] visited;
   static List<Integer>[] list;
   static int[] arr;
   public static void main(String[] args) throws NumberFormatException, IOException {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());

      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());

      list = (ArrayList<Integer>[]) new ArrayList[n + 1];

      for (int i = 0; i <= n; i++) {
         list[i] = new ArrayList<>();
      }

      for (int i = 0; i < m; i++) {
         st = new StringTokenizer(br.readLine());
         int x = Integer.parseInt(st.nextToken());
         list[x].add(Integer.parseInt(st.nextToken()));
      }

      arr = new int[n + 1];
      visited = new boolean[n + 1];

      for (int i = 1; i < list.length; i++) {
         visited = new boolean[n + 1];
         dfs(i);
      }

      int max = Arrays.stream(arr)
              .max()
              .getAsInt();

      StringBuilder sb = new StringBuilder();

      for (int i = 1; i < arr.length; i++) {
         if(arr[i] == max) {
            sb.append(i + " ");
         }
      }

      System.out.println(sb.toString());
   }

   private static void dfs(int i) {
      visited[i] = true;
      for (Integer x : list[i]) {
         if(!visited[x]) {
            arr[x] ++;
            dfs(x);
         }
      }
   }
}