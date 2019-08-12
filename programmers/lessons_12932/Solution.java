package lessons_12932;

import java.util.Arrays;

public class Solution {

	public int[] solution(long n) {
		
		String t = n + "";
		int tl = t.length() - 1;
		int[] answer = new int[t.length()]; 
		for (int i = 0; i < answer.length; i++) {
			answer[i] = t.charAt(tl--) - 48;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		
		System.out.println(Arrays.toString(solution.solution(12345)));
	
	}

}
