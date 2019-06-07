package beakjoon_1085;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int tx = 0;
		int ty = 0;
		
		if((w/2) < x) {
			tx = w - x;
		}else {
			tx = x;
		}
		
		if((h/2) < y) {
			ty = h - y;
		}else {
			ty = y;
		}
		
		System.out.println(Math.min(tx, ty));
	
	}
}

