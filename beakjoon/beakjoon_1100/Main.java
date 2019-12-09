package beakjoon_1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = 8;
		int t = 0;
		int cnt = 0;
		String s;

		for (int i = 0; i < n; i ++) {
			s = br.readLine();
			t = i;
			for (int j = 0; j < s.length(); j ++) {
				if(t % 2 == 0 && s.charAt(j) == 'F') {
					cnt ++;
				}
				t ++;
			}
		}
		System.out.println(cnt);
	}
}
