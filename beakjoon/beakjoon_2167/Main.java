package beakjoon_2167;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] map = new int[n + 1][m + 1];
		int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

		for (int i = 1; i <= n; i++) {
			int sum = 0;
			for (int j = 1; j <= m; j++) {
				sum += map[i][j];
				dp[i][j] = dp[i - 1][j] + sum;
			}
		}


		int k = Integer.parseInt(br.readLine());

		while (k-- > 0) {

			st = new StringTokenizer(br.readLine());

			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			System.out.println(dp[x][y] - dp[i - 1][y] - dp[x][j - 1] + +dp[i - 1][j - 1]);
		}
	}
}