package beakjoon_1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] arr = new int[100001];

		Queue<Integer> queue = new LinkedList<>();

		queue.add(n);

		if(n == k) {
			System.out.println(0);
			return;
		}

		while (!queue.isEmpty()) {

			int t = queue.poll();

			if(t - 1 >= 0 && arr[t - 1] == 0) {
				queue.add(t - 1);
				arr[t - 1] = arr[t] + 1;
			}

			if(t + 1 <= 100000 && arr[t + 1] == 0) {
				queue.add(t + 1);
				arr[t + 1] = arr[t] + 1;
			}

			if(t * 2 <= 100000 && arr[t * 2] == 0) {
				queue.add(t * 2);
				arr[t * 2] = arr[t] + 1;
			}

		}

		System.out.println(arr[k]);

	}
}