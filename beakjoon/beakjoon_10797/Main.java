package beakjoon_10797;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int cnt = 0;
		for (int i = 0; i < 5; i++) {
			cnt = (sc.nextInt() == c) ? cnt + 1 : cnt;
		}
		System.out.println(cnt);
	}
}

