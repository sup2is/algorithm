package lessons_12917;

//https://programmers.co.kr/learn/courses/30/lessons/12917

public class Solution {

	public String solution(String s) {
		String str = "";
		int[] chars = s.chars().sorted().toArray();
		for (int i = chars.length - 1; i >= 0; i--) {
			str += (char)(chars[i]);
		}
		return str;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution("Zbcdefg"));
	}

}
