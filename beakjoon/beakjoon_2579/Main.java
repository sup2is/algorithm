package beakjoon_2579;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int d[] = new int[n+1];
		int score[] = new int[n+1];
		
		for (int i = 0; i < n; i++) {
			score[i] = Integer.parseInt(br.readLine());
		}
		
		d[0] = score[0];
		d[1] = Math.max(score[0] + score[1], score[1]);
		d[2] = Math.max(score[0] + score[2], score[1] + score[2]);
		
		for (int i = 3; i < n; i++) {
			d[i] = Math.max(d[i-2] + score[i], score[i-1] + score[i] + d[i-3]);
		}
		System.out.println(d[n-1]);
		
	}
	
}
