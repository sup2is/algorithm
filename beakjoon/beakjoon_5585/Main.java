package beakjoon_5585;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] arg) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = 1000 - Integer.parseInt(br.readLine());
		int cnt = 0;
		
		cnt += n / 500;
		n %= 500;
		cnt += n / 100;
		n %= 100;
		cnt += n / 50;
		n %= 50;
		cnt += n / 10;
		n %= 10;
		cnt += n / 5;
		n %= 5;
		cnt += n / 1;
		
		System.out.println(cnt); 
		
	}
}