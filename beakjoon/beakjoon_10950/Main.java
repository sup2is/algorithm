package beakjoon_10950;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int t = scanner.nextInt();
		
		int a;
		int b;
		
		for (int i = 0; i < t; i++) {
			a = Integer.parseInt(scanner.next());
			b = Integer.parseInt(scanner.next());
			System.out.println(a+b);
		}
	}
}