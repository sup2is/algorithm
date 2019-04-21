package beakjoon_10866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
	
	class CustomDeque {
		
		ArrayDeque<Integer> deque = new ArrayDeque<>();
		
		
		public void push_front (int v) {
			deque.addFirst(v);
		}
		
		public void push_back(int v) {
			deque.addLast(v);
		}
		
		public int pop_back() {
			if (isEmpty() == 1) {
				return -1;
			}
			int r = back();
			deque.removeLast();
			return r;
		}
		
		public int pop_front () {
			if (isEmpty() == 1) {
				return -1;
			}
			int r = front();
			deque.removeFirst();
			return r;
		}
		
		public int isEmpty () {
			if(deque.isEmpty()) {
				return 1;
			}else {
				return 0;
			}
		}
		
		public int size () {
			return deque.size();
		}
		
		public int front () {
			if (isEmpty() == 1) {
				return -1;
			}
			return deque.getFirst();
		}
		
		public int back () {
			if (isEmpty() == 1) {
				return -1;
			}
			return deque.getLast();
		}
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int cnt = Integer.parseInt(bf.readLine());
		
		Main main = new Main();
		CustomDeque deque = main.new CustomDeque();
		
		String command ;
		for (int i = 0; i < cnt; i++) {
			
			command = bf.readLine();

			if(command.startsWith("push_front")) {
				
				command.replaceAll("[^0-9]", "");

				deque.push_front(Integer.parseInt(command.replaceAll("[^0-9]", "")));
				continue;
			}else if (command.startsWith("push_back")) {
				deque.push_back(Integer.parseInt(command.replaceAll("[^0-9]", "")));
				continue;
			}else if (command.startsWith("pop_front")) {
				sb.append(deque.pop_front());
			}else if (command.startsWith("pop_back")) {
				sb.append(deque.pop_back());
			}else if (command.startsWith("size")) {
				sb.append(deque.size());
			}else if (command.startsWith("empty")) {
				sb.append(deque.isEmpty());
			}else if (command.startsWith("front")) {
				sb.append(deque.front());
			}else if (command.startsWith("back")) {
				sb.append(deque.back());
			}

			if (i != cnt-1) {
				sb.append("\n");
			}
		}
		System.out.println(sb.toString());
	}
	
}
