package beakjoon_11724;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	static ArrayList<Integer>[] arr;
	static boolean[] check;
	
	static void dfs(int x) {
		if(check[x]) {
			return;
		}
		
		check[x] = true;
		
		for (int y : arr[x]) {
			if(check[y] == false) {
				dfs(y);
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		arr = (ArrayList<Integer>[]) new ArrayList[n+1];

		for (int i=1; i<=n; i++) {
			arr[i] = new ArrayList<Integer>();
        }
		
        for (int i=0; i<m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            arr[u].add(v);
            arr[v].add(u);
        }
        
        for (int i=1; i<=n; i++) {
            Collections.sort(arr[i]);
        }
        check = new boolean[n+1];
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
        	if(check[i] == false) {
        		dfs(i);
        		cnt ++;
        	}
		}
        System.out.println(cnt);
		
	}
}

