package lessons_12937;

public class Solution {

	public String solution(int num) {
		return num % 2 == 0 ? "Even" : "Odd";
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(3));
	}

}
