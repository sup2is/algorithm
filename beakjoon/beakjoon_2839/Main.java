package beakjoon_2839;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int a = scanner.nextInt();
		
		for(int i = 1 ; i < 10 ; i ++) {
			sb.append(a + " * " + i + " = " + a*i + "\n");
		}
		
		System.out.println(sb.toString());
		
	}
}