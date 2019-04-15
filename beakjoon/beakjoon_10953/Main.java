package beakjoon_10953;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(bf.readLine());
		
		String s;
		int a, b;
		
		for (int i = 0; i < t; i++) {
			s = bf.readLine();
			a = s.charAt(0)-'0';
			b = s.charAt(2)-'0';
			sb.append((a+b)+"\n");
		}
		System.out.println(sb.toString());
	}
}
