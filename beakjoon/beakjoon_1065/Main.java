package beakjoon_1065;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;

		if(n < 100) {
			cnt = n;
		}else {
			cnt = 99;
		}
		
		StringBuilder sb = new StringBuilder();
		loop : for (int i = 100; i <= n; i++) {
			sb.setLength(0);
			sb.append(i);
			
			int value = (sb.charAt(0) - 48) - (sb.charAt(1) - 48);
			
			for (int j = 1; j < sb.length() - 1; j++) {
				
				if((sb.charAt(j) - 48) - (sb.charAt(j + 1) - 48) != value){
					continue loop;
				}
			}
			
			cnt ++;
		}
	
		System.out.println(cnt);
	}
}
