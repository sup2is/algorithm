package beakjoon_1789;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] arg) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		
		long t = 0;
		long i = 0;

		while(true) {
			if(i + t >= n) {
				break;
			}
			i ++;
			t += i;
		}
		
		System.out.println(i);
	}
}
