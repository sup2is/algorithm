package beakjoon_1436;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		final String DOOMS_NUM = "666";
		
		Scanner scanner = new Scanner(System.in);
		int series = scanner.nextInt();
		System.out.println(Integer.parseInt(series-1 + DOOMS_NUM));
		scanner.close();
	}

}
