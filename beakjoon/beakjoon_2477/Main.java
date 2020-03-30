package beakjoon_2477;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[6];

      int w = 0, h = 0, xh = 0, xw = 0;

      StringTokenizer st;
      for (int i = 0; i < 6; i++) {
         st = new StringTokenizer(br.readLine());
         st.nextToken();
         arr[i] = Integer.parseInt(st.nextToken());
      }

      for (int i = 0; i < 6; i++) {
         if(i % 2 == 0) {
            w = Math.max(w, arr[i]);
         }else {
            h = Math.max(h, arr[i]);
         }
      }


      for (int i = 0; i < 6; i++) {
         if(i % 2 == 0) {
            if (h == arr[(i + 5) % 6] + arr[(i + 1) % 6]) {
               xw = arr[i];
            }
         } else {
            if (w == arr[(i + 5) % 6] + arr[(i + 1) % 6]) {
               xh = arr[i];
            }
         }
      }

      System.out.println(((w * h) - (xw * xh)) * n);

   }
}
