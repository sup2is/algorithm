package beakjoon_11005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		String s[] = br.readLine().split(" ");
		
		int a = Integer.parseInt(s[0]) , b = Integer.parseInt(s[1]);
		int r;
		
		while(a != 0) {
			r = a % b;
			a = a/b;
			
			if (r > 9) {
				sb.append(Character.toChars((r-10) + 65));
			}else {
				sb.append(r);
			}
			
		}
		System.out.println(sb.reverse().toString());
	}
}
