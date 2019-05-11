package beakjoon_1676;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int cnt = 0;
		int i = 2;
		cnt = a/5;
		while(a > Math.pow(5,i)) {
			cnt += a/Math.pow(5,i);
			i++;
		}
		
		System.out.println(cnt);
	}
}
