package beakjoon_2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
   public static void main(String[] args) throws IOException {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      StringBuilder sb = new StringBuilder();
      int n = Integer.parseInt(br.readLine());
      
      String s;
      while (n-- > 0) {
         sb.setLength(0);
         st = new StringTokenizer(br.readLine());
         int m = Integer.parseInt(st.nextToken());
         s = st.nextToken();
         
         for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < m; j++) {
               sb.append(s.charAt(i));
            }
         }
         
         System.out.println(sb.toString());
      }
      
   }

}
