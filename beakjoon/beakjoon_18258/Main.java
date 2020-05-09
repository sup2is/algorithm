import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
   
   public static void main(String[] args) throws NumberFormatException, IOException {

      MyQueue myQueue = new MyQueue();
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int n = Integer.parseInt(br.readLine());
      StringBuilder sb = new StringBuilder();

      while (n-- > 0) {

         StringTokenizer st = new StringTokenizer(br.readLine());

         switch (st.nextToken()) {

            case "push":
               myQueue.push(Integer.parseInt(st.nextToken()));
               break;
            case "pop":
               sb.append(myQueue.pop()+"\n");
               break;
            case "size":
               sb.append(myQueue.size()+"\n");
               break;
            case "empty":
               sb.append(myQueue.empty()+"\n");
               break;
            case "front":
               sb.append(myQueue.front()+"\n");
               break;
            case "back":
               sb.append(myQueue.back()+"\n");
               break;
         }
      }

      System.out.println(sb);


   }


}

class MyQueue extends LinkedList<Integer> {

   public void push(Integer t) {
      super.add(t);
   }

   public Integer pop() {
      return super.isEmpty() ? -1 : super.pop();
   }

   public Integer empty() {
      return super.isEmpty() ? 1 : 0;
   }

   public Integer front() {
      return super.isEmpty() ? -1 : super.peekFirst();
   }

   public Integer back() {
      return super.isEmpty() ? -1 : super.peekLast();
   }

}
