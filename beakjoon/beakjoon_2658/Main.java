package beakjoon_2658;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

   public static void main(String[] args) throws NumberFormatException, IOException {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      Set<Integer> set = new HashSet<>();
      int cnt = 0;
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < 4; i++) {
         sb.append(Integer.parseInt(st.nextToken()));
      }

      int timeNumber =  getTimeNumber(Integer.parseInt(sb.toString()));
      int target = 1111;

      while (target <= timeNumber) {
         int num = getTimeNumber(target);

         if(num > 1000) {
            cnt ++;
         }
         target ++;
      }
      System.out.println(set.size());
   }

   private static int getTimeNumber(int target){
      int min = target;

      for (int i = 0; i < 3; i++) {
         int mod = target % 10;
         int value = target / 10;

         target = mod * 1000 + value;
         min = Math.min(min, target);
      }
      return min;
   }
}