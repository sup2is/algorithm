package beakjoon_11057;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		long d[][] = new long[N+1][10];
		long result = 0;
		int mod = 10007;
		
		for (int i = 0; i < 10; i++) {
			d[1][i] = 1;
		}
		
		for (int i = 2; i <= N; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k <= j; k++) {
					d[i][j] += d[i-1][j-k] % mod;
				}
				
			}	
		}
		
		for (int i = 0; i < 10; i++) {
			result += d[N][i];
			result %= mod;
		}
		
		System.out.println(result);
		
	}
}
