package beakjoon_9375;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

   public static void main(String[] args) throws NumberFormatException, IOException {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      Map<String, Integer> map = new HashMap<>();
      int t = Integer.parseInt(br.readLine());

      while (t-- > 0) {

         int n = Integer.parseInt(br.readLine());

         for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            String s = st.nextToken();
            if(map.containsKey(s)) {
               map.put(s, map.get(s) + 1);
            }else {
               map.put(s, 1);
            }
         }

         int ans = 1;
         for (Integer v : map.values()) {
            ans *= v + 1;
         }
         System.out.println(ans - 1);
         map.clear();
      }
   }
}
