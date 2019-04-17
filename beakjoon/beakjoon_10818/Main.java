package beakjoon_10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());
		
		int[] arr = new int[t];
		
		String str = bf.readLine();
		
		String[] strArr = str.split(" ");

		for (int i = 0; i < strArr.length; i++) {
			arr[i] = Integer.parseInt(strArr[i]);
		}
		
		Arrays.sort(arr);
		
		System.out.print(arr[0] + " " + arr[arr.length-1]);
	}
}
