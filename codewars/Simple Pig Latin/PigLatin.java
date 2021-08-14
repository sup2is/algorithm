//Simple Pig Latin: https://www.codewars.com/kata/520b9d2ad5c005041100000f/train/java Complete

import java.util.*;

public class PigLatin {
    public static String pigIt(String str) {
      String suffix = "ay ";
      
      StringTokenizer st = new StringTokenizer(str);
      StringBuilder answer = new StringBuilder();
      
      while(st.hasMoreTokens()) {
        
        String t = st.nextToken();
        answer.append(t.substring(1) + t.charAt(0) + suffix);
      
      }
      answer.setLength(answer.length() - 1);
      
      return answer.toString();
    }
}
