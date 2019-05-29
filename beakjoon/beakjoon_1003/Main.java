package beakjoon_1003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int n = Integer.parseInt(br.readLine());
		int d[][] = new int[41][2];
		int arr[] = new int[n+1];

		d[0][0] = 1;
		d[0][1] = 0;
		d[1][0] = 0;
		d[1][1] = 1;
		
		
		for (int j = 0; j < n; j++) {
			arr[j] = Integer.parseInt(br.readLine());
			
			if((d[arr[j]][0] + d[arr[j]][1]) > 0) {
				sb.append(d[arr[j]][0] + " " + d[arr[j]][1] + "\n");
				continue;
			}
			
			for (int i = 2; i <= arr[j]; i++) {
				d[i][0] = d[i-1][1];
				d[i][1] = d[i-1][0] + d[i-1][1];
			}
			
			sb.append(d[arr[j]][0] + " " + d[arr[j]][1] + "\n");
			
		}

		System.out.println(sb.toString());

	}
	
}
