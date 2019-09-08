package lessons_12951;

import java.util.StringTokenizer;

public class Solution {

	public String solution(String s) {
		
		
		StringTokenizer st = new StringTokenizer(s);
		char[] c = s.toCharArray();
		
		String str;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < c.length; i++) {
			if(c[i] == ' ') {
				sb.append(' ');
				continue;
			}
			str = st.nextToken().toLowerCase();
			i += str.length() - 1;
			if(str.charAt(0) >= 'a' && str.charAt(0) <= 'z') {
				sb.append((char)(str.charAt(0) - 32) + str.substring(1));
				continue;
			}
			sb.append(str);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution("3people unFollowed    me"));
	}

}
