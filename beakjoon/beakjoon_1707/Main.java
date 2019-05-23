package beakjoon_1707;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	static ArrayList<Integer>[] arr;
	static int[] check;
	
	static void dfs(int x, int c) {
		if(check[x] > 0) {
			return;
		}
		
		check[x] = c;
		
		for (int y : arr[x]) {
			if(check[y] == 0) {
				dfs(y, 3-c);
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		
		for (int k = sc.nextInt(); k > 0; k--) {
			
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
				
	        check = new int[n+1];
	        for (int i = 1; i <= n; i++) {
	        	if(check[i] == 0) {
	        		dfs(i, i);
	        	}
			}
	        
	        boolean ok = true;
	        for (int i=1; i<=n; i++) {
                for (int j : arr[i]) {
                    if (check[i] == check[j]) {
                        ok = false;
                        break;
                    }
                }
            }
	        
	        if(ok) {
	        	System.out.println("YES");
	        }else {
	        	System.out.println("NO");
	        }
	        
		}
		
	}
}

