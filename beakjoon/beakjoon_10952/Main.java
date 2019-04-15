package beakjoon_10952;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String s;
		int a, b;
		
		while(true) {
			s = bf.readLine();
			a = Integer.parseInt(s.split(" ")[0]);
			b = Integer.parseInt(s.split(" ")[1]);
			if((a + b) == 0) return;
			System.out.println(a+b);
		}
	}
}
