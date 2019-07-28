package lessons_12903;

//https://programmers.co.kr/learn/courses/30/lessons/12903

public class Solution {
	
	public String solution(String s) {
		String answer;
		if(s.length() % 2== 0) {
			answer = s.substring(s.length()/2 - 1, s.length()/2 + 1);
		}else {
			answer = s.substring(s.length()/2, s.length()/2 + 1);
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution("abcde"));
		System.out.println(solution.solution("qwer"));
	}

}
