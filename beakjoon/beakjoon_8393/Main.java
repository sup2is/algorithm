package beakjoon_8393;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int r = 0;
		for(int i = 1 ; i <= a ; i++) {
			r += i;
		}
		System.out.println(r);
	}
}