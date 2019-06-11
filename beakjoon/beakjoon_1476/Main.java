package beakjoon_1476;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[3];
		
		for (int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int year = 1;
		
		while(true) {
			
			if((year - arr[0]) % 15 == 0 && (year - arr[1]) % 28 == 0 && (year - arr[2]) % 19 == 0) {
				break;
			}
			year ++;
		}
		
		System.out.println(year);
		
		
	}
}

