package beakjoon_2578;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int[][] bingoMap = new int[5][5];

      StringTokenizer st;
      
      for (int i = 0; i < bingoMap.length; i++) {
         st = new StringTokenizer(br.readLine());
         for (int j = 0; j < bingoMap[0].length; j++) {
            bingoMap[i][j] = Integer.parseInt(st.nextToken());
         }
      }
      
      int cnt = 0;
      
      for (int i = 0; i < 5; i++) {
         st = new StringTokenizer(br.readLine());
         for (int j = 0; j < 5; j++) {
            cnt ++;
            mark(bingoMap, Integer.parseInt(st.nextToken()));
            if(checkBingo(bingoMap)) {
               System.out.println(cnt);
               return;
            }
         }
      }
   }
   
   private static void mark(int[][] bingoMap, int target) {
      
      for (int i = 0; i < bingoMap.length; i++) {
         for (int j = 0; j < bingoMap.length; j++) {
            if(target == bingoMap[i][j]) {
               bingoMap[i][j] = 0;
               return;
            }
         }
      }
   }
   
   private static boolean checkBingo(int[][] bingoMap) {
      
      int bingoCnt = 0;
      
      loop : for (int i = 0; i < bingoMap.length; i++) {
         for (int j = 0; j < bingoMap.length; j++) {
            if(bingoMap[j][i] != 0) {
               continue loop;
            }
         }
         bingoCnt ++;
      }
      
      loop : for (int i = 0; i < bingoMap.length; i++) {
         for (int j = 0; j < bingoMap.length; j++) {
            if(bingoMap[i][j] != 0) {
               continue loop;
            }
         }
         bingoCnt ++;
      }
      
      int cnt = 0;
      
      for (int i = 0; i < bingoMap.length; i++) {
         cnt += bingoMap[i][i];
      }
      
      if(cnt == 0) {
         bingoCnt++;
      }else {
         cnt = 0;
      }
      
      int t = 0;
      
      for (int i = bingoMap.length - 1; i >= 0; i--) {
         cnt += bingoMap[t++][i];
      }
      
      if(cnt == 0) {
         bingoCnt++;
      }
      
      if(bingoCnt > 2) {
         return true;
      }else {
         return false;
      }
   }
}
