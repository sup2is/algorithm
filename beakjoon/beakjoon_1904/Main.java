package beakjoon_1904;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] arg) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] d = new int[1000001];
		
		d[1] = 1;
		d[2] = 2;
		
		for (int i = 3; i <= n; i++) {
			d[i] = (d[i-2] + d[i-1]) % 15746;
		}
		
		System.out.println(d[n]);
		
	}
}
