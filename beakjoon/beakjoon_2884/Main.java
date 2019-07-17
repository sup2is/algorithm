package beakjoon_2884;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] arg) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		m -= 45;
		
		if(m < 0) {
			m += 60;
			if(h == 0) {
				h = 23;
			}else {
				h --;
			}
		}
		System.out.println(h + " " + m);
	}
}
