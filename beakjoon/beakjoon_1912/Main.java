package beakjoon_1912;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int d[] = new int[n];
		int arr[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		d[0] = arr[0];
		int max = arr[0];
		for (int i = 1; i < n; i++) {
			d[i] = Math.max(d[i-1] + arr[i], arr[i]);
			
			max = Math.max(d[i], max);
		}
		System.out.println(max);
	}
}



