package lessons_12930;

//https://programmers.co.kr/learn/courses/30/lessons/12930

public class Solution {

	public String solution(String s) {
		
		StringBuffer sb = new StringBuffer();
		int cnt = 0;
		
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i) == ' ') {
				cnt = 0;
				sb.append(" ");
				continue;
			}
			
			if(cnt % 2 == 0) {
				sb.append(s.charAt(i) > 91 ? (char)(s.charAt(i) - 32) : s.charAt(i));
			}else {
				sb.append(s.charAt(i) < 91 ? (char)(s.charAt(i) + 32) : s.charAt(i));
			}
			cnt ++;
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution("try hello world"));
	}

}
