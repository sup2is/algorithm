package beakjoon_9466;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static int cnt;
	static int[] arr;
	static boolean[] check;
	static boolean[] finished;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int t = Integer.parseInt(br.readLine()); t > 0; t--) {
			
			int n = Integer.parseInt(br.readLine());
			
			arr = new int[n+1];
			check = new boolean[n+1];
			finished = new boolean[n+1];
			cnt = 0;
			String s[] = br.readLine().split(" ");
			
			for (int i = 1; i <= n; i++) {
				arr[i] = Integer.parseInt(s[i-1]);
			}
			
			for (int i = 1; i <= n; i++) {
				dfs(i);
			}
			
			System.out.println(n - cnt);
		}
	}

	private static void dfs(int now) {
		if(check[now]) {
			return;
		}
		
		check[now] = true;
		int next = arr[now];
		
		if(!check[next]) {
			dfs(next);
		}else {
			if(!finished[next]) {
				cnt++;
				for (int i = next; i != now; i = arr[i]) {
					cnt++;
				}
			}
		}
		finished[now] = true;
	}
}

