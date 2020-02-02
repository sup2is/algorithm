package beakjoon_14888;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int[] operators = new int[4];
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < 4; i++) {
			operators[i] = Integer.parseInt(st.nextToken());
		}

		dfs(arr,operators,1, arr[0]);

		System.out.println(max);
		System.out.println(min);

	}

	private static void dfs(int[] arr, int[] operators, int idx, int value) {
		if(idx == arr.length){
			max = Math.max(max , value);
			min = Math.min(min , value);
//			return;
		}

		if(operators[0] != 0) {
			operators[0] --;
			dfs(arr, operators, idx + 1, value + arr[idx]);
			operators[0] ++;
		}

		if(operators[1] != 0) {
			operators[1] --;
			dfs(arr, operators, idx + 1, value - arr[idx]);
			operators[1] ++;
		}

		if(operators[2] != 0) {
			operators[2] --;
			dfs(arr, operators, idx + 1, value * arr[idx]);
			operators[2] ++;
		}

		if(operators[3] != 0) {
			operators[3] --;

			if(value < 0) {
				dfs(arr, operators, idx + 1, ((value * -1) / arr[idx]) * -1);
			}else {
				dfs(arr, operators, idx + 1, value / arr[idx]);
			}

			operators[3] ++;
		}
	}
}
