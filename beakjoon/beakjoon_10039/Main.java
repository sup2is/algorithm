package beakjoon_10039;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t;
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			t = Integer.parseInt(br.readLine());
			sum += (t > 40) ? t : 40; 
		}
		
		System.out.println(sum/5);
		
	}
}

