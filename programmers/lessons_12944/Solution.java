package lessons_12944;

public class Solution {

	public double solution(int[] arr) {
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum / arr.length;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(new int[] {1,2,3,4}));
	}

}
