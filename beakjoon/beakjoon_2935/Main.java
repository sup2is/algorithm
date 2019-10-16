package beakjoon_2935;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuffer a = new StringBuffer(br.readLine());
		String token = br.readLine();
		String b = br.readLine();
		
		
		if (token.equals("+")) {
			
			if(a.length() == b.length()) {
				a.setCharAt(0, '2');
				System.out.println(a.toString());
				return;
			}
			
			if(a.length() < b.length()) {
				String t = a.toString();
				a.setLength(0);
				a.append(b);
				b = t;
			}

			a.setCharAt(a.length() - b.length(), '1');
			
		}else {
			for (int i = 0; i < b.length() - 1; i++) {
				a.append("0");
			}
		}

		
		System.out.println(a.toString());
		
	}
}
