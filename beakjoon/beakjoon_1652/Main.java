package beakjoon_1652;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] arg) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		if(n == 1) {
			System.out.println(0 + " " + 0);
			return;
		}
		
		char[][] arr = new char[n][n];
		
		int v = 0, h = 0;
		
		String s;
		for (int i = 0; i < n; i++) {
			s = br.readLine();
			for (int j = 0; j < n; j++) {
					arr[i][j] = s.charAt(j);
			}
		}
		
		int cnt = 0;
		
		for (int i = 0; i < n; i++) {
			cnt = 0;
			for (int j = 0; j < n; j++) {
				if(arr[j][i] == 'X') {
					if(cnt >= 2) {
						v ++;
					}
					cnt = 0;
				}else {
					cnt ++;
				}
			}
			if(cnt >= 2) {
				v ++;
			}
		}
		
		for (int i = 0; i < n; i++) {
			cnt = 0;
			for (int j = 0; j < n; j++) {
				if(arr[i][j] == 'X') {
					if(cnt >= 2) {
						h ++;
					}
					cnt = 0;
				}else {
					cnt ++;
				}
			}
			if(cnt >= 2) {
				h ++;
			}
		}
		System.out.println(h + " " + v);
	}
}
