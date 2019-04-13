package beakjoon_1924;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		String[] week = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
		
		Scanner scanner = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int m = scanner.nextInt();
		int d = scanner.nextInt();
		
		Calendar cal = Calendar.getInstance();
		cal.set(2017, m-1, d);
		cal.set(Calendar.MILLISECOND, 0);

		Date date = cal.getTime();
		
		System.out.println(week[date.getDay()]);

	}
}