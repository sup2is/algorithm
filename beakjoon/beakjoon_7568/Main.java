package beakjoon_7568;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] arg) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		ArrayList<int[]> list = new ArrayList<int[]>();
		StringTokenizer st;
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			list.add(new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
		}
		
		boolean[] check = new boolean[n];
		
		for (int i = 0; i < list.size(); i++) {
			
			if(check[i]) {
				continue;
			}
			
			int[] curr = list.get(i);
			int rank = 1;
			
			for (int j = 0; j < list.size(); j++) {
				
				if(i == j) {
					continue;
				}
				
				if(list.get(j)[0] > curr[0] && list.get(j)[1] > curr[1]) {
					rank ++;
				}
				
			}
			
			check[i] = true;
			sb.append(rank + " ");
			
		}
		System.out.println(sb);
		
	}
}