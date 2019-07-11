package beakjoon_1049;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] arg) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int p = Integer.MAX_VALUE;
		int s = Integer.MAX_VALUE;
		int t;
        for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			p = Math.min(Integer.parseInt(st.nextToken()) , p);
			s = Math.min(Integer.parseInt(st.nextToken()) , s);
		}
		
		 t = (((n/6) == 0) ? 1 * p : (n/6) * p) + ((n < 6 ? 0 : n % 6) * s); //패키지 + 단품
		 p = ((n/6) + 1) * p; // 패키지
		 s = s * n; //단품
		
		System.out.println(Math.min(t, Math.min(p, s)));
	}
	
}