package beakjoon_1159;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] ans = new int[26];
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[26];
		
		int a;
		
		for (int i = 0; i < n; i++) {
			a = br.readLine().charAt(0) - 97;
			arr[a]++;
			if(arr[a] >= 5) {
				ans[a] = a + 'a';
			}
		}
		
		Arrays.sort(ans);
		
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < ans.length; i++) {
			if(ans[i] != 0) {
				sb.append((char)ans[i]);
			}
		}
		
		if(sb.length() > 0) {
			System.out.println(sb.toString());
		}else {
			System.out.println("PREDAJA");
		}
		
	}
	
}
