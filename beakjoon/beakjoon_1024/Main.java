package beakjoon_1024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());

		boolean flag = true;
		for (int i = l; i <= 100 && flag; i++) {
			if((2 * n >= i * (i - 1)) && (2 * n - i * (i - 1)) % (2 * i) == 0) {
				int a = ((2 * n - i * (i - 1)) / (2 * i));
				for (int j = 0; j < i; j ++) {
					sb.append(a + j + " ");
				}
				System.out.println(sb.toString());
				flag = false;
			}
		}
		if(flag) System.out.println(-1);

	}

}