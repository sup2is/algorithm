package lessons_12915;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

	public String[] solution(String[] strings, int n) {
		
		Arrays.sort(strings, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				if(o1.charAt(n) != o2.charAt(n)) {
					return Integer.compare(o1.charAt(n), o2.charAt(n));
				}else {
					return o1.compareTo(o2);
				}
			}
		});
		
		return strings;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		String[] s = new String[] {"sun","bed","car"};
		String[] answer = solution.solution(s, 1);
		System.out.println(Arrays.toString(answer));

	}

}
