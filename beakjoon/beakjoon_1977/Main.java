package beakjoon_1977;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		int t = 1;
		int sum = 0;
		int min = Integer.MAX_VALUE;
		
		while (t*t <= n) {
			if(t*t >= m) {
				sum += t*t;
				min = Math.min(min,t*t);
			}
			t++;
		}
		
		if(sum == 0) {
			System.out.println(-1);
			return;
		}
		
		System.out.println(sum);
		System.out.println(min);
	}
}

