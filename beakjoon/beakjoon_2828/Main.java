package beakjoon_2828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int cnt = 0;
		int moved = 0;
		int j = Integer.parseInt(br.readLine());
		while (j-- > 0) {
			
			int p = Integer.parseInt(br.readLine());
			
			if(p > n) {
				continue;
			}
			
			if(m < p) {
				while (m != p) {
					m ++;
					cnt ++;
					moved ++;
				}
			}if(m - (m - 1 - moved) > p) {
				while (m - (m - 1 - moved) != p) {
					m --;
					cnt ++;
					moved --;
				}
			}
			
			System.out.println("바구니의 반경 : " + (m - (m - 1 - moved)) + " ~ " + m);
			
		}

		System.out.println(cnt);
	}
}