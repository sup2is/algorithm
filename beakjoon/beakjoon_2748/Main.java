package beakjoon_2748;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long[] dp = new long[Integer.parseInt(br.readLine()) + 1];
		
		if(dp.length == 2) {
			System.out.println(1);
			return ;
		}
		
		dp[1] = 1;
		dp[2] = 1;
		
		for (int i = 3; i <= dp.length - 1; i++) {
			dp[i] = dp[i-2] + dp[i-1];
		}
		
		System.out.println(dp[dp.length - 1]);
		
	}
}

