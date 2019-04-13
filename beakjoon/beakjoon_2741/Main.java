package beakjoon_2741;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int a = scanner.nextInt();
		
		for(int i = 1; i <= a; i++) {
			sb.append(i + "\n");
		}
		
		System.out.println(sb.toString());
		
		
	}
}