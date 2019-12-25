package beakjoon_2669;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 4;
		int[][] map = new int[101][101];
		int[] point = new int[4];
		int cnt = 0;
		StringTokenizer st;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			for (int j = 0; j < point.length; j++) {
				point[j] = Integer.parseInt(st.nextToken());
			}

			for (int j = point[0]; j < point[2]; j++) {
				for (int k = point[1]; k < point[3]; k++) {
					if(map[j][k] == 0) {
						map[j][k] = 1;
						cnt ++;
					}
				}
			}
		}

		System.out.println(cnt);
	}
}