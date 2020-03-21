package beakjoon_2251;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {


   static boolean[][] visited = new boolean[201][201];
   static int a;
   static int b;
   static int c;

   static Queue<Integer> pq = new PriorityQueue<>();

   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());

      a = Integer.parseInt(st.nextToken());
      b = Integer.parseInt(st.nextToken());
      c = Integer.parseInt(st.nextToken());

      dfs(0, 0, c);

      while (!pq.isEmpty())
         System.out.println(pq.poll());

   }

   private static void dfs(int xa, int xb, int xc) {

      if(visited[xa][xb]) return;

      if(xa == 0) {
         pq.add(xc);
      }

      visited[xa][xb] = true;

      if(xa + xb > b) {
         dfs((xa + xb) - b, b, xc);
      }else {
         dfs(0, xa + xb, xc);
      }

      if(xb + xa > a) {
         dfs(a, (xb + xa) - a, xc);
      }else {
         dfs(xb + xa, 0, xc);
      }

      if(xc + xa > a) {
         dfs(a, xb, (xc + xa) - a);
      }else {
         dfs(xc + xa, xb, 0);
      }

      if(xc + xb > b) {
         dfs(xa, b, (xc + xb) - b);
      }else {
         dfs(xa, xc + xb, 0);
      }

      dfs(xa, 0, xb + xc);
      dfs(0, xb, xa + xc);

   }
}
