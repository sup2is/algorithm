package lessons_12940;

import java.util.Arrays;

public class Solution {

	public int[] solution(int n, int m) {

		int t1 = n;
		int t2 = m;
		
		if(t1 < t2) {
			n = t2;
			m = t1;
		}
		
		int r = 1;
		
		while(r > 0) {
			r = n % m;
			n = m;
			m = r;
		}
		
		int lcm = t1 * t2 / n; 
		return new int[] {n,lcm};
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(Arrays.toString(solution.solution(2, 5)));
	}

}
