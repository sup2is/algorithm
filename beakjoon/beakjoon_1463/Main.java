package beakjoon_1463;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int d[] = new int[N+1];
		
		d[1] = 0;
		
		for (int i = 2; i <= N; i++) {
			
			d[i] = d[i-1]+1;
			if(i % 2 == 0) {
				if(d[i] > d[i/2] +1) {
					d[i] = d[i/2]+1;
				}
			}
			if(i % 3 == 0) {
				if(d[i] > d[i/3] +1) {
					d[i] = d[i/3]+1;
				}
			}
		}

		System.out.println(d[N]);
	}
	
}
