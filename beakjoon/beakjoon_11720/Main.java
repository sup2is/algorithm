package beakjoon_11720;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		sb.append(b);
		
		for(int i = 1; i <= a; i ++) {
			b += sb.charAt(i-1) - '0';
		}
		
		System.out.println(b);
		
	}
}