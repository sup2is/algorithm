package beakjoon_1966;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      int t = Integer.parseInt(br.readLine());
      
      LinkedList<int[]> list = new LinkedList<>();
      
      while (t --> 0) {
         st = new StringTokenizer(br.readLine());
         
         int cnt = 0;
         
         int n = Integer.parseInt(st.nextToken());
         int m = Integer.parseInt(st.nextToken());
         
         st = new StringTokenizer(br.readLine());
         
         if(st.countTokens() == 1) {System.out.println(1); continue;}
         
         
         for (int i = 0; i < n; i++) {
            list.add(new int[] {i, Integer.parseInt(st.nextToken())});
         }
         
         loop : while (!list.isEmpty()) {
            
            int[] target = list.pollFirst();
            
            for (int i = 0; i < list.size(); i++) {
               if(target[1] < list.get(i)[1]) {
                  list.add(target);
                  continue loop;
               }
            }
            cnt ++;
            if(m == target[0]) {
               System.out.println(cnt);
               continue;
            }
         }
         list.clear();
      }
   }
}