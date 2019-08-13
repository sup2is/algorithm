package lessons_12934;

public class Solution {

	public long solution(long n) {
		long answer = -1;
		long t = 0;
		
		if(n == 1) {
			return 4;
		}
		
		long a = 2;
		
		while(t <= n) {
			t = (long) Math.pow(a++, 2);
			if(t == n) {
				return (long) Math.pow(a, 2);
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(1));
	}

}
