package lessons_12935;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

	public int[] solution(int[] arr) {
		int[] answer;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			min = Math.min(min, arr[i]);
			list.add(arr[i]);
		}
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) == min) {
				list.remove(i);
			}
		}
		
		answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		return (answer.length > 0 ? answer : new int[] {-1});
	}

	public static void main(String[] args) {
		Solution solution = new Solution();

		int arr[] = new int[] { 4, 3, 2 ,1 ,5, 6 , 4 ,3};
		System.out.println(Arrays.toString(solution.solution(arr)));
	}

}
