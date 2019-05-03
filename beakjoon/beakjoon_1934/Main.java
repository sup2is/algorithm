package beakjoon_1934;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		long a = 0, b = 0;
		long r = 0;
		
		for (int i = 0; i < t; i++) {
			String s = br.readLine();
			a = Integer.parseInt(s.split(" ")[0]);
			b = Integer.parseInt(s.split(" ")[1]);
			while(b != 0) {
				r = a % b;
				a = b;
				b = r;
			}
			
			sb.append(a*(Integer.parseInt(s.split(" ")[0])/a)*(Integer.parseInt(s.split(" ")[1])/a) + "\n");
			
		}
		System.out.println(sb.toString());
	}
}
