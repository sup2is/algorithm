package lessons_12919;

//https://programmers.co.kr/learn/courses/30/lessons/12919

public class Solution {
	
	public String solution(String[] seoul) {
		for (int i = 0; i < seoul.length; i++) {
			if(seoul[i] == "Kim") {
				return "김서방은 " + i + "에 있다";
			}
		}
		return "";
	}
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(new String[] {"Jane","Kim"}));
	}

}
