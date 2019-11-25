package beakjoon_11931;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {
         @Override
         public int compare(Integer o1, Integer o2) {
            return Integer.compare(o2, o1);
         }
      });
      
      
      while (n-- > 0) {
         pq.add(Integer.parseInt(br.readLine()));
      }
      
      StringBuilder sb = new StringBuilder();
      while (!pq.isEmpty()) {
         sb.append(pq.poll() + "\n");
      }
      System.out.println(sb);
      
   }
}