package lessons_12973;

import java.util.Arrays;
import java.util.Stack;

public class Solution {

	public int solution(String s) {

		Stack<Character> stack = new Stack<>(); 
		char[] c = s.toCharArray();
		stack.push(c[0]);

		for (int i = 1; i < c.length; i++) {
			char t = c[i];
			
			if(!stack.isEmpty() && stack.peek() == t) {
				stack.pop();
			}else {
				stack.push(t);
			}
			
		}
		
		return stack.isEmpty() ? 1 : 0;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution("baabaa"));
	}

}
