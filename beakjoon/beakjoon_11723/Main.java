package beakjoon_11723;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      MyHashSet<Integer> set = new MyHashSet<>();
      StringBuilder sb = new StringBuilder();
      StringTokenizer st;

      while (n-- > 0) {

         st = new StringTokenizer(br.readLine());
         switch (st.nextToken()) {
         case "add":
            set.add(Integer.parseInt(st.nextToken()));
            break;
         case "remove":
            set.remove(Integer.parseInt(st.nextToken()));
            break;
         case "check":
            sb.append(set.contains(Integer.parseInt(st.nextToken())) ? "1\n" : "0\n");
            break;
         case "toggle":
            set.toggle(Integer.parseInt(st.nextToken()));
            break;
         case "all":
            for (int i = 1; i <= 20; i++) {
               set.add(i);
            }
            break;
         case "empty":
            set.clear();
            break;
         }
      }
      System.out.println(sb.toString());
   }
}

class MyHashSet<E> extends HashSet<E> {

   public void toggle(E e) {
      if (this.contains(e)) {
         this.remove(e);
      } else {
         this.add(e);
      }
   }
}