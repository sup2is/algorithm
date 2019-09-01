package lessons_12913;

public class Solution {
	
    int solution(int[][] land) {
        int[][] dp = new int[land.length][4];
        
        dp[0][0] = land[0][0];
        dp[0][1] = land[0][1];
        dp[0][2] = land[0][2];
        dp[0][3] = land[0][3];
        
        int max;
        for (int i = 1; i < land.length; i++) {
        	
        	for (int j = 0; j < 4; j++) {
        		if(j == 0) {
        			max = Math.max(dp[i-1][1], Math.max(dp[i-1][2], dp[i-1][3]));
        		}else if(j == 1) {
        			max = Math.max(dp[i-1][0], Math.max(dp[i-1][2], dp[i-1][3]));
        		}else if(j == 2) {
        			max = Math.max(dp[i-1][0], Math.max(dp[i-1][1], dp[i-1][3]));
        		}else {
        			max = Math.max(dp[i-1][0], Math.max(dp[i-1][1], dp[i-1][2]));
        		}
        		
        		dp[i][j] = max + land[i][j];
			}
        	
		}

        return Math.max(dp[dp.length - 1][0], Math.max(dp[dp.length - 1][1], Math.max(dp[dp.length - 1][2], dp[dp.length - 1][3])));
    }
    
    
    
    
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(new int[][] {{1,2,3,5},{5,6,7,8},{4,3,2,1}}));
	}

}
