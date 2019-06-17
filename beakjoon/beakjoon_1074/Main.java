package beakjoon_1074;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] arg) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int x = (int) (Math.pow(2,n)) /2;
		int y = x;

		int ans = 0;
		while(n-- > 0) {
	        int t = (int) Math.pow(2, n) / 2;
	        int skip = (int) Math.pow(4, n);
			
			if(x > r && y > c) {
				x -= t;
				y -= t;
			} else if(x > r && y <= c) {
				x -= t;
				y += t;
				ans += skip;
			} else if(x <= r && y > c)  {
				x += t;
				y -= t;
				ans += skip * 2;
			}else {
				x += t;
				y += t;
				ans += skip * 3;
			}
		}
		
		System.out.println(ans);
	}
}