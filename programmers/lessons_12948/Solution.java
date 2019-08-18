package lessons_12948;

public class Solution {

	public String solution(String phone_number) {
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < phone_number.length() - 4; i++) {
			sb.append("*");
		}
		
		return sb.toString() + phone_number.substring(phone_number.length()-4, phone_number.length());
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution("44445"));
	}

}
