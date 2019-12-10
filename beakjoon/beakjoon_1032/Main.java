package beakjoon_1032;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()) - 1;

		StringBuilder org = new StringBuilder(br.readLine());
		StringBuilder target;

		while (n --> 0) {
			target = new StringBuilder(br.readLine());

			for (int i = 0; i < org.length(); i++) {
				if(org.charAt(i) != target.charAt(i)){
					org.setCharAt(i, '?');
				}
			}
		}

		System.out.println(org.toString());

	}

}
