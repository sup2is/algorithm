package beakjoon_2445;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int cnt = Integer.parseInt(bf.readLine());
		
		int l = 0;
		
		for (int i = 0; i < cnt; i++) {
			if(i != 0) {
				sb.append("\n");
			}
			
			for (int j = 0; j < i + 1; j++) {
				sb.append("*");
			}
			
			for (l = 0; l < 2; l++) {
				for (int j = cnt - 1; j > i; j--) {
					sb.append(" ");
				}
			}
			
			for (int j = 0; j < i + 1; j++) {
				sb.append("*");
			}
			
		}
		
		for (int i = 1; i < cnt; i++) {
			if(i != 0) {
				sb.append("\n");
			}
			
			for (int j = cnt ; j > i; j--) {
				sb.append("*");
			}
			
			for (l = 2; l > 0; l--) {
				for (int j = 0; j < i; j++) {
					sb.append(" ");
				}
			}
			
			for (int j = cnt ; j > i; j--) {
				sb.append("*");
			}
			
		}
		
		System.out.println(sb.toString());
	}
}
