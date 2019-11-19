package beakjoon_10867;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      TreeSet<Integer> set = new TreeSet<>();
      
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      while (st.hasMoreElements()) {
         set.add(Integer.parseInt(st.nextToken()));
      }
      StringBuilder sb = new StringBuilder();
      
      while (!set.isEmpty()) {
         sb.append(set.pollFirst() + " ");
      }
      System.out.println(sb.toString());
   }
}