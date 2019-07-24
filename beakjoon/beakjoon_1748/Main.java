package beakjoon_1748;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = 0;
		String n = br.readLine();

		int value = 9;
		
		for (int i = 1; i < n.length(); i++) {
			cnt += value * i;
			value *= 10;
		}
		
		
		for (int i = (int) Math.pow(10, n.length()-1); i <= Integer.parseInt(n); i++) {
			cnt += n.length();
		}
		
		System.out.println(cnt);
		
	}
	
}
