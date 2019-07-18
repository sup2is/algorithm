package beakjoon_2960;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] arg) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n + 1];
		boolean[] isPrime = new boolean[n + 1];

		for (int i = 1; i < arr.length; i++) {
			arr[i] = i;
		}

		int cnt = 0;
		
		for (int i = 2; i < arr.length; i++) {
			for (int j = i; j < arr.length; j+=i) {
				if(!isPrime[j]) {
					isPrime[j] = true;
					cnt ++;
				}
				if(cnt == k) {
					System.out.println(arr[j]);
					return;
				}
			}
		}
		
	}
}
