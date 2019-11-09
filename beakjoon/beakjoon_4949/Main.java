package beakjoon_4949;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<>();
		boolean flag;
		String s;
		
		while (true) {
			flag = true;
			s = br.readLine();
			stack.clear();
			if(s.charAt(0) == '.') {
				return;
			}
			
			for (Character c : s.toCharArray()) {
				switch (c) {
				case '(':
					stack.push(c);
					break;
				case ')':
					if (!stack.isEmpty() && stack.peek() == '(') {
						stack.pop();
					} else {
						flag = false;
						break;
					}
					break;
				case '[':
					stack.push(c);
					break;
				case ']':
					if (!stack.isEmpty() && stack.peek() == '[') {
						stack.pop();
					} else {
						flag = false;
						break;
					}
					break;
				}
			}
			
			if(stack.isEmpty() && flag) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
	}
}