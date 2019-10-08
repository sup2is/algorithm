package beakjoon_1316;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] arg) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] check;
		int cnt = 0;
		int n = Integer.parseInt(br.readLine());
		String s;
		loop:while (n-- > 0) {
			s = br.readLine();
			check = new boolean[26];
			check[s.charAt(0) - 'a'] = true;
			
			for (int i = 1; i < s.length(); i++) {
				
				if(check[s.charAt(i) - 'a'] && s.charAt(i - 1) == s.charAt(i)) {
					continue;
				}
				
				if(check[s.charAt(i) - 'a']) {
					continue loop;
				}
				
				check[s.charAt(i) - 'a'] = true;
			}
			
			cnt ++;
		}

		System.out.println(cnt);
	}
}