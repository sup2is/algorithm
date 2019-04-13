package beakjoon_11718;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s;
		while(scanner.hasNextLine()) {
			s = scanner.nextLine();
			if(s.length() > 100 || s.isEmpty())
				break;
			
			System.out.println(s);
		}
	}
}
