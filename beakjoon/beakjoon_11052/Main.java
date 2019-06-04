package beakjoon_11052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int d[] = new int[n+1];
		int arr[] = new int[n+1];
		
		String s[] = br.readLine().split(" ");
		
		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(s[i-1]);
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				d[i] = Math.max(d[i], d[i - j] + arr[j]);
			}
		}
		System.out.println(d[n]);
		
	}
}
