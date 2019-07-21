package beakjoon_5597;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] arg) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[31];
		
		
		for (int i = 0; i < 28; i++) {
			arr[Integer.parseInt(br.readLine())] = 1;
		}
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] == 0)
				System.out.println(i);
		}
		
	}
}