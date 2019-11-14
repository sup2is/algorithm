package beakjoon_17298;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] ans = new int[n];
		
		for (int i = arr.length - 1; i >= 0; i--) {
			while(!stack.isEmpty() && stack.peek() <= arr[i]) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				ans[i] = -1;
			}else {
				ans[i] = stack.peek();
			}

			stack.push(arr[i]);
		}
		for (int i = 0; i < ans.length; i++) {
			sb.append(ans[i] + " ");
		}
		System.out.println(sb.toString());
	}
}