package beakjoon_10871;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] s =  br.readLine().split(" ");
		
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		
		s = br.readLine().split(" ");
		
		int[] r = new int[a];
		
		for (int i = 0; i < r.length; i++) {
			r[i] = Integer.parseInt(s[i]);
			if(r[i] < b) {
				bw.append(r[i] + " ");
			}
		}
		bw.flush();
	}
}
