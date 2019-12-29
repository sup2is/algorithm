package beakjoon_2660;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());

		int[][] dp = new int[n + 1][n + 1];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i == j) {
					dp[i][j] = 1;
				}else {
					dp[i][j] = n;
				}
			}
		}

		while (true) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());

			if(from < 0 && to < 0) {
				break;
			}

			dp[from][to] = 1;
			dp[to][from] = 1;
		}


		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				for (int k = 1; k <= n; k++) {
					if(k != j) {
						dp[k][j] = Math.min(dp[k][j], dp[k][i] + dp[i][j]);
					}
				}
			}
		}

		for (int i = 1; i <= n; i++) {
			Arrays.sort(dp[i]);
		}

		int min = n;
		for (int i = 1; i <= n; i++) {
			min = Math.min(min, dp[i][n]);
		}

		final int finalMin = min;
		long cnt = Arrays.stream(dp)
				.filter(v -> v[n] == finalMin)
				.count();

		System.out.println(min + " " + cnt);

		IntStream.range(1, dp.length)
				.filter(i -> dp[i][n] == finalMin)
				.forEach(i -> System.out.print(i + " "));

	}
}