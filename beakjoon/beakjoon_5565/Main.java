package beakjoon_5565;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] arg) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < 9; i++) {
			t -= Integer.parseInt(br.readLine());
		}
		
		System.out.println(t);
		
		
	}
}