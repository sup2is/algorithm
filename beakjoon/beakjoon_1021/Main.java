package beakjoon_1021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      StringTokenizer st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());
      LinkedList<Integer> linkedList = new LinkedList<Integer>();
      LinkedList<Integer> points = new LinkedList<Integer>();
      int cnt = 0;
      
      for (int i = 0; i < n; i++) {
         linkedList.add(i);
      }
      
      st = new StringTokenizer(br.readLine());
      for (int i = 0; i < m; i++) {
         points.add(linkedList.get(Integer.parseInt(st.nextToken()) - 1));
      }

      while (!points.isEmpty()) {
         int p = points.poll();
         
         if(linkedList.indexOf(p) != 0) {
            
            if(linkedList.indexOf(p) <  linkedList.size() - linkedList.indexOf(p)) {
               while (linkedList.indexOf(p) != 0) {
                  linkedList.addLast(linkedList.pollFirst());
                  cnt ++;
               }
            }else {
               while (linkedList.indexOf(p) != 0) {
                  linkedList.addFirst(linkedList.pollLast());
                  cnt ++;
               }
            }
         }
         linkedList.pollFirst();
      }
      
      System.out.println(cnt);
   }
}