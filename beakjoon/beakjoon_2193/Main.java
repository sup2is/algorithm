package beakjoon_2193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		long d[] = new long[91];

		d[1] = 1;
		d[2] = 1;
		
		for (int i = 3; i <= N; i++) {
			d[i] = d[i-1] + d[i-2];
		}
		System.out.println(d[N]);
	}
}
