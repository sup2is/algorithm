package lessons_42883;

public class Solution {

	public String solution(String number, int k) {

		StringBuilder sb = new StringBuilder();
		int[] arr = new int[number.length()];

		for (int i = 0; i < number.length(); i++) {
			arr[i] = number.charAt(i) - 48;
		}

		int orgLength = number.length();
		int tempLength = number.length() - k;
		int idx = 0;
		while (sb.length() != number.length() - k) {
			int max = 0;

			for (int i = idx; i <= orgLength - tempLength; i++) {
				if (max < arr[i]) {
					max = arr[i];
					idx = i;
				}
			}
			idx++;
			sb.append(max);
			tempLength--;
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution("4177252841", 4));
	}

}
