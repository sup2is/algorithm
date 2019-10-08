package beakjoon_1018;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] arg) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int min = Integer.MAX_VALUE;
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] chess = new int[n][m];
		
		String s;
		
		for (int i = 0; i < n; i++) {
			s = br.readLine();
			for (int j = 0; j < s.length(); j++) {
				if(s.charAt(j) == 'B') {
					chess[i][j] = 1;
				}else {
					chess[i][j] = 0;
				}
			}
		}
		for (int x = 0; x <= n - 8; x++) {
			loop:for (int y = 0; y <= m - 8; y++) {
				int whiteCnt = 0;
				int blackCnt = 0;
				int t = 0;
				for (int i = x; i < 8 + x; i++) {
					for (int j = y; j < 8 + y; j++) {
						
						if(min < blackCnt && min < whiteCnt) {
							continue loop;
						}
						
						if(t % 2 != chess[i][j]) {
							whiteCnt ++;
						}
						if(t % 2 == chess[i][j]) {
							blackCnt ++;
						}
						t++;
					}
					t ++;
				}
				min = Math.min(min, Math.min(blackCnt, whiteCnt));
			}
		}
		System.out.println(min);
	}
}