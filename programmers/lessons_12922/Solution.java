package lessons_12922;

//https://programmers.co.kr/learn/courses/30/lessons/12922

public class Solution {

	public String solution(int n) {
		
		
		String t = "¼ö¹Ú";
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < (n%2==0 ? n/2 : n/2 + 1) ; i++) {
			sb.append(t);
		}
		if(n % 2 != 0) {
			sb.setLength(n);
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(4));
	}

}
