package beakjoon_1874;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		
		int n = Integer.parseInt(br.readLine());
		int num = 1;
		int val = 0;
		
		while (n-- > 0) {

			int x = Integer.parseInt(br.readLine());
			
			if(stack.isEmpty() || x != stack.peek()) {
				for (int i = val; i < x; i++) {
					stack.push(num);
					sb.append("+\n");
					num++;
				}
				val = x;
			}

			if(!stack.isEmpty() && x == stack.peek()) {
				sb.append("-\n");
				stack.pop();
			}else {
				System.out.println("NO");
				return;
			}
			
		}
		System.out.println(sb.toString());
	}
}