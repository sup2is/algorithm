package beakjoon_10610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] arg) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		String n = br.readLine();

		
		int[] arr = new int[n.length()];
		
		for (int i = 0; i < n.length(); i++) {
			arr[i] = n.charAt(i) - 48;
		}

		Arrays.sort(arr);
		
		if(arr[0] != 0) {
			System.out.println(-1);
			return;
		}
		
		long t = 0;
		
		for (int i = n.length() - 1; i >= 0; i--) {
			t += arr[i];
		}
		
		if(t % 3 != 0) {
			System.out.println(-1);
			return;
		}
		
		for (int i = n.length() - 1; i >= 0; i--) {
			sb.append(arr[i]);
		}
		
		System.out.println(sb.toString());
		
	}
	
}