package beakjoon_15666;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

   static int[] arr;
   static Set<String> set = new HashSet<>();

   public static void main(String[] args) throws NumberFormatException, IOException {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());

      arr = new int[n];
      st = new StringTokenizer(br.readLine());
      for (int i = 0; i < n; i++) {
         arr[i] = Integer.parseInt(st.nextToken());
      }

      Arrays.sort(arr);

      for (int i = 0; i < n; i++) {
         permutation(i, arr.length, m - 1, arr[i] + "");
      }
   }

   private static void permutation(int start, int n, int r, String s) {

      if(r == 0) {
         if(!set.contains(s)) {
            System.out.println(s);
            set.add(s);
         }
         return;
      }

      for (int i = start % n; i < n; i++) {
         permutation(i % n, n, r - 1, s + " " + arr[i % n]);
      }
   }
}