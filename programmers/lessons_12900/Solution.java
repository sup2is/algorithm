package lessons_12900;

public class Solution {

	public int solution(int n) {
		
		int[] dp = new int[n + 1];
		
		dp[1] = 1;
		dp[2] = 2;
		
		for (int i = 3; i < dp.length; i++) {
			dp[i] = (dp[i-1] + dp[i-2]) % 1000000007;
		}
		
		return dp[n];
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(3));
	}

}
