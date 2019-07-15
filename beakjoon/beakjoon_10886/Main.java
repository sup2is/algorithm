package beakjoon_10886;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] arg) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int value = 0;
		
		for (int i = 0; i < n; i++) {
			value += Integer.parseInt(br.readLine());
		}
		
		if((n / 2) < value) {
			System.out.println("Junhee is cute!");
		}else {
			System.out.println("Junhee is not cute!");
		}
	}
}
