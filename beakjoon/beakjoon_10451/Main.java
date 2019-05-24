package beakjoon_10451;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static int[] arr;
	static boolean[] check;
	
	static void dfs(int x) {
		if(check[x]) {
			return;
		}
		check[x] = true;
		dfs(arr[x]);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int t = Integer.parseInt(br.readLine()); t > 0; t--) {
			
			int n = Integer.parseInt(br.readLine());
			
			arr = new int[n+1];
			
			String s[] = br.readLine().split(" ");
			
			int m[] = new int[s.length + 1];
			
			for (int i = 0; i < m.length - 1; i++) {
				m[i+1] = Integer.parseInt(s[i]);
			}
			
	        for (int i=1; i<m.length; i++) {
	            arr[i] = m[i];
	        }
	        
	        check = new boolean[n+1];
	        int cnt = 0;
	        for (int i = 1; i <= n; i++) {
	        	if(check[i] == false) {
	        		cnt ++;
	        		dfs(i);
	        	}
			}
	        System.out.println(cnt);
		}
		
	}
}

