package beakjoon_11256;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> Integer.compare(o2, o1));
      StringTokenizer st;
      int t = Integer.parseInt(br.readLine());
      while (t-- > 0) {

         st = new StringTokenizer(br.readLine());
         int j = Integer.parseInt(st.nextToken());
         int n = Integer.parseInt(st.nextToken());

         for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            pq.add(Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()));
         }

         int cnt = 0;

         while (j > 0) {
            j -= pq.poll();
            cnt ++;
         }
         System.out.println(cnt);
         pq.clear();
      }
   }
}
