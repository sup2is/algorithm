package beakjoon_11728;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
      
      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());
      
      st = new StringTokenizer(br.readLine());
      
      while (st.hasMoreElements()) {
         pq.add(Integer.parseInt(st.nextToken()));
      }
      st = new StringTokenizer(br.readLine());
      
      while (st.hasMoreElements()) {
         pq.add(Integer.parseInt(st.nextToken()));
      }
      StringBuilder sb = new StringBuilder();
      
      while (!pq.isEmpty()) {
         sb.append(pq.poll() + " ");
      }
      System.out.println(sb);
      
   }
}