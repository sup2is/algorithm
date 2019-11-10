package lessons_43165;

public class Solution {

	public int solution(int[] numbers, int target) {
		return recursive(numbers, target, 0);
	}

	private int recursive(int[] numbers, int target, int i) {
		if (i == numbers.length) {
			if(target == 0) {
				return 1;
			}else {
				return 0;
			}
		}
		return recursive(numbers, target - numbers[i], i + 1) + recursive(numbers, target + numbers[i], i + 1);
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(new int[] { 1, 1, 1 }, 1));
	}

}
