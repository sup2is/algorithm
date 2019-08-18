package lessons_12947;

public class Solution {

	public boolean solution(int x) {

		String s = x + "";
		int t = 0;
		
		for (int i = 0; i < s.length(); i++) {
			t += s.charAt(i) - 48;
		}
		
		return x % t == 0 ? true : false;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(10));
	}

}
