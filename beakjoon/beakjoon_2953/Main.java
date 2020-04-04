package beakjoon_2953;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;

      int answer = 0;
      int maxCnt = 0;
      int cnt = 0;

      for (int i = 0; i < 5; i++) {

         st = new StringTokenizer(br.readLine());

         for (int j = 0; j < 4; j++) {
            cnt += Integer.parseInt(st.nextToken());
         }

         if(maxCnt < cnt) {
            answer = i + 1;
            maxCnt = cnt;
         }

         cnt = 0;
      }
      System.out.println(answer + " " + maxCnt);
   }
}
