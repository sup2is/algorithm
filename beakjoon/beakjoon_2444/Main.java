package beakjoon_2444;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int cnt = Integer.parseInt(bf.readLine());
		
		int l;
		
		for (int i = 0; i < cnt; i++) {
			if(i != 0) {
				sb.append("\n");
			}
			
			for (int j = cnt - 1; j > i; j--) {
				sb.append(" ");
			}
			for (l = 0; l <= i; l++) {
				sb.append("*");
			}
			for (; l > 1; l--) {
				sb.append("*");
			}
			
		}
		
		for (int i = 1; i < cnt; i++) {
			sb.append("\n");

			for (int j = 0; j < i; j++) {
				sb.append(" ");
			}
			
			for (l = cnt - 1; l >= i; l--) {
				sb.append("*");
			}
			
			for (; l < cnt - 2; l++) {
				sb.append("*");
			}
			
		}
		
		System.out.println(sb.toString());
	}
}
