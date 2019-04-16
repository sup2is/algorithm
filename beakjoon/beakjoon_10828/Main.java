package beakjoon_10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	enum Order {
		POP,EMPTY,SIZE,TOP;
	}
	
	private Stack<Integer> stack = new Stack<>();
	
	public void push (int a) { this.stack.push(a); }
	
	public int pop () {
		if(empty() == 1) 
			return -1;
		
		return stack.pop();
	}
	
	public int size() {
		return stack.size();
	}
	
	public int empty () {
		if(stack.isEmpty()) 
			return 1;
		
		return 0;
	}
	
	public int top () {
		if(empty() == 1) 
			return -1;
		
		return stack.peek();
	}
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Main stack = new Main();
		String order = "";
		int count = Integer.parseInt(bf.readLine());
		
		for (int i = 0; i < count; i++) {
			
			order = bf.readLine();
			
			if(order.contains(" ")) {
				stack.push(Integer.parseInt(order.substring(order.indexOf(" ")+1, order.length())));
				continue;
			}
			switch (Order.valueOf(order.toUpperCase())) {
//			case POP: sb.append(stack.pop() + "\r\n"); break;
//			case EMPTY: sb.append(stack.empty()+ "\r\n"); break;
//			case SIZE: sb.append(stack.size()+ "\r\n"); break;
//			case TOP: sb.append(stack.top()+ "\r\n");break;
			case POP: System.out.println(stack.pop()); break;
			case EMPTY: System.out.println(stack.empty()); break;
			case SIZE: System.out.println(stack.size()); break;
			case TOP: System.out.println(stack.top());break;
			}
		}
		
		System.out.println(sb.toString());
	}
}
