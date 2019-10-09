package beakjoon_2588;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
   
   public static void main(String[] args) throws NumberFormatException, IOException {
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      String t1 = br.readLine();
      String t2 = br.readLine();
      
      int sum = 0;
      int m = 0;
      
      for (int i = t2.length() - 1; i >= 0 ; i--) {
         m = 0;
         for (int j = t1.length() - 1; j >= 0; j--) {
            sum += (t2.charAt(i) - 48) * (t1.charAt(j) - 48) * Math.pow(10, m ++);
         }
         System.out.println(sum);
         sum = 0;
      }
      
      System.out.println(Integer.parseInt(t1) * Integer.parseInt(t2));
      
   }

}
