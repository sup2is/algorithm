package beakjoon_13458;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
   
   public static void main(String[] args) throws NumberFormatException, IOException {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      long ans = 0;

      int[] arr = new int[n];

      StringTokenizer st = new StringTokenizer(br.readLine());

      for (int i = 0; i < n; i++) {
         arr[i] = Integer.parseInt(st.nextToken());
      }

      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      for (int i = 0; i < n; i++) {
         arr[i] -= a;
         ans ++;
      }

      for (int i = 0; i < n; i++) {
         if(arr[i] <= 0) continue;

         if(arr[i] % b == 0) {
            ans += arr[i] / b;
         }else {
            ans += arr[i] / b + 1;
         }
      }

      System.out.println(ans);
   }
}