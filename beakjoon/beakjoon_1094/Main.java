package beakjoon_1094;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int base = 64;
		int size = 0;
		
		int x = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		if(x == 64) {
			System.out.println(1);
			return;
		}
		
		while(size != x) {
			base /= 2;
			
			if(base + size > x) {
				continue;
			}else {
				size += base;
				cnt ++;
			}
		}
		System.out.println(cnt);
	}
}

