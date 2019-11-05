package lessons_17682;

public class Solution {

	public int solution(String dartResult) {
		StringBuilder sb = new StringBuilder(dartResult);
		int[] arr = new int[4];
		int arrIdx = 1;
		
		while (sb.length() >= 2) {
			int score = sb.charAt(0) - 48;
			int length = 2;
			
			if(score == 1 && sb.charAt(1) == '0') {
				score = 10;
				length ++;
			}

			int m = 0;
			switch (sb.charAt(length - 1)) {
			case 'S': m = 1; break;
			case 'D': m = 2; break;
			case 'T': m = 3; break;
			}
			
			if(length < sb.length() && sb.charAt(length) == '*') {
				arr[arrIdx - 1] *= 2;
				arr[arrIdx] = (int) (Math.pow(score, m) * 2);
				length ++;
			} else if(length < sb.length() && sb.charAt(length) == '#') {
				arr[arrIdx] = (int) (Math.pow(score, m) * -1);
				length ++;
			}else {
				arr[arrIdx] = (int) Math.pow(score, m);
			}
			arrIdx++;
			sb.delete(0, length);
		}
		return arr[1] + arr[2] + arr[3];
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution("1S2D*3T"));
	}

}
