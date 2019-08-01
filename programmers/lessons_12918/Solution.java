package lessons_12918;

//https://programmers.co.kr/learn/courses/30/lessons/12918

public class Solution {

	public boolean solution(String s) {
		
		
		if (!(s.length() == 4 || s.length() == 6)) {
			return false;
		}

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A') {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution("333"));
	}

}
