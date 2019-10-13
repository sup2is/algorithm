package beakjoon_3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		
		
		for (int i = 0; i < 10; i++) {
			arr[i] = Integer.parseInt(br.readLine()) % 42;
		}
		Arrays.sort(arr);
		
		int cnt = 1;
		int before = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if(before != arr[i]) {
				cnt ++;
				before = arr[i];
			}
		}
		
		
		
		System.out.println(cnt);
		
		
		
	}

}