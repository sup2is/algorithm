//문자열 집합: https://www.acmicpc.net/problem/14425 Complete

package beakjoon_14425;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
   
   public static void main(String[] args) throws NumberFormatException, IOException {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());

      int cnt = 0;

      Set<String> set = new HashSet<>();
      while (n-- > 0) {
        set.add(br.readLine());
      }

      while (m-- > 0) {
          if(set.contains(br.readLine())) {
              cnt ++;
          }
      }
       System.out.println(cnt);
   }
}