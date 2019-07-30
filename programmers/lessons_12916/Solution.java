package lessons_12916;

public class Solution {
	
	public boolean solution(String s) {
		int cnt = 0;
		
		s = s.toUpperCase();
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'P') {
				cnt ++;
			}
			if(s.charAt(i) == 'Y') {
				cnt --;
			}
		}
		
		
        return cnt == 0 ? true : false;
    }
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution("Pyy"));
	}

}
