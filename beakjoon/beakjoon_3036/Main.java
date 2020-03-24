package beakjoon_3036;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws NumberFormatException, IOException {
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());

      int[] arr = new int[n];

      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int i = 0; i < n; i++) {
         arr[i] = Integer.parseInt(st.nextToken());
      }

      for (int i = 1; i < n; i++) {
         int gcd = gcd(arr[0], arr[i]);
         System.out.println(arr[0] / gcd + "/" + arr[i] / gcd);
      }
   }

   public static int gcd(int a, int b) {
      int temp=1;
      while(temp!=0){
         temp=b%a;
         b=a;
         a=temp;
      }
      return b;
   }
}