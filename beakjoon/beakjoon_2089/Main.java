package beakjoon_2089;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int i = Integer.parseInt(br.readLine());
		
		if(i == 0) {
			System.out.println(0);
			return;
		}
		
		while(i != 0) {
			
			if(i % 2 == 0) {
				sb.append("0");
				i /= -2;
				continue;
			}
			
			if (i < 0) {
				i = (-i + 1) / 2;
			}else {
				i = -(i / 2);
			}
			sb.append("1");
		}
		
		System.out.println(sb.reverse().toString());
		
	}
}
