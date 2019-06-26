package beakjoon_1075;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] arg) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String t = br.readLine();
		
		int n = Integer.parseInt(t.substring(0, t.length()-2) + "00");
		
		int f = Integer.parseInt(br.readLine());
		
		while(n % f != 0) {
			n++;
		}
		
		t = n + "";
		System.out.println(t.substring(t.length()-2 , t.length()));
		
		
	}
}