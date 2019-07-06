package beakjoon_5543;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int set[] = new int[5];
		for (int i = 0; i < 5; i++) {
			set[i] = Integer.parseInt(br.readLine());
		}
		System.out.println(Math.min(set[0], Math.min(set[1], set[2])) + Math.min(set[3], set[4]) - 50);
	}
}

