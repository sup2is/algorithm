package lessons_12933;

import java.util.Arrays;

public class Solution {

	public long solution(long n) {
		
		String t = n + "";
		int[] arr = new int[t.length()]; 
		for (int i = 0; i < arr.length; i++) {
			arr[i] = t.charAt(i) - 48;
		}
		
		Arrays.sort(arr);
		
		StringBuffer answer = new StringBuffer();
		
		for (int i = arr.length - 1; i >= 0; i--) {
			answer.append(arr[i]);
		}
		
		
		return Long.parseLong(answer.toString());
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		
		System.out.println(solution.solution(118372));
	
	}

}
