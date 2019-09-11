package lessons_12981;

import java.util.ArrayList;

public class Solution {

   public int[] solution(int n, String[] words) {
      ArrayList<String> list = new ArrayList<String>();
      
      for (int i = 0; i < words.length; i++) {
         System.out.println(words[i]);
         if(!list.isEmpty() && (list.contains(words[i]) || list.get(i - 1).charAt(list.get(i - 1).length() - 1) != words[i].charAt(0))) {
            break;
         }else {
            list.add(words[i]);
         }
      