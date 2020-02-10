package beakjoon_10816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
   
   public static void main(String[] args) throws NumberFormatException, IOException {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Map<Integer, Integer> cards = new HashMap<>();
      int n = Integer.parseInt(br.readLine());
      StringTokenizer st = new StringTokenizer(br.readLine());
      while (n-- > 0) {
         int c = Integer.parseInt(st.nextToken());
         if(cards.containsKey(c)) {
            cards.put(c, cards.get(c) + 1);
         }else {
            cards.put(c, 1);
         }
      }

      int m = Integer.parseInt(br.readLine());
      StringBuilder sb = new StringBuilder();
      st = new StringTokenizer(br.readLine());
      while (m-- > 0) {
         int c = Integer.parseInt(st.nextToken());
         if(cards.containsKey(c)) {
            sb.append(cards.get(c) + " ");
         }else {
            sb.append("0 ");
         }
      }

      System.out.println(sb);
   }
}