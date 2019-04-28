package beakjoon_10844;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		long d[][] = new long[101][10];
		long result = 0;
		int mod = 1000000000;
		
		
		for (int i = 1; i < 10; i++) {
			d[1][i] = 1;
		}
		
		for (int i = 2; i <= N; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 0) {
					d[i][j] = d[i-1][j+1];
				}else if(j == 9) {
					d[i][j] = d[i-1][j-1]; 
				}else {
					d[i][j] = (d[i-1][j-1] + d[i-1][j+1]) % mod;
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
