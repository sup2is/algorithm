package beakjoon_1260;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	static ArrayList<Integer>[] arr;
	static boolean[] check;
	
	
	static void bfs(int x) {
		if(check[x]) {
			return;
		}
		
		check[x] = true;
		System.out.print(x + " ");
		
		for (int y : arr[x]) {
			if(check[y] == false) {
				bfs(y);
			}
		}
	}
	
	static void dfs(int start) {
		
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		check[start] = true;
		while(!q.isEmpty()) {
			int x = q.remove();
			System.out.print(x + " ");
			for (int y : arr[x]) {
				if(check[y] == false) {
					check[y] = true;
					q.add(y);
				}
			}
			
		}
		
		
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int start = sc.nextInt();
		
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
        bfs(start);
        check = new boolean[n+1];
        System.out.println();
        dfs(start);
		
	}
}
