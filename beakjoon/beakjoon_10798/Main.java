package beakjoon_10798;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] arg) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		char[][] arr = new char[5][15];
		
		for (int i = 0; i < 5; i++) {
			s = br.readLine();
			for (int j = 0; j < s.length(); j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				if(arr[j][i] != '\u0000') {
					sb.append(arr[j][i]);
				}
			}
		}
		System.out.println(sb.toString());
	}
}
