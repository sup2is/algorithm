package beakjoon_6588;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int r = 0;
		boolean p[] = new boolean[1000001];
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 2; i < p.length - 1; i++) {
			if(p[i] == false) {
				list.add(i);
				for (int j = i*3; j < p.length - 1; j+=i) {
					p[j] = true;
				}
			}
		}
		int b;
		while(true) {
			r = Integer.parseInt(br.readLine());
			if(r == 0) {
				return;
			}
			
			for (int i = 1; i < list.size(); i++) {
				b = list.get(i);
				if(p[r-b] == false) {
					System.out.println(r + " = " + b + " + " + (r-b));
					break;
				}
			}
		}
	}
}
