package beakjoon_2875;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] arg) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		while(k > 0) {
			if(n/2 >= m) {
				if(k > 2) {
					k -= 2;
					n -= 2;
				}else {
					k --;
					n --;
				}
			}else {
				k --;
				m --;
			}
		}

		if(n/2 > m) {
			System.out.println(m);
		}else {
			System.out.println(n/2);
		}
		
	}
	
	
}