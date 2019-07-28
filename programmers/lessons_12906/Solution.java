package lessons_12906;

import java.util.ArrayList;
import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/12906

public class Solution {
	
	public int[] solution(int []arr) {
		
		ArrayList<Integer> list = new ArrayList<>();
        
		for (int i = 0; i < arr.length - 1; i++) {
			if(arr[i] != arr[i + 1]) {
				list.add(arr[i]);
			}
		}
		
		if (list.size() == 0) {
			return new int[] {arr[0]};
		}
		//arr의 마지막수와 list의 마지막수가 다른수라면 후처리
		if(arr[arr.length - 1] != list.get(list.size() - 1)) {
			list.add(arr[arr.length - 1]);
		}
		
		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		
        return answer;
	}
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] arr = new int[] {1,1,1,1};
		
		int[] answer = solution.solution(arr);
		
		System.out.println(Arrays.toString(answer));
	}

}
