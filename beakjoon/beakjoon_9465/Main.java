package beakjoon_9465;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(bf.readLine());
			int[][] d = new int[N+1][3];
			
			String[][] sticker = new String[][] {bf.readLine().split(" "),bf.readLine().split(" ")};
			
			for (int j = 1; j <= N; j++) {
				d[j][0] = Math.max(d[j-1][0], Math.max(d[j-1][1], d[j-1][2]));
				d[j][1] = Math.max(d[j-1][0],d[j-1][2]) + Integer.parseInt(sticker[0][j-1]);
				d[j][2] = Math.max(d[j-1][0],d[j-1][1]) + Integer.parseInt(sticker[1][j-1]);
				
			}

			System.out.println(Math.max(d[N][0], Math.max(d[N][1], d[N][2])));
		}
		
	}
}
