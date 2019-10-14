package beakjoon_5622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int sum = 0;
		
		for (int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);
			
			if('A' + 2 >= c) {
				sum += 3;
				continue;
			}
			if('D' + 2 >= c) {
				sum += 4;
				continue;
			}
			if('G' + 2 >= c) {
				sum += 5;
				continue;
			}
			if('J' + 2 >= c) {
				sum += 6;
				continue;
			}
			if('M' + 2 >= c) {
				sum += 7;
				continue;
			}
			if('P' + 3 >= c) {
				sum += 8;
				continue;
			}
			if('T' + 2 >= c) {
				sum += 9;
				continue;
			}
			if('W' + 3 >= c) {
				sum += 10;
				continue;
			}
			
		}
		
		System.out.println(sum);
		
	}
		
}