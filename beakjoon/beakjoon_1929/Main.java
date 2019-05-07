package beakjoon_1929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		String s[] = br.readLine().split(" ");
		
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		boolean p[] = new boolean[b+1];
		
		for (int i = 2; i <= b; i++) {
			if(p[i] == false) {
				if(a <= i) {
					sb.append(i + "\n");
				}
				for (int j = i*2; j <= b; j+=i) {
					p[j] = true;
				}
			}
		}
		System.out.println(sb.toString());
	}
}
