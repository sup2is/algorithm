package lessons_12931;

//https://programmers.co.kr/learn/courses/30/lessons/12931

public class Solution {
	
    public int solution(int n) {
        String s = n + "";

        int answer = 0;
        
        for (int i = 0; i < s.length(); i++) {
			answer += s.charAt(i) - 48;
		}
        
        return answer;
    }
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(123));
	}

}
