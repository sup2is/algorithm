package beakjoon_5567;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

   static List<List<Integer>> list = new ArrayList<>();
   static boolean[] visited;
   
   public static void main(String[] args) throws NumberFormatException, IOException {
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int n = Integer.parseInt(br.readLine());
      int m = Integer.parseInt(br.readLine());

      visited = new boolean[n + 1];

      for (int i = 0; i <= n; i++) {
         list.add(new ArrayList<>());
      }

      StringTokenizer st;
      for (int i = 0; i < m; i++) {
         st = new StringTokenizer(br.readLine());
         int a = Integer.parseInt(st.nextToken());
         int b = Integer.parseInt(st.nextToken());
         list.get(a).add(b);
         list.get(b).add(a);
      }

      for (Integer x : list.get(1)) {
         visited[x] = true;
         for (Integer c : list.get(x)) {
            visited[c] = true;
         }
      }

      int cnt = 0;

      for (int i = 2; i < visited.length; i++) {
         if(visited[i]){
            cnt ++;
         }
      }

      System.out.println(cnt);
   }
}
