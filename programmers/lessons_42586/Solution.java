package lessons_42586;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Solution {

	public int[] solution(int[] progresses, int[] speeds) {
		
		Stack<Integer> stack = new Stack<>();
		ArrayList<Integer> listAns = new ArrayList<Integer>();
		
		int day;
		int progress;
		
		for (int i = progresses.length - 1; i >= 0; i--) {
			day = 0;
			progress = progresses[i];
			
			while(progress < 100) {
				day ++;
				progress += speeds[i];
			}
			stack.push(day);
		}
		
		while(!stack.isEmpty()) {
			int d = 1;
			int t = stack.pop();

			while(!stack.isEmpty() && stack.peek() <= t) {
				stack.pop();
				d ++;
			}
			listAns.add(d);
		}
		
		int[] answer = new int[listAns.size()];
		
		for (int i = 0; i < listAns.size(); i++) {
			answer[i] = listAns.get(i);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(Arrays.toString(solution.solution(new int[] {93,30,55} , new int[] {1,30,5})));
	}

}
