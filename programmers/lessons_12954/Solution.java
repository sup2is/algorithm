package lessons_12954;

import java.util.Arrays;

public class Solution {

	public long[] solution(long x, int n) {
		long[] answer = new long[n];
		
		for (int i = 0; i < n; i++) {
			answer[i] = x * (i + 1);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(Arrays.toString(solution.solution(10000000 , 1000)));
	}

}
