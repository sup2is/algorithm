package beakjoon_8958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb;
		
		while (n-- > 0) {
			
			sb = new StringBuilder(br.readLine());
			int cnt = 0;
			int sum = 0;
		
			for (int i = 0; i < sb.length(); i++) {

				if(sb.charAt(i) == 'O') {
					cnt ++;
					sum += cnt;
				}else {
					cnt = 0;
				}
				
			}
			
			System.out.println(sum);
			
		}
		
		
	}

}