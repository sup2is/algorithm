package beakjoon_2163;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		
		if(n > m) {
			System.out.println((n-1) + (m-1)*n);
		}else {
			System.out.println((m-1) + (n-1)*m);
		}
		
		
		
	}
}

