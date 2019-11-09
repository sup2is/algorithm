package beakjoon_10773;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		
		int t;
		
		while (n-- > 0) {
			t = Integer.parseInt(br.readLine());

			if(t != 0) {
				stack.push(t);
			}else {
				stack.pop();
			}
		}
		
		int sum = 0;
		
		for (Integer i : stack) {
			sum += i;
		}

		System.out.println(sum);
	}
}
