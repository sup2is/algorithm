package beakjoon_1932;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int d[][] = new int[n+1][n+1];
		int arr[][] = new int[n+1][n+1];
		String s[];
		for (int j = 0; j < n; j++) {
			s = br.readLine().split(" ");
			for (int i = 0; i < s.length; i++) {
				arr[j][i] = Integer.parseInt(s[i]);
			}
		}
		
		int max = 0;
		
		d[0][0] = arr[0][0];
		for (int i = 1; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				
				if(j == 0) {
					d[i][j] = d[i-1][j] + arr[i][j];			
				}else {
					d[i][j] = Math.max(d[i-1][j] + arr[i][j],d[i-1][j-1] + arr[i][j]);
				}
				
				max = Math.max(max, d[i][j]);
			}
		}
		System.out.println(max);

	}
}



