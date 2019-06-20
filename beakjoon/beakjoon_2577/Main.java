package beakjoon_2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		String s = (a*b*c) + "";
		
		int arr[] = new int[10];
		
		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i) - 48] ++;
		}

		
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i] + "\n");
		}
		
		System.out.println(sb.toString());
		
	}
}

