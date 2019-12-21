package beakjoon_2178;

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

		Queue<int[]> queue = new LinkedList<int[]>();
		int[][] map = new int[n][m];
		int[][] score = new int[n][m];
		for (int i = 0; i < n; i++) {
			char[] cArr = br.readLine().toCharArray();
			for (int j = 0; j < m; j++) {
				map[i][j] = cArr[j] - 48;
			}
		}
		n --;
		m --;

		map[0][0] = 0;
		score[0][0] = 1;
		queue.add(new int[] {0, 0});
		while (!queue.isEmpty()) {

			int[] t = queue.poll();
			int i = t[0];
			int j = t[1];

			if(i + 1 <= n && map[i + 1][j] == 1) {
				queue.add(new int[] {i + 1, j});
				map[i + 1][j] = 0;
				score[i + 1][j] = score[i][j] + 1;
			}

			if(j + 1 <= m && map[i][j + 1] == 1) {
				queue.add(new int[] {i, j + 1});
				map[i][j + 1] = 0;
				score[i][j + 1] = score[i][j] + 1;
			}

			if(i - 1 >= 0 && map[i - 1][j] == 1) {
				queue.add(new int[] {i- 1, j});
				map[i - 1][j] = 0;
				score[i - 1][j] = score[i][j] + 1;
			}

			if(j - 1 >= 0 && map[i][j - 1] == 1) {
				queue.add(new int[] {i, j - 1});
				map[i][j - 1] = 0;
				score[i][j - 1] = score[i][j] + 1;
			}
		}

		System.out.println(score[n][m]);
	}
}