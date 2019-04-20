package beakjoon_1406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		Stack<String> stack = new Stack<>();
		Stack<String> temp = new Stack<>();
		
		String str = bf.readLine();
		int cnt = Integer.parseInt(bf.readLine());
		List<String> list = Arrays.asList(str.split(""));
		
		stack.addAll(list);
		
		String command = "";
		
		for (int i = 0; i < cnt; i++) {
			command = bf.readLine();
			
			if(command.startsWith("P")) {
				stack.push(command.substring(2, 3));
			}else if(command.equals("L")) {
				if(!stack.isEmpty()) {
					temp.push(stack.pop());
				}
			}else if(command.equals("D")){
				if(!temp.isEmpty()) {
					stack.push(temp.pop());
				}
			}else if(command.equals("B")) {
				if(!stack.isEmpty()) {
					stack.pop();
				}
			}
		}
		int t = temp.size();
		
		if(!temp.isEmpty()) {
			for (int i = 0; i < t; i++) {
				stack.push(temp.pop());
			}
		}

		for (String s : stack) {
			sb.append(s);
		}
		
		
		System.out.println(sb.toString());
	}
}
