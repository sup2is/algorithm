package beakjoon_11653;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int a = Integer.parseInt(br.readLine());
		for (int i = 2; i <= a; i++) {
			while(a % i == 0) {
				sb.append(i + "\n");
				a /=i;
			}
		}
		System.out.println(sb.toString());
	}
}
