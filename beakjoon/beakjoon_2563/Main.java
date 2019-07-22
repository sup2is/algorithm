package beakjoon_2563;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] arg) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[][] square = new int[100][100];
		
		int n = Integer.parseInt(br.readLine());
		int x,y;
		
		int ans = 0;
		while(n--> 0) {
			st = new StringTokenizer(br.readLine());
			
			x = Integer.parseInt(st.nextToken()) - 1;
			y = Integer.parseInt(st.nextToken()) - 1;
			
			for (int i = x; i < x + 10; i++) {
				for (int j = y; j < y + 10; j++) {
					square[i][j] ++ ;
					
					if(square[i][j] == 1) {
						ans ++;
					}
					
					
				}
			}
			
			
		}

		System.out.println(ans);
		
	}
}