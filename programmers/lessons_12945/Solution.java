package lessons_12945;

public class Solution {

	public int solution(int n) {
		int[] dp = new int[n + 1];
		
		dp[1] = 1;
		
		for (int i = 2; i < dp.length; i++) {
			dp[i] = (dp[i-2] + dp[i-1]) % 1234567;
		}
		
		return dp[n];
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(5));
	}

}
