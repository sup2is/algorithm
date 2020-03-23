package beakjoon_11058;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		if(n <= 6) {
			System.out.println(n);
			return;
		}

		long[] dp = new long[n + 1];

		for (int i = 1; i <= 6; i++) {
			dp[i] = i;
		}

		for (int i = 7; i <= n; i++) {
			for (int j = 3; j <= i - 1; j++) {
				long cur = dp[i - j] * (j - 1);
				if (cur > dp[i]) {
					dp[i] = cur;
				}
			}
		}

		System.out.println(dp[n]);
	}
}