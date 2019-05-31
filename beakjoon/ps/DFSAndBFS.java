package ps;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DFSAndBFS {
	
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
}
