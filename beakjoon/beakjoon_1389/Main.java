package beakjoon_1389;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	static List<List<Integer>> arr = new ArrayList<>();
	static boolean[] visited;
	static int min;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		visited = new boolean[n + 1];

		for (int i = 0; i <= n; i++) {
			arr.add(new ArrayList<>());
		}


		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			arr.get(a).add(b);
			arr.get(b).add(a);

		}

		int value = Integer.MAX_VALUE;
		int answer = 0;

		for (int i = 1; i <= n; i++) {
			visited[i] = true;
			int sum = 0;
			for (int j = 1; j <= n; j++) {
				if(i == j) continue;

				min = n;
				dfs(i, j, 0);
				sum += min;

			}

			if(value > sum) {
				value = sum;
				if(answer < i) {
					answer = i;
				}
			}
			visited[i] = false;
		}

		System.out.println(answer);
	}



	private static void dfs(int x, int target, int cnt) {

		if(min < cnt) {
			return;
		}

		if(x == target) {
			min = Math.min(cnt , min);
			return;
		}

		for (Integer i : arr.get(x)) {
			if(!visited[i]) {
				visited[i] = true;
				dfs(i, target, cnt + 1);
				visited[i] = false;
			}
		}

	}

}