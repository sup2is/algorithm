package lessons_42628;

import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Solution {


	public int[] solution(String[] operations) {
		StringTokenizer st;
		
		ArrayList<Integer> list = new ArrayList<Integer>();

		int digit;
		String t;
		
		for (int i = 0; i < operations.length; i++) {
			
			st = new StringTokenizer(operations[i]);
			t = st.nextToken();
			digit = Integer.parseInt(st.nextToken());
			
			if(t.equals("I")) {
				list.add(digit);
				Collections.sort(list);
			}
			
			if(t.equals("D") && !list.isEmpty()) {
				
				if(digit < 0) {
					list.remove(0);
				}else {
					list.remove(list.remove(list.size() - 1));
				}
				
			}
			
		}
		
		if(list.isEmpty()) {
			return new int[] {0,0};
		}
		
		return new int[] {list.get(list.size() - 1) , list.get(0)};
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(new String[] {"I 16","D 1"}));
		System.out.println(solution.solution(new String[] {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"}));
	}
}
