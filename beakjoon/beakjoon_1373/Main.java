package beakjoon_1373;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		String s = br.readLine();
		int r ,k;
		String b;
		
		for (int i = 0; i < s.length()/3+1; i++) {
			k = 0;
			r = 0;
			
			if(3*(i+1) > s.length()) {
				b = s.substring(0,s.length()-i*3);
			}else {
				b = s.substring(s.length()-3*(i+1),s.length()-i*3);
			}

			if(b.length() == 0) {
				break;
			}
			
			for (int j = b.length() - 1; j >= 0; j--) {
				if(b.charAt(j) != '0') {
					r += Math.pow(2,k);
				}
				k++;
			}
			sb.append(r);
		}
		System.out.println(sb.reverse().toString());
	}
}
