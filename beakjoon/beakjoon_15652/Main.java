import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

   static int[] arr;
   static StringBuilder sb = new StringBuilder();
   static Stack<Integer> stack = new Stack<>();


   public static void main(String[] args) throws NumberFormatException, IOException {
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());

      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());

      arr = new int[n + 1];

      for (int i = 1; i <= n; i++) {
         arr[i] = i;
      }


      for (int i = 1; i <= n; i++) {
         recursive(i, m, "");
      }

      System.out.println(sb.toString());

   }

   private static void recursive(int start, int m, String s) {

      if(s.length() == m) {

         if(stack.isEmpty()) {
            stack.push(Integer.parseInt(s));
            sb.append(convert(s) + "\n");
            return;
         }

         if(stack.peek() < Integer.parseInt(s)) {
            stack.push(Integer.parseInt(s));
            sb.append(convert(s) + "\n");
            return;
         }
         return;
      }

      for (int j = start; j < arr.length; j++) {
         recursive(j, m, s + arr[j]);
      }

   }

   static StringBuilder temp = new StringBuilder();

   private static String convert(String s) {
      temp.setLength(0);
      temp.append(s.charAt(0));
      for (int i = 1; i < s.length(); i++) {
         temp.append(" " + s.charAt(i));
      }
      return temp.toString();
   }
}
