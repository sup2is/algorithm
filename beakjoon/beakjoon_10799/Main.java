package beakjoon_10799;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		
		String pipe = bf.readLine();
		String spitedPipe;
		
		int piece = 0;
		int stackIndex = 0;
		
		for (int i = 0; i < pipe.length(); i++) {
			
			spitedPipe = pipe.substring(i, i+1);
			
			if(spitedPipe.equals("(")) {
				stack.push(i);
				continue;
			}else {
				stackIndex = stack.pop();
				if(stackIndex == i-1) {
					piece += stack.size();
				}else {
					piece += 1;
				}
			}
		}
		System.out.println(piece);
	}
}
