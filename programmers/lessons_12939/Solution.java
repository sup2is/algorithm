package lessons_12939;

import java.util.Arrays;

public class Solution {

	public String solution(String s) {

		String[] temp = s.split(" ");
		int[] arr = new int[temp.length];
		for (int i = 0; i < temp.length; i++) {
			arr[i] = Integer.parseInt(temp[i]);
		}
		
		Arrays.sort(arr);
		
		return arr[0] + " " + arr[arr.length-1];
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution("1 2 3 4"));
		System.out.println(solution.solution("-1 -2 -3 -4"));
	}

}
