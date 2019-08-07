package lessons_12925;

//https://programmers.co.kr/learn/courses/30/lessons/12925

public class Solution {

	public int solution(String s) {
		char c = s.charAt(0);
		return c == '-' ?  (Integer.parseInt(s.substring(1))) * -1 : Integer.parseInt(s);
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution("-1234"));
	}

}
