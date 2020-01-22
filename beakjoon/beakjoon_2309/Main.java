package beakjoon_2309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	static Queue<Integer> pq = new PriorityQueue<Integer>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[9];
		boolean[] visitied = new boolean[9];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		combination(arr, visitied, 0, 9, 7);
		
	}

	private static void combination(int[] arr, boolean[] visitied, int start, int n, int r) {
		if(r == 0) {
			calc(arr, visitied);
			return;
		}else {
			for (int i = start; i < n; i++) {
				visitied[i] = true;
				combination(arr, visitied, i + 1, n, r - 1);
				visitied[i] = false;
			}
		}
	}

	private static void calc(int[] arr, boolean[] visitied) {
		
		int sum = 0;
		
		for (int i = 0; i < visitied.length; i++) {
			if(visitied[i]) {
				sum += arr[i];
				pq.add(arr[i]);
			}
		}
		
		if(sum == 100) {
			
			while (!pq.isEmpty()) {
				System.out.println(pq.poll());
			}
			System.exit(0);
		}else {
			pq.clear();
		}
	}
}
