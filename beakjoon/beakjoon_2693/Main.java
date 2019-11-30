package beakjoon_2693;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      
      while (n-- > 0) {
         
         int[] arr = new int[10]; 
         
         StringTokenizer st = new StringTokenizer(br.readLine());
         
         for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
         }
         
         Arrays.sort(arr);
         
         System.out.println(arr[7]);
      }
   }
}