package lessons_12910;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;import java.util.List;

//https://programmers.co.kr/learn/courses/30/lessons/12910

public class Solution {

	public int[] solution(int[] arr, int divisor) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
		}
		
		if(list.size() == 0) {
			return new int[] {-1};
		}
		
		int[] answer = new int[list.size()];
		
		Collections.sort(list);
		
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		
		int[] arr = new int[] {5, 9, 7, 10};
		int divisor = 5;
		
		int[] answer = solution.solution(arr, divisor);
		
		System.out.println(Arrays.toString(answer));
		
	}

}
