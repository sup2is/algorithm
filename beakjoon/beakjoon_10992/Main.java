package beakjoon_10992;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int cnt = Integer.parseInt(bf.readLine());
		
		for (int i = 1; i <= cnt; i++) {
			if(i != 1) {
				sb.append("\n");
			}

			for (int j = cnt-1; j >= i; j--) {
				sb.append(" ");
			}
			
			for (int j = 1; j <= i*2-1; j++) {
				if(i == 1 || i == cnt) {
					sb.append("*");
					continue;
				}
				if(j==1 || j ==i*2-1) {
					sb.append("*");
				}else {
					sb.append(" ");
				}
			}
		}
		
		System.out.println(sb.toString());
	}
}
