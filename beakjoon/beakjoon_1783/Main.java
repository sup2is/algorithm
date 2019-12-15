package beakjoon_1783;

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

		//5회 이상 움질일 수 있는 최소 행크기는 3이상
		boolean flag = false;
		int cnt = 1;

		if(n == 1) {
			System.out.println(cnt);
			return;
		}else if(n == 2) {
			System.out.println(Math.min(4 , (m + 1)/2));
		}else {
			if(m > 6) {
				System.out.println(m - 2);
			}else {
				System.out.println(Math.min(4 , m));
			}
		}
	}
}