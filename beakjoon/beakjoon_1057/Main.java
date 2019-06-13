package beakjoon_1057;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int arr[] = new int[n+1];
		
		for (int i = 1; i <= n; i++) {
			arr[i] = i;
		}
		arr[Integer.parseInt(st.nextToken())] = -1;
		arr[Integer.parseInt(st.nextToken())] = -1;
		
		int idx;
		int cnt = 1;
		
		while(n != 1) {
			idx = 1;
			for (int i = 1; i < n; i+=2) {
				
				if(arr[i] == arr[i+1]) {
					System.out.println(cnt);
					return;
				}
				
				if(arr[i] < arr[i+1]) {
					arr[idx ++] = arr[i];
				}else {
					arr[idx ++] = arr[i+1];
				}
			}
			
			if(n % 2 == 0) {
				n /= 2;
			}else {
				int t = arr[n];
				n /= 2;
				n++;
				arr[n] = t;
			}
			
			
			cnt ++;
		}
		System.out.println(-1);
	}
}

