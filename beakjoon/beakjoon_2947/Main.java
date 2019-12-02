package beakjoon_2947;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
      int n = 5;
      int[] arr = new int[n];
      
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      for (int i = 0; i < n; i++) {
         arr[i] = Integer.parseInt(st.nextToken());
      }
      
      loop : while (true) {
         for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) {
               int t = arr[i];
               arr[i] = arr[i + 1];
               arr[i + 1] = t;
               print(arr);
            }
         }
         
         for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i + 1) {
               continue loop;
            }
         }
         break;
      }
   }
   
   final static StringBuilder sb = new StringBuilder();
   
   public static void print(int[] arr) {
      
      for (int i = 0; i < arr.length; i++) {
         sb.append(arr[i] + " ");
      }
      System.out.println(sb.toString());
      sb.setLength(0);
   }
}