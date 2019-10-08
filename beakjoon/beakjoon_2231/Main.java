package beakjoon_2231;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
   
   public static void main(String[] arg) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      
      StringBuilder sb = new StringBuilder();
      
      int temp;
      int construct = n/2;
      
      while (n > construct) {
         sb.setLength(0);
         sb.append(construct);
         temp = construct;
         for (int i = 0; i < sb.length(); i++) {
            temp += sb.charAt(i) - 48;
         }
         if(temp == n) {
            System.out.println(construct);
            return;
         }
         construct ++;
      }
      System.out.println(0);
   }
   
}