package beakjoon_1107;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] arg) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		int MAX = 1000000;

		boolean[] broken = new boolean[10];
		
		if( m > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < m; i++) {
				broken[Integer.parseInt(st.nextToken())] = true;
			}
		}

		int length;
		
		int ans = n - 100;
		if(ans < 0) {
			ans *= -1;
		}
		
		int j;
		for (int i = 0; i < MAX; i++) {
			j = i;
			length = 0;
			

			if(j == 0) {
				length = broken[0] ? 0 : 1;
			}
			
			while(j > 0) {
				
				
				if(broken[j % 10]) {
					length = 0;
					break;
				}
				length++;
				j /= 10;
			}
			
			if(length > 0) {
				
				int press = i-n;
				
				if(press < 0) {
					press *= -1;
				}
				
				ans = Math.min(ans, press + length);
			}
			
		}

		System.out.println(ans);
		
	}
}