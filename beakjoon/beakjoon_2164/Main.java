package beakjoon_2164;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      LinkedList<Integer> linkedList = new LinkedList<Integer>();

      for (int i = 0; i < n; i++) {
         linkedList.add(i + 1);
      }
      
      boolean isDrop = true;
      
      while (linkedList.size() > 1) {
         if(isDrop) {
            linkedList.pollFirst();
         }else {
            linkedList.add(linkedList.pollFirst());
         }
         isDrop = !isDrop;
      }
      
      System.out.println(linkedList.pollFirst());
      
      
   }
}