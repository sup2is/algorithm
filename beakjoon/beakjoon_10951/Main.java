package beakjoon_10951;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a, b;
		
		while(scanner.hasNextInt()) {
			a = Integer.parseInt(scanner.next());
			b = Integer.parseInt(scanner.next());
			System.out.println(a+b);
		}
	}
}
