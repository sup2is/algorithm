package lessons_42588;

import java.util.Arrays;

public class Solution {

	public int[] solution(int[] heights) {
		int[] answer = new int[heights.length];
		
		
		loop:for (int i = heights.length - 1; i >= 0; i--) {
			for (int j = i - 1; j >= 0; j--) {
				if(heights[i] < heights[j]) {
					answer[i] = j + 1;
					continue loop;
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(Arrays.toString(solution.solution(new int[] {3,9,9,3,5,7,2})));
	}

}
