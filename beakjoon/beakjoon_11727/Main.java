package beakjoon_11727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int d[] = new int[N+1];
		
		d[0] = 1;
		d[1] = 1;
		
		for (int i = 2; i <= N; i++) {
			d[i] = d[i-1] + d[i-2] + d[i-2];
			d[i] %= 10007;
		}

		System.out.println(d[N]);
	}
}
