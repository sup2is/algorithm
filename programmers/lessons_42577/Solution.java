package lessons_42577;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

	public boolean solution(String[] phone_book) {

		Arrays.sort(phone_book, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(o1.length(), o2.length());
			}
		});
		
		for (int i = 0; i < phone_book.length; i++) {
			for (int j = i + 1; j < phone_book.length; j++) {
				if(phone_book[i].length() <= phone_book[j].length() && phone_book[i].equals(phone_book[j].substring(0,phone_book[i].length()))) {
					return false;
				}
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(new String[] { "111", "2", "1114" }));
	}

}
