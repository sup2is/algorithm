package beakjoon_15552;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		StringBuffer sb = new StringBuffer();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		int b,c;
		String v;
		String[] r;
		
		for (int i = 0; i < a; i++) {
			v = br.readLine();
			r = v.split(" ");
			b = Integer.parseInt(r[0]);
			c = Integer.parseInt(r[1]);
			sb.append((b+c) + "\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
	}
}