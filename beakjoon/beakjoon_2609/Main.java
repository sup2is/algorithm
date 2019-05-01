package beakjoon_2609;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s =  br.readLine().split(" ");
		
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		int r = 0;
		while(b != 0) {
			r = a % b;
			a = b;
			b = r;
		}
		
		System.out.println(a);
		System.out.println(a*(Integer.parseInt(s[0])/a)*(Integer.parseInt(s[1])/a));
		
	}
}
