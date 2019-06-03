package beakjoon_11053;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		int d[] = new int[n];
 		
		String s[] = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if(arr[i] > arr[j]) {
					if(d[i] <= d[j]) {
						d[i]++;
					}
				}
			}
		}
		
		Arrays.sort(d);
		
		System.out.println(d[n-1] + 1);
		
	}
}
