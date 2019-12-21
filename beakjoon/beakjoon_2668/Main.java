package beakjoon_2668;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	static Set<Integer> set = new TreeSet<>();
	static int last;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n + 1];
		boolean[] visited = new boolean[n + 1];

		for (int i = 1; i <= n; i++) {
			int t = Integer.parseInt(br.readLine());
			arr[i] = t;
		}

		for (int i = 1; i <= n; i++) {
			last = i;
			visited[i] = true;
			dfs(i, arr, visited);
			visited[i] = false;
		}

		System.out.println(set.size());

		for (Integer t : set) {
			System.out.println(t);
		}

	}

	private static void dfs(int i, int[] arr, boolean[] visited) {

		int nextIdx = arr[i];
		if(!visited[nextIdx]) {
			visited[nextIdx] = true;
			dfs(nextIdx, arr, visited);
			visited[nextIdx] = false;
		}
		if(last == arr[nextIdx]) {
			set.add(last);
		}
	}

}