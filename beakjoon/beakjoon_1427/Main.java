package beakjoon_1427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		int[] arr = new int[s.length()];
		
		for (int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i) - 48;
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]);
		}
		
	}
}
