package lessons_12901;

import java.util.Calendar;
import java.util.GregorianCalendar;

//https://programmers.co.kr/learn/courses/30/lessons/12901

public class Solution {
	
	public static String solution(int a, int b) {
		 String[] strDays = new String[] {
					 "SUN", 
					 "MON", 
					 "TUE", 
					 "WED", 
					 "THU",
					 "FRI",
					 "SAT"
				 };
		 
		Calendar c = new GregorianCalendar();
		c.set(2016, a - 1, b);
		return strDays[c.get(Calendar.DAY_OF_WEEK) - 1];
    }
	public static void main(String[] args) {
		
		System.out.println(solution(5,24));
		System.out.println(solution(1,7));
		
	}
}

