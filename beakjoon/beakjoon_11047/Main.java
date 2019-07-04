package beakjoon_11047;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
   
   public static void main(String[] arg) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      int n = Integer.parseInt(st.nextToken());
      int k = Integer.parseInt(st.nextToken());
      int cnt = 0;
      int arr[] = new int[n];
      
      for (int i = 0; i < n; i++) {
         arr[i] = Integer.parseInt(br.readLine());
      }

      for (int i = n-1; i >= 0; i--) {
         if(k == 0) {
            break;
         }
         
         cnt += k / arr[i];
         k %= arr[i];
      }
      
      System.out.println(cnt);
      
   }
   
}