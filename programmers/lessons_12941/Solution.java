package lessons_12941;

import java.util.Arrays;

public class Solution {

	public int solution(int[] A, int[] B) {

		Arrays.sort(A);
		Arrays.sort(B);

		int sum = 0;
		
		for (int i = 0; i < A.length; i++) {
			sum += A[i] * B[(B.length - 1) - i];
		}
		
		return sum;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(new int[] {1, 4, 2}, new int[] {5, 4, 4}));
	}

}
