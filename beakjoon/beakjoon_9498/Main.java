package beakjoon_9498;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		
		if(a >= 90) {
			bw.write("A");
		}else if (a >= 80) {
			bw.write("B");
		}else if(a >= 70) {
			bw.write("C");
		}else if(a >= 60) {
			bw.write("D");
		}else {
			bw.write("F");
		}
		bw.flush();
	}
}