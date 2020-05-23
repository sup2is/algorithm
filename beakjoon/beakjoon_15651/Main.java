package beakjoon_15651;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

   static int[] arr;

   public static void main(String[] args) throws NumberFormatException, IOException {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());

      arr = new int[n];
      for (int i = 0; i < n; i++) {
         arr[i] = i + 1;
      }

      for (int i = 0; i < n; i++) {
         permutation(i, arr.length, m - 1, arr[i] + "");
      }
   }

   private static void permutation(int start, int n, int r, String s) {

      if(r == 0) {
         System.out.println(s);
         return;
      }

      for (int i = 0; i < n; i++) {
            permutation(i, n, r - 1, s + " " + arr[i]);
      }
   }
}