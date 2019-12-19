package beakjoon_2667;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

	static PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	static int cnt;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] map = new int[n][n];
		String s = "";

		for (int i = 0; i < n; i++) {
			s = br.readLine();
			for (int j = 0; j < s.length(); j++) {
				map[i][j] = s.charAt(j) - 48;
			}
		}

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				if(map[i][j] == 1) {
					cnt = 0;
					dfs(i, j, map);
					pq.add(cnt);
				}
			}
		}

		System.out.println(pq.size());
		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		}

	}

	private static void dfs(int i, int j, int[][] map) {
		map[i][j] = 0;
		cnt ++;

		if(i + 1 < map.length && map[i + 1][j] == 1) {
			dfs(i + 1, j, map);
		}
		if(j + 1 < map.length && map[i][j + 1] == 1) {
			dfs(i, j + 1, map);
		}
		if(i - 1 >= 0 && map[i - 1][j] == 1) {
			dfs(i - 1, j, map);
		}
		if(j - 1 >= 0 && map[i][j - 1] == 1) {
			dfs(i, j - 1, map);
		}

	}
}
