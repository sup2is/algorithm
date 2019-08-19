package lessons_12982;

import java.util.Arrays;

public class Solution {

	public int solution(int[] d, int budget) {
		
		Arrays.sort(d);
		
		int sum = 0;
		
		int i;
		
		for (i = 0; i < d.length; i++) {
			sum += d[i];
			
			if(sum > budget) {
				break;
			}
		}
		
		return i;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(new int[] {2, 2, 3, 3}, 10));
	}

}
