package beakjoon_2156;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}

		int[][] d = new int[n+1][3];
	
		for (int i = 1; i <= n; i++) {
			d[i][0] = Math.max(d[i-1][0], Math.max(d[i-1][1], d[i-1][2]));
			d[i][1] = d[i-1][0] + arr[i-1];
			d[i][2] = Math.max(d[i-1][0], d[i-1][1]) + arr[i-1];
		}
		
		System.out.println(Math.max(d[n][0], Math.max(d[n][1],d[n][2])));
	}
}
