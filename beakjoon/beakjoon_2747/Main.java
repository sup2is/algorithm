package beakjoon_2747;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		if(n == 0) {
			System.out.println(0);
			return;
		}else if (n == 1) {
			System.out.println(1);
			return;
		}
		
		int[] dp = new int[n + 1];
		
		dp[1] = 1;
		dp[2] = 1;
		
		for (int i = 3; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		System.out.println(dp[n]);
	}
}
