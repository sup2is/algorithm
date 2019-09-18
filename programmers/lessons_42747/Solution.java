package lessons_42747;

import java.util.Arrays;
import java.util.Collections;

public class Solution {

	public int solution(int[] citations) {
		Integer[] sorted = Arrays.stream(citations).boxed().sorted(Collections.reverseOrder()).toArray(Integer[]::new);

		int ans = 0;
		for (int i = 0; i < sorted.length + 1; i++) {
			if(i == sorted.length) {
				ans = i;
			}else if(sorted[i] <= i) {
				ans = i;
				break;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(new int[] {22,44}));
	}

}
