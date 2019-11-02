package lessons_12904;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {

	public int solution(String s) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		int max = 0;
	
		for (int i = 0; i < s.length(); i++) {
			for (int j = s.length() - 1; j > max ; j--) {
				if(s.charAt(i) == s.charAt(j)) {
					recursive(i, j, s, pq , 0);
				}
			}
			if(!pq.isEmpty()) {
				max = Math.max(max, Math.max(i, pq.peek()));
			}
		}
		
		return !pq.isEmpty() ? pq.poll() : 1;
	}

	private void recursive(int i, int j, String s, PriorityQueue<Integer> pq, int sum) {

		if(i >= s.length()||s.charAt(i) != s.charAt(j)) {
			return;
		}
		
		//문자열 개수가 홀수일떄
		if(i == j && s.charAt(i) == s.charAt(j)) {
			if(sum != 0) {
				sum ++;
				pq.add(sum * 2 - 1);
			}
			return;
		}
		
		//문자열 개수가 짝수일때
		if(i + 1 == j && s.charAt(i) == s.charAt(j)) {
			if(sum != 0) {
				sum ++;
				pq.add(sum * 2);
			}
			return;
		}
		
		if(s.charAt(i) == s.charAt(j)) {
			recursive(i + 1, j - 1, s, pq, sum + 1);
		}
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution("abcdcba"));
		System.out.println(solution.solution("abacde"));
		System.out.println(solution.solution("abccba"));
		System.out.println(solution.solution("abc"));
	}

}

