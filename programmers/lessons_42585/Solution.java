package lessons_42585;

import java.util.Stack;

public class Solution {

    public int solution(String arrangement) {
    	
    	Stack<Character> stack = new Stack<Character>();
    	int answer = 0;
    	
    	for (int i = 0; i < arrangement.length(); i++) {
			
    		if(arrangement.charAt(i) == '(') {
    			stack.add(arrangement.charAt(i));
    		}
    		

    		if(arrangement.charAt(i) == ')' && arrangement.charAt(i - 1) == '(') {
    			stack.pop();
    			answer += stack.size();
    			continue;
    		}
    		
    		if (arrangement.charAt(i) == ')'){
    			stack.pop();
    			answer += 1;
    		}
    		
		}
        return answer;
    }

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution("()(((()())(())()))(())"));
	}

}
