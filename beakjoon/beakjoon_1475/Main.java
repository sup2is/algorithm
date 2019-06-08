package beakjoon_1475;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = new int[11];
		String s = br.readLine();
		int r;
		
		for (int i = 0; i < s.length(); i++) {
			r = s.charAt(i) - 48; 
			if(r == 6 || r == 9) {
				arr[10]++;
				continue;
			}
			arr[r]++;
		}
		int max = 0;
		
		for (int i = 0; i < arr.length - 1; i++) {
			max = Math.max(max, arr[i]);
		}
		
		if(max < arr[10]) {
			if(arr[10] % 2 == 0) {
				System.out.println(arr[10]/2);
			}else {
				System.out.println((arr[10]/2) + 1);
			}
		}else {
			System.out.println(max);
		}
		
		
		
	}
}

