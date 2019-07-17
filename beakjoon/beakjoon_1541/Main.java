package beakjoon_1541;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] arg) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int min = 0;
		
		String[] arr = new String[50];
		String s = br.readLine();
		
		arr = s.split("-");
		
		min = sum(arr[0]);
		
		int value = 0;
		
		for (int i = 1; i < arr.length; i++) {
			value = sum(arr[i]);
			min -= value;
		}
		System.out.println(min);
	}
	
	public static int sum(String s) {
		String[] t;
		t = s.split("\\+");
		int value = 0;
		for (int j = 0; j < t.length; j++) {
			value += Integer.parseInt(t[j]);
		}
		return value;
	}
}
