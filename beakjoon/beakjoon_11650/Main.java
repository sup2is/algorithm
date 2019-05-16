package beakjoon_11650;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int n = Integer.parseInt(br.readLine());
		int[][] p = new int[n][2];
		
		String s[];
		for (int i = 0; i < n; i++) {
			s = br.readLine().split(" ");
			p[i][0] = Integer.parseInt(s[0]);
			p[i][1] = Integer.parseInt(s[1]);
		}
		
		Arrays.sort(p , new Comparator<int[]>() {
			@Override
			public int compare(int[] x, int[] y) {
				if(x[0] == y[0]) {
					return Integer.compare(x[1], y[1]);
				}
				return Integer.compare(x[0], y[0]);
			}
		});

		for (int i = 0; i < n; i++) {
			sb.append(p[i][0] + " " + p[i][1] + "\n");
		}
		System.out.println(sb.toString());
	}
}
