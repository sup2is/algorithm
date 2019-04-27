package beakjoon_9095;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int T = Integer.parseInt(bf.readLine());
		int N;
		int d[] = new int[11];

		d[1] = 1;
		d[2] = 2;
		d[3] = 4;
		
		for (int i = 0; i < T; i++) {
			N = Integer.parseInt(bf.readLine());
			if(d[N] > 0) {
				System.out.println(d[N]);
				continue;
			}
			
			for (int j = 4; j <= N; j++) {
				d[j] = d[j-1] + d[j-2] + d[j-3];
			}
			
			System.out.println(d[N]);
		}
	}
}
