package beakjoon_1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[26];
		String s = br.readLine().toUpperCase();
		
		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i) - 'A'] ++;
		}
		
		int max = -1;
		int maxIdx = -1;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				maxIdx = i;
			}
		}
		
		Arrays.sort(arr);
		
		if(arr[arr.length - 1] == arr[arr.length - 2]) {
			System.out.println("?");
			return;
		}
		
		System.out.println((char)('A' + maxIdx));
	}

}