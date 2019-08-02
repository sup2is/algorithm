package beakjoon_5063;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.DrbgParameters.NextBytes;
import java.util.StringTokenizer;

public class Main {
   
   public static void main(String[] arg) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      
      int n = Integer.parseInt(br.readLine());
      int r,e,c;
      
      while(n-- > 0) {
         st = new StringTokenizer(br.readLine());
         
         r = Integer.parseInt(st.nextToken());
         e = Integer.parseInt(st.nextToken());
         c = Integer.parseInt(st.nextToken());
         
         if(r == (e-c)) {
            System.out.println("does not matter");
         }else if(r > (e-c)) {
            System.out.println("do not advertise");
         }else {
            System.out.println("advertise");
         }
         
      }
      
      
      
   }
}