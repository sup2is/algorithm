package beakjoon_3085;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int[][] dir = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
	static char[][] map;
	static int max = -1;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		map = new char[n][n];

		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			for (int j = 0; j < n; j++) {
				map[i][j] = s.charAt(j);
			}
		}


		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < dir.length; k++) {

					int ti = i + dir[k][0];
					int tj = j + dir[k][1];

					if (ti < 0 || tj < 0 || ti >= n || tj >= n) {
						continue;
					}
					swap(i,j,ti,tj);
					search(map[i][j]);
					swap(ti,tj,i,j);
				}
			}
		}

		System.out.println(max);

	}

	private static void search(char target) {

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {

				int sum = 0;
				for (int k = i; k < map.length; k++) {
					if(map[k][j] == target) {
						sum ++;
					}else {
						break;
					}
				}
				max = Math.max(max, sum);
				sum = 0;

				for (int k = j; k < map.length; k++) {
					if(map[i][k] == target) {
						sum ++;
					}else {
						break;
					}
				}
				max = Math.max(max, sum);
			}
		}


	}

	private static void swap(int i, int j, int x, int y) {
		char temp = map[i][j];
		map[i][j] = map[x][y];
		map[x][y] = temp;
	}

}