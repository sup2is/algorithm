package beakjoon_7576;

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
		int m = Integer.parseInt(st.nextToken());

		int[][] map = new int[m][n];
		Queue<int[]> queue = new LinkedList<int[]>();


		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j] == 1) {
					queue.add(new int[] {i,j});
				}
			}
		}

		if(queue.isEmpty()) {
			System.out.println();
		}

		int cnt = 0;

		while (!queue.isEmpty()) {

			cnt ++;

			int size = queue.size();

			while (size --> 0) {
				int[] t = (int[]) queue.poll();

				int i = t[0];
				int j = t[1];

				if(i + 1 <= m - 1 && map[i + 1][j] == 0) {
					queue.add(new int[] {i + 1, j});
					map[i + 1][j] = 1;
				}

				if(j + 1 <= n - 1 && map[i][j + 1] == 0) {
					queue.add(new int[] {i, j + 1});
					map[i][j + 1] = 1;
				}

				if(i - 1 >= 0 && map[i - 1][j] == 0) {
					queue.add(new int[] {i- 1, j});
					map[i - 1][j] = 1;
				}

				if(j - 1 >= 0 && map[i][j - 1] == 0) {
					queue.add(new int[] {i, j - 1});
					map[i][j - 1] = 1;
				}
			}
		}


		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(map[i][j] == 0) {
					System.out.println(-1);
					return;
				}
			}
		}

		System.out.println(cnt - 1);

	}
}