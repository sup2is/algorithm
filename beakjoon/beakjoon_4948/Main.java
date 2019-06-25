package beakjoon_4948;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		boolean p[] = new boolean[123457*2];
		int n[] = new int[123457*2];
		for (int i = 2; i < p.length; i++) {
			if(p[i] == false) {
				n[i] = 1;
				for (int j = i*2; j < p.length; j+=i) {
					p[j] = true;
				}
			}
		}
		
		int r;
		int cnt;
		while(true) {
			
			cnt = 0;
			r = Integer.parseInt(br.readLine());
			if(r == 0) {
				break;
			}
			
			for (int i = (r+1); i <= (r*2); i++) {
				cnt = n[i] == 1 ? cnt + 1 : cnt;
			}
			
			sb.append(cnt + "\n");
		}
		
		
		System.out.println(sb.toString());
		
	}
}

