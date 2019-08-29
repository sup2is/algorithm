package lessons_12909;

import java.util.Stack;

public class Solution {
	
	public boolean solution(String s) {
		Stack<Integer> stack = new Stack<>();
		
		try {
			for (int i = 0; i < s.length(); i++) {
				
				if(s.charAt(i) == '(') {
					stack.push(0);
				}else {
					stack.pop();
				}
				
			}
			
		} catch (ArrayIndexOutOfBoundsException ignore) {
			return false;
		}
		
		return stack.isEmpty() ? true : false;
	}
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution("()()"));
	}

}
