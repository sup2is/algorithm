package beakjoon_2644;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

   public static void main(String[] args) throws NumberFormatException, IOException {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      int n = Integer.parseInt(br.readLine());
      st = new StringTokenizer(br.readLine());
      int to = Integer.parseInt(st.nextToken());
      int from = Integer.parseInt(st.nextToken());
      int t = Integer.parseInt(br.readLine());
      List<List<Integer>> list = new ArrayList<>();
      boolean[] visited = new boolean[n + 1];
      Queue<int []> queue = new LinkedList<>();

      for (int i = 0; i < n + 1; i++) {
         list.add(new ArrayList<>());
      }
      for (int i = 0; i < t; i++) {
         st = new StringTokenizer(br.readLine());
         int a = Integer.parseInt(st.nextToken());
         int b = Integer.parseInt(st.nextToken());

         list.get(a).add(b);
         list.get(b).add(a);
      }

      queue.add(new int[]{to, 0});

      while (!queue.isEmpty()) {

         int[] data = queue.poll();

         visited[data[0]] = true;

         for (Integer i : list.get(data[0])) {

            if(i == from) {
               System.out.println(data[1] + 1);
               return;
            }

            if(visited[i]) continue;

            queue.add(new int[]{i , data[1] + 1});
         }
      }

      System.out.println(-1);
   }
}

