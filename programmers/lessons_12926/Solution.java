package lessons_12926;

//https://programmers.co.kr/learn/courses/30/lessons/12926

public class Solution {

	public String solution(String s, int n) {
		StringBuffer sb = new StringBuffer();
		
		
		char c;
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if(c == ' ') {
				sb.append(" ");
				continue;
			}
			
			
			sb.append(c+n > (c >= 'A' && c <= 'Z' ? 'Z' : 'z') ? (char)(c + n - 26) : (char)(c + n));
			
//			if(c >= 'A' && c <= 'Z') {
//				sb.append(c+n > 'Z' ? (char)(c + n - 26) : (char)(c + n));
//			}else {
//				sb.append(c+n > 'z' ? (char)(c + n - 26) : (char)(c + n));
//			}
			
		}
		
		
		
		return sb.toString();
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution("a B z" , 4));
	}

}
