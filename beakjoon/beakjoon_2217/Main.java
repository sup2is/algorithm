package beakjoon_2217;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] arg) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		int max = 0;
		int idx = 1;
		for (int i = n - 1; i >= 0; i--) {
			max = Math.max(arr[i] * idx, max);
			idx ++;
		}
		
		System.out.println(max);
		
		
	}
	
}