package lessons_42885;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

	public int solution(int[] people, int limit) {

		Arrays.sort(people);
		int answer = 0;
		int start = 0;
		int end = people.length - 1;
		int size = people.length;
		
		for (int i = 0; i < size; i++) {
			int p = people[end];
			if(end-- != start && people[start] + p <= limit) {
				start ++;
				size--;
			}
			answer ++;
		}

		return answer;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(new int[] { 70,50,80,50 }, 100));
//		System.out.println(solution.solution(new int[] {10,20,30,40,50,50,60,70,80,90 }, 100));
	}

}
