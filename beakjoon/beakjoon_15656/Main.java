package beakjoon_15656;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

   static int[] arr;
   static boolean[] visited;
   static StringBuilder sb = new StringBuilder();
   static Set<String> set = new HashSet<>();

   public static void main(String[] args) throws NumberFormatException, IOException {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());

      arr = new int[n];
      visited = new boolean[n];
      st = new StringTokenizer(br.readLine());
      for (int i = 0; i < n; i++) {
         arr[i] = Integer.parseInt(st.nextToken());
      }

      Arrays.sort(arr);

      for (int i = 0; i < n; i++) {
         permutation(arr.length, m - 1, arr[i] + "");
      }

      System.out.println(sb.toString());
   }

   private static void permutation(int n, int r, String s) {

      if(r == 0) {
         sb.append(s + "\n");
         return;
      }

      for (int i = 0; i < n; i++) {
         if(!set.contains(s)){
            set.add(s);
            permutation(n, r - 1, s + " " + arr[i % n]);
            set.remove(s);
         }
      }
   }
}