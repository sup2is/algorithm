package beakjoon_1212;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		String s = br.readLine();
	
		int r;
		for (int i = 0; i < s.length(); i++) {
			r = s.charAt(i) - 48;
			switch (r) {
			case 0:
				sb.append("000");
				break;
			case 1:
				sb.append("001");
				break;
			case 2:
				sb.append("010");
				break;
			case 3:
				sb.append("011");
				break;
			case 4:
				sb.append("100");
				break;
			case 5:
				sb.append("101");
				break;
			case 6:
				sb.append("110");
				break;
			case 7:
				sb.append("111");
				break;
			}
			if(i == 0) {
				int t = Integer.parseInt(sb.toString());
				sb.setLength(0);
				sb.append(t);
			}
		}
		System.out.println(sb.toString());
	}
}
