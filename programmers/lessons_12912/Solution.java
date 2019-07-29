package lessons_12912;

public class Solution {

	public long solution(int a, int b) {
		long answer = 0;

		if (a == b) {
			return a;
		}

		if (a > b) {
			for (int i = b; i <= a; i++) {
				answer += i;
			}
		} else {
			for (int i = a; i <= b; i++) {
				answer += i;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(-100, -50));
		
		System.out.println(-100 + -101);
	}

}
